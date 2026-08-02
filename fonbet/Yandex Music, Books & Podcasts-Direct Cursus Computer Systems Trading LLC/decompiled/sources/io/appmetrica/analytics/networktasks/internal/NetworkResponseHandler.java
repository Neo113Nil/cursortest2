package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface NetworkResponseHandler<T> {
    T handle(@NonNull ResponseDataHolder responseDataHolder);
}
