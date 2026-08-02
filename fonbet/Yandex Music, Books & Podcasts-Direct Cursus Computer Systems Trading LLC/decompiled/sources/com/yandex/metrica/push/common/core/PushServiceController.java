package com.yandex.metrica.push.common.core;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface PushServiceController {
    @NonNull
    String getTitle();

    String getToken();

    boolean register();
}
