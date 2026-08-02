package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0755u3 {
    public final AbstractC0741ti a;
    public final InterfaceC0302ec b;

    public AbstractC0755u3(AbstractC0741ti abstractC0741ti, InterfaceC0302ec interfaceC0302ec) {
        this.a = abstractC0741ti;
        this.b = interfaceC0302ec;
    }

    public final boolean a(K6 k6, InterfaceC0726t3 interfaceC0726t3) {
        Iterator it = ((C0473ka) this.a.a(k6.d)).a.iterator();
        while (it.hasNext()) {
            if (interfaceC0726t3.a(it.next(), k6)) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC0741ti b() {
        return this.a;
    }

    public final InterfaceC0302ec a() {
        return this.b;
    }
}
