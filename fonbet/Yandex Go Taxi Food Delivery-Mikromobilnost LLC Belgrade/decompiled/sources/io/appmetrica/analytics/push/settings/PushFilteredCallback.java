package io.appmetrica.analytics.push.settings;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes4.dex */
public interface PushFilteredCallback {
    void onPushFiltered(PushMessage pushMessage, PushFilter.FilterResult filterResult);
}
