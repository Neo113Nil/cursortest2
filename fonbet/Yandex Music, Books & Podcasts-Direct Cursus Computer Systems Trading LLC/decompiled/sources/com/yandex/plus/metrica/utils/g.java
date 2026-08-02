package com.yandex.plus.metrica.utils;

import android.content.Context;
import defpackage.btf;
import defpackage.het;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x7j;
import defpackage.z7o;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class g {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final ReentrantLock d = new ReentrantLock();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ReentrantLock f = new ReentrantLock();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ReentrantLock h = new ReentrantLock();
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public g() {
        final int i = 0;
        this.a = btf.b(new Function0(this) { // from class: com.yandex.plus.metrica.utils.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g gVar = this.b;
                        return gVar.b("io.appmetrica.analytics.AppMetrica") == null ? f.NOT_FOUND : gVar.f();
                    case 1:
                        g gVar2 = this.b;
                        return gVar2.b("io.appmetrica.analytics.AppMetricaYandex") == null ? f.NOT_FOUND : gVar2.f();
                    default:
                        g gVar3 = this.b;
                        jyr jyrVar = gVar3.b;
                        f fVar = (f) jyrVar.getValue();
                        f fVar2 = f.COMPATIBLE;
                        return fVar == fVar2 ? gVar3.b("com.yandex.pulse.histogram.ComponentHistograms") == null ? f.NOT_FOUND : fVar2 : (f) jyrVar.getValue();
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.plus.metrica.utils.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        g gVar = this.b;
                        return gVar.b("io.appmetrica.analytics.AppMetrica") == null ? f.NOT_FOUND : gVar.f();
                    case 1:
                        g gVar2 = this.b;
                        return gVar2.b("io.appmetrica.analytics.AppMetricaYandex") == null ? f.NOT_FOUND : gVar2.f();
                    default:
                        g gVar3 = this.b;
                        jyr jyrVar = gVar3.b;
                        f fVar = (f) jyrVar.getValue();
                        f fVar2 = f.COMPATIBLE;
                        return fVar == fVar2 ? gVar3.b("com.yandex.pulse.histogram.ComponentHistograms") == null ? f.NOT_FOUND : fVar2 : (f) jyrVar.getValue();
                }
            }
        });
        final int i3 = 2;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.metrica.utils.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        g gVar = this.b;
                        return gVar.b("io.appmetrica.analytics.AppMetrica") == null ? f.NOT_FOUND : gVar.f();
                    case 1:
                        g gVar2 = this.b;
                        return gVar2.b("io.appmetrica.analytics.AppMetricaYandex") == null ? f.NOT_FOUND : gVar2.f();
                    default:
                        g gVar3 = this.b;
                        jyr jyrVar = gVar3.b;
                        f fVar = (f) jyrVar.getValue();
                        f fVar2 = f.COMPATIBLE;
                        return fVar == fVar2 ? gVar3.b("com.yandex.pulse.histogram.ComponentHistograms") == null ? f.NOT_FOUND : fVar2 : (f) jyrVar.getValue();
                }
            }
        });
    }

    public final void a(com.yandex.plus.core.config.a aVar, Function0 function0, Object obj) {
        if (obj == null && function0.invoke() == f.INCOMPATIBLE) {
            k kVar = new k("AppMetrica version " + ((Object) het.a(7)) + ".x not found!");
            if (aVar == com.yandex.plus.core.config.a.a) {
                throw kVar;
            }
            Timber.INSTANCE.tag("Metrica7Facade").e(kVar);
        }
    }

    public final Class b(String str) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Class.forName(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Timber.INSTANCE.tag("Metrica7Facade").w(a, hrg.q("Class \"", str, "\" not found!"), new Object[0]);
            t7oVar = null;
        }
        return (Class) t7oVar;
    }

    public final Object c(String str, Function0 function0) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = function0.invoke();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return t7oVar;
        }
        Timber.INSTANCE.tag("Metrica7Facade").w(a, hrg.q("Instance of class \"", str, "\" not created!"), new Object[0]);
        return null;
    }

    public final Object d(String str, ReentrantLock reentrantLock, ConcurrentHashMap concurrentHashMap, Function0 function0, Function0 function02, String str2) {
        Object obj = concurrentHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        Object c = c(str2, new com.yandex.plus.bdui.content.b(function0, function02));
        if (c == null) {
            return null;
        }
        reentrantLock.lock();
        try {
            Object obj2 = concurrentHashMap.get(str);
            if (obj2 == null) {
                concurrentHashMap.put(str, c);
            } else {
                c = obj2;
            }
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object e(final Context context, final String str, final String str2, final String str3, final com.yandex.plus.core.config.a aVar, final boolean z, final boolean z2) {
        context.getClass();
        aVar.getClass();
        Timber.INSTANCE.tag("Metrica7Facade").d("Get AppMetrica internal reporter", new Object[0]);
        Object c = c("IReporterYandex", new Function0() { // from class: com.yandex.plus.metrica.utils.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final g gVar = this;
                ReentrantLock reentrantLock = gVar.f;
                ConcurrentHashMap concurrentHashMap = gVar.g;
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, gVar, g.class, "getMetricaInternalStatus", "getMetricaInternalStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0, 27);
                final Context context2 = context;
                final com.yandex.plus.core.config.a aVar2 = aVar;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = str3;
                final boolean z3 = z;
                final boolean z4 = z2;
                return gVar.d(str4, reentrantLock, concurrentHashMap, iVar, new Function0(context2, aVar2, gVar, str4, str5, str6, z3, z4) { // from class: com.yandex.plus.metrica.utils.d
                    public final /* synthetic */ Context a;
                    public final /* synthetic */ String b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ String d;
                    public final /* synthetic */ com.yandex.plus.core.config.a e;
                    public final /* synthetic */ boolean f;
                    public final /* synthetic */ boolean g;

                    {
                        this.b = str4;
                        this.c = str5;
                        this.d = str6;
                        this.f = z3;
                        this.g = z4;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i;
                        String str7 = this.c;
                        String str8 = this.d;
                        Timber.INSTANCE.tag("Metrica7Facade").d("Activate AppMetrica internal reporter", new Object[0]);
                        Context context3 = this.a;
                        context3.getClass();
                        com.yandex.plus.core.config.a aVar3 = this.e;
                        aVar3.getClass();
                        String str9 = this.b;
                        ReporterYandexConfig.Builder newBuilder = ReporterYandexConfig.newBuilder(str9);
                        if (this.g) {
                            try {
                                r7o r7oVar = z7o.b;
                                PulseLibraryConfig.Builder newBuilder2 = PulseLibraryConfig.newBuilder(str7, str8, "110.0.0");
                                int ordinal = aVar3.ordinal();
                                if (ordinal == 0) {
                                    i = 2;
                                } else {
                                    if (ordinal != 1) {
                                        throw new x7j();
                                    }
                                    i = 4;
                                }
                                newBuilder.withPulseLibraryConfig(newBuilder2.withChannelId(i).build());
                            } catch (Throwable unused) {
                                r7o r7oVar2 = z7o.b;
                            }
                        }
                        if (this.f) {
                            newBuilder.withLogs();
                        }
                        ReporterYandexConfig build = newBuilder.build();
                        build.getClass();
                        AppMetricaYandex.activateReporter(context3, build);
                        IReporterYandex reporter = AppMetricaYandex.getReporter(context3, str9);
                        reporter.getClass();
                        return reporter;
                    }
                }, "IReporterYandex");
            }
        });
        a(aVar, new com.yandex.plus.home.feature.webviews.internal.stories.i(0, this, g.class, "getMetricaInternalStatus", "getMetricaInternalStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0, 26), c);
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f f() {
        Object t7oVar;
        Throwable a;
        het hetVar;
        Timber.Companion companion = Timber.INSTANCE;
        companion.tag("Metrica7Facade").d("Check for AppMetrica compatibility", new Object[0]);
        try {
            r7o r7oVar = z7o.b;
            String libraryVersion = AppMetrica.getLibraryVersion();
            libraryVersion.getClass();
            com.yandex.plus.core.version.a a2 = com.yandex.plus.core.version.e.a(libraryVersion);
            hetVar = a2 != null ? new het(a2.a) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (hetVar != null && hetVar.a == 7) {
            companion.tag("Metrica7Facade").d("AppMetrica is compatible", new Object[0]);
            t7oVar = f.COMPATIBLE;
            a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.tag("Metrica7Facade").w(a, "Check for AppMetrica compatibility failed!", new Object[0]);
                t7oVar = f.INCOMPATIBLE;
            }
            return (f) t7oVar;
        }
        companion.tag("Metrica7Facade").w("AppMetrica is not compatible!", new Object[0]);
        t7oVar = f.INCOMPATIBLE;
        a = z7o.a(t7oVar);
        if (a != null) {
        }
        return (f) t7oVar;
    }
}
