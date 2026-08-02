package com.datadog.android.core.internal.time;

import com.datadog.android.api.InternalLogger;
import com.google.android.gms.internal.measurement.zzlj;
import com.lyft.kronos.internal.KronosClockImpl;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class KronosTimeProvider extends Strings {
    public final KronosClockImpl clock;
    public final InternalLogger internalLogger;

    public KronosTimeProvider(KronosClockImpl kronosClockImpl, InternalLogger internalLogger) {
        internalLogger.getClass();
        this.clock = kronosClockImpl;
        this.internalLogger = internalLogger;
    }

    @Override // com.squareup.util.Strings
    public final long getServerTimestampMillis() {
        Object failure;
        KronosClockImpl kronosClockImpl = this.clock;
        try {
            Result.Companion companion = Result.Companion;
            failure = Long.valueOf(kronosClockImpl.getCurrentTimeMs());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY});
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            ((zzlj) this.internalLogger).log(4, listOf, (Function0) KronosTimeProvider$safeGetCurrentTimeMs$2$1.INSTANCE, m4120exceptionOrNullimpl, true, (Map) emptyMap);
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
            failure = Long.valueOf(System.currentTimeMillis());
        }
        return ((Number) failure).longValue();
    }
}
