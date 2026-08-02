package ru.yandex.taxi.styling;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.r66;
import defpackage.v37;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/styling/ButtonType;", "", "Companion", "v37", "PROMO", "SURGE", "DEFAULT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final v37 Companion;
    public static final ButtonType DEFAULT;
    public static final ButtonType PROMO;
    public static final ButtonType SURGE;

    static {
        ButtonType buttonType = new ButtonType("PROMO", 0);
        PROMO = buttonType;
        ButtonType buttonType2 = new ButtonType("SURGE", 1);
        SURGE = buttonType2;
        ButtonType buttonType3 = new ButtonType("DEFAULT", 2);
        DEFAULT = buttonType3;
        ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
        $VALUES = buttonTypeArr;
        $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
        Companion = new v37();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(12));
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
