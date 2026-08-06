package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import i1.AbstractC0252i;
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

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f4044a;

    /* renamed from: b, reason: collision with root package name */
    public final G f4045b;

    /* renamed from: c, reason: collision with root package name */
    public SdkIdentifiers f4046c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f4047d = new SystemTimeProvider();

    /* renamed from: e, reason: collision with root package name */
    public final o f4048e;

    /* renamed from: f, reason: collision with root package name */
    public final x f4049f;

    /* renamed from: g, reason: collision with root package name */
    public final q f4050g;

    public n(ServiceContext serviceContext, G g2, SdkIdentifiers sdkIdentifiers) {
        this.f4044a = serviceContext;
        this.f4045b = g2;
        this.f4046c = sdkIdentifiers;
        this.f4048e = new o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f4049f = new x(serviceContext);
        this.f4050g = new q(serviceContext);
    }

    public static final void a(D d2, n nVar, RequestConfig requestConfig) {
        if (d2.f3976b) {
            G g2 = nVar.f4045b;
            String str = d2.f3975a;
            g2.f3992d.put(str, new E(str, nVar.f4047d.currentTimeMillis(), d2.f3978d ? 2 : 4));
            g2.f3989a.putString(g2.f3991c, g2.f3990b.fromModel(AbstractC0252i.R(g2.f3992d.values())));
            q qVar = nVar.f4050g;
            SdkIdentifiers sdkIdentifiers = nVar.f4046c;
            qVar.f4055a.getClass();
            String a2 = v.a(d2);
            t tVar = qVar.f4056b;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new p(tVar.f4069a));
            }
            String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !z1.g.a0(reportUrl)) {
                arrayList.add(new r(tVar.f4069a, requestConfig.getReportUrl()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(a2, sdkIdentifiers);
            }
        }
    }

    public final SdkIdentifiers a() {
        return this.f4046c;
    }

    public final void a(SdkIdentifiers sdkIdentifiers) {
        this.f4046c = sdkIdentifiers;
    }

    public static final void a(n nVar, RequestConfig requestConfig) {
        y c0256a;
        x xVar = nVar.f4049f;
        Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if (w.f4071a[preconditions.getNetworkType().ordinal()] == 1) {
            c0256a = new C0257b(xVar.f4072a);
        } else {
            c0256a = new C0256a();
        }
        if (c0256a.a()) {
            o oVar = nVar.f4048e;
            oVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), AbstractC0252i.K(entry.getValue(), ", ", null, null, null, 62));
            }
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(oVar.f4051a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build()).build().newCall(builder.build()).execute();
            oVar.f4052b.a(new D(requestConfig.getType(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData(), execute.getHeaders()), requestConfig);
        }
    }

    public final void a(D d2, RequestConfig requestConfig) {
        this.f4044a.getExecutorProvider().getModuleExecutor().execute(new F0.b(d2, this, requestConfig, 1));
    }

    public final void a(RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        E e2 = (E) this.f4045b.f3992d.get(requestConfig.getType());
        if (e2 != null) {
            long currentTimeMillis = this.f4047d.currentTimeMillis();
            int a2 = A.a(e2.f3984c);
            if (a2 != 1) {
                resendIntervalForValidResponse = a2 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - e2.f3983b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f4044a.getExecutorProvider().getSupportIOExecutor().execute(new F0.c(2, this, requestConfig));
    }
}
