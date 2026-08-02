package bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class tg extends rg {
    public HashMap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(JSONObject jSONObject) {
        super(jSONObject);
        jSONObject.getClass();
        this.f = new LinkedHashMap();
    }
}
