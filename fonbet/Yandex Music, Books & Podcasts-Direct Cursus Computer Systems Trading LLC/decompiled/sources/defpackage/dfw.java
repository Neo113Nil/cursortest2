package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class dfw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qfw b;

    public /* synthetic */ dfw(qfw qfwVar, int i) {
        this.a = i;
        this.b = qfwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qfw qfwVar = this.b;
                xfw xfwVar = (xfw) qfwVar.l.getValue();
                Context context = (Context) qfwVar.g.getValue();
                biw biwVar = ((jsw) qfwVar.s.getValue()).d;
                ffw[] ffwVarArr = ffw.a;
                ((wfw) qfwVar.h.getValue()).getClass();
                int i = 12;
                int i2 = 1;
                hgp hgpVar = new hgp(new dfw(qfwVar, 9), new dfw(qfwVar, 10), new dfw(qfwVar, 11), new dfw(qfwVar, i), new efw(qfwVar, 0), new efw(qfwVar, i2), new dfw(qfwVar, i2), new dfw(qfwVar, 2), new dfw(qfwVar, 3));
                nfw nfwVar = new nfw(((ndw) qfwVar.q.getValue()).a);
                ifw ifwVar = (ifw) qfwVar.t.getValue();
                ydw ydwVar = (ydw) qfwVar.p.getValue();
                jyr jyrVar = qfwVar.n;
                y8p y8pVar = ((bew) jyrVar.getValue()).c;
                dgw dgwVar = (dgw) qfwVar.w.getValue();
                anw anwVar = (anw) qfwVar.u.getValue();
                hnw hnwVar = (hnw) qfwVar.v.getValue();
                vtm vtmVar = ((bew) jyrVar.getValue()).d;
                elw elwVar = (elw) qfwVar.o.getValue();
                vy7 vy7Var = ((bew) jyrVar.getValue()).b;
                xfwVar.getClass();
                context.getClass();
                ydwVar.getClass();
                y8pVar.getClass();
                anwVar.getClass();
                dgwVar.getClass();
                hnwVar.getClass();
                vtmVar.getClass();
                elwVar.getClass();
                ifwVar.getClass();
                vy7Var.getClass();
                cr crVar = new cr(hgpVar, context, nfwVar, ydwVar, y8pVar, vy7Var, anwVar, dgwVar, hnwVar, vtmVar, elwVar, ifwVar);
                uiq uiqVar = new uiq(15, (byte) 0);
                rn5 rn5Var = new rn5(hgpVar, nfwVar, ydwVar, dgwVar, anwVar, hnwVar, ifwVar);
                jyr b = btf.b(new hav(14, uiqVar, crVar));
                return new xhw(context, hgpVar, vtmVar, elwVar, uiqVar, new kqn(new qqn(new yks(i, (dd4) ((jyr) crVar.i).getValue(), uiqVar, dgwVar)), vtmVar), new u13(22, crVar, rn5Var, b), rn5Var, b);
            case 1:
                this.b.b().getClass();
                return Boolean.valueOf(rgw.b());
            case 2:
                this.b.b().getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return Boolean.valueOf(((lhw) ((byb) qdcVar.C(I)).b(lhw.class)).h());
            case 3:
                this.b.b().getClass();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((jlw) ((byb) qdcVar2.C(I2)).b(jlw.class)).h());
            case 4:
                return ((cew) this.b.m.getValue()).e;
            case 5:
                return ((cew) this.b.m.getValue()).d;
            case 6:
                return ((cew) this.b.m.getValue()).c;
            case 7:
                return new ifw(this.b);
            case 8:
                qfw qfwVar2 = this.b;
                return (etw) qfwVar2.a.invoke(qfwVar2);
            case 9:
                this.b.b().getClass();
                Boolean bool = (Boolean) siw.e.getValue();
                bool.booleanValue();
                return bool;
            case 10:
                this.b.b().getClass();
                Boolean bool2 = (Boolean) riw.e.getValue();
                bool2.getClass();
                return bool2;
            case 11:
                this.b.b().getClass();
                Boolean bool3 = (Boolean) siw.e.getValue();
                bool3.booleanValue();
                return bool3;
            default:
                ((wfw) this.b.h.getValue()).getClass();
                return Boolean.FALSE;
        }
    }
}
