package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class we implements IPutIntoJson {
    public final ye a;
    public final double b;
    public Double c;
    public boolean d;

    public we(JSONObject jSONObject) {
        jSONObject.getClass();
        String string2 = jSONObject.getString("session_id");
        string2.getClass();
        string2.getClass();
        UUID fromString = UUID.fromString(string2);
        fromString.getClass();
        this.a = new ye(fromString);
        this.b = jSONObject.getDouble("start_time");
        this.d = jSONObject.getBoolean("is_sealed");
        this.c = JsonUtils.getDoubleOrNull(jSONObject, "end_time");
    }

    public static final String a(double d, we weVar) {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("End time '", "' for session is less than the start time '", d), weVar.b, "' for this session.");
    }

    public static final String b() {
        return "Caught exception creating Session Json.";
    }

    public final long c() {
        Double d = d();
        if (d == null) {
            return -1L;
        }
        double doubleValue = d.doubleValue();
        long j = (long) (doubleValue - this.b);
        if (j < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new we$$ExternalSyntheticLambda0(doubleValue, this, 0), 6, (Object) null);
        }
        return j;
    }

    public Double d() {
        return this.c;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.a);
            jSONObject.put("start_time", this.b);
            jSONObject.put("is_sealed", this.d);
            if (d() == null) {
                return jSONObject;
            }
            jSONObject.put("end_time", d());
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(25), 4, (Object) null);
            return jSONObject;
        }
    }

    public String toString() {
        ye yeVar = this.a;
        double d = this.b;
        Double d2 = d();
        boolean z = this.d;
        long c = c();
        StringBuilder sb = new StringBuilder("\nSession(sessionId=");
        sb.append(yeVar);
        sb.append(", startTime=");
        sb.append(d);
        sb.append(", endTime=");
        sb.append(d2);
        sb.append(", isSealed=");
        sb.append(z);
        return Boxes$$ExternalSyntheticOutline1.m(c, ", duration=", ")", sb);
    }

    public we(ye yeVar, double d, Double d2, boolean z) {
        yeVar.getClass();
        this.a = yeVar;
        this.b = d;
        ((za) this).c = d2;
        this.d = z;
    }
}
