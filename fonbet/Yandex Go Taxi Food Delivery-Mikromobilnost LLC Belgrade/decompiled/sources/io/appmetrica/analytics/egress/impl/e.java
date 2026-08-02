package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes4.dex */
public final class e extends SafeRunnable {
    public final /* synthetic */ g a;
    public final /* synthetic */ f b;
    public final /* synthetic */ l c;
    public final /* synthetic */ long d;

    public e(g gVar, f fVar, l lVar, long j) {
        this.a = gVar;
        this.b = fVar;
        this.c = lVar;
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
            l lVar = this.c;
            lVar.getClass();
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(lVar.a.getSslSocketFactory()).withConnectTimeout(30000).withReadTimeout(30000).withUseCaches(false).withInstanceFollowRedirects(true).build()).build().newCall(new Request.Builder(lVar.c.getUrl()).build()).execute();
            k kVar = lVar.b;
            boolean z = execute.getCode() == 200;
            int length = execute.getResponseData().length;
            int code = execute.getCode();
            Throwable th = execute.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_EXCEPTION java.lang.String();
            if (th != null) {
                str = th.getClass().getSimpleName() + " : " + th.getLocalizedMessage();
            } else {
                str = null;
            }
            ModuleSelfReporter moduleSelfReporter = kVar.a;
            if (moduleSelfReporter != null) {
                LinkedHashMap l = kotlin.collections.b.l(new Pair(ACSPConstants.STATUS, z ? "OK" : "FAILED"), new Pair("http_status", Integer.valueOf(code)), new Pair("size", Integer.valueOf(length)));
                if (str != null) {
                    l.put(CRLReasonCodeExtension.REASON, str);
                }
                moduleSelfReporter.reportEvent("egress_status", kotlin.collections.b.t(l));
            }
        }
        g gVar = this.a;
        ICommonExecutor iCommonExecutor = gVar.a;
        e eVar = gVar.c;
        iCommonExecutor.executeDelayed(eVar != null ? eVar : null, this.d, TimeUnit.SECONDS);
    }
}
