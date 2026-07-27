package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CatchingFishReduxSharedFlow {
    public final LinkedHashSet CatchingFishCloudMessaging;
    public final CatchingFishRealmIntent CatchingFishCoroutine;
    public final CatchingFishMVVMLifecycle CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public final LinkedHashSet CatchingFishFragmentHandler;
    public final LinkedHashSet CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final CatchingFishHandlerAndroidX CatchingFishParcelableFAB = CatchingFishFirebaseDagger.CatchingFishLayout(CatchingFishParcelableFAB.CatchingFishLayout);
    public final CatchingFishMVVMLifecycle CatchingFishReduxKtor;
    public final CatchingFishHandlerAndroidX CatchingFishSnackbar;
    public boolean CatchingFishUnitTesting;
    public CatchingFishWidgetLiveData CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public CatchingFishViewFABEspresso CatchingFishWorkManager;

    public CatchingFishReduxSharedFlow() {
        CatchingFishHandlerAndroidX CatchingFishLayout = CatchingFishFirebaseDagger.CatchingFishLayout(new CatchingFishMoshiLifecycle());
        this.CatchingFishSnackbar = CatchingFishLayout;
        this.CatchingFishCoroutine = new CatchingFishRealmIntent(CatchingFishLayout);
        this.CatchingFishReduxKtor = new CatchingFishMVVMLifecycle();
        this.CatchingFishDaggerWebsocket = new CatchingFishMVVMLifecycle();
        this.CatchingFishLayout = new LinkedHashSet();
        this.CatchingFishFragmentHandler = new LinkedHashSet();
        this.CatchingFishCloudMessaging = new LinkedHashSet();
    }

    public final CatchingFishViewFABEspresso CatchingFishCoroutine(int i) {
        Object obj;
        Object obj2;
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = this.CatchingFishDaggerWebsocket;
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle2 = this.CatchingFishReduxKtor;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = catchingFishMVVMLifecycle2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CatchingFishViewFABEspresso) obj).CatchingFishSnackbar) {
                    break;
                }
            }
            CatchingFishViewFABEspresso catchingFishViewFABEspresso = (CatchingFishViewFABEspresso) obj;
            if (catchingFishViewFABEspresso != null) {
                return catchingFishViewFABEspresso;
            }
            Iterator it2 = catchingFishMVVMLifecycle.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((CatchingFishViewFABEspresso) next).CatchingFishSnackbar) {
                    obj3 = next;
                    break;
                }
            }
            return (CatchingFishViewFABEspresso) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = catchingFishMVVMLifecycle2.iterator();
            while (it3.hasNext()) {
                ((CatchingFishViewFABEspresso) it3.next()).getClass();
            }
            Iterator it4 = catchingFishMVVMLifecycle.iterator();
            while (it4.hasNext()) {
                ((CatchingFishViewFABEspresso) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = catchingFishMVVMLifecycle2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((CatchingFishViewFABEspresso) obj2).CatchingFishSnackbar) {
                break;
            }
        }
        CatchingFishViewFABEspresso catchingFishViewFABEspresso2 = (CatchingFishViewFABEspresso) obj2;
        if (catchingFishViewFABEspresso2 != null) {
            return catchingFishViewFABEspresso2;
        }
        Iterator it6 = catchingFishMVVMLifecycle.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((CatchingFishViewFABEspresso) next2).CatchingFishSnackbar) {
                obj3 = next2;
                break;
            }
        }
        return (CatchingFishViewFABEspresso) obj3;
    }

    public final void CatchingFishParcelableFAB(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishWidgetLiveData catchingFishWidgetLiveData, int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishFluxFluxBundle, "dispatcher");
        if (catchingFishWidgetLiveData.CatchingFishParcelableFAB == null) {
            (i != 0 ? i != 1 ? this.CatchingFishLayout : this.CatchingFishFragmentHandler : this.CatchingFishCloudMessaging).add(catchingFishWidgetLiveData);
            catchingFishWidgetLiveData.CatchingFishParcelableFAB = catchingFishFluxFluxBundle;
            CatchingFishFirebaseDagger.CatchingFishNavigation((CatchingFishMoshiLifecycle) this.CatchingFishCoroutine.CatchingFishReduxKtor.getValue(), "history");
            catchingFishWidgetLiveData.CatchingFishSnackbar(i != 0 ? i != 1 ? this.CatchingFishUnitTesting : this.CatchingFishEspressoTesting : this.CatchingFishOkHttp);
            return;
        }
        throw new IllegalArgumentException(("Input '" + catchingFishWidgetLiveData + "' is already added to dispatcher " + catchingFishWidgetLiveData.CatchingFishParcelableFAB + '.').toString());
    }

    public final void CatchingFishSnackbar() {
        boolean z;
        boolean z2;
        CatchingFishMoshiLifecycle catchingFishMoshiLifecycle;
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = this.CatchingFishReduxKtor;
        if (catchingFishMVVMLifecycle == null || !catchingFishMVVMLifecycle.isEmpty()) {
            Iterator it = catchingFishMVVMLifecycle.iterator();
            while (it.hasNext()) {
                if (((CatchingFishViewFABEspresso) it.next()).CatchingFishSnackbar) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle2 = this.CatchingFishDaggerWebsocket;
        if (catchingFishMVVMLifecycle2 == null || !catchingFishMVVMLifecycle2.isEmpty()) {
            Iterator it2 = catchingFishMVVMLifecycle2.iterator();
            while (it2.hasNext()) {
                if (((CatchingFishViewFABEspresso) it2.next()).CatchingFishSnackbar) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.CatchingFishOkHttp != z;
        boolean z5 = this.CatchingFishEspressoTesting != z2;
        boolean z6 = this.CatchingFishUnitTesting != z3;
        LinkedHashSet linkedHashSet = this.CatchingFishCloudMessaging;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((CatchingFishWidgetLiveData) it3.next()).CatchingFishSnackbar(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.CatchingFishFragmentHandler;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((CatchingFishWidgetLiveData) it4.next()).CatchingFishSnackbar(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.CatchingFishLayout;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((CatchingFishWidgetLiveData) it5.next()).CatchingFishSnackbar(z3);
            }
        }
        this.CatchingFishOkHttp = z;
        this.CatchingFishEspressoTesting = z2;
        this.CatchingFishUnitTesting = z3;
        CatchingFishViewFABEspresso catchingFishViewFABEspresso = this.CatchingFishWorkManager;
        if (catchingFishViewFABEspresso == null) {
            catchingFishViewFABEspresso = CatchingFishCoroutine(0);
        }
        CatchingFishViewFABEspresso catchingFishViewFABEspresso2 = this.CatchingFishWorkManager;
        if (catchingFishViewFABEspresso2 == null) {
            catchingFishViewFABEspresso2 = CatchingFishCoroutine(0);
        }
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishViewFABEspresso2, catchingFishViewFABEspresso)) {
            if (catchingFishViewFABEspresso2 == null) {
                catchingFishMoshiLifecycle = new CatchingFishMoshiLifecycle();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = catchingFishMVVMLifecycle.iterator();
                while (it6.hasNext()) {
                    ((CatchingFishViewFABEspresso) it6.next()).getClass();
                }
                Iterator<E> it7 = catchingFishMVVMLifecycle2.iterator();
                while (it7.hasNext()) {
                    ((CatchingFishViewFABEspresso) it7.next()).getClass();
                }
                CatchingFishCardViewToast catchingFishCardViewToast = catchingFishViewFABEspresso2.CatchingFishParcelableFAB;
                CatchingFishCameraXGson catchingFishCameraXGson = new CatchingFishCameraXGson(10);
                CatchingFishMVVMStateFlow.CatchingFishAppCompat(catchingFishCameraXGson, arrayList);
                catchingFishCameraXGson.add(catchingFishCardViewToast);
                CatchingFishMVVMStateFlow.CatchingFishAppCompat(catchingFishCameraXGson, CatchingFishViewPagerDagger.CatchingFishReduxKtor);
                catchingFishMoshiLifecycle = new CatchingFishMoshiLifecycle(arrayList.size(), CatchingFishGsonCardView.CatchingFishWorkManager(catchingFishCameraXGson));
            }
            CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = this.CatchingFishSnackbar;
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp((CatchingFishMoshiLifecycle) catchingFishHandlerAndroidX.getValue(), catchingFishMoshiLifecycle)) {
                return;
            }
            catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, catchingFishMoshiLifecycle);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((CatchingFishWidgetLiveData) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((CatchingFishWidgetLiveData) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((CatchingFishWidgetLiveData) it10.next()).getClass();
            }
        }
    }
}
