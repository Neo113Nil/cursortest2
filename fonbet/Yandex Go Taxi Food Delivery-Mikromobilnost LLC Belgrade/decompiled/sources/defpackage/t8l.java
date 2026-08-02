package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t8l implements c4x {
    public Integer a;

    public final boolean a(t8l t8lVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (t8lVar == null) {
            return false;
        }
        if (this instanceof s8l) {
            s8l s8lVar = (s8l) this;
            if (t8lVar instanceof s8l) {
                c4xVar2 = ((s8l) t8lVar).b;
            } else {
                if (!(t8lVar instanceof r8l)) {
                    w511.b();
                    return false;
                }
                c4xVar2 = ((r8l) t8lVar).c();
            }
            return s8lVar.b.a(c4xVar2 instanceof k7l ? (k7l) c4xVar2 : null, rvoVar, rvoVar2);
        }
        if (!(this instanceof r8l)) {
            w511.b();
            return false;
        }
        oik c = ((r8l) this).c();
        if (t8lVar instanceof s8l) {
            c4xVar = ((s8l) t8lVar).b;
        } else {
            if (!(t8lVar instanceof r8l)) {
                w511.b();
                return false;
            }
            c4xVar = ((r8l) t8lVar).c();
        }
        return c.a(c4xVar instanceof oik ? (oik) c4xVar : null, rvoVar, rvoVar2);
    }

    public final int b() {
        int b;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof s8l) {
            b = ((s8l) this).b.b();
        } else {
            if (!(this instanceof r8l)) {
                w511.b();
                return 0;
            }
            b = ((r8l) this).c().b();
        }
        int i = hashCode + b;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((z8l) ft6.b.i7.getValue()).b(ft6.a, this);
    }
}
