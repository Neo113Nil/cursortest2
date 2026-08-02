package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class by0 extends oyc {
    public final /* synthetic */ int a;
    public final mhb b;
    public final List c;

    public by0(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.c = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhb.BOOLEAN;
                break;
            case 4:
                this.c = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhb.COLOR;
                break;
            case 5:
                mhb mhbVar = mhb.DICT;
                this.c = u75.h(new azc(mhbVar), new azc(mhb.STRING, true));
                this.b = mhbVar;
                break;
            case 6:
                this.c = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhb.INTEGER;
                break;
            case 7:
                this.c = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhb.NUMBER;
                break;
            case 8:
                mhb mhbVar2 = mhb.BOOLEAN;
                this.c = u75.h(new azc(mhbVar2), new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhbVar2;
                break;
            case 9:
                mhb mhbVar3 = mhb.COLOR;
                this.c = u75.h(new azc(mhbVar3), new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhbVar3;
                break;
            case 10:
                mhb mhbVar4 = mhb.STRING;
                this.c = u75.h(new azc(mhbVar4), new azc(mhb.DICT), new azc(mhbVar4, true));
                this.b = mhb.COLOR;
                break;
            case 11:
                mhb mhbVar5 = mhb.INTEGER;
                this.c = u75.h(new azc(mhbVar5), new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhbVar5;
                break;
            case 12:
                mhb mhbVar6 = mhb.NUMBER;
                this.c = u75.h(new azc(mhbVar6), new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhbVar6;
                break;
            case 13:
                mhb mhbVar7 = mhb.STRING;
                this.c = u75.h(new azc(mhbVar7), new azc(mhb.DICT), new azc(mhbVar7, true));
                this.b = mhbVar7;
                break;
            case 14:
                mhb mhbVar8 = mhb.STRING;
                this.c = u75.h(new azc(mhbVar8), new azc(mhb.DICT), new azc(mhbVar8, true));
                this.b = mhb.URL;
                break;
            case 15:
                mhb mhbVar9 = mhb.URL;
                this.c = u75.h(new azc(mhbVar9), new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhbVar9;
                break;
            case 16:
                azc azcVar = new azc(mhb.DICT);
                mhb mhbVar10 = mhb.STRING;
                this.c = u75.h(azcVar, new azc(mhbVar10, true));
                this.b = mhbVar10;
                break;
            case 17:
                this.c = t75.c(new azc(mhb.DICT));
                this.b = mhb.ARRAY;
                break;
            case 18:
                this.c = t75.c(new azc(mhb.DICT));
                this.b = mhb.ARRAY;
                break;
            case 19:
                this.c = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhb.URL;
                break;
            default:
                this.c = u75.h(new azc(mhb.DICT), new azc(mhb.STRING, true));
                this.b = mhb.ARRAY;
                break;
        }
    }

    @Override // defpackage.oyc
    public Object a(g06 g06Var, jhb jhbVar, List list) {
        Object t7oVar;
        long longValue;
        String b0;
        String b02;
        int i = this.a;
        mhb mhbVar = this.b;
        switch (i) {
            case 0:
                list.getClass();
                Object D = xp3.D(c(), list, j());
                JSONArray jSONArray = D instanceof JSONArray ? (JSONArray) D : null;
                if (jSONArray != null) {
                    return jSONArray;
                }
                xp3.i0(c(), list, mhbVar, D, j());
                throw null;
            case 1:
            case 2:
            default:
                list.getClass();
                Object D2 = xp3.D(c(), list, j());
                String str = D2 instanceof String ? (String) D2 : null;
                if (str != null && (b02 = xp3.b0(str)) != null) {
                    return new lpt(b02);
                }
                xp3.i0(c(), list, mhbVar, D2, j());
                throw null;
            case 3:
                list.getClass();
                Object D3 = xp3.D(c(), list, j());
                Boolean bool = D3 instanceof Boolean ? (Boolean) D3 : null;
                if (bool != null) {
                    return bool;
                }
                xp3.i0(c(), list, mhbVar, D3, j());
                throw null;
            case 4:
                list.getClass();
                Object D4 = xp3.D(c(), list, j());
                if (!(D4 instanceof String)) {
                    xp3.i0(c(), list, mhbVar, D4, j());
                    throw null;
                }
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = new c85(bow.v((String) D4));
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (z7o.a(t7oVar) == null) {
                    return t7oVar;
                }
                xp3.f0(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
                throw null;
            case 5:
                list.getClass();
                Object D5 = xp3.D(c(), list, j());
                JSONObject jSONObject = D5 instanceof JSONObject ? (JSONObject) D5 : null;
                if (jSONObject != null) {
                    return jSONObject;
                }
                xp3.i0(c(), list, mhbVar, D5, j());
                throw null;
            case 6:
                list.getClass();
                Object D6 = xp3.D(c(), list, j());
                if (D6 instanceof Integer) {
                    longValue = ((Number) D6).intValue();
                } else {
                    if (!(D6 instanceof Long)) {
                        if (D6 instanceof BigInteger) {
                            xp3.h0(c(), "Integer overflow.", list, j());
                            throw null;
                        }
                        if (D6 instanceof BigDecimal) {
                            xp3.h0(c(), "Cannot convert value to integer.", list, j());
                            throw null;
                        }
                        if (!(D6 instanceof Double)) {
                            xp3.i0(c(), list, mhbVar, D6, j());
                            throw null;
                        }
                        Number number = (Number) D6;
                        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                            xp3.h0(c(), "Integer overflow.", list, j());
                            throw null;
                        }
                        long c = eeh.c(number.doubleValue());
                        if (number.doubleValue() - c == 0.0d) {
                            return Long.valueOf(c);
                        }
                        xp3.h0(c(), "Cannot convert value to integer.", list, j());
                        throw null;
                    }
                    longValue = ((Number) D6).longValue();
                }
                return Long.valueOf(longValue);
            case 7:
                list.getClass();
                Object D7 = xp3.D(c(), list, j());
                Number number2 = D7 instanceof Number ? (Number) D7 : null;
                if (number2 != null) {
                    return Double.valueOf(number2.doubleValue());
                }
                xp3.i0(c(), list, mhbVar, D7, j());
                throw null;
            case 8:
                Boolean bool2 = (Boolean) ouj.i(list, 0);
                Object G = xp3.G(list, bool2, false);
                Boolean bool3 = G instanceof Boolean ? (Boolean) G : null;
                return bool3 == null ? bool2 : bool3;
            case 9:
                int i2 = ((c85) ouj.i(list, 0)).a;
                Object G2 = xp3.G(list, new c85(i2), false);
                c85 a0 = xp3.a0(G2 instanceof String ? (String) G2 : null);
                return a0 == null ? new c85(i2) : a0;
            case 10:
                String str2 = (String) ouj.i(list, 0);
                Object G3 = xp3.G(list, str2, false);
                c85 a02 = xp3.a0(G3 instanceof String ? (String) G3 : null);
                if (a02 != null || (a02 = xp3.a0(str2)) != null) {
                    return a02;
                }
                xp3.f0(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
                throw null;
            case 11:
                Long l = (Long) ouj.i(list, 0);
                long longValue2 = l.longValue();
                Object G4 = xp3.G(list, l, false);
                if (G4 instanceof Integer) {
                    longValue2 = ((Number) G4).intValue();
                } else if (G4 instanceof Long) {
                    longValue2 = ((Number) G4).longValue();
                }
                return Long.valueOf(longValue2);
            case 12:
                Double d = (Double) ouj.i(list, 0);
                Object G5 = xp3.G(list, d, false);
                Number number3 = G5 instanceof Number ? (Number) G5 : null;
                return number3 != null ? Double.valueOf(number3.doubleValue()) : d;
            case 13:
                String str3 = (String) ouj.i(list, 0);
                Object G6 = xp3.G(list, str3, false);
                String str4 = G6 instanceof String ? (String) G6 : null;
                return str4 == null ? str3 : str4;
            case 14:
                String str5 = (String) ouj.i(list, 0);
                Object G7 = xp3.G(list, str5, false);
                String b03 = xp3.b0(G7 instanceof String ? (String) G7 : null);
                if (b03 != null) {
                    return new lpt(b03);
                }
                String b04 = xp3.b0(str5);
                if (b04 != null) {
                    return new lpt(b04);
                }
                xp3.f0(c(), "Unable to convert value to Url.", list);
                throw null;
            case 15:
                String str6 = ((lpt) ouj.i(list, 0)).a;
                Object G8 = xp3.G(list, new lpt(str6), false);
                String str7 = G8 instanceof String ? (String) G8 : null;
                return (str7 == null || (b0 = xp3.b0(str7)) == null) ? new lpt(str6) : new lpt(b0);
            case 16:
                list.getClass();
                Object D8 = xp3.D(c(), list, j());
                String str8 = D8 instanceof String ? (String) D8 : null;
                if (str8 != null) {
                    return str8;
                }
                xp3.i0(c(), list, mhbVar, D8, j());
                throw null;
            case 17:
                JSONObject jSONObject2 = (JSONObject) ouj.i(list, 0);
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> keys = jSONObject2.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    jSONArray2.put(keys.next());
                }
                return jSONArray2;
            case 18:
                JSONObject jSONObject3 = (JSONObject) ouj.i(list, 0);
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> keys2 = jSONObject3.keys();
                keys2.getClass();
                while (keys2.hasNext()) {
                    jSONArray3.put(jSONObject3.get(keys2.next()));
                }
                return jSONArray3;
        }
    }

    @Override // defpackage.oyc
    public List b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.oyc
    public final mhb d() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        switch (this.a) {
        }
        return false;
    }

    public boolean j() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 16:
                break;
        }
        return false;
    }

    public by0(mhb mhbVar, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = mhbVar;
                this.c = u75.h(new azc(mhb.ARRAY), new azc(mhb.INTEGER), new azc(mhbVar));
                break;
            default:
                this.b = mhbVar;
                this.c = u75.h(new azc(mhb.ARRAY), new azc(mhb.INTEGER));
                break;
        }
    }
}
