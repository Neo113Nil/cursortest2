package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Banner;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$DynamicOverlaySheet;

/* loaded from: classes3.dex */
public final class tj5 implements rj5 {
    public final Gson a;

    public tj5(Gson gson) {
        this.a = gson;
    }

    public static InternalCommunicationTrigger$Banner.Data.Theme a(JsonObject jsonObject) {
        JsonElement v = jsonObject.v("titleColor");
        String I = v != null ? cxb.I(v) : null;
        JsonElement v2 = jsonObject.v("subtitleColor");
        String I2 = v2 != null ? cxb.I(v2) : null;
        JsonElement v3 = jsonObject.v("bgColor");
        String I3 = v3 != null ? cxb.I(v3) : null;
        JsonElement v4 = jsonObject.v("bgUrl");
        return new InternalCommunicationTrigger$Banner.Data.Theme(I, I2, I3, v4 != null ? cxb.I(v4) : null);
    }

    public static InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction b(JsonObject jsonObject) {
        String I;
        JsonElement v;
        String I2;
        JsonElement v2 = jsonObject.v(ConnectableDevice.KEY_ID);
        if (v2 == null || (I = cxb.I(v2)) == null || (v = jsonObject.v("uri")) == null || (I2 = cxb.I(v)) == null) {
            return null;
        }
        return new InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction(I2, I);
    }
}
