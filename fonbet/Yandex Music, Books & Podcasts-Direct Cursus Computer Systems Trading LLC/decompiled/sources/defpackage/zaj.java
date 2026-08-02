package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class zaj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bbj b;

    public /* synthetic */ zaj(bbj bbjVar, int i) {
        this.a = i;
        this.b = bbjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bbj bbjVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                bz4 bz4Var = new bz4(bbjVar.d(), bbjVar.p, bbjVar.x());
                Bundle arguments = bbjVar.getArguments();
                fbj fbjVar = arguments != null ? (fbj) arguments.getSerializable("landing.skeleton.id") : null;
                String str = fbjVar != null ? fbjVar.a : "non_music";
                String str2 = fbjVar != null ? fbjVar.a : "non_music";
                spq spqVar = upqVar.b;
                spq a = spqVar != null ? spq.a(spqVar, false, null, 123) : null;
                uvf uvfVar = (uvf) bz4Var.e;
                hnq hnqVar = hnq.a;
                uvfVar.getClass();
                return new uoq(str, null, null, new cjf(str2, upqVar, uvfVar, null, hnqVar, a), bz4Var);
            case 1:
                uoq uoqVar = (uoq) this.b.k.getValue();
                lnq lnqVar = new lnq();
                uoqVar.getClass();
                return new gpq(uoqVar, lnqVar);
            default:
                bbj bbjVar2 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(xaj.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                Context requireContext = bbjVar2.requireContext();
                requireContext.getClass();
                return new waj(requireContext, bbjVar2.requireActivity());
        }
    }
}
