package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k37;
import defpackage.k4o;
import defpackage.rm6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/surge/models/dto/ButtonStyle;", "", "Companion", "k37", "DEFAULT", "ACCENT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ButtonStyle ACCENT;
    public static final k37 Companion;
    public static final ButtonStyle DEFAULT;
    public static final ButtonStyle UNKNOWN;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("DEFAULT", 0);
        DEFAULT = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("ACCENT", 1);
        ACCENT = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("UNKNOWN", 2);
        UNKNOWN = buttonStyle3;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3};
        $VALUES = buttonStyleArr;
        $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
        Companion = new k37();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(19));
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }
}
