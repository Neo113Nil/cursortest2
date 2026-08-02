package ru.yandex.taxi.eatskit.dto;

import defpackage.ca70;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.y570;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/eatskit/dto/OpenYbParams$ScreenType", "", "Lru/yandex/taxi/eatskit/dto/OpenYbParams$ScreenType;", "Companion", "ca70", "DASHBOARD", "DEPOSIT", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenYbParams$ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpenYbParams$ScreenType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ca70 Companion;
    public static final OpenYbParams$ScreenType DASHBOARD;
    public static final OpenYbParams$ScreenType DEPOSIT;

    static {
        OpenYbParams$ScreenType openYbParams$ScreenType = new OpenYbParams$ScreenType("DASHBOARD", 0);
        DASHBOARD = openYbParams$ScreenType;
        OpenYbParams$ScreenType openYbParams$ScreenType2 = new OpenYbParams$ScreenType("DEPOSIT", 1);
        DEPOSIT = openYbParams$ScreenType2;
        OpenYbParams$ScreenType[] openYbParams$ScreenTypeArr = {openYbParams$ScreenType, openYbParams$ScreenType2};
        $VALUES = openYbParams$ScreenTypeArr;
        $ENTRIES = kotlin.enums.a.a(openYbParams$ScreenTypeArr);
        Companion = new ca70();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(22));
    }

    public static OpenYbParams$ScreenType valueOf(String str) {
        return (OpenYbParams$ScreenType) Enum.valueOf(OpenYbParams$ScreenType.class, str);
    }

    public static OpenYbParams$ScreenType[] values() {
        return (OpenYbParams$ScreenType[]) $VALUES.clone();
    }
}
