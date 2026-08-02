package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.DateTimeUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class de implements IPutIntoJson {
    public final String a;
    public final long b;

    public de(String str) {
        str.getClass();
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        str.getClass();
        this.a = str;
        this.b = nowInMilliseconds;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        return new JSONObject().put("log", this.a).put("time", this.b);
    }
}
