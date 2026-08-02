package com.google.android.gms.measurement.internal;

import com.datadog.android.trace.opentelemetry.internal.DatadogContextStorage;
import io.opentelemetry.context.ContextStorage;
import java.util.function.Function;

/* loaded from: classes9.dex */
public final /* synthetic */ class zzlc implements Function {
    public static final /* synthetic */ zzlc zza = new zzlc(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzlc(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Long.valueOf(((zzoh) obj).zzb);
            default:
                ContextStorage contextStorage = (ContextStorage) obj;
                contextStorage.getClass();
                return contextStorage instanceof DatadogContextStorage ? (DatadogContextStorage) contextStorage : new DatadogContextStorage(contextStorage);
        }
    }
}
