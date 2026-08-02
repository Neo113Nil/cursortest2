package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class rg implements y9 {
    public final String a;
    public final nd b;
    public final boolean c;
    public ng d;
    public final ArrayList e;

    public rg(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        String string2 = jSONObject.getString("id");
        string2.getClass();
        this.a = string2;
        this.b = new nd(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            arrayList.addAll(og.a(jSONArray));
        }
        this.c = jSONObject.optBoolean("prefetch", true);
    }

    public static final String a(rg rgVar, v9 v9Var) {
        return Boxes$$ExternalSyntheticOutline1.m("Triggered action ", rgVar.a, " not eligible to be triggered by ", v9Var.a(), " event. Current device time outside triggered action time window.");
    }

    public final boolean b(v9 v9Var) {
        v9Var.getClass();
        if ((this.b.a != -1 && DateTimeUtils.nowInSeconds() <= this.b.a) || (this.b.b != -1 && DateTimeUtils.nowInSeconds() >= this.b.b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(28, this, v9Var), 7, (Object) null);
            return false;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                i2 = -1;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((u9) obj).a(v9Var)) {
                break;
            }
            i2++;
        }
        return i2 != -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonObject() {
        try {
            JSONObject jsonObject = this.b.getJsonObject();
            if (jsonObject == null) {
                return null;
            }
            jsonObject.put("id", this.a);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((u9) obj).getJsonObject());
            }
            jsonObject.put("trigger_condition", jSONArray);
            jsonObject.put("prefetch", this.c);
            return jsonObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
