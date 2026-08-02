package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class tx0 extends by0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0(int i) {
        super(mhb.BOOLEAN, 1);
        this.d = i;
        switch (i) {
            case 1:
                super(mhb.COLOR, 1);
                break;
            case 2:
                super(mhb.DICT, 1);
                break;
            case 3:
                super(mhb.ARRAY, 1);
                break;
            case 4:
                super(mhb.INTEGER, 1);
                break;
            case 5:
                super(mhb.NUMBER, 1);
                break;
            case 6:
                super(mhb.STRING, 1);
                break;
            case 7:
                super(mhb.URL, 1);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.by0, defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        Object t7oVar;
        String b0;
        int i = this.d;
        mhb mhbVar = this.b;
        list.getClass();
        switch (i) {
            case 0:
                Object E = xp3.E(c(), list, j());
                Boolean bool = E instanceof Boolean ? (Boolean) E : null;
                if (bool != null) {
                    return bool;
                }
                xp3.e0(c(), list, mhbVar, E, j());
                throw null;
            case 1:
                Object E2 = xp3.E(c(), list, j());
                if (!(E2 instanceof c85)) {
                    if (!(E2 instanceof String)) {
                        xp3.e0(c(), list, mhbVar, E2, j());
                        throw null;
                    }
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = new c85(bow.v((String) E2));
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    E2 = t7oVar;
                    if (z7o.a(E2) != null) {
                        xp3.d0(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
                        throw null;
                    }
                }
                return E2;
            case 2:
                Object E3 = xp3.E(c(), list, j());
                JSONObject jSONObject = E3 instanceof JSONObject ? (JSONObject) E3 : null;
                if (jSONObject != null) {
                    return jSONObject;
                }
                xp3.e0(c(), list, mhbVar, E3, j());
                throw null;
            case 3:
                Object E4 = xp3.E(c(), list, j());
                JSONArray jSONArray = E4 instanceof JSONArray ? (JSONArray) E4 : null;
                if (jSONArray != null) {
                    return jSONArray;
                }
                xp3.e0(c(), list, mhbVar, E4, j());
                throw null;
            case 4:
                Object E5 = xp3.E(c(), list, j());
                if (E5 instanceof Integer) {
                    return Long.valueOf(((Number) E5).intValue());
                }
                if (E5 instanceof Long) {
                    return E5;
                }
                if (E5 instanceof BigInteger) {
                    xp3.d0(c(), "Integer overflow.", list);
                    throw null;
                }
                if (E5 instanceof BigDecimal) {
                    xp3.d0(c(), "Cannot convert value to integer.", list);
                    throw null;
                }
                if (!(E5 instanceof Double)) {
                    xp3.e0(c(), list, mhbVar, E5, j());
                    throw null;
                }
                Number number = (Number) E5;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    xp3.d0(c(), "Integer overflow.", list);
                    throw null;
                }
                long c = eeh.c(number.doubleValue());
                if (number.doubleValue() - c == 0.0d) {
                    return Long.valueOf(c);
                }
                xp3.d0(c(), "Cannot convert value to integer.", list);
                throw null;
            case 5:
                Object E6 = xp3.E(c(), list, j());
                Number number2 = E6 instanceof Number ? (Number) E6 : null;
                if (number2 != null) {
                    return Double.valueOf(number2.doubleValue());
                }
                xp3.e0(c(), list, mhbVar, E6, j());
                throw null;
            case 6:
                Object E7 = xp3.E(c(), list, j());
                String str = E7 instanceof String ? (String) E7 : null;
                if (str != null) {
                    return str;
                }
                xp3.e0(c(), list, mhbVar, E7, j());
                throw null;
            default:
                Object E8 = xp3.E(c(), list, j());
                String str2 = E8 instanceof String ? (String) E8 : null;
                if (str2 != null && (b0 = xp3.b0(str2)) != null) {
                    return new lpt(b0);
                }
                xp3.e0(c(), list, mhbVar, E8, j());
                throw null;
        }
    }
}
