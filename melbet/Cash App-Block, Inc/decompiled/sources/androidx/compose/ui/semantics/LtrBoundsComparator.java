package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class LtrBoundsComparator implements Comparator {
    public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator(0);
    public static final LtrBoundsComparator INSTANCE$1 = new LtrBoundsComparator(1);
    public static final LtrBoundsComparator INSTANCE$2 = new LtrBoundsComparator(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LtrBoundsComparator(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Rect boundsInWindow = ((SemanticsNode) obj).getBoundsInWindow();
                Rect boundsInWindow2 = ((SemanticsNode) obj2).getBoundsInWindow();
                int compare = Float.compare(boundsInWindow.left, boundsInWindow2.left);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(boundsInWindow.top, boundsInWindow2.top);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(boundsInWindow.bottom, boundsInWindow2.bottom);
                return compare3 != 0 ? compare3 : Float.compare(boundsInWindow.right, boundsInWindow2.right);
            case 1:
                Rect boundsInWindow3 = ((SemanticsNode) obj).getBoundsInWindow();
                Rect boundsInWindow4 = ((SemanticsNode) obj2).getBoundsInWindow();
                int compare4 = Float.compare(boundsInWindow4.right, boundsInWindow3.right);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(boundsInWindow3.top, boundsInWindow4.top);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(boundsInWindow3.bottom, boundsInWindow4.bottom);
                return compare6 != 0 ? compare6 : Float.compare(boundsInWindow4.left, boundsInWindow3.left);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((Rect) pair.first).top, ((Rect) pair2.first).top);
                return compare7 != 0 ? compare7 : Float.compare(((Rect) pair.first).bottom, ((Rect) pair2.first).bottom);
        }
    }
}
