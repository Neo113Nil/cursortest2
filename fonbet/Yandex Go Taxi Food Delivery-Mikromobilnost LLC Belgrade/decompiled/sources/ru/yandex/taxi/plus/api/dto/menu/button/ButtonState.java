package ru.yandex.taxi.plus.api.dto.menu.button;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.r66;
import defpackage.s27;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/plus/api/dto/menu/button/ButtonState;", "", "Companion", "s27", "IDLE", "PROCESSING", "SUCCESS", "ALREADY_DONE", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ButtonState ALREADY_DONE;
    public static final s27 Companion;
    public static final ButtonState ERROR;
    public static final ButtonState IDLE;
    public static final ButtonState PROCESSING;
    public static final ButtonState SUCCESS;

    static {
        ButtonState buttonState = new ButtonState("IDLE", 0);
        IDLE = buttonState;
        ButtonState buttonState2 = new ButtonState("PROCESSING", 1);
        PROCESSING = buttonState2;
        ButtonState buttonState3 = new ButtonState("SUCCESS", 2);
        SUCCESS = buttonState3;
        ButtonState buttonState4 = new ButtonState("ALREADY_DONE", 3);
        ALREADY_DONE = buttonState4;
        ButtonState buttonState5 = new ButtonState("ERROR", 4);
        ERROR = buttonState5;
        ButtonState[] buttonStateArr = {buttonState, buttonState2, buttonState3, buttonState4, buttonState5};
        $VALUES = buttonStateArr;
        $ENTRIES = a.a(buttonStateArr);
        Companion = new s27();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(9));
    }

    public static ButtonState valueOf(String str) {
        return (ButtonState) Enum.valueOf(ButtonState.class, str);
    }

    public static ButtonState[] values() {
        return (ButtonState[]) $VALUES.clone();
    }
}
