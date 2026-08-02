package io.appmetrica.analytics.egress.impl;

import defpackage.uah;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends SafeRunnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ g b;
    public final /* synthetic */ m c;
    public final /* synthetic */ long d;

    public f(h hVar, g gVar, m mVar, long j) {
        this.a = hVar;
        this.b = gVar;
        this.c = mVar;
        this.d = j;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        String str;
        if (this.a.d) {
            return;
        }
        this.b.a = true;
        if (this.a.b.canBeExecuted()) {
            m mVar = this.c;
            mVar.getClass();
            Response execute = new NetworkClient.Builder().withSslSocketFactory(mVar.a.getSslSocketFactory()).withConnectTimeout(30000).withReadTimeout(30000).withUseCaches(false).withInstanceFollowRedirects(true).build().newCall(new Request.Builder(mVar.c.b).build()).execute();
            l lVar = mVar.b;
            boolean z = execute.getCode() == 200;
            int length = execute.getResponseData().length;
            int code = execute.getCode();
            Throwable exception = execute.getException();
            if (exception != null) {
                str = exception.getClass().getSimpleName() + " : " + exception.getLocalizedMessage();
            } else {
                str = null;
            }
            ModuleSelfReporter moduleSelfReporter = lVar.a;
            if (moduleSelfReporter != null) {
                LinkedHashMap g = uah.g(new Pair("status", z ? "OK" : "FAILED"), new Pair("http_status", Integer.valueOf(code)), new Pair("size", Integer.valueOf(length)));
                if (str != null) {
                    g.put("reason", str);
                }
                moduleSelfReporter.reportEvent("egress_status", uah.o(g));
            }
        }
        h hVar = this.a;
        ICommonExecutor iCommonExecutor = hVar.a;
        f fVar = hVar.c;
        if (fVar != null) {
            iCommonExecutor.executeDelayed(fVar, this.d, TimeUnit.SECONDS);
        } else {
            Intrinsics.j("periodicRunnable");
            throw null;
        }
    }
}
