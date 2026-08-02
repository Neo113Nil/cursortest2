package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.ern;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Y6 implements Consumer {
    public final Executor a;
    public final C0784xj b;

    public Y6(@NotNull Context context, @NotNull V6 v6, @NotNull EnumC0603rc enumC0603rc, @NotNull Cdo cdo, @NotNull Executor executor, @NotNull String str) {
        this.a = executor;
        this.b = new C0784xj(context, v6, enumC0603rc, cdo);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.a;
        C0784xj c0784xj = this.b;
        Mc mc = c0784xj.c;
        Consumer consumer = c0784xj.e;
        Context context = c0784xj.a;
        if (C0314hb.c == null) {
            synchronized (ern.a(C0314hb.class)) {
                if (C0314hb.c == null) {
                    C0314hb.c = new C0314hb(context);
                }
            }
        }
        C0314hb c0314hb = C0314hb.c;
        if (c0314hb != null) {
            executor.execute(new RunnableC0754wi(file, mc, mc, consumer, c0314hb, c0784xj.b));
        } else {
            Intrinsics.j("INSTANCE");
            throw null;
        }
    }
}
