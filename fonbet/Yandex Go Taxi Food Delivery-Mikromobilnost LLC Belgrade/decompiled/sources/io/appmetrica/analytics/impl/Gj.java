package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Gj extends Aj {
    public final as b;

    public Gj(S5 s5) {
        this(s5, s5.v());
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        S5 s5 = this.a;
        if (!this.b.c()) {
            if (!this.b.d()) {
                C0907za c0907za = s5.n;
                c0907za.c.b(K6.a(k6, Hc.EVENT_TYPE_FIRST_ACTIVATION));
            }
            as asVar = this.b;
            synchronized (asVar) {
                JSONObject a = asVar.a.a();
                if (!a.optBoolean("first_event_done", false)) {
                    asVar.a.a(a.put("first_event_done", true));
                }
                bs bsVar = asVar.a;
                bs.a(bsVar.a);
                bs.a(bsVar.b);
            }
        }
        return false;
    }

    public Gj(S5 s5, as asVar) {
        super(s5);
        this.b = asVar;
    }
}
