package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class qz91 implements ip60 {
    public static final qz91 a = new qz91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq("hasResult", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("isColdCall", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
        pf91 pf91Var4 = new pf91();
        pf91Var4.a = 4;
        e = new lxq("imageInfo", x4e.u(uw51.o(dg91.class, pf91Var4.a())));
        pf91 pf91Var5 = new pf91();
        pf91Var5.a = 5;
        f = new lxq("recognizerOptions", x4e.u(uw51.o(dg91.class, pf91Var5.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        np91 np91Var = (np91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, np91Var.a);
        jp60Var.f(c, null);
        jp60Var.f(d, np91Var.b);
        jp60Var.f(e, null);
        jp60Var.f(f, np91Var.c);
    }
}
