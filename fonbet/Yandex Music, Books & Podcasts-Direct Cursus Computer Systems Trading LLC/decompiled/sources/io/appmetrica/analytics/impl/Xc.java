package io.appmetrica.analytics.impl;

import defpackage.arf;
import defpackage.btf;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Xc implements ConfigProvider {
    public final P5 a;
    public final arf b = btf.b(new Wc(this));

    public Xc(@NotNull P5 p5) {
        this.a = p5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nj getConfig() {
        return (Nj) this.b.getValue();
    }
}
