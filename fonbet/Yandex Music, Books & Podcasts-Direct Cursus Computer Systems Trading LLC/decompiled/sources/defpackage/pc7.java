package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class pc7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sml b;

    public /* synthetic */ pc7(sml smlVar, int i) {
        this.a = i;
        this.b = smlVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [m9w] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                Context context = (Context) qdcVar.D(I, l13Var, set);
                final sml smlVar = this.b;
                smlVar.getClass();
                return new mc7(context, new gwc(1), new l9w(), new p5c() { // from class: m9w
                    @Override // defpackage.p5c
                    public final String a() {
                        return (String) ((r9w) sml.this.a).invoke();
                    }
                }, new pej(), new o9w(), new e1n(btf.b(new nxv(24))));
            default:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(mc7.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new pc7(this.b, 0));
                o18Var.c = hag.I(i5h.class);
                rp7Var.getClass();
                rp7Var.E(new san(16));
                o18Var.c = hag.I(dst.class);
                rp7Var.getClass();
                rp7Var.E(new san(17));
                o18Var.c = hag.I(o3t.class);
                rp7Var.getClass();
                rp7Var.E(new san(18));
                o18Var.c = hag.I(p5l.class);
                rp7Var.getClass();
                rp7Var.E(new san(19));
                o18Var.c = hag.I(w62.class);
                rp7Var.getClass();
                rp7Var.E(new san(20));
                o18Var.c = hag.I(z2b.class);
                rp7Var.getClass();
                rp7Var.E(new san(21));
                o18Var.c = hag.I(a20.class);
                rp7Var.getClass();
                rp7Var.E(new san(22));
                o18Var.c = hag.I(d2l.class);
                rp7Var.getClass();
                rp7Var.E(new san(23));
                o18Var.c = hag.I(uou.class);
                rp7Var.getClass();
                rp7Var.E(new san(24));
                o18Var.c = hag.I(oou.class);
                rp7Var.getClass();
                rp7Var.E(new rn6(24));
                o18Var.c = hag.I(cst.class);
                rp7Var.getClass();
                rp7Var.E(new san(14));
                o18Var.c = hag.I(nc7.class);
                rp7Var.getClass();
                rp7Var.E(new san(15));
                return Unit.a;
        }
    }
}
