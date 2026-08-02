package com.squareup.cash.observability.backend.real;

import com.datadog.android.Datadog;
import com.datadog.android.okhttp.DatadogEventListener;
import com.datadog.android.rum.GlobalRumMonitor;
import com.squareup.cash.observability.backend.real.network.DatadogEventListenerFactory;
import com.squareup.cash.observability.types.ThrowableScribe;
import dev.zacsweers.metro.internal.Factory;
import io.opentelemetry.api.GlobalOpenTelemetry;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WeakThrowableScribe implements ThrowableScribe {
    public final WeakThrowableScribe$$ExternalSyntheticLambda0 onConflict = new WeakThrowableScribe$$ExternalSyntheticLambda0(0);
    public final WeakHashMap annotations = new WeakHashMap();

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE$2 = new MetroFactory(2);
        public static final MetroFactory INSTANCE$3 = new MetroFactory(3);
        public static final MetroFactory INSTANCE$4 = new MetroFactory(4);
        public static final MetroFactory INSTANCE$5 = new MetroFactory(5);
        public static final MetroFactory INSTANCE = new MetroFactory(0);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new WeakThrowableScribe();
                case 1:
                    return new InMemoryReportedErrorCache();
                case 2:
                    LinkedHashMap linkedHashMap = GlobalRumMonitor.registeredMonitors;
                    return GlobalRumMonitor.get(Datadog.getInstance(null));
                case 3:
                    return GlobalOpenTelemetry.get().getTracer();
                case 4:
                    return new DatadogEventListenerFactory(new DatadogEventListener.Factory());
                default:
                    return new ObservabilityModule$Companion$$ExternalSyntheticLambda0();
            }
        }
    }
}
