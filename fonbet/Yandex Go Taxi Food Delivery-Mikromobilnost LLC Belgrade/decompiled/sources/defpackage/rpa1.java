package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class rpa1 implements ip60 {
    public static final rpa1 a = new rpa1();
    public static final lxq b;
    public static final lxq c;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("subjectSegmenterOptions", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ljb1 ljb1Var = (ljb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, ljb1Var.a);
        jp60Var.f(c, ljb1Var.b);
    }
}
