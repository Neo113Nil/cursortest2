package defpackage;

import com.yandex.music.shared.bdui.trigger.network.TriggerApi;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class pzp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzp b;

    public /* synthetic */ pzp(qzp qzpVar, int i) {
        this.a = i;
        this.b = qzpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(e0j.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                qzp qzpVar = this.b;
                rp7Var.E(new pzp(qzpVar, 1));
                o18Var.c = hag.I(TriggerApi.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(17));
                o18Var.c = hag.I(qi5.class);
                rp7Var.getClass();
                rp7Var.D(new pzp(qzpVar, 2));
                o18Var.c = hag.I(sj5.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(18));
                o18Var.c = hag.I(ik5.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(19));
                o18Var.c = hag.I(cj5.class);
                rp7Var.getClass();
                rp7Var.D(new pzp(qzpVar, 3));
                o18Var.c = hag.I(qk5.class);
                rp7Var.getClass();
                rp7Var.D(new pzp(qzpVar, 4));
                o18Var.c = hag.I(oi5.class);
                rp7Var.getClass();
                rp7Var.E(new pzp(qzpVar, 5));
                o18Var.c = hag.I(hmh.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(20));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                l13 l13Var = this.b.a;
                return i0j.a((i0j) l13Var.a.D(hag.I(i0j.class), l13Var, l13Var.b), null, null, null, null, 63);
            case 2:
                ((l13) obj).getClass();
                qzp qzpVar2 = this.b;
                l13 l13Var2 = qzpVar2.a;
                return new qi5((cy2) l13Var2.a.D(hag.I(cy2.class), l13Var2, l13Var2.b), new qkp(23, qzpVar2));
            case 3:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                l13 l13Var4 = this.b.a;
                return new cj5((zv8) l13Var4.a.D(hag.I(zv8.class), l13Var4, l13Var4.b), (qi5) l13Var3.a.D(hag.I(qi5.class), l13Var3, l13Var3.b));
            case 4:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I = hag.I(qi5.class);
                qdc qdcVar = l13Var5.a;
                Set set = l13Var5.b;
                yh5 yh5Var = new yh5((qi5) qdcVar.D(I, l13Var5, set));
                l13 l13Var6 = this.b.a;
                return new qk5(u75.h(yh5Var, new yh5((nk5) l13Var6.a.D(hag.I(nk5.class), l13Var6, l13Var6.b), (qi5) qdcVar.D(hag.I(qi5.class), l13Var5, set))));
            default:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                jyr b = l13Var7.b(hag.I(ik5.class), true);
                jyr b2 = l13Var7.b(hag.I(cj5.class), true);
                jyr b3 = l13Var7.b(hag.I(qk5.class), true);
                l13 l13Var8 = this.b.a;
                return new oi5(b, b2, b3, (frt) l13Var8.a.D(hag.I(frt.class), l13Var8, l13Var8.b));
        }
    }
}
