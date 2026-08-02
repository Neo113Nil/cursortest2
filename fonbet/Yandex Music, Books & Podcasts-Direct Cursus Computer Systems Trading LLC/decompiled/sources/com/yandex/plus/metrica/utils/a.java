package com.yandex.plus.metrica.utils;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ a(g gVar, Context context, String str, boolean z) {
        this.b = gVar;
        this.c = context;
        this.d = str;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                ReentrantLock reentrantLock = gVar.d;
                ConcurrentHashMap concurrentHashMap = gVar.e;
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, gVar, g.class, "getMetricaStatus", "getMetricaStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0, 25);
                Context context = this.c;
                String str = this.d;
                return gVar.d(str, reentrantLock, concurrentHashMap, iVar, new a(gVar, context, str, this.e), "IReporter");
            default:
                Timber.Companion companion = Timber.INSTANCE;
                this.b.getClass();
                companion.tag("Metrica7Facade").d("Activate AppMetrica public reporter", new Object[0]);
                Context context2 = this.c;
                context2.getClass();
                String str2 = this.d;
                ReporterConfig.Builder newConfigBuilder = ReporterConfig.newConfigBuilder(str2);
                if (this.e) {
                    newConfigBuilder.withLogs();
                }
                ReporterConfig build = newConfigBuilder.build();
                build.getClass();
                AppMetrica.activateReporter(context2, build);
                IReporter reporter = AppMetrica.getReporter(context2, str2);
                reporter.getClass();
                return reporter;
        }
    }

    public /* synthetic */ a(g gVar, String str, Context context, boolean z) {
        this.b = gVar;
        this.d = str;
        this.c = context;
        this.e = z;
    }
}
