package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sd {
    public static final String b() {
        return "Error getting required SDK debugging fields in SdkDebugManager. Disabling SDK debugging.";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b A[Catch: JSONException -> 0x001d, TryCatch #0 {JSONException -> 0x001d, blocks: (B:33:0x0012, B:4:0x0023, B:6:0x002b, B:7:0x0031, B:9:0x0037, B:10:0x0041, B:12:0x0068, B:16:0x0086, B:18:0x008a, B:20:0x0096, B:31:0x0072), top: B:32:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[Catch: JSONException -> 0x001d, TryCatch #0 {JSONException -> 0x001d, blocks: (B:33:0x0012, B:4:0x0023, B:6:0x002b, B:7:0x0031, B:9:0x0037, B:10:0x0041, B:12:0x0068, B:16:0x0086, B:18:0x008a, B:20:0x0096, B:31:0x0072), top: B:32:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final td a(JSONObject jSONObject, boolean z) {
        boolean z2;
        Long l;
        jSONObject.getClass();
        td tdVar = new td();
        boolean z3 = true;
        boolean z4 = false;
        if (!z) {
            try {
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(2), 4, (Object) null);
            }
            if (!jSONObject.getBoolean("enabled")) {
                z2 = false;
                tdVar.a = z2;
                if (jSONObject.has("authorization_code")) {
                    tdVar.c = jSONObject.getString("authorization_code");
                }
                if (jSONObject.has("expiration_time")) {
                    tdVar.b = Long.valueOf(jSONObject.getLong("expiration_time"));
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("batching_config");
                tdVar.d = jSONObject2.getLong("flush_interval_size");
                tdVar.e = jSONObject2.getLong("flush_interval_seconds");
                long j = jSONObject2.getLong("max_payload_size");
                tdVar.f = j;
                if (tdVar.d > 0 || tdVar.e <= 0 || j <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 9), 7, (Object) null);
                    z4 = true;
                }
                l = tdVar.b;
                if (l != null || l.longValue() >= DateTimeUtils.nowInSeconds()) {
                    z3 = z4;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w$$ExternalSyntheticLambda0(1), 7, (Object) null);
                }
                return !z3 ? new td() : tdVar;
            }
        }
        z2 = true;
        tdVar.a = z2;
        if (jSONObject.has("authorization_code")) {
        }
        if (jSONObject.has("expiration_time")) {
        }
        JSONObject jSONObject22 = jSONObject.getJSONObject("batching_config");
        tdVar.d = jSONObject22.getLong("flush_interval_size");
        tdVar.e = jSONObject22.getLong("flush_interval_seconds");
        long j2 = jSONObject22.getLong("max_payload_size");
        tdVar.f = j2;
        if (tdVar.d > 0) {
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 9), 7, (Object) null);
        z4 = true;
        l = tdVar.b;
        if (l != null) {
        }
        z3 = z4;
        if (!z3) {
        }
    }

    public static final String a(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}
