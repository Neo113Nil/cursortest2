package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class De extends AbstractC0623s3 {
    public final String b;

    public De(@NotNull String str, @NotNull InterfaceC0789xo interfaceC0789xo) {
        super(interfaceC0789xo);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0623s3
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.b;
    }
}
