package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0515ln extends Aj {
    public C0515ln(S5 s5) {
        super(s5);
    }

    public static final void b(C0515ln c0515ln) {
        as asVar = c0515ln.a.t;
        synchronized (asVar) {
            JSONObject a = asVar.a.a();
            if (!a.optBoolean("referrer_handled", false)) {
                asVar.a.a(a.put("referrer_handled", true));
            }
            bs bsVar = asVar.a;
            bs.a(bsVar.a);
            bs.a(bsVar.b);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        if (b()) {
            return false;
        }
        Yi u = Jb.I.u();
        C0486kn c0486kn = new C0486kn(this);
        u.getClass();
        u.a.a(new C0284dm(c0486kn));
        return false;
    }

    public final boolean b() {
        boolean optBoolean;
        as asVar = this.a.t;
        synchronized (asVar) {
            optBoolean = asVar.a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }
}
