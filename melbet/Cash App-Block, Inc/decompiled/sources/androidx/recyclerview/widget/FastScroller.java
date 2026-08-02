package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.lazylayout.view.ViewLazyList;
import app.cash.redwood.lazylayout.view.ViewLazyList$linearLayoutManager$1;
import app.cash.redwood.lazylayout.view.ViewLazyList$scrollProcessor$1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes3.dex */
public final class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public int mAnimationState;
    public final AnonymousClass1 mHideRunnable;
    public float mHorizontalDragX;
    public int mHorizontalThumbCenterX;
    public final StateListDrawable mHorizontalThumbDrawable;
    public final int mHorizontalThumbHeight;
    public int mHorizontalThumbWidth;
    public final Drawable mHorizontalTrackDrawable;
    public final int mHorizontalTrackHeight;
    public final int mMargin;
    public final RecyclerView mRecyclerView;
    public final int mScrollbarMinimumRange;
    public final ValueAnimator mShowHideAnimator;
    public float mVerticalDragY;
    public int mVerticalThumbCenterY;
    public final StateListDrawable mVerticalThumbDrawable;
    public int mVerticalThumbHeight;
    public final int mVerticalThumbWidth;
    public final Drawable mVerticalTrackDrawable;
    public final int mVerticalTrackWidth;
    public static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    public static final int[] EMPTY_STATE_SET = new int[0];
    public int mRecyclerViewWidth = 0;
    public int mRecyclerViewHeight = 0;
    public boolean mNeedVerticalScrollbar = false;
    public boolean mNeedHorizontalScrollbar = false;
    public int mState = 0;
    public int mDragState = 0;
    public final int[] mVerticalRange = new int[2];
    public final int[] mHorizontalRange = new int[2];

    /* renamed from: androidx.recyclerview.widget.FastScroller$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int i;
            int i2;
            RecyclerView.ViewHolder viewHolder;
            int height;
            int i3 = this.$r8$classId;
            int i4 = 0;
            Object obj = this.this$0;
            switch (i3) {
                case 0:
                    FastScroller fastScroller = (FastScroller) obj;
                    ValueAnimator valueAnimator = fastScroller.mShowHideAnimator;
                    int i5 = fastScroller.mAnimationState;
                    if (i5 == 1) {
                        valueAnimator.cancel();
                    } else if (i5 != 2) {
                    }
                    fastScroller.mAnimationState = 3;
                    valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), RecyclerView.DECELERATION_RATE);
                    valueAnimator.setDuration(500L);
                    valueAnimator.start();
                    break;
                case 1:
                    ItemTouchHelper itemTouchHelper = (ItemTouchHelper) obj;
                    if (itemTouchHelper.mSelected != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = itemTouchHelper.mDragScrollStartTimeInMs;
                        long j2 = j == Long.MIN_VALUE ? 0L : currentTimeMillis - j;
                        RecyclerView.LayoutManager layoutManager = itemTouchHelper.mRecyclerView.mLayout;
                        if (itemTouchHelper.mTmpRect == null) {
                            itemTouchHelper.mTmpRect = new Rect();
                        }
                        View view = itemTouchHelper.mSelected.itemView;
                        Rect rect = itemTouchHelper.mTmpRect;
                        RecyclerView recyclerView = layoutManager.mRecyclerView;
                        if (recyclerView == null) {
                            rect.set(0, 0, 0, 0);
                        } else {
                            rect.set(recyclerView.getItemDecorInsetsForChild(view));
                        }
                        if (layoutManager.canScrollHorizontally()) {
                            int i6 = (int) (itemTouchHelper.mSelectedStartX + itemTouchHelper.mDx);
                            int paddingLeft = (i6 - itemTouchHelper.mTmpRect.left) - itemTouchHelper.mRecyclerView.getPaddingLeft();
                            float f = itemTouchHelper.mDx;
                            if ((f < RecyclerView.DECELERATION_RATE && paddingLeft < 0) || (f > RecyclerView.DECELERATION_RATE && (paddingLeft = ((itemTouchHelper.mSelected.itemView.getWidth() + i6) + itemTouchHelper.mTmpRect.right) - (itemTouchHelper.mRecyclerView.getWidth() - itemTouchHelper.mRecyclerView.getPaddingRight())) > 0)) {
                                i = paddingLeft;
                                if (layoutManager.canScrollVertically()) {
                                    int i7 = (int) (itemTouchHelper.mSelectedStartY + itemTouchHelper.mDy);
                                    int paddingTop = (i7 - itemTouchHelper.mTmpRect.top) - itemTouchHelper.mRecyclerView.getPaddingTop();
                                    float f2 = itemTouchHelper.mDy;
                                    if (f2 < RecyclerView.DECELERATION_RATE && paddingTop < 0) {
                                        i4 = paddingTop;
                                    } else if (f2 > RecyclerView.DECELERATION_RATE && (height = ((itemTouchHelper.mSelected.itemView.getHeight() + i7) + itemTouchHelper.mTmpRect.bottom) - (itemTouchHelper.mRecyclerView.getHeight() - itemTouchHelper.mRecyclerView.getPaddingBottom())) > 0) {
                                        i4 = height;
                                    }
                                }
                                if (i != 0) {
                                    i = itemTouchHelper.mCallback.interpolateOutOfBoundsScroll(itemTouchHelper.mRecyclerView, itemTouchHelper.mSelected.itemView.getWidth(), i, itemTouchHelper.mRecyclerView.getWidth(), j2);
                                }
                                i2 = i;
                                if (i4 == 0) {
                                    i4 = itemTouchHelper.mCallback.interpolateOutOfBoundsScroll(itemTouchHelper.mRecyclerView, itemTouchHelper.mSelected.itemView.getHeight(), i4, itemTouchHelper.mRecyclerView.getHeight(), j2);
                                }
                                if (i2 != 0 && i4 == 0) {
                                    itemTouchHelper.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                                    break;
                                } else {
                                    if (itemTouchHelper.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                                        itemTouchHelper.mDragScrollStartTimeInMs = currentTimeMillis;
                                    }
                                    itemTouchHelper.mRecyclerView.scrollBy(i2, i4);
                                    viewHolder = itemTouchHelper.mSelected;
                                    if (viewHolder != null) {
                                        itemTouchHelper.moveIfNecessary(viewHolder);
                                    }
                                    itemTouchHelper.mRecyclerView.removeCallbacks(itemTouchHelper.mScrollRunnable);
                                    RecyclerView recyclerView2 = itemTouchHelper.mRecyclerView;
                                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                    recyclerView2.postOnAnimation(this);
                                    break;
                                }
                            }
                        }
                        i = 0;
                        if (layoutManager.canScrollVertically()) {
                        }
                        if (i != 0) {
                        }
                        i2 = i;
                        if (i4 == 0) {
                        }
                        if (i2 != 0) {
                        }
                        if (itemTouchHelper.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                        }
                        itemTouchHelper.mRecyclerView.scrollBy(i2, i4);
                        viewHolder = itemTouchHelper.mSelected;
                        if (viewHolder != null) {
                        }
                        itemTouchHelper.mRecyclerView.removeCallbacks(itemTouchHelper.mScrollRunnable);
                        RecyclerView recyclerView22 = itemTouchHelper.mRecyclerView;
                        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                        recyclerView22.postOnAnimation(this);
                    }
                    break;
                default:
                    ((StaggeredGridLayoutManager) obj).checkForGaps();
                    break;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.FastScroller$2, reason: invalid class name */
    public final class AnonymousClass2 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 1:
                    if (i == 0) {
                        ((ViewLazyList) obj).isDoingProgrammaticScroll = false;
                        break;
                    }
                    break;
                case 4:
                    ((GpsConfigQueries$$ExternalSyntheticLambda2) obj).invoke(InvestingCryptoNewsViewEvent.ListScrolled.INSTANCE);
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int findFirstVisibleItemPosition;
            int findLastVisibleItemPosition;
            ArrayList arrayList;
            int i3 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i3) {
                case 0:
                    FastScroller fastScroller = (FastScroller) obj;
                    int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    int i4 = fastScroller.mScrollbarMinimumRange;
                    int computeVerticalScrollRange = fastScroller.mRecyclerView.computeVerticalScrollRange();
                    int i5 = fastScroller.mRecyclerViewHeight;
                    fastScroller.mNeedVerticalScrollbar = computeVerticalScrollRange - i5 > 0 && i5 >= i4;
                    int computeHorizontalScrollRange = fastScroller.mRecyclerView.computeHorizontalScrollRange();
                    int i6 = fastScroller.mRecyclerViewWidth;
                    boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                    fastScroller.mNeedHorizontalScrollbar = z;
                    boolean z2 = fastScroller.mNeedVerticalScrollbar;
                    if (!z2 && !z) {
                        if (fastScroller.mState != 0) {
                            fastScroller.setState(0);
                            break;
                        }
                    } else {
                        if (z2) {
                            float f = i5;
                            fastScroller.mVerticalThumbCenterY = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                            fastScroller.mVerticalThumbHeight = Math.min(i5, (i5 * i5) / computeVerticalScrollRange);
                        }
                        if (fastScroller.mNeedHorizontalScrollbar) {
                            float f2 = i6;
                            fastScroller.mHorizontalThumbCenterX = (int) ((((f2 / 2.0f) + computeHorizontalScrollOffset) * f2) / computeHorizontalScrollRange);
                            fastScroller.mHorizontalThumbWidth = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
                        }
                        int i7 = fastScroller.mState;
                        if (i7 == 0 || i7 == 1) {
                            fastScroller.setState(1);
                            break;
                        }
                    }
                    break;
                case 1:
                    ViewLazyList viewLazyList = (ViewLazyList) obj;
                    ViewLazyList$linearLayoutManager$1 viewLazyList$linearLayoutManager$1 = viewLazyList.linearLayoutManager;
                    if (!viewLazyList.isDoingProgrammaticScroll && (findFirstVisibleItemPosition = viewLazyList$linearLayoutManager$1.findFirstVisibleItemPosition()) != -1 && (findLastVisibleItemPosition = viewLazyList$linearLayoutManager$1.findLastVisibleItemPosition()) != -1) {
                        ViewLazyList$scrollProcessor$1 viewLazyList$scrollProcessor$1 = viewLazyList.scrollProcessor;
                        if (findFirstVisibleItemPosition != viewLazyList$scrollProcessor$1.mostRecentFirstIndex || findLastVisibleItemPosition != viewLazyList$scrollProcessor$1.mostRecentLastIndex) {
                            viewLazyList$scrollProcessor$1.mostRecentFirstIndex = findFirstVisibleItemPosition;
                            viewLazyList$scrollProcessor$1.mostRecentLastIndex = findLastVisibleItemPosition;
                            Function2 function2 = viewLazyList$scrollProcessor$1.onViewportChanged;
                            if (function2 != null) {
                                function2.invoke(Integer.valueOf(findFirstVisibleItemPosition), Integer.valueOf(findLastVisibleItemPosition));
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    if (i2 != 0) {
                        ((ProducerCoroutine) ((ProducerScope) obj)).mo1159trySendJP2dKIU(Unit.INSTANCE);
                        break;
                    }
                    break;
                case 3:
                    MooncakeInvestingCategoryCarouselView mooncakeInvestingCategoryCarouselView = (MooncakeInvestingCategoryCarouselView) obj;
                    if (Math.abs(i) >= ViewConfiguration.get(mooncakeInvestingCategoryCarouselView.getContext()).getScaledTouchSlop() && (arrayList = mooncakeInvestingCategoryCarouselView.mScrollListeners) != null) {
                        arrayList.remove(this);
                        break;
                    }
                    break;
            }
        }
    }

    public final class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnimatorUpdater(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                    FastScroller fastScroller = (FastScroller) obj;
                    fastScroller.mVerticalThumbDrawable.setAlpha(floatValue);
                    fastScroller.mVerticalTrackDrawable.setAlpha(floatValue);
                    fastScroller.mRecyclerView.invalidate();
                    break;
                default:
                    ((ItemTouchHelper.AnonymousClass3) obj).mFraction = valueAnimator.getAnimatedFraction();
                    break;
            }
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        int i4 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        this.mShowHideAnimator = ofFloat;
        this.mAnimationState = 0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, i4);
        this.mHideRunnable = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, i4);
        this.mVerticalThumbDrawable = stateListDrawable;
        this.mVerticalTrackDrawable = drawable;
        this.mHorizontalThumbDrawable = stateListDrawable2;
        this.mHorizontalTrackDrawable = drawable2;
        this.mVerticalThumbWidth = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(i, drawable.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(i, drawable2.getIntrinsicWidth());
        this.mScrollbarMinimumRange = i2;
        this.mMargin = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListener(this, i4));
        ofFloat.addUpdateListener(new AnimatorUpdater(this, i4));
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            RecyclerView recyclerView3 = this.mRecyclerView;
            recyclerView3.mOnItemTouchListeners.remove(this);
            if (recyclerView3.mInterceptingOnItemTouchListener == this) {
                recyclerView3.mInterceptingOnItemTouchListener = null;
            }
            ArrayList arrayList = this.mRecyclerView.mScrollListeners;
            if (arrayList != null) {
                arrayList.remove(anonymousClass2);
            }
            this.mRecyclerView.removeCallbacks(anonymousClass1);
        }
        this.mRecyclerView = recyclerView;
        recyclerView.addItemDecoration(this);
        this.mRecyclerView.mOnItemTouchListeners.add(this);
        this.mRecyclerView.addOnScrollListener(anonymousClass2);
    }

    public static int scrollTo(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean isPointInsideHorizontalThumb(float f, float f2) {
        if (f2 < this.mRecyclerViewHeight - this.mHorizontalThumbHeight) {
            return false;
        }
        int i = this.mHorizontalThumbCenterX;
        int i2 = this.mHorizontalThumbWidth;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean isPointInsideVerticalThumb(float f, float f2) {
        int layoutDirection = this.mRecyclerView.getLayoutDirection();
        int i = this.mVerticalThumbWidth;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.mRecyclerViewWidth - i) {
            return false;
        }
        int i2 = this.mVerticalThumbCenterY;
        int i3 = this.mVerticalThumbHeight / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i = this.mRecyclerViewWidth;
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (i != recyclerView2.getWidth() || this.mRecyclerViewHeight != recyclerView2.getHeight()) {
            this.mRecyclerViewWidth = recyclerView2.getWidth();
            this.mRecyclerViewHeight = recyclerView2.getHeight();
            setState(0);
            return;
        }
        if (this.mAnimationState != 0) {
            if (this.mNeedVerticalScrollbar) {
                int i2 = this.mRecyclerViewWidth;
                int i3 = this.mVerticalThumbWidth;
                int i4 = i2 - i3;
                int i5 = this.mVerticalThumbCenterY;
                int i6 = this.mVerticalThumbHeight;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.mVerticalThumbDrawable;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.mVerticalTrackWidth;
                int i9 = this.mRecyclerViewHeight;
                Drawable drawable = this.mVerticalTrackDrawable;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.DECELERATION_RATE);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.DECELERATION_RATE, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.mNeedHorizontalScrollbar) {
                int i10 = this.mRecyclerViewHeight;
                int i11 = this.mHorizontalThumbHeight;
                int i12 = i10 - i11;
                int i13 = this.mHorizontalThumbCenterX;
                int i14 = this.mHorizontalThumbWidth;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.mHorizontalThumbDrawable;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.mRecyclerViewWidth;
                int i17 = this.mHorizontalTrackHeight;
                Drawable drawable2 = this.mHorizontalTrackDrawable;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.DECELERATION_RATE, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.DECELERATION_RATE);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.mState;
        if (i != 1) {
            return i == 2;
        }
        boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
        boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!isPointInsideVerticalThumb && !isPointInsideHorizontalThumb) {
            return false;
        }
        if (isPointInsideHorizontalThumb) {
            this.mDragState = 1;
            this.mHorizontalDragX = (int) motionEvent.getX();
        } else if (isPointInsideVerticalThumb) {
            this.mDragState = 2;
            this.mVerticalDragY = (int) motionEvent.getY();
        }
        setState(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.mState == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean isPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean isPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (isPointInsideVerticalThumb || isPointInsideHorizontalThumb) {
                if (isPointInsideHorizontalThumb) {
                    this.mDragState = 1;
                    this.mHorizontalDragX = (int) motionEvent.getX();
                } else if (isPointInsideVerticalThumb) {
                    this.mDragState = 2;
                    this.mVerticalDragY = (int) motionEvent.getY();
                }
                setState(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.mState == 2) {
            this.mVerticalDragY = RecyclerView.DECELERATION_RATE;
            this.mHorizontalDragX = RecyclerView.DECELERATION_RATE;
            setState(1);
            this.mDragState = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.mState == 2) {
            show();
            int i = this.mDragState;
            RecyclerView recyclerView = this.mRecyclerView;
            int i2 = this.mMargin;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.mHorizontalRange;
                iArr[0] = i2;
                int i3 = this.mRecyclerViewWidth - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.mHorizontalThumbCenterX - max) >= 2.0f) {
                    int scrollTo = scrollTo(this.mHorizontalDragX, max, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
                    if (scrollTo != 0) {
                        recyclerView.scrollBy(scrollTo, 0);
                    }
                    this.mHorizontalDragX = max;
                }
            }
            if (this.mDragState == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.mVerticalRange;
                iArr2[0] = i2;
                int i4 = this.mRecyclerViewHeight - i2;
                iArr2[1] = i4;
                float max2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.mVerticalThumbCenterY - max2) < 2.0f) {
                    return;
                }
                int scrollTo2 = scrollTo(this.mVerticalDragY, max2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
                if (scrollTo2 != 0) {
                    recyclerView.scrollBy(0, scrollTo2);
                }
                this.mVerticalDragY = max2;
            }
        }
    }

    public final void setState(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        AnonymousClass1 anonymousClass1 = this.mHideRunnable;
        StateListDrawable stateListDrawable = this.mVerticalThumbDrawable;
        if (i == 2 && this.mState != 2) {
            stateListDrawable.setState(PRESSED_STATE_SET);
            recyclerView.removeCallbacks(anonymousClass1);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            show();
        }
        if (this.mState == 2 && i != 2) {
            stateListDrawable.setState(EMPTY_STATE_SET);
            recyclerView.removeCallbacks(anonymousClass1);
            recyclerView.postDelayed(anonymousClass1, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(anonymousClass1);
            recyclerView.postDelayed(anonymousClass1, 1500L);
        }
        this.mState = i;
    }

    public final void show() {
        int i = this.mAnimationState;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.mAnimationState = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public final class AnimatorListener extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public boolean mCanceled;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnimatorListener(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.mCanceled = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.mCanceled = true;
                    break;
                case 1:
                    this.mCanceled = true;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    FastScroller fastScroller = (FastScroller) obj;
                    if (!this.mCanceled) {
                        if (((Float) fastScroller.mShowHideAnimator.getAnimatedValue()).floatValue() != RecyclerView.DECELERATION_RATE) {
                            fastScroller.mAnimationState = 2;
                            fastScroller.mRecyclerView.invalidate();
                            break;
                        } else {
                            fastScroller.mAnimationState = 0;
                            fastScroller.setState(0);
                            break;
                        }
                    } else {
                        this.mCanceled = false;
                        break;
                    }
                case 1:
                    ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) obj;
                    if (!this.mCanceled) {
                        scrollingTabContainerView.setVisibility(0);
                        break;
                    }
                    break;
                default:
                    if (!this.mCanceled) {
                        ((View) obj).setVisibility(4);
                        break;
                    }
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 1:
                    ((ScrollingTabContainerView) obj).setVisibility(0);
                    this.mCanceled = false;
                    break;
                case 2:
                    if (this.mCanceled) {
                        ((View) obj).setVisibility(0);
                        break;
                    }
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public AnimatorListener(View view, boolean z) {
            this.$r8$classId = 2;
            this.mCanceled = z;
            this.this$0 = view;
        }
    }
}
