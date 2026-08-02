package io.appmetrica.analytics.impl;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0403ke implements N9 {
    public final Rg a;
    public final Function0 b;

    public C0403ke(@NotNull Rg rg, @NotNull Function0<Integer> function0) {
        this.a = rg;
        this.b = function0;
    }

    @Override // io.appmetrica.analytics.impl.N9
    public final boolean b() {
        return ((Qg) this.a).b.get() >= ((long) ((Number) this.b.invoke()).intValue());
    }
}
