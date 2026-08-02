package com.yandex.metrica.push;

import com.yandex.metrica.push.PushFilter;
import com.yandex.metrica.push.core.model.PushMessage;

/* loaded from: classes3.dex */
public interface PushFilteredCallback {
    void onPushFiltered(PushMessage pushMessage, PushFilter.FilterResult filterResult);
}
