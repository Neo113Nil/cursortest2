package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class CatchingFishBundleCardView extends CatchingFishJUnitRealm {
    public final /* synthetic */ int CatchingFishSnackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishBundleCardView(Unsafe unsafe, int i) {
        super(unsafe);
        this.CatchingFishSnackbar = i;
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishCloudMessaging(Object obj, long j, byte b) {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!CatchingFishGradleViewModel.CatchingFishViewModelScope) {
                    CatchingFishGradleViewModel.CatchingFishEspressoTesting(obj, j, b);
                    break;
                } else {
                    CatchingFishGradleViewModel.CatchingFishCloudMessaging(obj, j, b);
                    break;
                }
            default:
                if (!CatchingFishGradleViewModel.CatchingFishViewModelScope) {
                    CatchingFishGradleViewModel.CatchingFishEspressoTesting(obj, j, b);
                    break;
                } else {
                    CatchingFishGradleViewModel.CatchingFishCloudMessaging(obj, j, b);
                    break;
                }
        }
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final boolean CatchingFishCoroutine(long j, Object obj) {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!CatchingFishGradleViewModel.CatchingFishViewModelScope) {
                    break;
                } else {
                    break;
                }
            default:
                if (!CatchingFishGradleViewModel.CatchingFishViewModelScope) {
                    break;
                } else {
                    break;
                }
        }
        return CatchingFishGradleViewModel.CatchingFishCoroutine(j, obj);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final float CatchingFishDaggerWebsocket(long j, Object obj) {
        switch (this.CatchingFishSnackbar) {
        }
        return Float.intBitsToFloat(CatchingFishWorkManager(j, obj));
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishEspressoTesting(Object obj, long j, double d) {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishAnimationMockk(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                CatchingFishAnimationMockk(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishFragmentHandler(Object obj, long j, boolean z) {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!CatchingFishGradleViewModel.CatchingFishViewModelScope) {
                    CatchingFishGradleViewModel.CatchingFishEspressoTesting(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    CatchingFishGradleViewModel.CatchingFishCloudMessaging(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!CatchingFishGradleViewModel.CatchingFishViewModelScope) {
                    CatchingFishGradleViewModel.CatchingFishEspressoTesting(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    CatchingFishGradleViewModel.CatchingFishCloudMessaging(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final boolean CatchingFishNavigation() {
        switch (this.CatchingFishSnackbar) {
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishOkHttp(Object obj, long j, float f) {
        switch (this.CatchingFishSnackbar) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishUnitTesting(obj, j, Float.floatToIntBits(f));
                break;
            default:
                CatchingFishUnitTesting(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final double CatchingFishReduxKtor(long j, Object obj) {
        switch (this.CatchingFishSnackbar) {
        }
        return Double.longBitsToDouble(CatchingFishViewModelScope(j, obj));
    }
}
