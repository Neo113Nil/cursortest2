package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class fz4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz4 b;

    public /* synthetic */ fz4(hz4 hz4Var, int i) {
        this.a = i;
        this.b = hz4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                hz4 hz4Var = this.b;
                bz4 bz4Var = new bz4(hz4Var.g.m(), hz4Var.k, hz4Var.x(), hz4Var.l);
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                uvf uvfVar = bz4Var.c;
                hnq hnqVar = hnq.a;
                uvfVar.getClass();
                return new cz4(new xiu(13, new cjf("collection", upqVar, uvfVar, null, hnqVar, null), new xh1()), bz4Var);
            case 1:
                hz4 hz4Var2 = this.b;
                return new yz4((cz4) hz4Var2.m.getValue(), hz4Var2.g.m(), hz4Var2.k, new lnq());
            default:
                hz4 hz4Var3 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(t35.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                ikg a = ((t35) qdcVar2.C(I2)).a();
                bdt I3 = hag.I(dz4.class);
                qdc qdcVar3 = a.a;
                qdcVar3.getClass();
                t requireActivity = hz4Var3.requireActivity();
                requireActivity.getClass();
                return new yy4(requireActivity);
        }
    }
}
