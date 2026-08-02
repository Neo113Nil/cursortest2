package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ng implements B7 {
    public final File a;
    public final InterfaceC0466mj b;

    public Ng(@NotNull File file, @NotNull InterfaceC0466mj interfaceC0466mj) {
        this.a = file;
        this.b = interfaceC0466mj;
    }

    @Override // io.appmetrica.analytics.impl.B7
    @NotNull
    public final File a(@NotNull Context context, @NotNull String str) {
        return new File(this.a, this.b.a(str));
    }
}
