package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class e5f {
    public static final i86 a = new i86(Collections.EMPTY_LIST);

    public static szb a(t7k t7kVar, JSONObject jSONObject, String str, uct uctVar) {
        return b(t7kVar, jSONObject, str, uctVar, bcx.i, bcx.h);
    }

    public static szb b(t7k t7kVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1, ywt ywtVar) {
        Object opt = jSONObject.opt(str);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        Object obj = opt;
        if (obj == null) {
            throw a8k.g(str, jSONObject);
        }
        if ((obj instanceof String) && StringsKt.M((CharSequence) obj, "@{", false)) {
            return new pzb(str, obj.toString(), function1, ywtVar, t7kVar.a(), uctVar, null);
        }
        try {
            Object invoke = function1.invoke(obj);
            if (invoke == null) {
                throw a8k.e(jSONObject, str, obj);
            }
            if (!uctVar.b(invoke)) {
                throw a8k.l(jSONObject, str, obj);
            }
            try {
                if (ywtVar.a(invoke)) {
                    return invoke instanceof String ? new qzb(t7kVar.a(), (String) invoke) : new ozb(invoke);
                }
                throw a8k.e(jSONObject, str, obj);
            } catch (ClassCastException unused) {
                throw a8k.l(jSONObject, str, obj);
            }
        } catch (ClassCastException unused2) {
            throw a8k.l(jSONObject, str, obj);
        } catch (Exception e) {
            throw a8k.f(jSONObject, str, obj, e);
        }
    }

    public static szb c(t7k t7kVar, JSONObject jSONObject, String str) {
        return e(t7kVar, jSONObject, str, vct.c, bcx.i, bcx.h, null);
    }

    public static szb d(t7k t7kVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1) {
        return e(t7kVar, jSONObject, str, uctVar, function1, bcx.h, null);
    }

    public static szb e(t7k t7kVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1, ywt ywtVar, szb szbVar) {
        Object opt = jSONObject.opt(str);
        Object obj = opt == JSONObject.NULL ? null : opt;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) && StringsKt.M((CharSequence) obj, "@{", false)) {
            return new pzb(str, obj.toString(), function1, ywtVar, t7kVar.a(), uctVar, szbVar);
        }
        try {
            Object invoke = function1.invoke(obj);
            if (invoke == null) {
                t7kVar.a().a(a8k.e(jSONObject, str, obj));
                return null;
            }
            if (!uctVar.b(invoke)) {
                t7kVar.a().a(a8k.l(jSONObject, str, obj));
                return null;
            }
            try {
                if (ywtVar.a(invoke)) {
                    return invoke instanceof String ? new qzb(t7kVar.a(), (String) invoke) : new ozb(invoke);
                }
                t7kVar.a().a(a8k.e(jSONObject, str, obj));
                return null;
            } catch (ClassCastException unused) {
                t7kVar.a().a(a8k.l(jSONObject, str, obj));
                return null;
            }
        } catch (ClassCastException unused2) {
            t7kVar.a().a(a8k.l(jSONObject, str, obj));
            return null;
        } catch (Exception e) {
            t7kVar.a().a(a8k.f(jSONObject, str, obj, e));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vzb f(t7k t7kVar, JSONObject jSONObject, String str, uct uctVar, mag magVar) {
        boolean z;
        int i;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        i86 i86Var = a;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!magVar.b(list)) {
                    t7kVar.a().a(a8k.e(jSONObject, str, list));
                }
                return i86Var;
            } catch (ClassCastException unused) {
                t7kVar.a().a(a8k.l(jSONObject, str, list));
                return i86Var;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        boolean z2 = 0;
        int i2 = 0;
        boolean z3 = false;
        y7k y7kVar = null;
        while (i2 < length) {
            Object opt = optJSONArray.opt(i2);
            Object obj = opt == JSONObject.NULL ? null : opt;
            if (obj == null) {
                z = z2;
                i = i2;
            } else if ((obj instanceof String) && StringsKt.M((CharSequence) obj, "@{", z2)) {
                if (y7kVar == null) {
                    y7kVar = t7kVar.a();
                }
                i = i2;
                z = z2;
                arrayList.add(new pzb(str + "[" + i2 + "]", obj.toString(), kzjVar, ns9Var, y7kVar, uctVar, null));
                z3 = true;
            } else {
                z = z2;
                i = i2;
                try {
                    Object invoke = kzjVar.invoke(obj);
                    if (uctVar.b(invoke)) {
                        arrayList.add(invoke);
                    } else {
                        t7kVar.a().a(a8k.k(optJSONArray, str, i, obj));
                    }
                } catch (ClassCastException unused2) {
                    t7kVar.a().a(a8k.k(optJSONArray, str, i, obj));
                } catch (Exception e) {
                    t7kVar.a().a(a8k.d(optJSONArray, str, i, obj, e));
                }
            }
            i2 = i + 1;
            z2 = z;
        }
        int i3 = z2;
        if (!z3) {
            try {
                if (magVar.b(arrayList)) {
                    return new i86(arrayList);
                }
                t7kVar.a().a(a8k.e(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused3) {
                t7kVar.a().a(a8k.l(jSONObject, str, arrayList));
                return null;
            }
        }
        int size = arrayList.size();
        for (int i4 = i3; i4 < size; i4++) {
            Object obj2 = arrayList.get(i4);
            if (!(obj2 instanceof szb)) {
                arrayList.set(i4, obj2 instanceof String ? new qzb(t7kVar.a(), (String) obj2) : new ozb(obj2));
            }
        }
        return new ooi(str, arrayList, magVar, t7kVar.a());
    }

    public static void g(t7k t7kVar, JSONObject jSONObject, String str, szb szbVar) {
        if (szbVar == null) {
            return;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put(str, b);
            } else {
                jSONObject.put(str, b);
            }
        } catch (JSONException e) {
            t7kVar.a().a(e);
        }
    }

    public static void h(t7k t7kVar, JSONObject jSONObject, String str, szb szbVar, Function1 function1) {
        if (szbVar == null) {
            return;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put(str, b);
            } else {
                jSONObject.put(str, function1.invoke(b));
            }
        } catch (JSONException e) {
            t7kVar.a().a(e);
        }
    }

    public static void i(t7k t7kVar, JSONObject jSONObject, vzb vzbVar) {
        if (vzbVar == null) {
            return;
        }
        boolean z = vzbVar instanceof i86;
        int i = 0;
        wzb wzbVar = xzb.a;
        if (z) {
            List a2 = vzbVar.a(wzbVar);
            int size = a2.size();
            JSONArray jSONArray = new JSONArray();
            while (i < size) {
                jSONArray.put(c85.a(((Number) a2.get(i)).intValue()));
                i++;
            }
            try {
                jSONObject.put("colors", jSONArray);
                return;
            } catch (JSONException e) {
                t7kVar.a().a(e);
                return;
            }
        }
        if (vzbVar instanceof ooi) {
            ArrayList arrayList = ((ooi) vzbVar).b;
            if (arrayList.isEmpty()) {
                return;
            }
            int size2 = arrayList.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i < size2) {
                szb szbVar = (szb) arrayList.get(i);
                if (szbVar instanceof ozb) {
                    jSONArray2.put(c85.a(((Number) szbVar.a(wzbVar)).intValue()));
                } else {
                    jSONArray2.put(szbVar.b());
                }
                i++;
            }
            try {
                jSONObject.put("colors", jSONArray2);
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
    }
}
