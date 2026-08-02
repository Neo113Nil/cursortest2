package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final class tx01 implements m3u0 {
    public final oz40 A;
    public sj2 B;
    public final iy40 C;
    public boolean D;
    public final twt0 E;
    public final /* synthetic */ zx01 F;
    public final gl11 a;
    public final oz40 b;
    public final oz40 c;
    public final oz40 w;
    public final oz40 x;
    public final tx40 y;
    public boolean z;

    public tx01(zx01 zx01Var, Object obj, sj2 sj2Var, gl11 gl11Var) {
        this.F = zx01Var;
        this.a = gl11Var;
        oz40 j = f.j(obj);
        this.b = j;
        Object obj2 = null;
        this.c = f.j(sb2.G(0.0f, 0.0f, 7, null));
        this.w = f.j(new lax0(b(), gl11Var, obj, j.getValue(), sj2Var));
        this.x = f.j(Boolean.TRUE);
        this.y = f.f(-1.0f);
        this.A = f.j(obj);
        this.B = sj2Var;
        this.C = f.h(a().d());
        Float f = (Float) jx31.a.get(gl11Var);
        if (f != null) {
            float floatValue = f.floatValue();
            sj2 sj2Var2 = (sj2) gl11Var.a.invoke(obj);
            int b = sj2Var2.b();
            for (int i = 0; i < b; i++) {
                sj2Var2.e(floatValue, i);
            }
            obj2 = this.a.b.invoke(sj2Var2);
        }
        this.E = sb2.G(0.0f, 0.0f, 3, obj2);
    }

    public final lax0 a() {
        return (lax0) this.w.getValue();
    }

    public final qar b() {
        return (qar) this.c.getValue();
    }

    public final void d() {
        if (this.y.getFloatValue() == -1.0f) {
            this.D = true;
            boolean l = jl40.l(a().c, a().d);
            oz40 oz40Var = this.A;
            if (l) {
                oz40Var.setValue(a().c);
            } else {
                oz40Var.setValue(a().f(0L));
                this.B = a().h(0L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Object obj, boolean z) {
        oz40 oz40Var = this.b;
        boolean l = jl40.l(null, oz40Var.getValue());
        iy40 iy40Var = this.C;
        oz40 oz40Var2 = this.w;
        if (l) {
            oz40Var2.setValue(new lax0(this.E, this.a, obj, obj, this.B.c()));
            this.z = true;
            iy40Var.setLongValue(a().d());
            return;
        }
        qar b = (!z || this.D) ? b() : b() instanceof twt0 ? b() : this.E;
        zx01 zx01Var = this.F;
        long e = zx01Var.e();
        oz40 oz40Var3 = zx01Var.h;
        oz40Var2.setValue(new lax0(e <= 0 ? b : new q0u0(b, zx01Var.e()), this.a, obj, oz40Var.getValue(), this.B));
        iy40Var.setLongValue(a().d());
        this.z = false;
        oz40Var3.setValue(Boolean.TRUE);
        if (zx01Var.g()) {
            SnapshotStateList snapshotStateList = zx01Var.i;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                tx01 tx01Var = (tx01) snapshotStateList.get(i);
                tx01Var.C.getLongValue();
                tx01Var.d();
            }
            oz40Var3.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, qar qarVar) {
        this.b.setValue(obj2);
        this.c.setValue(qarVar);
        if (jl40.l(a().d, obj) && jl40.l(a().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, qar qarVar) {
        if (this.z && jl40.l(obj, null)) {
            return;
        }
        oz40 oz40Var = this.b;
        boolean l = jl40.l(oz40Var.getValue(), obj);
        tx40 tx40Var = this.y;
        if (l && tx40Var.getFloatValue() == -1.0f) {
            return;
        }
        oz40Var.setValue(obj);
        this.c.setValue(qarVar);
        float floatValue = tx40Var.getFloatValue();
        oz40 oz40Var2 = this.A;
        Object value = floatValue == -3.0f ? obj : oz40Var2.getValue();
        oz40 oz40Var3 = this.x;
        e(value, !((Boolean) oz40Var3.getValue()).booleanValue());
        oz40Var3.setValue(Boolean.valueOf(tx40Var.getFloatValue() == -3.0f));
        if (tx40Var.getFloatValue() >= 0.0f) {
            oz40Var2.setValue(a().f((long) (tx40Var.getFloatValue() * a().d())));
        } else if (tx40Var.getFloatValue() == -3.0f) {
            oz40Var2.setValue(obj);
        }
        this.z = false;
        tx40Var.setFloatValue(-1.0f);
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return this.A.getValue();
    }

    public final String toString() {
        return "current value: " + this.A.getValue() + ", target: " + this.b.getValue() + ", spec: " + b();
    }
}
