package defpackage;

import com.yandex.music.shared.splash.screen.network.SplashScreenApi;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class i7r implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ i7r(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
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
                pzl pzlVar = this.b;
                rp7Var.E(new i7r(pzlVar, 1));
                o18Var.c = hag.I(SplashScreenApi.class);
                rp7Var.getClass();
                rp7Var.E(new g5r(3));
                o18Var.c = hag.I(n7r.class);
                rp7Var.getClass();
                rp7Var.D(new g5r(4));
                o18Var.c = hag.I(u6r.class);
                rp7Var.getClass();
                rp7Var.D(new g5r(5));
                o18Var.c = hag.I(t6r.class);
                rp7Var.getClass();
                rp7Var.E(new i7r(pzlVar, 2));
                o18Var.c = hag.I(q7r.class);
                rp7Var.getClass();
                rp7Var.E(new i7r(pzlVar, 3));
                o18Var.c = hag.I(s7r.class);
                rp7Var.getClass();
                rp7Var.E(new i7r(pzlVar, 4));
                o18Var.c = hag.I(a7r.class);
                rp7Var.getClass();
                rp7Var.D(new i7r(pzlVar, 5));
                o18Var.c = hag.I(x6r.class);
                rp7Var.getClass();
                rp7Var.D(new i7r(pzlVar, 6));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                l13 l13Var = ((j7r) this.b.b).a;
                return i0j.a((i0j) l13Var.a.D(hag.I(i0j.class), l13Var, l13Var.b), null, new g5r(2), new nrq(18), null, 51);
            case 2:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                j7r j7rVar = (j7r) this.b.b;
                frt frtVar = (frt) j7rVar.a.a(hag.I(frt.class));
                l13 l13Var3 = j7rVar.a;
                return new t6r(frtVar, (cc7) l13Var3.a(hag.I(cc7.class)), (w6r) l13Var3.a.D(hag.I(w6r.class), l13Var3, l13Var3.b), l13Var2.b(hag.I(u6r.class), true));
            case 3:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I = hag.I(SplashScreenApi.class);
                qdc qdcVar = l13Var4.a;
                Set set = l13Var4.b;
                SplashScreenApi splashScreenApi = (SplashScreenApi) qdcVar.D(I, l13Var4, set);
                jyr b = l13Var4.b(hag.I(n7r.class), true);
                l13 l13Var5 = ((j7r) this.b.b).a;
                return new q7r(splashScreenApi, b, (zv8) l13Var5.a.D(hag.I(zv8.class), l13Var5, l13Var5.b), (t6r) qdcVar.D(hag.I(t6r.class), l13Var4, set));
            case 4:
                ((l13) obj).getClass();
                j7r j7rVar2 = (j7r) this.b.b;
                return new s7r((cc7) j7rVar2.a.a(hag.I(cc7.class)), (frt) j7rVar2.a.a(hag.I(frt.class)));
            case 5:
                ((l13) obj).getClass();
                l13 l13Var6 = ((j7r) this.b.b).a;
                return new a7r((sv8) l13Var6.a.D(hag.I(sv8.class), l13Var6, l13Var6.b));
            default:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                bdt I2 = hag.I(q7r.class);
                qdc qdcVar2 = l13Var7.a;
                Set set2 = l13Var7.b;
                return new x6r((q7r) qdcVar2.D(I2, l13Var7, set2), (s7r) qdcVar2.D(hag.I(s7r.class), l13Var7, set2), l13Var7.b(hag.I(a7r.class), true), new nrq(this.b, 17));
        }
    }
}
