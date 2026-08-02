package io.appmetrica.analytics.impl;

import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0486kn implements Wi {
    public final /* synthetic */ C0515ln a;

    public C0486kn(C0515ln c0515ln) {
        this.a = c0515ln;
    }

    @Override // io.appmetrica.analytics.impl.Wi
    public final void a(InterfaceC0309ej interfaceC0309ej) {
        Ui a = interfaceC0309ej.a();
        if (a == null || this.a.b()) {
            return;
        }
        try {
            K6 k6 = new K6("", "", 0);
            k6.setValueBytes(a.a());
            Hc hc = Hc.EVENT_TYPE_UNDEFINED;
            k6.d = Constants.INTENT_ADDRESS_ID;
            this.a.a.a(k6);
            C0515ln.b(this.a);
        } catch (Throwable unused) {
        }
    }
}
