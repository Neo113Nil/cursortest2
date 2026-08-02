package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final /* synthetic */ class uz3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u14 b;

    public /* synthetic */ uz3(u14 u14Var, int i) {
        this.a = i;
        this.b = u14Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ahq0 render$lambda$31$lambda$30$lambda$28;
        YbButtonViewGroup.b render$lambda$31$lambda$30$lambda$29;
        j5x0 renderAutoTopup$lambda$33$lambda$32;
        int i = this.a;
        u14 u14Var = this.b;
        switch (i) {
            case 0:
                render$lambda$31$lambda$30$lambda$28 = AutoTopupSetupFragment.render$lambda$31$lambda$30$lambda$28(u14Var, (ahq0) obj);
                return render$lambda$31$lambda$30$lambda$28;
            case 1:
                render$lambda$31$lambda$30$lambda$29 = AutoTopupSetupFragment.render$lambda$31$lambda$30$lambda$29(u14Var, (YbButtonViewGroup.b) obj);
                return render$lambda$31$lambda$30$lambda$29;
            default:
                renderAutoTopup$lambda$33$lambda$32 = AutoTopupSetupFragment.renderAutoTopup$lambda$33$lambda$32(u14Var, (j5x0) obj);
                return renderAutoTopup$lambda$33$lambda$32;
        }
    }
}
