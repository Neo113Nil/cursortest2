package androidx.recyclerview.widget;

import android.view.View;
import androidx.camera.video.Recorder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class DiffUtil {
    public static ExecutorService sDiffExecutor;
    public static final Object sExecutorLock = new Object();
    public static final ViewPager.AnonymousClass1 DIAGONAL_COMPARATOR = new ViewPager.AnonymousClass1(8);

    public abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public final class Diagonal {
        public final int size;
        public final int x;
        public final int y;

        public Diagonal(int i, int i2, int i3) {
            this.x = i;
            this.y = i2;
            this.size = i3;
        }
    }

    public final class PostponedUpdate {
        public int currentPos;
        public final int posInOwnerList;
        public final boolean removal;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.posInOwnerList = i;
            this.currentPos = i2;
            this.removal = z;
        }
    }

    public final class Range {
        public int newListEnd;
        public int newListStart;
        public int oldListEnd;
        public int oldListStart;

        public final int newSize() {
            return this.newListEnd - this.newListStart;
        }

        public final int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }
    }

    public final class Snake {
        public int endX;
        public int endY;
        public boolean reverse = false;
        public int startX;
        public int startY;

        public Snake(int i, int i2, int i3, int i4) {
            this.startX = i;
            this.endY = i2;
            this.startY = i3;
            this.endX = i4;
        }

        public int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }
    }

    public static Recorder.SetupVideoTask calculateDiff(Callback callback) {
        int i;
        Snake snake;
        int i2;
        Range range;
        int i3;
        int i4;
        Snake snake2;
        Snake snake3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Range range2 = new Range();
        int i14 = 0;
        range2.oldListStart = 0;
        range2.oldListEnd = oldListSize;
        range2.newListStart = 0;
        range2.newListEnd = newListSize;
        arrayList2.add(range2);
        int i15 = oldListSize + newListSize;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i17];
        int i18 = i17 / 2;
        int[] iArr2 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range3 = (Range) arrayList2.remove(arrayList2.size() - i16);
            if (range3.oldSize() >= i16 && range3.newSize() >= i16) {
                int newSize = ((range3.newSize() + range3.oldSize()) + i16) / 2;
                int i19 = i16 + i18;
                iArr[i19] = range3.oldListStart;
                iArr2[i19] = range3.oldListEnd;
                int i20 = i14;
                while (i20 < newSize) {
                    int i21 = Math.abs(range3.oldSize() - range3.newSize()) % 2 == i16 ? i16 : i14;
                    int oldSize = range3.oldSize() - range3.newSize();
                    int i22 = -i20;
                    int i23 = i22;
                    while (true) {
                        if (i23 > i20) {
                            i3 = i14;
                            i = i18;
                            i4 = newSize;
                            snake2 = null;
                            break;
                        }
                        if (i23 == i22 || (i23 != i20 && iArr[i23 + 1 + i18] > iArr[(i23 - 1) + i18])) {
                            i9 = iArr[i23 + 1 + i18];
                            i10 = i9;
                        } else {
                            i9 = iArr[(i23 - 1) + i18];
                            i10 = i9 + 1;
                        }
                        i = i18;
                        int i24 = ((i10 - range3.oldListStart) + range3.newListStart) - i23;
                        if (i20 == 0 || i10 != i9) {
                            i11 = i10;
                            i12 = i24;
                        } else {
                            i11 = i10;
                            i12 = i24 - 1;
                        }
                        int i25 = i23;
                        int i26 = i24;
                        int i27 = i11;
                        i4 = newSize;
                        while (i27 < range3.oldListEnd && i26 < range3.newListEnd && callback.areItemsTheSame(i27, i26)) {
                            i27++;
                            i26++;
                        }
                        iArr[i25 + i] = i27;
                        if (i21 != 0) {
                            int i28 = oldSize - i25;
                            i13 = i21;
                            if (i28 >= i22 + 1 && i28 <= i20 - 1 && iArr2[i28 + i] <= i27) {
                                snake2 = new Snake();
                                snake2.startX = i9;
                                snake2.startY = i12;
                                snake2.endX = i27;
                                snake2.endY = i26;
                                i3 = 0;
                                snake2.reverse = false;
                                break;
                            }
                        } else {
                            i13 = i21;
                        }
                        i23 = i25 + 2;
                        i14 = 0;
                        i18 = i;
                        newSize = i4;
                        i21 = i13;
                    }
                    if (snake2 != null) {
                        snake = snake2;
                        break;
                    }
                    int i29 = (range3.oldSize() - range3.newSize()) % 2 == 0 ? 1 : i3;
                    int oldSize2 = range3.oldSize() - range3.newSize();
                    int i30 = i22;
                    while (true) {
                        if (i30 > i20) {
                            snake3 = null;
                            break;
                        }
                        if (i30 == i22 || (i30 != i20 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                            i5 = iArr2[i30 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i30 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i31 = range3.newListEnd - ((range3.oldListEnd - i6) - i30);
                        int i32 = (i20 == 0 || i6 != i5) ? i31 : i31 + 1;
                        int i33 = i29;
                        while (i6 > range3.oldListStart && i31 > range3.newListStart) {
                            i7 = oldSize2;
                            if (!callback.areItemsTheSame(i6 - 1, i31 - 1)) {
                                break;
                            }
                            i6--;
                            i31--;
                            oldSize2 = i7;
                        }
                        i7 = oldSize2;
                        iArr2[i30 + i] = i6;
                        if (i33 != 0 && (i8 = i7 - i30) >= i22 && i8 <= i20 && iArr[i8 + i] >= i6) {
                            snake3 = new Snake();
                            snake3.startX = i6;
                            snake3.startY = i31;
                            snake3.endX = i5;
                            snake3.endY = i32;
                            snake3.reverse = true;
                            break;
                        }
                        i30 += 2;
                        i29 = i33;
                        oldSize2 = i7;
                    }
                    if (snake3 != null) {
                        snake = snake3;
                        break;
                    }
                    i20++;
                    i18 = i;
                    newSize = i4;
                    i16 = 1;
                    i14 = 0;
                }
            }
            i = i18;
            snake = null;
            if (snake != null) {
                if (snake.diagonalSize() > 0) {
                    int i34 = snake.endY;
                    int i35 = snake.startY;
                    int i36 = i34 - i35;
                    int i37 = snake.endX;
                    int i38 = snake.startX;
                    int i39 = i37 - i38;
                    arrayList.add(i36 != i39 ? snake.reverse ? new Diagonal(i38, i35, snake.diagonalSize()) : i36 > i39 ? new Diagonal(i38, i35 + 1, snake.diagonalSize()) : new Diagonal(i38 + 1, i35, snake.diagonalSize()) : new Diagonal(i38, i35, i39));
                }
                if (arrayList3.isEmpty()) {
                    range = new Range();
                    i2 = 1;
                } else {
                    i2 = 1;
                    range = (Range) arrayList3.remove(arrayList3.size() - 1);
                }
                range.oldListStart = range3.oldListStart;
                range.newListStart = range3.newListStart;
                range.oldListEnd = snake.startX;
                range.newListEnd = snake.startY;
                arrayList2.add(range);
                range3.oldListEnd = range3.oldListEnd;
                range3.newListEnd = range3.newListEnd;
                range3.oldListStart = snake.endX;
                range3.newListStart = snake.endY;
                arrayList2.add(range3);
            } else {
                i2 = 1;
                arrayList3.add(range3);
            }
            i18 = i;
            i16 = i2;
            i14 = 0;
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new Recorder.SetupVideoTask(callback, arrayList, iArr, iArr2);
    }

    public static int computeScrollExtent(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.LayoutManager.getPosition(view) - RecyclerView.LayoutManager.getPosition(view2)) + 1;
        }
        return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
    }

    public static int computeScrollOffset(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (state.getItemCount() - Math.max(RecyclerView.LayoutManager.getPosition(view), RecyclerView.LayoutManager.getPosition(view2))) - 1) : Math.max(0, Math.min(RecyclerView.LayoutManager.getPosition(view), RecyclerView.LayoutManager.getPosition(view2)));
        if (z) {
            return Math.round((max * (Math.abs(orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(RecyclerView.LayoutManager.getPosition(view) - RecyclerView.LayoutManager.getPosition(view2)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(view)));
        }
        return max;
    }

    public static int computeScrollRange(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.getItemCount();
        }
        return (int) (((orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(RecyclerView.LayoutManager.getPosition(view) - RecyclerView.LayoutManager.getPosition(view2)) + 1)) * state.getItemCount());
    }

    public abstract boolean areContentsTheSame(Object obj, Object obj2);

    public abstract boolean areItemsTheSame(Object obj, Object obj2);

    public Object getChangePayload(Object obj, Object obj2) {
        return null;
    }
}
