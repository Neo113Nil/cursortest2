package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt___StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j1 {
    public static final y8 a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        bigDecimal.getClass();
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put("q", i);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", brazeProperties.getJsonKey());
        }
        return new k1(w7.f, jSONObject, 0.0d, 12);
    }

    public static final y8 b(Throwable th, ye yeVar, boolean z) {
        String str;
        String name = th.getClass().getName();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (yeVar != null) {
            str = "session_id: " + yeVar;
        } else {
            str = null;
        }
        k1.g.getClass();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        String take = StringsKt___StringsKt.take(5000, stringWriter2);
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("\n                original_sdk_version: 42.2.0\n                exception_class: ", availableProcessors, name, "\n                available_cpus: ", "\n                ");
        m.append(str);
        m.append("\n                ");
        m.append(take);
        m.append("\n            ");
        JSONObject put = new JSONObject().put("e", StringsKt__IndentKt.replaceIndent(m.toString()));
        if (!z) {
            put.put("nop", true);
        }
        w7 w7Var = w7.j;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 f(String str, String str2) {
        ye yeVar;
        JSONObject jSONObject = new JSONObject(str);
        String string2 = jSONObject.getString("name");
        v7 v7Var = w7.b;
        string2.getClass();
        v7Var.getClass();
        Object obj = w7.c.get(string2);
        if (obj == null) {
            obj = w7.J;
        }
        w7 w7Var = (w7) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        double d = jSONObject.getDouble("time");
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String optionalString2 = JsonUtils.getOptionalString(jSONObject, "session_id");
        jSONObject2.getClass();
        w7Var.getClass();
        str2.getClass();
        k1 k1Var = new k1(w7Var, jSONObject2, d, str2);
        k1Var.e.setValue(k1Var, k1.h[0], optionalString);
        if (optionalString2 != null) {
            UUID fromString = UUID.fromString(optionalString2);
            fromString.getClass();
            yeVar = new ye(fromString);
        } else {
            yeVar = null;
        }
        k1Var.a(yeVar);
        return k1Var;
    }

    public static final y8 h(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.n, jSONObject, 0.0d, 12);
    }

    public static final y8 j(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.o, jSONObject, 0.0d, 12);
    }

    public static final y8 l(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.m, jSONObject, 0.0d, 12);
    }

    public static final y8 n(String str, String str2) {
        return new k1(w7.t, k1.g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final y8 p(String str, String str2) {
        JSONObject put = new JSONObject().put("cid", str).put("a", str2);
        w7 w7Var = w7.g;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 r(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put("value", str2);
        w7 w7Var = w7.r;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 t(String str, String str2) {
        JSONObject put = new JSONObject().put("a", str).put("l", str2);
        w7 w7Var = w7.x;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public final y8 e(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 2));
    }

    public final y8 g(String str) {
        str.getClass();
        return a(new b9$$ExternalSyntheticLambda0(str, 15));
    }

    public final y8 i(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 5));
    }

    public final y8 k(String str) {
        str.getClass();
        return a(new b9$$ExternalSyntheticLambda0(str, 16));
    }

    public final y8 m(String str) {
        str.getClass();
        return a(new b9$$ExternalSyntheticLambda0(str, 18));
    }

    public final y8 o(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 0));
    }

    public final y8 q(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 7));
    }

    public final y8 s(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 6));
    }

    public final y8 k(String str, String str2) {
        str.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 4));
    }

    public final y8 m(String str, String str2) {
        str.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 3));
    }

    public final y8 e(String str) {
        str.getClass();
        return a(new b9$$ExternalSyntheticLambda0(str, 14));
    }

    public final y8 i(String str) {
        str.getClass();
        return a(new b9$$ExternalSyntheticLambda0(str, 17));
    }

    public static final y8 n(String str) {
        return new k1(w7.v, k1.g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public static final y8 j(String str, String str2) {
        return new k1(w7.w, k1.g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final y8 l(String str, String str2) {
        return new k1(w7.u, k1.g.a(str, (String) null, str2), 0.0d, 12);
    }

    public final y8 a(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties) {
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        return a(new j1$$ExternalSyntheticLambda14(brazeProperties, str, str2, bigDecimal, i));
    }

    public final y8 a(String str, BrazeProperties brazeProperties) {
        str.getClass();
        return a(new j1$$ExternalSyntheticLambda4(str, brazeProperties, 0));
    }

    public final y8 a(Throwable th, ye yeVar, boolean z) {
        th.getClass();
        return a(new g6$$ExternalSyntheticLambda11(th, yeVar, z, 2));
    }

    public final y8 a(String str, int i) {
        str.getClass();
        return a(new j1$$ExternalSyntheticLambda6(str, i, 0));
    }

    public final y8 a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new j1$$ExternalSyntheticLambda7(str, str2, 1));
    }

    public final y8 a(String str, String[] strArr) {
        str.getClass();
        return a(new n$$ExternalSyntheticLambda0(16, str, strArr));
    }

    public final y8 a(ye yeVar) {
        yeVar.getClass();
        return a(new h$$ExternalSyntheticLambda0(yeVar, 11));
    }

    public final y8 a(long j) {
        return a(new c6$$ExternalSyntheticLambda0(j, 7));
    }

    public final y8 a(String str, double d, double d2) {
        str.getClass();
        return a(new j1$$ExternalSyntheticLambda10(str, d, d2, 0));
    }

    public final y8 a(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        return a(new j1$$ExternalSyntheticLambda21(str, jSONObject, 0));
    }

    public final y8 a(String str, mf mfVar) {
        str.getClass();
        mfVar.getClass();
        return a(new n$$ExternalSyntheticLambda0(17, str, mfVar));
    }

    public final JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put("message_extras", str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(11), 6, (Object) null);
        return jSONObject;
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final y8 a(Function0 function0) {
        try {
            return (y8) function0.invoke();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(12), 4, (Object) null);
            return null;
        }
    }

    public static final y8 f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new k1(w7.l, jSONObject, 0.0d, 12);
    }

    public static final y8 b(String str, BrazeProperties brazeProperties) {
        JSONObject put = new JSONObject().put("n", str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            put.put("p", brazeProperties.getJsonKey());
        }
        w7 w7Var = w7.e;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, int i) {
        JSONObject put = new JSONObject().put("key", str).put("value", i);
        w7 w7Var = w7.p;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put("value", str2);
        w7 w7Var = w7.q;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
        }
        return new k1(w7.s, jSONObject, 0.0d, 12);
    }

    public static final y8 b(ye yeVar) {
        k1 k1Var = new k1(w7.y, (JSONObject) null, 0.0d, 14);
        k1Var.a(yeVar);
        return k1Var;
    }

    public static final y8 b(long j) {
        JSONObject put = new JSONObject().put("d", j);
        w7 w7Var = w7.z;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, double d, double d2) {
        JSONObject put = new JSONObject().put("key", str).put("latitude", d).put("longitude", d2);
        w7 w7Var = w7.A;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, JSONObject jSONObject) {
        JSONObject put = new JSONObject().put("key", str).put("value", jSONObject);
        w7 w7Var = w7.C;
        put.getClass();
        return new k1(w7Var, put, 0.0d, 12);
    }

    public static final y8 b(String str, mf mfVar) {
        String str2;
        JSONObject put = new JSONObject().put("group_id", str);
        int ordinal = mfVar.ordinal();
        if (ordinal == 0) {
            str2 = "subscribed";
        } else if (ordinal == 1) {
            str2 = "unsubscribed";
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        JSONObject put2 = put.put("status", str2);
        w7 w7Var = w7.D;
        put2.getClass();
        return new k1(w7Var, put2, 0.0d, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
