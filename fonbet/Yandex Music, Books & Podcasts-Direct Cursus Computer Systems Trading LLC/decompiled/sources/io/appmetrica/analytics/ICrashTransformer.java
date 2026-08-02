package io.appmetrica.analytics;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface ICrashTransformer {
    Throwable process(@NonNull Throwable th);
}
