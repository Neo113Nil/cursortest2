package io.appmetrica.analytics.impl;

import defpackage.i3y;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0563nd implements ConfigProvider {
    public final S5 a;
    public final i3y b = kotlin.a.a(new C0534md(this));

    public C0563nd(S5 s5) {
        this.a = s5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xj getConfig() {
        return (Xj) this.b.getValue();
    }
}
