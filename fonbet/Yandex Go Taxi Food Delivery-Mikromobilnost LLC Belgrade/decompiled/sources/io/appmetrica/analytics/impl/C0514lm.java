package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0514lm extends Aj {
    public final C0337fi b;

    public C0514lm(S5 s5) {
        this(s5, Jb.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(k6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.b.b(C0251ci.a(jSONObject));
        return false;
    }

    public C0514lm(S5 s5, C0337fi c0337fi) {
        super(s5);
        this.b = c0337fi;
    }
}
