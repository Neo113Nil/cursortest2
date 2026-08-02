package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class akl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf6 b;

    public /* synthetic */ akl(tf6 tf6Var, int i) {
        this.a = i;
        this.b = tf6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                tf6 tf6Var = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(lll.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                u12 u12Var = ((lll) qdcVar.C(I)).a;
                return new tll((n3h) u12Var.a.getValue(), (oq7) u12Var.b.getValue(), (kcl) u12Var.d.getValue(), (z66) u12Var.c.getValue(), tf6Var);
            case 1:
                return new gk2(7, this.b);
            default:
                return new ztn(this.b);
        }
    }
}
