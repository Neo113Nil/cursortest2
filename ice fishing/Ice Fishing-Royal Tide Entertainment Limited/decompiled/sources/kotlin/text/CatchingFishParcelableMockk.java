package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class CatchingFishParcelableMockk extends CatchingFishHiltMVPToast {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final SideSheetBehavior CatchingFishSnackbar;

    public /* synthetic */ CatchingFishParcelableMockk(SideSheetBehavior sideSheetBehavior, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = sideSheetBehavior;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFish(View view) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.getRight() + this.CatchingFishSnackbar.CatchingFishAnimationMockk;
            default:
                return view.getLeft() - this.CatchingFishSnackbar.CatchingFishAnimationMockk;
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishAnimationMockk() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.CatchingFishSnackbar;
                return (-sideSheetBehavior.CatchingFishEspressoTesting) - sideSheetBehavior.CatchingFishAnimationMockk;
            default:
                return this.CatchingFishSnackbar.CatchingFishOkHttp;
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final void CatchingFishAppCompat(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= this.CatchingFishSnackbar.CatchingFishOkHttp) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.CatchingFishSnackbar.CatchingFishOkHttp;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final boolean CatchingFishCardViewRealm(View view) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (view.getRight() < (CatchingFishUnitTesting() - CatchingFishAnimationMockk()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (CatchingFishUnitTesting() + this.CatchingFishSnackbar.CatchingFishOkHttp) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final float CatchingFishCoroutine(int i) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float CatchingFishAnimationMockk = CatchingFishAnimationMockk();
                return (i - CatchingFishAnimationMockk) / (CatchingFishUnitTesting() - CatchingFishAnimationMockk);
            default:
                float f = this.CatchingFishSnackbar.CatchingFishOkHttp;
                return (f - i) / (f - CatchingFishUnitTesting());
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishCoroutineFlow() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 1;
            default:
                return 0;
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final boolean CatchingFishDagger(View view, float f) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.CatchingFishSnackbar;
                float abs = Math.abs((f * sideSheetBehavior.CatchingFishCloudMessaging) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.CatchingFishSnackbar;
                float abs2 = Math.abs((f * sideSheetBehavior2.CatchingFishCloudMessaging) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishJetpackCompose(CoordinatorLayout coordinatorLayout) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishNavigation() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return -this.CatchingFishSnackbar.CatchingFishEspressoTesting;
            default:
                return CatchingFishUnitTesting();
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final boolean CatchingFishParcelableFlux(float f) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final boolean CatchingFishPayPal(float f, float f2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishRoomDatabase() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.CatchingFishSnackbar.CatchingFishAnimationMockk;
            default:
                return this.CatchingFishSnackbar.CatchingFishOkHttp;
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishSnackbar(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // kotlin.text.CatchingFishHiltMVPToast
    public final int CatchingFishUnitTesting() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.CatchingFishSnackbar;
                return Math.max(0, sideSheetBehavior.CatchingFishUnitTesting + sideSheetBehavior.CatchingFishAnimationMockk);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.CatchingFishSnackbar;
                return Math.max(0, (sideSheetBehavior2.CatchingFishOkHttp - sideSheetBehavior2.CatchingFishEspressoTesting) - sideSheetBehavior2.CatchingFishAnimationMockk);
        }
    }
}
