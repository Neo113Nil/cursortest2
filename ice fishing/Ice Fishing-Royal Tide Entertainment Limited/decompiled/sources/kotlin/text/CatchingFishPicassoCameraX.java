package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishPicassoCameraX implements CatchingFishMVIRobolectric {
    public final int CatchingFishReduxKtor;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishDaggerWebsocket = AtomicLongFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishWorkManager = AtomicLongFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishViewModelScope = AtomicLongFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater CatchingFishViewModelFAB = AtomicLongFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishLayout = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishFragmentHandler = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishCloudMessaging = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishEspressoTesting = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishOkHttp = AtomicReferenceFieldUpdater.newUpdater(CatchingFishPicassoCameraX.class, Object.class, "closeHandler$volatile");

    public CatchingFishPicassoCameraX(int i) {
        this.CatchingFishReduxKtor = i;
        if (i < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
        }
        CatchingFishToastMVVM catchingFishToastMVVM = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = CatchingFishViewModelScope.get(this);
        CatchingFishToastMVVM catchingFishToastMVVM2 = new CatchingFishToastMVVM(0L, null, this, 3);
        this.sendSegment$volatile = catchingFishToastMVVM2;
        this.receiveSegment$volatile = catchingFishToastMVVM2;
        if (CatchingFishSpannableWidget()) {
            catchingFishToastMVVM2 = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishToastMVVM2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = catchingFishToastMVVM2;
        this._closeCause$volatile = CatchingFishWebSocketLayout.CatchingFish;
    }

    public static boolean CatchingFishCardViewView(Object obj) {
        if (!(obj instanceof CatchingFishGsonLiveData)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CatchingFishGsonLiveData catchingFishGsonLiveData = (CatchingFishGsonLiveData) obj;
        CatchingFishToastMVVM catchingFishToastMVVM = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
        CatchingFishFluxWorkManager CatchingFishWorkManager2 = catchingFishGsonLiveData.CatchingFishWorkManager(CatchingFishRealmContext.CatchingFishParcelableFAB, null);
        if (CatchingFishWorkManager2 == null) {
            return false;
        }
        catchingFishGsonLiveData.CatchingFishJetpackCompose(CatchingFishWorkManager2);
        return true;
    }

    public static void CatchingFishJetpackCompose(CatchingFishPicassoCameraX catchingFishPicassoCameraX) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishViewModelFAB;
        if ((atomicLongFieldUpdater.addAndGet(catchingFishPicassoCameraX, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(catchingFishPicassoCameraX) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static final CatchingFishToastMVVM CatchingFishParcelableFAB(CatchingFishPicassoCameraX catchingFishPicassoCameraX, long j, CatchingFishToastMVVM catchingFishToastMVVM) {
        Object CatchingFishGsonAppCompat;
        CatchingFishPicassoCameraX catchingFishPicassoCameraX2;
        CatchingFishToastMVVM catchingFishToastMVVM2 = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
        CatchingFishOkHttpHilt catchingFishOkHttpHilt = CatchingFishOkHttpHilt.CatchingFishEspressoTesting;
        loop0: while (true) {
            CatchingFishGsonAppCompat = CatchingFishLayoutRoomFAB.CatchingFishGsonAppCompat(catchingFishToastMVVM, j, catchingFishOkHttpHilt);
            if (!CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
                CatchingFishFluxSnackbar CatchingFishCardViewView = CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishLayout;
                    CatchingFishFluxSnackbar catchingFishFluxSnackbar = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater.get(catchingFishPicassoCameraX);
                    if (catchingFishFluxSnackbar.CatchingFishCoroutine >= CatchingFishCardViewView.CatchingFishCoroutine) {
                        break loop0;
                    }
                    if (!CatchingFishCardViewView.CatchingFishLayout()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishPicassoCameraX, catchingFishFluxSnackbar, CatchingFishCardViewView)) {
                        if (atomicReferenceFieldUpdater.get(catchingFishPicassoCameraX) != catchingFishFluxSnackbar) {
                            if (CatchingFishCardViewView.CatchingFishDaggerWebsocket()) {
                                CatchingFishCardViewView.CatchingFishReduxKtor();
                            }
                        }
                    }
                    if (catchingFishFluxSnackbar.CatchingFishDaggerWebsocket()) {
                        catchingFishFluxSnackbar.CatchingFishReduxKtor();
                    }
                }
            } else {
                break;
            }
        }
        boolean CatchingFishMutableLiveData = CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat);
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishWorkManager;
        if (CatchingFishMutableLiveData) {
            catchingFishPicassoCameraX.CatchingFishViewModelFAB();
            if (catchingFishToastMVVM.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar < atomicLongFieldUpdater.get(catchingFishPicassoCameraX)) {
                catchingFishToastMVVM.CatchingFishParcelableFAB();
                return null;
            }
        } else {
            CatchingFishToastMVVM catchingFishToastMVVM3 = (CatchingFishToastMVVM) CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
            long j2 = catchingFishToastMVVM3.CatchingFishCoroutine;
            if (j2 <= j) {
                return catchingFishToastMVVM3;
            }
            long j3 = CatchingFishWebSocketLayout.CatchingFishSnackbar * j2;
            while (true) {
                long j4 = CatchingFishDaggerWebsocket.get(catchingFishPicassoCameraX);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    catchingFishPicassoCameraX2 = catchingFishPicassoCameraX;
                    break;
                }
                catchingFishPicassoCameraX2 = catchingFishPicassoCameraX;
                if (CatchingFishDaggerWebsocket.compareAndSet(catchingFishPicassoCameraX2, j4, (((int) (j4 >> 60)) << 60) + j5)) {
                    break;
                }
                catchingFishPicassoCameraX = catchingFishPicassoCameraX2;
            }
            if (j2 * CatchingFishWebSocketLayout.CatchingFishSnackbar < atomicLongFieldUpdater.get(catchingFishPicassoCameraX2)) {
                catchingFishToastMVVM3.CatchingFishParcelableFAB();
            }
        }
        return null;
    }

    public static final int CatchingFishReduxKtor(CatchingFishPicassoCameraX catchingFishPicassoCameraX, CatchingFishToastMVVM catchingFishToastMVVM, int i, Object obj, long j, Object obj2, boolean z) {
        catchingFishToastMVVM.CatchingFishOkHttp(i, obj);
        if (z) {
            return catchingFishPicassoCameraX.CatchingFishCustomView(catchingFishToastMVVM, i, obj, j, obj2, z);
        }
        Object CatchingFishCloudMessaging2 = catchingFishToastMVVM.CatchingFishCloudMessaging(i);
        if (CatchingFishCloudMessaging2 == null) {
            if (catchingFishPicassoCameraX.CatchingFishDaggerWebsocket(j)) {
                if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, null, CatchingFishWebSocketLayout.CatchingFishReduxKtor)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (CatchingFishCloudMessaging2 instanceof CatchingFishMVPJUnitMockk) {
            catchingFishToastMVVM.CatchingFishOkHttp(i, null);
            if (catchingFishPicassoCameraX.CatchingFishPayPal(CatchingFishCloudMessaging2, obj)) {
                catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishLayout);
                return 0;
            }
            CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFishCloudMessaging;
            if (catchingFishToastMVVM.CatchingFishWorkManager.getAndSet((i * 2) + 1, catchingFishFluxWorkManager) == catchingFishFluxWorkManager) {
                return 5;
            }
            catchingFishToastMVVM.CatchingFishEspressoTesting(i, true);
            return 5;
        }
        return catchingFishPicassoCameraX.CatchingFishCustomView(catchingFishToastMVVM, i, obj, j, obj2, z);
    }

    public static final void CatchingFishSnackbar(CatchingFishPicassoCameraX catchingFishPicassoCameraX, Object obj, CatchingFishKtorMockk catchingFishKtorMockk) {
        catchingFishKtorMockk.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(catchingFishPicassoCameraX.CatchingFishRoomDatabase()));
    }

    @Override // kotlin.text.CatchingFishReduxCameraX
    public Object CatchingFish(Object obj) {
        CatchingFishLiveDataGson catchingFishLiveDataGson = CatchingFishBiometricBundle.CatchingFishSnackbar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishDaggerWebsocket;
        boolean z = false;
        long j = 1152921504606846975L;
        if (CatchingFishCoroutineFlow(atomicLongFieldUpdater.get(this), false) ? false : !CatchingFishDaggerWebsocket(r1 & 1152921504606846975L)) {
            return catchingFishLiveDataGson;
        }
        Object obj2 = CatchingFishWebSocketLayout.CatchingFishFragmentHandler;
        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) CatchingFishLayout.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean CatchingFishCoroutineFlow = CatchingFishCoroutineFlow(andIncrement, z);
            int i = CatchingFishWebSocketLayout.CatchingFishSnackbar;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (catchingFishToastMVVM.CatchingFishCoroutine != j4) {
                CatchingFishToastMVVM CatchingFishParcelableFAB = CatchingFishParcelableFAB(this, j4, catchingFishToastMVVM);
                if (CatchingFishParcelableFAB != null) {
                    catchingFishToastMVVM = CatchingFishParcelableFAB;
                } else {
                    if (CatchingFishCoroutineFlow) {
                        return new CatchingFishStateFlowOkHttp(CatchingFishRoomDatabase());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int CatchingFishReduxKtor = CatchingFishReduxKtor(this, catchingFishToastMVVM, i2, obj, j2, obj2, CatchingFishCoroutineFlow);
            CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
            if (CatchingFishReduxKtor == 0) {
                catchingFishToastMVVM.CatchingFishParcelableFAB();
                return catchingFishRealmContext;
            }
            if (CatchingFishReduxKtor == 1) {
                return catchingFishRealmContext;
            }
            if (CatchingFishReduxKtor == 2) {
                if (CatchingFishCoroutineFlow) {
                    catchingFishToastMVVM.CatchingFishViewModelFAB();
                    return new CatchingFishStateFlowOkHttp(CatchingFishRoomDatabase());
                }
                CatchingFishMVPJUnitMockk catchingFishMVPJUnitMockk = obj2 instanceof CatchingFishMVPJUnitMockk ? (CatchingFishMVPJUnitMockk) obj2 : null;
                if (catchingFishMVPJUnitMockk != null) {
                    catchingFishMVPJUnitMockk.CatchingFishParcelableFAB(catchingFishToastMVVM, i2 + i);
                }
                catchingFishToastMVVM.CatchingFishViewModelFAB();
                return catchingFishLiveDataGson;
            }
            if (CatchingFishReduxKtor == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (CatchingFishReduxKtor == 4) {
                if (j2 < CatchingFishWorkManager.get(this)) {
                    catchingFishToastMVVM.CatchingFishParcelableFAB();
                }
                return new CatchingFishStateFlowOkHttp(CatchingFishRoomDatabase());
            }
            if (CatchingFishReduxKtor == 5) {
                catchingFishToastMVVM.CatchingFishParcelableFAB();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    public final Throwable CatchingFishAnimationMockk() {
        return (Throwable) CatchingFishEspressoTesting.get(this);
    }

    public final void CatchingFishCardViewRealm(CatchingFishMVPJUnitMockk catchingFishMVPJUnitMockk, boolean z) {
        if (catchingFishMVPJUnitMockk instanceof CatchingFishGsonLiveData) {
            ((CatchingFishWebsocketGradle) catchingFishMVPJUnitMockk).CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(z ? CatchingFishStateLiveData() : CatchingFishRoomDatabase()));
            return;
        }
        if (!(catchingFishMVPJUnitMockk instanceof CatchingFishMVVMCardView)) {
            throw new IllegalStateException(("Unexpected waiter: " + catchingFishMVPJUnitMockk).toString());
        }
        CatchingFishMVVMCardView catchingFishMVVMCardView = (CatchingFishMVVMCardView) catchingFishMVPJUnitMockk;
        CatchingFishKtorMockk catchingFishKtorMockk = catchingFishMVVMCardView.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishKtorMockk);
        catchingFishMVVMCardView.CatchingFishDaggerWebsocket = null;
        catchingFishMVVMCardView.CatchingFishReduxKtor = CatchingFishWebSocketLayout.CatchingFishEspressoTesting;
        Throwable CatchingFishAnimationMockk = catchingFishMVVMCardView.CatchingFishWorkManager.CatchingFishAnimationMockk();
        if (CatchingFishAnimationMockk == null) {
            catchingFishKtorMockk.CatchingFishViewModelFAB(Boolean.FALSE);
        } else {
            catchingFishKtorMockk.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(CatchingFishAnimationMockk));
        }
    }

    @Override // kotlin.text.CatchingFishIntentMVP
    public final Object CatchingFishCloudMessaging(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishToastMVVM catchingFishToastMVVM;
        CatchingFishPicassoCameraX catchingFishPicassoCameraX = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
        CatchingFishToastMVVM catchingFishToastMVVM2 = (CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(catchingFishPicassoCameraX);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishDaggerWebsocket;
            if (catchingFishPicassoCameraX.CatchingFishCoroutineFlow(atomicLongFieldUpdater.get(catchingFishPicassoCameraX), true)) {
                Throwable CatchingFishStateLiveData = CatchingFishStateLiveData();
                int i = CatchingFishFABRoomHandler.CatchingFishParcelableFAB;
                throw CatchingFishStateLiveData;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = CatchingFishWorkManager;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(catchingFishPicassoCameraX);
            long j = CatchingFishWebSocketLayout.CatchingFishSnackbar;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (catchingFishToastMVVM2.CatchingFishCoroutine != j2) {
                CatchingFishToastMVVM CatchingFishOkHttp2 = catchingFishPicassoCameraX.CatchingFishOkHttp(j2, catchingFishToastMVVM2);
                if (CatchingFishOkHttp2 == null) {
                    continue;
                } else {
                    catchingFishToastMVVM2 = CatchingFishOkHttp2;
                }
            }
            Object CatchingFishMVPRobolectric = catchingFishPicassoCameraX.CatchingFishMVPRobolectric(catchingFishToastMVVM2, i2, andIncrement, null);
            CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFishOkHttp;
            if (CatchingFishMVPRobolectric == catchingFishFluxWorkManager) {
                throw new IllegalStateException("unexpected");
            }
            CatchingFishFluxWorkManager catchingFishFluxWorkManager2 = CatchingFishWebSocketLayout.CatchingFishAnimationMockk;
            if (CatchingFishMVPRobolectric != catchingFishFluxWorkManager2) {
                if (CatchingFishMVPRobolectric != CatchingFishWebSocketLayout.CatchingFishUnitTesting) {
                    catchingFishToastMVVM2.CatchingFishParcelableFAB();
                    return CatchingFishMVPRobolectric;
                }
                CatchingFishKtorMockk CatchingFishCardViewRealm = CatchingFishRobolectricHilt.CatchingFishCardViewRealm(CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishWebsocketGradle));
                CatchingFishPicassoCameraX catchingFishPicassoCameraX2 = this;
                try {
                    Object CatchingFishMVPRobolectric2 = catchingFishPicassoCameraX2.CatchingFishMVPRobolectric(catchingFishToastMVVM2, i2, andIncrement, CatchingFishCardViewRealm);
                    if (CatchingFishMVPRobolectric2 == catchingFishFluxWorkManager) {
                        CatchingFishCardViewRealm.CatchingFishParcelableFAB(catchingFishToastMVVM2, i2);
                    } else if (CatchingFishMVPRobolectric2 == catchingFishFluxWorkManager2) {
                        if (andIncrement < catchingFishPicassoCameraX2.CatchingFishNavigation()) {
                            catchingFishToastMVVM2.CatchingFishParcelableFAB();
                        }
                        CatchingFishToastMVVM catchingFishToastMVVM3 = (CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(catchingFishPicassoCameraX2);
                        while (true) {
                            if (catchingFishPicassoCameraX2.CatchingFishCoroutineFlow(atomicLongFieldUpdater.get(catchingFishPicassoCameraX2), true)) {
                                CatchingFishCardViewRealm.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(catchingFishPicassoCameraX2.CatchingFishStateLiveData()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(catchingFishPicassoCameraX2);
                            long j3 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (catchingFishToastMVVM3.CatchingFishCoroutine != j4) {
                                catchingFishToastMVVM = catchingFishPicassoCameraX2.CatchingFishOkHttp(j4, catchingFishToastMVVM3);
                                if (catchingFishToastMVVM == null) {
                                }
                            } else {
                                catchingFishToastMVVM = catchingFishToastMVVM3;
                            }
                            Object CatchingFishMVPRobolectric3 = catchingFishPicassoCameraX2.CatchingFishMVPRobolectric(catchingFishToastMVVM, i3, andIncrement2, CatchingFishCardViewRealm);
                            if (CatchingFishMVPRobolectric3 == CatchingFishWebSocketLayout.CatchingFishOkHttp) {
                                CatchingFishCardViewRealm.CatchingFishParcelableFAB(catchingFishToastMVVM, i3);
                                break;
                            }
                            if (CatchingFishMVPRobolectric3 == CatchingFishWebSocketLayout.CatchingFishAnimationMockk) {
                                if (andIncrement2 < CatchingFishNavigation()) {
                                    catchingFishToastMVVM.CatchingFishParcelableFAB();
                                }
                                catchingFishPicassoCameraX2 = this;
                                catchingFishToastMVVM3 = catchingFishToastMVVM;
                            } else {
                                if (CatchingFishMVPRobolectric3 == CatchingFishWebSocketLayout.CatchingFishUnitTesting) {
                                    throw new IllegalStateException("unexpected");
                                }
                                catchingFishToastMVVM.CatchingFishParcelableFAB();
                                CatchingFishCardViewRealm.CatchingFishMVPRobolectric(CatchingFishMVPRobolectric3, null);
                            }
                        }
                    } else {
                        catchingFishToastMVVM2.CatchingFishParcelableFAB();
                        CatchingFishCardViewRealm.CatchingFishMVPRobolectric(CatchingFishMVPRobolectric2, null);
                    }
                    return CatchingFishCardViewRealm.CatchingFishNavigation();
                } catch (Throwable th) {
                    CatchingFishCardViewRealm.CatchingFishCardViewView();
                    throw th;
                }
            }
            if (andIncrement < CatchingFishNavigation()) {
                catchingFishToastMVVM2.CatchingFishParcelableFAB();
            }
            catchingFishPicassoCameraX = this;
        }
    }

    @Override // kotlin.text.CatchingFishIntentMVP
    public final void CatchingFishCoroutine(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        CatchingFishWorkManager(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (kotlin.text.CatchingFishToastMVVM) ((kotlin.text.CatchingFishJUnitLifecycle) kotlin.text.CatchingFishJUnitLifecycle.CatchingFishSnackbar.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCoroutineFlow(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishWorkManager;
            if (i == 2) {
                CatchingFishViewModelScope(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
                        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (CatchingFishNavigation() <= j2) {
                            break;
                        }
                        long j3 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
                        long j4 = j2 / j3;
                        if (catchingFishToastMVVM.CatchingFishCoroutine != j4 && (catchingFishToastMVVM = CatchingFishOkHttp(j4, catchingFishToastMVVM)) == null) {
                            if (((CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(this)).CatchingFishCoroutine < j4) {
                                break;
                            }
                        } else {
                            catchingFishToastMVVM.CatchingFishParcelableFAB();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object CatchingFishCloudMessaging2 = catchingFishToastMVVM.CatchingFishCloudMessaging(i2);
                                if (CatchingFishCloudMessaging2 == null || CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket) {
                                    if (catchingFishToastMVVM.CatchingFishFragmentHandler(i2, CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishViewModelFAB)) {
                                        CatchingFishEspressoTesting();
                                        break;
                                    }
                                } else {
                                    if (CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishReduxKtor) {
                                        break;
                                    }
                                    if (CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishFragmentHandler) {
                                        if (CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishEspressoTesting) {
                                            if (CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishLayout) {
                                                if (CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishViewModelFAB) {
                                                    if (CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishViewModelScope) {
                                                        break;
                                                    }
                                                    if (CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishWorkManager && j2 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            CatchingFishWorkManager.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("unexpected close status: ", i).toString());
                }
                CatchingFishToastMVVM CatchingFishViewModelScope2 = CatchingFishViewModelScope(1152921504606846975L & j);
                Object obj = null;
                loop0: do {
                    int i3 = CatchingFishWebSocketLayout.CatchingFishSnackbar - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (CatchingFishViewModelScope2.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar) + i3;
                        while (true) {
                            Object CatchingFishCloudMessaging3 = CatchingFishViewModelScope2.CatchingFishCloudMessaging(i3);
                            if (CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishLayout) {
                                break loop0;
                            }
                            if (CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishReduxKtor) {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (CatchingFishViewModelScope2.CatchingFishFragmentHandler(i3, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                                    CatchingFishViewModelScope2.CatchingFishOkHttp(i3, null);
                                    CatchingFishViewModelScope2.CatchingFishViewModelFAB();
                                    break;
                                }
                            } else if (CatchingFishCloudMessaging3 != CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket && CatchingFishCloudMessaging3 != null) {
                                if (!(CatchingFishCloudMessaging3 instanceof CatchingFishMVPJUnitMockk) && !(CatchingFishCloudMessaging3 instanceof CatchingFishEspressoMVP)) {
                                    CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFishViewModelScope;
                                    if (CatchingFishCloudMessaging3 == catchingFishFluxWorkManager || CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishWorkManager) {
                                        break loop0;
                                    }
                                    if (CatchingFishCloudMessaging3 != catchingFishFluxWorkManager) {
                                        break;
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    CatchingFishMVPJUnitMockk catchingFishMVPJUnitMockk = CatchingFishCloudMessaging3 instanceof CatchingFishEspressoMVP ? ((CatchingFishEspressoMVP) CatchingFishCloudMessaging3).CatchingFishParcelableFAB : (CatchingFishMVPJUnitMockk) CatchingFishCloudMessaging3;
                                    if (CatchingFishViewModelScope2.CatchingFishFragmentHandler(i3, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                                        obj = CatchingFishBiometricBundle.CatchingFishFragmentFactory(obj, catchingFishMVPJUnitMockk);
                                        CatchingFishViewModelScope2.CatchingFishOkHttp(i3, null);
                                        CatchingFishViewModelScope2.CatchingFishViewModelFAB();
                                        break;
                                    }
                                }
                            } else if (CatchingFishViewModelScope2.CatchingFishFragmentHandler(i3, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                                CatchingFishViewModelScope2.CatchingFishViewModelFAB();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (CatchingFishViewModelScope2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            CatchingFishCardViewRealm((CatchingFishMVPJUnitMockk) arrayList.get(size), false);
                        }
                    } else {
                        CatchingFishCardViewRealm((CatchingFishMVPJUnitMockk) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int CatchingFishCustomView(CatchingFishToastMVVM catchingFishToastMVVM, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object CatchingFishCloudMessaging2 = catchingFishToastMVVM.CatchingFishCloudMessaging(i);
            if (CatchingFishCloudMessaging2 == null) {
                if (!CatchingFishDaggerWebsocket(j) || z) {
                    if (z) {
                        if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, null, CatchingFishWebSocketLayout.CatchingFishFragmentHandler)) {
                            catchingFishToastMVVM.CatchingFishViewModelFAB();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, null, CatchingFishWebSocketLayout.CatchingFishReduxKtor)) {
                    break;
                }
            } else {
                if (CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket) {
                    CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFishCloudMessaging;
                    if (CatchingFishCloudMessaging2 == catchingFishFluxWorkManager) {
                        catchingFishToastMVVM.CatchingFishOkHttp(i, null);
                        return 5;
                    }
                    if (CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishViewModelFAB) {
                        catchingFishToastMVVM.CatchingFishOkHttp(i, null);
                        return 5;
                    }
                    if (CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishEspressoTesting) {
                        catchingFishToastMVVM.CatchingFishOkHttp(i, null);
                        CatchingFishViewModelFAB();
                        return 4;
                    }
                    catchingFishToastMVVM.CatchingFishOkHttp(i, null);
                    if (CatchingFishCloudMessaging2 instanceof CatchingFishEspressoMVP) {
                        CatchingFishCloudMessaging2 = ((CatchingFishEspressoMVP) CatchingFishCloudMessaging2).CatchingFishParcelableFAB;
                    }
                    if (CatchingFishPayPal(CatchingFishCloudMessaging2, obj)) {
                        catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishLayout);
                        return 0;
                    }
                    if (catchingFishToastMVVM.CatchingFishWorkManager.getAndSet((i * 2) + 1, catchingFishFluxWorkManager) != catchingFishFluxWorkManager) {
                        catchingFishToastMVVM.CatchingFishEspressoTesting(i, true);
                    }
                    return 5;
                }
                if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishReduxKtor)) {
                    break;
                }
            }
        }
        return 1;
    }

    public boolean CatchingFishDaggerHiltFAB() {
        return false;
    }

    public final boolean CatchingFishDaggerWebsocket(long j) {
        return j < CatchingFishViewModelScope.get(this) || j < CatchingFishWorkManager.get(this) + ((long) this.CatchingFishReduxKtor);
    }

    public final void CatchingFishEspressoTesting() {
        Object CatchingFishGsonAppCompat;
        if (CatchingFishSpannableWidget()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishCloudMessaging;
        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = CatchingFishViewModelScope.getAndIncrement(this);
            long j = andIncrement / CatchingFishWebSocketLayout.CatchingFishSnackbar;
            if (CatchingFishNavigation() <= andIncrement) {
                if (catchingFishToastMVVM.CatchingFishCoroutine < j && catchingFishToastMVVM.CatchingFishSnackbar() != null) {
                    CatchingFishParcelableFlux(j, catchingFishToastMVVM);
                }
                CatchingFishJetpackCompose(this);
                return;
            }
            if (catchingFishToastMVVM.CatchingFishCoroutine != j) {
                CatchingFishOkHttpHilt catchingFishOkHttpHilt = CatchingFishOkHttpHilt.CatchingFishEspressoTesting;
                while (true) {
                    CatchingFishGsonAppCompat = CatchingFishLayoutRoomFAB.CatchingFishGsonAppCompat(catchingFishToastMVVM, j, catchingFishOkHttpHilt);
                    if (!CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
                        CatchingFishFluxSnackbar CatchingFishCardViewView = CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                        while (true) {
                            CatchingFishFluxSnackbar catchingFishFluxSnackbar = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater.get(this);
                            if (catchingFishFluxSnackbar.CatchingFishCoroutine >= CatchingFishCardViewView.CatchingFishCoroutine) {
                                break;
                            }
                            if (!CatchingFishCardViewView.CatchingFishLayout()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxSnackbar, CatchingFishCardViewView)) {
                                if (atomicReferenceFieldUpdater.get(this) != catchingFishFluxSnackbar) {
                                    if (CatchingFishCardViewView.CatchingFishDaggerWebsocket()) {
                                        CatchingFishCardViewView.CatchingFishReduxKtor();
                                    }
                                }
                            }
                            if (catchingFishFluxSnackbar.CatchingFishDaggerWebsocket()) {
                                catchingFishFluxSnackbar.CatchingFishReduxKtor();
                            }
                        }
                    } else {
                        break;
                    }
                }
                CatchingFishToastMVVM catchingFishToastMVVM2 = null;
                if (CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
                    CatchingFishViewModelFAB();
                    CatchingFishParcelableFlux(j, catchingFishToastMVVM);
                    CatchingFishJetpackCompose(this);
                } else {
                    CatchingFishToastMVVM catchingFishToastMVVM3 = (CatchingFishToastMVVM) CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                    long j2 = catchingFishToastMVVM3.CatchingFishCoroutine;
                    if (j2 > j) {
                        long j3 = j2 * CatchingFishWebSocketLayout.CatchingFishSnackbar;
                        if (CatchingFishViewModelScope.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishViewModelFAB;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            CatchingFishJetpackCompose(this);
                        }
                    } else {
                        catchingFishToastMVVM2 = catchingFishToastMVVM3;
                    }
                }
                if (catchingFishToastMVVM2 == null) {
                    continue;
                } else {
                    catchingFishToastMVVM = catchingFishToastMVVM2;
                }
            }
            int i = (int) (andIncrement % CatchingFishWebSocketLayout.CatchingFishSnackbar);
            Object CatchingFishCloudMessaging2 = catchingFishToastMVVM.CatchingFishCloudMessaging(i);
            boolean z = CatchingFishCloudMessaging2 instanceof CatchingFishMVPJUnitMockk;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = CatchingFishWorkManager;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishViewModelScope)) {
                while (true) {
                    Object CatchingFishCloudMessaging3 = catchingFishToastMVVM.CatchingFishCloudMessaging(i);
                    if (!(CatchingFishCloudMessaging3 instanceof CatchingFishMVPJUnitMockk)) {
                        if (CatchingFishCloudMessaging3 != CatchingFishWebSocketLayout.CatchingFishFragmentHandler) {
                            if (CatchingFishCloudMessaging3 != null) {
                                if (CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishReduxKtor || CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishViewModelFAB || CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishLayout || CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishCloudMessaging || CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishEspressoTesting) {
                                    break loop0;
                                }
                                if (CatchingFishCloudMessaging3 != CatchingFishWebSocketLayout.CatchingFishWorkManager) {
                                    throw new IllegalStateException(("Unexpected cell state: " + CatchingFishCloudMessaging3).toString());
                                }
                            } else if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, new CatchingFishEspressoMVP((CatchingFishMVPJUnitMockk) CatchingFishCloudMessaging3))) {
                            break loop0;
                        }
                    } else if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishViewModelScope)) {
                        if (CatchingFishCardViewView(CatchingFishCloudMessaging3)) {
                            catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishReduxKtor);
                            break;
                        } else {
                            catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishFragmentHandler);
                            catchingFishToastMVVM.CatchingFishViewModelFAB();
                        }
                    }
                }
            } else if (CatchingFishCardViewView(CatchingFishCloudMessaging2)) {
                catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishReduxKtor);
                break;
            } else {
                catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishFragmentHandler);
                catchingFishToastMVVM.CatchingFishViewModelFAB();
                CatchingFishJetpackCompose(this);
            }
        }
        CatchingFishJetpackCompose(this);
    }

    public final void CatchingFishFragmentFactory(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        CatchingFishPicassoCameraX catchingFishPicassoCameraX = this;
        if (catchingFishPicassoCameraX.CatchingFishSpannableWidget()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = CatchingFishViewModelScope;
            if (atomicLongFieldUpdater.get(catchingFishPicassoCameraX) > j) {
                break;
            } else {
                catchingFishPicassoCameraX = this;
            }
        }
        int i = CatchingFishWebSocketLayout.CatchingFishCoroutine;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = CatchingFishViewModelFAB;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(catchingFishPicassoCameraX);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(catchingFishPicassoCameraX)) && j2 == atomicLongFieldUpdater.get(catchingFishPicassoCameraX)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(catchingFishPicassoCameraX);
                    if (atomicLongFieldUpdater2.compareAndSet(catchingFishPicassoCameraX, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        catchingFishPicassoCameraX = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(catchingFishPicassoCameraX);
                    long j5 = atomicLongFieldUpdater2.get(catchingFishPicassoCameraX);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(catchingFishPicassoCameraX)) {
                        break;
                    }
                    if (z) {
                        catchingFishPicassoCameraX = this;
                    } else {
                        catchingFishPicassoCameraX = this;
                        atomicLongFieldUpdater2.compareAndSet(catchingFishPicassoCameraX, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(catchingFishPicassoCameraX);
                    if (atomicLongFieldUpdater2.compareAndSet(catchingFishPicassoCameraX, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        catchingFishPicassoCameraX = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        CatchingFishSnackbar(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // kotlin.text.CatchingFishReduxCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishFragmentHandler(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        Object CatchingFishNavigation;
        Object obj2;
        CatchingFishPicassoCameraX catchingFishPicassoCameraX;
        CatchingFishToastMVVM catchingFishToastMVVM;
        int i;
        CatchingFishPicassoCameraX catchingFishPicassoCameraX2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishLayout;
        CatchingFishToastMVVM catchingFishToastMVVM2 = (CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(catchingFishPicassoCameraX2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishDaggerWebsocket;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(catchingFishPicassoCameraX2);
            long j = andIncrement & 1152921504606846975L;
            boolean CatchingFishCoroutineFlow = catchingFishPicassoCameraX2.CatchingFishCoroutineFlow(andIncrement, false);
            int i2 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            long j4 = catchingFishToastMVVM2.CatchingFishCoroutine;
            CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
            CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
            if (j4 != j3) {
                CatchingFishToastMVVM CatchingFishParcelableFAB = CatchingFishParcelableFAB(catchingFishPicassoCameraX2, j3, catchingFishToastMVVM2);
                if (CatchingFishParcelableFAB != null) {
                    catchingFishToastMVVM2 = CatchingFishParcelableFAB;
                } else if (CatchingFishCoroutineFlow) {
                    Object CatchingFishGsonAppCompat = CatchingFishGsonAppCompat(obj, catchingFishWebsocketGradle);
                    if (CatchingFishGsonAppCompat == catchingFishXMLLayoutMockk) {
                        return CatchingFishGsonAppCompat;
                    }
                }
            }
            int CatchingFishReduxKtor = CatchingFishReduxKtor(catchingFishPicassoCameraX2, catchingFishToastMVVM2, i3, obj, j, null, CatchingFishCoroutineFlow);
            if (CatchingFishReduxKtor == 0) {
                catchingFishToastMVVM2.CatchingFishParcelableFAB();
                return catchingFishRealmContext;
            }
            if (CatchingFishReduxKtor == 1) {
                break;
            }
            if (CatchingFishReduxKtor != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = CatchingFishWorkManager;
                if (CatchingFishReduxKtor == 3) {
                    CatchingFishKtorMockk CatchingFishCardViewRealm = CatchingFishRobolectricHilt.CatchingFishCardViewRealm(CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishWebsocketGradle));
                    Object obj3 = obj;
                    try {
                        int CatchingFishReduxKtor2 = CatchingFishReduxKtor(catchingFishPicassoCameraX2, catchingFishToastMVVM2, i3, obj3, j, CatchingFishCardViewRealm, false);
                        try {
                            if (CatchingFishReduxKtor2 != 0) {
                                if (CatchingFishReduxKtor2 == 1) {
                                    CatchingFishCardViewRealm.CatchingFishViewModelFAB(catchingFishRealmContext);
                                } else if (CatchingFishReduxKtor2 != 2) {
                                    if (CatchingFishReduxKtor2 != 4) {
                                        String str = "unexpected";
                                        if (CatchingFishReduxKtor2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        catchingFishToastMVVM2.CatchingFishParcelableFAB();
                                        CatchingFishToastMVVM catchingFishToastMVVM3 = (CatchingFishToastMVVM) atomicReferenceFieldUpdater.get(catchingFishPicassoCameraX2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(catchingFishPicassoCameraX2);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean CatchingFishCoroutineFlow2 = catchingFishPicassoCameraX2.CatchingFishCoroutineFlow(andIncrement2, false);
                                            int i4 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
                                            long j6 = i4;
                                            String str2 = str;
                                            long j7 = j5 / j6;
                                            int i5 = (int) (j5 % j6);
                                            if (catchingFishToastMVVM3.CatchingFishCoroutine != j7) {
                                                CatchingFishToastMVVM CatchingFishParcelableFAB2 = CatchingFishParcelableFAB(catchingFishPicassoCameraX2, j7, catchingFishToastMVVM3);
                                                if (CatchingFishParcelableFAB2 != null) {
                                                    i = i4;
                                                    catchingFishToastMVVM = CatchingFishParcelableFAB2;
                                                } else {
                                                    if (CatchingFishCoroutineFlow2) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                catchingFishToastMVVM = catchingFishToastMVVM3;
                                                i = i4;
                                            }
                                            int CatchingFishReduxKtor3 = CatchingFishReduxKtor(catchingFishPicassoCameraX2, catchingFishToastMVVM, i5, obj3, j5, CatchingFishCardViewRealm, CatchingFishCoroutineFlow2);
                                            Object obj4 = obj3;
                                            catchingFishPicassoCameraX = catchingFishPicassoCameraX2;
                                            CatchingFishToastMVVM catchingFishToastMVVM4 = catchingFishToastMVVM;
                                            obj2 = obj4;
                                            if (CatchingFishReduxKtor3 == 0) {
                                                catchingFishToastMVVM4.CatchingFishParcelableFAB();
                                                break;
                                            }
                                            if (CatchingFishReduxKtor3 == 1) {
                                                break;
                                            }
                                            if (CatchingFishReduxKtor3 != 2) {
                                                if (CatchingFishReduxKtor3 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (CatchingFishReduxKtor3 != 4) {
                                                    if (CatchingFishReduxKtor3 == 5) {
                                                        catchingFishToastMVVM4.CatchingFishParcelableFAB();
                                                    }
                                                    catchingFishToastMVVM3 = catchingFishToastMVVM4;
                                                    catchingFishPicassoCameraX2 = catchingFishPicassoCameraX;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j5 < atomicLongFieldUpdater2.get(catchingFishPicassoCameraX)) {
                                                    catchingFishToastMVVM4.CatchingFishParcelableFAB();
                                                }
                                            } else if (CatchingFishCoroutineFlow2) {
                                                catchingFishToastMVVM4.CatchingFishViewModelFAB();
                                            } else {
                                                CatchingFishCardViewRealm.CatchingFishParcelableFAB(catchingFishToastMVVM4, i5 + i);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        catchingFishPicassoCameraX = catchingFishPicassoCameraX2;
                                        if (j < atomicLongFieldUpdater2.get(catchingFishPicassoCameraX)) {
                                            catchingFishToastMVVM2.CatchingFishParcelableFAB();
                                        }
                                    }
                                    CatchingFishSnackbar(catchingFishPicassoCameraX, obj2, CatchingFishCardViewRealm);
                                } else {
                                    CatchingFishCardViewRealm.CatchingFishParcelableFAB(catchingFishToastMVVM2, i3 + i2);
                                }
                                CatchingFishNavigation = CatchingFishCardViewRealm.CatchingFishNavigation();
                                if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                                    CatchingFishNavigation = catchingFishRealmContext;
                                }
                                if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                                    return CatchingFishNavigation;
                                }
                            } else {
                                catchingFishToastMVVM2.CatchingFishParcelableFAB();
                            }
                            CatchingFishCardViewRealm.CatchingFishViewModelFAB(catchingFishRealmContext);
                            CatchingFishNavigation = CatchingFishCardViewRealm.CatchingFishNavigation();
                            if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                            }
                            if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            CatchingFishCardViewRealm.CatchingFishCardViewView();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (CatchingFishReduxKtor == 4) {
                    if (j < atomicLongFieldUpdater2.get(catchingFishPicassoCameraX2)) {
                        catchingFishToastMVVM2.CatchingFishParcelableFAB();
                    }
                    Object CatchingFishGsonAppCompat2 = CatchingFishGsonAppCompat(obj, catchingFishWebsocketGradle);
                    if (CatchingFishGsonAppCompat2 == catchingFishXMLLayoutMockk) {
                        return CatchingFishGsonAppCompat2;
                    }
                } else if (CatchingFishReduxKtor == 5) {
                    catchingFishToastMVVM2.CatchingFishParcelableFAB();
                }
            } else if (CatchingFishCoroutineFlow) {
                catchingFishToastMVVM2.CatchingFishViewModelFAB();
                Object CatchingFishGsonAppCompat3 = CatchingFishGsonAppCompat(obj, catchingFishWebsocketGradle);
                if (CatchingFishGsonAppCompat3 == catchingFishXMLLayoutMockk) {
                    return CatchingFishGsonAppCompat3;
                }
            }
        }
    }

    public final Object CatchingFishGsonAppCompat(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishKtorMockk catchingFishKtorMockk = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishWebsocketGradle));
        catchingFishKtorMockk.CatchingFish();
        catchingFishKtorMockk.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(CatchingFishRoomDatabase()));
        Object CatchingFishNavigation = catchingFishKtorMockk.CatchingFishNavigation();
        return CatchingFishNavigation == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor ? CatchingFishNavigation : CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    public final void CatchingFishLayout(long j) {
        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) CatchingFishFragmentHandler.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishWorkManager;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.CatchingFishReduxKtor + j2, CatchingFishViewModelScope.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (catchingFishToastMVVM.CatchingFishCoroutine != j4) {
                    CatchingFishToastMVVM CatchingFishOkHttp2 = CatchingFishOkHttp(j4, catchingFishToastMVVM);
                    if (CatchingFishOkHttp2 != null) {
                        catchingFishToastMVVM = CatchingFishOkHttp2;
                    }
                }
                CatchingFishToastMVVM catchingFishToastMVVM2 = catchingFishToastMVVM;
                if (CatchingFishMVPRobolectric(catchingFishToastMVVM2, i, j2, null) != CatchingFishWebSocketLayout.CatchingFishAnimationMockk) {
                    catchingFishToastMVVM2.CatchingFishParcelableFAB();
                } else if (j2 < CatchingFishNavigation()) {
                    catchingFishToastMVVM2.CatchingFishParcelableFAB();
                }
                catchingFishToastMVVM = catchingFishToastMVVM2;
            }
        }
    }

    public final Object CatchingFishMVPRobolectric(CatchingFishToastMVVM catchingFishToastMVVM, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = catchingFishToastMVVM.CatchingFishWorkManager;
        Object CatchingFishCloudMessaging2 = catchingFishToastMVVM.CatchingFishCloudMessaging(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishDaggerWebsocket;
        if (CatchingFishCloudMessaging2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return CatchingFishWebSocketLayout.CatchingFishUnitTesting;
                }
                if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging2, obj)) {
                    CatchingFishEspressoTesting();
                    return CatchingFishWebSocketLayout.CatchingFishOkHttp;
                }
            }
        } else if (CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishReduxKtor && catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishLayout)) {
            CatchingFishEspressoTesting();
            Object obj2 = atomicReferenceArray.get(i * 2);
            catchingFishToastMVVM.CatchingFishOkHttp(i, null);
            return obj2;
        }
        while (true) {
            Object CatchingFishCloudMessaging3 = catchingFishToastMVVM.CatchingFishCloudMessaging(i);
            if (CatchingFishCloudMessaging3 == null || CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishViewModelFAB)) {
                        CatchingFishEspressoTesting();
                        return CatchingFishWebSocketLayout.CatchingFishAnimationMockk;
                    }
                } else {
                    if (obj == null) {
                        return CatchingFishWebSocketLayout.CatchingFishUnitTesting;
                    }
                    if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, obj)) {
                        CatchingFishEspressoTesting();
                        return CatchingFishWebSocketLayout.CatchingFishOkHttp;
                    }
                }
            } else if (CatchingFishCloudMessaging3 != CatchingFishWebSocketLayout.CatchingFishReduxKtor) {
                CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFishFragmentHandler;
                if (CatchingFishCloudMessaging3 == catchingFishFluxWorkManager) {
                    return CatchingFishWebSocketLayout.CatchingFishAnimationMockk;
                }
                if (CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishViewModelFAB) {
                    return CatchingFishWebSocketLayout.CatchingFishAnimationMockk;
                }
                if (CatchingFishCloudMessaging3 == CatchingFishWebSocketLayout.CatchingFishEspressoTesting) {
                    CatchingFishEspressoTesting();
                    return CatchingFishWebSocketLayout.CatchingFishAnimationMockk;
                }
                if (CatchingFishCloudMessaging3 != CatchingFishWebSocketLayout.CatchingFishViewModelScope && catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishWorkManager)) {
                    boolean z = CatchingFishCloudMessaging3 instanceof CatchingFishEspressoMVP;
                    if (z) {
                        CatchingFishCloudMessaging3 = ((CatchingFishEspressoMVP) CatchingFishCloudMessaging3).CatchingFishParcelableFAB;
                    }
                    if (CatchingFishCardViewView(CatchingFishCloudMessaging3)) {
                        catchingFishToastMVVM.CatchingFishUnitTesting(i, CatchingFishWebSocketLayout.CatchingFishLayout);
                        CatchingFishEspressoTesting();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        catchingFishToastMVVM.CatchingFishOkHttp(i, null);
                        return obj3;
                    }
                    catchingFishToastMVVM.CatchingFishUnitTesting(i, catchingFishFluxWorkManager);
                    catchingFishToastMVVM.CatchingFishViewModelFAB();
                    if (z) {
                        CatchingFishEspressoTesting();
                    }
                    return CatchingFishWebSocketLayout.CatchingFishAnimationMockk;
                }
            } else if (catchingFishToastMVVM.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishLayout)) {
                CatchingFishEspressoTesting();
                Object obj4 = atomicReferenceArray.get(i * 2);
                catchingFishToastMVVM.CatchingFishOkHttp(i, null);
                return obj4;
            }
        }
    }

    public final long CatchingFishNavigation() {
        return CatchingFishDaggerWebsocket.get(this) & 1152921504606846975L;
    }

    public final CatchingFishToastMVVM CatchingFishOkHttp(long j, CatchingFishToastMVVM catchingFishToastMVVM) {
        Object CatchingFishGsonAppCompat;
        long j2;
        CatchingFishToastMVVM catchingFishToastMVVM2 = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
        CatchingFishOkHttpHilt catchingFishOkHttpHilt = CatchingFishOkHttpHilt.CatchingFishEspressoTesting;
        loop0: while (true) {
            CatchingFishGsonAppCompat = CatchingFishLayoutRoomFAB.CatchingFishGsonAppCompat(catchingFishToastMVVM, j, catchingFishOkHttpHilt);
            if (!CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
                CatchingFishFluxSnackbar CatchingFishCardViewView = CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishFragmentHandler;
                    CatchingFishFluxSnackbar catchingFishFluxSnackbar = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater.get(this);
                    if (catchingFishFluxSnackbar.CatchingFishCoroutine >= CatchingFishCardViewView.CatchingFishCoroutine) {
                        break loop0;
                    }
                    if (!CatchingFishCardViewView.CatchingFishLayout()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxSnackbar, CatchingFishCardViewView)) {
                        if (atomicReferenceFieldUpdater.get(this) != catchingFishFluxSnackbar) {
                            if (CatchingFishCardViewView.CatchingFishDaggerWebsocket()) {
                                CatchingFishCardViewView.CatchingFishReduxKtor();
                            }
                        }
                    }
                    if (catchingFishFluxSnackbar.CatchingFishDaggerWebsocket()) {
                        catchingFishFluxSnackbar.CatchingFishReduxKtor();
                    }
                }
            } else {
                break;
            }
        }
        if (CatchingFishOkHttpFAB.CatchingFishMutableLiveData(CatchingFishGsonAppCompat)) {
            CatchingFishViewModelFAB();
            if (catchingFishToastMVVM.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar < CatchingFishNavigation()) {
                catchingFishToastMVVM.CatchingFishParcelableFAB();
                return null;
            }
        } else {
            CatchingFishToastMVVM catchingFishToastMVVM3 = (CatchingFishToastMVVM) CatchingFishOkHttpFAB.CatchingFishCardViewView(CatchingFishGsonAppCompat);
            long j3 = catchingFishToastMVVM3.CatchingFishCoroutine;
            if (!CatchingFishSpannableWidget() && j <= CatchingFishViewModelScope.get(this) / CatchingFishWebSocketLayout.CatchingFishSnackbar) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishCloudMessaging;
                    CatchingFishFluxSnackbar catchingFishFluxSnackbar2 = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater2.get(this);
                    if (catchingFishFluxSnackbar2.CatchingFishCoroutine >= j3 || !catchingFishToastMVVM3.CatchingFishLayout()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, catchingFishFluxSnackbar2, catchingFishToastMVVM3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != catchingFishFluxSnackbar2) {
                            if (catchingFishToastMVVM3.CatchingFishDaggerWebsocket()) {
                                catchingFishToastMVVM3.CatchingFishReduxKtor();
                            }
                        }
                    }
                    if (catchingFishFluxSnackbar2.CatchingFishDaggerWebsocket()) {
                        catchingFishFluxSnackbar2.CatchingFishReduxKtor();
                    }
                }
            }
            if (j3 <= j) {
                return catchingFishToastMVVM3;
            }
            long j4 = j3 * CatchingFishWebSocketLayout.CatchingFishSnackbar;
            do {
                j2 = CatchingFishWorkManager.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!CatchingFishWorkManager.compareAndSet(this, j2, j4));
            if (j3 * CatchingFishWebSocketLayout.CatchingFishSnackbar < CatchingFishNavigation()) {
                catchingFishToastMVVM3.CatchingFishParcelableFAB();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishParcelableFlux(long j, CatchingFishToastMVVM catchingFishToastMVVM) {
        CatchingFishToastMVVM catchingFishToastMVVM2;
        CatchingFishToastMVVM catchingFishToastMVVM3;
        while (catchingFishToastMVVM.CatchingFishCoroutine < j && (catchingFishToastMVVM3 = (CatchingFishToastMVVM) catchingFishToastMVVM.CatchingFishSnackbar()) != null) {
            catchingFishToastMVVM = catchingFishToastMVVM3;
        }
        while (true) {
            if (!catchingFishToastMVVM.CatchingFishCoroutine() || (catchingFishToastMVVM2 = (CatchingFishToastMVVM) catchingFishToastMVVM.CatchingFishSnackbar()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishCloudMessaging;
                    CatchingFishFluxSnackbar catchingFishFluxSnackbar = (CatchingFishFluxSnackbar) atomicReferenceFieldUpdater.get(this);
                    if (catchingFishFluxSnackbar.CatchingFishCoroutine >= catchingFishToastMVVM.CatchingFishCoroutine) {
                        return;
                    }
                    if (!catchingFishToastMVVM.CatchingFishLayout()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxSnackbar, catchingFishToastMVVM)) {
                        if (atomicReferenceFieldUpdater.get(this) != catchingFishFluxSnackbar) {
                            if (catchingFishToastMVVM.CatchingFishDaggerWebsocket()) {
                                catchingFishToastMVVM.CatchingFishReduxKtor();
                            }
                        }
                    }
                    if (catchingFishFluxSnackbar.CatchingFishDaggerWebsocket()) {
                        catchingFishFluxSnackbar.CatchingFishReduxKtor();
                        return;
                    }
                    return;
                }
            }
            catchingFishToastMVVM = catchingFishToastMVVM2;
        }
    }

    public final boolean CatchingFishPayPal(Object obj, Object obj2) {
        if (!(obj instanceof CatchingFishMVVMCardView)) {
            if (!(obj instanceof CatchingFishGsonLiveData)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CatchingFishGsonLiveData catchingFishGsonLiveData = (CatchingFishGsonLiveData) obj;
            CatchingFishToastMVVM catchingFishToastMVVM = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
            CatchingFishFluxWorkManager CatchingFishWorkManager2 = catchingFishGsonLiveData.CatchingFishWorkManager(obj2, null);
            if (CatchingFishWorkManager2 == null) {
                return false;
            }
            catchingFishGsonLiveData.CatchingFishJetpackCompose(CatchingFishWorkManager2);
            return true;
        }
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        CatchingFishMVVMCardView catchingFishMVVMCardView = (CatchingFishMVVMCardView) obj;
        CatchingFishKtorMockk catchingFishKtorMockk = catchingFishMVVMCardView.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishKtorMockk);
        catchingFishMVVMCardView.CatchingFishDaggerWebsocket = null;
        catchingFishMVVMCardView.CatchingFishReduxKtor = obj2;
        Boolean bool = Boolean.TRUE;
        catchingFishMVVMCardView.CatchingFishWorkManager.getClass();
        CatchingFishToastMVVM catchingFishToastMVVM2 = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
        CatchingFishFluxWorkManager CatchingFishWorkManager3 = catchingFishKtorMockk.CatchingFishWorkManager(bool, null);
        if (CatchingFishWorkManager3 == null) {
            return false;
        }
        catchingFishKtorMockk.CatchingFishJetpackCompose(CatchingFishWorkManager3);
        return true;
    }

    public final Throwable CatchingFishRoomDatabase() {
        Throwable CatchingFishAnimationMockk = CatchingFishAnimationMockk();
        return CatchingFishAnimationMockk == null ? new CatchingFishRealmStripeAPI("Channel was closed") : CatchingFishAnimationMockk;
    }

    public final boolean CatchingFishSpannableWidget() {
        long j = CatchingFishViewModelScope.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final Throwable CatchingFishStateLiveData() {
        Throwable CatchingFishAnimationMockk = CatchingFishAnimationMockk();
        return CatchingFishAnimationMockk == null ? new CatchingFishGradleRedux("Channel was closed") : CatchingFishAnimationMockk;
    }

    @Override // kotlin.text.CatchingFishIntentMVP
    public final Object CatchingFishUnitTesting() {
        CatchingFishToastMVVM catchingFishToastMVVM;
        CatchingFishLiveDataGson catchingFishLiveDataGson = CatchingFishBiometricBundle.CatchingFishSnackbar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishWorkManager;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = CatchingFishDaggerWebsocket;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (CatchingFishCoroutineFlow(j2, true)) {
            return new CatchingFishStateFlowOkHttp(CatchingFishAnimationMockk());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return catchingFishLiveDataGson;
        }
        Object obj = CatchingFishWebSocketLayout.CatchingFishCloudMessaging;
        CatchingFishToastMVVM catchingFishToastMVVM2 = (CatchingFishToastMVVM) CatchingFishFragmentHandler.get(this);
        while (!CatchingFishCoroutineFlow(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (catchingFishToastMVVM2.CatchingFishCoroutine != j4) {
                CatchingFishToastMVVM CatchingFishOkHttp2 = CatchingFishOkHttp(j4, catchingFishToastMVVM2);
                if (CatchingFishOkHttp2 == null) {
                    continue;
                } else {
                    catchingFishToastMVVM = CatchingFishOkHttp2;
                }
            } else {
                catchingFishToastMVVM = catchingFishToastMVVM2;
            }
            Object CatchingFishMVPRobolectric = CatchingFishMVPRobolectric(catchingFishToastMVVM, i, andIncrement, obj);
            CatchingFishToastMVVM catchingFishToastMVVM3 = catchingFishToastMVVM;
            if (CatchingFishMVPRobolectric == CatchingFishWebSocketLayout.CatchingFishOkHttp) {
                CatchingFishMVPJUnitMockk catchingFishMVPJUnitMockk = obj instanceof CatchingFishMVPJUnitMockk ? (CatchingFishMVPJUnitMockk) obj : null;
                if (catchingFishMVPJUnitMockk != null) {
                    catchingFishMVPJUnitMockk.CatchingFishParcelableFAB(catchingFishToastMVVM3, i);
                }
                CatchingFishFragmentFactory(andIncrement);
                catchingFishToastMVVM3.CatchingFishViewModelFAB();
                return catchingFishLiveDataGson;
            }
            if (CatchingFishMVPRobolectric != CatchingFishWebSocketLayout.CatchingFishAnimationMockk) {
                if (CatchingFishMVPRobolectric == CatchingFishWebSocketLayout.CatchingFishUnitTesting) {
                    throw new IllegalStateException("unexpected");
                }
                catchingFishToastMVVM3.CatchingFishParcelableFAB();
                return CatchingFishMVPRobolectric;
            }
            if (andIncrement < CatchingFishNavigation()) {
                catchingFishToastMVVM3.CatchingFishParcelableFAB();
            }
            catchingFishToastMVVM2 = catchingFishToastMVVM3;
        }
        return new CatchingFishStateFlowOkHttp(CatchingFishAnimationMockk());
    }

    public final void CatchingFishViewModelFAB() {
        CatchingFishCoroutineFlow(CatchingFishDaggerWebsocket.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (kotlin.text.CatchingFishToastMVVM) ((kotlin.text.CatchingFishJUnitLifecycle) kotlin.text.CatchingFishJUnitLifecycle.CatchingFishSnackbar.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishToastMVVM CatchingFishViewModelScope(long j) {
        Object obj;
        long j2;
        Object obj2 = CatchingFishCloudMessaging.get(this);
        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) CatchingFishLayout.get(this);
        if (catchingFishToastMVVM.CatchingFishCoroutine > ((CatchingFishToastMVVM) obj2).CatchingFishCoroutine) {
            obj2 = catchingFishToastMVVM;
        }
        CatchingFishToastMVVM catchingFishToastMVVM2 = (CatchingFishToastMVVM) CatchingFishFragmentHandler.get(this);
        if (catchingFishToastMVVM2.CatchingFishCoroutine > ((CatchingFishToastMVVM) obj2).CatchingFishCoroutine) {
            obj2 = catchingFishToastMVVM2;
        }
        CatchingFishJUnitLifecycle catchingFishJUnitLifecycle = (CatchingFishJUnitLifecycle) obj2;
        loop0: while (true) {
            catchingFishJUnitLifecycle.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishJUnitLifecycle.CatchingFishParcelableFAB;
            Object obj3 = atomicReferenceFieldUpdater.get(catchingFishJUnitLifecycle);
            CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishLayoutRoomFAB.CatchingFishSnackbar;
            obj = null;
            if (obj3 == catchingFishFluxWorkManager) {
                break;
            }
            CatchingFishJUnitLifecycle catchingFishJUnitLifecycle2 = (CatchingFishJUnitLifecycle) obj3;
            if (catchingFishJUnitLifecycle2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishJUnitLifecycle, null, catchingFishFluxWorkManager)) {
                    if (atomicReferenceFieldUpdater.get(catchingFishJUnitLifecycle) != null) {
                        break;
                    }
                }
                break loop0;
            }
            catchingFishJUnitLifecycle = catchingFishJUnitLifecycle2;
        }
        CatchingFishToastMVVM catchingFishToastMVVM3 = (CatchingFishToastMVVM) catchingFishJUnitLifecycle;
        if (CatchingFishDaggerHiltFAB()) {
            CatchingFishToastMVVM catchingFishToastMVVM4 = catchingFishToastMVVM3;
            loop2: do {
                int i = CatchingFishWebSocketLayout.CatchingFishSnackbar - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (catchingFishToastMVVM4.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar) + i;
                    if (j2 < CatchingFishWorkManager.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object CatchingFishCloudMessaging2 = catchingFishToastMVVM4.CatchingFishCloudMessaging(i);
                        if (CatchingFishCloudMessaging2 != null && CatchingFishCloudMessaging2 != CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket) {
                            if (CatchingFishCloudMessaging2 == CatchingFishWebSocketLayout.CatchingFishReduxKtor) {
                                break loop2;
                            }
                        } else {
                            if (catchingFishToastMVVM4.CatchingFishFragmentHandler(i, CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                                catchingFishToastMVVM4.CatchingFishViewModelFAB();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (catchingFishToastMVVM4 != null);
            j2 = -1;
            if (j2 != -1) {
                CatchingFishLayout(j2);
            }
        }
        loop5: for (CatchingFishToastMVVM catchingFishToastMVVM5 = catchingFishToastMVVM3; catchingFishToastMVVM5 != null; catchingFishToastMVVM5 = (CatchingFishToastMVVM) ((CatchingFishJUnitLifecycle) CatchingFishJUnitLifecycle.CatchingFishSnackbar.get(catchingFishToastMVVM5))) {
            for (int i2 = CatchingFishWebSocketLayout.CatchingFishSnackbar - 1; -1 < i2; i2--) {
                if ((catchingFishToastMVVM5.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar) + i2 < j) {
                    break loop5;
                }
                while (true) {
                    Object CatchingFishCloudMessaging3 = catchingFishToastMVVM5.CatchingFishCloudMessaging(i2);
                    if (CatchingFishCloudMessaging3 != null && CatchingFishCloudMessaging3 != CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket) {
                        if (!(CatchingFishCloudMessaging3 instanceof CatchingFishEspressoMVP)) {
                            if (!(CatchingFishCloudMessaging3 instanceof CatchingFishMVPJUnitMockk)) {
                                break;
                            }
                            if (catchingFishToastMVVM5.CatchingFishFragmentHandler(i2, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                                obj = CatchingFishBiometricBundle.CatchingFishFragmentFactory(obj, CatchingFishCloudMessaging3);
                                catchingFishToastMVVM5.CatchingFishEspressoTesting(i2, true);
                                break;
                            }
                        } else {
                            if (catchingFishToastMVVM5.CatchingFishFragmentHandler(i2, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                                obj = CatchingFishBiometricBundle.CatchingFishFragmentFactory(obj, ((CatchingFishEspressoMVP) CatchingFishCloudMessaging3).CatchingFishParcelableFAB);
                                catchingFishToastMVVM5.CatchingFishEspressoTesting(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (catchingFishToastMVVM5.CatchingFishFragmentHandler(i2, CatchingFishCloudMessaging3, CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                            catchingFishToastMVVM5.CatchingFishViewModelFAB();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                CatchingFishCardViewRealm((CatchingFishMVPJUnitMockk) obj, true);
                return catchingFishToastMVVM3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                CatchingFishCardViewRealm((CatchingFishMVPJUnitMockk) arrayList.get(size), true);
            }
        }
        return catchingFishToastMVVM3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishWorkManager(Throwable th, boolean z) {
        CatchingFishPicassoCameraX catchingFishPicassoCameraX;
        CatchingFishFluxWorkManager catchingFishFluxWorkManager;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CatchingFishDaggerWebsocket;
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) == 0) {
                    CatchingFishToastMVVM catchingFishToastMVVM = CatchingFishWebSocketLayout.CatchingFishParcelableFAB;
                    catchingFishPicassoCameraX = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(catchingFishPicassoCameraX, j5, (j5 & 1152921504606846975L) + (1 << 60)));
            catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFish;
            while (true) {
                atomicReferenceFieldUpdater = CatchingFishEspressoTesting;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxWorkManager, th)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != catchingFishFluxWorkManager) {
                    z2 = false;
                    break;
                }
            }
            if (z) {
                do {
                    j = atomicLongFieldUpdater.get(this);
                    int i = (int) (j >> 60);
                    if (i == 0) {
                        j2 = j & 1152921504606846975L;
                        j3 = 2;
                    } else {
                        if (i != 1) {
                            break;
                        }
                        j2 = j & 1152921504606846975L;
                        j3 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(catchingFishPicassoCameraX, j, (j3 << 60) + j2));
            } else {
                do {
                    j4 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(catchingFishPicassoCameraX, j4, (3 << 60) + (j4 & 1152921504606846975L)));
            }
            CatchingFishViewModelFAB();
            if (z2) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CatchingFishOkHttp;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    CatchingFishFluxWorkManager catchingFishFluxWorkManager2 = obj == null ? CatchingFishWebSocketLayout.CatchingFishRoomDatabase : CatchingFishWebSocketLayout.CatchingFishNavigation;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, catchingFishFluxWorkManager2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(1, obj);
                    ((CatchingFishServiceHandler) obj).CatchingFishFragmentHandler(CatchingFishAnimationMockk());
                    return z2;
                }
            }
            return z2;
        }
        catchingFishPicassoCameraX = this;
        catchingFishFluxWorkManager = CatchingFishWebSocketLayout.CatchingFish;
        while (true) {
            atomicReferenceFieldUpdater = CatchingFishEspressoTesting;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, catchingFishFluxWorkManager, th)) {
            }
        }
        if (z) {
        }
        CatchingFishViewModelFAB();
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (kotlin.text.CatchingFishToastMVVM) r3.CatchingFishSnackbar();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        int i = (int) (CatchingFishDaggerWebsocket.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.CatchingFishReduxKtor + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z2 = true;
        List CatchingFishLayoutInflater = CatchingFishToastCustomView.CatchingFishLayoutInflater(CatchingFishFragmentHandler.get(this), CatchingFishLayout.get(this), CatchingFishCloudMessaging.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : CatchingFishLayoutInflater) {
            if (((CatchingFishToastMVVM) obj) != CatchingFishWebSocketLayout.CatchingFishParcelableFAB) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((CatchingFishToastMVVM) next).CatchingFishCoroutine;
            do {
                Object next2 = it.next();
                long j2 = ((CatchingFishToastMVVM) next2).CatchingFishCoroutine;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        CatchingFishToastMVVM catchingFishToastMVVM = (CatchingFishToastMVVM) next;
        long j3 = CatchingFishWorkManager.get(this);
        long CatchingFishNavigation = CatchingFishNavigation();
        loop2: while (true) {
            int i3 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (catchingFishToastMVVM.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar) + i4;
                if (j4 >= CatchingFishNavigation && j4 >= j3) {
                    break loop2;
                }
                Object CatchingFishCloudMessaging2 = catchingFishToastMVVM.CatchingFishCloudMessaging(i4);
                boolean z3 = z2;
                Object obj2 = catchingFishToastMVVM.CatchingFishWorkManager.get(i4 * 2);
                if (CatchingFishCloudMessaging2 instanceof CatchingFishGsonLiveData) {
                    str = (j4 >= j3 || j4 < CatchingFishNavigation) ? (j4 >= CatchingFishNavigation || j4 < j3) ? "cont" : "send" : "receive";
                } else if (CatchingFishCloudMessaging2 instanceof CatchingFishEspressoMVP) {
                    str = "EB(" + CatchingFishCloudMessaging2 + ')';
                } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishWorkManager) || CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishCloudMessaging2, CatchingFishWebSocketLayout.CatchingFishViewModelScope)) {
                    str = "resuming_sender";
                } else {
                    if (CatchingFishCloudMessaging2 != null && !CatchingFishCloudMessaging2.equals(CatchingFishWebSocketLayout.CatchingFishDaggerWebsocket) && !CatchingFishCloudMessaging2.equals(CatchingFishWebSocketLayout.CatchingFishLayout) && !CatchingFishCloudMessaging2.equals(CatchingFishWebSocketLayout.CatchingFishViewModelFAB) && !CatchingFishCloudMessaging2.equals(CatchingFishWebSocketLayout.CatchingFishCloudMessaging) && !CatchingFishCloudMessaging2.equals(CatchingFishWebSocketLayout.CatchingFishFragmentHandler) && !CatchingFishCloudMessaging2.equals(CatchingFishWebSocketLayout.CatchingFishEspressoTesting)) {
                        str = CatchingFishCloudMessaging2.toString();
                    }
                    i4++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
                z2 = z3;
            }
            z2 = z;
            i2 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(CatchingFishRoomMVVMWidget.CatchingFishJobScheduler(sb)) == ',') {
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }
}
