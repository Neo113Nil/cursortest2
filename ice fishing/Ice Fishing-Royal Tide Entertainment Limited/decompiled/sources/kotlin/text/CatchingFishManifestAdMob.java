package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishManifestAdMob extends CatchingFishCameraXManifest implements CatchingFishRealmGoogleMaps {
    public static final /* synthetic */ AtomicReferenceFieldUpdater CatchingFishViewModelScope = AtomicReferenceFieldUpdater.newUpdater(CatchingFishManifestAdMob.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = CatchingFishLayoutRoomFAB.CatchingFishDaggerWebsocket;

    public final Object CatchingFishCoroutine(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        boolean CatchingFishReduxKtor = CatchingFishReduxKtor();
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        if (!CatchingFishReduxKtor) {
            CatchingFishKtorMockk CatchingFishCardViewRealm = CatchingFishRobolectricHilt.CatchingFishCardViewRealm(CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishStateFlowGson));
            try {
                CatchingFishParcelableFAB(new CatchingFishContextMoshi(this, CatchingFishCardViewRealm));
                Object CatchingFishNavigation = CatchingFishCardViewRealm.CatchingFishNavigation();
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                    CatchingFishNavigation = catchingFishRealmContext;
                }
                if (CatchingFishNavigation == catchingFishXMLLayoutMockk) {
                    return CatchingFishNavigation;
                }
            } catch (Throwable th) {
                CatchingFishCardViewRealm.CatchingFishCardViewView();
                throw th;
            }
        }
        return catchingFishRealmContext;
    }

    public final void CatchingFishDaggerWebsocket(Object obj) {
        while (Math.max(CatchingFishCameraXManifest.CatchingFishWorkManager.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishViewModelScope;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishLayoutRoomFAB.CatchingFishDaggerWebsocket;
            if (obj2 != catchingFishFluxWorkManager) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, catchingFishFluxWorkManager)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    CatchingFishSnackbar();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean CatchingFishReduxKtor() {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishCameraXManifest.CatchingFishWorkManager;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    CatchingFishViewModelScope.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(CatchingFishBiometricBundle.CatchingFish(this));
        sb.append("[isLocked=");
        sb.append(Math.max(CatchingFishCameraXManifest.CatchingFishWorkManager.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(CatchingFishViewModelScope.get(this));
        sb.append(']');
        return sb.toString();
    }
}
