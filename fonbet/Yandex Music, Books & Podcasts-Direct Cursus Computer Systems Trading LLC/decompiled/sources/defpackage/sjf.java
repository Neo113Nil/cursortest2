package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class sjf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tjf b;

    public /* synthetic */ sjf(tjf tjfVar, int i) {
        this.a = i;
        this.b = tjfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new sor(((lwc) this.b.l.getValue()).k);
            case 1:
                ((yjf) this.b.e.getValue()).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(k1l.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (k1l) qdcVar.C(I);
            default:
                SharedPreferences.Editor edit = ((pst) ((jyr) this.b.r.c).getValue()).edit();
                edit.putBoolean("smart_radio_block_wizard_skipped", true);
                edit.apply();
                ot0.A(dhn.b.e(), "RadioSmartBlock_WizardAlert_Closed", null);
                return Unit.a;
        }
    }
}
