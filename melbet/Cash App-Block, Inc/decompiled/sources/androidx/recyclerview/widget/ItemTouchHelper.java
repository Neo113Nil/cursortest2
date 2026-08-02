package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.biometric.BiometricFragment;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public final Callback mCallback;
    public ArrayList mDistances;
    public long mDragScrollStartTimeInMs;
    public float mDx;
    public float mDy;
    public GestureDetector mGestureDetector;
    public float mInitialTouchX;
    public float mInitialTouchY;
    public ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    public float mMaxSwipeVelocity;
    public RecyclerView mRecyclerView;
    public int mSelectedFlags;
    public float mSelectedStartX;
    public float mSelectedStartY;
    public int mSlop;
    public ArrayList mSwapTargets;
    public float mSwipeEscapeVelocity;
    public Rect mTmpRect;
    public VelocityTracker mVelocityTracker;
    public final ArrayList mPendingCleanup = new ArrayList();
    public final float[] mTmpPosition = new float[2];
    public RecyclerView.ViewHolder mSelected = null;
    public int mActivePointerId = -1;
    public int mActionState = 0;
    public final ArrayList mRecoverAnimations = new ArrayList();
    public final FastScroller.AnonymousClass1 mScrollRunnable = new FastScroller.AnonymousClass1(this, 1);
    public View mOverdrawChild = null;
    public final AnonymousClass2 mOnItemTouchListener = new RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int findPointerIndex;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            itemTouchHelper.mGestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            AnonymousClass3 anonymousClass3 = null;
            if (actionMasked == 0) {
                itemTouchHelper.mActivePointerId = motionEvent.getPointerId(0);
                itemTouchHelper.mInitialTouchX = motionEvent.getX();
                itemTouchHelper.mInitialTouchY = motionEvent.getY();
                VelocityTracker velocityTracker = itemTouchHelper.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                itemTouchHelper.mVelocityTracker = VelocityTracker.obtain();
                if (itemTouchHelper.mSelected == null) {
                    ArrayList arrayList = itemTouchHelper.mRecoverAnimations;
                    if (!arrayList.isEmpty()) {
                        View findChildView = itemTouchHelper.findChildView(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            AnonymousClass3 anonymousClass32 = (AnonymousClass3) arrayList.get(size);
                            if (anonymousClass32.mViewHolder.itemView == findChildView) {
                                anonymousClass3 = anonymousClass32;
                                break;
                            }
                            size--;
                        }
                    }
                    if (anonymousClass3 != null) {
                        RecyclerView.ViewHolder viewHolder = anonymousClass3.mViewHolder;
                        itemTouchHelper.mInitialTouchX -= anonymousClass3.mX;
                        itemTouchHelper.mInitialTouchY -= anonymousClass3.mY;
                        itemTouchHelper.endRecoverAnimation(viewHolder, true);
                        if (itemTouchHelper.mPendingCleanup.remove(viewHolder.itemView)) {
                            itemTouchHelper.mCallback.clearView(itemTouchHelper.mRecyclerView, viewHolder);
                        }
                        itemTouchHelper.select(viewHolder, anonymousClass3.mActionState);
                        itemTouchHelper.updateDxDy(itemTouchHelper.mSelectedFlags, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                itemTouchHelper.mActivePointerId = -1;
                itemTouchHelper.select(null, 0);
            } else {
                int i = itemTouchHelper.mActivePointerId;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    itemTouchHelper.checkSelectForSwipe(actionMasked, findPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = itemTouchHelper.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return itemTouchHelper.mSelected != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final void onTouchEvent(MotionEvent motionEvent) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            FastScroller.AnonymousClass1 anonymousClass1 = itemTouchHelper.mScrollRunnable;
            itemTouchHelper.mGestureDetector.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = itemTouchHelper.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (itemTouchHelper.mActivePointerId == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(itemTouchHelper.mActivePointerId);
            if (findPointerIndex >= 0) {
                itemTouchHelper.checkSelectForSwipe(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.mSelected;
            if (viewHolder == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        itemTouchHelper.updateDxDy(itemTouchHelper.mSelectedFlags, findPointerIndex, motionEvent);
                        itemTouchHelper.moveIfNecessary(viewHolder);
                        itemTouchHelper.mRecyclerView.removeCallbacks(anonymousClass1);
                        anonymousClass1.run();
                        itemTouchHelper.mRecyclerView.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == itemTouchHelper.mActivePointerId) {
                        itemTouchHelper.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        itemTouchHelper.updateDxDy(itemTouchHelper.mSelectedFlags, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = itemTouchHelper.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            itemTouchHelper.select(null, 0);
            itemTouchHelper.mActivePointerId = -1;
        }
    };

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$3, reason: invalid class name */
    public final class AnonymousClass3 implements Animator.AnimatorListener {
        public final int mActionState;
        public float mFraction;
        public boolean mIsPendingCleanup;
        public final float mStartDx;
        public final float mStartDy;
        public final float mTargetX;
        public final float mTargetY;
        public final ValueAnimator mValueAnimator;
        public final RecyclerView.ViewHolder mViewHolder;
        public float mX;
        public float mY;
        public final /* synthetic */ RecyclerView.ViewHolder val$prevSelected;
        public final /* synthetic */ int val$swipeDir;
        public boolean mOverridden = false;
        public boolean mEnded = false;

        public AnonymousClass3(RecyclerView.ViewHolder viewHolder, int i, float f, float f2, float f3, float f4, int i2, RecyclerView.ViewHolder viewHolder2) {
            this.val$swipeDir = i2;
            this.val$prevSelected = viewHolder2;
            this.mActionState = i;
            this.mViewHolder = viewHolder;
            this.mStartDx = f;
            this.mStartDy = f2;
            this.mTargetX = f3;
            this.mTargetY = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            this.mValueAnimator = ofFloat;
            ofFloat.addUpdateListener(new FastScroller.AnimatorUpdater(this, 1));
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            this.mFraction = RecyclerView.DECELERATION_RATE;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.mFraction = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd$androidx$recyclerview$widget$ItemTouchHelper$RecoverAnimation(animator);
            if (this.mOverridden) {
                return;
            }
            int i = this.val$swipeDir;
            RecyclerView.ViewHolder viewHolder = this.val$prevSelected;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (i <= 0) {
                itemTouchHelper.mCallback.clearView(itemTouchHelper.mRecyclerView, viewHolder);
            } else {
                itemTouchHelper.mPendingCleanup.add(viewHolder.itemView);
                this.mIsPendingCleanup = true;
                if (i > 0) {
                    itemTouchHelper.mRecyclerView.post(new BiometricFragment.AnonymousClass10(itemTouchHelper, this, i, 3));
                }
            }
            View view = itemTouchHelper.mOverdrawChild;
            View view2 = viewHolder.itemView;
            if (view == view2 && view2 == view) {
                itemTouchHelper.mOverdrawChild = null;
            }
        }

        public final void onAnimationEnd$androidx$recyclerview$widget$ItemTouchHelper$RecoverAnimation(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public abstract class Callback {
        private static final Interpolator sDragScrollInterpolator = new ViewPager.AnonymousClass2(2);
        private static final Interpolator sDragViewScrollCapInterpolator = new ViewPager.AnonymousClass2(3);
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag(0, i2 | i);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = viewHolder.itemView.getWidth() + i;
            int height = viewHolder.itemView.getHeight() + i2;
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
            }
            return viewHolder2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view.setElevation(floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(RecyclerView.DECELERATION_RATE);
            view.setTranslationY(RecyclerView.DECELERATION_RATE);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (3158064 & i6) >> 2;
            }
            return i3 | i5;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.mItemAnimator;
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.mMoveDuration : itemAnimator.mRemoveDuration;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.mCachedMaxScrollSpeed)));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                Float valueOf = Float.valueOf(view.getElevation());
                int childCount = recyclerView.getChildCount();
                float f3 = RecyclerView.DECELERATION_RATE;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                        float elevation = childAt.getElevation();
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                view.setElevation(f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<AnonymousClass3> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass3 anonymousClass3 = list.get(i2);
                RecyclerView.ViewHolder viewHolder2 = anonymousClass3.mViewHolder;
                float f3 = anonymousClass3.mStartDx;
                float f4 = anonymousClass3.mTargetX;
                if (f3 == f4) {
                    anonymousClass3.mX = viewHolder2.itemView.getTranslationX();
                } else {
                    anonymousClass3.mX = CameraState$Type$EnumUnboxingLocalUtility.m(f4, f3, anonymousClass3.mFraction, f3);
                }
                float f5 = anonymousClass3.mStartDy;
                float f6 = anonymousClass3.mTargetY;
                if (f5 == f6) {
                    anonymousClass3.mY = viewHolder2.itemView.getTranslationY();
                } else {
                    anonymousClass3.mY = CameraState$Type$EnumUnboxingLocalUtility.m(f6, f5, anonymousClass3.mFraction, f5);
                }
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, anonymousClass3.mViewHolder, anonymousClass3.mX, anonymousClass3.mY, anonymousClass3.mActionState, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<AnonymousClass3> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass3 anonymousClass3 = list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, anonymousClass3.mViewHolder, anonymousClass3.mX, anonymousClass3.mY, anonymousClass3.mActionState, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                AnonymousClass3 anonymousClass32 = list.get(i3);
                boolean z2 = anonymousClass32.mEnded;
                if (z2 && !anonymousClass32.mIsPendingCleanup) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (!(layoutManager instanceof ViewDropHandler)) {
                if (layoutManager.canScrollHorizontally()) {
                    if (RecyclerView.LayoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                        recyclerView.scrollToPosition(i2);
                    }
                    if (RecyclerView.LayoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.scrollToPosition(i2);
                    }
                }
                if (layoutManager.canScrollVertically()) {
                    if (RecyclerView.LayoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                        recyclerView.scrollToPosition(i2);
                    }
                    if (RecyclerView.LayoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.scrollToPosition(i2);
                        return;
                    }
                    return;
                }
                return;
            }
            View view = viewHolder.itemView;
            View view2 = viewHolder2.itemView;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((ViewDropHandler) layoutManager);
            linearLayoutManager.assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
            linearLayoutManager.ensureLayoutState();
            linearLayoutManager.resolveShouldLayoutReverse();
            int position = RecyclerView.LayoutManager.getPosition(view);
            int position2 = RecyclerView.LayoutManager.getPosition(view2);
            char c = position < position2 ? (char) 1 : (char) 65535;
            boolean z = linearLayoutManager.mShouldReverseLayout;
            OrientationHelper orientationHelper = linearLayoutManager.mOrientationHelper;
            if (z) {
                if (c == 1) {
                    linearLayoutManager.scrollToPositionWithOffset(position2, orientationHelper.getEndAfterPadding() - (linearLayoutManager.mOrientationHelper.getDecoratedMeasurement(view) + linearLayoutManager.mOrientationHelper.getDecoratedStart(view2)));
                    return;
                } else {
                    linearLayoutManager.scrollToPositionWithOffset(position2, orientationHelper.getEndAfterPadding() - linearLayoutManager.mOrientationHelper.getDecoratedEnd(view2));
                    return;
                }
            }
            if (c == 65535) {
                linearLayoutManager.scrollToPositionWithOffset(position2, orientationHelper.getDecoratedStart(view2));
            } else {
                linearLayoutManager.scrollToPositionWithOffset(position2, orientationHelper.getDecoratedEnd(view2) - linearLayoutManager.mOrientationHelper.getDecoratedMeasurement(view));
            }
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public abstract void onSwiped(RecyclerView.ViewHolder viewHolder, int i);
    }

    public final class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        public boolean mShouldReactToLongPress = true;

        public ItemTouchHelperGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            View findChildView;
            RecyclerView.ViewHolder childViewHolder;
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            Callback callback = itemTouchHelper.mCallback;
            if (this.mShouldReactToLongPress && (findChildView = itemTouchHelper.findChildView(motionEvent)) != null && (childViewHolder = itemTouchHelper.mRecyclerView.getChildViewHolder(findChildView)) != null && callback.hasDragFlag(itemTouchHelper.mRecyclerView, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = itemTouchHelper.mActivePointerId;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    itemTouchHelper.mInitialTouchX = x;
                    itemTouchHelper.mInitialTouchY = y;
                    itemTouchHelper.mDy = RecyclerView.DECELERATION_RATE;
                    itemTouchHelper.mDx = RecyclerView.DECELERATION_RATE;
                    if (callback.isLongPressDragEnabled()) {
                        itemTouchHelper.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    public interface ViewDropHandler {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.ItemTouchHelper$2] */
    public ItemTouchHelper(Callback callback) {
        this.mCallback = callback;
    }

    public static boolean hitTest(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        AnonymousClass2 anonymousClass2 = this.mOnItemTouchListener;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            RecyclerView recyclerView3 = this.mRecyclerView;
            recyclerView3.mOnItemTouchListeners.remove(anonymousClass2);
            if (recyclerView3.mInterceptingOnItemTouchListener == anonymousClass2) {
                recyclerView3.mInterceptingOnItemTouchListener = null;
            }
            ArrayList arrayList = this.mRecyclerView.mOnChildAttachStateListeners;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.mRecoverAnimations;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) arrayList2.get(0);
                anonymousClass3.mValueAnimator.cancel();
                this.mCallback.clearView(this.mRecyclerView, anonymousClass3.mViewHolder);
            }
            arrayList2.clear();
            this.mOverdrawChild = null;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
            ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
            if (itemTouchHelperGestureListener != null) {
                itemTouchHelperGestureListener.mShouldReactToLongPress = false;
                this.mItemTouchHelperGestureListener = null;
            }
            if (this.mGestureDetector != null) {
                this.mGestureDetector = null;
            }
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
            this.mRecyclerView.addItemDecoration(this);
            this.mRecyclerView.mOnItemTouchListeners.add(anonymousClass2);
            RecyclerView recyclerView4 = this.mRecyclerView;
            if (recyclerView4.mOnChildAttachStateListeners == null) {
                recyclerView4.mOnChildAttachStateListeners = new ArrayList();
            }
            recyclerView4.mOnChildAttachStateListeners.add(this);
            this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
            this.mGestureDetector = new GestureDetector(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
        }
    }

    public final int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.mDx > RecyclerView.DECELERATION_RATE ? 8 : 4;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        Callback callback = this.mCallback;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, callback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i3 = xVelocity > RecyclerView.DECELERATION_RATE ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= callback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = callback.getSwipeThreshold(viewHolder) * this.mRecyclerView.getWidth();
        if ((i & i2) == 0 || Math.abs(this.mDx) <= swipeThreshold) {
            return 0;
        }
        return i2;
    }

    public final void checkSelectForSwipe(int i, int i2, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View findChildView;
        if (this.mSelected == null && i == 2 && this.mActionState != 2) {
            Callback callback = this.mCallback;
            if (callback.isItemViewSwipeEnabled()) {
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView.mScrollState == 1) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
                int i3 = this.mActivePointerId;
                RecyclerView.ViewHolder viewHolder = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.mInitialTouchX;
                    float y = motionEvent.getY(findPointerIndex) - this.mInitialTouchY;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f = this.mSlop;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (findChildView = findChildView(motionEvent)) != null))) {
                        viewHolder = this.mRecyclerView.getChildViewHolder(findChildView);
                    }
                }
                if (viewHolder == null || (absoluteMovementFlags = (callback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & 65280) >> 8) == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.mInitialTouchX;
                float f3 = y2 - this.mInitialTouchY;
                float abs3 = Math.abs(f2);
                float abs4 = Math.abs(f3);
                float f4 = this.mSlop;
                if (abs3 >= f4 || abs4 >= f4) {
                    if (abs3 > abs4) {
                        if (f2 < RecyclerView.DECELERATION_RATE && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f2 > RecyclerView.DECELERATION_RATE && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < RecyclerView.DECELERATION_RATE && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f3 > RecyclerView.DECELERATION_RATE && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.mDy = RecyclerView.DECELERATION_RATE;
                    this.mDx = RecyclerView.DECELERATION_RATE;
                    this.mActivePointerId = motionEvent.getPointerId(0);
                    select(viewHolder, 1);
                }
            }
        }
    }

    public final int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.mDy > RecyclerView.DECELERATION_RATE ? 2 : 1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        Callback callback = this.mCallback;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, callback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i3 = yVelocity > RecyclerView.DECELERATION_RATE ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= callback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = callback.getSwipeThreshold(viewHolder) * this.mRecyclerView.getHeight();
        if ((i & i2) == 0 || Math.abs(this.mDy) <= swipeThreshold) {
            return 0;
        }
        return i2;
    }

    public final void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
        ArrayList arrayList = this.mRecoverAnimations;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) arrayList.get(size);
            if (anonymousClass3.mViewHolder == viewHolder) {
                anonymousClass3.mOverridden |= z;
                if (!anonymousClass3.mEnded) {
                    anonymousClass3.mValueAnimator.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View findChildView(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x, y, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        ArrayList arrayList = this.mRecoverAnimations;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) arrayList.get(size);
            View view2 = anonymousClass3.mViewHolder.itemView;
            if (hitTest(view2, x, y, anonymousClass3.mX, anonymousClass3.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x, y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    public final void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    public final void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        int i;
        int i2;
        int i3;
        if (this.mRecyclerView.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.mActionState != 2) {
            return;
        }
        Callback callback = this.mCallback;
        float moveThreshold = callback.getMoveThreshold(viewHolder);
        int i4 = (int) (this.mSelectedStartX + this.mDx);
        int i5 = (int) (this.mSelectedStartY + this.mDy);
        if (Math.abs(i5 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || Math.abs(i4 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
            ArrayList arrayList = this.mSwapTargets;
            if (arrayList == null) {
                this.mSwapTargets = new ArrayList();
                this.mDistances = new ArrayList();
            } else {
                arrayList.clear();
                this.mDistances.clear();
            }
            int boundingBoxMargin = callback.getBoundingBoxMargin();
            int round = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
            int round2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
            int i6 = boundingBoxMargin * 2;
            int width = viewHolder.itemView.getWidth() + round + i6;
            int height = viewHolder.itemView.getHeight() + round2 + i6;
            int i7 = (round + width) / 2;
            int i8 = (round2 + height) / 2;
            RecyclerView.LayoutManager layoutManager = this.mRecyclerView.mLayout;
            int childCount = layoutManager.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                char c2 = c;
                View childAt = layoutManager.getChildAt(i9);
                if (childAt != viewHolder.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                    RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                    i = i7;
                    if (callback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                        int abs = Math.abs(i - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int abs2 = Math.abs(i8 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i10 = (abs2 * abs2) + (abs * abs);
                        int size = this.mSwapTargets.size();
                        i2 = round;
                        i3 = round2;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < size) {
                            int i13 = size;
                            if (i10 <= ((Integer) this.mDistances.get(i11)).intValue()) {
                                break;
                            }
                            i12++;
                            i11++;
                            size = i13;
                        }
                        this.mSwapTargets.add(i12, childViewHolder);
                        this.mDistances.add(i12, Integer.valueOf(i10));
                        i9++;
                        c = c2;
                        round = i2;
                        i7 = i;
                        round2 = i3;
                    }
                } else {
                    i = i7;
                }
                i2 = round;
                i3 = round2;
                i9++;
                c = c2;
                round = i2;
                i7 = i;
                round2 = i3;
            }
            ArrayList arrayList2 = this.mSwapTargets;
            if (arrayList2.size() == 0) {
                return;
            }
            RecyclerView.ViewHolder chooseDropTarget = callback.chooseDropTarget(viewHolder, arrayList2, i4, i5);
            if (chooseDropTarget == null) {
                this.mSwapTargets.clear();
                this.mDistances.clear();
                return;
            }
            int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
            if (callback.onMove(this.mRecyclerView, viewHolder, chooseDropTarget)) {
                this.mCallback.onMoved(this.mRecyclerView, viewHolder, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i4, i5);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
        }
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, false);
        if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
            this.mCallback.clearView(this.mRecyclerView, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            float[] fArr = this.mTmpPosition;
            getSelectedDxDy(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            float[] fArr = this.mTmpPosition;
            getSelectedDxDy(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x008e, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void select(RecyclerView.ViewHolder viewHolder, int i) {
        Callback callback;
        boolean z;
        boolean z2;
        RecyclerView.ViewHolder viewHolder2;
        int checkVerticalSwipe;
        VelocityTracker velocityTracker;
        ?? r16;
        float signum;
        if (viewHolder == this.mSelected && i == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i2 = this.mActionState;
        endRecoverAnimation(viewHolder, true);
        this.mActionState = i;
        if (i == 2) {
            if (viewHolder == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Must pass a ViewHolder when dragging");
                return;
            }
            this.mOverdrawChild = viewHolder.itemView;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.ViewHolder viewHolder3 = this.mSelected;
        Callback callback2 = this.mCallback;
        if (viewHolder3 != null) {
            if (viewHolder3.itemView.getParent() != null) {
                if (i2 != 2 && this.mActionState != 2) {
                    int movementFlags = callback2.getMovementFlags(this.mRecyclerView, viewHolder3);
                    int convertToAbsoluteDirection = (callback2.convertToAbsoluteDirection(movementFlags, this.mRecyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (convertToAbsoluteDirection != 0) {
                        int i4 = (movementFlags & 65280) >> 8;
                        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
                            checkVerticalSwipe = checkHorizontalSwipe(viewHolder3, convertToAbsoluteDirection);
                            if (checkVerticalSwipe <= 0) {
                                checkVerticalSwipe = checkVerticalSwipe(viewHolder3, convertToAbsoluteDirection);
                            } else if ((i4 & checkVerticalSwipe) == 0) {
                                checkVerticalSwipe = Callback.convertToRelativeDirection(checkVerticalSwipe, this.mRecyclerView.getLayoutDirection());
                            }
                            velocityTracker = this.mVelocityTracker;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.mVelocityTracker = null;
                            }
                            int i5 = 4;
                            float f = RecyclerView.DECELERATION_RATE;
                            if (checkVerticalSwipe != 1 || checkVerticalSwipe == 2) {
                                r16 = 0;
                                signum = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                            } else if (checkVerticalSwipe == 4 || checkVerticalSwipe == 8 || checkVerticalSwipe == 16 || checkVerticalSwipe == 32) {
                                r16 = 0;
                                signum = 0.0f;
                                f = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                            } else {
                                signum = 0.0f;
                                r16 = 0;
                            }
                            if (i2 == 2) {
                                i5 = 8;
                            } else if (checkVerticalSwipe > 0) {
                                i5 = 2;
                            }
                            float[] fArr = this.mTmpPosition;
                            getSelectedDxDy(fArr);
                            float f2 = f;
                            float f3 = signum;
                            float f4 = fArr[r16];
                            float f5 = fArr[1];
                            z = r16;
                            callback = callback2;
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(viewHolder3, i2, f4, f5, f2, f3, checkVerticalSwipe, viewHolder3);
                            long animationDuration = callback.getAnimationDuration(this.mRecyclerView, i5, f2 - f4, f3 - f5);
                            ValueAnimator valueAnimator = anonymousClass3.mValueAnimator;
                            valueAnimator.setDuration(animationDuration);
                            this.mRecoverAnimations.add(anonymousClass3);
                            viewHolder3.setIsRecyclable(z);
                            valueAnimator.start();
                            viewHolder2 = null;
                            z2 = true;
                        } else {
                            checkVerticalSwipe = checkVerticalSwipe(viewHolder3, convertToAbsoluteDirection);
                            if (checkVerticalSwipe <= 0) {
                                checkVerticalSwipe = checkHorizontalSwipe(viewHolder3, convertToAbsoluteDirection);
                                if (checkVerticalSwipe > 0) {
                                    if ((i4 & checkVerticalSwipe) == 0) {
                                        checkVerticalSwipe = Callback.convertToRelativeDirection(checkVerticalSwipe, this.mRecyclerView.getLayoutDirection());
                                    }
                                }
                            }
                            velocityTracker = this.mVelocityTracker;
                            if (velocityTracker != null) {
                            }
                            int i52 = 4;
                            float f6 = RecyclerView.DECELERATION_RATE;
                            if (checkVerticalSwipe != 1) {
                            }
                            r16 = 0;
                            signum = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                            if (i2 == 2) {
                            }
                            float[] fArr2 = this.mTmpPosition;
                            getSelectedDxDy(fArr2);
                            float f22 = f6;
                            float f32 = signum;
                            float f42 = fArr2[r16];
                            float f52 = fArr2[1];
                            z = r16;
                            callback = callback2;
                            AnonymousClass3 anonymousClass32 = new AnonymousClass3(viewHolder3, i2, f42, f52, f22, f32, checkVerticalSwipe, viewHolder3);
                            long animationDuration2 = callback.getAnimationDuration(this.mRecyclerView, i52, f22 - f42, f32 - f52);
                            ValueAnimator valueAnimator2 = anonymousClass32.mValueAnimator;
                            valueAnimator2.setDuration(animationDuration2);
                            this.mRecoverAnimations.add(anonymousClass32);
                            viewHolder3.setIsRecyclable(z);
                            valueAnimator2.start();
                            viewHolder2 = null;
                            z2 = true;
                        }
                    }
                }
                checkVerticalSwipe = 0;
                velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                }
                int i522 = 4;
                float f62 = RecyclerView.DECELERATION_RATE;
                if (checkVerticalSwipe != 1) {
                }
                r16 = 0;
                signum = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                if (i2 == 2) {
                }
                float[] fArr22 = this.mTmpPosition;
                getSelectedDxDy(fArr22);
                float f222 = f62;
                float f322 = signum;
                float f422 = fArr22[r16];
                float f522 = fArr22[1];
                z = r16;
                callback = callback2;
                AnonymousClass3 anonymousClass322 = new AnonymousClass3(viewHolder3, i2, f422, f522, f222, f322, checkVerticalSwipe, viewHolder3);
                long animationDuration22 = callback.getAnimationDuration(this.mRecyclerView, i522, f222 - f422, f322 - f522);
                ValueAnimator valueAnimator22 = anonymousClass322.mValueAnimator;
                valueAnimator22.setDuration(animationDuration22);
                this.mRecoverAnimations.add(anonymousClass322);
                viewHolder3.setIsRecyclable(z);
                valueAnimator22.start();
                viewHolder2 = null;
                z2 = true;
            } else {
                callback = callback2;
                z = false;
                if (viewHolder3.itemView == this.mOverdrawChild) {
                    viewHolder2 = null;
                    this.mOverdrawChild = null;
                } else {
                    viewHolder2 = null;
                }
                callback.clearView(this.mRecyclerView, viewHolder3);
                z2 = false;
            }
            this.mSelected = viewHolder2;
        } else {
            callback = callback2;
            z = false;
            z2 = false;
        }
        if (viewHolder != null) {
            this.mSelectedFlags = (callback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & i3) >> (this.mActionState * 8);
            this.mSelectedStartX = viewHolder.itemView.getLeft();
            this.mSelectedStartY = viewHolder.itemView.getTop();
            this.mSelected = viewHolder;
            if (i == 2) {
                viewHolder.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.mRecyclerView.getParent();
        if (parent != null) {
            if (this.mSelected != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.mRecyclerView.mLayout.mRequestedSimpleAnimations = true;
        }
        callback.onSelectedChanged(this.mSelected, this.mActionState);
        this.mRecyclerView.invalidate();
    }

    public final void updateDxDy(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.mInitialTouchX;
        this.mDx = f;
        this.mDy = y - this.mInitialTouchY;
        if ((i & 4) == 0) {
            this.mDx = Math.max(RecyclerView.DECELERATION_RATE, f);
        }
        if ((i & 8) == 0) {
            this.mDx = Math.min(RecyclerView.DECELERATION_RATE, this.mDx);
        }
        if ((i & 1) == 0) {
            this.mDy = Math.max(RecyclerView.DECELERATION_RATE, this.mDy);
        }
        if ((i & 2) == 0) {
            this.mDy = Math.min(RecyclerView.DECELERATION_RATE, this.mDy);
        }
    }
}
