package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class wz3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupSetupFragment b;

    public /* synthetic */ wz3(AutoTopupSetupFragment autoTopupSetupFragment, int i) {
        this.a = i;
        this.b = autoTopupSetupFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AutoTopupSetupFragment autoTopupSetupFragment = this.b;
        switch (i) {
            case 0:
                AutoTopupSetupFragment.renderBottomSheet$lambda$46$lambda$43(autoTopupSetupFragment, view);
                break;
            case 1:
                AutoTopupSetupFragment.renderBottomSheet$lambda$46$lambda$44(autoTopupSetupFragment, view);
                break;
            case 2:
                AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$22(autoTopupSetupFragment, view);
                break;
            case 3:
                AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$23(autoTopupSetupFragment, view);
                break;
            case 4:
                AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$24(autoTopupSetupFragment, view);
                break;
            default:
                AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$12(autoTopupSetupFragment, view);
                break;
        }
    }
}
