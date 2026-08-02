package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class m8v {
    public final tf6 a;
    public final frt b;
    public final jyr g;
    public final jyr k;
    public final jyr c = btf.b(new h8v(0));
    public final jyr d = btf.b(new h8v(1));
    public final jyr e = btf.b(new h8v(2));
    public final jyr f = btf.b(new h8v(3));
    public final jyr h = btf.b(new h8v(4));
    public final jyr i = btf.b(new h8v(5));
    public final jyr j = btf.b(new h8v(6));

    public m8v(tf6 tf6Var, frt frtVar) {
        this.a = tf6Var;
        this.b = frtVar;
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: i8v
            public final /* synthetic */ m8v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                m8v m8vVar = this.b;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        return lg3.u0(zsd.b0(new l8v(m8vVar.b.j(), m8vVar, i3)), m8vVar.a, new w8v(false));
                    default:
                        vdr vdrVar = (vdr) m8vVar.g.getValue();
                        vdr vdrVar2 = (vdr) m8vVar.c.getValue();
                        vdr vdrVar3 = (vdr) m8vVar.d.getValue();
                        vdr vdrVar4 = (vdr) m8vVar.e.getValue();
                        vdr vdrVar5 = (vdr) m8vVar.f.getValue();
                        vdr vdrVar6 = (vdr) m8vVar.h.getValue();
                        vdr vdrVar7 = (vdr) m8vVar.i.getValue();
                        vdr vdrVar8 = (vdr) m8vVar.j.getValue();
                        j8v j8vVar = new j8v(m8vVar, null);
                        vdrVar.getClass();
                        vdrVar2.getClass();
                        vdrVar3.getClass();
                        vdrVar4.getClass();
                        vdrVar5.getClass();
                        vdrVar6.getClass();
                        vdrVar7.getClass();
                        vdrVar8.getClass();
                        return lg3.u0(new ub7(17, new pjc[]{vdrVar, vdrVar2, vdrVar3, vdrVar4, vdrVar5, vdrVar6, vdrVar7, vdrVar8}, j8vVar), m8vVar.a, m8v.a(m8vVar));
                }
            }
        });
        final int i2 = 1;
        this.k = btf.b(new Function0(this) { // from class: i8v
            public final /* synthetic */ m8v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                m8v m8vVar = this.b;
                int i3 = 0;
                switch (i22) {
                    case 0:
                        return lg3.u0(zsd.b0(new l8v(m8vVar.b.j(), m8vVar, i3)), m8vVar.a, new w8v(false));
                    default:
                        vdr vdrVar = (vdr) m8vVar.g.getValue();
                        vdr vdrVar2 = (vdr) m8vVar.c.getValue();
                        vdr vdrVar3 = (vdr) m8vVar.d.getValue();
                        vdr vdrVar4 = (vdr) m8vVar.e.getValue();
                        vdr vdrVar5 = (vdr) m8vVar.f.getValue();
                        vdr vdrVar6 = (vdr) m8vVar.h.getValue();
                        vdr vdrVar7 = (vdr) m8vVar.i.getValue();
                        vdr vdrVar8 = (vdr) m8vVar.j.getValue();
                        j8v j8vVar = new j8v(m8vVar, null);
                        vdrVar.getClass();
                        vdrVar2.getClass();
                        vdrVar3.getClass();
                        vdrVar4.getClass();
                        vdrVar5.getClass();
                        vdrVar6.getClass();
                        vdrVar7.getClass();
                        vdrVar8.getClass();
                        return lg3.u0(new ub7(17, new pjc[]{vdrVar, vdrVar2, vdrVar3, vdrVar4, vdrVar5, vdrVar6, vdrVar7, vdrVar8}, j8vVar), m8vVar.a, m8v.a(m8vVar));
                }
            }
        });
    }

    public static a7v a(m8v m8vVar) {
        return new a7v((j7v) ((vdr) m8vVar.c.getValue()).getValue(), (w8v) ((vdr) m8vVar.g.getValue()).getValue(), (n8v) ((vdr) m8vVar.f.getValue()).getValue(), ((Boolean) ((vdr) m8vVar.d.getValue()).getValue()).booleanValue(), ((Boolean) ((vdr) m8vVar.e.getValue()).getValue()).booleanValue(), ((Boolean) ((vdr) m8vVar.h.getValue()).getValue()).booleanValue(), ((Boolean) ((vdr) m8vVar.i.getValue()).getValue()).booleanValue(), ((Boolean) ((vdr) m8vVar.j.getValue()).getValue()).booleanValue());
    }
}
