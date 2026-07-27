package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAdMobToolbar;
import kotlin.text.CatchingFishBundleGlide;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishGradleDagger;
import kotlin.text.CatchingFishKtorDataStore;
import kotlin.text.CatchingFishLifecycleFAB;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishMVVMParcelable;
import kotlin.text.CatchingFishReduxGlide;
import kotlin.text.CatchingFishReduxWidget;
import kotlin.text.CatchingFishSnackbarCameraX;
import kotlin.text.CatchingFishViewJUnitJUnit;
import kotlin.text.CatchingFishWidgetFAB;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final Rect CatchingFishCameraXIntent;
    public final CatchingFishBundleGlide CatchingFishDagger;
    public final SparseIntArray CatchingFishEspressoMockk;
    public boolean CatchingFishFragmentFactory;
    public int[] CatchingFishJobScheduler;
    public int CatchingFishMutableLiveData;
    public View[] CatchingFishPayPalService;
    public final SparseIntArray CatchingFishSensorManager;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.CatchingFishFragmentFactory = false;
        this.CatchingFishMutableLiveData = -1;
        this.CatchingFishSensorManager = new SparseIntArray();
        this.CatchingFishEspressoMockk = new SparseIntArray();
        this.CatchingFishDagger = new CatchingFishBundleGlide(26);
        this.CatchingFishCameraXIntent = new Rect();
        CatchingFishGlideFluxRedux(CatchingFishKtorDataStore.CatchingFishSensorManager(context, attributeSet, i, i2).CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFish(Context context, AttributeSet attributeSet) {
        CatchingFishMVVMParcelable catchingFishMVVMParcelable = new CatchingFishMVVMParcelable(context, attributeSet);
        catchingFishMVVMParcelable.CatchingFishDaggerWebsocket = -1;
        catchingFishMVVMParcelable.CatchingFishWorkManager = 0;
        return catchingFishMVVMParcelable;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void CatchingFishAccessibility(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.CatchingFishAccessibility(false);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishAndroidX(int i, int i2) {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        catchingFishBundleGlide.CatchingFishSpannableWidget();
        ((SparseIntArray) catchingFishBundleGlide.CatchingFishWorkManager).clear();
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishAnimation(int i, int i2) {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        catchingFishBundleGlide.CatchingFishSpannableWidget();
        ((SparseIntArray) catchingFishBundleGlide.CatchingFishWorkManager).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishAnimationMockk(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishDaggerAppCompat(catchingFishReduxGlide);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.CatchingFishParcelableFAB.CatchingFishViewModelScope).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View CatchingFishAppCompat(View view, int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        View CatchingFishPayPal;
        int CatchingFishDaggerHiltFAB;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        CatchingFishSnackbarCameraX catchingFishSnackbarCameraX2 = catchingFishSnackbarCameraX;
        CatchingFishReduxGlide catchingFishReduxGlide2 = catchingFishReduxGlide;
        RecyclerView recyclerView = this.CatchingFishSnackbar;
        if (recyclerView != null) {
            CatchingFishPayPal = recyclerView.CatchingFishPayPal(view);
            if (CatchingFishPayPal != null) {
            }
        }
        CatchingFishPayPal = null;
        if (CatchingFishPayPal != null) {
            CatchingFishMVVMParcelable catchingFishMVVMParcelable = (CatchingFishMVVMParcelable) CatchingFishPayPal.getLayoutParams();
            int i6 = catchingFishMVVMParcelable.CatchingFishDaggerWebsocket;
            int i7 = catchingFishMVVMParcelable.CatchingFishWorkManager + i6;
            if (super.CatchingFishAppCompat(view, i, catchingFishSnackbarCameraX, catchingFishReduxGlide) != null) {
                if ((CatchingFishLiveDataRoom(i) == 1) != this.CatchingFishCoroutineFlow) {
                    i3 = CatchingFishDaggerHiltFAB() - 1;
                    CatchingFishDaggerHiltFAB = -1;
                    i2 = -1;
                } else {
                    CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.CatchingFishStateLiveData == 1 && CatchingFishGradle();
                int CatchingFishHiltCardView = CatchingFishHiltCardView(i3, catchingFishSnackbarCameraX2, catchingFishReduxGlide2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == CatchingFishDaggerHiltFAB) {
                        break;
                    }
                    int CatchingFishHiltCardView2 = CatchingFishHiltCardView(i11, catchingFishSnackbarCameraX2, catchingFishReduxGlide2);
                    View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i11);
                    if (CatchingFishCoroutineFlow == CatchingFishPayPal) {
                        break;
                    }
                    if (!CatchingFishCoroutineFlow.hasFocusable() || CatchingFishHiltCardView2 == CatchingFishHiltCardView) {
                        CatchingFishMVVMParcelable catchingFishMVVMParcelable2 = (CatchingFishMVVMParcelable) CatchingFishCoroutineFlow.getLayoutParams();
                        int i13 = catchingFishMVVMParcelable2.CatchingFishDaggerWebsocket;
                        view3 = CatchingFishPayPal;
                        int i14 = catchingFishMVVMParcelable2.CatchingFishWorkManager + i13;
                        if (CatchingFishCoroutineFlow.hasFocusable() && i13 == i6 && i14 == i7) {
                            return CatchingFishCoroutineFlow;
                        }
                        if (!(CatchingFishCoroutineFlow.hasFocusable() && view4 == null) && (CatchingFishCoroutineFlow.hasFocusable() || view2 != null)) {
                            i4 = CatchingFishDaggerHiltFAB;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (CatchingFishCoroutineFlow.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.CatchingFishCoroutine.CatchingFishNavigation(CatchingFishCoroutineFlow) || !this.CatchingFishReduxKtor.CatchingFishNavigation(CatchingFishCoroutineFlow)) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = CatchingFishDaggerHiltFAB;
                        }
                        if (CatchingFishCoroutineFlow.hasFocusable()) {
                            int i15 = catchingFishMVVMParcelable2.CatchingFishDaggerWebsocket;
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = CatchingFishCoroutineFlow;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            int i16 = catchingFishMVVMParcelable2.CatchingFishDaggerWebsocket;
                            view5 = CatchingFishCoroutineFlow;
                            i8 = i16;
                            i10 = i5;
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                        }
                        i11 += i2;
                        catchingFishSnackbarCameraX2 = catchingFishSnackbarCameraX;
                        catchingFishReduxGlide2 = catchingFishReduxGlide;
                        CatchingFishPayPal = view3;
                        CatchingFishDaggerHiltFAB = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = CatchingFishPayPal;
                        i5 = i10;
                        i4 = CatchingFishDaggerHiltFAB;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    catchingFishSnackbarCameraX2 = catchingFishSnackbarCameraX;
                    catchingFishReduxGlide2 = catchingFishReduxGlide;
                    CatchingFishPayPal = view3;
                    CatchingFishDaggerHiltFAB = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    public final int CatchingFishBundleMVP(int i, int i2) {
        if (this.CatchingFishStateLiveData != 1 || !CatchingFishGradle()) {
            int[] iArr = this.CatchingFishJobScheduler;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.CatchingFishJobScheduler;
        int i3 = this.CatchingFishMutableLiveData;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishCloudMessaging(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishMVPHandler(catchingFishReduxGlide);
    }

    public final int CatchingFishDatabinding(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        boolean z = catchingFishReduxGlide.CatchingFishViewModelScope;
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        if (!z) {
            catchingFishBundleGlide.getClass();
            return 1;
        }
        int i2 = this.CatchingFishSensorManager.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (catchingFishSnackbarCameraX.CatchingFishSnackbar(i) == -1) {
            return 1;
        }
        catchingFishBundleGlide.getClass();
        return 1;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishEspressoMockk(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (this.CatchingFishStateLiveData == 0) {
            return this.CatchingFishMutableLiveData;
        }
        if (catchingFishReduxGlide.CatchingFishSnackbar() < 1) {
            return 0;
        }
        return CatchingFishHiltCardView(catchingFishReduxGlide.CatchingFishSnackbar() - 1, catchingFishSnackbarCameraX, catchingFishReduxGlide) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishEspressoTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishDaggerAppCompat(catchingFishReduxGlide);
    }

    public final void CatchingFishGlideFluxRedux(int i) {
        if (i == this.CatchingFishMutableLiveData) {
            return;
        }
        this.CatchingFishFragmentFactory = true;
        if (i < 1) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Span count should be at least 1. Provided ", i));
        }
        this.CatchingFishMutableLiveData = i;
        this.CatchingFishDagger.CatchingFishSpannableWidget();
        CatchingFishRetrofit();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishGlideWidgetKtor(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        CatchingFishOkHttpExoPlayer();
        CatchingFishRobolectric();
        return super.CatchingFishGlideWidgetKtor(i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
    }

    public final int CatchingFishHiltCardView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        boolean z = catchingFishReduxGlide.CatchingFishViewModelScope;
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        if (!z) {
            int i2 = this.CatchingFishMutableLiveData;
            catchingFishBundleGlide.getClass();
            return CatchingFishBundleGlide.CatchingFishDaggerHiltFAB(i, i2);
        }
        int CatchingFishSnackbar = catchingFishSnackbarCameraX.CatchingFishSnackbar(i);
        if (CatchingFishSnackbar == -1) {
            return 0;
        }
        int i3 = this.CatchingFishMutableLiveData;
        catchingFishBundleGlide.getClass();
        return CatchingFishBundleGlide.CatchingFishDaggerHiltFAB(CatchingFishSnackbar, i3);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishJUnitRealm(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CatchingFishMVVMParcelable)) {
            CatchingFishStateFlow(view, catchingFishViewJUnitJUnit);
            return;
        }
        CatchingFishMVVMParcelable catchingFishMVVMParcelable = (CatchingFishMVVMParcelable) layoutParams;
        int CatchingFishHiltCardView = CatchingFishHiltCardView(catchingFishMVVMParcelable.CatchingFishParcelableFAB.CatchingFishSnackbar(), catchingFishSnackbarCameraX, catchingFishReduxGlide);
        if (this.CatchingFishStateLiveData == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(catchingFishMVVMParcelable.CatchingFishDaggerWebsocket, catchingFishMVVMParcelable.CatchingFishWorkManager, CatchingFishHiltCardView, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(CatchingFishHiltCardView, 1, catchingFishMVVMParcelable.CatchingFishDaggerWebsocket, catchingFishMVVMParcelable.CatchingFishWorkManager, false, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.CatchingFishSnackbar = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishJUnitViewPager(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishLifecycleFAB catchingFishLifecycleFAB, CatchingFishReduxWidget catchingFishReduxWidget) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int CatchingFishSpannableWidget;
        int i8;
        ?? r12;
        int i9;
        View CatchingFishSnackbar;
        int CatchingFishFragmentHandler = this.CatchingFishNavigation.CatchingFishFragmentHandler();
        boolean z = CatchingFishFragmentHandler != 1073741824;
        int i10 = CatchingFishDaggerHiltFAB() > 0 ? this.CatchingFishJobScheduler[this.CatchingFishMutableLiveData] : 0;
        if (z) {
            CatchingFishOkHttpExoPlayer();
        }
        boolean z2 = catchingFishLifecycleFAB.CatchingFishDaggerWebsocket == 1;
        int i11 = this.CatchingFishMutableLiveData;
        if (!z2) {
            i11 = CatchingFishLiveData(catchingFishLifecycleFAB.CatchingFishReduxKtor, catchingFishSnackbarCameraX, catchingFishReduxGlide) + CatchingFishDatabinding(catchingFishLifecycleFAB.CatchingFishReduxKtor, catchingFishSnackbarCameraX, catchingFishReduxGlide);
        }
        int i12 = 0;
        while (i12 < this.CatchingFishMutableLiveData && (i9 = catchingFishLifecycleFAB.CatchingFishReduxKtor) >= 0 && i9 < catchingFishReduxGlide.CatchingFishSnackbar() && i11 > 0) {
            int i13 = catchingFishLifecycleFAB.CatchingFishReduxKtor;
            int CatchingFishDatabinding = CatchingFishDatabinding(i13, catchingFishSnackbarCameraX, catchingFishReduxGlide);
            if (CatchingFishDatabinding > this.CatchingFishMutableLiveData) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + CatchingFishDatabinding + " spans but GridLayoutManager has only " + this.CatchingFishMutableLiveData + " spans.");
            }
            i11 -= CatchingFishDatabinding;
            if (i11 < 0 || (CatchingFishSnackbar = catchingFishLifecycleFAB.CatchingFishSnackbar(catchingFishSnackbarCameraX)) == null) {
                break;
            }
            this.CatchingFishPayPalService[i12] = CatchingFishSnackbar;
            i12++;
        }
        if (z2) {
            i3 = 1;
            i2 = i12;
            i = 0;
        } else {
            i = i12 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i14 = 0;
        while (i != i2) {
            View view = this.CatchingFishPayPalService[i];
            CatchingFishMVVMParcelable catchingFishMVVMParcelable = (CatchingFishMVVMParcelable) view.getLayoutParams();
            int CatchingFishDatabinding2 = CatchingFishDatabinding(CatchingFishKtorDataStore.CatchingFishPayPalService(view), catchingFishSnackbarCameraX, catchingFishReduxGlide);
            catchingFishMVVMParcelable.CatchingFishWorkManager = CatchingFishDatabinding2;
            catchingFishMVVMParcelable.CatchingFishDaggerWebsocket = i14;
            i14 += CatchingFishDatabinding2;
            i += i3;
        }
        float f = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.CatchingFishPayPalService[i16];
            if (catchingFishLifecycleFAB.CatchingFishCloudMessaging != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    CatchingFishSnackbar(view2, -1, true);
                } else {
                    CatchingFishSnackbar(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                CatchingFishSnackbar(view2, -1, false);
            } else {
                r12 = 0;
                CatchingFishSnackbar(view2, 0, false);
            }
            RecyclerView recyclerView = this.CatchingFishSnackbar;
            Rect rect = this.CatchingFishCameraXIntent;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.CatchingFishEspressoMockk(view2));
            }
            CatchingFishOkHttpCardView(view2, CatchingFishFragmentHandler, r12);
            int CatchingFishCoroutine = this.CatchingFishNavigation.CatchingFishCoroutine(view2);
            if (CatchingFishCoroutine > i15) {
                i15 = CatchingFishCoroutine;
            }
            float CatchingFishReduxKtor = (this.CatchingFishNavigation.CatchingFishReduxKtor(view2) * 1.0f) / ((CatchingFishMVVMParcelable) view2.getLayoutParams()).CatchingFishWorkManager;
            if (CatchingFishReduxKtor > f) {
                f = CatchingFishReduxKtor;
            }
        }
        if (z) {
            CatchingFishManifestFluxMVI(Math.max(Math.round(f * this.CatchingFishMutableLiveData), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.CatchingFishPayPalService[i17];
                CatchingFishOkHttpCardView(view3, 1073741824, true);
                int CatchingFishCoroutine2 = this.CatchingFishNavigation.CatchingFishCoroutine(view3);
                if (CatchingFishCoroutine2 > i15) {
                    i15 = CatchingFishCoroutine2;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.CatchingFishPayPalService[i18];
            if (this.CatchingFishNavigation.CatchingFishCoroutine(view4) != i15) {
                CatchingFishMVVMParcelable catchingFishMVVMParcelable2 = (CatchingFishMVVMParcelable) view4.getLayoutParams();
                Rect rect2 = catchingFishMVVMParcelable2.CatchingFishSnackbar;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable2).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable2).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable2).rightMargin;
                int CatchingFishBundleMVP = CatchingFishBundleMVP(catchingFishMVVMParcelable2.CatchingFishDaggerWebsocket, catchingFishMVVMParcelable2.CatchingFishWorkManager);
                if (this.CatchingFishStateLiveData == 1) {
                    i8 = CatchingFishKtorDataStore.CatchingFishSpannableWidget(false, CatchingFishBundleMVP, 1073741824, i20, ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable2).width);
                    CatchingFishSpannableWidget = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    CatchingFishSpannableWidget = CatchingFishKtorDataStore.CatchingFishSpannableWidget(false, CatchingFishBundleMVP, 1073741824, i19, ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable2).height);
                    i8 = makeMeasureSpec;
                }
                if (CatchingFishRealmKtorRealm(view4, i8, CatchingFishSpannableWidget, (CatchingFishGradleDagger) view4.getLayoutParams())) {
                    view4.measure(i8, CatchingFishSpannableWidget);
                }
            }
        }
        catchingFishReduxWidget.CatchingFishParcelableFAB = i15;
        if (this.CatchingFishStateLiveData != 1) {
            if (catchingFishLifecycleFAB.CatchingFishWorkManager == -1) {
                int i21 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                i6 = i21 - i15;
                i5 = 0;
                i4 = i21;
            } else {
                int i22 = catchingFishLifecycleFAB.CatchingFishSnackbar;
                i4 = i22 + i15;
                i5 = 0;
                i6 = i22;
            }
            i7 = i5;
        } else if (catchingFishLifecycleFAB.CatchingFishWorkManager == -1) {
            i7 = catchingFishLifecycleFAB.CatchingFishSnackbar;
            i5 = i7 - i15;
            i6 = 0;
            i4 = 0;
        } else {
            int i23 = catchingFishLifecycleFAB.CatchingFishSnackbar;
            i4 = 0;
            i5 = i23;
            i7 = i23 + i15;
            i6 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.CatchingFishPayPalService[i24];
            CatchingFishMVVMParcelable catchingFishMVVMParcelable3 = (CatchingFishMVVMParcelable) view5.getLayoutParams();
            if (this.CatchingFishStateLiveData != 1) {
                i5 = CatchingFishJobScheduler() + this.CatchingFishJobScheduler[catchingFishMVVMParcelable3.CatchingFishDaggerWebsocket];
                i7 = this.CatchingFishNavigation.CatchingFishReduxKtor(view5) + i5;
            } else if (CatchingFishGradle()) {
                int CatchingFishFragmentFactory = CatchingFishFragmentFactory() + this.CatchingFishJobScheduler[this.CatchingFishMutableLiveData - catchingFishMVVMParcelable3.CatchingFishDaggerWebsocket];
                i4 = CatchingFishFragmentFactory;
                i6 = CatchingFishFragmentFactory - this.CatchingFishNavigation.CatchingFishReduxKtor(view5);
            } else {
                i6 = CatchingFishFragmentFactory() + this.CatchingFishJobScheduler[catchingFishMVVMParcelable3.CatchingFishDaggerWebsocket];
                i4 = this.CatchingFishNavigation.CatchingFishReduxKtor(view5) + i6;
            }
            CatchingFishKtorDataStore.CatchingFishPayPalLiveData(view5, i6, i5, i4, i7);
            if (catchingFishMVVMParcelable3.CatchingFishParcelableFAB.CatchingFishViewModelFAB() || catchingFishMVVMParcelable3.CatchingFishParcelableFAB.CatchingFishCloudMessaging()) {
                catchingFishReduxWidget.CatchingFishCoroutine = true;
            }
            catchingFishReduxWidget.CatchingFishReduxKtor = view5.hasFocusable() | catchingFishReduxWidget.CatchingFishReduxKtor;
        }
        Arrays.fill(this.CatchingFishPayPalService, (Object) null);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFishJetpackCompose(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            CatchingFishMVVMParcelable catchingFishMVVMParcelable = new CatchingFishMVVMParcelable((ViewGroup.MarginLayoutParams) layoutParams);
            catchingFishMVVMParcelable.CatchingFishDaggerWebsocket = -1;
            catchingFishMVVMParcelable.CatchingFishWorkManager = 0;
            return catchingFishMVVMParcelable;
        }
        CatchingFishMVVMParcelable catchingFishMVVMParcelable2 = new CatchingFishMVVMParcelable(layoutParams);
        catchingFishMVVMParcelable2.CatchingFishDaggerWebsocket = -1;
        catchingFishMVVMParcelable2.CatchingFishWorkManager = 0;
        return catchingFishMVVMParcelable2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void CatchingFishLifecycle(CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishLifecycleFAB catchingFishLifecycleFAB, CatchingFishWidgetFAB catchingFishWidgetFAB) {
        int i;
        int i2 = this.CatchingFishMutableLiveData;
        for (int i3 = 0; i3 < this.CatchingFishMutableLiveData && (i = catchingFishLifecycleFAB.CatchingFishReduxKtor) >= 0 && i < catchingFishReduxGlide.CatchingFishSnackbar() && i2 > 0; i3++) {
            catchingFishWidgetFAB.CatchingFishParcelableFAB(catchingFishLifecycleFAB.CatchingFishReduxKtor, Math.max(0, catchingFishLifecycleFAB.CatchingFishViewModelScope));
            this.CatchingFishDagger.getClass();
            i2--;
            catchingFishLifecycleFAB.CatchingFishReduxKtor += catchingFishLifecycleFAB.CatchingFishDaggerWebsocket;
        }
    }

    public final int CatchingFishLiveData(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        boolean z = catchingFishReduxGlide.CatchingFishViewModelScope;
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        if (!z) {
            int i2 = this.CatchingFishMutableLiveData;
            catchingFishBundleGlide.getClass();
            return i % i2;
        }
        int i3 = this.CatchingFishEspressoMockk.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int CatchingFishSnackbar = catchingFishSnackbarCameraX.CatchingFishSnackbar(i);
        if (CatchingFishSnackbar == -1) {
            return 0;
        }
        int i4 = this.CatchingFishMutableLiveData;
        catchingFishBundleGlide.getClass();
        return CatchingFishSnackbar % i4;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMVVMAppCompat() {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        catchingFishBundleGlide.CatchingFishSpannableWidget();
        ((SparseIntArray) catchingFishBundleGlide.CatchingFishWorkManager).clear();
    }

    public final void CatchingFishManifestFluxMVI(int i) {
        int i2;
        int[] iArr = this.CatchingFishJobScheduler;
        int i3 = this.CatchingFishMutableLiveData;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.CatchingFishJobScheduler = iArr;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishMoshiDaggerHilt(int i, int i2) {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        catchingFishBundleGlide.CatchingFishSpannableWidget();
        ((SparseIntArray) catchingFishBundleGlide.CatchingFishWorkManager).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final CatchingFishGradleDagger CatchingFishNavigation() {
        return this.CatchingFishStateLiveData == 0 ? new CatchingFishMVVMParcelable(-2, -1) : new CatchingFishMVVMParcelable(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishNavigationGson(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        boolean z = catchingFishReduxGlide.CatchingFishViewModelScope;
        SparseIntArray sparseIntArray = this.CatchingFishEspressoMockk;
        SparseIntArray sparseIntArray2 = this.CatchingFishSensorManager;
        if (z) {
            int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
            for (int i = 0; i < CatchingFishDaggerHiltFAB; i++) {
                CatchingFishMVVMParcelable catchingFishMVVMParcelable = (CatchingFishMVVMParcelable) CatchingFishCoroutineFlow(i).getLayoutParams();
                int CatchingFishSnackbar = catchingFishMVVMParcelable.CatchingFishParcelableFAB.CatchingFishSnackbar();
                sparseIntArray2.put(CatchingFishSnackbar, catchingFishMVVMParcelable.CatchingFishWorkManager);
                sparseIntArray.put(CatchingFishSnackbar, catchingFishMVVMParcelable.CatchingFishDaggerWebsocket);
            }
        }
        super.CatchingFishNavigationGson(catchingFishSnackbarCameraX, catchingFishReduxGlide);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void CatchingFishOkHttpCardView(View view, int i, boolean z) {
        int i2;
        int i3;
        CatchingFishMVVMParcelable catchingFishMVVMParcelable = (CatchingFishMVVMParcelable) view.getLayoutParams();
        Rect rect = catchingFishMVVMParcelable.CatchingFishSnackbar;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).topMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).leftMargin + ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).rightMargin;
        int CatchingFishBundleMVP = CatchingFishBundleMVP(catchingFishMVVMParcelable.CatchingFishDaggerWebsocket, catchingFishMVVMParcelable.CatchingFishWorkManager);
        if (this.CatchingFishStateLiveData == 1) {
            i3 = CatchingFishKtorDataStore.CatchingFishSpannableWidget(false, CatchingFishBundleMVP, i, i5, ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).width);
            i2 = CatchingFishKtorDataStore.CatchingFishSpannableWidget(true, this.CatchingFishNavigation.CatchingFishEspressoTesting(), this.CatchingFishOkHttp, i4, ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).height);
        } else {
            int CatchingFishSpannableWidget = CatchingFishKtorDataStore.CatchingFishSpannableWidget(false, CatchingFishBundleMVP, i, i4, ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).height);
            int CatchingFishSpannableWidget2 = CatchingFishKtorDataStore.CatchingFishSpannableWidget(true, this.CatchingFishNavigation.CatchingFishEspressoTesting(), this.CatchingFishEspressoTesting, i5, ((ViewGroup.MarginLayoutParams) catchingFishMVVMParcelable).width);
            i2 = CatchingFishSpannableWidget;
            i3 = CatchingFishSpannableWidget2;
        }
        CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
        if (z ? CatchingFishRealmKtorRealm(view, i3, i2, catchingFishGradleDagger) : CatchingFishWebSocketMockk(view, i3, i2, catchingFishGradleDagger)) {
            view.measure(i3, i2);
        }
    }

    public final void CatchingFishOkHttpExoPlayer() {
        int CatchingFishCustomView;
        int CatchingFishJobScheduler;
        if (this.CatchingFishStateLiveData == 1) {
            CatchingFishCustomView = this.CatchingFishUnitTesting - CatchingFishMutableLiveData();
            CatchingFishJobScheduler = CatchingFishFragmentFactory();
        } else {
            CatchingFishCustomView = this.CatchingFishAnimationMockk - CatchingFishCustomView();
            CatchingFishJobScheduler = CatchingFishJobScheduler();
        }
        CatchingFishManifestFluxMVI(CatchingFishCustomView - CatchingFishJobScheduler);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishParcelableFlux(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        if (this.CatchingFishStateLiveData == 1) {
            return this.CatchingFishMutableLiveData;
        }
        if (catchingFishReduxGlide.CatchingFishSnackbar() < 1) {
            return 0;
        }
        return CatchingFishHiltCardView(catchingFishReduxGlide.CatchingFishSnackbar() - 1, catchingFishSnackbarCameraX, catchingFishReduxGlide) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishRedux(CatchingFishReduxGlide catchingFishReduxGlide) {
        super.CatchingFishRedux(catchingFishReduxGlide);
        this.CatchingFishFragmentFactory = false;
    }

    public final void CatchingFishRobolectric() {
        View[] viewArr = this.CatchingFishPayPalService;
        if (viewArr == null || viewArr.length != this.CatchingFishMutableLiveData) {
            this.CatchingFishPayPalService = new View[this.CatchingFishMutableLiveData];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishSharedFlow() {
        return this.CatchingFishCardViewRealm == null && !this.CatchingFishFragmentFactory;
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishStateFlowIntent(Rect rect, int i, int i2) {
        int CatchingFishViewModelScope;
        int CatchingFishViewModelScope2;
        if (this.CatchingFishJobScheduler == null) {
            super.CatchingFishStateFlowIntent(rect, i, i2);
        }
        int CatchingFishMutableLiveData = CatchingFishMutableLiveData() + CatchingFishFragmentFactory();
        int CatchingFishCustomView = CatchingFishCustomView() + CatchingFishJobScheduler();
        if (this.CatchingFishStateLiveData == 1) {
            int height = rect.height() + CatchingFishCustomView;
            RecyclerView recyclerView = this.CatchingFishSnackbar;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            CatchingFishViewModelScope2 = CatchingFishKtorDataStore.CatchingFishViewModelScope(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.CatchingFishJobScheduler;
            CatchingFishViewModelScope = CatchingFishKtorDataStore.CatchingFishViewModelScope(i, iArr[iArr.length - 1] + CatchingFishMutableLiveData, this.CatchingFishSnackbar.getMinimumWidth());
        } else {
            int width = rect.width() + CatchingFishMutableLiveData;
            RecyclerView recyclerView2 = this.CatchingFishSnackbar;
            WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            CatchingFishViewModelScope = CatchingFishKtorDataStore.CatchingFishViewModelScope(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.CatchingFishJobScheduler;
            CatchingFishViewModelScope2 = CatchingFishKtorDataStore.CatchingFishViewModelScope(i2, iArr2[iArr2.length - 1] + CatchingFishCustomView, this.CatchingFishSnackbar.getMinimumHeight());
        }
        this.CatchingFishSnackbar.setMeasuredDimension(CatchingFishViewModelScope, CatchingFishViewModelScope2);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final void CatchingFishStripeAPI(int i, int i2) {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishDagger;
        catchingFishBundleGlide.CatchingFishSpannableWidget();
        ((SparseIntArray) catchingFishBundleGlide.CatchingFishWorkManager).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View CatchingFishStripeAPIWidget(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, boolean z, boolean z2) {
        int i;
        int i2;
        int CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB();
        int i3 = 1;
        if (z2) {
            i2 = CatchingFishDaggerHiltFAB() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = CatchingFishDaggerHiltFAB;
            i2 = 0;
        }
        int CatchingFishSnackbar = catchingFishReduxGlide.CatchingFishSnackbar();
        CatchingFishGlideMVP();
        int CatchingFishCloudMessaging = this.CatchingFishNavigation.CatchingFishCloudMessaging();
        int CatchingFishViewModelScope = this.CatchingFishNavigation.CatchingFishViewModelScope();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(i2);
            int CatchingFishPayPalService = CatchingFishKtorDataStore.CatchingFishPayPalService(CatchingFishCoroutineFlow);
            if (CatchingFishPayPalService >= 0 && CatchingFishPayPalService < CatchingFishSnackbar && CatchingFishLiveData(CatchingFishPayPalService, catchingFishSnackbarCameraX, catchingFishReduxGlide) == 0) {
                if (((CatchingFishGradleDagger) CatchingFishCoroutineFlow.getLayoutParams()).CatchingFishParcelableFAB.CatchingFishViewModelFAB()) {
                    if (view2 == null) {
                        view2 = CatchingFishCoroutineFlow;
                    }
                } else {
                    if (this.CatchingFishNavigation.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow) < CatchingFishViewModelScope && this.CatchingFishNavigation.CatchingFishSnackbar(CatchingFishCoroutineFlow) >= CatchingFishCloudMessaging) {
                        return CatchingFishCoroutineFlow;
                    }
                    if (view == null) {
                        view = CatchingFishCoroutineFlow;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void CatchingFishToolbarEspresso(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide, CatchingFishAdMobToolbar catchingFishAdMobToolbar, int i) {
        CatchingFishOkHttpExoPlayer();
        if (catchingFishReduxGlide.CatchingFishSnackbar() > 0 && !catchingFishReduxGlide.CatchingFishViewModelScope) {
            boolean z = i == 1;
            int CatchingFishLiveData = CatchingFishLiveData(catchingFishAdMobToolbar.CatchingFishSnackbar, catchingFishSnackbarCameraX, catchingFishReduxGlide);
            if (z) {
                while (CatchingFishLiveData > 0) {
                    int i2 = catchingFishAdMobToolbar.CatchingFishSnackbar;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    catchingFishAdMobToolbar.CatchingFishSnackbar = i3;
                    CatchingFishLiveData = CatchingFishLiveData(i3, catchingFishSnackbarCameraX, catchingFishReduxGlide);
                }
            } else {
                int CatchingFishSnackbar = catchingFishReduxGlide.CatchingFishSnackbar() - 1;
                int i4 = catchingFishAdMobToolbar.CatchingFishSnackbar;
                while (i4 < CatchingFishSnackbar) {
                    int i5 = i4 + 1;
                    int CatchingFishLiveData2 = CatchingFishLiveData(i5, catchingFishSnackbarCameraX, catchingFishReduxGlide);
                    if (CatchingFishLiveData2 <= CatchingFishLiveData) {
                        break;
                    }
                    i4 = i5;
                    CatchingFishLiveData = CatchingFishLiveData2;
                }
                catchingFishAdMobToolbar.CatchingFishSnackbar = i4;
            }
        }
        CatchingFishRobolectric();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishUnitTesting(CatchingFishReduxGlide catchingFishReduxGlide) {
        return CatchingFishMVPHandler(catchingFishReduxGlide);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, kotlin.text.CatchingFishKtorDataStore
    public final int CatchingFishView(int i, CatchingFishSnackbarCameraX catchingFishSnackbarCameraX, CatchingFishReduxGlide catchingFishReduxGlide) {
        CatchingFishOkHttpExoPlayer();
        CatchingFishRobolectric();
        return super.CatchingFishView(i, catchingFishSnackbarCameraX, catchingFishReduxGlide);
    }

    @Override // kotlin.text.CatchingFishKtorDataStore
    public final boolean CatchingFishWorkManager(CatchingFishGradleDagger catchingFishGradleDagger) {
        return catchingFishGradleDagger instanceof CatchingFishMVVMParcelable;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.CatchingFishFragmentFactory = false;
        this.CatchingFishMutableLiveData = -1;
        this.CatchingFishSensorManager = new SparseIntArray();
        this.CatchingFishEspressoMockk = new SparseIntArray();
        this.CatchingFishDagger = new CatchingFishBundleGlide(26);
        this.CatchingFishCameraXIntent = new Rect();
        CatchingFishGlideFluxRedux(i);
    }
}
