package just.adapter.scroll.experimental;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ljust/adapter/scroll/experimental/OptimizedPaginationTriggerFeatureConfig;", "", "DISABLED", "ENABLED_AUTOMATIC_TRIGGER", "ENABLED_MANUAL_TRIGGER", "just-adapter-scroll-control_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OptimizedPaginationTriggerFeatureConfig {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OptimizedPaginationTriggerFeatureConfig[] $VALUES;
    public static final OptimizedPaginationTriggerFeatureConfig DISABLED;
    public static final OptimizedPaginationTriggerFeatureConfig ENABLED_AUTOMATIC_TRIGGER;
    public static final OptimizedPaginationTriggerFeatureConfig ENABLED_MANUAL_TRIGGER;

    static {
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig = new OptimizedPaginationTriggerFeatureConfig("DISABLED", 0);
        DISABLED = optimizedPaginationTriggerFeatureConfig;
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig2 = new OptimizedPaginationTriggerFeatureConfig("ENABLED_AUTOMATIC_TRIGGER", 1);
        ENABLED_AUTOMATIC_TRIGGER = optimizedPaginationTriggerFeatureConfig2;
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig3 = new OptimizedPaginationTriggerFeatureConfig("ENABLED_MANUAL_TRIGGER", 2);
        ENABLED_MANUAL_TRIGGER = optimizedPaginationTriggerFeatureConfig3;
        OptimizedPaginationTriggerFeatureConfig[] optimizedPaginationTriggerFeatureConfigArr = {optimizedPaginationTriggerFeatureConfig, optimizedPaginationTriggerFeatureConfig2, optimizedPaginationTriggerFeatureConfig3};
        $VALUES = optimizedPaginationTriggerFeatureConfigArr;
        $ENTRIES = a.a(optimizedPaginationTriggerFeatureConfigArr);
    }

    public static OptimizedPaginationTriggerFeatureConfig valueOf(String str) {
        return (OptimizedPaginationTriggerFeatureConfig) Enum.valueOf(OptimizedPaginationTriggerFeatureConfig.class, str);
    }

    public static OptimizedPaginationTriggerFeatureConfig[] values() {
        return (OptimizedPaginationTriggerFeatureConfig[]) $VALUES.clone();
    }
}
