package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class fs implements Qi {
    public final Zr a;
    public final String b = "vital";

    public fs(Zr zr) {
        this.a = zr;
    }

    public final void a(InterfaceC0309ej interfaceC0309ej) {
        this.a.a(interfaceC0309ej.a());
        Zr zr = this.a;
        synchronized (zr) {
            JSONObject a = zr.a.a();
            if (!a.optBoolean("referrer_checked", false)) {
                zr.a.a(a.put("referrer_checked", true));
            }
            bs bsVar = zr.a;
            bs.a(bsVar.a);
            bs.a(bsVar.b);
        }
    }

    public final InterfaceC0309ej b() {
        Ui b = this.a.b();
        if (b != null) {
            return new C0281dj(b);
        }
        return null;
    }

    public final boolean c() {
        boolean optBoolean;
        Zr zr = this.a;
        synchronized (zr) {
            optBoolean = zr.a.a().optBoolean("referrer_checked", false);
        }
        return optBoolean;
    }

    public final String a() {
        return this.b;
    }
}
