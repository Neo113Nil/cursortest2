package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.view.AbsSavedState;
import androidx.media3.common.util.CircularIntArray;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.bugsnag.android.TraceParser;
import com.google.android.filament.Viewport;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView$observer$1;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okhttp3.internal.http1.HeadersReader;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild {
    public static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static boolean sDebugAssertionsEnabled = false;
    public static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    public static final ViewPager.AnonymousClass2 sQuinticInterpolator;
    public static boolean sVerboseLoggingEnabled = false;
    public RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public Adapter mAdapter;
    public final AdapterHelper mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public final TraceParser mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public final DifferentialMotionFlingController mDifferentialMotionFlingController;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public EdgeEffectFactory mEdgeEffectFactory;
    public boolean mFirstLayoutComplete;
    public GapWorker mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public OnItemTouchListener mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public ItemAnimator mItemAnimator;
    public final AnonymousClass7 mItemAnimatorListener;
    public final AnonymousClass1 mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public LayoutManager mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final boolean mLowResRotaryEncoderFeature;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final CashRecyclerView$observer$1 mObserver;
    public ArrayList mOnChildAttachStateListeners;
    public OnFlingListener mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    public final ArrayList mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public final float mPhysicalCoef;
    public boolean mPostedAnimatorRunner;
    public final CircularIntArray mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final Recycler mRecycler;
    public final ArrayList mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public final float mScaledHorizontalScrollFactor;
    public final float mScaledVerticalScrollFactor;
    public OnScrollListener mScrollListener;
    public ArrayList mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public NestedScrollingChildHelper mScrollingChildHelper;
    public final State mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final AnonymousClass1 mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final ViewFlinger mViewFlinger;
    public final AnonymousClass7 mViewInfoProcessCallback;
    public final CallResult mViewInfoStore;
    public static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    public final class AnonymousClass7 implements DifferentialMotionFlingTarget {
        public /* synthetic */ AnonymousClass7() {
        }

        public void dispatchUpdate(AdapterHelper.UpdateOp updateOp) {
            int i = updateOp.cmd;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(updateOp.positionStart, updateOp.itemCount);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(updateOp.positionStart, updateOp.itemCount);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(updateOp.positionStart, updateOp.itemCount);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(updateOp.positionStart, updateOp.itemCount);
            }
        }

        public ViewHolder findViewHolder(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
            int i2 = 0;
            ViewHolder viewHolder = null;
            while (true) {
                if (i2 >= unfilteredChildCount) {
                    break;
                }
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.mPosition == i) {
                    if (!((ArrayList) recyclerView.mChildHelper.currentThread).contains(childViewHolderInt.itemView)) {
                        viewHolder = childViewHolderInt;
                        break;
                    }
                    viewHolder = childViewHolderInt;
                }
                i2++;
            }
            if (viewHolder != null) {
                if (!((ArrayList) recyclerView.mChildHelper.currentThread).contains(viewHolder.itemView)) {
                    return viewHolder;
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            }
            return null;
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
            float f;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout.canScrollVertically()) {
                f = recyclerView.mScaledVerticalScrollFactor;
            } else {
                if (!recyclerView.mLayout.canScrollHorizontally()) {
                    return RecyclerView.DECELERATION_RATE;
                }
                f = recyclerView.mScaledHorizontalScrollFactor;
            }
            return -f;
        }

        public void markViewHoldersUpdated(int i, int i2, Object obj) {
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
            int i5 = i2 + i;
            for (int i6 = 0; i6 < unfilteredChildCount; i6++) {
                View unfilteredChildAt = recyclerView.mChildHelper.getUnfilteredChildAt(i6);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(unfilteredChildAt);
                if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                    childViewHolderInt.addFlags(2);
                    childViewHolderInt.addChangePayload(obj);
                    ((LayoutParams) unfilteredChildAt.getLayoutParams()).mInsetsDirty = true;
                }
            }
            Recycler recycler = recyclerView.mRecycler;
            ArrayList arrayList = recycler.mCachedViews;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i5) {
                    viewHolder.addFlags(2);
                    recycler.recycleCachedViewAt(size);
                }
            }
            recyclerView.mItemsChanged = true;
        }

        public void offsetPositionsForAdd(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
            for (int i3 = 0; i3 < unfilteredChildCount; i3++) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i3));
                if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i2));
                    }
                    childViewHolderInt.offsetPosition(i2, false);
                    recyclerView.mState.mStructureChanged = true;
                }
            }
            ArrayList arrayList = recyclerView.mRecycler.mCachedViews;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(i4);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + viewHolder + " now at position " + (viewHolder.mPosition + i2));
                    }
                    viewHolder.offsetPosition(i2, false);
                }
            }
            recyclerView.requestLayout();
            recyclerView.mItemsAddedOrRemoved = true;
        }

        public void offsetPositionsForMove(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            RecyclerView recyclerView = RecyclerView.this;
            int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
            int i10 = -1;
            if (i < i2) {
                i4 = i;
                i3 = i2;
                i5 = -1;
            } else {
                i3 = i;
                i4 = i2;
                i5 = 1;
            }
            for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i11));
                if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + childViewHolderInt);
                    }
                    if (childViewHolderInt.mPosition == i) {
                        childViewHolderInt.offsetPosition(i2 - i, false);
                    } else {
                        childViewHolderInt.offsetPosition(i5, false);
                    }
                    recyclerView.mState.mStructureChanged = true;
                }
            }
            ArrayList arrayList = recyclerView.mRecycler.mCachedViews;
            if (i < i2) {
                i7 = i;
                i6 = i2;
            } else {
                i6 = i;
                i7 = i2;
                i10 = 1;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ViewHolder viewHolder = (ViewHolder) arrayList.get(i12);
                if (viewHolder != null && (i8 = viewHolder.mPosition) >= i7 && i8 <= i6) {
                    if (i8 == i) {
                        viewHolder.offsetPosition(i2 - i, false);
                    } else {
                        viewHolder.offsetPosition(i10, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + viewHolder);
                    }
                }
            }
            recyclerView.requestLayout();
            recyclerView.mItemsAddedOrRemoved = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void processAppeared(ViewHolder viewHolder, Viewport viewport, Viewport viewport2) {
            boolean z;
            viewHolder.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) recyclerView.mItemAnimator;
            if (viewport != null) {
                defaultItemAnimator.getClass();
                int i = viewport.width;
                int i2 = viewport2.width;
                if (i != i2 || viewport.height != viewport2.height) {
                    z = defaultItemAnimator.animateMove(viewHolder, i, viewport.height, i2, viewport2.height);
                    if (z) {
                        return;
                    }
                    recyclerView.postAnimationRunner();
                    return;
                }
            }
            defaultItemAnimator.resetAnimation(viewHolder);
            viewHolder.itemView.setAlpha(RecyclerView.DECELERATION_RATE);
            defaultItemAnimator.mPendingAdditions.add(viewHolder);
            z = true;
            if (z) {
            }
        }

        public void processDisappeared(ViewHolder viewHolder, Viewport viewport, Viewport viewport2) {
            boolean z;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mRecycler.unscrapView(viewHolder);
            recyclerView.addAnimatingView(viewHolder);
            viewHolder.setIsRecyclable(false);
            DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) recyclerView.mItemAnimator;
            defaultItemAnimator.getClass();
            int i = viewport.width;
            int i2 = viewport.height;
            View view = viewHolder.itemView;
            int left = viewport2 == null ? view.getLeft() : viewport2.width;
            int top = viewport2 == null ? view.getTop() : viewport2.height;
            if (viewHolder.isRemoved() || (i == left && i2 == top)) {
                defaultItemAnimator.resetAnimation(viewHolder);
                defaultItemAnimator.mPendingRemovals.add(viewHolder);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = defaultItemAnimator.animateMove(viewHolder, i, i2, left, top);
            }
            if (z) {
                recyclerView.postAnimationRunner();
            }
        }

        public void removeViewAt(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float f) {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout.canScrollVertically()) {
                i2 = (int) f;
                i = 0;
            } else if (recyclerView.mLayout.canScrollHorizontally()) {
                i = (int) f;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            recyclerView.stopScroll();
            return recyclerView.fling(i, i2, 0, Integer.MAX_VALUE);
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
            RecyclerView.this.stopScroll();
        }
    }

    public final class AdapterDataObservable extends Observable {
        public final boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void notifyItemMoved(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2);
            }
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void notifyStateRestorationPolicyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public abstract class Api35Impl {
        public static void setFrameContentVelocity(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface ChildDrawingOrderCallback {
    }

    public abstract class EdgeEffectFactory {
    }

    public abstract class ItemAnimator {
        public long mAddDuration;
        public long mChangeDuration;
        public ArrayList mFinishedListeners;
        public AnonymousClass7 mListener;
        public long mMoveDuration;
        public long mRemoveDuration;

        public static void buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int i = viewHolder.mFlags;
            if (!viewHolder.isInvalid() && (i & 4) == 0) {
                viewHolder.getOldPosition();
                viewHolder.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, Viewport viewport, Viewport viewport2);

        /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void dispatchAnimationFinished(ViewHolder viewHolder) {
            AnonymousClass7 anonymousClass7 = this.mListener;
            if (anonymousClass7 != null) {
                RecyclerView recyclerView = RecyclerView.this;
                boolean z = true;
                viewHolder.setIsRecyclable(true);
                if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                    viewHolder.mShadowedHolder = null;
                }
                viewHolder.mShadowingHolder = null;
                if (viewHolder.shouldBeKeptAsChild()) {
                    return;
                }
                View view = viewHolder.itemView;
                Recycler recycler = recyclerView.mRecycler;
                recyclerView.startInterceptRequestLayout();
                TraceParser traceParser = recyclerView.mChildHelper;
                HeadersReader headersReader = (HeadersReader) traceParser.projectPackages;
                AnonymousClass7 anonymousClass72 = (AnonymousClass7) traceParser.logger;
                int i = traceParser.state;
                if (i != 1) {
                    if (i == 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("Cannot call removeViewIfHidden within removeViewIfHidden");
                        return;
                    }
                    try {
                        traceParser.state = 2;
                        int indexOfChild = RecyclerView.this.indexOfChild(view);
                        if (indexOfChild == -1) {
                            traceParser.unhideViewInternal(view);
                        } else if (headersReader.get(indexOfChild)) {
                            headersReader.remove(indexOfChild);
                            traceParser.unhideViewInternal(view);
                            anonymousClass72.removeViewAt(indexOfChild);
                        }
                        if (z) {
                            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                            recycler.unscrapView(childViewHolderInt);
                            recycler.recycleViewHolderInternal(childViewHolderInt);
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                            }
                        }
                        recyclerView.stopInterceptRequestLayout(!z);
                        if (z && viewHolder.isTmpDetached()) {
                            recyclerView.removeDetachedView(viewHolder.itemView, false);
                            return;
                        }
                    } finally {
                        traceParser.state = 0;
                    }
                }
                if (((View) traceParser.threadAttrs) != view) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    return;
                }
                z = false;
                if (z) {
                }
                recyclerView.stopInterceptRequestLayout(!z);
                if (z) {
                }
            }
        }

        public final void dispatchAnimationsFinished() {
            ArrayList arrayList = this.mFinishedListeners;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                a$$ExternalSyntheticBUOutline0.m$1();
            }
        }

        public abstract void endAnimation(ViewHolder viewHolder);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public abstract void runPendingAnimations();
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    public abstract class OnFlingListener {
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(MotionEvent motionEvent);
    }

    public abstract class OnScrollListener {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public final class RecycledViewPool {
        public int mAttachCountForClearing;
        public Set mAttachedAdaptersForPoolingContainer;
        public SparseArray mScrap;

        public final class ScrapData {
            public final ArrayList mScrapHeap = new ArrayList();
            public int mMaxScrap = 5;
            public long mCreateRunningAverageNs = 0;
            public long mBindRunningAverageNs = 0;
        }

        public final ScrapData getScrapDataForType(int i) {
            SparseArray sparseArray = this.mScrap;
            ScrapData scrapData = (ScrapData) sparseArray.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            sparseArray.put(i, scrapData2);
            return scrapData2;
        }
    }

    public final class Recycler {
        public final ArrayList mAttachedScrap;
        public final ArrayList mCachedViews;
        public ArrayList mChangedScrap;
        public RecycledViewPool mRecyclerPool;
        public int mRequestedCacheMax;
        public final List mUnmodifiableAttachedScrap;
        public int mViewCacheMax;

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.mAttachedScrap = arrayList;
            this.mChangedScrap = null;
            this.mCachedViews = new ArrayList();
            this.mUnmodifiableAttachedScrap = Collections.unmodifiableList(arrayList);
            this.mRequestedCacheMax = 2;
            this.mViewCacheMax = 2;
        }

        public final void addViewHolderToRecycledViewPool(ViewHolder viewHolder, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                FailoverFragment.f fVar = recyclerViewAccessibilityDelegate.mItemDelegate;
                ViewCompat.setAccessibilityDelegate(view, fVar != null ? (AccessibilityDelegateCompat) ((WeakHashMap) fVar.b).remove(view) : null);
            }
            if (z) {
                ArrayList arrayList = recyclerView.mRecyclerListeners;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(viewHolder);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.removeViewHolder(viewHolder);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            RecycledViewPool recycledViewPool = getRecycledViewPool();
            recycledViewPool.getClass();
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList2 = recycledViewPool.getScrapDataForType(itemViewType).mScrapHeap;
            if (((RecycledViewPool.ScrapData) recycledViewPool.mScrap.get(itemViewType)).mMaxScrap <= arrayList2.size()) {
                Countries.callPoolingContainerOnRelease(viewHolder.itemView);
            } else if (RecyclerView.sDebugAssertionsEnabled && arrayList2.contains(viewHolder)) {
                a$$ExternalSyntheticBUOutline0.m$3("this scrap item already exists");
            } else {
                viewHolder.resetInternal();
                arrayList2.add(viewHolder);
            }
        }

        public final int convertPreLayoutPositionToPostLayout(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            State state = recyclerView.mState;
            if (i >= 0 && i < state.getItemCount()) {
                return !state.mInPreLayout ? i : recyclerView.mAdapterHelper.findPositionOffset(i, 0);
            }
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "invalid position ", ". State item count is ");
            m2m.append(state.getItemCount());
            m2m.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(m2m.toString());
        }

        public final RecycledViewPool getRecycledViewPool() {
            if (this.mRecyclerPool == null) {
                RecycledViewPool recycledViewPool = new RecycledViewPool();
                recycledViewPool.mScrap = new SparseArray();
                recycledViewPool.mAttachCountForClearing = 0;
                recycledViewPool.mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());
                this.mRecyclerPool = recycledViewPool;
                maybeSendPoolingContainerAttach();
            }
            return this.mRecyclerPool;
        }

        public final View getViewForPosition(int i) {
            return tryGetViewHolderForPositionByDeadline(i, Long.MAX_VALUE).itemView;
        }

        public final void maybeSendPoolingContainerAttach() {
            RecyclerView recyclerView;
            Adapter adapter;
            RecycledViewPool recycledViewPool = this.mRecyclerPool;
            if (recycledViewPool == null || (adapter = (recyclerView = RecyclerView.this).mAdapter) == null || !recyclerView.mIsAttached) {
                return;
            }
            recycledViewPool.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        public final void poolingContainerDetach(Adapter adapter, boolean z) {
            RecycledViewPool recycledViewPool = this.mRecyclerPool;
            if (recycledViewPool != null) {
                SparseArray sparseArray = recycledViewPool.mScrap;
                Set set = recycledViewPool.mAttachedAdaptersForPoolingContainer;
                set.remove(adapter);
                if (set.size() != 0 || z) {
                    return;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    ArrayList arrayList = ((RecycledViewPool.ScrapData) sparseArray.get(sparseArray.keyAt(i))).mScrapHeap;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Countries.callPoolingContainerOnRelease(((ViewHolder) arrayList.get(i2)).itemView);
                    }
                }
            }
        }

        public final void recycleAndClearCachedViews() {
            ArrayList arrayList = this.mCachedViews;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                recycleCachedViewAt(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                CircularIntArray circularIntArray = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = circularIntArray.elements;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                circularIntArray.capacityBitmask = 0;
            }
        }

        public final void recycleCachedViewAt(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                CameraState$Type$EnumUnboxingLocalUtility.m(i, "Recycling cached view at index ", "RecyclerView");
            }
            ArrayList arrayList = this.mCachedViews;
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + viewHolder);
            }
            addViewHolderToRecycledViewPool(viewHolder, true);
            arrayList.remove(i);
        }

        public final void recycleView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean isTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            recycleViewHolderInternal(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.endAnimation(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
        
            r5 = r5 - 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void recycleViewHolderInternal(ViewHolder viewHolder) {
            boolean z;
            RecyclerView recyclerView = RecyclerView.this;
            CircularIntArray circularIntArray = recyclerView.mPrefetchRegistry;
            boolean z2 = true;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(viewHolder.isScrap());
                sb.append(" isAttached:");
                sb.append(viewHolder.itemView.getParent() != null);
                sb.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(viewHolder);
                Path$$ExternalSyntheticBUOutline0.m(sb2, (Object) recyclerView.exceptionLabel());
                return;
            }
            if (viewHolder.shouldIgnore()) {
                a$$ExternalSyntheticBUOutline0.m$3("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.exceptionLabel()));
                return;
            }
            boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.mAdapter;
            boolean z3 = adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder);
            boolean z4 = RecyclerView.sDebugAssertionsEnabled;
            ArrayList arrayList = this.mCachedViews;
            if (z4 && arrayList.contains(viewHolder)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(viewHolder);
                Path$$ExternalSyntheticBUOutline0.m(sb3, (Object) recyclerView.exceptionLabel());
                return;
            }
            if (z3 || viewHolder.isRecyclable()) {
                if (this.mViewCacheMax <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.mViewCacheMax && size > 0) {
                        recycleCachedViewAt(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        int i = viewHolder.mPosition;
                        if (circularIntArray.elements != null) {
                            int i2 = circularIntArray.capacityBitmask * 2;
                            for (int i3 = 0; i3 < i2; i3 += 2) {
                                if (circularIntArray.elements[i3] == i) {
                                    break;
                                }
                            }
                        }
                        int i4 = size - 1;
                        loop1: while (i4 >= 0) {
                            int i5 = ((ViewHolder) arrayList.get(i4)).mPosition;
                            if (circularIntArray.elements == null) {
                                break;
                            }
                            int i6 = circularIntArray.capacityBitmask * 2;
                            for (int i7 = 0; i7 < i6; i7 += 2) {
                                if (circularIntArray.elements[i7] == i5) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i4 + 1;
                    }
                    arrayList.add(size, viewHolder);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    addViewHolderToRecycledViewPool(viewHolder, true);
                }
                r3 = z;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.exceptionLabel()));
                }
                z2 = false;
            }
            recyclerView.mViewInfoStore.removeViewHolder(viewHolder);
            if (r3 || z2 || !doesTransientStatePreventRecycling) {
                return;
            }
            Countries.callPoolingContainerOnRelease(viewHolder.itemView);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
        }

        public final void scrapView(View view) {
            ItemAnimator itemAnimator;
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && (itemAnimator = recyclerView.mItemAnimator) != null) {
                DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) itemAnimator;
                if (childViewHolderInt.getUnmodifiedPayloads().isEmpty() && defaultItemAnimator.mSupportsChangeAnimations && !childViewHolderInt.isInvalid()) {
                    if (this.mChangedScrap == null) {
                        this.mChangedScrap = new ArrayList();
                    }
                    childViewHolderInt.setScrapContainer(this, true);
                    this.mChangedScrap.add(childViewHolderInt);
                    return;
                }
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                a$$ExternalSyntheticBUOutline0.m$3("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.exceptionLabel()));
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.mAttachedScrap.add(childViewHolderInt);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:186:0x0481, code lost:
        
            if ((r13 + r11) >= r30) goto L241;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0404  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0521  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0545 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0472  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x04a3  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x04be  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x0516  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x049b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x03eb  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewHolder tryGetViewHolderForPositionByDeadline(int i, long j) {
            ViewHolder viewHolder;
            int i2;
            int i3;
            long j2;
            long j3;
            int i4;
            long j4;
            AccessibilityManager accessibilityManager;
            int i5;
            int i6;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView findNestedRecyclerView;
            ViewHolder viewHolder2;
            View view;
            int i7;
            int size;
            int findPositionOffset;
            RecyclerView recyclerView = RecyclerView.this;
            State state = recyclerView.mState;
            if (i < 0 || i >= state.getItemCount()) {
                StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i, "Invalid item position ", "(", "). Item count:");
                m107m.append(state.getItemCount());
                m107m.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(m107m.toString());
            }
            if (state.mInPreLayout) {
                ArrayList arrayList = this.mChangedScrap;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            viewHolder = (ViewHolder) this.mChangedScrap.get(i8);
                            if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                                viewHolder.addFlags(32);
                                break;
                            }
                            i8++;
                        } else if (recyclerView.mAdapter.hasStableIds() && (findPositionOffset = recyclerView.mAdapterHelper.findPositionOffset(i, 0)) > 0 && findPositionOffset < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(findPositionOffset);
                            for (int i9 = 0; i9 < size; i9++) {
                                ViewHolder viewHolder3 = (ViewHolder) this.mChangedScrap.get(i9);
                                if (!viewHolder3.wasReturnedFromScrap() && viewHolder3.getItemId() == itemId) {
                                    viewHolder3.addFlags(32);
                                    viewHolder = viewHolder3;
                                    break;
                                }
                            }
                        }
                    }
                    if (viewHolder != null) {
                        i2 = 1;
                        ArrayList arrayList2 = this.mAttachedScrap;
                        ArrayList arrayList3 = this.mCachedViews;
                        if (viewHolder != null) {
                            int size2 = arrayList2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ViewHolder viewHolder4 = (ViewHolder) arrayList2.get(i10);
                                if (!viewHolder4.wasReturnedFromScrap() && viewHolder4.getLayoutPosition() == i && !viewHolder4.isInvalid() && (state.mInPreLayout || !viewHolder4.isRemoved())) {
                                    viewHolder4.addFlags(32);
                                    viewHolder = viewHolder4;
                                    i3 = 1;
                                    break;
                                }
                            }
                            ArrayList arrayList4 = (ArrayList) recyclerView.mChildHelper.currentThread;
                            int size3 = arrayList4.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size3) {
                                    i3 = 1;
                                    view = null;
                                    break;
                                }
                                view = (View) arrayList4.get(i11);
                                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                                i3 = 1;
                                if (childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                    break;
                                }
                                i11++;
                            }
                            if (view == null) {
                                int size4 = arrayList3.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size4) {
                                        viewHolder = null;
                                        break;
                                    }
                                    ViewHolder viewHolder5 = (ViewHolder) arrayList3.get(i12);
                                    if (viewHolder5.isInvalid() || viewHolder5.getLayoutPosition() != i || viewHolder5.isAttachedToTransitionOverlay()) {
                                        i12++;
                                    } else {
                                        arrayList3.remove(i12);
                                        if (RecyclerView.sVerboseLoggingEnabled) {
                                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + viewHolder5);
                                        }
                                        viewHolder = viewHolder5;
                                    }
                                }
                            } else {
                                ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                                TraceParser traceParser = recyclerView.mChildHelper;
                                HeadersReader headersReader = (HeadersReader) traceParser.projectPackages;
                                int indexOfChild = RecyclerView.this.indexOfChild(view);
                                if (indexOfChild < 0) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) view, "view is not a child, cannot hide ");
                                    return null;
                                }
                                if (!headersReader.get(indexOfChild)) {
                                    JWK$$ExternalSyntheticBUOutline0.m(view, "trying to unhide a view that was not hidden");
                                    return null;
                                }
                                headersReader.clear(indexOfChild);
                                traceParser.unhideViewInternal(view);
                                TraceParser traceParser2 = recyclerView.mChildHelper;
                                HeadersReader headersReader2 = (HeadersReader) traceParser2.projectPackages;
                                int indexOfChild2 = RecyclerView.this.indexOfChild(view);
                                int countOnesBefore = (indexOfChild2 == -1 || headersReader2.get(indexOfChild2)) ? -1 : indexOfChild2 - headersReader2.countOnesBefore(indexOfChild2);
                                if (countOnesBefore == -1) {
                                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb.append(childViewHolderInt2);
                                    a$$ExternalSyntheticBUOutline0.m(sb, (Object) recyclerView.exceptionLabel());
                                    return null;
                                }
                                recyclerView.mChildHelper.detachViewFromParent(countOnesBefore);
                                scrapView(view);
                                childViewHolderInt2.addFlags(8224);
                                viewHolder = childViewHolderInt2;
                            }
                            if (viewHolder != null) {
                                if (!viewHolder.isRemoved()) {
                                    int i13 = viewHolder.mPosition;
                                    if (i13 < 0 || i13 >= recyclerView.mAdapter.getItemCount()) {
                                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + recyclerView.exceptionLabel());
                                    }
                                    i7 = ((state.mInPreLayout || recyclerView.mAdapter.getItemViewType(viewHolder.mPosition) == viewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || viewHolder.getItemId() == recyclerView.mAdapter.getItemId(viewHolder.mPosition))) ? i3 : 0;
                                } else {
                                    if (RecyclerView.sDebugAssertionsEnabled && !state.mInPreLayout) {
                                        a$$ExternalSyntheticBUOutline0.m$1("should not receive a removed view unless it is pre layout".concat(recyclerView.exceptionLabel()));
                                        return null;
                                    }
                                    i7 = state.mInPreLayout;
                                }
                                if (i7 == 0) {
                                    viewHolder.addFlags(4);
                                    if (viewHolder.isScrap()) {
                                        recyclerView.removeDetachedView(viewHolder.itemView, false);
                                        viewHolder.unScrap();
                                    } else if (viewHolder.wasReturnedFromScrap()) {
                                        viewHolder.clearReturnedFromScrapFlag();
                                    }
                                    recycleViewHolderInternal(viewHolder);
                                    viewHolder = null;
                                } else {
                                    i2 = i3;
                                }
                            }
                        } else {
                            i3 = 1;
                        }
                        if (viewHolder != null) {
                            int findPositionOffset2 = recyclerView.mAdapterHelper.findPositionOffset(i, 0);
                            if (findPositionOffset2 >= 0) {
                                j2 = 3;
                                if (findPositionOffset2 < recyclerView.mAdapter.getItemCount()) {
                                    int itemViewType = recyclerView.mAdapter.getItemViewType(findPositionOffset2);
                                    if (recyclerView.mAdapter.hasStableIds()) {
                                        long itemId2 = recyclerView.mAdapter.getItemId(findPositionOffset2);
                                        int size5 = arrayList2.size() - 1;
                                        while (true) {
                                            if (size5 >= 0) {
                                                ViewHolder viewHolder6 = (ViewHolder) arrayList2.get(size5);
                                                if (viewHolder6.getItemId() == itemId2 && !viewHolder6.wasReturnedFromScrap()) {
                                                    j3 = 4;
                                                    if (itemViewType == viewHolder6.getItemViewType()) {
                                                        viewHolder6.addFlags(32);
                                                        if (viewHolder6.isRemoved() && !state.mInPreLayout) {
                                                            viewHolder6.setFlags(2, 14);
                                                        }
                                                        viewHolder = viewHolder6;
                                                    } else {
                                                        arrayList2.remove(size5);
                                                        recyclerView.removeDetachedView(viewHolder6.itemView, false);
                                                        ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(viewHolder6.itemView);
                                                        childViewHolderInt3.mScrapContainer = null;
                                                        childViewHolderInt3.mInChangeScrap = false;
                                                        childViewHolderInt3.clearReturnedFromScrapFlag();
                                                        recycleViewHolderInternal(childViewHolderInt3);
                                                    }
                                                }
                                                size5--;
                                            } else {
                                                j3 = 4;
                                                int size6 = arrayList3.size() - 1;
                                                while (true) {
                                                    if (size6 < 0) {
                                                        break;
                                                    }
                                                    ViewHolder viewHolder7 = (ViewHolder) arrayList3.get(size6);
                                                    if (viewHolder7.getItemId() != itemId2 || viewHolder7.isAttachedToTransitionOverlay()) {
                                                        size6--;
                                                    } else if (itemViewType == viewHolder7.getItemViewType()) {
                                                        arrayList3.remove(size6);
                                                        viewHolder = viewHolder7;
                                                    } else {
                                                        recycleCachedViewAt(size6);
                                                    }
                                                }
                                                viewHolder = null;
                                            }
                                        }
                                        if (viewHolder != null) {
                                            viewHolder.mPosition = findPositionOffset2;
                                            i2 = i3;
                                        }
                                    } else {
                                        j3 = 4;
                                    }
                                    if (viewHolder == null) {
                                        if (RecyclerView.sVerboseLoggingEnabled) {
                                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                                        }
                                        RecycledViewPool.ScrapData scrapData = (RecycledViewPool.ScrapData) getRecycledViewPool().mScrap.get(itemViewType);
                                        if (scrapData != null) {
                                            ArrayList arrayList5 = scrapData.mScrapHeap;
                                            if (!arrayList5.isEmpty()) {
                                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                    if (!((ViewHolder) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                                        viewHolder2 = (ViewHolder) arrayList5.remove(size7);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        viewHolder2 = null;
                                        if (viewHolder2 != null) {
                                            viewHolder2.resetInternal();
                                            boolean z = RecyclerView.sDebugAssertionsEnabled;
                                        }
                                        viewHolder = viewHolder2;
                                    }
                                    if (viewHolder == null) {
                                        long nanoTime = recyclerView.getNanoTime();
                                        if (j != Long.MAX_VALUE) {
                                            long j5 = this.mRecyclerPool.getScrapDataForType(itemViewType).mCreateRunningAverageNs;
                                            if (j5 != 0 && j5 + nanoTime >= j) {
                                                return null;
                                            }
                                        }
                                        ViewHolder createViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(createViewHolder.itemView)) != null) {
                                            createViewHolder.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        RecycledViewPool.ScrapData scrapDataForType = this.mRecyclerPool.getScrapDataForType(itemViewType);
                                        long j6 = scrapDataForType.mCreateRunningAverageNs;
                                        if (j6 != 0) {
                                            nanoTime2 = (nanoTime2 / j3) + ((j6 / j3) * 3);
                                        }
                                        scrapDataForType.mCreateRunningAverageNs = nanoTime2;
                                        if (RecyclerView.sVerboseLoggingEnabled) {
                                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                        }
                                        viewHolder = createViewHolder;
                                    }
                                }
                            }
                            StringBuilder m107m2 = Recorder$$ExternalSyntheticOutline2.m107m(i, findPositionOffset2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                            m107m2.append(state.getItemCount());
                            m107m2.append(recyclerView.exceptionLabel());
                            throw new IndexOutOfBoundsException(m107m2.toString());
                        }
                        j2 = 3;
                        j3 = 4;
                        if (i2 != 0 && !state.mInPreLayout && viewHolder.hasAnyOfTheFlags(PKIFailureInfo.certRevoked)) {
                            viewHolder.setFlags(0, PKIFailureInfo.certRevoked);
                            if (state.mRunSimpleAnimations) {
                                ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder);
                                ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                                viewHolder.getUnmodifiedPayloads();
                                itemAnimator.getClass();
                                Viewport viewport = new Viewport();
                                viewport.setFrom(viewHolder);
                                recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolder, viewport);
                            }
                        }
                        if (!state.mInPreLayout && viewHolder.isBound()) {
                            viewHolder.mPreLayoutPosition = i;
                        } else if (viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                            if (!RecyclerView.sDebugAssertionsEnabled && viewHolder.isRemoved()) {
                                StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                                sb2.append(viewHolder);
                                a$$ExternalSyntheticBUOutline0.m(sb2, (Object) recyclerView.exceptionLabel());
                                return null;
                            }
                            int findPositionOffset3 = recyclerView.mAdapterHelper.findPositionOffset(i, 0);
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = recyclerView;
                            int itemViewType2 = viewHolder.getItemViewType();
                            long nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j7 = this.mRecyclerPool.getScrapDataForType(itemViewType2).mBindRunningAverageNs;
                                if (j7 != 0) {
                                }
                            }
                            if (viewHolder.isTmpDetached()) {
                                i4 = 0;
                            } else {
                                recyclerView.attachViewToParent(viewHolder.itemView, recyclerView.getChildCount(), viewHolder.itemView.getLayoutParams());
                                i4 = i3;
                            }
                            recyclerView.mAdapter.bindViewHolder(viewHolder, findPositionOffset3);
                            if (i4 != 0) {
                                recyclerView.detachViewFromParent(viewHolder.itemView);
                            }
                            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                            RecycledViewPool.ScrapData scrapDataForType2 = this.mRecyclerPool.getScrapDataForType(viewHolder.getItemViewType());
                            j4 = scrapDataForType2.mBindRunningAverageNs;
                            if (j4 != 0) {
                                nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                            }
                            scrapDataForType2.mBindRunningAverageNs = nanoTime4;
                            accessibilityManager = recyclerView.mAccessibilityManager;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                View view2 = viewHolder.itemView;
                                if (view2.getImportantForAccessibility() == 0) {
                                    i5 = i3;
                                    view2.setImportantForAccessibility(i5);
                                } else {
                                    i5 = i3;
                                }
                                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                                if (recyclerViewAccessibilityDelegate != null) {
                                    FailoverFragment.f fVar = recyclerViewAccessibilityDelegate.mItemDelegate;
                                    if (fVar != null) {
                                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                        View.AccessibilityDelegate accessibilityDelegate = ViewCompat.Api29Impl.getAccessibilityDelegate(view2);
                                        AccessibilityDelegateCompat accessibilityDelegateCompat = accessibilityDelegate != null ? accessibilityDelegate instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegate).mCompat : new AccessibilityDelegateCompat(accessibilityDelegate) : null;
                                        if (accessibilityDelegateCompat != null && accessibilityDelegateCompat != fVar) {
                                            ((WeakHashMap) fVar.b).put(view2, accessibilityDelegateCompat);
                                        }
                                    }
                                    ViewCompat.setAccessibilityDelegate(view2, fVar);
                                }
                            } else {
                                i5 = i3;
                            }
                            if (state.mInPreLayout) {
                                viewHolder.mPreLayoutPosition = i;
                            }
                            i6 = i5;
                            layoutParams = viewHolder.itemView.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                                viewHolder.itemView.setLayoutParams(layoutParams2);
                            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                layoutParams2 = (LayoutParams) layoutParams;
                            } else {
                                layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                                viewHolder.itemView.setLayoutParams(layoutParams2);
                            }
                            layoutParams2.mViewHolder = viewHolder;
                            layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? 0 : i5;
                            return viewHolder;
                        }
                        i6 = 0;
                        i5 = i3;
                        layoutParams = viewHolder.itemView.getLayoutParams();
                        if (layoutParams == null) {
                        }
                        layoutParams2.mViewHolder = viewHolder;
                        layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? 0 : i5;
                        return viewHolder;
                    }
                }
                viewHolder = null;
                if (viewHolder != null) {
                }
            } else {
                viewHolder = null;
            }
            i2 = 0;
            ArrayList arrayList22 = this.mAttachedScrap;
            ArrayList arrayList32 = this.mCachedViews;
            if (viewHolder != null) {
            }
            if (viewHolder != null) {
            }
            if (i2 != 0) {
                viewHolder.setFlags(0, PKIFailureInfo.certRevoked);
                if (state.mRunSimpleAnimations) {
                }
            }
            if (!state.mInPreLayout) {
            }
            if (viewHolder.isBound()) {
            }
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            int findPositionOffset32 = recyclerView.mAdapterHelper.findPositionOffset(i, 0);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = recyclerView;
            int itemViewType22 = viewHolder.getItemViewType();
            long nanoTime32 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
            }
            if (viewHolder.isTmpDetached()) {
            }
            recyclerView.mAdapter.bindViewHolder(viewHolder, findPositionOffset32);
            if (i4 != 0) {
            }
            long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
            RecycledViewPool.ScrapData scrapDataForType22 = this.mRecyclerPool.getScrapDataForType(viewHolder.getItemViewType());
            j4 = scrapDataForType22.mBindRunningAverageNs;
            if (j4 != 0) {
            }
            scrapDataForType22.mBindRunningAverageNs = nanoTime42;
            accessibilityManager = recyclerView.mAccessibilityManager;
            if (accessibilityManager == null) {
            }
            i5 = i3;
            if (state.mInPreLayout) {
            }
            i6 = i5;
            layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            layoutParams2.mViewHolder = viewHolder;
            layoutParams2.mPendingInvalidate = (i2 != 0 || i6 == 0) ? 0 : i5;
            return viewHolder;
        }

        public final void unscrapView(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.mChangedScrap.remove(viewHolder);
            } else {
                this.mAttachedScrap.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public final void updateViewCacheSize() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.mViewCacheMax = this.mRequestedCacheMax + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            ArrayList arrayList = this.mCachedViews;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.mViewCacheMax; size--) {
                recycleCachedViewAt(size);
            }
        }
    }

    public interface RecyclerListener {
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(6);
        public Parcelable mLayoutState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mLayoutState = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }
    }

    public abstract class SmoothScroller {
        public LayoutManager mLayoutManager;
        public boolean mPendingInitialRun;
        public RecyclerView mRecyclerView;
        public final Action mRecyclingAction;
        public boolean mRunning;
        public boolean mStarted;
        public int mTargetPosition = -1;
        public View mTargetView;

        public final class Action {
            public boolean mChanged;
            public int mConsecutiveUpdates;
            public int mDuration;
            public int mDx;
            public int mDy;
            public Interpolator mInterpolator;
            public int mJumpToPosition;

            public final void runIfNecessary(RecyclerView recyclerView) {
                int i = this.mJumpToPosition;
                if (i >= 0) {
                    this.mJumpToPosition = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.mChanged = false;
                    return;
                }
                if (!this.mChanged) {
                    this.mConsecutiveUpdates = 0;
                    return;
                }
                Interpolator interpolator = this.mInterpolator;
                if (interpolator != null && this.mDuration < 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("If you provide an interpolator, you must set a positive duration");
                    return;
                }
                int i2 = this.mDuration;
                if (i2 < 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("Scroll duration must be a positive number");
                    return;
                }
                recyclerView.mViewFlinger.smoothScrollBy(this.mDx, this.mDy, i2, interpolator);
                int i3 = this.mConsecutiveUpdates + 1;
                this.mConsecutiveUpdates = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.mChanged = false;
            }
        }

        public interface ScrollVectorProvider {
            PointF computeScrollVectorForPosition(int i);
        }

        public SmoothScroller() {
            Action action = new Action();
            action.mJumpToPosition = -1;
            action.mChanged = false;
            action.mConsecutiveUpdates = 0;
            action.mDx = 0;
            action.mDy = 0;
            action.mDuration = PKIFailureInfo.systemUnavail;
            action.mInterpolator = null;
            this.mRecyclingAction = action;
        }

        public PointF computeScrollVectorForPosition(int i) {
            Object obj = this.mLayoutManager;
            if (obj instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) obj).computeScrollVectorForPosition(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public final void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != RecyclerView.DECELERATION_RATE || computeScrollVectorForPosition.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            Action action = this.mRecyclingAction;
            if (view != null) {
                this.mRecyclerView.getClass();
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if ((childViewHolderInt != null ? childViewHolderInt.getLayoutPosition() : -1) == this.mTargetPosition) {
                    View view2 = this.mTargetView;
                    State state = recyclerView.mState;
                    onTargetFound(view2, action);
                    action.runIfNecessary(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                State state2 = recyclerView.mState;
                LinearSmoothScroller linearSmoothScroller = (LinearSmoothScroller) this;
                if (linearSmoothScroller.mRecyclerView.mLayout.getChildCount() == 0) {
                    linearSmoothScroller.stop();
                } else {
                    int i3 = linearSmoothScroller.mInterimTargetDx;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    linearSmoothScroller.mInterimTargetDx = i4;
                    int i5 = linearSmoothScroller.mInterimTargetDy;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    linearSmoothScroller.mInterimTargetDy = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF computeScrollVectorForPosition2 = linearSmoothScroller.computeScrollVectorForPosition(linearSmoothScroller.mTargetPosition);
                        if (computeScrollVectorForPosition2 != null) {
                            if (computeScrollVectorForPosition2.x != RecyclerView.DECELERATION_RATE || computeScrollVectorForPosition2.y != RecyclerView.DECELERATION_RATE) {
                                float f2 = computeScrollVectorForPosition2.y;
                                float sqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                                float f3 = computeScrollVectorForPosition2.x / sqrt;
                                computeScrollVectorForPosition2.x = f3;
                                float f4 = computeScrollVectorForPosition2.y / sqrt;
                                computeScrollVectorForPosition2.y = f4;
                                linearSmoothScroller.mTargetVector = computeScrollVectorForPosition2;
                                linearSmoothScroller.mInterimTargetDx = (int) (f3 * 10000.0f);
                                linearSmoothScroller.mInterimTargetDy = (int) (f4 * 10000.0f);
                                int calculateTimeForScrolling = linearSmoothScroller.calculateTimeForScrolling(10000);
                                action.mDx = (int) (linearSmoothScroller.mInterimTargetDx * 1.2f);
                                action.mDy = (int) (linearSmoothScroller.mInterimTargetDy * 1.2f);
                                action.mDuration = (int) (calculateTimeForScrolling * 1.2f);
                                action.mInterpolator = linearSmoothScroller.mLinearInterpolator;
                                action.mChanged = true;
                            }
                        }
                        action.mJumpToPosition = linearSmoothScroller.mTargetPosition;
                        linearSmoothScroller.stop();
                    }
                }
                boolean z = action.mJumpToPosition >= 0;
                action.runIfNecessary(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.postOnAnimation();
                }
            }
        }

        public abstract void onTargetFound(View view, Action action);

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                LinearSmoothScroller linearSmoothScroller = (LinearSmoothScroller) this;
                linearSmoothScroller.mInterimTargetDy = 0;
                linearSmoothScroller.mInterimTargetDx = 0;
                linearSmoothScroller.mTargetVector = null;
                this.mRecyclerView.mState.mTargetPosition = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                LayoutManager layoutManager = this.mLayoutManager;
                if (layoutManager.mSmoothScroller == this) {
                    layoutManager.mSmoothScroller = null;
                }
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    public final class State {
        public int mDeletedInvisibleItemCountSincePreviousLayout;
        public long mFocusedItemId;
        public int mFocusedItemPosition;
        public int mFocusedSubChildId;
        public boolean mInPreLayout;
        public boolean mIsMeasuring;
        public int mItemCount;
        public int mLayoutStep;
        public int mPreviousLayoutItemCount;
        public boolean mRunPredictiveAnimations;
        public boolean mRunSimpleAnimations;
        public boolean mStructureChanged;
        public int mTargetPosition;
        public boolean mTrackOldChangeHolders;

        public final void assertLayoutStep(int i) {
            if ((this.mLayoutStep & i) != 0) {
                return;
            }
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m$1("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.mLayoutStep));
        }

        public final int getItemCount() {
            return this.mInPreLayout ? this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout : this.mItemCount;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.mTargetPosition);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.mItemCount);
            sb.append(", mIsMeasuring=");
            sb.append(this.mIsMeasuring);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.mPreviousLayoutItemCount);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.mDeletedInvisibleItemCountSincePreviousLayout);
            sb.append(", mStructureChanged=");
            sb.append(this.mStructureChanged);
            sb.append(", mInPreLayout=");
            sb.append(this.mInPreLayout);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.mRunSimpleAnimations);
            sb.append(", mRunPredictiveAnimations=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mRunPredictiveAnimations, '}');
        }
    }

    public final class StretchEdgeEffectFactory extends EdgeEffectFactory {
    }

    public abstract class ViewCacheExtension {
    }

    public final class ViewFlinger implements Runnable {
        public boolean mEatRunOnAnimationRequest;
        public Interpolator mInterpolator;
        public int mLastFlingX;
        public int mLastFlingY;
        public OverScroller mOverScroller;
        public boolean mReSchedulePostAnimationCallback;

        public ViewFlinger() {
            ViewPager.AnonymousClass2 anonymousClass2 = RecyclerView.sQuinticInterpolator;
            this.mInterpolator = anonymousClass2;
            this.mEatRunOnAnimationRequest = false;
            this.mReSchedulePostAnimationCallback = false;
            this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), anonymousClass2);
        }

        public final void fling(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            Interpolator interpolator = this.mInterpolator;
            ViewPager.AnonymousClass2 anonymousClass2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != anonymousClass2) {
                this.mInterpolator = anonymousClass2;
                this.mOverScroller = new OverScroller(recyclerView.getContext(), anonymousClass2);
            }
            this.mOverScroller.fling(0, 0, i, i2, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
            postOnAnimation();
        }

        public final void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            recyclerView.postOnAnimation(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            int[] iArr = recyclerView.mReusableIntPair;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.mOverScroller.abortAnimation();
                return;
            }
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.mOverScroller;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.mLastFlingX;
                int i4 = currY - this.mLastFlingY;
                this.mLastFlingX = currX;
                this.mLastFlingY = currY;
                int consumeFlingInStretch = RecyclerView.consumeFlingInStretch(i3, recyclerView.mLeftGlow, recyclerView.mRightGlow, recyclerView.getWidth());
                int consumeFlingInStretch2 = RecyclerView.consumeFlingInStretch(i4, recyclerView.mTopGlow, recyclerView.mBottomGlow, recyclerView.getHeight());
                int[] iArr2 = recyclerView.mReusableIntPair;
                iArr2[0] = 0;
                iArr2[1] = 0;
                if (recyclerView.getScrollingChildHelper().dispatchNestedPreScroll(consumeFlingInStretch, iArr2, consumeFlingInStretch2, 1, null)) {
                    consumeFlingInStretch -= iArr[0];
                    consumeFlingInStretch2 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(consumeFlingInStretch, consumeFlingInStretch2);
                }
                if (recyclerView.mAdapter != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.scrollStep(consumeFlingInStretch, consumeFlingInStretch2, iArr);
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    consumeFlingInStretch -= i5;
                    consumeFlingInStretch2 -= i6;
                    LinearSmoothScroller linearSmoothScroller = recyclerView.mLayout.mSmoothScroller;
                    if (linearSmoothScroller != null && !linearSmoothScroller.mPendingInitialRun && linearSmoothScroller.mRunning) {
                        int itemCount = recyclerView.mState.getItemCount();
                        if (itemCount == 0) {
                            linearSmoothScroller.stop();
                        } else if (linearSmoothScroller.mTargetPosition >= itemCount) {
                            linearSmoothScroller.mTargetPosition = itemCount - 1;
                            linearSmoothScroller.onAnimation(i5, i6);
                        } else {
                            linearSmoothScroller.onAnimation(i5, i6);
                        }
                    }
                    i = i5;
                    i2 = i6;
                } else {
                    i = 0;
                    i2 = 0;
                }
                int i7 = consumeFlingInStretch;
                int i8 = consumeFlingInStretch2;
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.getScrollingChildHelper().dispatchNestedScrollInternal(i, null, i2, i7, i8, iArr3, 1);
                int i9 = i;
                int i10 = i2;
                int i11 = i7 - iArr[0];
                int i12 = i8 - iArr[1];
                if (i9 != 0 || i10 != 0) {
                    recyclerView.dispatchOnScrolled(i9, i10);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                LinearSmoothScroller linearSmoothScroller2 = recyclerView.mLayout.mSmoothScroller;
                if ((linearSmoothScroller2 == null || !linearSmoothScroller2.mPendingInitialRun) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        if (i13 < 0) {
                            recyclerView.ensureLeftGlow();
                            if (recyclerView.mLeftGlow.isFinished()) {
                                recyclerView.mLeftGlow.onAbsorb(-i13);
                            }
                        } else if (i13 > 0) {
                            recyclerView.ensureRightGlow();
                            if (recyclerView.mRightGlow.isFinished()) {
                                recyclerView.mRightGlow.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.ensureTopGlow();
                            if (recyclerView.mTopGlow.isFinished()) {
                                recyclerView.mTopGlow.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.ensureBottomGlow();
                            if (recyclerView.mBottomGlow.isFinished()) {
                                recyclerView.mBottomGlow.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        CircularIntArray circularIntArray = recyclerView.mPrefetchRegistry;
                        int[] iArr4 = circularIntArray.elements;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        circularIntArray.capacityBitmask = 0;
                    }
                } else {
                    postOnAnimation();
                    GapWorker gapWorker = recyclerView.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.postFromTraversal(recyclerView, i9, i10);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    Api35Impl.setFrameContentVelocity(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            LinearSmoothScroller linearSmoothScroller3 = recyclerView.mLayout.mSmoothScroller;
            if (linearSmoothScroller3 != null && linearSmoothScroller3.mPendingInitialRun) {
                linearSmoothScroller3.onAnimation(0, 0);
            }
            this.mEatRunOnAnimationRequest = false;
            if (!this.mReSchedulePostAnimationCallback) {
                recyclerView.setScrollState(0);
                recyclerView.getScrollingChildHelper().stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                recyclerView.postOnAnimation(this);
            }
        }

        public final void smoothScrollBy(int i, int i2, int i3, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                this.mOverScroller = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            recyclerView.setScrollState(2);
            this.mOverScroller.startScroll(0, 0, i, i2, i4);
            postOnAnimation();
        }
    }

    public abstract class ViewHolder {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        public final View itemView;
        Adapter mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("itemView may not be null");
                throw null;
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                if (this.mPayloads == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPayloads = arrayList;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
                }
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.mAdapter) == null || (adapterPositionInRecyclerView = recyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (this.mFlags & i) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            if (!recyclerView.isComputingLayout()) {
                this.itemView.setImportantForAccessibility(4);
            } else {
                this.mPendingAccessibilityState = 4;
                recyclerView.mPendingAccessibilityImportanceChange.add(this);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.isComputingLayout()) {
                this.mPendingAccessibilityState = i;
                recyclerView.mPendingAccessibilityImportanceChange.add(this);
            } else {
                this.itemView.setImportantForAccessibility(i);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
                return;
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    JWK$$ExternalSyntheticBUOutline0.m(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    return;
                } else {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public String toString() {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            m108m.append(Integer.toHexString(hashCode()));
            m108m.append(" position=");
            m108m.append(this.mPosition);
            m108m.append(" id=");
            m108m.append(this.mItemId);
            m108m.append(", oldPos=");
            m108m.append(this.mOldPosition);
            m108m.append(", pLpos:");
            m108m.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(m108m.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new ViewPager.AnonymousClass2(4);
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$1] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.recyclerview.widget.RecyclerView$1] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c;
        boolean z;
        char c2;
        TypedArray typedArray;
        int i2;
        Constructor constructor;
        Object[] objArr;
        final int i3 = 1;
        this.mObserver = new CashRecyclerView$observer$1(this, i3);
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new CallResult(13);
        final int i4 = 0;
        this.mUpdateChildViewsRunnable = new Runnable(this) { // from class: androidx.recyclerview.widget.RecyclerView.1
            public final /* synthetic */ RecyclerView this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                RecyclerView recyclerView = this.this$0;
                switch (i5) {
                    case 0:
                        if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                            if (!recyclerView.mIsAttached) {
                                recyclerView.requestLayout();
                                break;
                            } else if (!recyclerView.mLayoutSuppressed) {
                                recyclerView.consumePendingUpdateOperations();
                                break;
                            } else {
                                recyclerView.mLayoutWasDefered = true;
                                break;
                            }
                        }
                        break;
                    default:
                        ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                        if (itemAnimator != null) {
                            itemAnimator.runPendingAnimations();
                        }
                        recyclerView.mPostedAnimatorRunner = false;
                        break;
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new CircularIntArray() : null;
        State state = new State();
        state.mTargetPosition = -1;
        state.mPreviousLayoutItemCount = 0;
        state.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        state.mLayoutStep = 1;
        state.mItemCount = 0;
        state.mStructureChanged = false;
        state.mInPreLayout = false;
        state.mTrackOldChangeHolders = false;
        state.mIsMeasuring = false;
        state.mRunSimpleAnimations = false;
        state.mRunPredictiveAnimations = false;
        this.mState = state;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        this.mItemAnimatorListener = anonymousClass7;
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable(this) { // from class: androidx.recyclerview.widget.RecyclerView.1
            public final /* synthetic */ RecyclerView this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                RecyclerView recyclerView = this.this$0;
                switch (i5) {
                    case 0:
                        if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                            if (!recyclerView.mIsAttached) {
                                recyclerView.requestLayout();
                                break;
                            } else if (!recyclerView.mLayoutSuppressed) {
                                recyclerView.consumePendingUpdateOperations();
                                break;
                            } else {
                                recyclerView.mLayoutWasDefered = true;
                                break;
                            }
                        }
                        break;
                    default:
                        ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                        if (itemAnimator != null) {
                            itemAnimator.runPendingAnimations();
                        }
                        recyclerView.mPostedAnimatorRunner = false;
                        break;
                }
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new AnonymousClass7();
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(getContext(), new AnonymousClass7());
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mListener = anonymousClass7;
        this.mAdapterHelper = new AdapterHelper(new AnonymousClass7());
        this.mChildHelper = new TraceParser(new AnonymousClass7());
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        if (ViewCompat.Api26Impl.getImportantForAutofill(this) == 0) {
            ViewCompat.Api26Impl.setImportantForAutofill(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = R$styleable.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string2 = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Trying to set fast scroller without both required drawables.".concat(exceptionLabel()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = 4;
            new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.squareup.cash.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.squareup.cash.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.squareup.cash.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            z = 1;
            c2 = 2;
            typedArray = obtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string2 != null) {
            String trim = string2.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, context.getClassLoader()).asSubclass(LayoutManager.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[z] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m((Object) attributeSet.getPositionDescription(), (Object) ": Class is not a LayoutManager ", (Object) str, (Throwable) e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m((Object) attributeSet.getPositionDescription(), (Object) ": Unable to find LayoutManager ", (Object) str, (Throwable) e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m((Object) attributeSet.getPositionDescription(), (Object) ": Cannot access non-public constructor ", (Object) str, (Throwable) e5);
                    throw null;
                } catch (InstantiationException e6) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m((Object) attributeSet.getPositionDescription(), (Object) ": Could not instantiate the LayoutManager: ", (Object) str, (Throwable) e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m((Object) attributeSet.getPositionDescription(), (Object) ": Could not instantiate the LayoutManager: ", (Object) str, (Throwable) e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.squareup.cash.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static void clearNestedRecyclerViewIfNotNested(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    public static int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || EdgeEffectCompat.getDistance(edgeEffect2) == DECELERATION_RATE) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(Rect rect, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public final void addAnimatingView(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.unscrapView(getChildViewHolder(view));
        boolean isTmpDetached = viewHolder.isTmpDetached();
        TraceParser traceParser = this.mChildHelper;
        if (isTmpDetached) {
            traceParser.attachViewToParent(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            traceParser.addView(view, -1, true);
            return;
        }
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild < 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) view, "view is not a child, cannot hide ");
        } else {
            ((HeadersReader) traceParser.projectPackages).set(indexOfChild);
            traceParser.hideViewInternal(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void addItemDecoration(ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.mItemDecorations;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(itemDecoration);
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public final void addOnScrollListener(OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public final void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(exceptionLabel()));
            }
        } else if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(exceptionLabel()));
        } else {
            a$$ExternalSyntheticBUOutline0.m$1(str);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public final void clearOldPositions() {
        TraceParser traceParser = this.mChildHelper;
        int unfilteredChildCount = traceParser.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getUnfilteredChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.mAttachedScrap;
        ArrayList arrayList2 = recycler.mCachedViews;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = recycler.mChangedScrap;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) recycler.mChangedScrap.get(i4)).clearOldPosition();
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public final void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection("RV FullInvalidate");
            dispatchLayout();
            Trace.endSection();
            return;
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        if (adapterHelper.hasPendingUpdates()) {
            int i = adapterHelper.mExistingUpdateTypes;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (adapterHelper.hasPendingUpdates()) {
                    Trace.beginSection("RV FullInvalidate");
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            adapterHelper.preProcess();
            if (!this.mLayoutWasDefered) {
                TraceParser traceParser = this.mChildHelper;
                int childCount = traceParser.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 < childCount) {
                        ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getChildAt(i2));
                        if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                            dispatchLayout();
                            break;
                        }
                        i2++;
                    } else {
                        adapterHelper.consumePostponedUpdates();
                        break;
                    }
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll(true);
            Trace.endSection();
        }
    }

    public final void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        setMeasuredDimension(LayoutManager.chooseSize(i, paddingRight, getMinimumWidth()), LayoutManager.chooseSize(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        ArrayList arrayList = this.mOnChildAttachStateListeners;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.mOnChildAttachStateListeners.get(size)).onChildViewDetachedFromWindow(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        int i = 0;
        if (layoutManager != null) {
            if (layoutManager.canScrollVertically()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        smoothScrollBy$1(0, measuredHeight, false);
                        return true;
                    }
                    smoothScrollBy$1(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean isLayoutReversed = layoutManager.isLayoutReversed();
                    if (keyCode == 122) {
                        if (isLayoutReversed) {
                            i = this.mAdapter.getItemCount();
                        }
                    } else if (!isLayoutReversed) {
                        i = this.mAdapter.getItemCount();
                    }
                    smoothScrollToPosition(i);
                    return true;
                }
            } else if (layoutManager.canScrollHorizontally()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        smoothScrollBy$1(measuredWidth, 0, false);
                        return true;
                    }
                    smoothScrollBy$1(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean isLayoutReversed2 = layoutManager.isLayoutReversed();
                    if (keyCode2 == 122) {
                        if (isLayoutReversed2) {
                            i = this.mAdapter.getItemCount();
                        }
                    } else if (!isLayoutReversed2) {
                        i = this.mAdapter.getItemCount();
                    }
                    smoothScrollToPosition(i);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0344, code lost:
    
        if (((java.util.ArrayList) r7.currentThread).contains(getFocusedChild()) == false) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchLayout() {
        boolean z;
        ViewHolder viewHolder;
        View findViewById;
        SimpleArrayMap simpleArrayMap;
        Viewport viewport;
        boolean animateMove;
        boolean z2;
        if (this.mAdapter == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        State state = this.mState;
        boolean z3 = false;
        state.mIsMeasuring = false;
        boolean z4 = true;
        Object[] objArr = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (state.mLayoutStep == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            if ((((ArrayList) adapterHelper.mPostponedList).isEmpty() || ((ArrayList) adapterHelper.mPendingUpdates).isEmpty()) && !objArr == true && this.mLayout.mWidth == getWidth() && this.mLayout.mHeight == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        state.assertLayoutStep(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        state.mLayoutStep = 1;
        boolean z5 = state.mRunSimpleAnimations;
        TraceParser traceParser = this.mChildHelper;
        Recycler recycler = this.mRecycler;
        CallResult callResult = this.mViewInfoStore;
        if (z5) {
            int childCount = traceParser.getChildCount() - 1;
            while (childCount >= 0) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getChildAt(childCount));
                if (childViewHolderInt.shouldIgnore()) {
                    z2 = z4;
                } else {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    Viewport viewport2 = new Viewport();
                    viewport2.setFrom(childViewHolderInt);
                    LongSparseArray longSparseArray = (LongSparseArray) callResult.serviceNames;
                    z2 = z4;
                    SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) callResult.result;
                    ViewHolder viewHolder2 = (ViewHolder) longSparseArray.get(changedHolderKey);
                    if (viewHolder2 == null || viewHolder2.shouldIgnore()) {
                        callResult.addToPostLayout(childViewHolderInt, viewport2);
                    } else {
                        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) simpleArrayMap2.get(viewHolder2);
                        boolean z6 = (viewInfoStore$InfoRecord == null || (viewInfoStore$InfoRecord.flags & 1) == 0) ? z3 : z2;
                        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord2 = (ViewInfoStore$InfoRecord) simpleArrayMap2.get(childViewHolderInt);
                        boolean z7 = (viewInfoStore$InfoRecord2 == null || (viewInfoStore$InfoRecord2.flags & 1) == 0) ? z3 : z2;
                        if (z6 && viewHolder2 == childViewHolderInt) {
                            callResult.addToPostLayout(childViewHolderInt, viewport2);
                        } else {
                            Viewport popFromLayoutStep = callResult.popFromLayoutStep(viewHolder2, 4);
                            callResult.addToPostLayout(childViewHolderInt, viewport2);
                            Viewport popFromLayoutStep2 = callResult.popFromLayoutStep(childViewHolderInt, 8);
                            if (popFromLayoutStep == null) {
                                int childCount2 = traceParser.getChildCount();
                                for (int i = 0; i < childCount2; i++) {
                                    ViewHolder childViewHolderInt2 = getChildViewHolderInt(traceParser.getChildAt(i));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        Adapter adapter = this.mAdapter;
                                        if (adapter == null || !adapter.hasStableIds()) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(childViewHolderInt2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(childViewHolderInt);
                                            a$$ExternalSyntheticBUOutline0.m(sb, (Object) exceptionLabel());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(childViewHolderInt2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(childViewHolderInt);
                                        a$$ExternalSyntheticBUOutline0.m(sb2, (Object) exceptionLabel());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                viewHolder2.setIsRecyclable(false);
                                if (z6) {
                                    addAnimatingView(viewHolder2);
                                }
                                if (viewHolder2 != childViewHolderInt) {
                                    if (z7) {
                                        addAnimatingView(childViewHolderInt);
                                    }
                                    viewHolder2.mShadowedHolder = childViewHolderInt;
                                    addAnimatingView(viewHolder2);
                                    recycler.unscrapView(viewHolder2);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.mShadowingHolder = viewHolder2;
                                }
                                if (this.mItemAnimator.animateChange(viewHolder2, childViewHolderInt, popFromLayoutStep, popFromLayoutStep2)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    }
                }
                childCount--;
                z4 = z2;
                z3 = false;
            }
            z = z4;
            SimpleArrayMap simpleArrayMap3 = (SimpleArrayMap) callResult.result;
            int i2 = simpleArrayMap3.size - 1;
            while (i2 >= 0) {
                ViewHolder viewHolder3 = (ViewHolder) simpleArrayMap3.keyAt(i2);
                ViewInfoStore$InfoRecord viewInfoStore$InfoRecord3 = (ViewInfoStore$InfoRecord) simpleArrayMap3.removeAt(i2);
                int i3 = viewInfoStore$InfoRecord3.flags;
                int i4 = i3 & 3;
                AnonymousClass7 anonymousClass7 = this.mViewInfoProcessCallback;
                if (i4 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.removeAndRecycleView(viewHolder3.itemView, recyclerView.mRecycler);
                } else if ((i3 & 1) != 0) {
                    Viewport viewport3 = viewInfoStore$InfoRecord3.preInfo;
                    if (viewport3 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.removeAndRecycleView(viewHolder3.itemView, recyclerView2.mRecycler);
                    } else {
                        anonymousClass7.processDisappeared(viewHolder3, viewport3, viewInfoStore$InfoRecord3.postInfo);
                    }
                } else if ((i3 & 14) == 14) {
                    anonymousClass7.processAppeared(viewHolder3, viewInfoStore$InfoRecord3.preInfo, viewInfoStore$InfoRecord3.postInfo);
                } else if ((i3 & 12) == 12) {
                    Viewport viewport4 = viewInfoStore$InfoRecord3.preInfo;
                    Viewport viewport5 = viewInfoStore$InfoRecord3.postInfo;
                    anonymousClass7.getClass();
                    viewHolder3.setIsRecyclable(false);
                    RecyclerView recyclerView3 = RecyclerView.this;
                    boolean z8 = recyclerView3.mDataSetHasChangedAfterLayout;
                    ItemAnimator itemAnimator = recyclerView3.mItemAnimator;
                    if (!z8) {
                        DefaultItemAnimator defaultItemAnimator = (DefaultItemAnimator) itemAnimator;
                        defaultItemAnimator.getClass();
                        int i5 = viewport4.width;
                        int i6 = viewport5.width;
                        if (i5 == i6) {
                            simpleArrayMap = simpleArrayMap3;
                            if (viewport4.height == viewport5.height) {
                                defaultItemAnimator.dispatchAnimationFinished(viewHolder3);
                                animateMove = false;
                                if (animateMove) {
                                    recyclerView3.postAnimationRunner();
                                }
                                viewport = null;
                                viewInfoStore$InfoRecord3.flags = 0;
                                viewInfoStore$InfoRecord3.preInfo = viewport;
                                viewInfoStore$InfoRecord3.postInfo = viewport;
                                ViewInfoStore$InfoRecord.sPool.release(viewInfoStore$InfoRecord3);
                                i2--;
                                simpleArrayMap3 = simpleArrayMap;
                            }
                        } else {
                            simpleArrayMap = simpleArrayMap3;
                        }
                        animateMove = defaultItemAnimator.animateMove(viewHolder3, i5, viewport4.height, i6, viewport5.height);
                        if (animateMove) {
                        }
                        viewport = null;
                        viewInfoStore$InfoRecord3.flags = 0;
                        viewInfoStore$InfoRecord3.preInfo = viewport;
                        viewInfoStore$InfoRecord3.postInfo = viewport;
                        ViewInfoStore$InfoRecord.sPool.release(viewInfoStore$InfoRecord3);
                        i2--;
                        simpleArrayMap3 = simpleArrayMap;
                    } else if (itemAnimator.animateChange(viewHolder3, viewHolder3, viewport4, viewport5)) {
                        recyclerView3.postAnimationRunner();
                    }
                } else {
                    simpleArrayMap = simpleArrayMap3;
                    if ((i3 & 4) != 0) {
                        viewport = null;
                        anonymousClass7.processDisappeared(viewHolder3, viewInfoStore$InfoRecord3.preInfo, null);
                    } else {
                        viewport = null;
                        if ((i3 & 8) != 0) {
                            anonymousClass7.processAppeared(viewHolder3, viewInfoStore$InfoRecord3.preInfo, viewInfoStore$InfoRecord3.postInfo);
                        }
                    }
                    viewInfoStore$InfoRecord3.flags = 0;
                    viewInfoStore$InfoRecord3.preInfo = viewport;
                    viewInfoStore$InfoRecord3.postInfo = viewport;
                    ViewInfoStore$InfoRecord.sPool.release(viewInfoStore$InfoRecord3);
                    i2--;
                    simpleArrayMap3 = simpleArrayMap;
                }
                simpleArrayMap = simpleArrayMap3;
                viewport = null;
                viewInfoStore$InfoRecord3.flags = 0;
                viewInfoStore$InfoRecord3.preInfo = viewport;
                viewInfoStore$InfoRecord3.postInfo = viewport;
                ViewInfoStore$InfoRecord.sPool.release(viewInfoStore$InfoRecord3);
                i2--;
                simpleArrayMap3 = simpleArrayMap;
            }
        } else {
            z = true;
        }
        View view = null;
        this.mLayout.removeAndRecycleScrapInt(recycler);
        state.mPreviousLayoutItemCount = state.mItemCount;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        state.mRunSimpleAnimations = false;
        state.mRunPredictiveAnimations = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recycler.mChangedScrap;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            recycler.updateViewCacheSize();
        }
        this.mLayout.onLayoutCompleted(state);
        boolean z9 = z;
        onExitLayoutOrScroll(z9);
        stopInterceptRequestLayout(false);
        ((SimpleArrayMap) callResult.result).clear();
        ((LongSparseArray) callResult.serviceNames).clear();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i7 = iArr[0];
        int i8 = iArr[z9 ? 1 : 0];
        findMinMaxChildLayoutPositions(iArr);
        if (iArr[0] != i7 || iArr[z9 ? 1 : 0] != i8) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            if (state.mFocusedItemId != -1 && this.mAdapter.hasStableIds()) {
                long j = state.mFocusedItemId;
                Adapter adapter2 = this.mAdapter;
                if (adapter2 != null && adapter2.hasStableIds()) {
                    int unfilteredChildCount = traceParser.getUnfilteredChildCount();
                    viewHolder = null;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= unfilteredChildCount) {
                            break;
                        }
                        ViewHolder childViewHolderInt3 = getChildViewHolderInt(traceParser.getUnfilteredChildAt(i9));
                        if (childViewHolderInt3 != null && !childViewHolderInt3.isRemoved() && childViewHolderInt3.getItemId() == j) {
                            if (!((ArrayList) traceParser.currentThread).contains(childViewHolderInt3.itemView)) {
                                viewHolder = childViewHolderInt3;
                                break;
                            }
                            viewHolder = childViewHolderInt3;
                        }
                        i9++;
                    }
                    if (viewHolder != null) {
                        if (!((ArrayList) traceParser.currentThread).contains(viewHolder.itemView) && viewHolder.itemView.hasFocusable()) {
                            view = viewHolder.itemView;
                            if (view != null) {
                                int i10 = state.mFocusedSubChildId;
                                if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                                    view = findViewById;
                                }
                                view.requestFocus();
                            }
                        }
                    }
                    if (traceParser.getChildCount() > 0) {
                        int i11 = state.mFocusedItemPosition;
                        if (i11 == -1) {
                            i11 = 0;
                        }
                        int itemCount = state.getItemCount();
                        for (int i12 = i11; i12 < itemCount; i12++) {
                            ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i12);
                            if (findViewHolderForAdapterPosition == null) {
                                break;
                            }
                            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                view = findViewHolderForAdapterPosition.itemView;
                                break;
                            }
                        }
                        int min = Math.min(itemCount, i11) - 1;
                        while (true) {
                            if (min < 0) {
                                break;
                            }
                            ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
                            if (findViewHolderForAdapterPosition2 == null) {
                                break;
                            }
                            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                view = findViewHolderForAdapterPosition2.itemView;
                                break;
                            }
                            min--;
                        }
                    }
                    if (view != null) {
                    }
                }
            }
            viewHolder = null;
            if (viewHolder != null) {
            }
            if (traceParser.getChildCount() > 0) {
            }
            if (view != null) {
            }
        }
        state.mFocusedItemId = -1L;
        state.mFocusedItemPosition = -1;
        state.mFocusedSubChildId = -1;
    }

    public final void dispatchLayoutStep1() {
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord;
        View findContainingItemView;
        State state = this.mState;
        state.assertLayoutStep(1);
        fillRemainingScrollValues(state);
        state.mIsMeasuring = false;
        startInterceptRequestLayout();
        CallResult callResult = this.mViewInfoStore;
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) callResult.result;
        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) callResult.result;
        simpleArrayMap.clear();
        LongSparseArray longSparseArray = (LongSparseArray) callResult.serviceNames;
        longSparseArray.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        ViewHolder viewHolder = null;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        if (focusedChild != null && (findContainingItemView = findContainingItemView(focusedChild)) != null) {
            viewHolder = getChildViewHolder(findContainingItemView);
        }
        if (viewHolder == null) {
            state.mFocusedItemId = -1L;
            state.mFocusedItemPosition = -1;
            state.mFocusedSubChildId = -1;
        } else {
            state.mFocusedItemId = this.mAdapter.hasStableIds() ? viewHolder.getItemId() : -1L;
            state.mFocusedItemPosition = this.mDataSetHasChangedAfterLayout ? -1 : viewHolder.isRemoved() ? viewHolder.mOldPosition : viewHolder.getAbsoluteAdapterPosition();
            View view = viewHolder.itemView;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            state.mFocusedSubChildId = id;
        }
        state.mTrackOldChangeHolders = state.mRunSimpleAnimations && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.mInPreLayout = state.mRunPredictiveAnimations;
        state.mItemCount = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        boolean z = state.mRunSimpleAnimations;
        TraceParser traceParser = this.mChildHelper;
        if (z) {
            int childCount = traceParser.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getChildAt(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator itemAnimator = this.mItemAnimator;
                    ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    Viewport viewport = new Viewport();
                    viewport.setFrom(childViewHolderInt);
                    ViewInfoStore$InfoRecord viewInfoStore$InfoRecord2 = (ViewInfoStore$InfoRecord) simpleArrayMap2.get(childViewHolderInt);
                    if (viewInfoStore$InfoRecord2 == null) {
                        viewInfoStore$InfoRecord2 = ViewInfoStore$InfoRecord.obtain();
                        simpleArrayMap2.put(childViewHolderInt, viewInfoStore$InfoRecord2);
                    }
                    viewInfoStore$InfoRecord2.preInfo = viewport;
                    viewInfoStore$InfoRecord2.flags |= 4;
                    if (state.mTrackOldChangeHolders && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        longSparseArray.put(childViewHolderInt, getChangedHolderKey(childViewHolderInt));
                    }
                }
            }
        }
        if (state.mRunPredictiveAnimations) {
            int unfilteredChildCount = traceParser.getUnfilteredChildCount();
            for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(traceParser.getUnfilteredChildAt(i2));
                if (sDebugAssertionsEnabled && childViewHolderInt2.mPosition == -1 && !childViewHolderInt2.isRemoved()) {
                    a$$ExternalSyntheticBUOutline0.m$1("view holder cannot have position -1 unless it is removed".concat(exceptionLabel()));
                    return;
                } else {
                    if (!childViewHolderInt2.shouldIgnore()) {
                        childViewHolderInt2.saveOldPosition();
                    }
                }
            }
            boolean z2 = state.mStructureChanged;
            state.mStructureChanged = false;
            this.mLayout.onLayoutChildren(this.mRecycler, state);
            state.mStructureChanged = z2;
            for (int i3 = 0; i3 < traceParser.getChildCount(); i3++) {
                ViewHolder childViewHolderInt3 = getChildViewHolderInt(traceParser.getChildAt(i3));
                if (!childViewHolderInt3.shouldIgnore() && ((viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) simpleArrayMap2.get(childViewHolderInt3)) == null || (viewInfoStore$InfoRecord.flags & 4) == 0)) {
                    ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt3);
                    boolean hasAnyOfTheFlags = childViewHolderInt3.hasAnyOfTheFlags(PKIFailureInfo.certRevoked);
                    ItemAnimator itemAnimator2 = this.mItemAnimator;
                    childViewHolderInt3.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    Viewport viewport2 = new Viewport();
                    viewport2.setFrom(childViewHolderInt3);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt3, viewport2);
                    } else {
                        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord3 = (ViewInfoStore$InfoRecord) simpleArrayMap2.get(childViewHolderInt3);
                        if (viewInfoStore$InfoRecord3 == null) {
                            viewInfoStore$InfoRecord3 = ViewInfoStore$InfoRecord.obtain();
                            simpleArrayMap2.put(childViewHolderInt3, viewInfoStore$InfoRecord3);
                        }
                        viewInfoStore$InfoRecord3.flags |= 2;
                        viewInfoStore$InfoRecord3.preInfo = viewport2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        state.mLayoutStep = 2;
    }

    public final void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.assertLayoutStep(6);
        this.mAdapterHelper.consumeUpdatesInOnePass();
        state.mItemCount = this.mAdapter.getItemCount();
        state.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.mLayoutState;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        state.mInPreLayout = false;
        this.mLayout.onLayoutChildren(this.mRecycler, state);
        state.mStructureChanged = false;
        state.mRunSimpleAnimations = state.mRunSimpleAnimations && this.mItemAnimator != null;
        state.mLayoutStep = 4;
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, iArr, i2, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScrollInternal(i, iArr, i2, i3, i4, null, 0);
    }

    public final void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        ArrayList arrayList = this.mScrollListeners;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.mItemDecorations;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) arrayList.get(i)).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.mItemAnimator == null || arrayList.size() <= 0 || !this.mItemAnimator.isRunning()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((StretchEdgeEffectFactory) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((StretchEdgeEffectFactory) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((StretchEdgeEffectFactory) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((StretchEdgeEffectFactory) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(State state) {
        if (this.mScrollState != 2) {
            state.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.mOverScroller;
        overScroller.getFinalX();
        overScroller.getCurrX();
        state.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View findChildViewUnder(float f, float f2) {
        TraceParser traceParser = this.mChildHelper;
        for (int childCount = traceParser.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = traceParser.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (f >= childAt.getLeft() + translationX && f <= childAt.getRight() + translationX && f2 >= childAt.getTop() + translationY && f2 <= childAt.getBottom() + translationY) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public final boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.mOnItemTouchListeners;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = (OnItemTouchListener) arrayList.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public final void findMinMaxChildLayoutPositions(int[] iArr) {
        TraceParser traceParser = this.mChildHelper;
        int childCount = traceParser.getChildCount();
        if (childCount == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = PKIFailureInfo.systemUnavail;
        for (int i3 = 0; i3 < childCount; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getChildAt(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        TraceParser traceParser = this.mChildHelper;
        int unfilteredChildCount = traceParser.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getUnfilteredChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!((ArrayList) traceParser.currentThread).contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0206, code lost:
    
        if (r1 < r14) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean fling(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ViewFlinger viewFlinger;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        final PagerSnapHelper pagerSnapHelper;
        RecyclerView recyclerView;
        LayoutManager layoutManager;
        int i7;
        boolean z4;
        LinearSmoothScroller linearSmoothScroller;
        int position;
        PointF computeScrollVectorForPosition;
        int i8;
        LayoutManager layoutManager2 = this.mLayout;
        if (layoutManager2 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean canScrollHorizontally = layoutManager2.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            int i9 = (!canScrollHorizontally || Math.abs(i) < i3) ? 0 : i;
            int i10 = (!canScrollVertically || Math.abs(i2) < i3) ? 0 : i2;
            if (i9 != 0 || i10 != 0) {
                if (i9 != 0) {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == DECELERATION_RATE) {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != DECELERATION_RATE) {
                            if (shouldAbsorb(this.mRightGlow, i9, getWidth())) {
                                this.mRightGlow.onAbsorb(i9);
                                i9 = 0;
                            }
                            i5 = i9;
                            i9 = 0;
                        }
                    } else {
                        int i11 = -i9;
                        if (shouldAbsorb(this.mLeftGlow, i11, getWidth())) {
                            this.mLeftGlow.onAbsorb(i11);
                            i9 = 0;
                        }
                        i5 = i9;
                        i9 = 0;
                    }
                    if (i10 != 0) {
                        EdgeEffect edgeEffect3 = this.mTopGlow;
                        if (edgeEffect3 == null || EdgeEffectCompat.getDistance(edgeEffect3) == DECELERATION_RATE) {
                            EdgeEffect edgeEffect4 = this.mBottomGlow;
                            if (edgeEffect4 != null && EdgeEffectCompat.getDistance(edgeEffect4) != DECELERATION_RATE) {
                                if (shouldAbsorb(this.mBottomGlow, i10, getHeight())) {
                                    this.mBottomGlow.onAbsorb(i10);
                                    i10 = 0;
                                }
                                i6 = 0;
                            }
                        } else {
                            int i12 = -i10;
                            if (shouldAbsorb(this.mTopGlow, i12, getHeight())) {
                                this.mTopGlow.onAbsorb(i12);
                                i10 = 0;
                            }
                            i6 = 0;
                        }
                        viewFlinger = this.mViewFlinger;
                        if (i5 == 0 || i10 != 0) {
                            int i13 = -i4;
                            i5 = Math.max(i13, Math.min(i5, i4));
                            i10 = Math.max(i13, Math.min(i10, i4));
                            startNestedScrollForType(1);
                            viewFlinger.fling(i5, i10);
                        }
                        if (i9 == 0 || i6 != 0) {
                            f = i9;
                            f2 = i6;
                            if (!dispatchNestedPreFling(f, f2)) {
                                boolean z5 = canScrollHorizontally || canScrollVertically;
                                dispatchNestedFling(f, f2, z5);
                                OnFlingListener onFlingListener = this.mOnFlingListener;
                                if (onFlingListener != null && (layoutManager = (recyclerView = (pagerSnapHelper = (PagerSnapHelper) onFlingListener).mRecyclerView).mLayout) != 0 && recyclerView.mAdapter != null && ((Math.abs(i6) > (i7 = recyclerView.mMinFlingVelocity) || Math.abs(i9) > i7) && ((z4 = layoutManager instanceof SmoothScroller.ScrollVectorProvider)))) {
                                    View view = null;
                                    if (z4) {
                                        final Context context = pagerSnapHelper.mRecyclerView.getContext();
                                        linearSmoothScroller = new LinearSmoothScroller(context) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                                            @Override // androidx.recyclerview.widget.LinearSmoothScroller
                                            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                                                return 100.0f / displayMetrics.densityDpi;
                                            }

                                            @Override // androidx.recyclerview.widget.LinearSmoothScroller
                                            public final int calculateTimeForScrolling(int i14) {
                                                return Math.min(100, super.calculateTimeForScrolling(i14));
                                            }

                                            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                                            public final void onTargetFound(View view2, RecyclerView.SmoothScroller.Action action) {
                                                PagerSnapHelper pagerSnapHelper2 = PagerSnapHelper.this;
                                                int[] calculateDistanceToFinalSnap = pagerSnapHelper2.calculateDistanceToFinalSnap(pagerSnapHelper2.mRecyclerView.mLayout, view2);
                                                int i14 = calculateDistanceToFinalSnap[0];
                                                int i15 = calculateDistanceToFinalSnap[1];
                                                int ceil = (int) Math.ceil(calculateTimeForScrolling(Math.max(Math.abs(i14), Math.abs(i15))) / 0.3356d);
                                                if (ceil > 0) {
                                                    action.mDx = i14;
                                                    action.mDy = i15;
                                                    action.mDuration = ceil;
                                                    action.mInterpolator = this.mDecelerateInterpolator;
                                                    action.mChanged = true;
                                                }
                                            }
                                        };
                                    } else {
                                        linearSmoothScroller = null;
                                    }
                                    if (linearSmoothScroller != null) {
                                        int itemCount = layoutManager.getItemCount();
                                        if (itemCount != 0) {
                                            OrientationHelper verticalHelper = layoutManager.canScrollVertically() ? pagerSnapHelper.getVerticalHelper(layoutManager) : layoutManager.canScrollHorizontally() ? pagerSnapHelper.getHorizontalHelper(layoutManager) : null;
                                            if (verticalHelper != null) {
                                                z2 = false;
                                                int childCount = layoutManager.getChildCount();
                                                z3 = true;
                                                int i14 = 0;
                                                int i15 = Integer.MIN_VALUE;
                                                int i16 = Integer.MAX_VALUE;
                                                View view2 = null;
                                                while (i14 < childCount) {
                                                    boolean z6 = z5;
                                                    View childAt = layoutManager.getChildAt(i14);
                                                    if (childAt == null) {
                                                        i8 = childCount;
                                                    } else {
                                                        i8 = childCount;
                                                        int distanceToCenter = PagerSnapHelper.distanceToCenter(childAt, verticalHelper);
                                                        if (distanceToCenter <= 0 && distanceToCenter > i15) {
                                                            view2 = childAt;
                                                            i15 = distanceToCenter;
                                                        }
                                                        if (distanceToCenter >= 0 && distanceToCenter < i16) {
                                                            view = childAt;
                                                            i16 = distanceToCenter;
                                                        }
                                                    }
                                                    i14++;
                                                    z5 = z6;
                                                    childCount = i8;
                                                }
                                                z = z5;
                                                Object[] objArr = !layoutManager.canScrollHorizontally() ? i6 <= 0 : i9 <= 0;
                                                if (objArr == true && view != null) {
                                                    position = LayoutManager.getPosition(view);
                                                } else if (objArr == true || view2 == null) {
                                                    if (objArr != false) {
                                                        view = view2;
                                                    }
                                                    if (view != null) {
                                                        position = ((z4 && (computeScrollVectorForPosition = ((SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(layoutManager.getItemCount() + (-1))) != null && ((computeScrollVectorForPosition.x > DECELERATION_RATE ? 1 : (computeScrollVectorForPosition.x == DECELERATION_RATE ? 0 : -1)) < 0 || (computeScrollVectorForPosition.y > DECELERATION_RATE ? 1 : (computeScrollVectorForPosition.y == DECELERATION_RATE ? 0 : -1)) < 0)) == objArr ? -1 : 1) + LayoutManager.getPosition(view);
                                                        if (position >= 0) {
                                                        }
                                                    }
                                                    position = -1;
                                                } else {
                                                    position = LayoutManager.getPosition(view2);
                                                }
                                                if (position != -1) {
                                                    linearSmoothScroller.mTargetPosition = position;
                                                    layoutManager.startSmoothScroll(linearSmoothScroller);
                                                    return z3;
                                                }
                                                if (!z) {
                                                    return z2;
                                                }
                                                boolean z7 = z3;
                                                startNestedScrollForType(z7 ? 1 : 0);
                                                int i17 = -i4;
                                                viewFlinger.fling(Math.max(i17, Math.min(i9, i4)), Math.max(i17, Math.min(i6, i4)));
                                                return z7;
                                            }
                                        }
                                        z = z5;
                                        z2 = false;
                                        z3 = true;
                                        position = -1;
                                        if (position != -1) {
                                        }
                                        if (!z) {
                                        }
                                    }
                                }
                                z = z5;
                                z2 = false;
                                z3 = true;
                                if (!z) {
                                }
                            }
                        } else if (i5 != 0 || i10 != 0) {
                            return true;
                        }
                    }
                    i6 = i10;
                    i10 = 0;
                    viewFlinger = this.mViewFlinger;
                    if (i5 == 0) {
                    }
                    int i132 = -i4;
                    i5 = Math.max(i132, Math.min(i5, i4));
                    i10 = Math.max(i132, Math.min(i10, i4));
                    startNestedScrollForType(1);
                    viewFlinger.fling(i5, i10);
                    if (i9 == 0) {
                    }
                    f = i9;
                    f2 = i6;
                    if (!dispatchNestedPreFling(f, f2)) {
                    }
                }
                i5 = 0;
                if (i10 != 0) {
                }
                i6 = i10;
                i10 = 0;
                viewFlinger = this.mViewFlinger;
                if (i5 == 0) {
                }
                int i1322 = -i4;
                i5 = Math.max(i1322, Math.min(i5, i4));
                i10 = Math.max(i1322, Math.min(i10, i4));
                startNestedScrollForType(1);
                viewFlinger.fling(i5, i10);
                if (i9 == 0) {
                }
                f = i9;
                f2 = i6;
                if (!dispatchNestedPreFling(f, f2)) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018b, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0168, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0175, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0178, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017b, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0183, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        boolean z;
        this.mLayout.getClass();
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        State state = this.mState;
        Recycler recycler = this.mRecycler;
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE : 33) == null) {
                    z = true;
                    if (!z && this.mLayout.canScrollHorizontally()) {
                        z = focusFinder.findNextFocus(this, view, !((this.mLayout.mRecyclerView.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        consumePendingUpdateOperations();
                        if (findContainingItemView(view) != null) {
                            startInterceptRequestLayout();
                            this.mLayout.onFocusSearchFailed(view, i, recycler, state);
                            stopInterceptRequestLayout(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (view != null) {
                            int width = view.getWidth();
                            int height = view.getHeight();
                            Rect rect = this.mTempRect;
                            rect.set(0, 0, width, height);
                            int width2 = view2.getWidth();
                            int height2 = view2.getHeight();
                            Rect rect2 = this.mTempRect2;
                            rect2.set(0, 0, width2, height2);
                            offsetDescendantRectToMyCoords(view, rect);
                            offsetDescendantRectToMyCoords(view2, rect2);
                            if (this.mLayout.mRecyclerView.getLayoutDirection() != 1) {
                            }
                            i2 = rect.left;
                            i3 = rect2.left;
                            if (i2 >= i3) {
                            }
                            i4 = 1;
                            i5 = rect.top;
                            i6 = rect2.top;
                            if (i5 >= i6) {
                            }
                            c = 1;
                            if (i == 1) {
                            }
                        }
                        return view2;
                    }
                    return super.focusSearch(view, i);
                }
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.mLayout.mRecyclerView.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            return super.focusSearch(view, i);
        }
        View findNextFocus = focusFinder.findNextFocus(this, view, i);
        if (findNextFocus == null && z2) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, recycler, state);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        view2 = findNextFocus;
        if (view2 == null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view && findContainingItemView(view2) != null) {
            if (view != null && findContainingItemView(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.mTempRect;
                rect3.set(0, 0, width3, height3);
                int width22 = view2.getWidth();
                int height22 = view2.getHeight();
                Rect rect22 = this.mTempRect2;
                rect22.set(0, 0, width22, height22);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(view2, rect22);
                int i7 = this.mLayout.mRecyclerView.getLayoutDirection() != 1 ? -1 : 1;
                i2 = rect3.left;
                i3 = rect22.left;
                if ((i2 >= i3 || rect3.right <= i3) && rect3.right < rect22.right) {
                    i4 = 1;
                } else {
                    int i8 = rect3.right;
                    int i9 = rect22.right;
                    i4 = ((i8 > i9 || i2 >= i9) && i2 > i3) ? -1 : 0;
                }
                i5 = rect3.top;
                i6 = rect22.top;
                if ((i5 >= i6 || rect3.bottom <= i6) && rect3.bottom < rect22.bottom) {
                    c = 1;
                } else {
                    int i10 = rect3.bottom;
                    int i11 = rect22.bottom;
                    c = ((i10 > i11 || i5 >= i11) && i5 > i6) ? (char) 65535 : (char) 0;
                }
                if (i == 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        Mod$$ExternalSyntheticBUOutline0.m("Invalid direction: ", i, exceptionLabel());
                                        return null;
                                    }
                                }
                            }
                        }
                    } else if (c <= 0) {
                        if (c == 0) {
                        }
                    }
                } else if (c >= 0) {
                    if (c == 0) {
                    }
                }
            }
            return view2;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        a$$ExternalSyntheticBUOutline0.m$1("RecyclerView has no LayoutManager".concat(exceptionLabel()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        a$$ExternalSyntheticBUOutline0.m$1("RecyclerView has no LayoutManager".concat(exceptionLabel()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public final int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        int i = viewHolder.mPosition;
        ArrayList arrayList = (ArrayList) this.mAdapterHelper.mPendingUpdates;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AdapterHelper.UpdateOp updateOp = (AdapterHelper.UpdateOp) arrayList.get(i2);
            int i3 = updateOp.cmd;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = updateOp.positionStart;
                    if (i4 <= i) {
                        int i5 = updateOp.itemCount;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = updateOp.positionStart;
                    if (i6 == i) {
                        i = updateOp.itemCount;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (updateOp.itemCount <= i) {
                            i++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i) {
                i += updateOp.itemCount;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return super.getBaseline();
        }
        layoutManager.getClass();
        return -1;
    }

    public final long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public final ViewHolder getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        Handlers$$ExternalSyntheticBUOutline0.m$1("View ", view, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public final Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.mInsetsDirty;
        Rect rect = layoutParams.mDecorInsets;
        if (z) {
            State state = this.mState;
            if (!state.mInPreLayout || (!layoutParams.mViewHolder.isUpdated() && !layoutParams.mViewHolder.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.mItemDecorations;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.mTempRect;
                    rect2.set(0, 0, 0, 0);
                    ((ItemDecoration) arrayList.get(i)).getItemOffsets(rect2, view, this, state);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                layoutParams.mInsetsDirty = false;
                return rect;
            }
        }
        return rect;
    }

    public final long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public final NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent(0);
    }

    public final boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.hasPendingUpdates();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public final boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mIsNestedScrollingEnabled;
    }

    public final void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public final void markItemDecorInsetsDirty() {
        TraceParser traceParser = this.mChildHelper;
        int unfilteredChildCount = traceParser.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ((LayoutParams) traceParser.getUnfilteredChildAt(i).getLayoutParams()).mInsetsDirty = true;
        }
        ArrayList arrayList = this.mRecycler.mCachedViews;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) arrayList.get(i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.mInsetsDirty = true;
            }
        }
    }

    public final void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        TraceParser traceParser = this.mChildHelper;
        int unfilteredChildCount = traceParser.getUnfilteredChildCount();
        for (int i4 = 0; i4 < unfilteredChildCount; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getUnfilteredChildAt(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                State state = this.mState;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i2));
                    }
                    childViewHolderInt.offsetPosition(-i2, z);
                    state.mStructureChanged = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    state.mStructureChanged = true;
                }
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.mCachedViews;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null) {
                int i6 = viewHolder.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + viewHolder + " now at position " + (viewHolder.mPosition - i2));
                    }
                    viewHolder.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    viewHolder.addFlags(8);
                    recycler.recycleCachedViewAt(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r1 >= 30.0f) goto L21;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.maybeSendPoolingContainerAttach();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mIsAttachedToWindow = true;
            layoutManager.onAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = GapWorker.sGapWorker;
            GapWorker gapWorker = (GapWorker) threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new GapWorker();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                Display display = getDisplay();
                if (display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                GapWorker gapWorker2 = this.mGapWorker;
                gapWorker2.mFrameIntervalNs = (long) (1.0E9f / f);
                threadLocal.set(gapWorker2);
            }
            ArrayList arrayList = this.mGapWorker.mRecyclerViews;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                a$$ExternalSyntheticBUOutline0.m$1("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mIsAttachedToWindow = false;
            layoutManager.onDetachedFromWindow(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (ViewInfoStore$InfoRecord.sPool.acquire() != null) {
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.mCachedViews;
        for (int i = 0; i < arrayList.size(); i++) {
            Countries.callPoolingContainerOnRelease(((ViewHolder) arrayList.get(i)).itemView);
        }
        recycler.poolingContainerDetach(RecyclerView.this.mAdapter, false);
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                break;
            }
            ArrayList arrayList2 = Countries.getPoolingContainerListenerHolder((View) viewGroupKt$iterator$1.next()).listeners;
            for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList2); -1 < lastIndex; lastIndex--) {
                ((ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0) arrayList2.get(lastIndex)).f$0.disposeComposition();
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (gapWorker = this.mGapWorker) == null) {
            return;
        }
        boolean remove = gapWorker.mRecyclerViews.remove(this);
        if (!sDebugAssertionsEnabled || remove) {
            this.mGapWorker = null;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.mItemDecorations;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) arrayList.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    public final void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public final void onExitLayoutOrScroll(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            if (sDebugAssertionsEnabled && i2 < 0) {
                a$$ExternalSyntheticBUOutline0.m$1("layout or scroll counter cannot go below zero.Some calls are not matching".concat(exceptionLabel()));
                return;
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                int i3 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i3 != 0 && (accessibilityManager = this.mAccessibilityManager) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.mPendingAccessibilityImportanceChange;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
                    if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                        viewHolder.itemView.setImportantForAccessibility(i);
                        viewHolder.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float f;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float f2 = DECELERATION_RATE;
            if (source != 0) {
                float f3 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f2 = motionEvent.getAxisValue(10);
                }
                z = false;
                f = f2;
                f2 = f3;
                i = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i = 26;
                f = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    float f4 = -f;
                    f = 0.0f;
                    f2 = f4;
                } else if (!this.mLayout.canScrollHorizontally()) {
                    f = 0.0f;
                }
                z = this.mLowResRotaryEncoderFeature;
            } else {
                i = 0;
                z = false;
                f = 0.0f;
            }
            int i2 = (int) (f2 * this.mScaledVerticalScrollFactor);
            int i3 = (int) (f * this.mScaledHorizontalScrollFactor);
            if (z) {
                OverScroller overScroller = this.mViewFlinger.mOverScroller;
                smoothScrollBy$1((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                LayoutManager layoutManager = this.mLayout;
                if (layoutManager == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.mLayoutSuppressed) {
                    int[] iArr = this.mReusableIntPair;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
                    boolean canScrollVertically = this.mLayout.canScrollVertically();
                    int i4 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int releaseHorizontalGlow = i3 - releaseHorizontalGlow(y, i3);
                    int releaseVerticalGlow$1 = i2 - releaseVerticalGlow$1(x, i2);
                    getScrollingChildHelper().startNestedScroll(i4, 1);
                    if (getScrollingChildHelper().dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, this.mReusableIntPair, canScrollVertically ? releaseVerticalGlow$1 : 0, 1, this.mScrollOffset)) {
                        releaseHorizontalGlow -= iArr[0];
                        releaseVerticalGlow$1 -= iArr[1];
                    }
                    scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow$1 : 0, motionEvent, 1);
                    GapWorker gapWorker = this.mGapWorker;
                    if (gapWorker != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow$1 != 0)) {
                        gapWorker.postFromTraversal(this, releaseHorizontalGlow, releaseVerticalGlow$1);
                    }
                    getScrollingChildHelper().stopNestedScroll(1);
                }
            }
            if (i != 0 && !z) {
                this.mDifferentialMotionFlingController.onMotionEvent(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (findInterceptingOnItemTouchListener(motionEvent)) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                getScrollingChildHelper().stopNestedScroll(0);
                releaseGlows();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
                boolean canScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == DECELERATION_RATE || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        EdgeEffectCompat.onPullDistance(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
                        EdgeEffectCompat.onPullDistance(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 != null && EdgeEffectCompat.getDistance(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
                        EdgeEffectCompat.onPullDistance(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && EdgeEffectCompat.getDistance(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
                        EdgeEffectCompat.onPullDistance(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        getScrollingChildHelper().stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    startNestedScrollForType(0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    getScrollingChildHelper().stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i = x2 - this.mInitialTouchX;
                        int i2 = y2 - this.mInitialTouchY;
                        if (!canScrollHorizontally || Math.abs(i) <= this.mTouchSlop) {
                            z2 = false;
                        } else {
                            this.mLastTouchX = x2;
                            z2 = true;
                        }
                        if (canScrollVertically && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchY = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.mVelocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    getScrollingChildHelper().stopNestedScroll(0);
                    releaseGlows();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                } else if (actionMasked == 6) {
                    onPointerUp(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean isAutoMeasureEnabled = layoutManager.isAutoMeasureEnabled();
        boolean z = false;
        State state = this.mState;
        if (isAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.mRecyclerView.defaultOnMeasure(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (state.mLayoutStep == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            state.mIsMeasuring = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                state.mIsMeasuring = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.mRecyclerView.defaultOnMeasure(i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll(true);
            if (state.mRunPredictiveAnimations) {
                state.mInPreLayout = true;
            } else {
                this.mAdapterHelper.consumeUpdatesInOnePass();
                state.mInPreLayout = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (state.mRunPredictiveAnimations) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            state.mItemCount = adapter.getItemCount();
        } else {
            state.mItemCount = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.mRecyclerView.defaultOnMeasure(i, i2);
        stopInterceptRequestLayout(false);
        state.mInPreLayout = false;
    }

    public final void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.mSuperState);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.mLayoutState = savedState2.mLayoutState;
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.mLayoutState = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.mLayoutState = null;
        return savedState;
    }

    public void onScrolled(int i) {
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
            if (onItemTouchListener == null) {
                z = motionEvent.getAction() == 0 ? false : findInterceptingOnItemTouchListener(motionEvent);
            } else {
                onItemTouchListener.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                z = true;
            }
            if (z) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                getScrollingChildHelper().stopNestedScroll(0);
                releaseGlows();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
                boolean canScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.mNestedOffsets;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    startNestedScrollForType(0);
                } else {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(obtain);
                        VelocityTracker velocityTracker2 = this.mVelocityTracker;
                        int i4 = this.mMaxFlingVelocity;
                        velocityTracker2.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, i4);
                        float f = canScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f2 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if (!(f == DECELERATION_RATE && f2 == DECELERATION_RATE) && fling((int) f, (int) f2, this.mMinFlingVelocity, i4)) {
                            i = 0;
                        } else {
                            i = 0;
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.mVelocityTracker;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        getScrollingChildHelper().stopNestedScroll(i);
                        releaseGlows();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i5 = this.mLastTouchX - x2;
                        int i6 = this.mLastTouchY - y2;
                        if (this.mScrollState != 1) {
                            if (canScrollHorizontally) {
                                int i7 = this.mTouchSlop;
                                i5 = i5 > 0 ? Math.max(0, i5 - i7) : Math.min(0, i5 + i7);
                                if (i5 != 0) {
                                    z2 = true;
                                    if (canScrollVertically) {
                                        int i8 = this.mTouchSlop;
                                        i6 = i6 > 0 ? Math.max(0, i6 - i8) : Math.min(0, i6 + i8);
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (canScrollVertically) {
                            }
                            if (z2) {
                            }
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr2 = this.mReusableIntPair;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int releaseHorizontalGlow = i5 - releaseHorizontalGlow(motionEvent.getY(), i5);
                            int releaseVerticalGlow$1 = i6 - releaseVerticalGlow$1(motionEvent.getX(), i6);
                            boolean dispatchNestedPreScroll = getScrollingChildHelper().dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, this.mReusableIntPair, canScrollVertically ? releaseVerticalGlow$1 : 0, 0, this.mScrollOffset);
                            int[] iArr3 = this.mScrollOffset;
                            if (dispatchNestedPreScroll) {
                                releaseHorizontalGlow -= iArr2[0];
                                releaseVerticalGlow$1 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            this.mLastTouchX = x2 - iArr3[0];
                            this.mLastTouchY = y2 - iArr3[1];
                            int i9 = canScrollHorizontally ? releaseHorizontalGlow : 0;
                            if (canScrollVertically) {
                                i2 = releaseVerticalGlow$1;
                                i3 = 0;
                            } else {
                                i2 = 0;
                                i3 = 0;
                            }
                            if (scrollByInternal(i9, i2, motionEvent, i3)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            GapWorker gapWorker = this.mGapWorker;
                            if (gapWorker != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow$1 != 0)) {
                                gapWorker.postFromTraversal(this, releaseHorizontalGlow, releaseVerticalGlow$1);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.mVelocityTracker;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        getScrollingChildHelper().stopNestedScroll(0);
                        releaseGlows();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x3;
                        this.mInitialTouchX = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y3;
                        this.mInitialTouchY = y3;
                    } else if (actionMasked == 6) {
                        onPointerUp(motionEvent);
                    }
                }
                this.mVelocityTracker.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        postOnAnimation(this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public final void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = this.mDataSetHasChangedAfterLayout;
        AdapterHelper adapterHelper = this.mAdapterHelper;
        boolean z3 = false;
        if (z2) {
            adapterHelper.recycleUpdateOpsAndClearList((ArrayList) adapterHelper.mPendingUpdates);
            adapterHelper.recycleUpdateOpsAndClearList((ArrayList) adapterHelper.mPostponedList);
            adapterHelper.mExistingUpdateTypes = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged();
            }
        }
        if (this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            adapterHelper.preProcess();
        } else {
            adapterHelper.consumeUpdatesInOnePass();
        }
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        boolean z5 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        State state = this.mState;
        state.mRunSimpleAnimations = z5;
        if (z5 && z4 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z3 = true;
        }
        state.mRunPredictiveAnimations = z3;
    }

    public final void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        TraceParser traceParser = this.mChildHelper;
        int unfilteredChildCount = traceParser.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(traceParser.getUnfilteredChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.mCachedViews;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.recycleAndClearCachedViews();
        }
    }

    public final void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, Viewport viewport) {
        viewHolder.setFlags(0, PKIFailureInfo.certRevoked);
        boolean z = this.mState.mTrackOldChangeHolders;
        CallResult callResult = this.mViewInfoStore;
        if (z && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            ((LongSparseArray) callResult.serviceNames).put(viewHolder, getChangedHolderKey(viewHolder));
        }
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) callResult.result;
        ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) simpleArrayMap.get(viewHolder);
        if (viewInfoStore$InfoRecord == null) {
            viewInfoStore$InfoRecord = ViewInfoStore$InfoRecord.obtain();
            simpleArrayMap.put(viewHolder, viewInfoStore$InfoRecord);
        }
        viewInfoStore$InfoRecord.preInfo = viewport;
        viewInfoStore$InfoRecord.flags |= 4;
    }

    public final void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final int releaseHorizontalGlow(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = DECELERATION_RATE;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != DECELERATION_RATE) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.mRightGlow;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float onPullDistance = EdgeEffectCompat.onPullDistance(edgeEffect3, width, height);
                    if (EdgeEffectCompat.getDistance(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = onPullDistance;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.mLeftGlow;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.onPullDistance(edgeEffect4, -width, 1.0f - height);
                if (EdgeEffectCompat.getDistance(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int releaseVerticalGlow$1(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = DECELERATION_RATE;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != DECELERATION_RATE) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.mBottomGlow;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float onPullDistance = EdgeEffectCompat.onPullDistance(edgeEffect3, height, 1.0f - width);
                    if (EdgeEffectCompat.getDistance(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = onPullDistance;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.onPullDistance(edgeEffect4, -height, width);
                if (EdgeEffectCompat.getDistance(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                Path$$ExternalSyntheticBUOutline0.m(sb, (Object) exceptionLabel());
                return;
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            Path$$ExternalSyntheticBUOutline0.m(sb2, (Object) exceptionLabel());
            return;
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public final void removeItemDecoration(ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.mItemDecorations;
        arrayList.remove(itemDecoration);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        LinearSmoothScroller linearSmoothScroller = this.mLayout.mSmoothScroller;
        if ((linearSmoothScroller == null || !linearSmoothScroller.mRunning) && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.mTempRect;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect2 = layoutParams2.mDecorInsets;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.mOnItemTouchListeners;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((OnItemTouchListener) arrayList.get(i)).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i = 0;
            }
            if (!canScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        float f;
        boolean z2;
        consumePendingUpdateOperations();
        Adapter adapter = this.mAdapter;
        int[] iArr = this.mReusableIntPair;
        if (adapter != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            i5 = i9;
            i6 = i - i8;
            i7 = i2 - i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        getScrollingChildHelper().dispatchNestedScrollInternal(i4, this.mScrollOffset, i5, i6, i7, iArr, i3);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr2 = this.mScrollOffset;
        int i15 = iArr2[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr2[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr3 = this.mNestedOffsets;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || MotionEventCompat.isFromSource(motionEvent, 8194)) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f2 = i11;
                float y = motionEvent.getY();
                float f3 = i13;
                if (f2 < DECELERATION_RATE) {
                    ensureLeftGlow();
                    f = 0.0f;
                    z = true;
                    EdgeEffectCompat.onPullDistance(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    f = 0.0f;
                    z = true;
                    if (f2 > DECELERATION_RATE) {
                        ensureRightGlow();
                        EdgeEffectCompat.onPullDistance(this.mRightGlow, f2 / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                        if (f3 >= f) {
                            ensureTopGlow();
                            EdgeEffectCompat.onPullDistance(this.mTopGlow, (-f3) / getHeight(), x / getWidth());
                        } else {
                            if (f3 > f) {
                                ensureBottomGlow();
                                EdgeEffectCompat.onPullDistance(this.mBottomGlow, f3 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z2 || f2 != f || f3 != f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && MotionEventCompat.isFromSource(motionEvent, 4194304)) {
                                releaseGlows();
                            }
                        }
                        z2 = z;
                        if (!z2) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            releaseGlows();
                        }
                    }
                }
                z2 = z;
                if (f3 >= f) {
                }
                z2 = z;
                if (!z2) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void scrollStep(int i, int i2, int[] iArr) {
        ViewHolder viewHolder;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection("RV Scroll");
        State state = this.mState;
        fillRemainingScrollValues(state);
        Recycler recycler = this.mRecycler;
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, recycler, state) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, recycler, state) : 0;
        Trace.endSection();
        TraceParser traceParser = this.mChildHelper;
        int childCount = traceParser.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = traceParser.getChildAt(i3);
            ViewHolder childViewHolder = getChildViewHolder(childAt);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = childAt.getLeft();
                int top = childAt.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        onExitLayoutOrScroll(true);
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        Adapter adapter2 = this.mAdapter;
        CashRecyclerView$observer$1 cashRecyclerView$observer$1 = this.mObserver;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(cashRecyclerView$observer$1);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        Recycler recycler = this.mRecycler;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(recycler);
            this.mLayout.removeAndRecycleScrapInt(recycler);
        }
        recycler.mAttachedScrap.clear();
        recycler.recycleAndClearCachedViews();
        AdapterHelper adapterHelper = this.mAdapterHelper;
        adapterHelper.recycleUpdateOpsAndClearList((ArrayList) adapterHelper.mPendingUpdates);
        adapterHelper.recycleUpdateOpsAndClearList((ArrayList) adapterHelper.mPostponedList);
        adapterHelper.mExistingUpdateTypes = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(cashRecyclerView$observer$1);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager2 = this.mLayout;
        if (layoutManager2 != null) {
            layoutManager2.onAdapterChanged();
        }
        Adapter adapter4 = this.mAdapter;
        recycler.mAttachedScrap.clear();
        recycler.recycleAndClearCachedViews();
        recycler.poolingContainerDetach(adapter3, true);
        RecycledViewPool recycledViewPool = recycler.getRecycledViewPool();
        if (adapter3 != null) {
            recycledViewPool.mAttachCountForClearing--;
        }
        if (recycledViewPool.mAttachCountForClearing == 0) {
            SparseArray sparseArray = recycledViewPool.mScrap;
            for (int i = 0; i < sparseArray.size(); i++) {
                RecycledViewPool.ScrapData scrapData = (RecycledViewPool.ScrapData) sparseArray.valueAt(i);
                Iterator it = scrapData.mScrapHeap.iterator();
                while (it.hasNext()) {
                    Countries.callPoolingContainerOnRelease(((ViewHolder) it.next()).itemView);
                }
                scrapData.mScrapHeap.clear();
            }
        }
        if (adapter4 != null) {
            recycledViewPool.mAttachCountForClearing++;
        }
        recycler.maybeSendPoolingContainerAttach();
        this.mState.mStructureChanged = true;
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            this.mBottomGlow = null;
            this.mTopGlow = null;
            this.mRightGlow = null;
            this.mLeftGlow = null;
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.mEdgeEffectFactory = edgeEffectFactory;
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.mListener = null;
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.mListener = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        Recycler recycler = this.mRecycler;
        recycler.mRequestedCacheMax = i;
        recycler.updateViewCacheSize();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager2 = this.mLayout;
        Recycler recycler = this.mRecycler;
        if (layoutManager2 != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(recycler);
            this.mLayout.removeAndRecycleScrapInt(recycler);
            recycler.mAttachedScrap.clear();
            recycler.recycleAndClearCachedViews();
            if (this.mIsAttached) {
                LayoutManager layoutManager3 = this.mLayout;
                layoutManager3.mIsAttachedToWindow = false;
                layoutManager3.onDetachedFromWindow(this);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            recycler.mAttachedScrap.clear();
            recycler.recycleAndClearCachedViews();
        }
        TraceParser traceParser = this.mChildHelper;
        ((HeadersReader) traceParser.projectPackages).reset();
        ArrayList arrayList = (ArrayList) traceParser.currentThread;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = RecyclerView.this;
            if (size < 0) {
                break;
            }
            ViewHolder childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(layoutManager);
                Handlers$$ExternalSyntheticBUOutline0.m(sb, " is already attached to a RecyclerView:", layoutManager.mRecyclerView.exceptionLabel());
                return;
            } else {
                layoutManager.setRecyclerView(this);
                if (this.mIsAttached) {
                    LayoutManager layoutManager4 = this.mLayout;
                    layoutManager4.mIsAttachedToWindow = true;
                    layoutManager4.onAttachedToWindow(this);
                }
            }
        }
        recycler.updateViewCacheSize();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    public void setOnFlingListener(OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        Recycler recycler = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        recycler.poolingContainerDetach(recyclerView.mAdapter, false);
        if (recycler.mRecyclerPool != null) {
            r1.mAttachCountForClearing--;
        }
        recycler.mRecyclerPool = recycledViewPool;
        if (recycledViewPool != null && recyclerView.mAdapter != null) {
            recycledViewPool.mAttachCountForClearing++;
        }
        recycler.maybeSendPoolingContainerAttach();
    }

    @Deprecated
    public void setRecyclerListener(RecyclerListener recyclerListener) {
    }

    public final void setScrollState(int i) {
        LinearSmoothScroller linearSmoothScroller;
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "setting scroll state to ", " from ");
            m2m.append(this.mScrollState);
            Log.d("RecyclerView", m2m.toString(), new Exception());
        }
        this.mScrollState = i;
        if (i != 2) {
            ViewFlinger viewFlinger = this.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.mOverScroller.abortAnimation();
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null && (linearSmoothScroller = layoutManager.mSmoothScroller) != null) {
                linearSmoothScroller.stop();
            }
        }
        LayoutManager layoutManager2 = this.mLayout;
        if (layoutManager2 != null) {
            layoutManager2.onScrollStateChanged(i);
        }
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        ArrayList arrayList = this.mScrollListeners;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
        this.mRecycler.getClass();
    }

    public final boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float distance = EdgeEffectCompat.getDistance(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.mPhysicalCoef * 0.015f;
        double log = Math.log(abs / f);
        double d = DECELERATION_RATE;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < distance;
    }

    public final void smoothScrollBy$1(int i, int i2, boolean z) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().startNestedScroll(i3, 1);
        }
        this.mViewFlinger.smoothScrollBy(i, i2, PKIFailureInfo.systemUnavail, null);
    }

    public final void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public final void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().startNestedScroll(i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startNestedScrollForType(int i) {
        boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
        int i2 = canScrollHorizontally;
        if (this.mLayout.canScrollVertically()) {
            i2 = (canScrollHorizontally ? 1 : 0) | 2;
        }
        getScrollingChildHelper().startNestedScroll(i2, i);
    }

    public final void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                a$$ExternalSyntheticBUOutline0.m$1("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(exceptionLabel()));
                return;
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll(0);
    }

    public final void stopScroll() {
        LinearSmoothScroller linearSmoothScroller;
        setScrollState(0);
        ViewFlinger viewFlinger = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(viewFlinger);
        viewFlinger.mOverScroller.abortAnimation();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || (linearSmoothScroller = layoutManager.mSmoothScroller) == null) {
            return;
        }
        linearSmoothScroller.stop();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public abstract class AdapterDataObserver {
        public abstract void onChanged();

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }

        public abstract void onItemRangeInserted(int i, int i2);

        public void onItemRangeMoved(int i, int i2) {
        }

        public abstract void onItemRangeRemoved(int i, int i2);

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }
    }

    public abstract class ItemDecoration {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).mViewHolder.getLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
    }

    public abstract class Adapter {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class StateRestorationPolicy {
            public static final /* synthetic */ StateRestorationPolicy[] $VALUES;
            public static final StateRestorationPolicy ALLOW;
            public static final StateRestorationPolicy PREVENT_WHEN_EMPTY;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                ALLOW = stateRestorationPolicy;
                StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
                PREVENT_WHEN_EMPTY = stateRestorationPolicy2;
                $VALUES = new StateRestorationPolicy[]{stateRestorationPolicy, stateRestorationPolicy2, new StateRestorationPolicy("PREVENT", 2)};
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) $VALUES.clone();
            }
        }

        public final void bindViewHolder(ViewHolder viewHolder, int i) {
            boolean z = viewHolder.mBindingAdapter == null;
            if (z) {
                viewHolder.mPosition = i;
                if (hasStableIds()) {
                    viewHolder.mItemId = getItemId(i);
                }
                viewHolder.setFlags(1, 519);
                if (Trace.isEnabled()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(viewHolder.mItemViewType)));
                }
            }
            viewHolder.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (viewHolder.itemView.getParent() == null && viewHolder.itemView.isAttachedToWindow() != viewHolder.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + viewHolder.isTmpDetached() + ", attached to window: " + viewHolder.itemView.isAttachedToWindow() + ", holder: " + viewHolder);
                }
                if (viewHolder.itemView.getParent() == null && viewHolder.itemView.isAttachedToWindow()) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(viewHolder, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return;
                }
            }
            onBindViewHolder(viewHolder, i, viewHolder.getUnmodifiedPayloads());
            if (z) {
                viewHolder.clearPayload();
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).mInsetsDirty = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return false;
                }
            } else if (getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final ViewHolder createViewHolder(ViewGroup viewGroup, int i) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
                }
                ViewHolder onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            } finally {
                Trace.endSection();
            }
        }

        public int findRelativeAdapterPositionIn(Adapter adapter, ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.notifyItemRangeChanged(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.notifyItemRangeInserted(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.notifyItemMoved(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.notifyItemRangeChanged(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.notifyItemRangeInserted(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.notifyItemRangeRemoved(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.notifyItemRangeRemoved(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i);

        public void onBindViewHolder(ViewHolder viewHolder, int i, List<Object> list) {
            onBindViewHolder(viewHolder, i);
        }

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(ViewHolder viewHolder) {
            return false;
        }

        public void onViewAttachedToWindow(ViewHolder viewHolder) {
        }

        public void onViewDetachedFromWindow(ViewHolder viewHolder) {
        }

        public void onViewRecycled(ViewHolder viewHolder) {
        }

        public void registerAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.mHasStableIds = z;
            }
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.notifyStateRestorationPolicyChanged();
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.notifyItemRangeChanged(i, i2, obj);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.notifyItemRangeChanged(i, 1, obj);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public final Rect mDecorInsets;
        public boolean mInsetsDirty;
        public boolean mPendingInvalidate;
        public ViewHolder mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        a$$ExternalSyntheticBUOutline0.m$1("RecyclerView has no LayoutManager".concat(exceptionLabel()));
        return null;
    }

    public abstract class LayoutManager {
        public TraceParser mChildHelper;
        public int mHeight;
        public int mHeightMode;
        public final AndroidSvg mHorizontalBoundCheck;
        public boolean mIsAttachedToWindow;
        public final boolean mItemPrefetchEnabled;
        public final boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;
        public LinearSmoothScroller mSmoothScroller;
        public final AndroidSvg mVerticalBoundCheck;
        public int mWidth;
        public int mWidthMode;

        public final class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        public LayoutManager() {
            ViewBoundsCheck$Callback viewBoundsCheck$Callback = new ViewBoundsCheck$Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final View getChildAt(int i) {
                    return LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getChildEnd(View view) {
                    return LayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getChildStart(View view) {
                    return LayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getParentEnd() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.mWidth - layoutManager.getPaddingRight();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getParentStart() {
                    return LayoutManager.this.getPaddingLeft();
                }
            };
            ViewBoundsCheck$Callback viewBoundsCheck$Callback2 = new ViewBoundsCheck$Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final View getChildAt(int i) {
                    return LayoutManager.this.getChildAt(i);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getChildEnd(View view) {
                    return LayoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getChildStart(View view) {
                    return LayoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getParentEnd() {
                    LayoutManager layoutManager = LayoutManager.this;
                    return layoutManager.mHeight - layoutManager.getPaddingBottom();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck$Callback
                public final int getParentStart() {
                    return LayoutManager.this.getPaddingTop();
                }
            };
            this.mHorizontalBoundCheck = new AndroidSvg(viewBoundsCheck$Callback);
            this.mVerticalBoundCheck = new AndroidSvg(viewBoundsCheck$Callback2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r6 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(boolean z, int i, int i2, int i3, int i4) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            } else {
                                i4 = max;
                                i2 = 0;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static int getDecoratedBottom(View view) {
            return view.getBottom() + ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public static int getDecoratedLeft(View view) {
            return view.getLeft() - ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public static int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int getDecoratedRight(View view) {
            return view.getRight() + ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public static int getDecoratedTop(View view) {
            return view.getTop() - ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public static int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).mViewHolder.getLayoutPosition();
        }

        public static Properties getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, i2);
            properties.orientation = obtainStyledAttributes.getInt(0, 1);
            properties.spanCount = obtainStyledAttributes.getInt(10, 1);
            properties.reverseLayout = obtainStyledAttributes.getBoolean(9, false);
            properties.stackFromEnd = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public final void addViewInt(View view, int i, boolean z) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.mRecyclerView.mViewInfoStore.result;
                ViewInfoStore$InfoRecord viewInfoStore$InfoRecord = (ViewInfoStore$InfoRecord) simpleArrayMap.get(childViewHolderInt);
                if (viewInfoStore$InfoRecord == null) {
                    viewInfoStore$InfoRecord = ViewInfoStore$InfoRecord.obtain();
                    simpleArrayMap.put(childViewHolderInt, viewInfoStore$InfoRecord);
                }
                viewInfoStore$InfoRecord.flags |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
            } else {
                ViewParent parent = view.getParent();
                RecyclerView recyclerView = this.mRecyclerView;
                TraceParser traceParser = this.mChildHelper;
                if (parent == recyclerView) {
                    HeadersReader headersReader = (HeadersReader) traceParser.projectPackages;
                    int indexOfChild = RecyclerView.this.indexOfChild(view);
                    int countOnesBefore = (indexOfChild == -1 || headersReader.get(indexOfChild)) ? -1 : indexOfChild - headersReader.countOnesBefore(indexOfChild);
                    if (i == -1) {
                        i = this.mChildHelper.getChildCount();
                    }
                    if (countOnesBefore == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                    }
                    if (countOnesBefore != i) {
                        LayoutManager layoutManager = this.mRecyclerView.mLayout;
                        View childAt = layoutManager.getChildAt(countOnesBefore);
                        if (childAt == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + countOnesBefore + layoutManager.mRecyclerView.toString());
                        }
                        layoutManager.getChildAt(countOnesBefore);
                        layoutManager.mChildHelper.detachViewFromParent(countOnesBefore);
                        LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                        ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(childAt);
                        boolean isRemoved = childViewHolderInt2.isRemoved();
                        RecyclerView recyclerView2 = layoutManager.mRecyclerView;
                        if (isRemoved) {
                            SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) recyclerView2.mViewInfoStore.result;
                            ViewInfoStore$InfoRecord viewInfoStore$InfoRecord2 = (ViewInfoStore$InfoRecord) simpleArrayMap2.get(childViewHolderInt2);
                            if (viewInfoStore$InfoRecord2 == null) {
                                viewInfoStore$InfoRecord2 = ViewInfoStore$InfoRecord.obtain();
                                simpleArrayMap2.put(childViewHolderInt2, viewInfoStore$InfoRecord2);
                            }
                            viewInfoStore$InfoRecord2.flags = 1 | viewInfoStore$InfoRecord2.flags;
                        } else {
                            recyclerView2.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt2);
                        }
                        layoutManager.mChildHelper.attachViewToParent(childAt, i, layoutParams2, childViewHolderInt2.isRemoved());
                    }
                } else {
                    traceParser.addView(view, i, false);
                    layoutParams.mInsetsDirty = true;
                    LinearSmoothScroller linearSmoothScroller = this.mSmoothScroller;
                    if (linearSmoothScroller != null && linearSmoothScroller.mRunning) {
                        linearSmoothScroller.mRecyclerView.getClass();
                        ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(view);
                        if ((childViewHolderInt3 != null ? childViewHolderInt3.getLayoutPosition() : -1) == linearSmoothScroller.mTargetPosition) {
                            linearSmoothScroller.mTargetView = view;
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "smooth scroll target view has been attached");
                            }
                        }
                    }
                }
            }
            if (layoutParams.mPendingInvalidate) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + layoutParams.mViewHolder);
                }
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public abstract boolean canScrollHorizontally();

        public abstract boolean canScrollVertically();

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, State state, CircularIntArray circularIntArray) {
        }

        public void collectInitialPrefetchPositions(int i, CircularIntArray circularIntArray) {
        }

        public abstract int computeHorizontalScrollExtent(State state);

        public abstract int computeHorizontalScrollOffset(State state);

        public abstract int computeHorizontalScrollRange(State state);

        public abstract int computeVerticalScrollExtent(State state);

        public abstract int computeVerticalScrollOffset(State state);

        public abstract int computeVerticalScrollRange(State state);

        public final void detachAndScrapAttachedViews(Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt.shouldIgnore()) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                    }
                } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.mRecyclerView.mAdapter.hasStableIds()) {
                    getChildAt(childCount);
                    this.mChildHelper.detachViewFromParent(childCount);
                    recycler.scrapView(childAt);
                    this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
                } else {
                    removeViewAt(childCount);
                    recycler.recycleViewHolderInternal(childViewHolderInt);
                }
            }
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.mInPreLayout || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public final View getChildAt(int i) {
            TraceParser traceParser = this.mChildHelper;
            if (traceParser != null) {
                return traceParser.getChildAt(i);
            }
            return null;
        }

        public final int getChildCount() {
            TraceParser traceParser = this.mChildHelper;
            if (traceParser != null) {
                return traceParser.getChildCount();
            }
            return 0;
        }

        public int getColumnCountForAccessibility(Recycler recycler, State state) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public void getDecoratedBoundsWithMargins(Rect rect, View view) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(rect, view);
        }

        public final int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.mAdapter : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public final int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getRowCountForAccessibility(Recycler recycler, State state) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public final void getTransformedBoundingBox(Rect rect, View view) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public abstract boolean isAutoMeasureEnabled();

        public boolean isLayoutReversed() {
            return false;
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int childCount = recyclerView.mChildHelper.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    recyclerView.mChildHelper.getChildAt(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int childCount = recyclerView.mChildHelper.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    recyclerView.mChildHelper.getChildAt(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void onAdapterChanged() {
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public abstract void onDetachedFromWindow(RecyclerView recyclerView);

        public abstract View onFocusSearchFailed(View view, int i, Recycler recycler, State state);

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            Recycler recycler = recyclerView.mRecycler;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(PKIFailureInfo.certRevoked);
                accessibilityNodeInfoCompat.setScrollable(true);
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
                }
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
                }
            }
            accessibilityNodeInfoCompat.setCollectionInfo(Toolbar.AnonymousClass1.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), 0));
        }

        public final void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            TraceParser traceParser = this.mChildHelper;
            if (((ArrayList) traceParser.currentThread).contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void onItemsAdded(int i, int i2) {
        }

        public void onItemsChanged() {
        }

        public void onItemsMoved(int i, int i2) {
        }

        public void onItemsRemoved(int i, int i2) {
        }

        public void onItemsUpdated(int i, int i2) {
        }

        public abstract void onLayoutChildren(Recycler recycler, State state);

        public abstract void onLayoutCompleted(State state);

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean performAccessibilityAction(Recycler recycler, State state, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f;
            if (this.mRecyclerView != null) {
                int i2 = this.mHeight;
                int i3 = this.mWidth;
                Rect rect = new Rect();
                if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                    i2 = rect.height();
                    i3 = rect.width();
                }
                if (i != 4096) {
                    if (i != 8192) {
                        paddingTop = 0;
                        paddingLeft = 0;
                    } else {
                        paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((i2 - getPaddingTop()) - getPaddingBottom()) : 0;
                        if (this.mRecyclerView.canScrollHorizontally(-1)) {
                            paddingLeft = -((i3 - getPaddingLeft()) - getPaddingRight());
                        }
                        paddingLeft = 0;
                    }
                    if (paddingTop == 0 || paddingLeft != 0) {
                        if (bundle != null) {
                            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                            if (f < RecyclerView.DECELERATION_RATE) {
                                if (RecyclerView.sDebugAssertionsEnabled) {
                                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(f, "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", ")"));
                                    return false;
                                }
                            }
                        } else {
                            f = 1.0f;
                        }
                        if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                            if (Float.compare(1.0f, f) != 0 && Float.compare(RecyclerView.DECELERATION_RATE, f) != 0) {
                                paddingLeft = (int) (paddingLeft * f);
                                paddingTop = (int) (paddingTop * f);
                            }
                            this.mRecyclerView.smoothScrollBy$1(paddingLeft, paddingTop, true);
                            return true;
                        }
                        RecyclerView recyclerView = this.mRecyclerView;
                        Adapter adapter = recyclerView.mAdapter;
                        if (adapter != null) {
                            if (i == 4096) {
                                recyclerView.smoothScrollToPosition(adapter.getItemCount() - 1);
                                return true;
                            }
                            if (i != 8192) {
                                return true;
                            }
                            recyclerView.smoothScrollToPosition(0);
                            return true;
                        }
                    }
                } else {
                    paddingTop = this.mRecyclerView.canScrollVertically(1) ? (i2 - getPaddingTop()) - getPaddingBottom() : 0;
                    if (this.mRecyclerView.canScrollHorizontally(1)) {
                        paddingLeft = (i3 - getPaddingLeft()) - getPaddingRight();
                        if (paddingTop == 0) {
                        }
                        if (bundle != null) {
                        }
                        if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                        }
                    }
                    paddingLeft = 0;
                    if (paddingTop == 0) {
                    }
                    if (bundle != null) {
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    }
                }
            }
            return false;
        }

        public final void removeAndRecycleAllViews(Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    View childAt = getChildAt(childCount);
                    removeViewAt(childCount);
                    recycler.recycleView(childAt);
                }
            }
        }

        public final void removeAndRecycleScrapInt(Recycler recycler) {
            ArrayList arrayList;
            int size = recycler.mAttachedScrap.size();
            int i = size - 1;
            while (true) {
                arrayList = recycler.mAttachedScrap;
                if (i < 0) {
                    break;
                }
                View view = ((ViewHolder) arrayList.get(i)).itemView;
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    recycler.recycleViewHolderInternal(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList arrayList2 = recycler.mChangedScrap;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public final void removeAndRecycleView(View view, Recycler recycler) {
            TraceParser traceParser = this.mChildHelper;
            AnonymousClass7 anonymousClass7 = (AnonymousClass7) traceParser.logger;
            int i = traceParser.state;
            if (i == 1) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i == 2) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                traceParser.state = 1;
                traceParser.threadAttrs = view;
                int indexOfChild = RecyclerView.this.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (((HeadersReader) traceParser.projectPackages).remove(indexOfChild)) {
                        traceParser.unhideViewInternal(view);
                    }
                    anonymousClass7.removeViewAt(indexOfChild);
                }
                traceParser.state = 0;
                traceParser.threadAttrs = null;
                recycler.recycleView(view);
            } catch (Throwable th) {
                traceParser.state = 0;
                traceParser.threadAttrs = null;
                throw th;
            }
        }

        public final void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                TraceParser traceParser = this.mChildHelper;
                AnonymousClass7 anonymousClass7 = (AnonymousClass7) traceParser.logger;
                int i2 = traceParser.state;
                if (i2 == 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot call removeView(At) within removeView(At)");
                    return;
                }
                if (i2 == 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot call removeView(At) within removeViewIfHidden");
                    return;
                }
                try {
                    int offset = traceParser.getOffset(i);
                    View childAt = RecyclerView.this.getChildAt(offset);
                    if (childAt == null) {
                        traceParser.state = 0;
                        traceParser.threadAttrs = null;
                        return;
                    }
                    traceParser.state = 1;
                    traceParser.threadAttrs = childAt;
                    if (((HeadersReader) traceParser.projectPackages).remove(offset)) {
                        traceParser.unhideViewInternal(childAt);
                    }
                    anonymousClass7.removeViewAt(offset);
                    traceParser.state = 0;
                    traceParser.threadAttrs = null;
                } catch (Throwable th) {
                    traceParser.state = 0;
                    traceParser.threadAttrs = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
        
            if ((r5.bottom - r10) > r2) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.mWidth - getPaddingRight();
            int paddingBottom = this.mHeight - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - paddingRight;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - paddingBottom);
            if (this.mRecyclerView.getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            int[] iArr = {max, min2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int paddingRight2 = this.mWidth - getPaddingRight();
                    int paddingBottom2 = this.mHeight - getPaddingBottom();
                    Rect rect2 = this.mRecyclerView.mTempRect;
                    getDecoratedBoundsWithMargins(rect2, focusedChild);
                    if (rect2.left - i4 < paddingRight2) {
                        if (rect2.right - i4 > paddingLeft2) {
                            if (rect2.top - i5 < paddingBottom2) {
                            }
                        }
                    }
                }
                return false;
            }
            if (i4 != 0 || i5 != 0) {
                if (z) {
                    recyclerView.scrollBy(i4, i5);
                    return true;
                }
                recyclerView.smoothScrollBy$1(i4, i5, false);
                return true;
            }
            return false;
        }

        public final void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int scrollHorizontallyBy(int i, Recycler recycler, State state);

        public abstract void scrollToPosition(int i);

        public abstract int scrollVerticallyBy(int i, Recycler recycler, State state);

        public final void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            this.mRecyclerView.setMeasuredDimension(chooseSize(i, paddingRight, recyclerView.getMinimumWidth()), chooseSize(i2, paddingBottom, this.mRecyclerView.getMinimumHeight()));
        }

        public final void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = PKIFailureInfo.systemUnavail;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(rect, childAt);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public final void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public final boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public final boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public abstract void smoothScrollToPosition(RecyclerView recyclerView, State state, int i);

        public final void startSmoothScroll(LinearSmoothScroller linearSmoothScroller) {
            LinearSmoothScroller linearSmoothScroller2 = this.mSmoothScroller;
            if (linearSmoothScroller2 != null && linearSmoothScroller != linearSmoothScroller2 && linearSmoothScroller2.mRunning) {
                linearSmoothScroller2.stop();
            }
            this.mSmoothScroller = linearSmoothScroller;
            RecyclerView recyclerView = this.mRecyclerView;
            ViewFlinger viewFlinger = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.mOverScroller.abortAnimation();
            if (linearSmoothScroller.mStarted) {
                Log.w("RecyclerView", "An instance of " + linearSmoothScroller.getClass().getSimpleName() + " was started more than once. Each instance of" + linearSmoothScroller.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            linearSmoothScroller.mRecyclerView = recyclerView;
            linearSmoothScroller.mLayoutManager = this;
            int i = linearSmoothScroller.mTargetPosition;
            if (i == -1) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid target position");
                return;
            }
            recyclerView.mState.mTargetPosition = i;
            linearSmoothScroller.mRunning = true;
            linearSmoothScroller.mPendingInitialRun = true;
            linearSmoothScroller.mTargetView = recyclerView.mLayout.findViewByPosition(i);
            linearSmoothScroller.mRecyclerView.mViewFlinger.postOnAnimation();
            linearSmoothScroller.mStarted = true;
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(false, canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1));
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
