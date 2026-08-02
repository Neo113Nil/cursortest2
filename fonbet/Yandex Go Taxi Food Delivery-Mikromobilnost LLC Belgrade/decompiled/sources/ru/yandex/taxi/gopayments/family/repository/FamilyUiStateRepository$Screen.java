package ru.yandex.taxi.gopayments.family.repository;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/gopayments/family/repository/FamilyUiStateRepository$Screen", "", "Lru/yandex/taxi/gopayments/family/repository/FamilyUiStateRepository$Screen;", "FAMILY_WEB_VIEW", "FAMILY_INVITE", "ZALOGIN_FULLSCREEN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FamilyUiStateRepository$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FamilyUiStateRepository$Screen[] $VALUES;
    public static final FamilyUiStateRepository$Screen FAMILY_INVITE;
    public static final FamilyUiStateRepository$Screen FAMILY_WEB_VIEW;
    public static final FamilyUiStateRepository$Screen ZALOGIN_FULLSCREEN;

    static {
        FamilyUiStateRepository$Screen familyUiStateRepository$Screen = new FamilyUiStateRepository$Screen("FAMILY_WEB_VIEW", 0);
        FAMILY_WEB_VIEW = familyUiStateRepository$Screen;
        FamilyUiStateRepository$Screen familyUiStateRepository$Screen2 = new FamilyUiStateRepository$Screen("FAMILY_INVITE", 1);
        FAMILY_INVITE = familyUiStateRepository$Screen2;
        FamilyUiStateRepository$Screen familyUiStateRepository$Screen3 = new FamilyUiStateRepository$Screen("ZALOGIN_FULLSCREEN", 2);
        ZALOGIN_FULLSCREEN = familyUiStateRepository$Screen3;
        FamilyUiStateRepository$Screen[] familyUiStateRepository$ScreenArr = {familyUiStateRepository$Screen, familyUiStateRepository$Screen2, familyUiStateRepository$Screen3};
        $VALUES = familyUiStateRepository$ScreenArr;
        $ENTRIES = a.a(familyUiStateRepository$ScreenArr);
    }

    public static FamilyUiStateRepository$Screen valueOf(String str) {
        return (FamilyUiStateRepository$Screen) Enum.valueOf(FamilyUiStateRepository$Screen.class, str);
    }

    public static FamilyUiStateRepository$Screen[] values() {
        return (FamilyUiStateRepository$Screen[]) $VALUES.clone();
    }
}
