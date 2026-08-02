package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import defpackage.evu0;
import defpackage.fe71;
import defpackage.nk61;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class n {
    public final ServiceContext a;
    public final G b;
    public SdkIdentifiers c;
    public final SystemTimeProvider d = new SystemTimeProvider();
    public final o e;
    public final x f;
    public final q g;

    public n(ServiceContext serviceContext, G g, SdkIdentifiers sdkIdentifiers) {
        this.a = serviceContext;
        this.b = g;
        this.c = sdkIdentifiers;
        this.e = new o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f = new x(serviceContext);
        this.g = new q(serviceContext);
    }

    public static final void a(n nVar, RequestConfig requestConfig) {
        x xVar = nVar.f;
        Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if ((w.a[preconditions.getNetworkType().ordinal()] == 1 ? new C0168b(xVar.a) : new C0167a()).a()) {
            o oVar = nVar.e;
            oVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), kotlin.collections.a.X(entry.getValue(), Extension.FIX_SPACE, null, null, null, 62));
            }
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(oVar.a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build()).build().newCall(builder.build()).execute();
            oVar.b.a(new D(requestConfig.getType(), execute.getIsCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData(), execute.getHeaders()), requestConfig);
        }
    }

    public final SdkIdentifiers a() {
        return this.c;
    }

    public final void a(SdkIdentifiers sdkIdentifiers) {
        this.c = sdkIdentifiers;
    }

    public static final void a(D d, n nVar, RequestConfig requestConfig) {
        if (d.b) {
            G g = nVar.b;
            String str = d.a;
            g.d.put(str, new E(str, nVar.d.currentTimeMillis(), d.d ? A.SUCCESS : A.FAILURE));
            g.a.putString(g.c, g.b.fromModel(kotlin.collections.a.J0(g.d.values())));
            q qVar = nVar.g;
            SdkIdentifiers sdkIdentifiers = nVar.c;
            qVar.a.getClass();
            String a = v.a(d);
            t tVar = qVar.b;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new p(tVar.a));
            }
            String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !evu0.J(reportUrl)) {
                arrayList.add(new r(tVar.a, requestConfig.getReportUrl()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(a, sdkIdentifiers);
            }
        }
    }

    public final void a(D d, RequestConfig requestConfig) {
        this.a.getExecutorProvider().getModuleExecutor().execute(new nk61(6, d, this, requestConfig));
    }

    public final void a(RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        E e = (E) this.b.d.get(requestConfig.getType());
        if (e != null) {
            long currentTimeMillis = this.d.currentTimeMillis();
            int ordinal = e.c.ordinal();
            if (ordinal != 1) {
                resendIntervalForValidResponse = ordinal != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - e.b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.a.getExecutorProvider().getSupportIOExecutor().execute(new fe71(6, this, requestConfig));
    }
}
