package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z7t implements sdr {
    public final oct a;
    public final x6k b;
    public final x6k c;
    public final x6k d;
    public final x6k e;
    public final t6k f;
    public boolean g;
    public final x6k h;
    public cn0 i;
    public final v6k j;
    public boolean k;
    public final b9r l;
    public final /* synthetic */ d8t m;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public z7t(d8t d8tVar, Object obj, cn0 cn0Var, oct octVar) {
        this.m = d8tVar;
        this.a = octVar;
        x6k g0 = szf.g0(obj);
        this.b = g0;
        Object obj2 = null;
        x6k g02 = szf.g0(weo.Q(0.0f, 0.0f, null, 7));
        this.c = g02;
        this.d = szf.g0(new l6s((wdc) g02.getValue(), octVar, obj, g0.getValue(), cn0Var));
        this.e = szf.g0(Boolean.TRUE);
        this.f = new t6k(-1.0f);
        this.h = szf.g0(obj);
        this.i = cn0Var;
        this.j = new v6k(a().d());
        Float f = (Float) riu.a.get(octVar);
        if (f != null) {
            float floatValue = f.floatValue();
            cn0 cn0Var2 = (cn0) octVar.a.invoke(obj);
            int b = cn0Var2.b();
            for (int i = 0; i < b; i++) {
                cn0Var2.e(i, floatValue);
            }
            obj2 = this.a.b.invoke(cn0Var2);
        }
        this.l = weo.Q(0.0f, 0.0f, obj2, 3);
    }

    public final l6s a() {
        return (l6s) this.d.getValue();
    }

    public final void b() {
        if (this.f.e() == -1.0f) {
            this.k = true;
            boolean d = Intrinsics.d(a().c, a().d);
            x6k x6kVar = this.h;
            if (d) {
                x6kVar.setValue(a().c);
            } else {
                x6kVar.setValue(a().f(0L));
                this.i = a().b(0L);
            }
        }
    }

    public final void c(Object obj, boolean z) {
        x6k x6kVar = this.b;
        boolean d = Intrinsics.d(null, x6kVar.getValue());
        v6k v6kVar = this.j;
        x6k x6kVar2 = this.d;
        wdc wdcVar = this.l;
        if (d) {
            x6kVar2.setValue(new l6s(wdcVar, this.a, obj, obj, this.i.c()));
            this.g = true;
            v6kVar.i(a().d());
            return;
        }
        x6k x6kVar3 = this.c;
        if (!z || this.k) {
            wdcVar = (wdc) x6kVar3.getValue();
        } else if (((wdc) x6kVar3.getValue()) instanceof b9r) {
            wdcVar = (wdc) x6kVar3.getValue();
        }
        d8t d8tVar = this.m;
        long e = d8tVar.e();
        x6k x6kVar4 = d8tVar.h;
        long j = 0;
        x6kVar2.setValue(new l6s(e <= 0 ? wdcVar : new nbr(wdcVar, d8tVar.e()), this.a, obj, x6kVar.getValue(), this.i));
        v6kVar.i(a().d());
        this.g = false;
        x6kVar4.setValue(Boolean.TRUE);
        if (d8tVar.g()) {
            s2r s2rVar = d8tVar.i;
            int size = s2rVar.size();
            for (int i = 0; i < size; i++) {
                z7t z7tVar = (z7t) s2rVar.get(i);
                j = Math.max(j, z7tVar.j.h());
                z7tVar.b();
            }
            x6kVar4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, wdc wdcVar) {
        this.b.setValue(obj2);
        this.c.setValue(wdcVar);
        if (Intrinsics.d(a().d, obj) && Intrinsics.d(a().c, obj2)) {
            return;
        }
        c(obj, false);
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return this.h.getValue();
    }

    public final void h(Object obj, wdc wdcVar) {
        if (this.g && Intrinsics.d(obj, null)) {
            return;
        }
        x6k x6kVar = this.b;
        boolean d = Intrinsics.d(x6kVar.getValue(), obj);
        t6k t6kVar = this.f;
        if (d && t6kVar.e() == -1.0f) {
            return;
        }
        x6kVar.setValue(obj);
        this.c.setValue(wdcVar);
        float e = t6kVar.e();
        x6k x6kVar2 = this.h;
        Object value = e == -3.0f ? obj : x6kVar2.getValue();
        x6k x6kVar3 = this.e;
        c(value, !((Boolean) x6kVar3.getValue()).booleanValue());
        x6kVar3.setValue(Boolean.valueOf(t6kVar.e() == -3.0f));
        if (t6kVar.e() >= 0.0f) {
            x6kVar2.setValue(a().f((long) (t6kVar.e() * a().d())));
        } else if (t6kVar.e() == -3.0f) {
            x6kVar2.setValue(obj);
        }
        this.g = false;
        t6kVar.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.h.getValue() + ", target: " + this.b.getValue() + ", spec: " + ((wdc) this.c.getValue());
    }
}
