package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class wlw {
    public final Context a;
    public final zzp b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public wlw(Context context, zzp zzpVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        context.getClass();
        zzpVar.getClass();
        this.a = context;
        this.b = zzpVar;
        this.c = jyrVar;
        this.d = jyrVar2;
        this.e = jyrVar3;
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: ulw
            public final /* synthetic */ wlw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        vlw vlwVar = new vlw(this.b, 9);
                        diw diwVar = new diw();
                        if (diwVar.a != null) {
                            xq0.q("Di already initialized");
                            return null;
                        }
                        o18 o18Var = new o18();
                        o18Var.c = hag.I(diw.class);
                        rp7 rp7Var = o18Var.b;
                        rp7Var.getClass();
                        rp7Var.C(diwVar);
                        vlwVar.invoke(o18Var);
                        diwVar.a = new qdc(new ix6(o18Var.a));
                        return diwVar;
                    default:
                        diw b = this.b.b();
                        bdt I = hag.I(qfw.class);
                        qdc qdcVar = b.a;
                        qdcVar.getClass();
                        return (qfw) qdcVar.C(I);
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: ulw
            public final /* synthetic */ wlw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        vlw vlwVar = new vlw(this.b, 9);
                        diw diwVar = new diw();
                        if (diwVar.a != null) {
                            xq0.q("Di already initialized");
                            return null;
                        }
                        o18 o18Var = new o18();
                        o18Var.c = hag.I(diw.class);
                        rp7 rp7Var = o18Var.b;
                        rp7Var.getClass();
                        rp7Var.C(diwVar);
                        vlwVar.invoke(o18Var);
                        diwVar.a = new qdc(new ix6(o18Var.a));
                        return diwVar;
                    default:
                        diw b = this.b.b();
                        bdt I = hag.I(qfw.class);
                        qdc qdcVar = b.a;
                        qdcVar.getClass();
                        return (qfw) qdcVar.C(I);
                }
            }
        });
        btf.b(new c76(jyrVar3, 26));
    }

    public final tfw a() {
        return (tfw) this.e.getValue();
    }

    public final diw b() {
        return (diw) this.f.getValue();
    }
}
