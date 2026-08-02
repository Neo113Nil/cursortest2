package defpackage;

import com.connectsdk.device.ConnectableDevice;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ugu {
    public static final ugu b = new ugu();
    public final Charset a = Charsets.UTF_8;

    public final tgu a(FileInputStream fileInputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, this.a);
        try {
            String F = t7g.F(inputStreamReader);
            inputStreamReader.close();
            JSONObject jSONObject = new JSONObject(F);
            return new tgu(jSONObject.optString(ConnectableDevice.KEY_ID), rzf.w(jSONObject.getJSONObject("text")), rzf.w(jSONObject.getJSONObject("image")), rzf.w(jSONObject.getJSONObject("gifImage")), rzf.w(jSONObject.getJSONObject("overlapContainer")), rzf.w(jSONObject.getJSONObject("linearContainer")), rzf.w(jSONObject.getJSONObject("wrapContainer")), rzf.w(jSONObject.getJSONObject("grid")), rzf.w(jSONObject.getJSONObject("gallery")), rzf.w(jSONObject.getJSONObject("pager")), rzf.w(jSONObject.getJSONObject("tab")), rzf.w(jSONObject.getJSONObject("state")), rzf.w(jSONObject.getJSONObject("custom")), rzf.w(jSONObject.getJSONObject("indicator")), rzf.w(jSONObject.getJSONObject("slider")), rzf.w(jSONObject.getJSONObject("input")), rzf.w(jSONObject.getJSONObject("select")), rzf.w(jSONObject.getJSONObject("video")), rzf.w(jSONObject.getJSONObject("switch")));
        } finally {
        }
    }
}
