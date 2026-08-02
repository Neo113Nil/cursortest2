package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ad implements W4 {
    @Override // io.appmetrica.analytics.impl.W4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0423l5 a(@NotNull Context context, @NotNull V5 v5, @NotNull F4 f4, @NotNull C0279g5 c0279g5) {
        C0510o5 c0510o5;
        C0452m5 c0452m5 = new C0452m5(f4.b);
        C0539p5 c0539p5 = new C0539p5();
        synchronized (v5) {
            c0510o5 = (C0510o5) v5.a(c0452m5, c0279g5, c0539p5, v5.b);
        }
        return new C0423l5(context, c0510o5, c0279g5);
    }
}
