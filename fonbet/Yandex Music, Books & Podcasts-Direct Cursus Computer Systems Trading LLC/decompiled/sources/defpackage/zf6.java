package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class zf6 implements t9f {
    public final /* synthetic */ int a = 0;
    public final t9f b;
    public final Object c;
    public final Object d;
    public final mhp e;

    public zf6(lm4 lm4Var, t9f t9fVar, t9f[] t9fVarArr) {
        this.c = lm4Var;
        this.b = t9fVar;
        List asList = Arrays.asList(t9fVarArr);
        asList.getClass();
        this.d = asList;
        at5 at5Var = new at5(7, this);
        this.e = new ze6(avf.x("kotlinx.serialization.ContextualSerializer", shp.b, new mhp[0], at5Var), lm4Var);
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                uhp a = eg7Var.a();
                lm4 lm4Var = (lm4) this.c;
                t9f b = a.b(lm4Var, (List) this.d);
                if (b == null && (b = this.b) == null) {
                    throw new zhp(gld.V(lm4Var));
                }
                return eg7Var.e(b);
            default:
                t9f t9fVar = (t9f) this.d;
                t9f t9fVar2 = (t9f) this.c;
                eg7Var.getClass();
                ohp ohpVar = (ohp) this.e;
                tq5 c = eg7Var.c(ohpVar);
                boolean m = c.m();
                t9f t9fVar3 = this.b;
                if (m) {
                    Object z = c.z(ohpVar, 0, t9fVar3, null);
                    Object z2 = c.z(ohpVar, 1, t9fVar2, null);
                    Object z3 = c.z(ohpVar, 2, t9fVar, null);
                    c.b(ohpVar);
                    return new vat(z, z2, z3);
                }
                Object obj = xv.j;
                Object obj2 = obj;
                Object obj3 = obj2;
                Object obj4 = obj3;
                while (true) {
                    int w = c.w(ohpVar);
                    if (w == -1) {
                        c.b(ohpVar);
                        if (obj2 == obj) {
                            throw new zhp("Element 'first' is missing");
                        }
                        if (obj3 == obj) {
                            throw new zhp("Element 'second' is missing");
                        }
                        if (obj4 != obj) {
                            return new vat(obj2, obj3, obj4);
                        }
                        throw new zhp("Element 'third' is missing");
                    }
                    if (w == 0) {
                        obj2 = c.z(ohpVar, 0, t9fVar3, null);
                    } else if (w == 1) {
                        obj3 = c.z(ohpVar, 1, t9fVar2, null);
                    } else {
                        if (w != 2) {
                            throw new zhp(k5r.i(w, "Unexpected index "));
                        }
                        obj4 = c.z(ohpVar, 2, t9fVar, null);
                    }
                }
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
            case 0:
                return (ze6) this.e;
            default:
                return (ohp) this.e;
        }
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        switch (this.a) {
            case 0:
                l6bVar.getClass();
                obj.getClass();
                uhp a = l6bVar.a();
                lm4 lm4Var = (lm4) this.c;
                t9f b = a.b(lm4Var, (List) this.d);
                if (b == null && (b = this.b) == null) {
                    throw new zhp(gld.V(lm4Var));
                }
                l6bVar.v(b, obj);
                return;
            default:
                vat vatVar = (vat) obj;
                l6bVar.getClass();
                vatVar.getClass();
                ohp ohpVar = (ohp) this.e;
                wq5 c = l6bVar.c(ohpVar);
                c.k(ohpVar, 0, this.b, vatVar.a);
                c.k(ohpVar, 1, (t9f) this.c, vatVar.b);
                c.k(ohpVar, 2, (t9f) this.d, vatVar.c);
                c.b(ohpVar);
                return;
        }
    }

    public zf6(t9f t9fVar, t9f t9fVar2, t9f t9fVar3) {
        t9fVar.getClass();
        t9fVar2.getClass();
        t9fVar3.getClass();
        this.b = t9fVar;
        this.c = t9fVar2;
        this.d = t9fVar3;
        this.e = avf.v("kotlin.Triple", new mhp[0], new r3s(10, this));
    }
}
