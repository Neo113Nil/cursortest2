package ru.yandex.taxi.shortcuts.dto.response.superapp;

import defpackage.fet0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pdu0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/shortcuts/dto/response/superapp/StickersStyle;", "", "Companion", "pdu0", "Eats", "Grocery", "Unknown", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickersStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StickersStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final pdu0 Companion;
    public static final StickersStyle Eats;
    public static final StickersStyle Grocery;
    public static final StickersStyle Unknown;

    static {
        StickersStyle stickersStyle = new StickersStyle("Eats", 0);
        Eats = stickersStyle;
        StickersStyle stickersStyle2 = new StickersStyle("Grocery", 1);
        Grocery = stickersStyle2;
        StickersStyle stickersStyle3 = new StickersStyle("Unknown", 2);
        Unknown = stickersStyle3;
        StickersStyle[] stickersStyleArr = {stickersStyle, stickersStyle2, stickersStyle3};
        $VALUES = stickersStyleArr;
        $ENTRIES = kotlin.enums.a.a(stickersStyleArr);
        Companion = new pdu0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(26));
    }

    public static StickersStyle valueOf(String str) {
        return (StickersStyle) Enum.valueOf(StickersStyle.class, str);
    }

    public static StickersStyle[] values() {
        return (StickersStyle[]) $VALUES.clone();
    }
}
