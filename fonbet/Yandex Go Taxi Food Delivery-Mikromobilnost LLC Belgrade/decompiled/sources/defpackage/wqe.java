package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;

/* loaded from: classes13.dex */
public final class wqe implements p3s0 {
    public final lng a;
    public final f2s0 b;
    public final tlw0 c;
    public final qy2 d;
    public final g e;
    public final o4i f;

    public wqe(lng lngVar, f2s0 f2s0Var, tlw0 tlw0Var, qy2 qy2Var, g gVar, o4i o4iVar) {
        this.a = lngVar;
        this.b = f2s0Var;
        this.c = tlw0Var;
        this.d = qy2Var;
        this.e = gVar;
        this.f = o4iVar;
    }

    public final boolean a(yaf0 yaf0Var) {
        f2s0 f2s0Var = this.b;
        f2s0Var.getClass();
        if (yaf0Var instanceof waf0) {
            return true;
        }
        if (!(yaf0Var instanceof uaf0)) {
            return false;
        }
        int i = e2s0.a[((uaf0) yaf0Var).e.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                return false;
            }
            ((ul51) f2s0Var.a.b).getClass();
        }
        return true;
    }
}
