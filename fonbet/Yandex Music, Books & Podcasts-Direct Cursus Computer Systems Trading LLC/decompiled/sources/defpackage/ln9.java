package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ln9 implements u1f {
    public final szb a;
    public final rn9 b;
    public final szb c;
    public final szb d;
    public Integer e;

    public ln9(szb szbVar, rn9 rn9Var, szb szbVar2, szb szbVar3) {
        this.a = szbVar;
        this.b = rn9Var;
        this.c = szbVar2;
        this.d = szbVar3;
    }

    public final boolean a(ln9 ln9Var, xzb xzbVar, xzb xzbVar2) {
        Object obj;
        Object obj2;
        if (ln9Var == null || ((Number) this.a.a(xzbVar)).intValue() != ((Number) ln9Var.a.a(xzbVar2)).intValue()) {
            return false;
        }
        rn9 rn9Var = ln9Var.b;
        rn9 rn9Var2 = this.b;
        if (rn9Var2 instanceof qn9) {
            if (rn9Var instanceof qn9) {
                obj2 = ((qn9) rn9Var).b;
            } else {
                if (!(rn9Var instanceof pn9)) {
                    b6e.s();
                    return false;
                }
                obj2 = ((pn9) rn9Var).b;
            }
            if ((obj2 instanceof ao9 ? (ao9) obj2 : null) == null) {
                return false;
            }
        } else {
            if (!(rn9Var2 instanceof pn9)) {
                b6e.s();
                return false;
            }
            if (rn9Var instanceof qn9) {
                obj = ((qn9) rn9Var).b;
            } else {
                if (!(rn9Var instanceof pn9)) {
                    b6e.s();
                    return false;
                }
                obj = ((pn9) rn9Var).b;
            }
            if ((obj instanceof sn9 ? (sn9) obj : null) == null) {
                return false;
            }
        }
        return this.c.a(xzbVar) == ln9Var.c.a(xzbVar2) && ((Number) this.d.a(xzbVar)).doubleValue() == ((Number) ln9Var.d.a(xzbVar2)).doubleValue();
    }

    public final int b() {
        int i;
        int hashCode;
        int intValue;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = this.a.hashCode() + ern.a(ln9.class).hashCode();
        rn9 rn9Var = this.b;
        Integer num2 = rn9Var.a;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int hashCode3 = ern.a(rn9Var.getClass()).hashCode();
            if (rn9Var instanceof qn9) {
                ao9 ao9Var = ((qn9) rn9Var).b;
                Integer num3 = ao9Var.a;
                if (num3 != null) {
                    intValue = num3.intValue();
                    int i2 = hashCode3 + intValue;
                    rn9Var.a = Integer.valueOf(i2);
                    i = i2;
                } else {
                    hashCode = ern.a(ao9.class).hashCode();
                    ao9Var.a = Integer.valueOf(hashCode);
                    intValue = hashCode;
                    int i22 = hashCode3 + intValue;
                    rn9Var.a = Integer.valueOf(i22);
                    i = i22;
                }
            } else if (rn9Var instanceof pn9) {
                sn9 sn9Var = ((pn9) rn9Var).b;
                Integer num4 = sn9Var.a;
                if (num4 != null) {
                    intValue = num4.intValue();
                    int i222 = hashCode3 + intValue;
                    rn9Var.a = Integer.valueOf(i222);
                    i = i222;
                } else {
                    hashCode = ern.a(sn9.class).hashCode();
                    sn9Var.a = Integer.valueOf(hashCode);
                    intValue = hashCode;
                    int i2222 = hashCode3 + intValue;
                    rn9Var.a = Integer.valueOf(i2222);
                    i = i2222;
                }
            } else {
                b6e.s();
                i = 0;
            }
        }
        int hashCode4 = this.d.hashCode() + this.c.hashCode() + i + hashCode2;
        this.e = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((mn9) rj3.b.a8.getValue()).b(rj3.a, this);
    }
}
