package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerReporter;", "", "Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;", "report", "Lzy11;", "(Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;)V", "", "getApiKey", "()Ljava/lang/String;", Constants.KEY_API_KEY, "", "isMain", "()Z", "modules-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface ModuleEventServiceHandlerReporter {
    String getApiKey();

    boolean isMain();

    void report(CounterReportApi report);
}
