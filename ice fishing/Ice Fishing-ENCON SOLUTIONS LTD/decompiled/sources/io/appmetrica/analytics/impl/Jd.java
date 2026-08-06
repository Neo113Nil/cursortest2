package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;

/* loaded from: classes.dex */
public final class Jd implements NativeCrashHandler {

    /* renamed from: a, reason: collision with root package name */
    public final t1.l f4589a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f4590b = C0610na.k().w().d();

    /* renamed from: c, reason: collision with root package name */
    public final Md f4591c;

    public Jd(Context context, Sg sg, t1.l lVar, Rd rd, EnumC0301bb enumC0301bb, String str) {
        this.f4589a = lVar;
        this.f4591c = new Md(context, sg, rd, enumC0301bb);
    }

    public static final void a(Jd jd, NativeCrash nativeCrash, File file) {
        jd.f4589a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        G0 g02;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 a2 = I0.a(nativeCrash.getMetadata());
            kotlin.jvm.internal.i.b(a2);
            g02 = new G0(source, handlerVersion, uuid, dumpFile, creationTime, a2);
        } catch (Throwable unused) {
            g02 = null;
        }
        if (g02 == null) {
            this.f4589a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g02.f4408f.f4451a).info("Detected native crash with uuid = " + g02.f4405c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f4590b;
        Md md = this.f4591c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Mo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Jd.a(Jd.this, nativeCrash, (File) obj);
            }
        };
        md.getClass();
        Fd fd = new Fd(new Hd(g02.f4403a, g02.f4404b), md.f4757f);
        Cd cd = new Cd(md.f4753b, g02.f4408f, new Ld(g02, md.f4755d));
        C0274aa c0274aa = md.f4756e;
        String str = g02.f4406d;
        c0274aa.getClass();
        File file = new File(str);
        Context context = md.f4752a;
        if (Z9.f5490c == null) {
            synchronized (kotlin.jvm.internal.q.a(Z9.class)) {
                if (Z9.f5490c == null) {
                    Z9.f5490c = new Z9(context);
                }
            }
        }
        Z9 z9 = Z9.f5490c;
        if (z9 != null) {
            iHandlerExecutor.execute(new Tf(file, fd, consumer, cd, z9, md.f4754c.a(g02)));
        } else {
            kotlin.jvm.internal.i.i("INSTANCE");
            throw null;
        }
    }
}
