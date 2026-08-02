package ru.yandex.taxi.ui;

import defpackage.k4o;
import defpackage.ybs;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/ui/FragmentBackground;", "", "Companion", "ybs", "BLANK", JCP.RAW_PREFIX, "MAP", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FragmentBackground {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FragmentBackground[] $VALUES;
    public static final FragmentBackground BLANK;
    public static final ybs Companion;
    public static final FragmentBackground MAP;
    public static final FragmentBackground NONE;

    static {
        FragmentBackground fragmentBackground = new FragmentBackground("BLANK", 0);
        BLANK = fragmentBackground;
        FragmentBackground fragmentBackground2 = new FragmentBackground(JCP.RAW_PREFIX, 1);
        NONE = fragmentBackground2;
        FragmentBackground fragmentBackground3 = new FragmentBackground("MAP", 2);
        MAP = fragmentBackground3;
        FragmentBackground[] fragmentBackgroundArr = {fragmentBackground, fragmentBackground2, fragmentBackground3};
        $VALUES = fragmentBackgroundArr;
        $ENTRIES = a.a(fragmentBackgroundArr);
        Companion = new ybs();
    }

    public static FragmentBackground valueOf(String str) {
        return (FragmentBackground) Enum.valueOf(FragmentBackground.class, str);
    }

    public static FragmentBackground[] values() {
        return (FragmentBackground[]) $VALUES.clone();
    }
}
