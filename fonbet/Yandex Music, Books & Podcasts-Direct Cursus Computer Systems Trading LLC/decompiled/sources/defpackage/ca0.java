package defpackage;

/* loaded from: classes3.dex */
public final class ca0 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ ja0 d;

    public ca0(ja0 ja0Var) {
        this.d = ja0Var;
    }

    public final void a(float f, float f2) {
        ja0 ja0Var = this.d;
        t6k t6kVar = ja0Var.j;
        float e = t6kVar.e();
        t6kVar.h(f);
        ja0Var.k.h(f2);
        if (Float.isNaN(e)) {
            return;
        }
        boolean z = f >= e;
        ml7 c = ja0Var.c();
        x6k x6kVar = ja0Var.g;
        if (t6kVar.e() == c.d(x6kVar.getValue())) {
            Object b = ja0Var.c().b(z, t6kVar.e() + (z ? 1.0f : -1.0f));
            if (b == null) {
                b = x6kVar.getValue();
            }
            if (z) {
                this.a = x6kVar.getValue();
                this.b = b;
            } else {
                this.a = b;
                this.b = x6kVar.getValue();
            }
        } else {
            Object b2 = ja0Var.c().b(false, t6kVar.e());
            if (b2 == null) {
                b2 = x6kVar.getValue();
            }
            Object b3 = ja0Var.c().b(true, t6kVar.e());
            if (b3 == null) {
                b3 = x6kVar.getValue();
            }
            this.a = b2;
            this.b = b3;
        }
        ml7 c2 = ja0Var.c();
        Object obj = this.a;
        obj.getClass();
        float d = c2.d(obj);
        ml7 c3 = ja0Var.c();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(d - c3.d(obj2));
        if (Math.abs(t6kVar.e() - ja0Var.c().d(x6kVar.getValue())) >= this.c / 2.0f) {
            Object obj3 = z ? this.b : this.a;
            if (obj3 == null) {
                obj3 = x6kVar.getValue();
            }
            if (((Boolean) ja0Var.a.invoke(obj3)).booleanValue()) {
                ja0Var.h(obj3);
            }
        }
    }
}
