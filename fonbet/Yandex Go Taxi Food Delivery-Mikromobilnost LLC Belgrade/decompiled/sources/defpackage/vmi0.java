package defpackage;

import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class vmi0 implements xn21 {
    public final Looper a;
    public final at2 b;
    public final k020 c;
    public final h3y d;
    public final ike e;
    public final HashMap f = new HashMap();

    public vmi0(Looper looper, at2 at2Var, k020 k020Var, h3y h3yVar, kse kseVar, wff0 wff0Var) {
        this.a = looper;
        this.b = at2Var;
        this.c = k020Var;
        this.d = h3yVar;
        this.e = g8e.f(kseVar.e);
        z83.g(null, looper, Looper.myLooper());
        wff0Var.a(new fn3(14, this));
    }

    @Override // defpackage.xn21
    public final e1k b(String str, vn21 vn21Var) {
        if (this.b.a().a(str) != null) {
            return e1k.M1;
        }
        HashMap hashMap = this.f;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new umi0(this, str);
            hashMap.put(str, obj);
        }
        umi0 umi0Var = (umi0) obj;
        op3 op3Var = umi0Var.c;
        umi0Var.b.b(vn21Var);
        kgx[] kgxVarArr = umi0.x;
        kgx kgxVar = kgxVarArr[0];
        if (op3Var.a() == null) {
            xo3 c = ((to3) umi0Var.w.d.get()).c(umi0Var, umi0Var.a);
            kgx kgxVar2 = kgxVarArr[0];
            op3Var.b(c);
        }
        return new xi3(9, umi0Var, vn21Var);
    }
}
