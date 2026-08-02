package defpackage;

/* loaded from: classes.dex */
public final class qxg implements sdr {
    public final x6k a;
    public final x6k b;
    public final x6k c;
    public final x6k d;
    public final x6k e;
    public final x6k f;
    public final x6k g;
    public final zx7 h;
    public final x6k i;
    public final x6k j;
    public final x6k k;
    public final x6k l;
    public final zx7 m;
    public final mqi n;

    public qxg() {
        Boolean bool = Boolean.FALSE;
        this.a = szf.g0(bool);
        this.b = szf.g0(1);
        this.c = szf.g0(1);
        this.d = szf.g0(bool);
        this.e = szf.g0(null);
        this.f = szf.g0(Float.valueOf(1.0f));
        this.g = szf.g0(bool);
        this.h = szf.U(new oxg(this, 1));
        this.i = szf.g0(null);
        Float valueOf = Float.valueOf(0.0f);
        this.j = szf.g0(valueOf);
        this.k = szf.g0(valueOf);
        this.l = szf.g0(Long.MIN_VALUE);
        this.m = szf.U(new oxg(this, 0));
        szf.U(new oxg(this, 2));
        this.n = new mqi();
    }

    public static final boolean a(qxg qxgVar, int i, long j) {
        x6k x6kVar = qxgVar.i;
        x6k x6kVar2 = qxgVar.j;
        x6k x6kVar3 = qxgVar.e;
        zx7 zx7Var = qxgVar.h;
        x6k x6kVar4 = qxgVar.l;
        ayg aygVar = (ayg) x6kVar.getValue();
        if (aygVar == null) {
            return true;
        }
        long longValue = ((Number) x6kVar4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) x6kVar4.getValue()).longValue();
        x6kVar4.setValue(Long.valueOf(j));
        if (x6kVar3.getValue() != null) {
            l1j.f();
            return false;
        }
        if (x6kVar3.getValue() != null) {
            l1j.f();
            return false;
        }
        float floatValue = ((Number) zx7Var.getValue()).floatValue() * ((longValue / 1000000) / aygVar.b());
        float floatValue2 = ((Number) zx7Var.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) x6kVar2.getValue()).floatValue() + floatValue) : (((Number) x6kVar2.getValue()).floatValue() + floatValue) - 1.0f;
        if (floatValue2 < 0.0f) {
            qxgVar.i(yhn.c(((Number) x6kVar2.getValue()).floatValue(), 0.0f, 1.0f) + floatValue);
            return true;
        }
        int i2 = (int) (floatValue2 / 1.0f);
        int i3 = i2 + 1;
        if (qxgVar.g() + i3 > i) {
            qxgVar.i(qxgVar.c());
            qxgVar.h(i);
            return false;
        }
        qxgVar.h(qxgVar.g() + i3);
        float f = floatValue2 - (i2 * 1.0f);
        qxgVar.i(((Number) zx7Var.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    public static final void b(qxg qxgVar, boolean z) {
        qxgVar.a.setValue(Boolean.valueOf(z));
    }

    public final float c() {
        return ((Number) this.m.getValue()).floatValue();
    }

    public final int g() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return Float.valueOf(((Number) this.k.getValue()).floatValue());
    }

    public final void h(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    public final void i(float f) {
        ayg aygVar;
        this.j.setValue(Float.valueOf(f));
        if (((Boolean) this.g.getValue()).booleanValue() && (aygVar = (ayg) this.i.getValue()) != null) {
            f -= f % (1 / aygVar.n);
        }
        this.k.setValue(Float.valueOf(f));
    }
}
