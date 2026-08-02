package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.LongSparseArray;
import androidx.core.provider.CallbackWrapper$2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlParser;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R$styleable;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.adapter.StatefulAdapter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.fillr.m1;
import com.fillr.n;
import java.util.ArrayList;
import java.util.WeakHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ViewPager2 extends ViewGroup {
    public n mAccessibilityProvider;
    public int mCurrentItem;
    public final AnonymousClass1 mCurrentItemDataSetChangeObserver;
    public boolean mCurrentItemDirty;
    public final CompositeOnPageChangeCallback mExternalPageChangeCallbacks;
    public Toolbar.AnonymousClass1 mFakeDragger;
    public LinearLayoutManagerImpl mLayoutManager;
    public int mOffscreenPageLimit;
    public CompositeOnPageChangeCallback mPageChangeEventDispatcher;
    public PageTransformerAdapter mPageTransformerAdapter;
    public PagerSnapHelperImpl mPagerSnapHelper;
    public Parcelable mPendingAdapterState;
    public int mPendingCurrentItem;
    public RecyclerViewImpl mRecyclerView;
    public RecyclerView.ItemAnimator mSavedItemAnimator;
    public boolean mSavedItemAnimatorPresent;
    public ScrollEventAdapter mScrollEventAdapter;
    public final Rect mTmpChildRect;
    public final Rect mTmpContainerRect;
    public boolean mUserInputEnabled;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$4, reason: invalid class name */
    public final class AnonymousClass4 implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewAttachedToWindow(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Pages must fill the whole ViewPager2 (use match_parent)");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewDetachedFromWindow(View view) {
        }
    }

    public final class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            int width;
            int paddingRight;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = viewPager2.mOffscreenPageLimit;
            if (i == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            RecyclerViewImpl recyclerViewImpl = viewPager2.mRecyclerView;
            if (viewPager2.mLayoutManager.mOrientation == 1) {
                width = recyclerViewImpl.getHeight() - recyclerViewImpl.getPaddingTop();
                paddingRight = recyclerViewImpl.getPaddingBottom();
            } else {
                width = recyclerViewImpl.getWidth() - recyclerViewImpl.getPaddingLeft();
                paddingRight = recyclerViewImpl.getPaddingRight();
            }
            int i2 = (width - paddingRight) * i;
            iArr[0] = i2;
            iArr[1] = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.mAccessibilityProvider.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i;
            int position;
            ViewPager2 viewPager2 = (ViewPager2) ViewPager2.this.mAccessibilityProvider.d;
            LinearLayoutManagerImpl linearLayoutManagerImpl = viewPager2.mLayoutManager;
            if (linearLayoutManagerImpl.mOrientation == 1) {
                linearLayoutManagerImpl.getClass();
                i = RecyclerView.LayoutManager.getPosition(view);
            } else {
                i = 0;
            }
            LinearLayoutManagerImpl linearLayoutManagerImpl2 = viewPager2.mLayoutManager;
            if (linearLayoutManagerImpl2.mOrientation == 1) {
                position = 0;
            } else {
                linearLayoutManagerImpl2.getClass();
                position = RecyclerView.LayoutManager.getPosition(view);
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(false, i, 1, position, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            ViewPager2.this.mAccessibilityProvider.getClass();
            return super.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    public abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public interface PageTransformer {
    }

    public final class PagerSnapHelperImpl extends PagerSnapHelper {
        public PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper
        public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
            Object obj = ViewPager2.this.mFakeDragger.this$0;
            return super.findSnapView(layoutManager);
        }
    }

    public final class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.mAccessibilityProvider.getClass();
            return "androidx.recyclerview.widget.RecyclerView";
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.mCurrentItem);
            accessibilityEvent.setToIndex(viewPager2.mCurrentItem);
            accessibilityEvent.setSource((ViewPager2) viewPager2.mAccessibilityProvider.d);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mUserInputEnabled && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mUserInputEnabled && super.onTouchEvent(motionEvent);
        }
    }

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(8);
        public Parcelable mAdapterState;
        public int mCurrentItem;
        public int mRecyclerViewId;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new AnonymousClass1(this, 0);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.mRecyclerView.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.mAccessibilityProvider.getClass();
        this.mAccessibilityProvider.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void initialize(Context context, AttributeSet attributeSet) {
        n nVar = new n();
        nVar.d = this;
        nVar.a = new Recorder.AnonymousClass6(nVar, 26);
        final int i = 1;
        nVar.b = new m1(nVar, i);
        this.mAccessibilityProvider = nVar;
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.mRecyclerView = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.mRecyclerView.setDescendantFocusability(PKIFailureInfo.unsupportedVersion);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.mLayoutManager = linearLayoutManagerImpl;
        this.mRecyclerView.setLayoutManager(linearLayoutManagerImpl);
        this.mRecyclerView.setScrollingTouchSlop(1);
        int[] iArr = R$styleable.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        final int i2 = 0;
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerViewImpl recyclerViewImpl2 = this.mRecyclerView;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            if (recyclerViewImpl2.mOnChildAttachStateListeners == null) {
                recyclerViewImpl2.mOnChildAttachStateListeners = new ArrayList();
            }
            recyclerViewImpl2.mOnChildAttachStateListeners.add(anonymousClass4);
            ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
            this.mScrollEventAdapter = scrollEventAdapter;
            this.mFakeDragger = new Toolbar.AnonymousClass1(scrollEventAdapter);
            PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
            this.mPagerSnapHelper = pagerSnapHelperImpl;
            pagerSnapHelperImpl.attachToRecyclerView(this.mRecyclerView);
            this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback();
            this.mPageChangeEventDispatcher = compositeOnPageChangeCallback;
            this.mScrollEventAdapter.mCallback = compositeOnPageChangeCallback;
            OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback(this) { // from class: androidx.viewpager2.widget.ViewPager2.2
                public final /* synthetic */ ViewPager2 this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i3) {
                    switch (i2) {
                        case 0:
                            if (i3 == 0) {
                                this.this$0.updateCurrentItem();
                                break;
                            }
                            break;
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void onPageSelected(int i3) {
                    int i4 = i2;
                    ViewPager2 viewPager2 = this.this$0;
                    switch (i4) {
                        case 0:
                            if (viewPager2.mCurrentItem != i3) {
                                viewPager2.mCurrentItem = i3;
                                viewPager2.mAccessibilityProvider.updatePageAccessibilityActions();
                                break;
                            }
                            break;
                        default:
                            viewPager2.clearFocus();
                            if (viewPager2.hasFocus()) {
                                viewPager2.mRecyclerView.requestFocus(2);
                                break;
                            }
                            break;
                    }
                }
            };
            OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback(this) { // from class: androidx.viewpager2.widget.ViewPager2.2
                public final /* synthetic */ ViewPager2 this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i3) {
                    switch (i) {
                        case 0:
                            if (i3 == 0) {
                                this.this$0.updateCurrentItem();
                                break;
                            }
                            break;
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void onPageSelected(int i3) {
                    int i4 = i;
                    ViewPager2 viewPager2 = this.this$0;
                    switch (i4) {
                        case 0:
                            if (viewPager2.mCurrentItem != i3) {
                                viewPager2.mCurrentItem = i3;
                                viewPager2.mAccessibilityProvider.updatePageAccessibilityActions();
                                break;
                            }
                            break;
                        default:
                            viewPager2.clearFocus();
                            if (viewPager2.hasFocus()) {
                                viewPager2.mRecyclerView.requestFocus(2);
                                break;
                            }
                            break;
                    }
                }
            };
            ((ArrayList) compositeOnPageChangeCallback.mCallbacks).add(onPageChangeCallback);
            ((ArrayList) this.mPageChangeEventDispatcher.mCallbacks).add(onPageChangeCallback2);
            n nVar2 = this.mAccessibilityProvider;
            RecyclerViewImpl recyclerViewImpl3 = this.mRecyclerView;
            nVar2.getClass();
            recyclerViewImpl3.setImportantForAccessibility(2);
            nVar2.c = new AnonymousClass1(nVar2, i);
            ViewPager2 viewPager2 = (ViewPager2) nVar2.d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.mPageChangeEventDispatcher.mCallbacks).add(this.mExternalPageChangeCallbacks);
            PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter();
            this.mPageTransformerAdapter = pageTransformerAdapter;
            ((ArrayList) this.mPageChangeEventDispatcher.mCallbacks).add(pageTransformerAdapter);
            RecyclerViewImpl recyclerViewImpl4 = this.mRecyclerView;
            attachViewToParent(recyclerViewImpl4, 0, recyclerViewImpl4.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.mAccessibilityProvider.d;
        RecyclerView.Adapter adapter = viewPager2.mRecyclerView.mAdapter;
        if (adapter != null) {
            if (viewPager2.mLayoutManager.mOrientation == 1) {
                i = adapter.getItemCount();
                i2 = 1;
            } else {
                i2 = adapter.getItemCount();
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Toolbar.AnonymousClass1.obtain(i, i2, 0).this$0);
        RecyclerView.Adapter adapter2 = viewPager2.mRecyclerView.mAdapter;
        if (adapter2 == null || (itemCount = adapter2.getItemCount()) == 0 || !viewPager2.mUserInputEnabled) {
            return;
        }
        if (viewPager2.mCurrentItem > 0) {
            accessibilityNodeInfo.addAction(PKIFailureInfo.certRevoked);
        }
        if (viewPager2.mCurrentItem < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.mTmpContainerRect;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.mTmpChildRect;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.mRecyclerView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.mCurrentItem;
        this.mPendingAdapterState = savedState.mAdapterState;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.mRecyclerView.getId();
        int i = this.mPendingCurrentItem;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.mCurrentItem = i;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
            return savedState;
        }
        Object obj = this.mRecyclerView.mAdapter;
        if (obj instanceof StatefulAdapter) {
            FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) ((StatefulAdapter) obj);
            fragmentStateAdapter.getClass();
            LongSparseArray longSparseArray = fragmentStateAdapter.mFragments;
            int size = longSparseArray.size();
            LongSparseArray longSparseArray2 = fragmentStateAdapter.mSavedStates;
            Bundle bundle = new Bundle(longSparseArray2.size() + size);
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                long keyAt = longSparseArray.keyAt(i2);
                Fragment fragment = (Fragment) longSparseArray.get(keyAt);
                if (fragment != null && fragment.isAdded()) {
                    fragmentStateAdapter.mFragmentManager.putFragment(bundle, fragment, Recorder$$ExternalSyntheticOutline2.m(keyAt, "f#"));
                }
            }
            for (int i3 = 0; i3 < longSparseArray2.size(); i3++) {
                long keyAt2 = longSparseArray2.keyAt(i3);
                if (fragmentStateAdapter.containsItem(keyAt2)) {
                    bundle.putParcelable(Recorder$$ExternalSyntheticOutline2.m(keyAt2, "s#"), (Parcelable) longSparseArray2.get(keyAt2));
                }
            }
            savedState.mAdapterState = bundle;
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.mAccessibilityProvider.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        n nVar = this.mAccessibilityProvider;
        nVar.getClass();
        if (i != 8192 && i != 4096) {
            Path$$ExternalSyntheticBUOutline0.m();
            return false;
        }
        ViewPager2 viewPager2 = (ViewPager2) nVar.d;
        int i2 = viewPager2.mCurrentItem;
        int i3 = i == 8192 ? i2 - 1 : i2 + 1;
        if (viewPager2.mUserInputEnabled) {
            viewPager2.setCurrentItemInternal(i3, true);
        }
        return true;
    }

    public final void registerOnPageChangeCallback(OnPageChangeCallback onPageChangeCallback) {
        ((ArrayList) this.mExternalPageChangeCallbacks.mCallbacks).add(onPageChangeCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void restorePendingState() {
        RecyclerView.Adapter adapter;
        Fragment findActiveFragment;
        if (this.mPendingCurrentItem == -1 || (adapter = this.mRecyclerView.mAdapter) == 0) {
            return;
        }
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) ((StatefulAdapter) adapter);
                LongSparseArray longSparseArray = fragmentStateAdapter.mFragments;
                LongSparseArray longSparseArray2 = fragmentStateAdapter.mSavedStates;
                if (!longSparseArray2.isEmpty() || !longSparseArray.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(fragmentStateAdapter.getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long parseLong = Long.parseLong(str.substring(2));
                        FragmentManager fragmentManager = fragmentStateAdapter.mFragmentManager;
                        fragmentManager.getClass();
                        String string2 = bundle.getString(str);
                        if (string2 == null) {
                            findActiveFragment = null;
                        } else {
                            findActiveFragment = fragmentManager.mFragmentStore.findActiveFragment(string2);
                            if (findActiveFragment == null) {
                                fragmentManager.throwException(new IllegalStateException(CameraSelector$$ExternalSyntheticOutline0.m("Fragment no longer exists for key ", str, ": unique id ", string2)));
                                throw null;
                            }
                        }
                        longSparseArray.put(findActiveFragment, parseLong);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            a$$ExternalSyntheticBUOutline0.m$3("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long parseLong2 = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (fragmentStateAdapter.containsItem(parseLong2)) {
                            longSparseArray2.put(savedState, parseLong2);
                        }
                    }
                }
                if (!longSparseArray.isEmpty()) {
                    fragmentStateAdapter.mHasStaleFragments = true;
                    fragmentStateAdapter.mIsInGracePeriod = true;
                    fragmentStateAdapter.gcFragments();
                    Handler handler = new Handler(Looper.getMainLooper());
                    Client.AnonymousClass7 anonymousClass7 = new Client.AnonymousClass7(fragmentStateAdapter, 14);
                    fragmentStateAdapter.mLifecycle.addObserver(new FragmentStateAdapter.AnonymousClass1(3, handler, anonymousClass7));
                    handler.postDelayed(anonymousClass7, 10000L);
                }
            }
            this.mPendingAdapterState = null;
        }
        int max = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
        this.mCurrentItem = max;
        this.mPendingCurrentItem = -1;
        this.mRecyclerView.scrollToPosition(max);
        this.mAccessibilityProvider.updatePageAccessibilityActions();
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.mAdapter;
        n nVar = this.mAccessibilityProvider;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver((AnonymousClass1) nVar.c);
        } else {
            nVar.getClass();
        }
        AnonymousClass1 anonymousClass1 = this.mCurrentItemDataSetChangeObserver;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(anonymousClass1);
        }
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        n nVar2 = this.mAccessibilityProvider;
        nVar2.updatePageAccessibilityActions();
        if (adapter != null) {
            adapter.registerAdapterDataObserver((AnonymousClass1) nVar2.c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(anonymousClass1);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        Object obj = this.mFakeDragger.this$0;
        setCurrentItemInternal(i, z);
    }

    public final void setCurrentItemInternal(int i, boolean z) {
        CompositeOnPageChangeCallback compositeOnPageChangeCallback;
        RecyclerView.Adapter adapter = this.mRecyclerView.mAdapter;
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i2 = this.mCurrentItem;
        if (min == i2 && this.mScrollEventAdapter.mScrollState == 0) {
            return;
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.mCurrentItem = min;
        this.mAccessibilityProvider.updatePageAccessibilityActions();
        ScrollEventAdapter scrollEventAdapter = this.mScrollEventAdapter;
        if (scrollEventAdapter.mScrollState != 0) {
            scrollEventAdapter.updateScrollEventValues();
            TtmlParser.FrameAndTickRate frameAndTickRate = scrollEventAdapter.mScrollValues;
            d = frameAndTickRate.subFrameRate + frameAndTickRate.effectiveFrameRate;
        }
        ScrollEventAdapter scrollEventAdapter2 = this.mScrollEventAdapter;
        scrollEventAdapter2.getClass();
        scrollEventAdapter2.mAdapterState = z ? 2 : 3;
        boolean z2 = scrollEventAdapter2.mTarget != min;
        scrollEventAdapter2.mTarget = min;
        scrollEventAdapter2.dispatchStateChanged(2);
        if (z2 && (compositeOnPageChangeCallback = scrollEventAdapter2.mCallback) != null) {
            compositeOnPageChangeCallback.onPageSelected(min);
        }
        if (!z) {
            this.mRecyclerView.scrollToPosition(min);
            return;
        }
        double d2 = min;
        double abs = Math.abs(d2 - d);
        RecyclerViewImpl recyclerViewImpl = this.mRecyclerView;
        if (abs <= 3.0d) {
            recyclerViewImpl.smoothScrollToPosition(min);
            return;
        }
        recyclerViewImpl.scrollToPosition(d2 > d ? min - 3 : min + 3);
        RecyclerViewImpl recyclerViewImpl2 = this.mRecyclerView;
        recyclerViewImpl2.post(new CallbackWrapper$2(min, recyclerViewImpl2));
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.updatePageAccessibilityActions();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            a$$ExternalSyntheticBUOutline0.m$3("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.mOffscreenPageLimit = i;
            this.mRecyclerView.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.mLayoutManager.setOrientation(i);
        this.mAccessibilityProvider.updatePageAccessibilityActions();
    }

    public void setPageTransformer(PageTransformer pageTransformer) {
        boolean z = this.mSavedItemAnimatorPresent;
        if (pageTransformer != null) {
            if (!z) {
                this.mSavedItemAnimator = this.mRecyclerView.mItemAnimator;
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator(null);
        } else if (z) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        this.mPageTransformerAdapter.getClass();
        if (pageTransformer == null) {
            return;
        }
        this.mPageTransformerAdapter.getClass();
        this.mPageTransformerAdapter.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.updatePageAccessibilityActions();
    }

    public final void updateCurrentItem() {
        PagerSnapHelperImpl pagerSnapHelperImpl = this.mPagerSnapHelper;
        if (pagerSnapHelperImpl == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Design assumption violated.");
            return;
        }
        View findSnapView = pagerSnapHelperImpl.findSnapView(this.mLayoutManager);
        if (findSnapView == null) {
            return;
        }
        this.mLayoutManager.getClass();
        int position = RecyclerView.LayoutManager.getPosition(findSnapView);
        if (position != this.mCurrentItem && this.mScrollEventAdapter.mScrollState == 0) {
            this.mPageChangeEventDispatcher.onPageSelected(position);
        }
        this.mCurrentItemDirty = false;
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$1, reason: invalid class name */
    public final class AnonymousClass1 extends RecyclerView.AdapterDataObserver {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    ViewPager2 viewPager2 = (ViewPager2) obj;
                    viewPager2.mCurrentItemDirty = true;
                    viewPager2.mScrollEventAdapter.mDataSetChangeHappened = true;
                    break;
                default:
                    ((n) obj).updatePageAccessibilityActions();
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new AnonymousClass1(this, 0);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new AnonymousClass1(this, 0);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback();
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new AnonymousClass1(this, 0);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }
}
