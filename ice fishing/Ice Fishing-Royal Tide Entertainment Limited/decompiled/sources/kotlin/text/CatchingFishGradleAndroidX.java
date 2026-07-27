package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishGradleAndroidX extends CatchingFishPayPalLifecycle {
    public final /* synthetic */ int CatchingFishDaggerWebsocket = 0;
    public final Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGradleAndroidX(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, CatchingFishViewModelDagger catchingFishViewModelDagger) {
        super("OkHttp %s", catchingFishSharedFlowMoshi.CatchingFishViewModelScope);
        this.CatchingFishWorkManager = catchingFishSharedFlowMoshi;
        this.CatchingFishViewModelScope = catchingFishViewModelDagger;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        int i;
        CatchingFishPayPalMVI[] catchingFishPayPalMVIArr;
        long j;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishPayPalMVI catchingFishPayPalMVI = (CatchingFishPayPalMVI) this.CatchingFishViewModelScope;
                CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = (CatchingFishSharedFlowMoshi) ((CatchingFishGradleAndroidX) this.CatchingFishWorkManager).CatchingFishWorkManager;
                try {
                    catchingFishSharedFlowMoshi.CatchingFishDaggerWebsocket.CatchingFishSnackbar(catchingFishPayPalMVI);
                    return;
                } catch (IOException e) {
                    CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishOkHttp(4, "Http2Connection.Listener failure for " + catchingFishSharedFlowMoshi.CatchingFishViewModelScope, e);
                    try {
                        catchingFishPayPalMVI.CatchingFishCoroutine(2, e);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                CatchingFishGradleAndroidX catchingFishGradleAndroidX = (CatchingFishGradleAndroidX) this.CatchingFishWorkManager;
                CatchingFishWidgetToolbar catchingFishWidgetToolbar = (CatchingFishWidgetToolbar) this.CatchingFishViewModelScope;
                synchronized (((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishSpannableWidget) {
                    synchronized (((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager)) {
                        try {
                            int CatchingFishParcelableFAB = ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishCoroutineFlow.CatchingFishParcelableFAB();
                            CatchingFishWidgetToolbar catchingFishWidgetToolbar2 = ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishCoroutineFlow;
                            catchingFishWidgetToolbar2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                boolean z = true;
                                if (((1 << i2) & catchingFishWidgetToolbar.CatchingFishSnackbar) == 0) {
                                    z = false;
                                }
                                if (z) {
                                    catchingFishWidgetToolbar2.CatchingFishViewModelFAB(i2, catchingFishWidgetToolbar.CatchingFishParcelableFAB[i2]);
                                }
                            }
                            int CatchingFishParcelableFAB2 = ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishCoroutineFlow.CatchingFishParcelableFAB();
                            catchingFishPayPalMVIArr = null;
                            if (CatchingFishParcelableFAB2 == -1 || CatchingFishParcelableFAB2 == CatchingFishParcelableFAB) {
                                j = 0;
                            } else {
                                j = CatchingFishParcelableFAB2 - CatchingFishParcelableFAB;
                                if (!((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishWorkManager.isEmpty()) {
                                    catchingFishPayPalMVIArr = (CatchingFishPayPalMVI[]) ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishWorkManager.values().toArray(new CatchingFishPayPalMVI[((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishWorkManager.size()]);
                                }
                            }
                        } finally {
                        }
                    }
                    try {
                        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi2 = (CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager;
                        catchingFishSharedFlowMoshi2.CatchingFishSpannableWidget.CatchingFishSnackbar(catchingFishSharedFlowMoshi2.CatchingFishCoroutineFlow);
                    } catch (IOException e2) {
                        ((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishSnackbar(2, 2, e2);
                    }
                }
                if (catchingFishPayPalMVIArr != null) {
                    for (CatchingFishPayPalMVI catchingFishPayPalMVI2 : catchingFishPayPalMVIArr) {
                        synchronized (catchingFishPayPalMVI2) {
                            catchingFishPayPalMVI2.CatchingFishSnackbar += j;
                            if (j > 0) {
                                catchingFishPayPalMVI2.notifyAll();
                            }
                        }
                    }
                }
                CatchingFishSharedFlowMoshi.CatchingFishCardViewRealm.execute(new CatchingFishRealmPayPal(catchingFishGradleAndroidX, new Object[]{((CatchingFishSharedFlowMoshi) catchingFishGradleAndroidX.CatchingFishWorkManager).CatchingFishViewModelScope}));
                return;
            default:
                CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi3 = (CatchingFishSharedFlowMoshi) this.CatchingFishWorkManager;
                CatchingFishViewModelDagger catchingFishViewModelDagger = (CatchingFishViewModelDagger) this.CatchingFishViewModelScope;
                try {
                    catchingFishViewModelDagger.CatchingFishReduxKtor(this);
                    do {
                    } while (catchingFishViewModelDagger.CatchingFishCoroutine(false, this));
                    catchingFishSharedFlowMoshi3.CatchingFishSnackbar(1, 6, null);
                } catch (IOException e3) {
                    catchingFishSharedFlowMoshi3.CatchingFishSnackbar(2, 2, e3);
                } catch (Throwable th) {
                    catchingFishSharedFlowMoshi3.CatchingFishSnackbar(3, 3, null);
                    CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishViewModelDagger);
                    throw th;
                }
                CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishViewModelDagger);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGradleAndroidX(CatchingFishGradleAndroidX catchingFishGradleAndroidX, Object[] objArr, CatchingFishPayPalMVI catchingFishPayPalMVI) {
        super("OkHttp %s stream %d", objArr);
        this.CatchingFishWorkManager = catchingFishGradleAndroidX;
        this.CatchingFishViewModelScope = catchingFishPayPalMVI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishGradleAndroidX(CatchingFishGradleAndroidX catchingFishGradleAndroidX, Object[] objArr, CatchingFishWidgetToolbar catchingFishWidgetToolbar) {
        super("OkHttp %s ACK Settings", objArr);
        this.CatchingFishWorkManager = catchingFishGradleAndroidX;
        this.CatchingFishViewModelScope = catchingFishWidgetToolbar;
    }
}
