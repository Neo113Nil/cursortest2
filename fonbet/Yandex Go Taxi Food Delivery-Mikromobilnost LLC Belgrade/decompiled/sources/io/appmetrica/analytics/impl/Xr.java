package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Xr implements Wr {
    public final Q9 a;

    public Xr() {
        this(new Q9());
    }

    @Override // io.appmetrica.analytics.impl.Wr
    public final byte[] a(C0243ca c0243ca, Xj xj) {
        if (!((S5) xj.l).C() && !TextUtils.isEmpty(c0243ca.b)) {
            try {
                JSONObject jSONObject = new JSONObject(c0243ca.b);
                jSONObject.remove("preloadInfo");
                c0243ca.b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.a.a(c0243ca, xj);
    }

    public Xr(Q9 q9) {
        this.a = q9;
    }
}
