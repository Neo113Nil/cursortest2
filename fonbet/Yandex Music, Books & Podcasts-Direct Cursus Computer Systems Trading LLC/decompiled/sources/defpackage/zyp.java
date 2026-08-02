package defpackage;

import com.yandex.music.shared.bdu.trigger.network.TriggerApi;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class zyp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ azp b;

    public /* synthetic */ zyp(azp azpVar, int i) {
        this.a = i;
        this.b = azpVar;
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
                azp azpVar = this.b;
                rp7Var.E(new zyp(azpVar, 3));
                o18Var.c = hag.I(TriggerApi.class);
                rp7Var.getClass();
                rp7Var.E(new pvp(19));
                o18Var.c = hag.I(fi5.class);
                rp7Var.getClass();
                rp7Var.D(new pvp(20));
                o18Var.c = hag.I(ei5.class);
                rp7Var.getClass();
                rp7Var.E(new zyp(azpVar, 4));
                o18Var.c = hag.I(ri5.class);
                rp7Var.getClass();
                rp7Var.D(new zyp(azpVar, 5));
                o18Var.c = hag.I(pk5.class);
                rp7Var.getClass();
                rp7Var.D(new zyp(azpVar, 6));
                o18Var.c = hag.I(rj5.class);
                rp7Var.getClass();
                rp7Var.D(new pvp(21));
                o18Var.c = hag.I(dj5.class);
                rp7Var.getClass();
                rp7Var.E(new zyp(azpVar, 7));
                o18Var.c = hag.I(zj5.class);
                rp7Var.getClass();
                rp7Var.E(new zyp(azpVar, 1));
                o18Var.c = hag.I(oj5.class);
                rp7Var.getClass();
                rp7Var.D(new zyp(azpVar, 2));
                o18Var.c = hag.I(pi5.class);
                rp7Var.getClass();
                rp7Var.D(new pvp(azpVar));
                return Unit.a;
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(TriggerApi.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                TriggerApi triggerApi = (TriggerApi) qdcVar.D(I, l13Var, set);
                l13 l13Var2 = this.b.a;
                return new jk5(triggerApi, (ai5) l13Var2.a.D(hag.I(ai5.class), l13Var2, l13Var2.b), (zv8) l13Var2.a(hag.I(zv8.class)), (dj5) qdcVar.D(hag.I(dj5.class), l13Var, set), (ei5) qdcVar.D(hag.I(ei5.class), l13Var, set), (pk5) qdcVar.D(hag.I(pk5.class), l13Var, set), (ri5) qdcVar.D(hag.I(ri5.class), l13Var, set), l13Var.b(hag.I(rj5.class), true), azp.a());
            case 2:
                ((l13) obj).getClass();
                l13 l13Var3 = this.b.a;
                return new qj5((sv8) l13Var3.a.D(hag.I(sv8.class), l13Var3, l13Var3.b));
            case 3:
                ((l13) obj).getClass();
                l13 l13Var4 = this.b.a;
                return i0j.a((i0j) l13Var4.a.D(hag.I(i0j.class), l13Var4, l13Var4.b), null, new pvp(17), null, null, 59);
            case 4:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                fi5 fi5Var = (fi5) l13Var5.a.D(hag.I(fi5.class), l13Var5, l13Var5.b);
                l13 l13Var6 = this.b.a;
                return new ei5(fi5Var, (cc7) l13Var6.a.D(hag.I(cc7.class), l13Var6, l13Var6.b), (frt) l13Var6.a.D(hag.I(frt.class), l13Var6, l13Var6.b));
            case 5:
                ((l13) obj).getClass();
                azp azpVar2 = this.b;
                l13 l13Var7 = azpVar2.a;
                return new ri5((cy2) l13Var7.a.D(hag.I(cy2.class), l13Var7, l13Var7.b), new qkp(19, azpVar2));
            case 6:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                l13 l13Var9 = this.b.a;
                return new rk5((nk5) l13Var9.a.D(hag.I(nk5.class), l13Var9, l13Var9.b), (ri5) l13Var8.a.D(hag.I(ri5.class), l13Var8, l13Var8.b));
            default:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new dj5((zv8) this.b.a.a(hag.I(zv8.class)), (ri5) l13Var10.a.D(hag.I(ri5.class), l13Var10, l13Var10.b));
        }
    }
}
