package defpackage;

import android.content.Context;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class vp2 implements rzm {
    public final /* synthetic */ int a = 1;
    public final szm b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;
    public final szm g;
    public final szm h;

    public vp2(kjn kjnVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, toe toeVar, toe toeVar2, toe toeVar3, toe toeVar4) {
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = toeVar;
        this.f = toeVar2;
        this.h = toeVar3;
        this.g = toeVar4;
    }

    @Override // defpackage.szm
    public final Object get() {
        String str;
        int i = this.a;
        szm szmVar = this.g;
        szm szmVar2 = this.h;
        szm szmVar3 = this.f;
        szm szmVar4 = this.e;
        szm szmVar5 = this.d;
        szm szmVar6 = this.c;
        szm szmVar7 = this.b;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        switch (i) {
            case 0:
                pyh pyhVar = (pyh) szmVar7.get();
                pxf pxfVar = (pxf) szmVar6.get();
                g86 g86Var = (g86) szmVar5.get();
                b0j b0jVar = (b0j) szmVar4.get();
                g0c g0cVar = (g0c) szmVar3.get();
                Context context = (Context) szmVar.get();
                String str2 = (String) szmVar2.get();
                pyhVar.getClass();
                pxfVar.getClass();
                g86Var.getClass();
                b0jVar.getClass();
                g0cVar.getClass();
                context.getClass();
                str2.getClass();
                ugk ugkVar = pxfVar.a;
                nzi nziVar = new nzi(g86Var.a(ugkVar), t7g.o(ugkVar == ugk.TESTING), c5b.a);
                int ordinal = ugkVar.ordinal();
                if (ordinal == 0) {
                    str = "https://mobpayment.yandex-net.ru/";
                } else if (ordinal == 1) {
                    str = "https://mobpayment-test.yandex-team.ru/";
                } else if (ordinal == 2) {
                    str = "https://testing.crowdtest.mobpayment.yandex.ru/";
                } else if (ordinal == 3) {
                    str = "https://mobpayment-test-mimino.yandex-team.ru/";
                } else {
                    if (ordinal != 4) {
                        b6e.s();
                        return null;
                    }
                    str = "http://127.0.0.1:8080/nspk/";
                }
                xo7 xo7Var = new xo7(new rs6(20, new URL(str)), nziVar, new ozw(25, (byte) 0), new v(g0cVar, i2), new w(i2, g0cVar));
                ozw ozwVar = new ozw(25, (byte) 0);
                lo4 lo4Var = lo4.android;
                String str3 = pyhVar.a;
                ArrayList j = u75.j(b0jVar, new q9i(1));
                str3.getClass();
                return new ggj(new t1f(14, new d0j(xo7Var, u1g.A(u75.j(new lgj(str3, 0), new q9i(0), new lgj(str2, 3)), j)), ozwVar, new i9w()));
            default:
                j03 j03Var = (j03) szmVar7.get();
                lnd lndVar = (lnd) szmVar6.get();
                vfk vfkVar = (vfk) szmVar5.get();
                xt0 xt0Var = (xt0) szmVar4.get();
                ind indVar = (ind) szmVar3.get();
                boolean booleanValue = ((Boolean) ((toe) szmVar2).a).booleanValue();
                g0c g0cVar2 = (g0c) szmVar.get();
                j03Var.getClass();
                lndVar.getClass();
                vfkVar.getClass();
                xt0Var.getClass();
                g0cVar2.getClass();
                boolean z = indVar != null;
                hah hahVar = hah.b;
                z28 z28Var = new z28(g0cVar2, i3);
                z28 z28Var2 = new z28(g0cVar2, i2);
                aah aahVar = new aah(16);
                aahVar.b = z28Var;
                aahVar.c = z28Var2;
                hahVar.getClass();
                hahVar.a = aahVar;
                return new ogk(j03Var, z ? lndVar : null, g0cVar2, vfkVar, new ime(i4, xt0Var.a, xt0Var.b, xt0Var.c), booleanValue);
        }
    }

    public vp2(mvn mvnVar, toe toeVar, rzm rzmVar, toe toeVar2, toe toeVar3, toe toeVar4, toe toeVar5, toe toeVar6) {
        this.b = toeVar;
        this.c = rzmVar;
        this.d = toeVar2;
        this.e = toeVar3;
        this.f = toeVar4;
        this.g = toeVar5;
        this.h = toeVar6;
    }
}
