package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fak {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public fak(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString("class_name");
        string.getClass();
        this.a = string;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt(ConnectableDevice.KEY_ID);
        String optString = jSONObject.optString("text");
        optString.getClass();
        this.d = optString;
        String optString2 = jSONObject.optString("tag");
        optString2.getClass();
        this.e = optString2;
        String optString3 = jSONObject.optString(DeviceService.KEY_DESC);
        optString3.getClass();
        this.f = optString3;
        String optString4 = jSONObject.optString("hint");
        optString4.getClass();
        this.g = optString4;
        this.h = jSONObject.optInt("match_bitmask");
    }
}
