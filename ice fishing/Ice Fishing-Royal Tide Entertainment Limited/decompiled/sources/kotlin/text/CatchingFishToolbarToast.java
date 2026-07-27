package kotlin.text;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishToolbarToast {
    public final WeakReference CatchingFishDaggerWebsocket;
    public final CatchingFishHandlerAndroidX CatchingFishFragmentHandler;
    public final ArrayList CatchingFishLayout;
    public CatchingFishMockkFirebase CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public int CatchingFishWorkManager;
    public CatchingFishServiceHilt CatchingFishParcelableFAB = new CatchingFishServiceHilt(17);
    public final boolean CatchingFishSnackbar = true;
    public CatchingFishRealmGradle CatchingFishCoroutine = new CatchingFishRealmGradle();

    public CatchingFishToolbarToast(CatchingFishToastFlux catchingFishToastFlux) {
        CatchingFishMockkFirebase catchingFishMockkFirebase = CatchingFishMockkFirebase.CatchingFishDaggerWebsocket;
        this.CatchingFishReduxKtor = catchingFishMockkFirebase;
        this.CatchingFishLayout = new ArrayList();
        this.CatchingFishDaggerWebsocket = new WeakReference(catchingFishToastFlux);
        this.CatchingFishFragmentHandler = CatchingFishFirebaseDagger.CatchingFishLayout(catchingFishMockkFirebase);
    }

    public final void CatchingFishCoroutine(String str) {
        if (this.CatchingFishSnackbar) {
            ((CatchingFishJobSchedulerFAB) CatchingFishJobSchedulerFAB.CatchingFishRedux().CatchingFishParcelableFAB).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishOkHttp("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void CatchingFishDaggerWebsocket(CatchingFishMockkFirebase catchingFishMockkFirebase) {
        if (this.CatchingFishReduxKtor == catchingFishMockkFirebase) {
            return;
        }
        CatchingFishToastFlux catchingFishToastFlux = (CatchingFishToastFlux) this.CatchingFishDaggerWebsocket.get();
        CatchingFishMockkFirebase catchingFishMockkFirebase2 = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkFirebase2, "current");
        CatchingFishMockkFirebase catchingFishMockkFirebase3 = CatchingFishMockkFirebase.CatchingFishDaggerWebsocket;
        CatchingFishMockkFirebase catchingFishMockkFirebase4 = CatchingFishMockkFirebase.CatchingFishReduxKtor;
        if (catchingFishMockkFirebase2 == catchingFishMockkFirebase3 && catchingFishMockkFirebase == catchingFishMockkFirebase4) {
            throw new IllegalStateException(("State must be at least '" + CatchingFishMockkFirebase.CatchingFishWorkManager + "' to be moved to '" + catchingFishMockkFirebase + "' in component " + catchingFishToastFlux).toString());
        }
        if (catchingFishMockkFirebase2 == catchingFishMockkFirebase4 && catchingFishMockkFirebase2 != catchingFishMockkFirebase) {
            throw new IllegalStateException(("State is '" + catchingFishMockkFirebase4 + "' and cannot be moved to `" + catchingFishMockkFirebase + "` in component " + catchingFishToastFlux).toString());
        }
        this.CatchingFishReduxKtor = catchingFishMockkFirebase;
        if (this.CatchingFishViewModelScope || this.CatchingFishWorkManager != 0) {
            this.CatchingFishViewModelFAB = true;
            return;
        }
        this.CatchingFishViewModelScope = true;
        CatchingFishViewModelFAB();
        this.CatchingFishViewModelScope = false;
        if (this.CatchingFishReduxKtor == catchingFishMockkFirebase4) {
            this.CatchingFishCoroutine = new CatchingFishRealmGradle();
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP) {
        CatchingFishMVPViewService catchingFishLiveDataPicasso;
        Object obj;
        CatchingFishToastFlux catchingFishToastFlux;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishLiveDataFABMVP, "observer");
        CatchingFishCoroutine("addObserver");
        CatchingFishMockkFirebase catchingFishMockkFirebase = this.CatchingFishReduxKtor;
        CatchingFishMockkFirebase catchingFishMockkFirebase2 = CatchingFishMockkFirebase.CatchingFishReduxKtor;
        if (catchingFishMockkFirebase != catchingFishMockkFirebase2) {
            catchingFishMockkFirebase2 = CatchingFishMockkFirebase.CatchingFishDaggerWebsocket;
        }
        CatchingFishMockkWidgetView catchingFishMockkWidgetView = new CatchingFishMockkWidgetView();
        HashMap hashMap = CatchingFishAsyncTaskMoshi.CatchingFishParcelableFAB;
        boolean z = catchingFishLiveDataFABMVP instanceof CatchingFishMVPViewService;
        boolean z2 = catchingFishLiveDataFABMVP instanceof CatchingFishCoroutineWidget;
        int i = 2;
        if (z && z2) {
            catchingFishLiveDataPicasso = new CatchingFishLiveDataPicasso((CatchingFishCoroutineWidget) catchingFishLiveDataFABMVP, (CatchingFishMVPViewService) catchingFishLiveDataFABMVP);
        } else if (z2) {
            catchingFishLiveDataPicasso = new CatchingFishLiveDataPicasso((CatchingFishCoroutineWidget) catchingFishLiveDataFABMVP, (CatchingFishMVPViewService) null);
        } else if (z) {
            catchingFishLiveDataPicasso = (CatchingFishMVPViewService) catchingFishLiveDataFABMVP;
        } else {
            Class<?> cls = catchingFishLiveDataFABMVP.getClass();
            if (CatchingFishAsyncTaskMoshi.CatchingFishSnackbar(cls) == 2) {
                Object obj2 = CatchingFishAsyncTaskMoshi.CatchingFishSnackbar.get(cls);
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    CatchingFishAsyncTaskMoshi.CatchingFishParcelableFAB((Constructor) list.get(0), catchingFishLiveDataFABMVP);
                    throw null;
                }
                int size = list.size();
                CatchingFishPicassoRoom[] catchingFishPicassoRoomArr = new CatchingFishPicassoRoom[size];
                if (size > 0) {
                    CatchingFishAsyncTaskMoshi.CatchingFishParcelableFAB((Constructor) list.get(0), catchingFishLiveDataFABMVP);
                    throw null;
                }
                catchingFishLiveDataPicasso = new CatchingFishMoshiMVI(i, catchingFishPicassoRoomArr);
            } else {
                catchingFishLiveDataPicasso = new CatchingFishLiveDataPicasso(catchingFishLiveDataFABMVP);
            }
        }
        catchingFishMockkWidgetView.CatchingFishSnackbar = catchingFishLiveDataPicasso;
        catchingFishMockkWidgetView.CatchingFishParcelableFAB = catchingFishMockkFirebase2;
        CatchingFishRealmGradle catchingFishRealmGradle = this.CatchingFishCoroutine;
        CatchingFishPayPalGraphQL CatchingFishParcelableFAB = catchingFishRealmGradle.CatchingFishParcelableFAB(catchingFishLiveDataFABMVP);
        if (CatchingFishParcelableFAB != null) {
            obj = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
        } else {
            HashMap hashMap2 = catchingFishRealmGradle.CatchingFishViewModelFAB;
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = new CatchingFishPayPalGraphQL(catchingFishLiveDataFABMVP, catchingFishMockkWidgetView);
            catchingFishRealmGradle.CatchingFishViewModelScope++;
            CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2 = catchingFishRealmGradle.CatchingFishDaggerWebsocket;
            if (catchingFishPayPalGraphQL2 == null) {
                catchingFishRealmGradle.CatchingFishReduxKtor = catchingFishPayPalGraphQL;
                catchingFishRealmGradle.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL;
            } else {
                catchingFishPayPalGraphQL2.CatchingFishWorkManager = catchingFishPayPalGraphQL;
                catchingFishPayPalGraphQL.CatchingFishViewModelScope = catchingFishPayPalGraphQL2;
                catchingFishRealmGradle.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL;
            }
            hashMap2.put(catchingFishLiveDataFABMVP, catchingFishPayPalGraphQL);
            obj = null;
        }
        if (((CatchingFishMockkWidgetView) obj) == null && (catchingFishToastFlux = (CatchingFishToastFlux) this.CatchingFishDaggerWebsocket.get()) != null) {
            boolean z3 = this.CatchingFishWorkManager != 0 || this.CatchingFishViewModelScope;
            CatchingFishMockkFirebase CatchingFishSnackbar = CatchingFishSnackbar(catchingFishLiveDataFABMVP);
            this.CatchingFishWorkManager++;
            while (catchingFishMockkWidgetView.CatchingFishParcelableFAB.compareTo(CatchingFishSnackbar) < 0 && this.CatchingFishCoroutine.CatchingFishViewModelFAB.containsKey(catchingFishLiveDataFABMVP)) {
                CatchingFishMockkFirebase catchingFishMockkFirebase3 = catchingFishMockkWidgetView.CatchingFishParcelableFAB;
                ArrayList arrayList = this.CatchingFishLayout;
                arrayList.add(catchingFishMockkFirebase3);
                CatchingFishFABMVVMService catchingFishFABMVVMService = CatchingFishToolbarLiveData.Companion;
                CatchingFishMockkFirebase catchingFishMockkFirebase4 = catchingFishMockkWidgetView.CatchingFishParcelableFAB;
                catchingFishFABMVVMService.getClass();
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkFirebase4, "state");
                int ordinal = catchingFishMockkFirebase4.ordinal();
                CatchingFishToolbarLiveData catchingFishToolbarLiveData = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : CatchingFishToolbarLiveData.ON_RESUME : CatchingFishToolbarLiveData.ON_START : CatchingFishToolbarLiveData.ON_CREATE;
                if (catchingFishToolbarLiveData == null) {
                    throw new IllegalStateException("no event up from " + catchingFishMockkWidgetView.CatchingFishParcelableFAB);
                }
                catchingFishMockkWidgetView.CatchingFishParcelableFAB(catchingFishToastFlux, catchingFishToolbarLiveData);
                arrayList.remove(arrayList.size() - 1);
                CatchingFishSnackbar = CatchingFishSnackbar(catchingFishLiveDataFABMVP);
            }
            if (!z3) {
                CatchingFishViewModelFAB();
            }
            this.CatchingFishWorkManager--;
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarLiveData, "event");
        CatchingFishCoroutine("handleLifecycleEvent");
        CatchingFishDaggerWebsocket(catchingFishToolbarLiveData.CatchingFishParcelableFAB());
    }

    public final CatchingFishMockkFirebase CatchingFishSnackbar(CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP) {
        HashMap hashMap = this.CatchingFishCoroutine.CatchingFishViewModelFAB;
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = hashMap.containsKey(catchingFishLiveDataFABMVP) ? ((CatchingFishPayPalGraphQL) hashMap.get(catchingFishLiveDataFABMVP)).CatchingFishViewModelScope : null;
        CatchingFishMockkFirebase catchingFishMockkFirebase = catchingFishPayPalGraphQL != null ? ((CatchingFishMockkWidgetView) catchingFishPayPalGraphQL.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB : null;
        ArrayList arrayList = this.CatchingFishLayout;
        CatchingFishMockkFirebase catchingFishMockkFirebase2 = arrayList.isEmpty() ? null : (CatchingFishMockkFirebase) arrayList.get(arrayList.size() - 1);
        CatchingFishMockkFirebase catchingFishMockkFirebase3 = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkFirebase3, "state1");
        if (catchingFishMockkFirebase == null || catchingFishMockkFirebase.compareTo(catchingFishMockkFirebase3) >= 0) {
            catchingFishMockkFirebase = catchingFishMockkFirebase3;
        }
        return (catchingFishMockkFirebase2 == null || catchingFishMockkFirebase2.compareTo(catchingFishMockkFirebase) >= 0) ? catchingFishMockkFirebase : catchingFishMockkFirebase2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.CatchingFishViewModelFAB = false;
        r12.CatchingFishFragmentHandler.CatchingFishViewModelFAB(r12.CatchingFishReduxKtor);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishViewModelFAB() {
        CatchingFishToastFlux catchingFishToastFlux = (CatchingFishToastFlux) this.CatchingFishDaggerWebsocket.get();
        if (catchingFishToastFlux == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            CatchingFishRealmGradle catchingFishRealmGradle = this.CatchingFishCoroutine;
            if (catchingFishRealmGradle.CatchingFishViewModelScope != 0) {
                CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = catchingFishRealmGradle.CatchingFishReduxKtor;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishPayPalGraphQL);
                CatchingFishMockkFirebase catchingFishMockkFirebase = ((CatchingFishMockkWidgetView) catchingFishPayPalGraphQL.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB;
                CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2 = this.CatchingFishCoroutine.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishPayPalGraphQL2);
                CatchingFishMockkFirebase catchingFishMockkFirebase2 = ((CatchingFishMockkWidgetView) catchingFishPayPalGraphQL2.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB;
                if (catchingFishMockkFirebase == catchingFishMockkFirebase2 && this.CatchingFishReduxKtor == catchingFishMockkFirebase2) {
                    break;
                }
                this.CatchingFishViewModelFAB = false;
                CatchingFishMockkFirebase catchingFishMockkFirebase3 = this.CatchingFishReduxKtor;
                CatchingFishPayPalGraphQL catchingFishPayPalGraphQL3 = this.CatchingFishCoroutine.CatchingFishReduxKtor;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishPayPalGraphQL3);
                if (catchingFishMockkFirebase3.compareTo(((CatchingFishMockkWidgetView) catchingFishPayPalGraphQL3.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB) < 0) {
                    CatchingFishRealmGradle catchingFishRealmGradle2 = this.CatchingFishCoroutine;
                    CatchingFishAnimationLayout catchingFishAnimationLayout = new CatchingFishAnimationLayout(catchingFishRealmGradle2.CatchingFishDaggerWebsocket, catchingFishRealmGradle2.CatchingFishReduxKtor, 1);
                    catchingFishRealmGradle2.CatchingFishWorkManager.put(catchingFishAnimationLayout, Boolean.FALSE);
                    while (catchingFishAnimationLayout.hasNext() && !this.CatchingFishViewModelFAB) {
                        Map.Entry entry = (Map.Entry) catchingFishAnimationLayout.next();
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(entry);
                        CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP = (CatchingFishLiveDataFABMVP) entry.getKey();
                        CatchingFishMockkWidgetView catchingFishMockkWidgetView = (CatchingFishMockkWidgetView) entry.getValue();
                        while (catchingFishMockkWidgetView.CatchingFishParcelableFAB.compareTo(this.CatchingFishReduxKtor) > 0 && !this.CatchingFishViewModelFAB && this.CatchingFishCoroutine.CatchingFishViewModelFAB.containsKey(catchingFishLiveDataFABMVP)) {
                            CatchingFishFABMVVMService catchingFishFABMVVMService = CatchingFishToolbarLiveData.Companion;
                            CatchingFishMockkFirebase catchingFishMockkFirebase4 = catchingFishMockkWidgetView.CatchingFishParcelableFAB;
                            catchingFishFABMVVMService.getClass();
                            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkFirebase4, "state");
                            int ordinal = catchingFishMockkFirebase4.ordinal();
                            CatchingFishToolbarLiveData catchingFishToolbarLiveData = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : CatchingFishToolbarLiveData.ON_PAUSE : CatchingFishToolbarLiveData.ON_STOP : CatchingFishToolbarLiveData.ON_DESTROY;
                            if (catchingFishToolbarLiveData == null) {
                                throw new IllegalStateException("no event down from " + catchingFishMockkWidgetView.CatchingFishParcelableFAB);
                            }
                            this.CatchingFishLayout.add(catchingFishToolbarLiveData.CatchingFishParcelableFAB());
                            catchingFishMockkWidgetView.CatchingFishParcelableFAB(catchingFishToastFlux, catchingFishToolbarLiveData);
                            ArrayList arrayList = this.CatchingFishLayout;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                CatchingFishPayPalGraphQL catchingFishPayPalGraphQL4 = this.CatchingFishCoroutine.CatchingFishDaggerWebsocket;
                if (!this.CatchingFishViewModelFAB && catchingFishPayPalGraphQL4 != null && this.CatchingFishReduxKtor.compareTo(((CatchingFishMockkWidgetView) catchingFishPayPalGraphQL4.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB) > 0) {
                    CatchingFishRealmGradle catchingFishRealmGradle3 = this.CatchingFishCoroutine;
                    catchingFishRealmGradle3.getClass();
                    CatchingFishCoroutineKtor catchingFishCoroutineKtor = new CatchingFishCoroutineKtor(catchingFishRealmGradle3);
                    catchingFishRealmGradle3.CatchingFishWorkManager.put(catchingFishCoroutineKtor, Boolean.FALSE);
                    while (catchingFishCoroutineKtor.hasNext() && !this.CatchingFishViewModelFAB) {
                        Map.Entry entry2 = (Map.Entry) catchingFishCoroutineKtor.next();
                        CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP2 = (CatchingFishLiveDataFABMVP) entry2.getKey();
                        CatchingFishMockkWidgetView catchingFishMockkWidgetView2 = (CatchingFishMockkWidgetView) entry2.getValue();
                        while (catchingFishMockkWidgetView2.CatchingFishParcelableFAB.compareTo(this.CatchingFishReduxKtor) < 0 && !this.CatchingFishViewModelFAB && this.CatchingFishCoroutine.CatchingFishViewModelFAB.containsKey(catchingFishLiveDataFABMVP2)) {
                            this.CatchingFishLayout.add(catchingFishMockkWidgetView2.CatchingFishParcelableFAB);
                            CatchingFishFABMVVMService catchingFishFABMVVMService2 = CatchingFishToolbarLiveData.Companion;
                            CatchingFishMockkFirebase catchingFishMockkFirebase5 = catchingFishMockkWidgetView2.CatchingFishParcelableFAB;
                            catchingFishFABMVVMService2.getClass();
                            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMockkFirebase5, "state");
                            int ordinal2 = catchingFishMockkFirebase5.ordinal();
                            CatchingFishToolbarLiveData catchingFishToolbarLiveData2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : CatchingFishToolbarLiveData.ON_RESUME : CatchingFishToolbarLiveData.ON_START : CatchingFishToolbarLiveData.ON_CREATE;
                            if (catchingFishToolbarLiveData2 == null) {
                                throw new IllegalStateException("no event up from " + catchingFishMockkWidgetView2.CatchingFishParcelableFAB);
                            }
                            catchingFishMockkWidgetView2.CatchingFishParcelableFAB(catchingFishToastFlux, catchingFishToolbarLiveData2);
                            ArrayList arrayList2 = this.CatchingFishLayout;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }

    public final void CatchingFishViewModelScope() {
        CatchingFishCoroutine("setCurrentState");
        CatchingFishDaggerWebsocket(CatchingFishMockkFirebase.CatchingFishWorkManager);
    }

    public final void CatchingFishWorkManager(CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishLiveDataFABMVP, "observer");
        CatchingFishCoroutine("removeObserver");
        this.CatchingFishCoroutine.CatchingFishSnackbar(catchingFishLiveDataFABMVP);
    }
}
