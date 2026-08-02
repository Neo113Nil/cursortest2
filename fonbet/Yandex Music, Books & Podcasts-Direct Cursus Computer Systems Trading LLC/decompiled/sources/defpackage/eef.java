package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class eef implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gef b;

    public /* synthetic */ eef(gef gefVar, int i) {
        this.a = i;
        this.b = gefVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                gef gefVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                hla hlaVar = new hla(gefVar.d(), gefVar.p, gefVar.x());
                spq spqVar = upqVar.b;
                spq a = spqVar != null ? spq.a(spqVar, false, null, 123) : null;
                uvf uvfVar = (uvf) hlaVar.d;
                hnq hnqVar = hnq.a;
                uvfVar.getClass();
                return new uoq("kids", null, null, new cjf("kids", upqVar, uvfVar, null, hnqVar, a), hlaVar);
            case 1:
                uoq uoqVar = (uoq) this.b.k.getValue();
                lnq lnqVar = new lnq();
                uoqVar.getClass();
                return new gpq(uoqVar, lnqVar);
            default:
                gef gefVar2 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(cef.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                t requireActivity = gefVar2.requireActivity();
                requireActivity.getClass();
                return new bef(requireActivity);
        }
    }
}
