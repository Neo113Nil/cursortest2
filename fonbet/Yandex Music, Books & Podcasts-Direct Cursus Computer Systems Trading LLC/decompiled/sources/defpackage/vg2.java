package defpackage;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class vg2 implements sg2 {
    public final String a;
    public final Context b;
    public final fk0 c;
    public final x0q d;
    public final vm0 e;
    public final x6k f;

    public vg2(long j, mm6 mm6Var, String str, Context context) {
        mm6Var.getClass();
        context.getClass();
        this.a = str;
        this.b = context;
        fk0 a = bmq.a(j);
        this.c = a;
        this.d = y0q.b(0, 0, null, 7);
        this.e = a.c;
        this.f = vz1.j(d85.n);
        x97.y(mm6Var, null, null, new tg2(this, null, 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (defpackage.fk0.c(r1, r8, r3, null, r5, 12) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(vg2 vg2Var, cg6 cg6Var) {
        ug2 ug2Var;
        int i;
        d85 d85Var;
        if (cg6Var instanceof ug2) {
            ug2Var = (ug2) cg6Var;
            int i2 = ug2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ug2Var.l = i2 - Integer.MIN_VALUE;
                ug2 ug2Var2 = ug2Var;
                Object obj = ug2Var2.j;
                nm6 nm6Var = nm6.a;
                i = ug2Var2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = vg2Var.a;
                    Context context = vg2Var.b;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(cce.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    cce cceVar = (cce) qdcVar.C(I);
                    ug2Var2.l = 1;
                    obj = h4a.t(str, context, cceVar, true, ug2Var2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                d85Var = (d85) obj;
                if (d85Var != null) {
                    vg2Var.f.setValue(new d85(d85Var.a));
                    fk0 fk0Var = vg2Var.c;
                    b9r Q = weo.Q(0.0f, 100.0f, null, 5);
                    ug2Var2.l = 2;
                }
                return Unit.a;
            }
        }
        ug2Var = new ug2(vg2Var, cg6Var);
        ug2 ug2Var22 = ug2Var;
        Object obj2 = ug2Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = ug2Var22.l;
        if (i != 0) {
        }
        d85Var = (d85) obj2;
        if (d85Var != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.sg2
    public final long a() {
        return ((d85) this.e.b.getValue()).a;
    }

    @Override // defpackage.sg2
    public final long b() {
        return ((d85) this.f.getValue()).a;
    }
}
