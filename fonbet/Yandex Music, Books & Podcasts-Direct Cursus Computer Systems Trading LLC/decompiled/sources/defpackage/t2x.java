package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t2x extends o3x {
    public final /* synthetic */ double r;
    public final /* synthetic */ xun s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2x(xun xunVar, double d) {
        super(xunVar, false);
        this.r = d;
        this.s = xunVar;
    }

    @Override // defpackage.o3x
    public final void l() {
        w1x w1xVar = this.s.c;
        c2x m = m();
        double d = this.r;
        if (w1xVar.f == null) {
            throw new s1x();
        }
        JSONObject jSONObject = new JSONObject();
        long l = w1xVar.l();
        try {
            jSONObject.put("requestId", l);
            jSONObject.put("type", "SET_PLAYBACK_RATE");
            jSONObject.put("playbackRate", d);
            y1g.H(w1xVar.f, "mediaStatus should not be null");
            jSONObject.put("mediaSessionId", w1xVar.f.b);
        } catch (JSONException unused) {
        }
        w1xVar.m(l, jSONObject.toString());
        w1xVar.v.a(l, m);
    }
}
