package ru.yandex.taxi.logistics.childrouter.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/childrouter/api/ButtonType;", "", JCP.RAW_PREFIX, "CLOSE", "BACK", "sdk-delivery-child-router"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final ButtonType BACK;
    public static final ButtonType CLOSE;
    public static final ButtonType NONE;

    static {
        ButtonType buttonType = new ButtonType(JCP.RAW_PREFIX, 0);
        NONE = buttonType;
        ButtonType buttonType2 = new ButtonType("CLOSE", 1);
        CLOSE = buttonType2;
        ButtonType buttonType3 = new ButtonType("BACK", 2);
        BACK = buttonType3;
        ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
        $VALUES = buttonTypeArr;
        $ENTRIES = a.a(buttonTypeArr);
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
