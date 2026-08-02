package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.ern;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C0232eg;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0232eg implements NativeCrashHandler {
    public final Function1 a;
    public final IHandlerExecutor b = C0747wb.k().w().f();
    public final C0319hg c;

    public C0232eg(@NotNull Context context, @NotNull C0726vj c0726vj, @NotNull Function1<? super String, Unit> function1, @NotNull InterfaceC0463mg interfaceC0463mg, @NotNull EnumC0603rc enumC0603rc, @NotNull String str) {
        this.a = function1;
        this.c = new C0319hg(context, c0726vj, interfaceC0463mg, enumC0603rc);
    }

    public static final void a(C0232eg c0232eg, NativeCrash nativeCrash, File file) {
        c0232eg.a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        V0 v0;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            W0 a = X0.a(nativeCrash.getMetadata());
            a.getClass();
            v0 = new V0(source, handlerVersion, uuid, dumpFile, creationTime, a);
        } catch (Throwable unused) {
            v0 = null;
        }
        if (v0 == null) {
            this.a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(v0.f.a).info("Detected native crash with uuid = " + v0.c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.b;
        C0319hg c0319hg = this.c;
        Consumer consumer = new Consumer() { // from class: mvw
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C0232eg.a(C0232eg.this, nativeCrash, (File) obj);
            }
        };
        c0319hg.getClass();
        C0117ag c0117ag = new C0117ag(new C0175cg(v0.a, v0.b), c0319hg.f);
        Xf xf = new Xf(c0319hg.b, v0.f, new C0290gg(v0, c0319hg.d));
        C0343ib c0343ib = c0319hg.e;
        String str = v0.d;
        c0343ib.getClass();
        File file = new File(str);
        Context context = c0319hg.a;
        if (C0314hb.c == null) {
            synchronized (ern.a(C0314hb.class)) {
                if (C0314hb.c == null) {
                    C0314hb.c = new C0314hb(context);
                }
            }
        }
        C0314hb c0314hb = C0314hb.c;
        if (c0314hb != null) {
            iHandlerExecutor.execute(new RunnableC0754wi(file, c0117ag, consumer, xf, c0314hb, c0319hg.c.a(v0)));
        } else {
            Intrinsics.j("INSTANCE");
            throw null;
        }
    }
}
