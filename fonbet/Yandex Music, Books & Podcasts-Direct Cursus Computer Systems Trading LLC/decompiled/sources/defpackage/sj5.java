package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/* loaded from: classes3.dex */
public final class sj5 {
    public final Gson a;

    public sj5(Gson gson) {
        this.a = gson;
    }

    public static bh5 a(JsonObject jsonObject) {
        String I;
        String I2;
        String I3;
        String I4;
        JsonElement v = jsonObject.v("titleColor");
        String str = null;
        String str2 = (v == null || (I4 = cxb.I(v)) == null) ? null : (String) avf.R(I4);
        JsonElement v2 = jsonObject.v("subtitleColor");
        String str3 = (v2 == null || (I3 = cxb.I(v2)) == null) ? null : (String) avf.R(I3);
        JsonElement v3 = jsonObject.v("bgColor");
        String str4 = (v3 == null || (I2 = cxb.I(v3)) == null) ? null : (String) avf.R(I2);
        JsonElement v4 = jsonObject.v("bgUrl");
        if (v4 != null && (I = cxb.I(v4)) != null) {
            str = (String) avf.R(I);
        }
        return new bh5(str2, str3, str4, str);
    }

    public static eh5 b(JsonObject jsonObject) {
        String I;
        String str;
        JsonElement v;
        String I2;
        String str2;
        JsonElement v2 = jsonObject.v("uri");
        if (v2 == null || (I = cxb.I(v2)) == null || (str = (String) avf.Q(I)) == null || (v = jsonObject.v(ConnectableDevice.KEY_ID)) == null || (I2 = cxb.I(v)) == null || (str2 = (String) avf.Q(I2)) == null) {
            return null;
        }
        return new eh5(str, str2);
    }

    public static gh5 c(JsonObject jsonObject) {
        String I;
        String str;
        JsonElement v;
        String I2;
        String str2;
        JsonElement v2 = jsonObject.v("light");
        if (v2 == null || (I = cxb.I(v2)) == null || (str = (String) avf.Q(I)) == null || (v = jsonObject.v("dark")) == null || (I2 = cxb.I(v)) == null || (str2 = (String) avf.Q(I2)) == null) {
            return null;
        }
        return new gh5(str, str2);
    }

    public static hh5 d(JsonObject jsonObject) {
        String I;
        String str;
        JsonObject G;
        JsonElement v = jsonObject.v("url");
        gh5 gh5Var = null;
        if (v == null || (I = cxb.I(v)) == null || (str = (String) avf.Q(I)) == null) {
            return null;
        }
        JsonElement v2 = jsonObject.v("image");
        if (v2 != null && (G = cxb.G(v2)) != null) {
            gh5Var = c(G);
        }
        return new hh5(str, gh5Var);
    }

    public static nh5 e(JsonObject jsonObject) {
        String I;
        String str;
        JsonElement v;
        String I2;
        String str2;
        JsonElement v2 = jsonObject.v(ConnectableDevice.KEY_ID);
        if (v2 == null || (I = cxb.I(v2)) == null || (str = (String) avf.R(I)) == null || (v = jsonObject.v("uri")) == null || (I2 = cxb.I(v)) == null || (str2 = (String) avf.R(I2)) == null) {
            return null;
        }
        return new nh5(str2, str);
    }
}
