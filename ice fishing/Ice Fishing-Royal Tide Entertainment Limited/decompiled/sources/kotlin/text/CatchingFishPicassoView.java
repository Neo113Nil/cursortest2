package kotlin.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishPicassoView implements CatchingFishRoomViewGson, CatchingFishMVPJobScheduler {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishReduxKtor = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoView.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishDaggerWebsocket = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoView.class, Object.class, "_parentHandle$volatile");

    public CatchingFishPicassoView(boolean z) {
        this._state$volatile = z ? CatchingFishXMLLayoutGlide.CatchingFishCloudMessaging : CatchingFishXMLLayoutGlide.CatchingFishFragmentHandler;
    }

    public static CatchingFishKtorCardView CatchingFishRecyclerView(CatchingFishGsonDatabinding catchingFishGsonDatabinding) {
        while (catchingFishGsonDatabinding.CatchingFishLayout()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishGsonDatabinding.CatchingFishDaggerWebsocket;
            CatchingFishGsonDatabinding CatchingFishWorkManager = catchingFishGsonDatabinding.CatchingFishWorkManager();
            if (CatchingFishWorkManager == null) {
                Object obj = atomicReferenceFieldUpdater.get(catchingFishGsonDatabinding);
                while (true) {
                    catchingFishGsonDatabinding = (CatchingFishGsonDatabinding) obj;
                    if (!catchingFishGsonDatabinding.CatchingFishLayout()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(catchingFishGsonDatabinding);
                }
            } else {
                catchingFishGsonDatabinding = CatchingFishWorkManager;
            }
        }
        while (true) {
            catchingFishGsonDatabinding = catchingFishGsonDatabinding.CatchingFishViewModelFAB();
            if (!catchingFishGsonDatabinding.CatchingFishLayout()) {
                if (catchingFishGsonDatabinding instanceof CatchingFishKtorCardView) {
                    return (CatchingFishKtorCardView) catchingFishGsonDatabinding;
                }
                if (catchingFishGsonDatabinding instanceof CatchingFishSnackbarRealm) {
                    return null;
                }
            }
        }
    }

    public static String CatchingFishStripeAPI(Object obj) {
        if (!(obj instanceof CatchingFishGraphQLWidget)) {
            return obj instanceof CatchingFishHiltAsyncTask ? ((CatchingFishHiltAsyncTask) obj).CatchingFishSnackbar() ? "Active" : "New" : obj instanceof CatchingFishStripeAPIMVI ? "Cancelled" : "Completed";
        }
        CatchingFishGraphQLWidget catchingFishGraphQLWidget = (CatchingFishGraphQLWidget) obj;
        return catchingFishGraphQLWidget.CatchingFishDaggerWebsocket() ? "Cancelling" : CatchingFishGraphQLWidget.CatchingFishDaggerWebsocket.get(catchingFishGraphQLWidget) != 0 ? "Completing" : "Active";
    }

    public final boolean CatchingFishAndroidX(CatchingFishGraphQLWidget catchingFishGraphQLWidget, CatchingFishKtorCardView catchingFishKtorCardView, Object obj) {
        while (CatchingFishLayoutRoomFAB.CatchingFishMutableLiveData(catchingFishKtorCardView.CatchingFishViewModelFAB, false, new CatchingFishManifestLayout(this, catchingFishGraphQLWidget, catchingFishKtorCardView, obj)) == CatchingFishPayPalMockk.CatchingFishReduxKtor) {
            catchingFishKtorCardView = CatchingFishRecyclerView(catchingFishKtorCardView);
            if (catchingFishKtorCardView == null) {
                return false;
            }
        }
        return true;
    }

    public final void CatchingFishAnimation(CatchingFishSnackbarRoom catchingFishSnackbarRoom) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        CatchingFishSnackbarRealm catchingFishSnackbarRealm = new CatchingFishSnackbarRealm();
        catchingFishSnackbarRoom.getClass();
        CatchingFishGsonDatabinding.CatchingFishDaggerWebsocket.set(catchingFishSnackbarRealm, catchingFishSnackbarRoom);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishGsonDatabinding.CatchingFishReduxKtor;
        atomicReferenceFieldUpdater2.set(catchingFishSnackbarRealm, catchingFishSnackbarRoom);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(catchingFishSnackbarRoom) == catchingFishSnackbarRoom) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(catchingFishSnackbarRoom, catchingFishSnackbarRoom, catchingFishSnackbarRealm)) {
                    if (atomicReferenceFieldUpdater2.get(catchingFishSnackbarRoom) != catchingFishSnackbarRoom) {
                        break;
                    }
                }
                catchingFishSnackbarRealm.CatchingFishViewModelScope(catchingFishSnackbarRoom);
                break loop0;
            }
            break;
        }
        CatchingFishGsonDatabinding CatchingFishViewModelFAB = catchingFishSnackbarRoom.CatchingFishViewModelFAB();
        do {
            atomicReferenceFieldUpdater = CatchingFishReduxKtor;
            if (atomicReferenceFieldUpdater.compareAndSet(this, catchingFishSnackbarRoom, CatchingFishViewModelFAB)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == catchingFishSnackbarRoom);
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishManifestMockk CatchingFishAnimationMockk(CatchingFishManifestMockk catchingFishManifestMockk) {
        return CatchingFishAdMobFAB.CatchingFishMutableLiveData(this, catchingFishManifestMockk);
    }

    public final void CatchingFishAppCompat(CatchingFishSnackbarRealm catchingFishSnackbarRealm, Throwable th) {
        catchingFishSnackbarRealm.CatchingFishDaggerWebsocket(new CatchingFishSharedFlowKtor(4), 4);
        Object obj = CatchingFishGsonDatabinding.CatchingFishReduxKtor.get(catchingFishSnackbarRealm);
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CatchingFishBiometricView catchingFishBiometricView = null;
        for (CatchingFishGsonDatabinding catchingFishGsonDatabinding = (CatchingFishGsonDatabinding) obj; !catchingFishGsonDatabinding.equals(catchingFishSnackbarRealm); catchingFishGsonDatabinding = catchingFishGsonDatabinding.CatchingFishViewModelFAB()) {
            if ((catchingFishGsonDatabinding instanceof CatchingFishSnackbarRoom) && ((CatchingFishSnackbarRoom) catchingFishGsonDatabinding).CatchingFishCloudMessaging()) {
                try {
                    ((CatchingFishSnackbarRoom) catchingFishGsonDatabinding).CatchingFishEspressoTesting(th);
                } catch (Throwable th2) {
                    if (catchingFishBiometricView != null) {
                        CatchingFishAdMobFAB.CatchingFishViewModelFAB(catchingFishBiometricView, th2);
                    } else {
                        catchingFishBiometricView = new CatchingFishBiometricView("Exception in completion handler " + catchingFishGsonDatabinding + " for " + this, th2);
                    }
                }
            }
        }
        if (catchingFishBiometricView != null) {
            CatchingFishCameraXIntent(catchingFishBiometricView);
        }
        CatchingFishPayPal(th);
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public final CatchingFishStripeAPIBundle CatchingFishCardViewRealm(boolean z, boolean z2, CatchingFishPayPalToast catchingFishPayPalToast) {
        return CatchingFishPayPalLiveData(z2, z ? new CatchingFishLayoutRealm(catchingFishPayPalToast) : new CatchingFishOkHttpJUnitFAB(0, catchingFishPayPalToast));
    }

    public String CatchingFishCardViewView() {
        return "Job was cancelled";
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public void CatchingFishCoroutine(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CatchingFishServiceGlide(CatchingFishCardViewView(), null, this);
        }
        CatchingFishGsonAppCompat(cancellationException);
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishPicassoContext CatchingFishCoroutineFlow(CatchingFishGlidePayPal catchingFishGlidePayPal) {
        return CatchingFishAdMobFAB.CatchingFishCoroutineFlow(this, catchingFishGlidePayPal);
    }

    public final void CatchingFishCustomView(CatchingFishHiltAsyncTask catchingFishHiltAsyncTask, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishDaggerWebsocket;
        CatchingFishMVVMRobolectric catchingFishMVVMRobolectric = (CatchingFishMVVMRobolectric) atomicReferenceFieldUpdater.get(this);
        if (catchingFishMVVMRobolectric != null) {
            catchingFishMVVMRobolectric.CatchingFishParcelableFAB();
            atomicReferenceFieldUpdater.set(this, CatchingFishPayPalMockk.CatchingFishReduxKtor);
        }
        CatchingFishBiometricView catchingFishBiometricView = null;
        CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj : null;
        Throwable th = catchingFishStripeAPIMVI != null ? catchingFishStripeAPIMVI.CatchingFishParcelableFAB : null;
        if (catchingFishHiltAsyncTask instanceof CatchingFishSnackbarRoom) {
            try {
                ((CatchingFishSnackbarRoom) catchingFishHiltAsyncTask).CatchingFishEspressoTesting(th);
                return;
            } catch (Throwable th2) {
                CatchingFishCameraXIntent(new CatchingFishBiometricView("Exception in completion handler " + catchingFishHiltAsyncTask + " for " + this, th2));
                return;
            }
        }
        CatchingFishSnackbarRealm CatchingFishReduxKtor2 = catchingFishHiltAsyncTask.CatchingFishReduxKtor();
        if (CatchingFishReduxKtor2 != null) {
            CatchingFishReduxKtor2.CatchingFishDaggerWebsocket(new CatchingFishSharedFlowKtor(1), 1);
            Object obj2 = CatchingFishGsonDatabinding.CatchingFishReduxKtor.get(CatchingFishReduxKtor2);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (CatchingFishGsonDatabinding catchingFishGsonDatabinding = (CatchingFishGsonDatabinding) obj2; !catchingFishGsonDatabinding.equals(CatchingFishReduxKtor2); catchingFishGsonDatabinding = catchingFishGsonDatabinding.CatchingFishViewModelFAB()) {
                if (catchingFishGsonDatabinding instanceof CatchingFishSnackbarRoom) {
                    try {
                        ((CatchingFishSnackbarRoom) catchingFishGsonDatabinding).CatchingFishEspressoTesting(th);
                    } catch (Throwable th3) {
                        if (catchingFishBiometricView != null) {
                            CatchingFishAdMobFAB.CatchingFishViewModelFAB(catchingFishBiometricView, th3);
                        } else {
                            catchingFishBiometricView = new CatchingFishBiometricView("Exception in completion handler " + catchingFishGsonDatabinding + " for " + this, th3);
                        }
                    }
                }
            }
            if (catchingFishBiometricView != null) {
                CatchingFishCameraXIntent(catchingFishBiometricView);
            }
        }
    }

    public boolean CatchingFishDagger(Throwable th) {
        return false;
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public final CatchingFishMVVMRobolectric CatchingFishDaggerWebsocket(CatchingFishPicassoView catchingFishPicassoView) {
        CatchingFishKtorCardView catchingFishKtorCardView = new CatchingFishKtorCardView(catchingFishPicassoView);
        catchingFishKtorCardView.CatchingFishViewModelScope = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishReduxKtor;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof CatchingFishManifestMVVM) {
                CatchingFishManifestMVVM catchingFishManifestMVVM = (CatchingFishManifestMVVM) obj;
                if (catchingFishManifestMVVM.CatchingFishReduxKtor) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishKtorCardView)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                CatchingFishJUnitRealm(catchingFishManifestMVVM);
            } else {
                boolean z = obj instanceof CatchingFishHiltAsyncTask;
                CatchingFishPayPalMockk catchingFishPayPalMockk = CatchingFishPayPalMockk.CatchingFishReduxKtor;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj2 instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj2 : null;
                    catchingFishKtorCardView.CatchingFishEspressoTesting(catchingFishStripeAPIMVI != null ? catchingFishStripeAPIMVI.CatchingFishParcelableFAB : null);
                    return catchingFishPayPalMockk;
                }
                CatchingFishSnackbarRealm CatchingFishReduxKtor2 = ((CatchingFishHiltAsyncTask) obj).CatchingFishReduxKtor();
                if (CatchingFishReduxKtor2 == null) {
                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    CatchingFishAnimation((CatchingFishSnackbarRoom) obj);
                } else if (!CatchingFishReduxKtor2.CatchingFishDaggerWebsocket(catchingFishKtorCardView, 7)) {
                    boolean CatchingFishDaggerWebsocket2 = CatchingFishReduxKtor2.CatchingFishDaggerWebsocket(catchingFishKtorCardView, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof CatchingFishGraphQLWidget) {
                        r4 = ((CatchingFishGraphQLWidget) obj3).CatchingFishCoroutine();
                    } else {
                        CatchingFishStripeAPIMVI catchingFishStripeAPIMVI2 = obj3 instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj3 : null;
                        if (catchingFishStripeAPIMVI2 != null) {
                            r4 = catchingFishStripeAPIMVI2.CatchingFishParcelableFAB;
                        }
                    }
                    catchingFishKtorCardView.CatchingFishEspressoTesting(r4);
                    if (CatchingFishDaggerWebsocket2) {
                        break loop0;
                    }
                    return catchingFishPayPalMockk;
                }
            }
        }
        return catchingFishKtorCardView;
    }

    public final CatchingFishSnackbarRealm CatchingFishEspressoMockk(CatchingFishHiltAsyncTask catchingFishHiltAsyncTask) {
        CatchingFishSnackbarRealm CatchingFishReduxKtor2 = catchingFishHiltAsyncTask.CatchingFishReduxKtor();
        if (CatchingFishReduxKtor2 != null) {
            return CatchingFishReduxKtor2;
        }
        if (catchingFishHiltAsyncTask instanceof CatchingFishManifestMVVM) {
            return new CatchingFishSnackbarRealm();
        }
        if (catchingFishHiltAsyncTask instanceof CatchingFishSnackbarRoom) {
            CatchingFishAnimation((CatchingFishSnackbarRoom) catchingFishHiltAsyncTask);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + catchingFishHiltAsyncTask).toString());
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final Object CatchingFishEspressoTesting(Object obj, CatchingFishMockkView catchingFishMockkView) {
        return catchingFishMockkView.CatchingFishDaggerWebsocket(obj, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable CatchingFishFragmentFactory(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        CatchingFishPicassoView catchingFishPicassoView = (CatchingFishPicassoView) ((CatchingFishMVPJobScheduler) obj);
        Object obj2 = CatchingFishReduxKtor.get(catchingFishPicassoView);
        if (obj2 instanceof CatchingFishGraphQLWidget) {
            cancellationException = ((CatchingFishGraphQLWidget) obj2).CatchingFishCoroutine();
        } else if (obj2 instanceof CatchingFishStripeAPIMVI) {
            cancellationException = ((CatchingFishStripeAPIMVI) obj2).CatchingFishParcelableFAB;
        } else {
            if (obj2 instanceof CatchingFishHiltAsyncTask) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new CatchingFishServiceGlide("Parent job is ".concat(CatchingFishStripeAPI(obj2)), cancellationException, catchingFishPicassoView) : cancellationException2;
    }

    public final boolean CatchingFishGradleManifest() {
        return !(CatchingFishReduxKtor.get(this) instanceof CatchingFishHiltAsyncTask);
    }

    public void CatchingFishGsonAppCompat(CancellationException cancellationException) {
        CatchingFishParcelableFlux(cancellationException);
    }

    public final void CatchingFishHandler(CatchingFishRoomViewGson catchingFishRoomViewGson) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishDaggerWebsocket;
        CatchingFishPayPalMockk catchingFishPayPalMockk = CatchingFishPayPalMockk.CatchingFishReduxKtor;
        if (catchingFishRoomViewGson == null) {
            atomicReferenceFieldUpdater.set(this, catchingFishPayPalMockk);
            return;
        }
        catchingFishRoomViewGson.start();
        CatchingFishMVVMRobolectric CatchingFishDaggerWebsocket2 = catchingFishRoomViewGson.CatchingFishDaggerWebsocket(this);
        atomicReferenceFieldUpdater.set(this, CatchingFishDaggerWebsocket2);
        if (CatchingFishGradleManifest()) {
            CatchingFishDaggerWebsocket2.CatchingFishParcelableFAB();
            atomicReferenceFieldUpdater.set(this, catchingFishPayPalMockk);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.text.CatchingFishStripeAPIRoom] */
    public final void CatchingFishJUnitRealm(CatchingFishManifestMVVM catchingFishManifestMVVM) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        CatchingFishSnackbarRealm catchingFishSnackbarRealm = new CatchingFishSnackbarRealm();
        if (!catchingFishManifestMVVM.CatchingFishReduxKtor) {
            catchingFishSnackbarRealm = new CatchingFishStripeAPIRoom(catchingFishSnackbarRealm);
        }
        do {
            atomicReferenceFieldUpdater = CatchingFishReduxKtor;
            if (atomicReferenceFieldUpdater.compareAndSet(this, catchingFishManifestMVVM, catchingFishSnackbarRealm)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == catchingFishManifestMVVM);
    }

    public final Throwable CatchingFishJobScheduler(CatchingFishGraphQLWidget catchingFishGraphQLWidget, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (catchingFishGraphQLWidget.CatchingFishDaggerWebsocket()) {
                return new CatchingFishServiceGlide(CatchingFishCardViewView(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof CatchingFishLifecycleMockk) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof CatchingFishLifecycleMockk)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final boolean CatchingFishLayoutInflater(Object obj) {
        Object CatchingFishMoshiDaggerHilt;
        do {
            CatchingFishMoshiDaggerHilt = CatchingFishMoshiDaggerHilt(CatchingFishReduxKtor.get(this), obj);
            if (CatchingFishMoshiDaggerHilt == CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket) {
                return false;
            }
            if (CatchingFishMoshiDaggerHilt == CatchingFishXMLLayoutGlide.CatchingFishWorkManager) {
                return true;
            }
        } while (CatchingFishMoshiDaggerHilt == CatchingFishXMLLayoutGlide.CatchingFishViewModelScope);
        CatchingFishDaggerHiltFAB(CatchingFishMoshiDaggerHilt);
        return true;
    }

    public boolean CatchingFishMVPRobolectric(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return CatchingFishParcelableFlux(th) && CatchingFishPayPalService();
    }

    public final int CatchingFishMVVMAppCompat(Object obj) {
        boolean z = obj instanceof CatchingFishManifestMVVM;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishReduxKtor;
        if (z) {
            if (((CatchingFishManifestMVVM) obj).CatchingFishReduxKtor) {
                return 0;
            }
            CatchingFishManifestMVVM catchingFishManifestMVVM = CatchingFishXMLLayoutGlide.CatchingFishCloudMessaging;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishManifestMVVM)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            CatchingFishStateFlow();
            return 1;
        }
        if (!(obj instanceof CatchingFishStripeAPIRoom)) {
            return 0;
        }
        CatchingFishSnackbarRealm catchingFishSnackbarRealm = ((CatchingFishStripeAPIRoom) obj).CatchingFishReduxKtor;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishSnackbarRealm)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        CatchingFishStateFlow();
        return 1;
    }

    public final Object CatchingFishMoshiDaggerHilt(Object obj, Object obj2) {
        if (!(obj instanceof CatchingFishHiltAsyncTask)) {
            return CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket;
        }
        if (((obj instanceof CatchingFishManifestMVVM) || (obj instanceof CatchingFishSnackbarRoom)) && !(obj instanceof CatchingFishKtorCardView) && !(obj2 instanceof CatchingFishStripeAPIMVI)) {
            CatchingFishHiltAsyncTask catchingFishHiltAsyncTask = (CatchingFishHiltAsyncTask) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishReduxKtor;
            Object catchingFishToastJUnitFlux = obj2 instanceof CatchingFishHiltAsyncTask ? new CatchingFishToastJUnitFlux((CatchingFishHiltAsyncTask) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishHiltAsyncTask, catchingFishToastJUnitFlux)) {
                if (atomicReferenceFieldUpdater.get(this) != catchingFishHiltAsyncTask) {
                    return CatchingFishXMLLayoutGlide.CatchingFishViewModelScope;
                }
            }
            CatchingFishDataStoreIntent(obj2);
            CatchingFishCustomView(catchingFishHiltAsyncTask, obj2);
            return obj2;
        }
        CatchingFishHiltAsyncTask catchingFishHiltAsyncTask2 = (CatchingFishHiltAsyncTask) obj;
        CatchingFishSnackbarRealm CatchingFishEspressoMockk = CatchingFishEspressoMockk(catchingFishHiltAsyncTask2);
        if (CatchingFishEspressoMockk == null) {
            return CatchingFishXMLLayoutGlide.CatchingFishViewModelScope;
        }
        CatchingFishGraphQLWidget catchingFishGraphQLWidget = catchingFishHiltAsyncTask2 instanceof CatchingFishGraphQLWidget ? (CatchingFishGraphQLWidget) catchingFishHiltAsyncTask2 : null;
        if (catchingFishGraphQLWidget == null) {
            catchingFishGraphQLWidget = new CatchingFishGraphQLWidget(CatchingFishEspressoMockk, null);
        }
        synchronized (catchingFishGraphQLWidget) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishGraphQLWidget.CatchingFishDaggerWebsocket;
            if (atomicIntegerFieldUpdater.get(catchingFishGraphQLWidget) != 0) {
                return CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket;
            }
            atomicIntegerFieldUpdater.set(catchingFishGraphQLWidget, 1);
            if (catchingFishGraphQLWidget != catchingFishHiltAsyncTask2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishReduxKtor;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, catchingFishHiltAsyncTask2, catchingFishGraphQLWidget)) {
                    if (atomicReferenceFieldUpdater2.get(this) != catchingFishHiltAsyncTask2) {
                        return CatchingFishXMLLayoutGlide.CatchingFishViewModelScope;
                    }
                }
            }
            boolean CatchingFishDaggerWebsocket2 = catchingFishGraphQLWidget.CatchingFishDaggerWebsocket();
            CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj2 instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj2 : null;
            if (catchingFishStripeAPIMVI != null) {
                catchingFishGraphQLWidget.CatchingFishParcelableFAB(catchingFishStripeAPIMVI.CatchingFishParcelableFAB);
            }
            Throwable CatchingFishCoroutine = CatchingFishDaggerWebsocket2 ? null : catchingFishGraphQLWidget.CatchingFishCoroutine();
            if (CatchingFishCoroutine != null) {
                CatchingFishAppCompat(CatchingFishEspressoMockk, CatchingFishCoroutine);
            }
            CatchingFishKtorCardView CatchingFishRecyclerView = CatchingFishRecyclerView(CatchingFishEspressoMockk);
            if (CatchingFishRecyclerView != null && CatchingFishAndroidX(catchingFishGraphQLWidget, CatchingFishRecyclerView, obj2)) {
                return CatchingFishXMLLayoutGlide.CatchingFishWorkManager;
            }
            CatchingFishEspressoMockk.CatchingFishDaggerWebsocket(new CatchingFishSharedFlowKtor(2), 2);
            CatchingFishKtorCardView CatchingFishRecyclerView2 = CatchingFishRecyclerView(CatchingFishEspressoMockk);
            return (CatchingFishRecyclerView2 == null || !CatchingFishAndroidX(catchingFishGraphQLWidget, CatchingFishRecyclerView2, obj2)) ? CatchingFishMutableLiveData(catchingFishGraphQLWidget, obj2) : CatchingFishXMLLayoutGlide.CatchingFishWorkManager;
        }
    }

    public boolean CatchingFishMotionLayout() {
        return this instanceof CatchingFishDataStoreIntent;
    }

    public final Object CatchingFishMutableLiveData(CatchingFishGraphQLWidget catchingFishGraphQLWidget, Object obj) {
        Throwable CatchingFishJobScheduler;
        CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj : null;
        Throwable th = catchingFishStripeAPIMVI != null ? catchingFishStripeAPIMVI.CatchingFishParcelableFAB : null;
        synchronized (catchingFishGraphQLWidget) {
            catchingFishGraphQLWidget.CatchingFishDaggerWebsocket();
            ArrayList CatchingFishWorkManager = catchingFishGraphQLWidget.CatchingFishWorkManager(th);
            CatchingFishJobScheduler = CatchingFishJobScheduler(catchingFishGraphQLWidget, CatchingFishWorkManager);
            if (CatchingFishJobScheduler != null && CatchingFishWorkManager.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(CatchingFishWorkManager.size()));
                int size = CatchingFishWorkManager.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = CatchingFishWorkManager.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != CatchingFishJobScheduler && th2 != CatchingFishJobScheduler && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        CatchingFishAdMobFAB.CatchingFishViewModelFAB(CatchingFishJobScheduler, th2);
                    }
                }
            }
        }
        if (CatchingFishJobScheduler != null && CatchingFishJobScheduler != th) {
            obj = new CatchingFishStripeAPIMVI(CatchingFishJobScheduler, false);
        }
        if (CatchingFishJobScheduler != null && (CatchingFishPayPal(CatchingFishJobScheduler) || CatchingFishDagger(CatchingFishJobScheduler))) {
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            CatchingFishStripeAPIMVI.CatchingFishSnackbar.compareAndSet((CatchingFishStripeAPIMVI) obj, 0, 1);
        }
        CatchingFishDataStoreIntent(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishReduxKtor;
        Object catchingFishToastJUnitFlux = obj instanceof CatchingFishHiltAsyncTask ? new CatchingFishToastJUnitFlux((CatchingFishHiltAsyncTask) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishGraphQLWidget, catchingFishToastJUnitFlux) && atomicReferenceFieldUpdater.get(this) == catchingFishGraphQLWidget) {
        }
        CatchingFishCustomView(catchingFishGraphQLWidget, obj);
        return obj;
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public final CancellationException CatchingFishNavigation() {
        CancellationException cancellationException;
        Object obj = CatchingFishReduxKtor.get(this);
        if (!(obj instanceof CatchingFishGraphQLWidget)) {
            if (obj instanceof CatchingFishHiltAsyncTask) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof CatchingFishStripeAPIMVI)) {
                return new CatchingFishServiceGlide(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((CatchingFishStripeAPIMVI) obj).CatchingFishParcelableFAB;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new CatchingFishServiceGlide(CatchingFishCardViewView(), th, this) : cancellationException;
        }
        Throwable CatchingFishCoroutine = ((CatchingFishGraphQLWidget) obj).CatchingFishCoroutine();
        if (CatchingFishCoroutine == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = CatchingFishCoroutine instanceof CancellationException ? (CancellationException) CatchingFishCoroutine : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = CatchingFishCardViewView();
        }
        return new CatchingFishServiceGlide(concat, CatchingFishCoroutine, this);
    }

    public final Object CatchingFishParcelable(Object obj) {
        Object CatchingFishMoshiDaggerHilt;
        do {
            CatchingFishMoshiDaggerHilt = CatchingFishMoshiDaggerHilt(CatchingFishReduxKtor.get(this), obj);
            if (CatchingFishMoshiDaggerHilt == CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj : null;
                throw new IllegalStateException(str, catchingFishStripeAPIMVI != null ? catchingFishStripeAPIMVI.CatchingFishParcelableFAB : null);
            }
        } while (CatchingFishMoshiDaggerHilt == CatchingFishXMLLayoutGlide.CatchingFishViewModelScope);
        return CatchingFishMoshiDaggerHilt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == kotlin.text.CatchingFishXMLLayoutGlide.CatchingFishWorkManager) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishParcelableFlux(Object obj) {
        CatchingFishFluxWorkManager catchingFishFluxWorkManager;
        Object obj2 = CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket;
        if (CatchingFishSensorManager()) {
            do {
                Object obj3 = CatchingFishReduxKtor.get(this);
                if (obj3 instanceof CatchingFishHiltAsyncTask) {
                    if (obj3 instanceof CatchingFishGraphQLWidget) {
                        CatchingFishGraphQLWidget catchingFishGraphQLWidget = (CatchingFishGraphQLWidget) obj3;
                        catchingFishGraphQLWidget.getClass();
                        if (CatchingFishGraphQLWidget.CatchingFishDaggerWebsocket.get(catchingFishGraphQLWidget) != 0) {
                        }
                    }
                    obj2 = CatchingFishMoshiDaggerHilt(obj3, new CatchingFishStripeAPIMVI(CatchingFishFragmentFactory(obj), false));
                }
                obj2 = CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket;
                break;
            } while (obj2 == CatchingFishXMLLayoutGlide.CatchingFishViewModelScope);
        }
        if (obj2 == CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishReduxKtor;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof CatchingFishGraphQLWidget)) {
                    if (!(obj4 instanceof CatchingFishHiltAsyncTask)) {
                        catchingFishFluxWorkManager = CatchingFishXMLLayoutGlide.CatchingFishViewModelFAB;
                        break;
                    }
                    if (th == null) {
                        th = CatchingFishFragmentFactory(obj);
                    }
                    CatchingFishHiltAsyncTask catchingFishHiltAsyncTask = (CatchingFishHiltAsyncTask) obj4;
                    if (catchingFishHiltAsyncTask.CatchingFishSnackbar()) {
                        CatchingFishSnackbarRealm CatchingFishEspressoMockk = CatchingFishEspressoMockk(catchingFishHiltAsyncTask);
                        if (CatchingFishEspressoMockk != null) {
                            CatchingFishGraphQLWidget catchingFishGraphQLWidget2 = new CatchingFishGraphQLWidget(CatchingFishEspressoMockk, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishHiltAsyncTask, catchingFishGraphQLWidget2)) {
                                if (atomicReferenceFieldUpdater.get(this) != catchingFishHiltAsyncTask) {
                                    break;
                                }
                            }
                            CatchingFishAppCompat(CatchingFishEspressoMockk, th);
                            catchingFishFluxWorkManager = CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object CatchingFishMoshiDaggerHilt = CatchingFishMoshiDaggerHilt(obj4, new CatchingFishStripeAPIMVI(th, false));
                        if (CatchingFishMoshiDaggerHilt == CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (CatchingFishMoshiDaggerHilt != CatchingFishXMLLayoutGlide.CatchingFishViewModelScope) {
                            obj2 = CatchingFishMoshiDaggerHilt;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        CatchingFishGraphQLWidget catchingFishGraphQLWidget3 = (CatchingFishGraphQLWidget) obj4;
                        catchingFishGraphQLWidget3.getClass();
                        if (CatchingFishGraphQLWidget.CatchingFishViewModelScope.get(catchingFishGraphQLWidget3) == CatchingFishXMLLayoutGlide.CatchingFishLayout) {
                            catchingFishFluxWorkManager = CatchingFishXMLLayoutGlide.CatchingFishViewModelFAB;
                        } else {
                            boolean CatchingFishDaggerWebsocket2 = ((CatchingFishGraphQLWidget) obj4).CatchingFishDaggerWebsocket();
                            if (th == null) {
                                th = CatchingFishFragmentFactory(obj);
                            }
                            ((CatchingFishGraphQLWidget) obj4).CatchingFishParcelableFAB(th);
                            Throwable CatchingFishCoroutine = CatchingFishDaggerWebsocket2 ? null : ((CatchingFishGraphQLWidget) obj4).CatchingFishCoroutine();
                            if (CatchingFishCoroutine != null) {
                                CatchingFishAppCompat(((CatchingFishGraphQLWidget) obj4).CatchingFishReduxKtor, CatchingFishCoroutine);
                            }
                            catchingFishFluxWorkManager = CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket;
                        }
                    }
                }
            }
            obj2 = catchingFishFluxWorkManager;
        }
        if (obj2 != CatchingFishXMLLayoutGlide.CatchingFishDaggerWebsocket && obj2 != CatchingFishXMLLayoutGlide.CatchingFishWorkManager) {
            if (obj2 == CatchingFishXMLLayoutGlide.CatchingFishViewModelFAB) {
                return false;
            }
            CatchingFishDaggerHiltFAB(obj2);
            return true;
        }
        return true;
    }

    public final boolean CatchingFishPayPal(Throwable th) {
        if (CatchingFishMotionLayout()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        CatchingFishMVVMRobolectric catchingFishMVVMRobolectric = (CatchingFishMVVMRobolectric) CatchingFishDaggerWebsocket.get(this);
        return (catchingFishMVVMRobolectric == null || catchingFishMVVMRobolectric == CatchingFishPayPalMockk.CatchingFishReduxKtor) ? z : catchingFishMVVMRobolectric.CatchingFishCoroutine(th) || z;
    }

    public final CatchingFishStripeAPIBundle CatchingFishPayPalLiveData(boolean z, CatchingFishSnackbarRoom catchingFishSnackbarRoom) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        CatchingFishPayPalMockk catchingFishPayPalMockk;
        boolean z2;
        boolean CatchingFishDaggerWebsocket2;
        catchingFishSnackbarRoom.CatchingFishViewModelScope = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = CatchingFishReduxKtor;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof CatchingFishManifestMVVM;
            catchingFishPayPalMockk = CatchingFishPayPalMockk.CatchingFishReduxKtor;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof CatchingFishHiltAsyncTask)) {
                    z2 = false;
                    break;
                }
                CatchingFishHiltAsyncTask catchingFishHiltAsyncTask = (CatchingFishHiltAsyncTask) obj;
                CatchingFishSnackbarRealm CatchingFishReduxKtor2 = catchingFishHiltAsyncTask.CatchingFishReduxKtor();
                if (CatchingFishReduxKtor2 == null) {
                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    CatchingFishAnimation((CatchingFishSnackbarRoom) obj);
                } else {
                    if (catchingFishSnackbarRoom.CatchingFishCloudMessaging()) {
                        CatchingFishGraphQLWidget catchingFishGraphQLWidget = catchingFishHiltAsyncTask instanceof CatchingFishGraphQLWidget ? (CatchingFishGraphQLWidget) catchingFishHiltAsyncTask : null;
                        Throwable CatchingFishCoroutine = catchingFishGraphQLWidget != null ? catchingFishGraphQLWidget.CatchingFishCoroutine() : null;
                        if (CatchingFishCoroutine == null) {
                            CatchingFishDaggerWebsocket2 = CatchingFishReduxKtor2.CatchingFishDaggerWebsocket(catchingFishSnackbarRoom, 5);
                        } else if (z) {
                            catchingFishSnackbarRoom.CatchingFishEspressoTesting(CatchingFishCoroutine);
                            return catchingFishPayPalMockk;
                        }
                    } else {
                        CatchingFishDaggerWebsocket2 = CatchingFishReduxKtor2.CatchingFishDaggerWebsocket(catchingFishSnackbarRoom, 1);
                    }
                    if (CatchingFishDaggerWebsocket2) {
                        break;
                    }
                }
            } else {
                CatchingFishManifestMVVM catchingFishManifestMVVM = (CatchingFishManifestMVVM) obj;
                if (catchingFishManifestMVVM.CatchingFishReduxKtor) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishSnackbarRoom)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                CatchingFishJUnitRealm(catchingFishManifestMVVM);
            }
        }
        if (z2) {
            return catchingFishSnackbarRoom;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = obj2 instanceof CatchingFishStripeAPIMVI ? (CatchingFishStripeAPIMVI) obj2 : null;
            catchingFishSnackbarRoom.CatchingFishEspressoTesting(catchingFishStripeAPIMVI != null ? catchingFishStripeAPIMVI.CatchingFishParcelableFAB : null);
        }
        return catchingFishPayPalMockk;
    }

    public boolean CatchingFishPayPalService() {
        return true;
    }

    @Override // kotlin.text.CatchingFishManifestMockk
    public final CatchingFishManifestMockk CatchingFishReduxKtor(CatchingFishGlidePayPal catchingFishGlidePayPal) {
        return CatchingFishAdMobFAB.CatchingFishMVPRobolectric(this, catchingFishGlidePayPal);
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public final Object CatchingFishRoomDatabase(CatchingFishSnackbarBundle catchingFishSnackbarBundle) {
        Object obj;
        CatchingFishRealmContext catchingFishRealmContext;
        do {
            obj = CatchingFishReduxKtor.get(this);
            boolean z = obj instanceof CatchingFishHiltAsyncTask;
            catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
            if (!z) {
                CatchingFishManifestMockk catchingFishManifestMockk = catchingFishSnackbarBundle.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishManifestMockk);
                CatchingFishLayoutRoomFAB.CatchingFishSpannableWidget(catchingFishManifestMockk);
                return catchingFishRealmContext;
            }
        } while (CatchingFishMVVMAppCompat(obj) < 0);
        CatchingFishKtorMockk catchingFishKtorMockk = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishSnackbarBundle));
        catchingFishKtorMockk.CatchingFish();
        catchingFishKtorMockk.CatchingFishSpannableWidget(new CatchingFishDaggerKtor(2, CatchingFishLayoutRoomFAB.CatchingFishMutableLiveData(this, true, new CatchingFishGsonRoom(catchingFishKtorMockk, 1))));
        Object CatchingFishNavigation = catchingFishKtorMockk.CatchingFishNavigation();
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
            CatchingFishNavigation = catchingFishRealmContext;
        }
        return CatchingFishNavigation == catchingFishXMLLayoutMockk ? CatchingFishNavigation : catchingFishRealmContext;
    }

    public boolean CatchingFishSensorManager() {
        return this instanceof CatchingFishCustomViewAdMob;
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public boolean CatchingFishSnackbar() {
        Object obj = CatchingFishReduxKtor.get(this);
        return (obj instanceof CatchingFishHiltAsyncTask) && ((CatchingFishHiltAsyncTask) obj).CatchingFishSnackbar();
    }

    public void CatchingFishSpannableWidget(Object obj) {
        CatchingFishDaggerHiltFAB(obj);
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public final CatchingFishStripeAPIBundle CatchingFishStateLiveData(CatchingFishServiceHandler catchingFishServiceHandler) {
        return CatchingFishPayPalLiveData(true, new CatchingFishOkHttpJUnitFAB(0, catchingFishServiceHandler));
    }

    @Override // kotlin.text.CatchingFishPicassoContext
    public final CatchingFishGlidePayPal getKey() {
        return CatchingFishMVPExoPlayer.CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishRoomViewGson
    public final boolean start() {
        int CatchingFishMVVMAppCompat;
        do {
            CatchingFishMVVMAppCompat = CatchingFishMVVMAppCompat(CatchingFishReduxKtor.get(this));
            if (CatchingFishMVVMAppCompat == 0) {
                return false;
            }
        } while (CatchingFishMVVMAppCompat != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + CatchingFishStripeAPI(CatchingFishReduxKtor.get(this)) + '}');
        sb.append('@');
        sb.append(CatchingFishBiometricBundle.CatchingFish(this));
        return sb.toString();
    }

    public void CatchingFishStateFlow() {
    }

    public void CatchingFishCameraXIntent(CatchingFishBiometricView catchingFishBiometricView) {
        throw catchingFishBiometricView;
    }

    public void CatchingFishDaggerHiltFAB(Object obj) {
    }

    public void CatchingFishDataStoreIntent(Object obj) {
    }
}
