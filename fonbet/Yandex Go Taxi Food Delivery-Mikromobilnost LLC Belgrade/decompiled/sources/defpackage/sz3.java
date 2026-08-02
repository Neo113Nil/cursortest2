package defpackage;

import android.text.Editable;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class sz3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupSetupFragment b;

    public /* synthetic */ sz3(AutoTopupSetupFragment autoTopupSetupFragment, int i) {
        this.a = i;
        this.b = autoTopupSetupFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$25$lambda$14;
        zy11 viewBinding$lambda$4$lambda$0;
        zy11 viewBinding$lambda$4$lambda$1;
        zy11 viewBinding$lambda$4$lambda$2;
        zy11 viewBinding$lambda$4$lambda$3;
        zy11 renderBottomSheet$lambda$46$lambda$45;
        zy11 onViewCreated$lambda$25$lambda$21;
        int i = this.a;
        AutoTopupSetupFragment autoTopupSetupFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$25$lambda$14 = AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$14(autoTopupSetupFragment, (String) obj);
                return onViewCreated$lambda$25$lambda$14;
            case 1:
                viewBinding$lambda$4$lambda$0 = AutoTopupSetupFragment.getViewBinding$lambda$4$lambda$0(autoTopupSetupFragment, (k5x0) obj);
                return viewBinding$lambda$4$lambda$0;
            case 2:
                viewBinding$lambda$4$lambda$1 = AutoTopupSetupFragment.getViewBinding$lambda$4$lambda$1(autoTopupSetupFragment, (Editable) obj);
                return viewBinding$lambda$4$lambda$1;
            case 3:
                viewBinding$lambda$4$lambda$2 = AutoTopupSetupFragment.getViewBinding$lambda$4$lambda$2(autoTopupSetupFragment, (Editable) obj);
                return viewBinding$lambda$4$lambda$2;
            case 4:
                viewBinding$lambda$4$lambda$3 = AutoTopupSetupFragment.getViewBinding$lambda$4$lambda$3(autoTopupSetupFragment, (Editable) obj);
                return viewBinding$lambda$4$lambda$3;
            case 5:
                renderBottomSheet$lambda$46$lambda$45 = AutoTopupSetupFragment.renderBottomSheet$lambda$46$lambda$45(autoTopupSetupFragment, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$46$lambda$45;
            default:
                onViewCreated$lambda$25$lambda$21 = AutoTopupSetupFragment.onViewCreated$lambda$25$lambda$21(autoTopupSetupFragment, (String) obj);
                return onViewCreated$lambda$25$lambda$21;
        }
    }
}
