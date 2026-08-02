package com.datadog.android.core.internal;

import com.datadog.android.DatadogSite;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.LocaleInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.ProcessInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.privacy.TrackingConsent;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public final class NoOpContextProvider implements ContextProvider {
    @Override // com.datadog.android.core.internal.ContextProvider
    public final DatadogContext getContext(Set set) {
        set.getClass();
        DatadogSite datadogSite = DatadogSite.US1;
        ProcessInfo processInfo = new ProcessInfo(true);
        NetworkInfo networkInfo = new NetworkInfo(12, null, null, null, null, null, null);
        DeviceInfo deviceInfo = new DeviceInfo("", "", "", DeviceType.OTHER, "", "", "", "", "", null, new LocaleInfo(EmptyList.INSTANCE, "", ""));
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return new DatadogContext(datadogSite, "", "", "", "", 0, "", "", "", TimeInfo.EMPTY, processInfo, networkInfo, deviceInfo, new UserInfo(null, null, null, null, emptyMap), TrackingConsent.NOT_GRANTED, null, emptyMap);
    }
}
