package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class z3l implements c4x {
    public Integer a;

    public final boolean a(z3l z3lVar, rvo rvoVar, rvo rvoVar2) {
        if (z3lVar != null) {
            if (this instanceof x3l) {
                x3l x3lVar = (x3l) this;
                Object c = z3lVar.c();
                a4l a4lVar = c instanceof a4l ? (a4l) c : null;
                if (a4lVar != null) {
                    a4l a4lVar2 = x3lVar.b;
                    if (a4lVar2.a.a(rvoVar) == a4lVar.a.a(rvoVar2) && ((Number) a4lVar2.b.a(rvoVar)).longValue() == ((Number) a4lVar.b.a(rvoVar2)).longValue()) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof y3l)) {
                    w511.b();
                    return false;
                }
                y3l y3lVar = (y3l) this;
                Object c2 = z3lVar.c();
                i4l i4lVar = c2 instanceof i4l ? (i4l) c2 : null;
                if (i4lVar != null && ((Number) y3lVar.b.a.a(rvoVar)).doubleValue() == ((Number) i4lVar.a.a(rvoVar2)).doubleValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof x3l) {
            a4l a4lVar = ((x3l) this).b;
            Integer num2 = a4lVar.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = a4lVar.b.hashCode() + a4lVar.a.hashCode() + qoi0.a(a4l.class).hashCode();
                a4lVar.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof y3l)) {
                w511.b();
                return 0;
            }
            i4l i4lVar = ((y3l) this).b;
            Integer num3 = i4lVar.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = i4lVar.a.hashCode() + qoi0.a(i4l.class).hashCode();
                i4lVar.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    public final Object c() {
        if (this instanceof x3l) {
            return ((x3l) this).b;
        }
        if (this instanceof y3l) {
            return ((y3l) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((f4l) ft6.b.g6.getValue()).b(ft6.a, this);
    }
}
