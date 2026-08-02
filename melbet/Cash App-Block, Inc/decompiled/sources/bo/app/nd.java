package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nd implements IPutIntoJson {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final vc f;
    public final int g;

    public nd(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optLong("start_time", -1L);
        this.b = jSONObject.optLong("end_time", -1L);
        this.c = jSONObject.optInt("priority", 0);
        this.g = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.d = jSONObject.optInt("delay", 0);
        this.e = jSONObject.optInt("timeout", -1);
        this.f = new vc(jSONObject);
    }

    public static final String b() {
        return "Could not convert ScheduleConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getValue() {
        try {
            JSONObject value = this.f.getValue();
            if (value == null) {
                return null;
            }
            value.put("start_time", this.a);
            value.put("end_time", this.b);
            value.put("priority", this.c);
            value.put("min_seconds_since_last_trigger", this.g);
            value.put("timeout", this.e);
            value.put("delay", this.d);
            return value;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n8$$ExternalSyntheticLambda1(9), 4, (Object) null);
            return null;
        }
    }
}
