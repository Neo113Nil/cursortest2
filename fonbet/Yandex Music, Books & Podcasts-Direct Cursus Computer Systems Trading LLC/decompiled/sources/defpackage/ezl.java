package defpackage;

import android.content.Intent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ezl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gzl b;

    public /* synthetic */ ezl(gzl gzlVar, int i) {
        this.a = i;
        this.b = gzlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new zxl(new qdc(this.b));
            default:
                gzl gzlVar = this.b;
                exl A = gzlVar.A();
                Intent intent = gzlVar.requireActivity().getIntent();
                intent.getClass();
                kxi d = gzlVar.d();
                tmb tmbVar = (tmb) ((zxl) gzlVar.j.getValue()).b.getValue();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new n0m(A, d, tmbVar, intent, ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h());
        }
    }
}
