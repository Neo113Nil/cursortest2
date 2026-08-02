package ru.yandex.taxi.persuggest.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.oc00;
import defpackage.t5z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/persuggest/api/MainScreenVersion;", "", "Companion", "oc00", "SHORTCUTS", "SUPEPAPP_MAIN", "FLEX_MAIN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MainScreenVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenVersion[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final oc00 Companion;
    public static final MainScreenVersion FLEX_MAIN;
    public static final MainScreenVersion SHORTCUTS;
    public static final MainScreenVersion SUPEPAPP_MAIN;

    static {
        MainScreenVersion mainScreenVersion = new MainScreenVersion("SHORTCUTS", 0);
        SHORTCUTS = mainScreenVersion;
        MainScreenVersion mainScreenVersion2 = new MainScreenVersion("SUPEPAPP_MAIN", 1);
        SUPEPAPP_MAIN = mainScreenVersion2;
        MainScreenVersion mainScreenVersion3 = new MainScreenVersion("FLEX_MAIN", 2);
        FLEX_MAIN = mainScreenVersion3;
        MainScreenVersion[] mainScreenVersionArr = {mainScreenVersion, mainScreenVersion2, mainScreenVersion3};
        $VALUES = mainScreenVersionArr;
        $ENTRIES = kotlin.enums.a.a(mainScreenVersionArr);
        Companion = new oc00();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(9));
    }

    public static MainScreenVersion valueOf(String str) {
        return (MainScreenVersion) Enum.valueOf(MainScreenVersion.class, str);
    }

    public static MainScreenVersion[] values() {
        return (MainScreenVersion[]) $VALUES.clone();
    }
}
