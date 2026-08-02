package com.yandex.plus.metrica.utils;

import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.xee;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(g gVar, String str, int i) {
        this.a = i;
        this.b = gVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                ReentrantLock reentrantLock = gVar.h;
                ConcurrentHashMap concurrentHashMap = gVar.i;
                com.yandex.plus.home.feature.webviews.internal.stories.i iVar = new com.yandex.plus.home.feature.webviews.internal.stories.i(0, gVar, g.class, "getComponentHistogramsStatus", "getComponentHistogramsStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0, 23);
                String str = this.c;
                return gVar.d(str, reentrantLock, concurrentHashMap, iVar, new c(gVar, str, 1), "ComponentHistograms");
            default:
                Timber.Companion companion = Timber.INSTANCE;
                this.b.getClass();
                companion.tag("Metrica7Facade").d("Get Pulse component histograms", new Object[0]);
                Object obj = ComponentHistograms.b;
                return xee.D(this.c);
        }
    }
}
