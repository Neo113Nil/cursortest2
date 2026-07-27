package kotlin.text;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishFABFluxAndroidX implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewGroup CatchingFishDaggerWebsocket;
    public CatchingFishMockkRedux CatchingFishReduxKtor;

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0 A[EDGE_INSN: B:115:0x01f0->B:116:0x01f0 BREAK  A[LOOP:1: B:16:0x0086->B:28:0x01e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        CatchingFishMoshiLayout catchingFishMoshiLayout;
        ViewGroup viewGroup;
        boolean z;
        CatchingFishDaggerJUnit catchingFishDaggerJUnit;
        View view;
        View view2;
        ViewGroup viewGroup2;
        boolean z2;
        CatchingFishMockkRedux catchingFishMockkRedux = this.CatchingFishReduxKtor;
        ViewGroup viewGroup3 = this.CatchingFishDaggerWebsocket;
        viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup3.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = CatchingFishMoshiKtorJUnit.CatchingFishCoroutine;
        ViewGroup viewGroup4 = this.CatchingFishDaggerWebsocket;
        boolean z3 = true;
        if (!arrayList2.remove(viewGroup4)) {
            return true;
        }
        CatchingFishCameraXRetrofit CatchingFishSnackbar = CatchingFishMoshiKtorJUnit.CatchingFishSnackbar();
        ArrayList arrayList3 = (ArrayList) CatchingFishSnackbar.get(viewGroup4);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            CatchingFishSnackbar.put(viewGroup4, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            arrayList3.add(catchingFishMockkRedux);
            catchingFishMockkRedux.CatchingFishParcelableFAB(new CatchingFishRealmSpannable(this, CatchingFishSnackbar));
            i = 0;
            catchingFishMockkRedux.CatchingFishViewModelFAB(viewGroup4, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((CatchingFishMockkRedux) obj).CatchingFishGsonAppCompat(viewGroup4);
                }
            }
            catchingFishMockkRedux.CatchingFishUnitTesting = new ArrayList();
            catchingFishMockkRedux.CatchingFishAnimationMockk = new ArrayList();
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishMockkRedux.CatchingFishFragmentHandler;
            CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = catchingFishMockkRedux.CatchingFishCloudMessaging;
            catchingFishCameraXRetrofit = new CatchingFishCameraXRetrofit((CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle.CatchingFishReduxKtor);
            catchingFishCameraXRetrofit2 = new CatchingFishCameraXRetrofit((CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle2.CatchingFishReduxKtor);
            i2 = 0;
            while (true) {
                iArr = catchingFishMockkRedux.CatchingFishOkHttp;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    viewGroup = viewGroup4;
                    z = z3;
                    for (int i8 = catchingFishCameraXRetrofit.CatchingFishWorkManager - 1; i8 >= 0; i8--) {
                        View view3 = (View) catchingFishCameraXRetrofit.CatchingFishWorkManager(i8);
                        if (view3 != null && catchingFishMockkRedux.CatchingFishJetpackCompose(view3) && (catchingFishDaggerJUnit = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit2.remove(view3)) != null && catchingFishMockkRedux.CatchingFishJetpackCompose(catchingFishDaggerJUnit.CatchingFishSnackbar)) {
                            catchingFishMockkRedux.CatchingFishUnitTesting.add((CatchingFishDaggerJUnit) catchingFishCameraXRetrofit.CatchingFishViewModelScope(i8));
                            catchingFishMockkRedux.CatchingFishAnimationMockk.add(catchingFishDaggerJUnit);
                        }
                    }
                } else if (i7 == 2) {
                    viewGroup = viewGroup4;
                    z = z3;
                    CatchingFishCameraXRetrofit catchingFishCameraXRetrofit3 = (CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
                    CatchingFishCameraXRetrofit catchingFishCameraXRetrofit4 = (CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle2.CatchingFishViewModelScope;
                    int i9 = catchingFishCameraXRetrofit3.CatchingFishWorkManager;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) catchingFishCameraXRetrofit3.CatchingFishLayout(i10);
                        if (view4 != null && catchingFishMockkRedux.CatchingFishJetpackCompose(view4) && (view = (View) catchingFishCameraXRetrofit4.get(catchingFishCameraXRetrofit3.CatchingFishWorkManager(i10))) != null && catchingFishMockkRedux.CatchingFishJetpackCompose(view)) {
                            CatchingFishDaggerJUnit catchingFishDaggerJUnit2 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit.get(view4);
                            CatchingFishDaggerJUnit catchingFishDaggerJUnit3 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit2.get(view);
                            if (catchingFishDaggerJUnit2 != null && catchingFishDaggerJUnit3 != null) {
                                catchingFishMockkRedux.CatchingFishUnitTesting.add(catchingFishDaggerJUnit2);
                                catchingFishMockkRedux.CatchingFishAnimationMockk.add(catchingFishDaggerJUnit3);
                                catchingFishCameraXRetrofit.remove(view4);
                                catchingFishCameraXRetrofit2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) catchingFishFluxFluxBundle.CatchingFishWorkManager;
                        CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux2 = (CatchingFishLayoutMVVMFlux) catchingFishFluxFluxBundle2.CatchingFishWorkManager;
                        int CatchingFishViewModelScope = catchingFishLayoutMVVMFlux.CatchingFishViewModelScope();
                        int i11 = i;
                        while (i11 < CatchingFishViewModelScope) {
                            View view5 = (View) catchingFishLayoutMVVMFlux.CatchingFishViewModelFAB(i11);
                            if (view5 == null || !catchingFishMockkRedux.CatchingFishJetpackCompose(view5)) {
                                viewGroup2 = viewGroup4;
                            } else {
                                viewGroup2 = viewGroup4;
                                View view6 = (View) catchingFishLayoutMVVMFlux2.CatchingFishSnackbar(catchingFishLayoutMVVMFlux.CatchingFishReduxKtor(i11));
                                if (view6 != null && catchingFishMockkRedux.CatchingFishJetpackCompose(view6)) {
                                    CatchingFishDaggerJUnit catchingFishDaggerJUnit4 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit.get(view5);
                                    z2 = z3;
                                    CatchingFishDaggerJUnit catchingFishDaggerJUnit5 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit2.get(view6);
                                    if (catchingFishDaggerJUnit4 != null && catchingFishDaggerJUnit5 != null) {
                                        catchingFishMockkRedux.CatchingFishUnitTesting.add(catchingFishDaggerJUnit4);
                                        catchingFishMockkRedux.CatchingFishAnimationMockk.add(catchingFishDaggerJUnit5);
                                        catchingFishCameraXRetrofit.remove(view5);
                                        catchingFishCameraXRetrofit2.remove(view6);
                                    }
                                    i11++;
                                    viewGroup4 = viewGroup2;
                                    z3 = z2;
                                }
                            }
                            z2 = z3;
                            i11++;
                            viewGroup4 = viewGroup2;
                            z3 = z2;
                        }
                    }
                    viewGroup = viewGroup4;
                    z = z3;
                } else {
                    viewGroup = viewGroup4;
                    z = z3;
                    SparseArray sparseArray = (SparseArray) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
                    SparseArray sparseArray2 = (SparseArray) catchingFishFluxFluxBundle2.CatchingFishDaggerWebsocket;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && catchingFishMockkRedux.CatchingFishJetpackCompose(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && catchingFishMockkRedux.CatchingFishJetpackCompose(view2)) {
                            CatchingFishDaggerJUnit catchingFishDaggerJUnit6 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit.get(view7);
                            CatchingFishDaggerJUnit catchingFishDaggerJUnit7 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit2.get(view2);
                            if (catchingFishDaggerJUnit6 != null && catchingFishDaggerJUnit7 != null) {
                                catchingFishMockkRedux.CatchingFishUnitTesting.add(catchingFishDaggerJUnit6);
                                catchingFishMockkRedux.CatchingFishAnimationMockk.add(catchingFishDaggerJUnit7);
                                catchingFishCameraXRetrofit.remove(view7);
                                catchingFishCameraXRetrofit2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                viewGroup4 = viewGroup;
                z3 = z;
                i = 0;
            }
            ViewGroup viewGroup5 = viewGroup4;
            boolean z4 = z3;
            for (i3 = 0; i3 < catchingFishCameraXRetrofit.CatchingFishWorkManager; i3++) {
                CatchingFishDaggerJUnit catchingFishDaggerJUnit8 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit.CatchingFishLayout(i3);
                if (catchingFishMockkRedux.CatchingFishJetpackCompose(catchingFishDaggerJUnit8.CatchingFishSnackbar)) {
                    catchingFishMockkRedux.CatchingFishUnitTesting.add(catchingFishDaggerJUnit8);
                    catchingFishMockkRedux.CatchingFishAnimationMockk.add(null);
                }
            }
            for (i4 = 0; i4 < catchingFishCameraXRetrofit2.CatchingFishWorkManager; i4++) {
                CatchingFishDaggerJUnit catchingFishDaggerJUnit9 = (CatchingFishDaggerJUnit) catchingFishCameraXRetrofit2.CatchingFishLayout(i4);
                if (catchingFishMockkRedux.CatchingFishJetpackCompose(catchingFishDaggerJUnit9.CatchingFishSnackbar)) {
                    catchingFishMockkRedux.CatchingFishAnimationMockk.add(catchingFishDaggerJUnit9);
                    catchingFishMockkRedux.CatchingFishUnitTesting.add(null);
                }
            }
            CatchingFishCameraXRetrofit CatchingFishStateLiveData = CatchingFishMockkRedux.CatchingFishStateLiveData();
            int i13 = CatchingFishStateLiveData.CatchingFishWorkManager;
            WindowId windowId = viewGroup5.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) CatchingFishStateLiveData.CatchingFishWorkManager(i5);
                if (animator != null && (catchingFishMoshiLayout = (CatchingFishMoshiLayout) CatchingFishStateLiveData.get(animator)) != null) {
                    CatchingFishMockkRedux catchingFishMockkRedux2 = catchingFishMoshiLayout.CatchingFishDaggerWebsocket;
                    View view8 = catchingFishMoshiLayout.CatchingFishParcelableFAB;
                    if (view8 != null && windowId.equals(catchingFishMoshiLayout.CatchingFishReduxKtor)) {
                        CatchingFishDaggerJUnit catchingFishDaggerJUnit10 = catchingFishMoshiLayout.CatchingFishCoroutine;
                        boolean z5 = z4;
                        CatchingFishDaggerJUnit CatchingFishNavigation = catchingFishMockkRedux.CatchingFishNavigation(view8, z5);
                        CatchingFishDaggerJUnit CatchingFishUnitTesting = catchingFishMockkRedux.CatchingFishUnitTesting(view8, z5);
                        if (CatchingFishNavigation == null && CatchingFishUnitTesting == null) {
                            CatchingFishUnitTesting = (CatchingFishDaggerJUnit) ((CatchingFishCameraXRetrofit) catchingFishMockkRedux.CatchingFishCloudMessaging.CatchingFishReduxKtor).get(view8);
                        }
                        if ((CatchingFishNavigation != null || CatchingFishUnitTesting != null) && catchingFishMockkRedux2.CatchingFish(catchingFishDaggerJUnit10, CatchingFishUnitTesting)) {
                            catchingFishMockkRedux2.CatchingFishAnimationMockk().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                CatchingFishStateLiveData.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z4 = true;
            }
            catchingFishMockkRedux.CatchingFishEspressoTesting(viewGroup5, catchingFishMockkRedux.CatchingFishFragmentHandler, catchingFishMockkRedux.CatchingFishCloudMessaging, catchingFishMockkRedux.CatchingFishUnitTesting, catchingFishMockkRedux.CatchingFishAnimationMockk);
            catchingFishMockkRedux.CatchingFishCardViewRealm();
            return true;
        }
        arrayList = null;
        arrayList3.add(catchingFishMockkRedux);
        catchingFishMockkRedux.CatchingFishParcelableFAB(new CatchingFishRealmSpannable(this, CatchingFishSnackbar));
        i = 0;
        catchingFishMockkRedux.CatchingFishViewModelFAB(viewGroup4, false);
        if (arrayList != null) {
        }
        catchingFishMockkRedux.CatchingFishUnitTesting = new ArrayList();
        catchingFishMockkRedux.CatchingFishAnimationMockk = new ArrayList();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle3 = catchingFishMockkRedux.CatchingFishFragmentHandler;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle22 = catchingFishMockkRedux.CatchingFishCloudMessaging;
        catchingFishCameraXRetrofit = new CatchingFishCameraXRetrofit((CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle3.CatchingFishReduxKtor);
        catchingFishCameraXRetrofit2 = new CatchingFishCameraXRetrofit((CatchingFishCameraXRetrofit) catchingFishFluxFluxBundle22.CatchingFishReduxKtor);
        i2 = 0;
        while (true) {
            iArr = catchingFishMockkRedux.CatchingFishOkHttp;
            if (i2 < iArr.length) {
            }
            i2++;
            viewGroup4 = viewGroup;
            z3 = z;
            i = 0;
        }
        ViewGroup viewGroup52 = viewGroup4;
        boolean z42 = z3;
        while (i3 < catchingFishCameraXRetrofit.CatchingFishWorkManager) {
        }
        while (i4 < catchingFishCameraXRetrofit2.CatchingFishWorkManager) {
        }
        CatchingFishCameraXRetrofit CatchingFishStateLiveData2 = CatchingFishMockkRedux.CatchingFishStateLiveData();
        int i132 = CatchingFishStateLiveData2.CatchingFishWorkManager;
        WindowId windowId2 = viewGroup52.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        catchingFishMockkRedux.CatchingFishEspressoTesting(viewGroup52, catchingFishMockkRedux.CatchingFishFragmentHandler, catchingFishMockkRedux.CatchingFishCloudMessaging, catchingFishMockkRedux.CatchingFishUnitTesting, catchingFishMockkRedux.CatchingFishAnimationMockk);
        catchingFishMockkRedux.CatchingFishCardViewRealm();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.CatchingFishDaggerWebsocket;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = CatchingFishMoshiKtorJUnit.CatchingFishCoroutine;
        ViewGroup viewGroup2 = this.CatchingFishDaggerWebsocket;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) CatchingFishMoshiKtorJUnit.CatchingFishSnackbar().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((CatchingFishMockkRedux) obj).CatchingFishGsonAppCompat(viewGroup2);
            }
        }
        this.CatchingFishReduxKtor.CatchingFishLayout(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
