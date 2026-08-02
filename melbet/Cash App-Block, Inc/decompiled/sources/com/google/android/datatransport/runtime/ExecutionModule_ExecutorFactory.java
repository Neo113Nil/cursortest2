package com.google.android.datatransport.runtime;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import com.google.android.gms.measurement.internal.zzjv;
import com.google.mlkit.vision.text.zzc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class ExecutionModule_ExecutorFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    public abstract class InstanceHolder {
        public static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory(0);
    }

    public /* synthetic */ ExecutionModule_ExecutorFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return new zzjv(Executors.newSingleThreadExecutor(), 2);
            default:
                zzc zzcVar = new zzc(5);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null flags");
                    return null;
                }
                hashMap.put(Priority.DEFAULT, new AutoValue_SchedulerConfig_ConfigValue(30000L, 86400000L, set));
                if (set == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null flags");
                    return null;
                }
                hashMap.put(Priority.HIGHEST, new AutoValue_SchedulerConfig_ConfigValue(1000L, 86400000L, set));
                if (set == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null flags");
                    return null;
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig$Flag.DEVICE_IDLE)));
                if (unmodifiableSet == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null flags");
                    return null;
                }
                hashMap.put(Priority.VERY_LOW, new AutoValue_SchedulerConfig_ConfigValue(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() >= Priority.values().length) {
                    new HashMap();
                    return new AutoValue_SchedulerConfig(zzcVar, hashMap);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Not all priorities have been configured");
                return null;
        }
    }
}
