package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Xf implements Consumer {
    public final C0726vj a;
    public final W0 b;
    public final C0290gg c;

    public Xf(@NotNull C0726vj c0726vj, @NotNull W0 w0, @NotNull C0290gg c0290gg) {
        this.a = c0726vj;
        this.b = w0;
        this.c = c0290gg;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        C0726vj c0726vj = this.a;
        W0 w0 = this.b;
        String str2 = w0.a;
        String str3 = w0.b;
        Integer valueOf = Integer.valueOf(w0.d);
        W0 w02 = this.b;
        F4 f4 = new F4(str2, str3, valueOf, w02.e, w02.c);
        C0290gg c0290gg = this.c;
        EnumC0603rc enumC0603rc = c0290gg.b;
        V0 v0 = c0290gg.a;
        String str4 = v0.c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(v0.f.a);
        Set set = Ea.a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        C4 c4 = new C4("", "", enumC0603rc.a, orCreatePublicLogger);
        if (str != null) {
            c4.f(str);
        }
        c4.m = bundle;
        c4.c = c0290gg.a.f.f;
        c0726vj.a(f4, c4, new C0279g5(new C0212dp(), new C0250f5(), null));
    }
}
