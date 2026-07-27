package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorDataStore {
    public int CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public final CatchingFishViewModelIntent CatchingFishCoroutine;
    public CatchingFishFABRobolectric CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public final boolean CatchingFishLayout;
    public int CatchingFishOkHttp;
    public CatchingFishAsyncTaskDagger CatchingFishParcelableFAB;
    public final CatchingFishViewModelIntent CatchingFishReduxKtor;
    public RecyclerView CatchingFishSnackbar;
    public int CatchingFishUnitTesting;
    public final boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishKtorDataStore() {
        CatchingFishRealmSnackbar catchingFishRealmSnackbar = new CatchingFishRealmSnackbar(this, 0);
        CatchingFishRealmSnackbar catchingFishRealmSnackbar2 = new CatchingFishRealmSnackbar(this, 1);
        this.CatchingFishCoroutine = new CatchingFishViewModelIntent(catchingFishRealmSnackbar);
        this.CatchingFishReduxKtor = new CatchingFishViewModelIntent(catchingFishRealmSnackbar2);
        this.CatchingFishWorkManager = false;
        this.CatchingFishViewModelScope = false;
        this.CatchingFishViewModelFAB = true;
        this.CatchingFishLayout = true;
    }

    public static int CatchingFishCardViewRealm(View view) {
        Rect rect = ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static boolean CatchingFishHandler(int i, int i2, int i3) {
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

    public static int CatchingFishPayPal(View view) {
        Rect rect = ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static void CatchingFishPayPalLiveData(View view, int i, int i2, int i3, int i4) {
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        Rect rect = catchingFishGradleDagger.CatchingFishSnackbar;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).bottomMargin);
    }

    public static int CatchingFishPayPalService(View view) {
        return ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishParcelableFAB.CatchingFishSnackbar();
    }

    public static CatchingFishAdMobEspresso CatchingFishSensorManager(Context context, AttributeSet attributeSet, int i, int i2) {
        CatchingFishAdMobEspresso catchingFishAdMobEspresso = new CatchingFishAdMobEspresso();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishMVIReduxAdMob.CatchingFishParcelableFAB, i, i2);
        catchingFishAdMobEspresso.CatchingFishParcelableFAB = obtainStyledAttributes.getInt(0, 1);
        catchingFishAdMobEspresso.CatchingFishSnackbar = obtainStyledAttributes.getInt(10, 1);
        catchingFishAdMobEspresso.CatchingFishCoroutine = obtainStyledAttributes.getBoolean(9, false);
        catchingFishAdMobEspresso.CatchingFishReduxKtor = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return catchingFishAdMobEspresso;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int CatchingFishSpannableWidget(boolean z, int i, int i2, int i3, int i4) {
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

    public static int CatchingFishViewModelScope(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    public CatchingFishGradleDagger CatchingFish(Context context, AttributeSet attributeSet) {
        return new CatchingFishGradleDagger(context, attributeSet);
    }

    public abstract int CatchingFishAnimationMockk(CatchingFishReduxGlide catchingFishReduxGlide);

    public abstract View CatchingFishAppCompat(View view, int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide);

    public abstract boolean CatchingFishCameraXIntent();

    public final int CatchingFishCardViewView() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        CatchingFishToolbarBundle adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.CatchingFishParcelableFAB();
        }
        return 0;
    }

    public abstract int CatchingFishCloudMessaging(CatchingFishReduxGlide catchingFishReduxGlide);

    public void CatchingFishCoroutine(String str) {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            recyclerView.CatchingFishLayout(str);
        }
    }

    public final View CatchingFishCoroutineFlow(int i) {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishParcelableFAB;
        if (catchingFishAsyncTaskDagger != null) {
            return catchingFishAsyncTaskDagger.CatchingFishMVPRobolectric(i);
        }
        return null;
    }

    public final int CatchingFishCustomView() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void CatchingFishDagger(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.CatchingFishSnackbar != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.CatchingFishSnackbar.CatchingFishOkHttp;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final int CatchingFishDaggerHiltFAB() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishParcelableFAB;
        if (catchingFishAsyncTaskDagger != null) {
            return catchingFishAsyncTaskDagger.CatchingFishCustomView();
        }
        return 0;
    }

    public Parcelable CatchingFishDaggerMVVM() {
        return null;
    }

    public abstract boolean CatchingFishDaggerWebsocket();

    public void CatchingFishDataStoreIntent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX = recyclerView.CatchingFishDaggerWebsocket;
        CatchingFishReduxGlide catchingFishReduxGlide = recyclerView.CatchingFishRedux;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.CatchingFishSnackbar.canScrollVertically(-1) && !this.CatchingFishSnackbar.canScrollHorizontally(-1) && !this.CatchingFishSnackbar.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        CatchingFishToolbarBundle catchingFishToolbarBundle = this.CatchingFishSnackbar.CatchingFishUnitTesting;
        if (catchingFishToolbarBundle != null) {
            accessibilityEvent.setItemCount(catchingFishToolbarBundle.CatchingFishParcelableFAB());
        }
    }

    public abstract void CatchingFishDynamicFeature(RecyclerView recyclerView, int i);

    public int CatchingFishEspressoMockk(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        return -1;
    }

    public abstract int CatchingFishEspressoTesting(CatchingFishReduxGlide catchingFishReduxGlide);

    public final void CatchingFishFABLayout(RecyclerView recyclerView) {
        CatchingFishGraphQLGlide(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void CatchingFishFirebase(View view, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX) {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishParcelableFAB;
        CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        int indexOfChild = catchingFishKtorPayPal.CatchingFishParcelableFAB.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((CatchingFishGradleMockk) catchingFishAsyncTaskDagger.CatchingFishWorkManager).CatchingFishWorkManager(indexOfChild)) {
                catchingFishAsyncTaskDagger.CatchingFishMockkOkHttp(view);
            }
            catchingFishKtorPayPal.CatchingFishViewModelFAB(indexOfChild);
        }
        catchingFishSnackbarCameraX.CatchingFishViewModelScope(view);
    }

    public final int CatchingFishFragmentFactory() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public abstract int CatchingFishFragmentHandler(CatchingFishReduxGlide catchingFishReduxGlide);

    public abstract int CatchingFishGlideWidgetKtor(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean CatchingFishGradleLiveData(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int CatchingFishFragmentFactory = CatchingFishFragmentFactory();
        int CatchingFishJobScheduler = CatchingFishJobScheduler();
        int CatchingFishMutableLiveData = this.CatchingFishUnitTesting - CatchingFishMutableLiveData();
        int CatchingFishCustomView = this.CatchingFishAnimationMockk - CatchingFishCustomView();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - CatchingFishFragmentFactory;
        int min = Math.min(0, i);
        int i2 = top - CatchingFishJobScheduler;
        int min2 = Math.min(0, i2);
        int i3 = width - CatchingFishMutableLiveData;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - CatchingFishCustomView);
        if (CatchingFishMVPRobolectric() != 1) {
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
                int CatchingFishFragmentFactory2 = CatchingFishFragmentFactory();
                int CatchingFishJobScheduler2 = CatchingFishJobScheduler();
                int CatchingFishMutableLiveData2 = this.CatchingFishUnitTesting - CatchingFishMutableLiveData();
                int CatchingFishCustomView2 = this.CatchingFishAnimationMockk - CatchingFishCustomView();
                Rect rect2 = this.CatchingFishSnackbar.CatchingFishCloudMessaging;
                CatchingFishGsonAppCompat(focusedChild, rect2);
                if (rect2.left - i4 < CatchingFishMutableLiveData2) {
                    if (rect2.right - i4 > CatchingFishFragmentFactory2) {
                        if (rect2.top - i5 < CatchingFishCustomView2) {
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
            recyclerView.CatchingFishStripeAPI(i4, i5, false);
            return true;
        }
        return false;
    }

    public void CatchingFishGradleManifest(int i) {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            int CatchingFishCustomView = recyclerView.CatchingFishViewModelFAB.CatchingFishCustomView();
            for (int i2 = 0; i2 < CatchingFishCustomView; i2++) {
                recyclerView.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(i2).offsetLeftAndRight(i);
            }
        }
    }

    public final void CatchingFishGraphQLGlide(int i, int i2) {
        this.CatchingFishUnitTesting = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.CatchingFishEspressoTesting = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.CatchingFishMVPReduxContext;
        }
        this.CatchingFishAnimationMockk = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.CatchingFishOkHttp = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.CatchingFishMVPReduxContext;
        }
    }

    public void CatchingFishGsonAppCompat(View view, Rect rect) {
        int[] iArr = RecyclerView.CatchingFishMVPReduxContext;
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        Rect rect2 = catchingFishGradleDagger.CatchingFishSnackbar;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).bottomMargin);
    }

    public CatchingFishGradleDagger CatchingFishJetpackCompose(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CatchingFishGradleDagger ? new CatchingFishGradleDagger((CatchingFishGradleDagger) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new CatchingFishGradleDagger((ViewGroup.MarginLayoutParams) layoutParams) : new CatchingFishGradleDagger(layoutParams);
    }

    public final int CatchingFishJobScheduler() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final void CatchingFishKtorService(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.CatchingFishSnackbar = null;
            this.CatchingFishParcelableFAB = null;
            this.CatchingFishUnitTesting = 0;
            this.CatchingFishAnimationMockk = 0;
        } else {
            this.CatchingFishSnackbar = recyclerView;
            this.CatchingFishParcelableFAB = recyclerView.CatchingFishViewModelFAB;
            this.CatchingFishUnitTesting = recyclerView.getWidth();
            this.CatchingFishAnimationMockk = recyclerView.getHeight();
        }
        this.CatchingFishEspressoTesting = 1073741824;
        this.CatchingFishOkHttp = 1073741824;
    }

    public boolean CatchingFishMVPReduxContext() {
        return false;
    }

    public final int CatchingFishMVPRobolectric() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        return recyclerView.getLayoutDirection();
    }

    public void CatchingFishMotionLayout(int i) {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            int CatchingFishCustomView = recyclerView.CatchingFishViewModelFAB.CatchingFishCustomView();
            for (int i2 = 0; i2 < CatchingFishCustomView; i2++) {
                recyclerView.CatchingFishViewModelFAB.CatchingFishMVPRobolectric(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final int CatchingFishMutableLiveData() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public abstract CatchingFishGradleDagger CatchingFishNavigation();

    public abstract void CatchingFishNavigationGson(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide);

    public abstract int CatchingFishOkHttp(CatchingFishReduxGlide catchingFishReduxGlide);

    public int CatchingFishParcelableFlux(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        return -1;
    }

    public final void CatchingFishPayPalHandler(CatchingFishFABRobolectric catchingFishFABRobolectric) {
        CatchingFishFABRobolectric catchingFishFABRobolectric2 = this.CatchingFishDaggerWebsocket;
        if (catchingFishFABRobolectric2 != null && catchingFishFABRobolectric != catchingFishFABRobolectric2 && catchingFishFABRobolectric2.CatchingFishDaggerWebsocket) {
            catchingFishFABRobolectric2.CatchingFishLayout();
        }
        this.CatchingFishDaggerWebsocket = catchingFishFABRobolectric;
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        CatchingFishDataStoreGradle catchingFishDataStoreGradle = recyclerView.CatchingFishMoshiDaggerHilt;
        catchingFishDataStoreGradle.CatchingFishFragmentHandler.removeCallbacks(catchingFishDataStoreGradle);
        catchingFishDataStoreGradle.CatchingFishWorkManager.abortAnimation();
        catchingFishFABRobolectric.CatchingFishSnackbar = recyclerView;
        catchingFishFABRobolectric.CatchingFishCoroutine = this;
        int i = catchingFishFABRobolectric.CatchingFishParcelableFAB;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.CatchingFishRedux.CatchingFishParcelableFAB = i;
        catchingFishFABRobolectric.CatchingFishDaggerWebsocket = true;
        catchingFishFABRobolectric.CatchingFishReduxKtor = true;
        catchingFishFABRobolectric.CatchingFishWorkManager = recyclerView.CatchingFishAnimationMockk.CatchingFishRoomDatabase(i);
        catchingFishFABRobolectric.CatchingFishSnackbar.CatchingFishMoshiDaggerHilt.CatchingFishParcelableFAB();
    }

    public final void CatchingFishPicasso(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX) {
        ArrayList arrayList = catchingFishSnackbarCameraX.CatchingFishParcelableFAB;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((CatchingFishPayPalCardView) arrayList.get(i)).CatchingFishParcelableFAB;
            CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
            if (!CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                CatchingFishSensorManager.CatchingFishUnitTesting(false);
                if (CatchingFishSensorManager.CatchingFishFragmentHandler()) {
                    this.CatchingFishSnackbar.removeDetachedView(view, false);
                }
                CatchingFishFluxAppCompat catchingFishFluxAppCompat = this.CatchingFishSnackbar.CatchingFishCameraXIntent;
                if (catchingFishFluxAppCompat != null) {
                    catchingFishFluxAppCompat.CatchingFishReduxKtor(CatchingFishSensorManager);
                }
                CatchingFishSensorManager.CatchingFishUnitTesting(true);
                CatchingFishPayPalCardView CatchingFishSensorManager2 = RecyclerView.CatchingFishSensorManager(view);
                CatchingFishSensorManager2.CatchingFishUnitTesting = null;
                CatchingFishSensorManager2.CatchingFishAnimationMockk = false;
                CatchingFishSensorManager2.CatchingFishFragmentHandler &= -33;
                catchingFishSnackbarCameraX.CatchingFishViewModelFAB(CatchingFishSensorManager2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = catchingFishSnackbarCameraX.CatchingFishSnackbar;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.CatchingFishSnackbar.invalidate();
        }
    }

    public final boolean CatchingFishRealmKtorRealm(View view, int i, int i2, CatchingFishGradleDagger catchingFishGradleDagger) {
        return (this.CatchingFishViewModelFAB && CatchingFishHandler(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).width) && CatchingFishHandler(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).height)) ? false : true;
    }

    public abstract void CatchingFishRecyclerView(RecyclerView recyclerView);

    public abstract void CatchingFishRedux(CatchingFishReduxGlide catchingFishReduxGlide);

    public abstract boolean CatchingFishReduxKtor();

    public final void CatchingFishReduxMoshi(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX) {
        for (int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB() - 1; CatchingFishDaggerHiltFAB >= 0; CatchingFishDaggerHiltFAB--) {
            if (!RecyclerView.CatchingFishSensorManager(CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB)).CatchingFishAnimationMockk()) {
                View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB);
                CatchingFishRetrofitMVI(CatchingFishDaggerHiltFAB);
                catchingFishSnackbarCameraX.CatchingFishViewModelScope(CatchingFishCoroutineFlow);
            }
        }
    }

    public final void CatchingFishRetrofit() {
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void CatchingFishRetrofitMVI(int i) {
        if (CatchingFishCoroutineFlow(i) != null) {
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishParcelableFAB;
            int CatchingFishEspressoMockk = catchingFishAsyncTaskDagger.CatchingFishEspressoMockk(i);
            CatchingFishKtorPayPal catchingFishKtorPayPal = (CatchingFishKtorPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
            View childAt = catchingFishKtorPayPal.CatchingFishParcelableFAB.getChildAt(CatchingFishEspressoMockk);
            if (childAt == null) {
                return;
            }
            if (((CatchingFishGradleMockk) catchingFishAsyncTaskDagger.CatchingFishWorkManager).CatchingFishWorkManager(CatchingFishEspressoMockk)) {
                catchingFishAsyncTaskDagger.CatchingFishMockkOkHttp(childAt);
            }
            catchingFishKtorPayPal.CatchingFishViewModelFAB(CatchingFishEspressoMockk);
        }
    }

    public View CatchingFishRoomDatabase(int i) {
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        for (int i2 = 0; i2 < CatchingFishDaggerHiltFAB; i2++) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i2);
            CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(CatchingFishCoroutineFlow);
            if (CatchingFishSensorManager != null && CatchingFishSensorManager.CatchingFishSnackbar() == i && !CatchingFishSensorManager.CatchingFishAnimationMockk() && (this.CatchingFishSnackbar.CatchingFishRedux.CatchingFishViewModelScope || !CatchingFishSensorManager.CatchingFishViewModelFAB())) {
                return CatchingFishCoroutineFlow;
            }
        }
        return null;
    }

    public abstract void CatchingFishServiceMVIJUnit(int i);

    public boolean CatchingFishSharedFlow() {
        return false;
    }

    public final void CatchingFishSnackbar(View view, int i, boolean z) {
        CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
        if (z || CatchingFishSensorManager.CatchingFishViewModelFAB()) {
            CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = (CatchingFishGraphQLRealmFAB) this.CatchingFishSnackbar.CatchingFishLayout.CatchingFishDaggerWebsocket;
            CatchingFishMoshiAndroidX catchingFishMoshiAndroidX = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB.get(CatchingFishSensorManager);
            if (catchingFishMoshiAndroidX == null) {
                catchingFishMoshiAndroidX = CatchingFishMoshiAndroidX.CatchingFishParcelableFAB();
                catchingFishGraphQLRealmFAB.put(CatchingFishSensorManager, catchingFishMoshiAndroidX);
            }
            catchingFishMoshiAndroidX.CatchingFishParcelableFAB |= 1;
        } else {
            this.CatchingFishSnackbar.CatchingFishLayout.CatchingFishPayPal(CatchingFishSensorManager);
        }
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        if (CatchingFishSensorManager.CatchingFishStateLiveData() || CatchingFishSensorManager.CatchingFishLayout()) {
            if (CatchingFishSensorManager.CatchingFishLayout()) {
                CatchingFishSensorManager.CatchingFishUnitTesting.CatchingFishCloudMessaging(CatchingFishSensorManager);
            } else {
                CatchingFishSensorManager.CatchingFishFragmentHandler &= -33;
            }
            this.CatchingFishParcelableFAB.CatchingFishJetpackCompose(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.CatchingFishSnackbar) {
                CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishParcelableFAB;
                CatchingFishGradleMockk catchingFishGradleMockk = (CatchingFishGradleMockk) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
                int indexOfChild = ((CatchingFishKtorPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.indexOfChild(view);
                int CatchingFishSnackbar = (indexOfChild == -1 || catchingFishGradleMockk.CatchingFishReduxKtor(indexOfChild)) ? -1 : indexOfChild - catchingFishGradleMockk.CatchingFishSnackbar(indexOfChild);
                if (i == -1) {
                    i = this.CatchingFishParcelableFAB.CatchingFishCustomView();
                }
                if (CatchingFishSnackbar == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.CatchingFishSnackbar.indexOfChild(view) + this.CatchingFishSnackbar.CatchingFishGsonAppCompat());
                }
                if (CatchingFishSnackbar != i) {
                    CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishSnackbar.CatchingFishAnimationMockk;
                    View CatchingFishCoroutineFlow = catchingFishKtorDataStore.CatchingFishCoroutineFlow(CatchingFishSnackbar);
                    if (CatchingFishCoroutineFlow == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + CatchingFishSnackbar + catchingFishKtorDataStore.CatchingFishSnackbar.toString());
                    }
                    catchingFishKtorDataStore.CatchingFishCoroutineFlow(CatchingFishSnackbar);
                    catchingFishKtorDataStore.CatchingFishParcelableFAB.CatchingFishParcelableFlux(CatchingFishSnackbar);
                    CatchingFishGradleDagger catchingFishGradleDagger2 = (CatchingFishGradleDagger) CatchingFishCoroutineFlow.getLayoutParams();
                    CatchingFishPayPalCardView CatchingFishSensorManager2 = RecyclerView.CatchingFishSensorManager(CatchingFishCoroutineFlow);
                    if (CatchingFishSensorManager2.CatchingFishViewModelFAB()) {
                        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB2 = (CatchingFishGraphQLRealmFAB) catchingFishKtorDataStore.CatchingFishSnackbar.CatchingFishLayout.CatchingFishDaggerWebsocket;
                        CatchingFishMoshiAndroidX catchingFishMoshiAndroidX2 = (CatchingFishMoshiAndroidX) catchingFishGraphQLRealmFAB2.get(CatchingFishSensorManager2);
                        if (catchingFishMoshiAndroidX2 == null) {
                            catchingFishMoshiAndroidX2 = CatchingFishMoshiAndroidX.CatchingFishParcelableFAB();
                            catchingFishGraphQLRealmFAB2.put(CatchingFishSensorManager2, catchingFishMoshiAndroidX2);
                        }
                        catchingFishMoshiAndroidX2.CatchingFishParcelableFAB = 1 | catchingFishMoshiAndroidX2.CatchingFishParcelableFAB;
                    } else {
                        catchingFishKtorDataStore.CatchingFishSnackbar.CatchingFishLayout.CatchingFishPayPal(CatchingFishSensorManager2);
                    }
                    catchingFishKtorDataStore.CatchingFishParcelableFAB.CatchingFishJetpackCompose(CatchingFishCoroutineFlow, i, catchingFishGradleDagger2, CatchingFishSensorManager2.CatchingFishViewModelFAB());
                }
            } else {
                this.CatchingFishParcelableFAB.CatchingFish(view, i, false);
                catchingFishGradleDagger.CatchingFishCoroutine = true;
                CatchingFishFABRobolectric catchingFishFABRobolectric = this.CatchingFishDaggerWebsocket;
                if (catchingFishFABRobolectric != null && catchingFishFABRobolectric.CatchingFishDaggerWebsocket) {
                    catchingFishFABRobolectric.CatchingFishSnackbar.getClass();
                    CatchingFishPayPalCardView CatchingFishSensorManager3 = RecyclerView.CatchingFishSensorManager(view);
                    if ((CatchingFishSensorManager3 != null ? CatchingFishSensorManager3.CatchingFishSnackbar() : -1) == catchingFishFABRobolectric.CatchingFishParcelableFAB) {
                        catchingFishFABRobolectric.CatchingFishWorkManager = view;
                    }
                }
            }
        }
        if (catchingFishGradleDagger.CatchingFishReduxKtor) {
            CatchingFishSensorManager.CatchingFishParcelableFAB.invalidate();
            catchingFishGradleDagger.CatchingFishReduxKtor = false;
        }
    }

    public final void CatchingFishStateFlow(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(view);
        if (CatchingFishSensorManager == null || CatchingFishSensorManager.CatchingFishViewModelFAB()) {
            return;
        }
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishParcelableFAB;
        if (((ArrayList) catchingFishAsyncTaskDagger.CatchingFishViewModelScope).contains(CatchingFishSensorManager.CatchingFishParcelableFAB)) {
            return;
        }
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        CatchingFishJUnitRealm(recyclerView.CatchingFishDaggerWebsocket, recyclerView.CatchingFishRedux, view, catchingFishViewJUnitJUnit);
    }

    public void CatchingFishStateFlowIntent(Rect rect, int i, int i2) {
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData() + CatchingFishFragmentFactory() + rect.width();
        int CatchingFishCustomView = CatchingFishCustomView() + CatchingFishJobScheduler() + rect.height();
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        this.CatchingFishSnackbar.setMeasuredDimension(CatchingFishViewModelScope(i, CatchingFishMutableLiveData, recyclerView.getMinimumWidth()), CatchingFishViewModelScope(i2, CatchingFishCustomView, this.CatchingFishSnackbar.getMinimumHeight()));
    }

    public final void CatchingFishStateLiveData(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX) {
        for (int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB() - 1; CatchingFishDaggerHiltFAB >= 0; CatchingFishDaggerHiltFAB--) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB);
            CatchingFishPayPalCardView CatchingFishSensorManager = RecyclerView.CatchingFishSensorManager(CatchingFishCoroutineFlow);
            if (!CatchingFishSensorManager.CatchingFishAnimationMockk()) {
                if (!CatchingFishSensorManager.CatchingFishWorkManager() || CatchingFishSensorManager.CatchingFishViewModelFAB() || this.CatchingFishSnackbar.CatchingFishUnitTesting.CatchingFishSnackbar) {
                    CatchingFishCoroutineFlow(CatchingFishDaggerHiltFAB);
                    this.CatchingFishParcelableFAB.CatchingFishParcelableFlux(CatchingFishDaggerHiltFAB);
                    catchingFishSnackbarCameraX.CatchingFishLayout(CatchingFishCoroutineFlow);
                    this.CatchingFishSnackbar.CatchingFishLayout.CatchingFishPayPal(CatchingFishSensorManager);
                } else {
                    CatchingFishRetrofitMVI(CatchingFishDaggerHiltFAB);
                    catchingFishSnackbarCameraX.CatchingFishViewModelFAB(CatchingFishSensorManager);
                }
            }
        }
    }

    public abstract int CatchingFishUnitTesting(CatchingFishReduxGlide catchingFishReduxGlide);

    public abstract int CatchingFishView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide);

    public final boolean CatchingFishWebSocketMockk(View view, int i, int i2, CatchingFishGradleDagger catchingFishGradleDagger) {
        return (!view.isLayoutRequested() && this.CatchingFishViewModelFAB && CatchingFishHandler(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).width) && CatchingFishHandler(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).height)) ? false : true;
    }

    public final void CatchingFishWidget(int i, int i2) {
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        if (CatchingFishDaggerHiltFAB == 0) {
            this.CatchingFishSnackbar.CatchingFishUnitTesting(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < CatchingFishDaggerHiltFAB; i7++) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i7);
            Rect rect = this.CatchingFishSnackbar.CatchingFishCloudMessaging;
            CatchingFishGsonAppCompat(CatchingFishCoroutineFlow, rect);
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
        this.CatchingFishSnackbar.CatchingFishCloudMessaging.set(i6, i4, i3, i5);
        CatchingFishStateFlowIntent(this.CatchingFishSnackbar.CatchingFishCloudMessaging, i, i2);
    }

    public boolean CatchingFishWorkManager(CatchingFishGradleDagger catchingFishGradleDagger) {
        return catchingFishGradleDagger != null;
    }

    public void CatchingFishLayoutInflater() {
    }

    public void CatchingFishMVVMAppCompat() {
    }

    public void CatchingFishCustomViewJUnit(Parcelable parcelable) {
    }

    public void CatchingFishMockkOkHttp(int i) {
    }

    public void CatchingFishParcelable(RecyclerView recyclerView) {
    }

    public void CatchingFishAndroidX(int i, int i2) {
    }

    public void CatchingFishAnimation(int i, int i2) {
    }

    public void CatchingFishLayout(int i, CatchingFishWidgetFAB catchingFishWidgetFAB) {
    }

    public void CatchingFishMoshiDaggerHilt(int i, int i2) {
    }

    public void CatchingFishStripeAPI(int i, int i2) {
    }

    public void CatchingFishJUnitRealm(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
    }

    public void CatchingFishViewModelFAB(int i, int i2, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishWidgetFAB catchingFishWidgetFAB) {
    }
}
