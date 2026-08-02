package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ic extends i2 {
    public final ArrayList l;
    public final boolean m;
    public final c9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(ue ueVar, String str, String str2, ArrayList arrayList) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "push/delivery_events"), false), str2, ueVar, 8);
        ueVar.getClass();
        str.getClass();
        arrayList.getClass();
        this.l = arrayList;
        this.m = arrayList.isEmpty();
        this.n = c9.h;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dc dcVar = (dc) obj;
                dcVar.e.setValue(dcVar, k1.h[0], this.b);
                jSONArray.put(dcVar.getJsonKey());
            }
            a.put("events", jSONArray);
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                a.put("user_id", this.b);
            }
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(10), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.n;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return this.m;
    }
}
