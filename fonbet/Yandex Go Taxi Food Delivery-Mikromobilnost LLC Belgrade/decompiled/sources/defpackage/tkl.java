package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class tkl implements c4x {
    public Integer a;

    public final boolean a(tkl tklVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (tklVar != null) {
            if (this instanceof rkl) {
                rkl rklVar = (rkl) this;
                if (tklVar instanceof rkl) {
                    c4xVar2 = ((rkl) tklVar).b;
                } else {
                    if (!(tklVar instanceof skl)) {
                        w511.b();
                        return false;
                    }
                    c4xVar2 = ((skl) tklVar).b;
                }
                xqk xqkVar = c4xVar2 instanceof xqk ? (xqk) c4xVar2 : null;
                if (xqkVar != null) {
                    xqk xqkVar2 = rklVar.b;
                    if (xqkVar2.a.a(rvoVar) == xqkVar.a.a(rvoVar2) && ((Number) xqkVar2.b.a(rvoVar)).longValue() == ((Number) xqkVar.b.a(rvoVar2)).longValue()) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof skl)) {
                    w511.b();
                    return false;
                }
                skl sklVar = (skl) this;
                if (tklVar instanceof rkl) {
                    c4xVar = ((rkl) tklVar).b;
                } else {
                    if (!(tklVar instanceof skl)) {
                        w511.b();
                        return false;
                    }
                    c4xVar = ((skl) tklVar).b;
                }
                n3l n3lVar = c4xVar instanceof n3l ? (n3l) c4xVar : null;
                if (n3lVar != null && ((Number) sklVar.b.a.a(rvoVar)).doubleValue() == ((Number) n3lVar.a.a(rvoVar2)).doubleValue()) {
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
        if (this instanceof rkl) {
            xqk xqkVar = ((rkl) this).b;
            Integer num2 = xqkVar.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = xqkVar.b.hashCode() + xqkVar.a.hashCode() + qoi0.a(xqk.class).hashCode();
                xqkVar.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof skl)) {
                w511.b();
                return 0;
            }
            n3l n3lVar = ((skl) this).b;
            Integer num3 = n3lVar.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = n3lVar.a.hashCode() + qoi0.a(n3l.class).hashCode();
                n3lVar.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ukl) ft6.b.w9.getValue()).b(ft6.a, this);
    }
}
