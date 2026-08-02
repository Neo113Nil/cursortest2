package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class lla implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mla b;

    public /* synthetic */ lla(mla mlaVar, int i) {
        this.a = i;
        this.b = mlaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mla mlaVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(jla.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = mlaVar.requireActivity();
                requireActivity.getClass();
                return new fla(requireActivity);
            case 1:
                mla mlaVar2 = this.b;
                return new oda(mlaVar2.g.m(), mlaVar2.j);
            case 2:
                return new ila(new q04(1), new hla(this.b.x()));
            default:
                return new vla((ila) this.b.m.getValue(), new lnq());
        }
    }
}
