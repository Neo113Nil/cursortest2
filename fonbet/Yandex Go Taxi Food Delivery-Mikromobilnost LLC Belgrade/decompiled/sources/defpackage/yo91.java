package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class yo91 implements ip60 {
    public static final yo91 a = new yo91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq("isColdCall", x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("imageInfo", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
        bf91 bf91Var4 = new bf91();
        bf91Var4.a = 4;
        e = new lxq("detectorOptions", x4e.u(uw51.n(sf91.class, bf91Var4.a())));
        bf91 bf91Var5 = new bf91();
        bf91Var5.a = 5;
        f = new lxq("contourDetectedFaces", x4e.u(uw51.n(sf91.class, bf91Var5.a())));
        bf91 bf91Var6 = new bf91();
        bf91Var6.a = 6;
        g = new lxq("nonContourDetectedFaces", x4e.u(uw51.n(sf91.class, bf91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        kj91 kj91Var = (kj91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, kj91Var.a);
        jp60Var.f(c, kj91Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, kj91Var.c);
        jp60Var.f(f, kj91Var.d);
        jp60Var.f(g, kj91Var.e);
    }
}
