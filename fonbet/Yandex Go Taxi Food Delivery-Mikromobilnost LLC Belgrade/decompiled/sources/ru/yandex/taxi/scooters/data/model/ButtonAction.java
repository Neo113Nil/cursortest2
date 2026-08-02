package ru.yandex.taxi.scooters.data.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/data/model/ButtonAction;", "", "TRY_AGAIN", "SUPPORT", "PAYMENT_METHODS", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonAction[] $VALUES;
    public static final ButtonAction PAYMENT_METHODS;
    public static final ButtonAction SUPPORT;
    public static final ButtonAction TRY_AGAIN;

    static {
        ButtonAction buttonAction = new ButtonAction("TRY_AGAIN", 0);
        TRY_AGAIN = buttonAction;
        ButtonAction buttonAction2 = new ButtonAction("SUPPORT", 1);
        SUPPORT = buttonAction2;
        ButtonAction buttonAction3 = new ButtonAction("PAYMENT_METHODS", 2);
        PAYMENT_METHODS = buttonAction3;
        ButtonAction[] buttonActionArr = {buttonAction, buttonAction2, buttonAction3};
        $VALUES = buttonActionArr;
        $ENTRIES = a.a(buttonActionArr);
    }

    public static ButtonAction valueOf(String str) {
        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
    }

    public static ButtonAction[] values() {
        return (ButtonAction[]) $VALUES.clone();
    }
}
