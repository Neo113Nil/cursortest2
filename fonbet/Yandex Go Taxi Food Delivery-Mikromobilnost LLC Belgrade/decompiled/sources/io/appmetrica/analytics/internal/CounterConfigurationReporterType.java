package io.appmetrica.analytics.internal;

import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/internal/CounterConfigurationReporterType;", "", "", "a", "Ljava/lang/String;", "getStringValue", "()Ljava/lang/String;", "stringValue", "Companion", "MAIN", "MANUAL", "SELF_SDK", "COMMUTATION", "SELF_DIAGNOSTIC_MAIN", "SELF_DIAGNOSTIC_MANUAL", "CRASH", "analytics-yandex_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class CounterConfigurationReporterType {
    public static final CounterConfigurationReporterType COMMUTATION;
    public static final CounterConfigurationReporterType CRASH;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CounterConfigurationReporterType MAIN;
    public static final CounterConfigurationReporterType MANUAL;
    public static final CounterConfigurationReporterType SELF_DIAGNOSTIC_MAIN;
    public static final CounterConfigurationReporterType SELF_DIAGNOSTIC_MANUAL;
    public static final CounterConfigurationReporterType SELF_SDK;
    private static final /* synthetic */ CounterConfigurationReporterType[] b;
    private static final /* synthetic */ k4o c;

    /* renamed from: a, reason: from kotlin metadata */
    private final String stringValue;

    static {
        CounterConfigurationReporterType counterConfigurationReporterType = new CounterConfigurationReporterType(0, "MAIN", "main");
        MAIN = counterConfigurationReporterType;
        CounterConfigurationReporterType counterConfigurationReporterType2 = new CounterConfigurationReporterType(1, "MANUAL", "manual");
        MANUAL = counterConfigurationReporterType2;
        CounterConfigurationReporterType counterConfigurationReporterType3 = new CounterConfigurationReporterType(2, "SELF_SDK", "self_sdk");
        SELF_SDK = counterConfigurationReporterType3;
        CounterConfigurationReporterType counterConfigurationReporterType4 = new CounterConfigurationReporterType(3, "COMMUTATION", "commutation");
        COMMUTATION = counterConfigurationReporterType4;
        CounterConfigurationReporterType counterConfigurationReporterType5 = new CounterConfigurationReporterType(4, "SELF_DIAGNOSTIC_MAIN", "self_diagnostic_main");
        SELF_DIAGNOSTIC_MAIN = counterConfigurationReporterType5;
        CounterConfigurationReporterType counterConfigurationReporterType6 = new CounterConfigurationReporterType(5, "SELF_DIAGNOSTIC_MANUAL", "self_diagnostic_manual");
        SELF_DIAGNOSTIC_MANUAL = counterConfigurationReporterType6;
        CounterConfigurationReporterType counterConfigurationReporterType7 = new CounterConfigurationReporterType(6, "CRASH", "crash");
        CRASH = counterConfigurationReporterType7;
        CounterConfigurationReporterType[] counterConfigurationReporterTypeArr = {counterConfigurationReporterType, counterConfigurationReporterType2, counterConfigurationReporterType3, counterConfigurationReporterType4, counterConfigurationReporterType5, counterConfigurationReporterType6, counterConfigurationReporterType7};
        b = counterConfigurationReporterTypeArr;
        c = kotlin.enums.a.a(counterConfigurationReporterTypeArr);
        INSTANCE = new Companion(null);
    }

    private CounterConfigurationReporterType(int i, String str, String str2) {
        this.stringValue = str2;
    }

    public static final CounterConfigurationReporterType fromStringValue(String str) {
        return INSTANCE.fromStringValue(str);
    }

    public static k4o getEntries() {
        return c;
    }

    public static CounterConfigurationReporterType valueOf(String str) {
        return (CounterConfigurationReporterType) Enum.valueOf(CounterConfigurationReporterType.class, str);
    }

    public static CounterConfigurationReporterType[] values() {
        return (CounterConfigurationReporterType[]) b.clone();
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/internal/CounterConfigurationReporterType$Companion;", "", "", "value", "Lio/appmetrica/analytics/internal/CounterConfigurationReporterType;", "fromStringValue", "analytics-yandex_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CounterConfigurationReporterType fromStringValue(String value) {
            CounterConfigurationReporterType counterConfigurationReporterType;
            CounterConfigurationReporterType[] values = CounterConfigurationReporterType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    counterConfigurationReporterType = null;
                    break;
                }
                counterConfigurationReporterType = values[i];
                if (jl40.l(counterConfigurationReporterType.getStringValue(), value)) {
                    break;
                }
                i++;
            }
            return counterConfigurationReporterType == null ? CounterConfigurationReporterType.MAIN : counterConfigurationReporterType;
        }

        private Companion() {
        }
    }
}
