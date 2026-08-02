package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jb implements IPutIntoJson, l9 {
    public final long a;
    public final boolean b;

    public jb(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.a);
        return jSONObject;
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        return !this.b;
    }
}
