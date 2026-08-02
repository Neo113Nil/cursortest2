package ru.yandex.taxi.persuggest.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/persuggest/analytics/SelectedLocationChangedAnalytics$AppLaunchType", "", "Lru/yandex/taxi/persuggest/analytics/SelectedLocationChangedAnalytics$AppLaunchType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Cold", "Warm", "Hot", "Abandoned", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectedLocationChangedAnalytics$AppLaunchType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectedLocationChangedAnalytics$AppLaunchType[] $VALUES;
    public static final SelectedLocationChangedAnalytics$AppLaunchType Abandoned;
    public static final SelectedLocationChangedAnalytics$AppLaunchType Cold;
    public static final SelectedLocationChangedAnalytics$AppLaunchType Hot;
    public static final SelectedLocationChangedAnalytics$AppLaunchType Warm;
    private final String eventValue;

    static {
        SelectedLocationChangedAnalytics$AppLaunchType selectedLocationChangedAnalytics$AppLaunchType = new SelectedLocationChangedAnalytics$AppLaunchType("Cold", 0, "cold");
        Cold = selectedLocationChangedAnalytics$AppLaunchType;
        SelectedLocationChangedAnalytics$AppLaunchType selectedLocationChangedAnalytics$AppLaunchType2 = new SelectedLocationChangedAnalytics$AppLaunchType("Warm", 1, "warm");
        Warm = selectedLocationChangedAnalytics$AppLaunchType2;
        SelectedLocationChangedAnalytics$AppLaunchType selectedLocationChangedAnalytics$AppLaunchType3 = new SelectedLocationChangedAnalytics$AppLaunchType("Hot", 2, "hot");
        Hot = selectedLocationChangedAnalytics$AppLaunchType3;
        SelectedLocationChangedAnalytics$AppLaunchType selectedLocationChangedAnalytics$AppLaunchType4 = new SelectedLocationChangedAnalytics$AppLaunchType("Abandoned", 3, "abandoned");
        Abandoned = selectedLocationChangedAnalytics$AppLaunchType4;
        SelectedLocationChangedAnalytics$AppLaunchType[] selectedLocationChangedAnalytics$AppLaunchTypeArr = {selectedLocationChangedAnalytics$AppLaunchType, selectedLocationChangedAnalytics$AppLaunchType2, selectedLocationChangedAnalytics$AppLaunchType3, selectedLocationChangedAnalytics$AppLaunchType4};
        $VALUES = selectedLocationChangedAnalytics$AppLaunchTypeArr;
        $ENTRIES = a.a(selectedLocationChangedAnalytics$AppLaunchTypeArr);
    }

    public SelectedLocationChangedAnalytics$AppLaunchType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SelectedLocationChangedAnalytics$AppLaunchType valueOf(String str) {
        return (SelectedLocationChangedAnalytics$AppLaunchType) Enum.valueOf(SelectedLocationChangedAnalytics$AppLaunchType.class, str);
    }

    public static SelectedLocationChangedAnalytics$AppLaunchType[] values() {
        return (SelectedLocationChangedAnalytics$AppLaunchType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
