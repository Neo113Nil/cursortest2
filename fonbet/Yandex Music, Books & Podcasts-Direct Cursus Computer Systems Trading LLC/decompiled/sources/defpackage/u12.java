package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class u12 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public u12(int i) {
        switch (i) {
            case 1:
                bdt I = hag.I(uaa.class);
                l18 l18Var = l18.b;
                this.a = l18Var.b(I, true);
                this.b = l18Var.b(hag.I(aaa.class), true);
                this.c = btf.b(new ym4(13));
                this.d = l18Var.b(hag.I(e15.class), true);
                break;
            case 2:
                bdt I2 = hag.I(upq.class);
                l18 l18Var2 = l18.b;
                this.a = l18Var2.b(I2, true);
                this.b = l18Var2.b(hag.I(cc7.class), true);
                this.c = l18Var2.b(hag.I(frt.class), true);
                this.d = l18Var2.b(hag.I(y16.class), true);
                break;
            case 3:
            default:
                bdt I3 = hag.I(cc7.class);
                l18 l18Var3 = l18.b;
                this.a = l18Var3.b(I3, true);
                this.b = l18Var3.b(hag.I(frt.class), true);
                this.c = btf.b(new uu1(4));
                this.d = btf.b(new uu1(5));
                break;
            case 4:
                bdt I4 = hag.I(e0j.class);
                l18 l18Var4 = l18.b;
                this.a = l18Var4.b(I4, true);
                this.b = l18Var4.b(hag.I(cc7.class), true);
                this.c = l18Var4.b(hag.I(frt.class), true);
                this.d = l18Var4.b(hag.I(oq7.class), true);
                break;
            case 5:
                bdt I5 = hag.I(Context.class);
                l18 l18Var5 = l18.b;
                this.a = l18Var5.b(I5, true);
                this.b = l18Var5.b(hag.I(cc7.class), true);
                this.c = l18Var5.b(hag.I(c72.class), true);
                this.d = l18Var5.b(hag.I(wyq.class), true);
                break;
        }
    }

    public static h15 a(u12 u12Var, String str) {
        u12Var.getClass();
        str.getClass();
        return new h15(u12Var.e(str), u12Var, 0);
    }

    public static h15 b(u12 u12Var, String str) {
        u12Var.getClass();
        str.getClass();
        return new h15(u12Var.c(str), u12Var, 1);
    }

    public static h15 f(u12 u12Var, String str) {
        u12Var.getClass();
        str.getClass();
        return new h15(u12Var.c(str), u12Var, 2);
    }

    public static h15 g(u12 u12Var, String str) {
        u12Var.getClass();
        str.getClass();
        return new h15(u12Var.e(str), u12Var, 3);
    }

    public tc4 c(String str) {
        e15 d = d();
        d.getClass();
        str.getClass();
        return zsd.u0(d.g().g(str, "album_mview"), ((e6q) ((uaa) this.a.getValue())).e, ((aaa) this.b.getValue()).e);
    }

    public e15 d() {
        return (e15) this.d.getValue();
    }

    public tc4 e(String str) {
        e15 d = d();
        d.getClass();
        str.getClass();
        return zsd.u0(d.g().g(str, "track_mview"), ((e6q) ((uaa) this.a.getValue())).e);
    }

    public u12(l13 l13Var) {
        this.a = l13Var.b(hag.I(n3h.class), true);
        this.b = l13Var.b(hag.I(oq7.class), true);
        this.c = l13Var.b(hag.I(z66.class), true);
        this.d = btf.b(new h4d(l13Var, 9));
    }
}
