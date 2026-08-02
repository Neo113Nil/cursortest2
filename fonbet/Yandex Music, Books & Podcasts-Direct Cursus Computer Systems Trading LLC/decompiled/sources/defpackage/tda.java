package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class tda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vda b;

    public /* synthetic */ tda(vda vdaVar, int i) {
        this.a = i;
        this.b = vdaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new aea(this.b.j);
            case 1:
                vda vdaVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ibc.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = vdaVar.requireActivity();
                requireActivity.getClass();
                return ibc.a(requireActivity);
            case 2:
                vda vdaVar2 = this.b;
                zx4 zx4Var = (zx4) vdaVar2.n.getValue();
                t requireActivity2 = vdaVar2.requireActivity();
                requireActivity2.getClass();
                zx4Var.getClass();
                return new sda(requireActivity2);
            default:
                ((zx4) this.b.n.getValue()).getClass();
                return new cga();
        }
    }
}
