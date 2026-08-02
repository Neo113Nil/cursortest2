package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class h7v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7v b;

    public /* synthetic */ h7v(i7v i7vVar, int i) {
        this.a = i;
        this.b = i7vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new g8v((e0j) this.b.b.e);
            case 1:
                ((l13) obj).getClass();
                d18 d18Var = this.b.b;
                return new v8v((frt) d18Var.f, (cc7) d18Var.g, d18Var.a);
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(g8v.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                g8v g8vVar = (g8v) qdcVar.D(I, l13Var, set);
                v8v v8vVar = (v8v) qdcVar.D(hag.I(v8v.class), l13Var, set);
                d18 d18Var2 = this.b.b;
                return new z6v((oq7) d18Var2.d, (z66) d18Var2.c, g8vVar, v8vVar, (vdr) d18Var2.b, (rw5) d18Var2.h);
            default:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(g8v.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                i7v i7vVar = this.b;
                rp7Var.E(new h7v(i7vVar, 0));
                o18Var.c = hag.I(v8v.class);
                rp7Var.getClass();
                rp7Var.E(new h7v(i7vVar, 1));
                o18Var.c = hag.I(z6v.class);
                rp7Var.getClass();
                rp7Var.E(new h7v(i7vVar, 2));
                return Unit.a;
        }
    }
}
