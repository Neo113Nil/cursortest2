package kotlin.text;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishHandlerAndroidX extends CatchingFishJUnitRetrofit implements CatchingFishLayoutAndroidX, CatchingFishLayoutViewPager, CatchingFishMVIAndroidXKtor {
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishLayout = AtomicReferenceFieldUpdater.newUpdater(CatchingFishHandlerAndroidX.class, Object.class, "_state$volatile");
    public int CatchingFishViewModelFAB;
    private volatile /* synthetic */ Object _state$volatile;

    public CatchingFishHandlerAndroidX(Object obj) {
        this._state$volatile = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishLayoutViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object CatchingFishCoroutine(kotlin.text.CatchingFishIntentManifest r18, kotlin.text.CatchingFishWebsocketGradle r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.CatchingFishHandlerAndroidX.CatchingFishCoroutine(kotlin.text.CatchingFishIntentManifest, kotlin.text.CatchingFishWebsocketGradle):java.lang.Object");
    }

    @Override // kotlin.text.CatchingFishMVIAndroidXKtor
    public final CatchingFishLayoutViewPager CatchingFishDaggerWebsocket(CatchingFishManifestMockk catchingFishManifestMockk, int i, CatchingFishCoroutineToast catchingFishCoroutineToast) {
        return ((((i < 0 || i >= 2) && i != -2) || catchingFishCoroutineToast != CatchingFishCoroutineToast.CatchingFishDaggerWebsocket) && !((i == 0 || i == -3) && catchingFishCoroutineToast == CatchingFishCoroutineToast.CatchingFishReduxKtor)) ? new CatchingFishRoomPicasso(this, catchingFishManifestMockk, i, catchingFishCoroutineToast) : this;
    }

    public final boolean CatchingFishFragmentHandler(Object obj, Object obj2) {
        int i;
        CatchingFishWebsocket[] catchingFishWebsocketArr;
        CatchingFishFluxWorkManager catchingFishFluxWorkManager;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishLayout;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !CatchingFishFirebaseDagger.CatchingFishOkHttp(obj3, obj)) {
                return false;
            }
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.CatchingFishViewModelFAB;
            if ((i2 & 1) != 0) {
                this.CatchingFishViewModelFAB = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.CatchingFishViewModelFAB = i3;
            CatchingFishWebsocket[] catchingFishWebsocketArr2 = this.CatchingFishReduxKtor;
            while (true) {
                CatchingFishAppCompatRedux[] catchingFishAppCompatReduxArr = (CatchingFishAppCompatRedux[]) catchingFishWebsocketArr2;
                if (catchingFishAppCompatReduxArr != null) {
                    for (CatchingFishAppCompatRedux catchingFishAppCompatRedux : catchingFishAppCompatReduxArr) {
                        if (catchingFishAppCompatRedux != null) {
                            AtomicReference atomicReference = catchingFishAppCompatRedux.CatchingFishParcelableFAB;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (catchingFishFluxWorkManager = CatchingFishFirebaseDagger.CatchingFishStateLiveData)) {
                                    CatchingFishFluxWorkManager catchingFishFluxWorkManager2 = CatchingFishFirebaseDagger.CatchingFishAnimationMockk;
                                    if (obj4 != catchingFishFluxWorkManager2) {
                                        while (!atomicReference.compareAndSet(obj4, catchingFishFluxWorkManager2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((CatchingFishKtorMockk) obj4).CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, catchingFishFluxWorkManager)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.CatchingFishViewModelFAB;
                    if (i == i3) {
                        this.CatchingFishViewModelFAB = i3 + 1;
                        return true;
                    }
                    catchingFishWebsocketArr = this.CatchingFishReduxKtor;
                }
                catchingFishWebsocketArr2 = catchingFishWebsocketArr;
                i3 = i;
            }
        }
    }

    @Override // kotlin.text.CatchingFishIntentManifest
    public final Object CatchingFishLayout(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishViewModelFAB(obj);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishJUnitRetrofit
    public final CatchingFishWebsocket[] CatchingFishReduxKtor() {
        return new CatchingFishAppCompatRedux[2];
    }

    @Override // kotlin.text.CatchingFishJUnitRetrofit
    public final CatchingFishWebsocket CatchingFishSnackbar() {
        return new CatchingFishAppCompatRedux();
    }

    public final void CatchingFishViewModelFAB(Object obj) {
        if (obj == null) {
            obj = CatchingFishAdMobFAB.CatchingFishViewModelScope;
        }
        CatchingFishFragmentHandler(null, obj);
    }

    @Override // kotlin.text.CatchingFishReduxMVI
    public final Object getValue() {
        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishAdMobFAB.CatchingFishViewModelScope;
        Object obj = CatchingFishLayout.get(this);
        if (obj == catchingFishFluxWorkManager) {
            return null;
        }
        return obj;
    }
}
