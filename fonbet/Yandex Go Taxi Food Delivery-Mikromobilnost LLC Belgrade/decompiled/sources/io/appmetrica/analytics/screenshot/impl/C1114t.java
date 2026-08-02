package io.appmetrica.analytics.screenshot.impl;

import defpackage.scc;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1114t implements InterfaceC1103h {
    public final ClientContext a;
    public final C b;

    public C1114t(ClientContext clientContext, C c) {
        this.a = clientContext;
        this.b = c;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC1103h
    public final List<B> a() {
        return scc.g(new C1099d(this.a, this.b), new C1113s(this.a, this.b), new M(this.a, this.b));
    }
}
