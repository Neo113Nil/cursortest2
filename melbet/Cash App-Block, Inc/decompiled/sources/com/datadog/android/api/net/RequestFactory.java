package com.datadog.android.api.net;

import com.datadog.android.api.context.DatadogContext;
import java.util.List;

/* loaded from: classes4.dex */
public interface RequestFactory {
    Request create(DatadogContext datadogContext, RequestExecutionContext requestExecutionContext, List list);
}
