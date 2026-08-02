package com.braze.support;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.g7$$ExternalSyntheticLambda2;
import bo.app.l$$ExternalSyntheticLambda2;
import bo.app.og$$ExternalSyntheticLambda4;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    public static final c a = new c();
    public static final List b = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object"});

    public static final String b(Object obj) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((JSONObject) obj).toString().length(), "JSON Object size (", " bytes) exceeds 76800");
    }

    public static final boolean c(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(0), 6, (Object) null);
        return false;
    }

    public static final String d(Object obj) {
        return Boxes$$ExternalSyntheticOutline1.m("Could not add unsupported custom attribute type with value: ", obj);
    }

    public final Object a(Object obj, int i) {
        obj.getClass();
        if ((obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) obj);
        }
        if (obj instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new yf$$ExternalSyntheticLambda2((Date) obj, 6), 4, (Object) null);
                return null;
            }
        }
        if (obj instanceof JSONObject) {
            if (i == 0) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.toString().length() > 76800) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 16), 6, (Object) null);
                    return null;
                }
            }
            return a((JSONObject) obj, i + 1);
        }
        if (!(obj instanceof JSONArray)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda2(obj, 3), 6, (Object) null);
            return null;
        }
        if (i == 0) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new og$$ExternalSyntheticLambda4(1, jSONArray), 6, (Object) null);
                return null;
            }
        }
        return a((JSONArray) obj, i + 1);
    }

    public static final String d() {
        return "Custom attribute value cannot be null.";
    }

    public static final String b() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final String b(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Custom attribute key cannot be blocklisted attribute: ", str, ".");
    }

    public static final String c() {
        return "Custom attribute key cannot be null.";
    }

    public static final String c(Object obj) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((JSONArray) obj).toString().length(), "JSON Array size (", " bytes) exceeds 76800");
    }

    public final JSONObject a(JSONObject jSONObject, int i) {
        if (i > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(1), 7, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            c cVar = a;
            if ((StringsKt.isBlank(ensureBrazeFieldLength) | StringsKt.contains((CharSequence) ensureBrazeFieldLength, (CharSequence) "$", false) | StringsKt.contains((CharSequence) ensureBrazeFieldLength, (CharSequence) ".", false)) & (!b.contains(ensureBrazeFieldLength))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) cVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(next, 25), 6, (Object) null);
            }
            if (!StringsKt.isBlank(ensureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    obj.getClass();
                    Object a2 = cVar.a(obj, i);
                    if (a2 == null) {
                        return null;
                    }
                    jSONObject2.put(ensureBrazeFieldLength, a2);
                }
            }
        }
        return jSONObject2;
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Nested Custom Attribute Key '", str, "' is invalid.");
    }

    public final JSONArray a(JSONArray jSONArray, int i) {
        if (i > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(2), 7, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            obj.getClass();
            Object a2 = a(obj, i);
            if (a2 == null) {
                return null;
            }
            jSONArray2.put(a2);
        }
        return jSONArray2;
    }

    public static final String a() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final boolean a(String str, Set set) {
        set.getClass();
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(29), 6, (Object) null);
            return false;
        }
        if (!set.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(str, 24), 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return Boxes$$ExternalSyntheticOutline1.m("Error parsing date ", obj);
    }
}
