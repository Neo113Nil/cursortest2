package defpackage;

import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class x810 implements p8w {
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        kvj0 kvj0Var;
        Long m;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        t4j0 b = d5j0Var.b();
        b.f("Max-Size");
        kvj0 b2 = zci0Var.b(new d5j0(b));
        rvj0 rvj0Var = b2.z;
        String str = (String) a.R(d5j0Var.c.g("Max-Size"));
        if (str == null || (m = bvu0.m(10, str)) == null) {
            kvj0Var = null;
        } else {
            jci0 jci0Var = new jci0(vng.H(new wfy(rvj0Var.byteStream(), m.longValue())));
            cvj0 c = b2.c();
            c.g = rvj0.create(rvj0Var.contentType(), rvj0Var.contentLength(), jci0Var);
            kvj0Var = c.a();
        }
        return kvj0Var == null ? b2 : kvj0Var;
    }
}
