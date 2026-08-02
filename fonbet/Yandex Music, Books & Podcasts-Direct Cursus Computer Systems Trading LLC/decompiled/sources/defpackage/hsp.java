package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class hsp {
    public final cvo a;
    public final fnb b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public hsp(fnb fnbVar, cvo cvoVar) {
        cvoVar.getClass();
        this.a = cvoVar;
        this.b = fnbVar;
        this.c = btf.b(new qkp(14));
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: gsp
            public final /* synthetic */ hsp b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        hsp hspVar = this.b;
                        return new tnb(hspVar.a, hspVar.b, hspVar.c, 24);
                    default:
                        hsp hspVar2 = this.b;
                        return new vnb(hspVar2.b, hspVar2.a.a, hspVar2.c);
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: gsp
            public final /* synthetic */ hsp b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        hsp hspVar = this.b;
                        return new tnb(hspVar.a, hspVar.b, hspVar.c, 24);
                    default:
                        hsp hspVar2 = this.b;
                        return new vnb(hspVar2.b, hspVar2.a.a, hspVar2.c);
                }
            }
        });
    }

    public final tnb a() {
        return (tnb) this.d.getValue();
    }

    public final vnb b() {
        return (vnb) this.e.getValue();
    }
}
