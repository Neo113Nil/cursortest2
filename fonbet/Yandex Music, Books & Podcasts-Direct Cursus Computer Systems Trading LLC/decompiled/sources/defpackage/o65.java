package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class o65 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p65 b;

    public /* synthetic */ o65(p65 p65Var, int i) {
        this.a = i;
        this.b = p65Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                e00 e00Var = this.b.k.a;
                e00Var.getClass();
                bdt I = hag.I(frt.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                frt frtVar = (frt) qdcVar.C(I);
                bdt I2 = hag.I(p3u.class);
                qdc qdcVar2 = e00Var.a;
                qdcVar2.getClass();
                p3u p3uVar = (p3u) qdcVar2.C(I2);
                bdt I3 = hag.I(a65.class);
                qdc qdcVar3 = e00Var.a;
                qdcVar3.getClass();
                a65 a65Var = (a65) qdcVar3.C(I3);
                bdt I4 = hag.I(jrk.class);
                qdc qdcVar4 = e00Var.a;
                qdcVar4.getClass();
                return new u65(frtVar, p3uVar, a65Var, (jrk) qdcVar4.C(I4));
            default:
                p65 p65Var = this.b;
                c65 c65Var = p65Var.k;
                t requireActivity = p65Var.requireActivity();
                requireActivity.getClass();
                y childFragmentManager = p65Var.getChildFragmentManager();
                childFragmentManager.getClass();
                gs4 i0 = wdp.i0(p65Var);
                kxi d = p65Var.d();
                c65Var.getClass();
                c65Var.a.getClass();
                return new b65(requireActivity, childFragmentManager, i0, d);
        }
    }
}
