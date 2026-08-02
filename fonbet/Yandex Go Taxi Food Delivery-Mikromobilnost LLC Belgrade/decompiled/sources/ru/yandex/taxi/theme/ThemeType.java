package ru.yandex.taxi.theme;

import defpackage.k4o;
import defpackage.rwy0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "", "", "wireName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "rwy0", "LIGHT", "DARK", "go-client-android.libs:design_models_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThemeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;
    public static final rwy0 Companion;
    public static final ThemeType DARK;
    public static final ThemeType LIGHT;
    private final String wireName;

    static {
        ThemeType themeType = new ThemeType("LIGHT", 0, "LIGHT");
        LIGHT = themeType;
        ThemeType themeType2 = new ThemeType("DARK", 1, "DARK");
        DARK = themeType2;
        ThemeType[] themeTypeArr = {themeType, themeType2};
        $VALUES = themeTypeArr;
        $ENTRIES = a.a(themeTypeArr);
        Companion = new rwy0();
    }

    public ThemeType(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }

    public final boolean c() {
        return this == DARK;
    }

    public final boolean f() {
        return this == LIGHT;
    }
}
