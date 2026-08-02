package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class vua1 implements ip60 {
    public static final vua1 a = new vua1();
    public static final lxq b;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.o(dg91.class, pf91Var.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ((jp60) obj2).f(b, ((qmb1) obj).a);
    }
}
