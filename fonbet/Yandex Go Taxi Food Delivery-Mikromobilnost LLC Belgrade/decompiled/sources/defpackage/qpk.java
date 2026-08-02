package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class qpk implements c4x {
    public Integer a;

    public final boolean a(qpk qpkVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (qpkVar != null) {
            if (this instanceof opk) {
                jgk c = ((opk) this).c();
                if (qpkVar instanceof opk) {
                    c4xVar2 = ((opk) qpkVar).c();
                } else {
                    if (!(qpkVar instanceof ppk)) {
                        w511.b();
                        return false;
                    }
                    c4xVar2 = ((ppk) qpkVar).b;
                }
                jgk jgkVar = c4xVar2 instanceof jgk ? (jgk) c4xVar2 : null;
                return jgkVar != null && ((Number) c.a.a(rvoVar)).longValue() == ((Number) jgkVar.a.a(rvoVar2)).longValue();
            }
            if (!(this instanceof ppk)) {
                w511.b();
                return false;
            }
            if (qpkVar instanceof opk) {
                c4xVar = ((opk) qpkVar).c();
            } else {
                if (!(qpkVar instanceof ppk)) {
                    w511.b();
                    return false;
                }
                c4xVar = ((ppk) qpkVar).b;
            }
            if ((c4xVar instanceof upk ? (upk) c4xVar : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof opk) {
            jgk c = ((opk) this).c();
            Integer num2 = c.b;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                hashCode = qoi0.a(jgk.class).hashCode() + c.a.hashCode();
                c.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof ppk)) {
                w511.b();
                return 0;
            }
            upk upkVar = ((ppk) this).b;
            Integer num3 = upkVar.a;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = qoi0.a(upk.class).hashCode();
                upkVar.a = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i = hashCode2 + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((rpk) ft6.b.s3.getValue()).b(ft6.a, this);
    }
}
