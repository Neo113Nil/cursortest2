package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class qta1 implements ip60 {
    public static final qta1 a = new qta1();
    public static final lxq b;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.p(cs91.class, nr91Var.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ((jp60) obj2).f(b, ((kmb1) obj).a);
    }
}
