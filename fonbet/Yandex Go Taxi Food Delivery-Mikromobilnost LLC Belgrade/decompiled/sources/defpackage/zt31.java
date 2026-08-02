package defpackage;

import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes11.dex */
public final class zt31 extends qly0 {
    public static final zt31 b = new zt31(0);

    @Override // defpackage.qly0
    public final yt31 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new yt31(jSONObject.optString("id"), f2a1.a(jSONObject.getJSONObject("text")), f2a1.a(jSONObject.getJSONObject("image")), f2a1.a(jSONObject.getJSONObject("gifImage")), f2a1.a(jSONObject.getJSONObject("overlapContainer")), f2a1.a(jSONObject.getJSONObject("linearContainer")), f2a1.a(jSONObject.getJSONObject("wrapContainer")), f2a1.a(jSONObject.getJSONObject("grid")), f2a1.a(jSONObject.getJSONObject("gallery")), f2a1.a(jSONObject.getJSONObject("pager")), f2a1.a(jSONObject.getJSONObject("tab")), f2a1.a(jSONObject.getJSONObject(ClidProvider.STATE)), f2a1.a(jSONObject.getJSONObject("custom")), f2a1.a(jSONObject.getJSONObject("indicator")), f2a1.a(jSONObject.getJSONObject("slider")), f2a1.a(jSONObject.getJSONObject("input")), f2a1.a(jSONObject.getJSONObject("select")), f2a1.a(jSONObject.getJSONObject(MediaStreamTrack.VIDEO_TRACK_KIND)), f2a1.a(jSONObject.getJSONObject("switch")));
    }
}
