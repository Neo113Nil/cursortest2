package ru.yandex.taxi.plus.purchase;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/purchase/AvailableButtonAction;", "", "BUY", "BUY_INAPP", "UPGRADE", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvailableButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AvailableButtonAction[] $VALUES;
    public static final AvailableButtonAction BUY;
    public static final AvailableButtonAction BUY_INAPP;
    public static final AvailableButtonAction NONE;
    public static final AvailableButtonAction UPGRADE;

    static {
        AvailableButtonAction availableButtonAction = new AvailableButtonAction("BUY", 0);
        BUY = availableButtonAction;
        AvailableButtonAction availableButtonAction2 = new AvailableButtonAction("BUY_INAPP", 1);
        BUY_INAPP = availableButtonAction2;
        AvailableButtonAction availableButtonAction3 = new AvailableButtonAction("UPGRADE", 2);
        UPGRADE = availableButtonAction3;
        AvailableButtonAction availableButtonAction4 = new AvailableButtonAction(JCP.RAW_PREFIX, 3);
        NONE = availableButtonAction4;
        AvailableButtonAction[] availableButtonActionArr = {availableButtonAction, availableButtonAction2, availableButtonAction3, availableButtonAction4};
        $VALUES = availableButtonActionArr;
        $ENTRIES = kotlin.enums.a.a(availableButtonActionArr);
    }

    public static AvailableButtonAction valueOf(String str) {
        return (AvailableButtonAction) Enum.valueOf(AvailableButtonAction.class, str);
    }

    public static AvailableButtonAction[] values() {
        return (AvailableButtonAction[]) $VALUES.clone();
    }
}
