package com.datadog.android.trace.opentelemetry;

import com.google.android.gms.measurement.internal.zzlc;
import io.opentelemetry.context.ContextStorageWrappers;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class OtelTracerProvider$get$1 extends Lambda implements Function0 {
    public static final OtelTracerProvider$get$1 INSTANCE;
    public static final OtelTracerProvider$get$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new OtelTracerProvider$get$1(i, 1);
        INSTANCE$1 = new OtelTracerProvider$get$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtelTracerProvider$get$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return String.format(Locale.US, "Tracer for %s already exists. Returning existing instance.", Arrays.copyOf(new Object[]{"CashAppTracer"}, 1));
            case 1:
                return "Default service name is missing during OtelTracerProvider creation, did you initialize SDK?";
            default:
                zzlc zzlcVar = new zzlc(1);
                synchronized (ContextStorageWrappers.mutex) {
                    try {
                        if (ContextStorageWrappers.storageInitialized) {
                            ContextStorageWrappers.log.log(Level.FINE, "ContextStorage has already been initialized, ignoring call to add wrapper.", new Throwable());
                        } else {
                            ContextStorageWrappers.wrappers.add(zzlcVar);
                        }
                    } finally {
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
