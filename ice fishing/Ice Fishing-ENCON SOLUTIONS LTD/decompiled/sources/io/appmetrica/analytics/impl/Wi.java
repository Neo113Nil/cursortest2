package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Wi extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0770tf f5312b;

    public Wi(X4 x4) {
        this(x4, C0610na.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(p5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f5312b.b(C0693qf.a(jSONObject));
        return false;
    }

    public Wi(X4 x4, C0770tf c0770tf) {
        super(x4);
        this.f5312b = c0770tf;
    }
}
