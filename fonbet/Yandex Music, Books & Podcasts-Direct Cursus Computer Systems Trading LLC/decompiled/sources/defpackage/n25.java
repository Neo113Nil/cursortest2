package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class n25 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p25 b;

    public /* synthetic */ n25(p25 p25Var, int i) {
        this.a = i;
        this.b = p25Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                p25 p25Var = this.b;
                return new d35(p25Var.g.m(), p25Var.n);
            case 1:
                p25 p25Var2 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ibc.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = p25Var2.requireActivity();
                requireActivity.getClass();
                return ibc.a(requireActivity);
            default:
                p25 p25Var3 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(nwl.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                t requireActivity2 = p25Var3.requireActivity();
                requireActivity2.getClass();
                zh zhVar = p25Var3.j;
                zhVar.getClass();
                return new mwl(requireActivity2, zhVar);
        }
    }
}
