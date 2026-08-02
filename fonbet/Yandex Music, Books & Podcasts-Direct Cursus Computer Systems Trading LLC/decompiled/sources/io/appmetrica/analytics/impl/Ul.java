package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Ul extends AbstractC0697uj {
    public final Ph b;

    public Ul(@NonNull P5 p5) {
        this(p5, C0747wb.k().t());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(h6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.b.b(Mh.a(jSONObject));
        return false;
    }

    public Ul(P5 p5, Ph ph) {
        super(p5);
        this.b = ph;
    }
}
