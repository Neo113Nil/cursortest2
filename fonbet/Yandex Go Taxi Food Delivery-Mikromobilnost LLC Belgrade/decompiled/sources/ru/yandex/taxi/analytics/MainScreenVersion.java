package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/analytics/MainScreenVersion;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UNSPECIFIED", "FLEX", "SHORTCUTS", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MainScreenVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenVersion[] $VALUES;
    public static final MainScreenVersion FLEX;
    public static final MainScreenVersion SHORTCUTS;
    public static final MainScreenVersion UNSPECIFIED;
    private final String analyticsName;

    static {
        MainScreenVersion mainScreenVersion = new MainScreenVersion("UNSPECIFIED", 0, "unspecified");
        UNSPECIFIED = mainScreenVersion;
        MainScreenVersion mainScreenVersion2 = new MainScreenVersion("FLEX", 1, "flex_main");
        FLEX = mainScreenVersion2;
        MainScreenVersion mainScreenVersion3 = new MainScreenVersion("SHORTCUTS", 2, "shortcuts");
        SHORTCUTS = mainScreenVersion3;
        MainScreenVersion[] mainScreenVersionArr = {mainScreenVersion, mainScreenVersion2, mainScreenVersion3};
        $VALUES = mainScreenVersionArr;
        $ENTRIES = a.a(mainScreenVersionArr);
    }

    public MainScreenVersion(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static MainScreenVersion valueOf(String str) {
        return (MainScreenVersion) Enum.valueOf(MainScreenVersion.class, str);
    }

    public static MainScreenVersion[] values() {
        return (MainScreenVersion[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
