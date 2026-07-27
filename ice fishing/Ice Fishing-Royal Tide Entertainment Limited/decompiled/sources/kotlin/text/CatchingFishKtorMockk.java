package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishKtorMockk extends CatchingFishRoomMVI implements CatchingFishGsonLiveData, CatchingFishSpannableRedux, CatchingFishMVPJUnitMockk {
    public final CatchingFishManifestMockk CatchingFishViewModelFAB;
    public final CatchingFishWebsocketGradle CatchingFishViewModelScope;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishLayout = AtomicIntegerFieldUpdater.newUpdater(CatchingFishKtorMockk.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishFragmentHandler = AtomicReferenceFieldUpdater.newUpdater(CatchingFishKtorMockk.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishCloudMessaging = AtomicReferenceFieldUpdater.newUpdater(CatchingFishKtorMockk.class, Object.class, "_parentHandle$volatile");

    public CatchingFishKtorMockk(int i, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(i);
        this.CatchingFishViewModelScope = catchingFishWebsocketGradle;
        this.CatchingFishViewModelFAB = catchingFishWebsocketGradle.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = CatchingFishLayoutInflater.CatchingFishParcelableFAB;
    }

    public static void CatchingFishCardViewRealm(CatchingFishFluxKtorOkHttp catchingFishFluxKtorOkHttp, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + catchingFishFluxKtorOkHttp + ", already has " + obj).toString());
    }

    public static Object CatchingFishMutableLiveData(CatchingFishFluxKtorOkHttp catchingFishFluxKtorOkHttp, Object obj, int i, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP) {
        if (obj instanceof CatchingFishStripeAPIMVI) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (catchingFishJobSchedulerMVP != null || (catchingFishFluxKtorOkHttp instanceof CatchingFishDaggerKtor)) {
            return new CatchingFishRetrofitFABGson(obj, catchingFishFluxKtorOkHttp instanceof CatchingFishDaggerKtor ? (CatchingFishDaggerKtor) catchingFishFluxKtorOkHttp : null, catchingFishJobSchedulerMVP, (Throwable) null, 16);
        }
        return obj;
    }

    public final void CatchingFish() {
        CatchingFishStripeAPIBundle CatchingFishCoroutineFlow = CatchingFishCoroutineFlow();
        if (CatchingFishCoroutineFlow == null || (CatchingFishFragmentHandler.get(this) instanceof CatchingFishFluxKtorOkHttp)) {
            return;
        }
        CatchingFishCoroutineFlow.CatchingFishParcelableFAB();
        CatchingFishCloudMessaging.set(this, CatchingFishPayPalMockk.CatchingFishReduxKtor);
    }

    public final void CatchingFishAnimationMockk() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishCloudMessaging;
        CatchingFishStripeAPIBundle catchingFishStripeAPIBundle = (CatchingFishStripeAPIBundle) atomicReferenceFieldUpdater.get(this);
        if (catchingFishStripeAPIBundle == null) {
            return;
        }
        catchingFishStripeAPIBundle.CatchingFishParcelableFAB();
        atomicReferenceFieldUpdater.set(this, CatchingFishPayPalMockk.CatchingFishReduxKtor);
    }

    public final void CatchingFishCardViewView() {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishViewModelScope;
        Throwable th = null;
        CatchingFishPayPalRoom catchingFishPayPalRoom = catchingFishWebsocketGradle instanceof CatchingFishPayPalRoom ? (CatchingFishPayPalRoom) catchingFishWebsocketGradle : null;
        if (catchingFishPayPalRoom != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishPayPalRoom.CatchingFishCloudMessaging;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(catchingFishPayPalRoom);
                CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishGsonCardView.CatchingFishCloudMessaging;
                if (obj == catchingFishFluxWorkManager) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishPayPalRoom, catchingFishFluxWorkManager, this)) {
                        if (atomicReferenceFieldUpdater.get(catchingFishPayPalRoom) != catchingFishFluxWorkManager) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishPayPalRoom, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(catchingFishPayPalRoom) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            CatchingFishAnimationMockk();
            CatchingFishUnitTesting(th);
        }
    }

    public final void CatchingFishCloudMessaging(CatchingFishDaggerKtor catchingFishDaggerKtor, Throwable th) {
        try {
            switch (catchingFishDaggerKtor.CatchingFishParcelableFAB) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) catchingFishDaggerKtor.CatchingFishSnackbar).cancel(false);
                    break;
                case 1:
                    ((CatchingFishServiceHandler) catchingFishDaggerKtor.CatchingFishSnackbar).CatchingFishFragmentHandler(th);
                    break;
                default:
                    ((CatchingFishStripeAPIBundle) catchingFishDaggerKtor.CatchingFishSnackbar).CatchingFishParcelableFAB();
                    break;
            }
        } catch (Throwable th2) {
            CatchingFishBiometricBundle.CatchingFishDaggerHiltFAB(new CatchingFishBiometricView("Exception in invokeOnCancellation handler for " + this, th2), this.CatchingFishViewModelFAB);
        }
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final CatchingFishWebsocketGradle CatchingFishCoroutine() {
        return this.CatchingFishViewModelScope;
    }

    public final CatchingFishStripeAPIBundle CatchingFishCoroutineFlow() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) this.CatchingFishViewModelFAB.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout);
        if (catchingFishRoomViewGson == null) {
            return null;
        }
        CatchingFishStripeAPIBundle CatchingFishMutableLiveData = CatchingFishLayoutRoomFAB.CatchingFishMutableLiveData(catchingFishRoomViewGson, true, new CatchingFishGsonRoom(this, 0));
        do {
            atomicReferenceFieldUpdater = CatchingFishCloudMessaging;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, CatchingFishMutableLiveData)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return CatchingFishMutableLiveData;
    }

    public final void CatchingFishCustomView(Object obj, int i, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof CatchingFishFluxKtorOkHttp) {
                Object CatchingFishMutableLiveData = CatchingFishMutableLiveData((CatchingFishFluxKtorOkHttp) obj2, obj, i, catchingFishJobSchedulerMVP);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, CatchingFishMutableLiveData)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!CatchingFishGsonAppCompat()) {
                    CatchingFishAnimationMockk();
                }
                CatchingFishStateLiveData(i);
                return;
            }
            if (obj2 instanceof CatchingFishJUnitWebSocket) {
                CatchingFishJUnitWebSocket catchingFishJUnitWebSocket = (CatchingFishJUnitWebSocket) obj2;
                catchingFishJUnitWebSocket.getClass();
                if (CatchingFishJUnitWebSocket.CatchingFishCoroutine.compareAndSet(catchingFishJUnitWebSocket, 0, 1)) {
                    if (catchingFishJobSchedulerMVP != null) {
                        CatchingFishEspressoTesting(catchingFishJobSchedulerMVP, catchingFishJUnitWebSocket.CatchingFishParcelableFAB, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void CatchingFishDaggerHiltFAB(CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishSpannableWidget(new CatchingFishDaggerKtor(1, catchingFishServiceHandler));
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final Object CatchingFishDaggerWebsocket(Object obj) {
        return obj instanceof CatchingFishRetrofitFABGson ? ((CatchingFishRetrofitFABGson) obj).CatchingFishParcelableFAB : obj;
    }

    public final void CatchingFishEspressoTesting(CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP, Throwable th, Object obj) {
        CatchingFishManifestMockk catchingFishManifestMockk = this.CatchingFishViewModelFAB;
        try {
            catchingFishJobSchedulerMVP.CatchingFishReduxKtor(th, obj, catchingFishManifestMockk);
        } catch (Throwable th2) {
            CatchingFishBiometricBundle.CatchingFishDaggerHiltFAB(new CatchingFishBiometricView("Exception in resume onCancellation handler for " + this, th2), catchingFishManifestMockk);
        }
    }

    public final void CatchingFishFragmentFactory(CatchingFishToastGradle catchingFishToastGradle) {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishViewModelScope;
        CatchingFishPayPalRoom catchingFishPayPalRoom = catchingFishWebsocketGradle instanceof CatchingFishPayPalRoom ? (CatchingFishPayPalRoom) catchingFishWebsocketGradle : null;
        CatchingFishCustomView(CatchingFishRealmContext.CatchingFishParcelableFAB, (catchingFishPayPalRoom != null ? catchingFishPayPalRoom.CatchingFishViewModelScope : null) == catchingFishToastGradle ? 4 : this.CatchingFishWorkManager, null);
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final Object CatchingFishFragmentHandler() {
        return CatchingFishFragmentHandler.get(this);
    }

    public final boolean CatchingFishGsonAppCompat() {
        if (this.CatchingFishWorkManager != 2) {
            return false;
        }
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishViewModelScope;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishWebsocketGradle, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return CatchingFishPayPalRoom.CatchingFishCloudMessaging.get((CatchingFishPayPalRoom) catchingFishWebsocketGradle) != null;
    }

    @Override // kotlin.text.CatchingFishGsonLiveData
    public final void CatchingFishJetpackCompose(Object obj) {
        CatchingFishStateLiveData(this.CatchingFishWorkManager);
    }

    public final void CatchingFishMVPRobolectric(Object obj, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP) {
        CatchingFishCustomView(obj, this.CatchingFishWorkManager, catchingFishJobSchedulerMVP);
    }

    public final Object CatchingFishNavigation() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        CatchingFishRoomViewGson catchingFishRoomViewGson;
        boolean CatchingFishGsonAppCompat = CatchingFishGsonAppCompat();
        do {
            atomicIntegerFieldUpdater = CatchingFishLayout;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (CatchingFishGsonAppCompat) {
                    CatchingFishCardViewView();
                }
                Object obj = CatchingFishFragmentHandler.get(this);
                if (obj instanceof CatchingFishStripeAPIMVI) {
                    throw ((CatchingFishStripeAPIMVI) obj).CatchingFishParcelableFAB;
                }
                int i3 = this.CatchingFishWorkManager;
                if ((i3 != 1 && i3 != 2) || (catchingFishRoomViewGson = (CatchingFishRoomViewGson) this.CatchingFishViewModelFAB.CatchingFishCoroutineFlow(CatchingFishMVPExoPlayer.CatchingFishLayout)) == null || catchingFishRoomViewGson.CatchingFishSnackbar()) {
                    return CatchingFishDaggerWebsocket(obj);
                }
                CancellationException CatchingFishNavigation = catchingFishRoomViewGson.CatchingFishNavigation();
                CatchingFishSnackbar(CatchingFishNavigation);
                throw CatchingFishNavigation;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((CatchingFishStripeAPIBundle) CatchingFishCloudMessaging.get(this)) == null) {
            CatchingFishCoroutineFlow();
        }
        if (CatchingFishGsonAppCompat) {
            CatchingFishCardViewView();
        }
        return CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
    }

    public final void CatchingFishOkHttp(CatchingFishFluxSnackbar catchingFishFluxSnackbar, Throwable th) {
        CatchingFishManifestMockk catchingFishManifestMockk = this.CatchingFishViewModelFAB;
        int i = CatchingFishLayout.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            catchingFishFluxSnackbar.CatchingFishViewModelScope(i, catchingFishManifestMockk);
        } catch (Throwable th2) {
            CatchingFishBiometricBundle.CatchingFishDaggerHiltFAB(new CatchingFishBiometricView("Exception in invokeOnCancellation handler for " + this, th2), catchingFishManifestMockk);
        }
    }

    @Override // kotlin.text.CatchingFishMVPJUnitMockk
    public final void CatchingFishParcelableFAB(CatchingFishFluxSnackbar catchingFishFluxSnackbar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = CatchingFishLayout;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        CatchingFishSpannableWidget(catchingFishFluxSnackbar);
    }

    public final boolean CatchingFishParcelableFlux() {
        return CatchingFishFragmentHandler.get(this) instanceof CatchingFishFluxKtorOkHttp;
    }

    public String CatchingFishPayPal() {
        return "CancellableContinuation";
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final Throwable CatchingFishReduxKtor(Object obj) {
        Throwable CatchingFishReduxKtor = super.CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor != null) {
            return CatchingFishReduxKtor;
        }
        return null;
    }

    public Throwable CatchingFishRoomDatabase(CatchingFishPicassoView catchingFishPicassoView) {
        return catchingFishPicassoView.CatchingFishNavigation();
    }

    @Override // kotlin.text.CatchingFishRoomMVI
    public final void CatchingFishSnackbar(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof CatchingFishFluxKtorOkHttp) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof CatchingFishStripeAPIMVI) {
                return;
            }
            if (!(obj instanceof CatchingFishRetrofitFABGson)) {
                cancellationException2 = cancellationException;
                CatchingFishRetrofitFABGson catchingFishRetrofitFABGson = new CatchingFishRetrofitFABGson(obj, (CatchingFishDaggerKtor) null, (CatchingFishJobSchedulerMVP) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishRetrofitFABGson)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            CatchingFishRetrofitFABGson catchingFishRetrofitFABGson2 = (CatchingFishRetrofitFABGson) obj;
            if (catchingFishRetrofitFABGson2.CatchingFishDaggerWebsocket != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            CatchingFishRetrofitFABGson CatchingFishParcelableFAB = CatchingFishRetrofitFABGson.CatchingFishParcelableFAB(catchingFishRetrofitFABGson2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, CatchingFishParcelableFAB)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            CatchingFishDaggerKtor catchingFishDaggerKtor = catchingFishRetrofitFABGson2.CatchingFishSnackbar;
            if (catchingFishDaggerKtor != null) {
                CatchingFishCloudMessaging(catchingFishDaggerKtor, cancellationException);
            }
            CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP = catchingFishRetrofitFABGson2.CatchingFishCoroutine;
            if (catchingFishJobSchedulerMVP != null) {
                CatchingFishEspressoTesting(catchingFishJobSchedulerMVP, cancellationException, catchingFishRetrofitFABGson2.CatchingFishParcelableFAB);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00aa, code lost:
    
        CatchingFishCardViewRealm(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishSpannableWidget(CatchingFishFluxKtorOkHttp catchingFishFluxKtorOkHttp) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof CatchingFishLayoutInflater) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishFluxKtorOkHttp)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof CatchingFishDaggerKtor) || (obj instanceof CatchingFishFluxSnackbar)) {
                break;
            }
            if (obj instanceof CatchingFishStripeAPIMVI) {
                CatchingFishStripeAPIMVI catchingFishStripeAPIMVI = (CatchingFishStripeAPIMVI) obj;
                catchingFishStripeAPIMVI.getClass();
                if (!CatchingFishStripeAPIMVI.CatchingFishSnackbar.compareAndSet(catchingFishStripeAPIMVI, 0, 1)) {
                    CatchingFishCardViewRealm(catchingFishFluxKtorOkHttp, obj);
                    throw null;
                }
                if (obj instanceof CatchingFishJUnitWebSocket) {
                    if (obj == null) {
                        catchingFishStripeAPIMVI = null;
                    }
                    Throwable th = catchingFishStripeAPIMVI != null ? catchingFishStripeAPIMVI.CatchingFishParcelableFAB : null;
                    if (catchingFishFluxKtorOkHttp instanceof CatchingFishDaggerKtor) {
                        CatchingFishCloudMessaging((CatchingFishDaggerKtor) catchingFishFluxKtorOkHttp, th);
                        return;
                    } else {
                        CatchingFishOkHttp((CatchingFishFluxSnackbar) catchingFishFluxKtorOkHttp, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof CatchingFishRetrofitFABGson)) {
                if (catchingFishFluxKtorOkHttp instanceof CatchingFishFluxSnackbar) {
                    return;
                }
                CatchingFishRetrofitFABGson catchingFishRetrofitFABGson = new CatchingFishRetrofitFABGson(obj, (CatchingFishDaggerKtor) catchingFishFluxKtorOkHttp, (CatchingFishJobSchedulerMVP) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishRetrofitFABGson)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            CatchingFishRetrofitFABGson catchingFishRetrofitFABGson2 = (CatchingFishRetrofitFABGson) obj;
            if (catchingFishRetrofitFABGson2.CatchingFishSnackbar != null) {
                CatchingFishCardViewRealm(catchingFishFluxKtorOkHttp, obj);
                throw null;
            }
            if (catchingFishFluxKtorOkHttp instanceof CatchingFishFluxSnackbar) {
                return;
            }
            CatchingFishDaggerKtor catchingFishDaggerKtor = (CatchingFishDaggerKtor) catchingFishFluxKtorOkHttp;
            Throwable th2 = catchingFishRetrofitFABGson2.CatchingFishDaggerWebsocket;
            if (th2 != null) {
                CatchingFishCloudMessaging(catchingFishDaggerKtor, th2);
                return;
            }
            CatchingFishRetrofitFABGson CatchingFishParcelableFAB = CatchingFishRetrofitFABGson.CatchingFishParcelableFAB(catchingFishRetrofitFABGson2, catchingFishDaggerKtor, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, CatchingFishParcelableFAB)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final void CatchingFishStateLiveData(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = CatchingFishLayout;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishViewModelScope;
                if (!z && (catchingFishWebsocketGradle instanceof CatchingFishPayPalRoom)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.CatchingFishWorkManager;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        CatchingFishPayPalRoom catchingFishPayPalRoom = (CatchingFishPayPalRoom) catchingFishWebsocketGradle;
                        CatchingFishToastGradle catchingFishToastGradle = catchingFishPayPalRoom.CatchingFishViewModelScope;
                        CatchingFishManifestMockk context = catchingFishPayPalRoom.CatchingFishViewModelFAB.getContext();
                        if (catchingFishToastGradle.CatchingFishMVPRobolectric(context)) {
                            catchingFishToastGradle.CatchingFishCardViewView(context, this);
                            return;
                        }
                        CatchingFishReduxMockkView CatchingFishParcelableFAB = CatchingFishMVVMOkHttp.CatchingFishParcelableFAB();
                        if (CatchingFishParcelableFAB.CatchingFishWorkManager >= 4294967296L) {
                            CatchingFishParcelableFAB.CatchingFishMutableLiveData(this);
                            return;
                        }
                        CatchingFishParcelableFAB.CatchingFishPayPalService(true);
                        try {
                            CatchingFishLayoutRoomFAB.CatchingFishMVVMAppCompat(this, catchingFishWebsocketGradle, true);
                            do {
                            } while (CatchingFishParcelableFAB.CatchingFishEspressoMockk());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                CatchingFishLayoutRoomFAB.CatchingFishMVVMAppCompat(this, catchingFishWebsocketGradle, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final boolean CatchingFishUnitTesting(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof CatchingFishFluxKtorOkHttp)) {
                return false;
            }
            CatchingFishJUnitWebSocket catchingFishJUnitWebSocket = new CatchingFishJUnitWebSocket(this, th, (obj instanceof CatchingFishDaggerKtor) || (obj instanceof CatchingFishFluxSnackbar));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, catchingFishJUnitWebSocket)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            CatchingFishFluxKtorOkHttp catchingFishFluxKtorOkHttp = (CatchingFishFluxKtorOkHttp) obj;
            if (catchingFishFluxKtorOkHttp instanceof CatchingFishDaggerKtor) {
                CatchingFishCloudMessaging((CatchingFishDaggerKtor) obj, th);
            } else if (catchingFishFluxKtorOkHttp instanceof CatchingFishFluxSnackbar) {
                CatchingFishOkHttp((CatchingFishFluxSnackbar) obj, th);
            }
            if (!CatchingFishGsonAppCompat()) {
                CatchingFishAnimationMockk();
            }
            CatchingFishStateLiveData(this.CatchingFishWorkManager);
            return true;
        }
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final void CatchingFishViewModelFAB(Object obj) {
        Throwable CatchingFishParcelableFAB = CatchingFishMVILayoutBundle.CatchingFishParcelableFAB(obj);
        if (CatchingFishParcelableFAB != null) {
            obj = new CatchingFishStripeAPIMVI(CatchingFishParcelableFAB, false);
        }
        CatchingFishCustomView(obj, this.CatchingFishWorkManager, null);
    }

    @Override // kotlin.text.CatchingFishSpannableRedux
    public final CatchingFishSpannableRedux CatchingFishViewModelScope() {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishViewModelScope;
        if (catchingFishWebsocketGradle instanceof CatchingFishSpannableRedux) {
            return (CatchingFishSpannableRedux) catchingFishWebsocketGradle;
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishGsonLiveData
    public final CatchingFishFluxWorkManager CatchingFishWorkManager(Object obj, CatchingFishJobSchedulerMVP catchingFishJobSchedulerMVP) {
        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishXMLLayoutGlide.CatchingFishSnackbar;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof CatchingFishFluxKtorOkHttp)) {
                return null;
            }
            Object CatchingFishMutableLiveData = CatchingFishMutableLiveData((CatchingFishFluxKtorOkHttp) obj2, obj, this.CatchingFishWorkManager, catchingFishJobSchedulerMVP);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, CatchingFishMutableLiveData)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!CatchingFishGsonAppCompat()) {
                CatchingFishAnimationMockk();
            }
            return catchingFishFluxWorkManager;
        }
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        return this.CatchingFishViewModelFAB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatchingFishPayPal());
        sb.append('(');
        sb.append(CatchingFishBiometricBundle.CatchingFishGradleManifest(this.CatchingFishViewModelScope));
        sb.append("){");
        Object obj = CatchingFishFragmentHandler.get(this);
        sb.append(obj instanceof CatchingFishFluxKtorOkHttp ? "Active" : obj instanceof CatchingFishJUnitWebSocket ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(CatchingFishBiometricBundle.CatchingFish(this));
        return sb.toString();
    }
}
