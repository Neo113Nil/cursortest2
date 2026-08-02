package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fle {
    public static final Set e = xz0.Y(new xke[]{vke.a, wke.a});
    public static final act f = weo.S(0, 0, lya.c, 3);
    public final xke a;
    public final x6k b;
    public final fkn c;
    public final fk0 d;

    public fle(xke xkeVar, pjc pjcVar, mm6 mm6Var) {
        pjcVar.getClass();
        this.a = xkeVar;
        this.b = szf.g0(null);
        this.c = zsd.F0(new u21(10, szf.s0(new v1e(6, this)), pjcVar, new d90(this, (Continuation) null, 1)), mm6Var, lbq.b, null);
        this.d = vq2.a(0.0f);
    }

    public final float a(jx7 jx7Var) {
        jx7Var.getClass();
        lke lkeVar = (lke) this.b.getValue();
        cma cmaVar = null;
        if (lkeVar != null) {
            if (!lkeVar.d().contains(this.a)) {
                lkeVar = null;
            }
            if (lkeVar != null) {
                cmaVar = new cma(((Number) this.d.e()).floatValue() * lkeVar.c(jx7Var));
            }
        }
        if (cmaVar != null) {
            return cmaVar.a;
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (c(r8, 1.0f, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (c(r8, 0.0f, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(lke lkeVar, boolean z, Continuation continuation) {
        ele eleVar;
        int i;
        if (continuation instanceof ele) {
            eleVar = (ele) continuation;
            int i2 = eleVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eleVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eleVar.j;
                nm6 nm6Var = nm6.a;
                i = eleVar.l;
                x6k x6kVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    if (lkeVar != null) {
                        x6kVar.setValue(lkeVar);
                        eleVar.l = 1;
                    } else {
                        eleVar.l = 2;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x6kVar.setValue(null);
                return Unit.a;
            }
        }
        eleVar = new ele(this, continuation);
        Object obj2 = eleVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eleVar.l;
        x6k x6kVar2 = this.b;
        if (i != 0) {
        }
    }

    public final Object c(boolean z, float f2, ele eleVar) {
        fk0 fk0Var = this.d;
        if (z) {
            Object c = fk0.c(fk0Var, new Float(f2), f, null, eleVar, 12);
            return c == nm6.a ? c : Unit.a;
        }
        Object f3 = fk0Var.f(new Float(f2), eleVar);
        return f3 == nm6.a ? f3 : Unit.a;
    }
}
