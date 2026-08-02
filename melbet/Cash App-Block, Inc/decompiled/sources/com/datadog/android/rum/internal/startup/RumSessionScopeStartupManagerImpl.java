package com.datadog.android.rum.internal.startup;

import androidx.media3.exoplayer.source.MediaLoadData;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.google.android.gms.internal.measurement.zzlj;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public final class RumSessionScopeStartupManagerImpl implements RumSessionScopeStartupManager {
    public static final long MAX_TTFD_DURATION_NS;
    public static final long MAX_TTID_DURATION_NS;
    public int appStartCount;
    public RumStartupScenario lastScenario;
    public final MediaLoadData rumAppStartupTelemetryReporter;
    public final MemorySizeCalculator$Builder rumVitalAppLaunchEventHelper;
    public final InternalSdkCore sdkCore;
    public boolean ttfdReportedForScenario;
    public boolean ttfdReportedForSession;
    public boolean ttidReportedForScenario;
    public boolean ttidSentForSession;

    static {
        Duration.Companion companion = Duration.Companion;
        MAX_TTID_DURATION_NS = Duration.m4168getInWholeNanosecondsimpl(DurationKt.toDuration(1, DurationUnit.MINUTES));
        MAX_TTFD_DURATION_NS = Duration.m4168getInWholeNanosecondsimpl(DurationKt.toDuration(90, DurationUnit.SECONDS));
    }

    public RumSessionScopeStartupManagerImpl(MemorySizeCalculator$Builder memorySizeCalculator$Builder, InternalSdkCore internalSdkCore, MediaLoadData mediaLoadData) {
        this.rumVitalAppLaunchEventHelper = memorySizeCalculator$Builder;
        this.sdkCore = internalSdkCore;
        this.rumAppStartupTelemetryReporter = mediaLoadData;
    }

    public final void sendTTFDEvent(final DatadogContext datadogContext, Function1 function1, DataWriter dataWriter, final RumContext rumContext, final Map map, final long j, final RumStartupScenario rumStartupScenario) {
        long j2 = MAX_TTFD_DURATION_NS;
        InternalSdkCore internalSdkCore = this.sdkCore;
        if (j <= j2) {
            SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore, datadogContext, function1, dataWriter, 1, new Function0() { // from class: com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$sendTTFDEvent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    RumSessionScopeStartupManagerImpl rumSessionScopeStartupManagerImpl = RumSessionScopeStartupManagerImpl.this;
                    MemorySizeCalculator$Builder memorySizeCalculator$Builder = rumSessionScopeStartupManagerImpl.rumVitalAppLaunchEventHelper;
                    long j3 = rumStartupScenario.getInitialTime().timestamp + rumSessionScopeStartupManagerImpl.sdkCore.getTime().serverTimeOffsetMs;
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    return memorySizeCalculator$Builder.newVitalAppLaunchEvent(j3, datadogContext, emptyMap, map, rumContext, j, rumStartupScenario, 2, 0);
                }
            }).submit();
            return;
        }
        ((zzlj) internalSdkCore.getInternalLogger()).log(4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), (Function0) RumAppStartupTelemetryReporterImpl$reportTTID$1.INSTANCE$3, (Throwable) null, false, (Map) null);
    }
}
