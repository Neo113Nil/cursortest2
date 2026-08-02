package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes5.dex */
public final class V {
    public final List a;

    public V(InterfaceC0941i interfaceC0941i) {
        this.a = interfaceC0941i.a();
    }

    public final void a(C0944l c0944l) {
        for (T t : this.a) {
            C0945m c0945m = null;
            if (c0944l != null) {
                C0944l c0944l2 = c0944l.a ? c0944l : null;
                if (c0944l2 != null) {
                    c0945m = c0944l2.b;
                }
            }
            t.a(c0945m);
        }
    }
}
