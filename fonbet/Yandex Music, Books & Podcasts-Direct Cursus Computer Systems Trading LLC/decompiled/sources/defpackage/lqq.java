package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class lqq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nqq b;

    public /* synthetic */ lqq(nqq nqqVar, int i) {
        this.a = i;
        this.b = nqqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                nqq nqqVar = this.b;
                dqq A = nqqVar.A();
                eqq eqqVar = new eqq(new jnq(nqqVar.g.m(), nqqVar.getO()), nqqVar.x());
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                String str = A.a;
                String str2 = A.b;
                String str3 = A.c;
                spq spqVar = upqVar.b;
                spq a = spqVar != null ? spq.a(spqVar, false, null, 123) : null;
                hnq hnqVar = hnq.a;
                str.getClass();
                return new uoq(str, str2, str3, new cjf(str, upqVar, eqqVar, null, hnqVar, a), eqqVar);
            case 1:
                return new cvo(wjb.DynamicScreen, hlb.Fullscreen, (glb) null, new dvo(this.b.A().a), (avo) null, 52);
            case 2:
                uoq uoqVar = (uoq) this.b.k.getValue();
                lnq lnqVar = new lnq();
                uoqVar.getClass();
                return new gpq(uoqVar, lnqVar);
            default:
                nqq nqqVar2 = this.b;
                jqq jqqVar = (jqq) nqqVar2.n.getValue();
                t requireActivity = nqqVar2.requireActivity();
                requireActivity.getClass();
                jqqVar.getClass();
                return new iqq(requireActivity);
        }
    }
}
