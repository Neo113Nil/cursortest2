package defpackage;

import android.view.animation.Interpolator;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class t921 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ UpgradeEditFragment b;

    public /* synthetic */ t921(UpgradeEditFragment upgradeEditFragment, int i) {
        this.a = i;
        this.b = upgradeEditFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 bindViews$lambda$17$lambda$15;
        s921 upgradeComponent_delegate$lambda$0;
        Interpolator defaultInterpolator_delegate$lambda$1;
        int i = this.a;
        UpgradeEditFragment upgradeEditFragment = this.b;
        switch (i) {
            case 0:
                bindViews$lambda$17$lambda$15 = UpgradeEditFragment.bindViews$lambda$17$lambda$15(upgradeEditFragment);
                return bindViews$lambda$17$lambda$15;
            case 1:
                upgradeComponent_delegate$lambda$0 = UpgradeEditFragment.upgradeComponent_delegate$lambda$0(upgradeEditFragment);
                return upgradeComponent_delegate$lambda$0;
            default:
                defaultInterpolator_delegate$lambda$1 = UpgradeEditFragment.defaultInterpolator_delegate$lambda$1(upgradeEditFragment);
                return defaultInterpolator_delegate$lambda$1;
        }
    }
}
