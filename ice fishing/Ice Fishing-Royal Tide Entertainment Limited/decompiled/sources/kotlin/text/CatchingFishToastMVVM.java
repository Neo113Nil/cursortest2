package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class CatchingFishToastMVVM extends CatchingFishFluxSnackbar {
    public final CatchingFishPicassoCameraX CatchingFishDaggerWebsocket;
    public final /* synthetic */ AtomicReferenceArray CatchingFishWorkManager;

    public CatchingFishToastMVVM(long j, CatchingFishToastMVVM catchingFishToastMVVM, CatchingFishPicassoCameraX catchingFishPicassoCameraX, int i) {
        super(j, catchingFishToastMVVM, i);
        this.CatchingFishDaggerWebsocket = catchingFishPicassoCameraX;
        this.CatchingFishWorkManager = new AtomicReferenceArray(CatchingFishWebSocketLayout.CatchingFishSnackbar * 2);
    }

    public final Object CatchingFishCloudMessaging(int i) {
        return this.CatchingFishWorkManager.get((i * 2) + 1);
    }

    public final void CatchingFishEspressoTesting(int i, boolean z) {
        if (z) {
            CatchingFishPicassoCameraX catchingFishPicassoCameraX = this.CatchingFishDaggerWebsocket;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishPicassoCameraX);
            catchingFishPicassoCameraX.CatchingFishFragmentFactory((this.CatchingFishCoroutine * CatchingFishWebSocketLayout.CatchingFishSnackbar) + i);
        }
        CatchingFishViewModelFAB();
    }

    public final boolean CatchingFishFragmentHandler(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.CatchingFishWorkManager;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void CatchingFishOkHttp(int i, Object obj) {
        this.CatchingFishWorkManager.set(i * 2, obj);
    }

    public final void CatchingFishUnitTesting(int i, Object obj) {
        this.CatchingFishWorkManager.set((i * 2) + 1, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        CatchingFishOkHttp(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.text.CatchingFishFirebaseDagger.CatchingFishAnimationMockk(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // kotlin.text.CatchingFishFluxSnackbar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishViewModelScope(int i, CatchingFishManifestMockk catchingFishManifestMockk) {
        int i2 = CatchingFishWebSocketLayout.CatchingFishSnackbar;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.CatchingFishWorkManager.get(i * 2);
        while (true) {
            Object CatchingFishCloudMessaging = CatchingFishCloudMessaging(i);
            boolean z2 = CatchingFishCloudMessaging instanceof CatchingFishMVPJUnitMockk;
            CatchingFishPicassoCameraX catchingFishPicassoCameraX = this.CatchingFishDaggerWebsocket;
            if (z2 || (CatchingFishCloudMessaging instanceof CatchingFishEspressoMVP)) {
                if (CatchingFishFragmentHandler(i, CatchingFishCloudMessaging, z ? CatchingFishWebSocketLayout.CatchingFishFragmentHandler : CatchingFishWebSocketLayout.CatchingFishCloudMessaging)) {
                    CatchingFishOkHttp(i, null);
                    CatchingFishEspressoTesting(i, !z);
                    if (z) {
                        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishPicassoCameraX);
                        return;
                    }
                    return;
                }
            } else {
                if (CatchingFishCloudMessaging == CatchingFishWebSocketLayout.CatchingFishFragmentHandler || CatchingFishCloudMessaging == CatchingFishWebSocketLayout.CatchingFishCloudMessaging) {
                    break;
                }
                if (CatchingFishCloudMessaging != CatchingFishWebSocketLayout.CatchingFishViewModelScope && CatchingFishCloudMessaging != CatchingFishWebSocketLayout.CatchingFishWorkManager) {
                    if (CatchingFishCloudMessaging == CatchingFishWebSocketLayout.CatchingFishLayout || CatchingFishCloudMessaging == CatchingFishWebSocketLayout.CatchingFishReduxKtor || CatchingFishCloudMessaging == CatchingFishWebSocketLayout.CatchingFishEspressoTesting) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + CatchingFishCloudMessaging).toString());
                }
            }
        }
    }

    @Override // kotlin.text.CatchingFishFluxSnackbar
    public final int CatchingFishWorkManager() {
        return CatchingFishWebSocketLayout.CatchingFishSnackbar;
    }
}
