package io.appmetrica.analytics.screenshot.impl;

import defpackage.scc;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* loaded from: classes4.dex */
public final class v implements InterfaceC1103h {
    public final ClientContext a;
    public final C b;

    public v(ClientContext clientContext, C c) {
        this.a = clientContext;
        this.b = c;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1103h
    public final List<B> a() {
        return scc.g(new C1113s(this.a, this.b), new M(this.a, this.b));
    }
}
