package defpackage;

import com.yandex.messaging.miniapps.js.ChannelMessageType;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class uh20 {
    public final lh20 a;
    public final vh20 b;
    public final String c;

    public uh20(lh20 lh20Var, wh20 wh20Var, vh20 vh20Var) {
        this.a = lh20Var;
        this.b = vh20Var;
        this.c = wh20Var.b();
    }

    public final JSONObject a(ChannelMessageType channelMessageType, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channelId", this.c);
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        jSONObject.put("id", str);
        jSONObject.put("type", channelMessageType.getValue());
        if (str2 != null) {
            jSONObject.put("refId", str2);
        }
        return jSONObject;
    }
}
