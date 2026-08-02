package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class lnp {
    public final esp a;
    public final esp b;

    public lnp(esp espVar, esp espVar2) {
        espVar.getClass();
        espVar2.getClass();
        this.a = espVar;
        this.b = espVar2;
    }

    public final double a() {
        Double c = this.a.c();
        if (c != null) {
            double doubleValue = c.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double c2 = this.b.c();
        if (c2 != null) {
            double doubleValue2 = c2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r6.d(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        knp knpVar;
        int i;
        lnp lnpVar;
        if (cg6Var instanceof knp) {
            knpVar = (knp) cg6Var;
            int i2 = knpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knpVar.m = i2 - Integer.MIN_VALUE;
                Object obj = knpVar.k;
                nm6 nm6Var = nm6.a;
                i = knpVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    knpVar.j = this;
                    knpVar.m = 1;
                    if (this.a.d(knpVar) != nm6Var) {
                        lnpVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lnpVar = knpVar.j;
                qgg.h0(obj);
                esp espVar = lnpVar.b;
                knpVar.j = null;
                knpVar.m = 2;
            }
        }
        knpVar = new knp(this, cg6Var);
        Object obj2 = knpVar.k;
        nm6 nm6Var2 = nm6.a;
        i = knpVar.m;
        if (i != 0) {
        }
        esp espVar2 = lnpVar.b;
        knpVar.j = null;
        knpVar.m = 2;
    }
}
