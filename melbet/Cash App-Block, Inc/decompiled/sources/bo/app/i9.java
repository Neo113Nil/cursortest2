package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i9 {
    public static final /* synthetic */ i9 a = new i9();

    public static final String b(JSONObject jSONObject) {
        return "Failed to parse json. Returning unknown.\n" + jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r0 > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k9 a(JSONObject jSONObject) {
        String optString;
        Long l;
        String optString2;
        jSONObject.getClass();
        String string2 = jSONObject.getString("type");
        j9 j9Var = j9.UNKNOWN;
        if (Intrinsics.areEqual(string2, "ccr")) {
            return new w5();
        }
        String str = null;
        if (Intrinsics.areEqual(string2, "ttl")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("body");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("t_ms", -1L);
                l = Long.valueOf(optLong);
            }
            l = null;
            if (optJSONObject != null && (optString2 = optJSONObject.optString("rcs")) != null && optString2.length() > 0) {
                str = optString2;
            }
            return new p6(l, str);
        }
        if (!Intrinsics.areEqual(string2, "ddr")) {
            if (Intrinsics.areEqual(string2, "ffr")) {
                return new y5();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 1), 7, (Object) null);
            return new q6();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("body");
        long optLong2 = optJSONObject2 != null ? optJSONObject2.optLong("r_ms", 500L) : 500L;
        if (optJSONObject2 != null && (optString = optJSONObject2.optString("e")) != null && optString.length() > 0) {
            str = optString;
        }
        return new x5(optLong2, str);
    }
}
