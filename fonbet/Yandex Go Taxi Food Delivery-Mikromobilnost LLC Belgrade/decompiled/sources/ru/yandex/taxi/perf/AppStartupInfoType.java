package ru.yandex.taxi.perf;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/perf/AppStartupInfoType;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "logName", "getLogName", "Cold", "Warm", "Hot", "Abandoned", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppStartupInfoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AppStartupInfoType[] $VALUES;
    public static final AppStartupInfoType Abandoned;
    public static final AppStartupInfoType Cold;
    public static final AppStartupInfoType Hot;
    public static final AppStartupInfoType Warm;
    private final String analyticsName;
    private final String logName;

    static {
        AppStartupInfoType appStartupInfoType = new AppStartupInfoType("Cold", 0, "cold", "Cold");
        Cold = appStartupInfoType;
        AppStartupInfoType appStartupInfoType2 = new AppStartupInfoType("Warm", 1, "warm", "Warm");
        Warm = appStartupInfoType2;
        AppStartupInfoType appStartupInfoType3 = new AppStartupInfoType("Hot", 2, "hot", "Hot");
        Hot = appStartupInfoType3;
        AppStartupInfoType appStartupInfoType4 = new AppStartupInfoType("Abandoned", 3, "abandoned", "Abandoned");
        Abandoned = appStartupInfoType4;
        AppStartupInfoType[] appStartupInfoTypeArr = {appStartupInfoType, appStartupInfoType2, appStartupInfoType3, appStartupInfoType4};
        $VALUES = appStartupInfoTypeArr;
        $ENTRIES = kotlin.enums.a.a(appStartupInfoTypeArr);
    }

    public AppStartupInfoType(String str, int i, String str2, String str3) {
        this.analyticsName = str2;
        this.logName = str3;
    }

    public static AppStartupInfoType valueOf(String str) {
        return (AppStartupInfoType) Enum.valueOf(AppStartupInfoType.class, str);
    }

    public static AppStartupInfoType[] values() {
        return (AppStartupInfoType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
