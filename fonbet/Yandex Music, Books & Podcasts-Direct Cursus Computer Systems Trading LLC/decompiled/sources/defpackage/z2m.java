package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class z2m {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public z2m(int i) {
        switch (i) {
            case 1:
                bdt I = hag.I(rvq.class);
                l18 l18Var = l18.b;
                this.a = l18Var.b(I, true);
                this.b = l18Var.b(hag.I(cce.class), true);
                this.c = btf.b(new nrq(5));
                break;
            default:
                bdt I2 = hag.I(nmj.class);
                l18 l18Var2 = l18.b;
                this.a = l18Var2.b(I2, true);
                this.b = l18Var2.b(hag.I(a2t.class), true);
                this.c = l18Var2.b(hag.I(jul.class), true);
                break;
        }
    }

    public z2m(jyr jyrVar) {
        this.a = jyrVar;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: jew
            public final /* synthetic */ z2m b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ufw((blw) this.b.a.getValue());
                    default:
                        ufw ufwVar = (ufw) this.b.b.getValue();
                        blw blwVar = ufwVar.a;
                        return new wlw((Context) blwVar.o.getValue(), (zzp) blwVar.p.getValue(), btf.b(new rfw(ufwVar, 0)), btf.b(new rfw(ufwVar, 1)), btf.b(new rfw(ufwVar, 2)));
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: jew
            public final /* synthetic */ z2m b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ufw((blw) this.b.a.getValue());
                    default:
                        ufw ufwVar = (ufw) this.b.b.getValue();
                        blw blwVar = ufwVar.a;
                        return new wlw((Context) blwVar.o.getValue(), (zzp) blwVar.p.getValue(), btf.b(new rfw(ufwVar, 0)), btf.b(new rfw(ufwVar, 1)), btf.b(new rfw(ufwVar, 2)));
                }
            }
        });
    }

    public z2m(l13 l13Var) {
        this.a = l13Var.b(hag.I(frt.class), true);
        this.b = btf.b(new h4d(l13Var, 13));
        this.c = l13Var.b(hag.I(g0l.class), true);
    }
}
