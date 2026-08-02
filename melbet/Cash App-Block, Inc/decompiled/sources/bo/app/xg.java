package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xg extends b {
    public final p9 b;
    public final he c;
    public final u4 d;
    public final yg e;
    public String f;

    public xg(Context context, p9 p9Var, he heVar, u4 u4Var, String str, String str2) {
        context.getClass();
        p9Var.getClass();
        heVar.getClass();
        u4Var.getClass();
        this.b = p9Var;
        this.c = heVar;
        this.d = u4Var;
        this.e = new yg(context, str, str2);
        this.f = str;
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "]";
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + obj + "]";
    }

    public static final String e() {
        return "No push token available to add to attributes object.";
    }

    public static final String f() {
        return "Couldn't add push token to outbound json";
    }

    public static final String i() {
        return "Failed to add merged custom attributes back to user object.";
    }

    public static final String k() {
        return "Push token cache cleared via sendPushTokenOnNextExport.";
    }

    @Override // bo.app.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(mb mbVar, boolean z) {
        xg xgVar;
        mbVar.getClass();
        JSONObject jSONObject = mbVar.a;
        if (z) {
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_TOKEN;
            if (jSONObject.has(dataStoreKey.getKey())) {
                yg ygVar = this.e;
                String optString = jSONObject.optString("push_token");
                optString.getClass();
                ygVar.writeData(dataStoreKey, optString);
                return;
            }
            return;
        }
        JSONObject h = h();
        JSONObject plus = JsonUtils.plus(jSONObject, h);
        plus.remove("push_token");
        JSONObject optJSONObject = h.optJSONObject("custom");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("custom");
        try {
        } catch (JSONException e) {
            xgVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) xgVar, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(12), 4, (Object) null);
        }
        if (optJSONObject != null && optJSONObject2 != null) {
            plus.put("custom", JsonUtils.plus(optJSONObject2, optJSONObject));
        } else {
            if (optJSONObject == null) {
                if (optJSONObject2 != null) {
                    plus.put("custom", optJSONObject2);
                }
                xgVar = this;
                yg ygVar2 = xgVar.e;
                DataStoreKey dataStoreKey2 = DataStoreKey.SERIALIZED_USER_OBJECT;
                String jSONObject2 = plus.toString();
                jSONObject2.getClass();
                ygVar2.writeData(dataStoreKey2, jSONObject2);
            }
            plus.put("custom", optJSONObject);
        }
        xgVar = this;
        yg ygVar22 = xgVar.e;
        DataStoreKey dataStoreKey22 = DataStoreKey.SERIALIZED_USER_OBJECT;
        String jSONObject22 = plus.toString();
        jSONObject22.getClass();
        ygVar22.writeData(dataStoreKey22, jSONObject22);
    }

    public final boolean c(JSONObject jSONObject) {
        if (this.c.a() || this.d.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 29), 6, (Object) null);
            return false;
        }
        yg ygVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.SERIALIZED_USER_OBJECT;
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        ygVar.writeData(dataStoreKey, jSONObject2);
        return true;
    }

    public final JSONObject g() {
        JSONObject h = h();
        if (h.has("custom")) {
            try {
                JSONObject jSONObject = h.getJSONObject("custom");
                jSONObject.getClass();
                return jSONObject;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(13), 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public final JSONObject h() {
        String readString = this.e.readString(DataStoreKey.SERIALIZED_USER_OBJECT, null);
        if (readString == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(readString);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new x3$$ExternalSyntheticLambda2(readString, 8), 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void j() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(11), 6, (Object) null);
                this.e.clearData(DataStoreKey.PUSH_TOKEN);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // bo.app.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final mb c() {
        StringUtils.ifNonEmpty(this.f, new xg$$ExternalSyntheticLambda9(this, 0));
        JSONObject h = h();
        a(h);
        this.e.clearData(DataStoreKey.SERIALIZED_USER_OBJECT);
        return new mb(h);
    }

    public static final String d() {
        return "Could not create custom attributes json object from DataStore.";
    }

    public final boolean c(String str, Object obj) {
        Object obj2;
        str.getClass();
        JSONObject h = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new ld$$ExternalSyntheticLambda5(str, 2, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        h.put(str, obj2);
        return c(h);
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to load user object json from DataStore with json string: ", str);
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String b = ((tc) this.b).b();
            if (b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(9), 7, (Object) null);
            } else {
                if (b.equals(this.e.readString(DataStoreKey.PUSH_TOKEN, null))) {
                    return;
                }
                jSONObject.put("push_token", b);
            }
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(10), 4, (Object) null);
        }
    }

    public static final Unit a(xg xgVar, String str) {
        str.getClass();
        xgVar.c("user_id", str);
        return Unit.INSTANCE;
    }

    public static final String a(xg xgVar) {
        return Request$Priority$EnumUnboxingLocalUtility.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not writing to user cache.", xgVar.d.c(), xgVar.c.a());
    }

    public final boolean a(String str, Object obj) {
        Object obj2;
        str.getClass();
        JSONObject g = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new ld$$ExternalSyntheticLambda5(str, 3, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        g.put(str, obj2);
        return c("custom", g);
    }
}
