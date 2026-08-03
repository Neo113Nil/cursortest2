package cd;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: g, reason: collision with root package name */
    public d[] f1337g;

    /* renamed from: h, reason: collision with root package name */
    public int f1338h;

    /* renamed from: i, reason: collision with root package name */
    public int f1339i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f1340j;

    public final d b() {
        d dVar;
        b0 b0Var;
        synchronized (this) {
            try {
                d[] dVarArr = this.f1337g;
                if (dVarArr == null) {
                    dVarArr = e();
                    this.f1337g = dVarArr;
                } else if (this.f1338h >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    pc.j.d(copyOf, "copyOf(...)");
                    this.f1337g = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i10 = this.f1339i;
                do {
                    dVar = dVarArr[i10];
                    if (dVar == null) {
                        dVar = d();
                        dVarArr[i10] = dVar;
                    }
                    i10++;
                    if (i10 >= dVarArr.length) {
                        i10 = 0;
                    }
                } while (!dVar.a(this));
                this.f1339i = i10;
                this.f1338h++;
                b0Var = this.f1340j;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b0Var != null) {
            b0Var.w(1);
        }
        return dVar;
    }

    public abstract d d();

    public abstract d[] e();

    public final void f(d dVar) {
        b0 b0Var;
        int i10;
        fc.d[] b2;
        synchronized (this) {
            try {
                int i11 = this.f1338h - 1;
                this.f1338h = i11;
                b0Var = this.f1340j;
                if (i11 == 0) {
                    this.f1339i = 0;
                }
                pc.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b2 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (fc.d dVar2 : b2) {
            if (dVar2 != null) {
                dVar2.resumeWith(ac.o.f277a);
            }
        }
        if (b0Var != null) {
            b0Var.w(-1);
        }
    }

    public final b0 g() {
        b0 b0Var;
        synchronized (this) {
            b0Var = this.f1340j;
            if (b0Var == null) {
                int i10 = this.f1338h;
                b0Var = new b0(1, Integer.MAX_VALUE, ad.a.f281h);
                b0Var.q(Integer.valueOf(i10));
                this.f1340j = b0Var;
            }
        }
        return b0Var;
    }
}
