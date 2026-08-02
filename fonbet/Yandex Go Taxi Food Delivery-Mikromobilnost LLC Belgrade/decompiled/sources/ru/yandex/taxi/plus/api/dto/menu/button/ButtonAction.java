package ru.yandex.taxi.plus.api.dto.menu.button;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.r66;
import defpackage.ty6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/plus/api/dto/menu/button/ButtonAction;", "", "Companion", "ty6", "PLUS_BUY", "PLUS_UPGRADE", "PLUS_BUY_WEBVIEW", "PLUS_BUY_INAPP", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonAction[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ty6 Companion;
    public static final ButtonAction PLUS_BUY;
    public static final ButtonAction PLUS_BUY_INAPP;
    public static final ButtonAction PLUS_BUY_WEBVIEW;
    public static final ButtonAction PLUS_UPGRADE;
    public static final ButtonAction UNSUPPORTED;

    static {
        ButtonAction buttonAction = new ButtonAction("PLUS_BUY", 0);
        PLUS_BUY = buttonAction;
        ButtonAction buttonAction2 = new ButtonAction("PLUS_UPGRADE", 1);
        PLUS_UPGRADE = buttonAction2;
        ButtonAction buttonAction3 = new ButtonAction("PLUS_BUY_WEBVIEW", 2);
        PLUS_BUY_WEBVIEW = buttonAction3;
        ButtonAction buttonAction4 = new ButtonAction("PLUS_BUY_INAPP", 3);
        PLUS_BUY_INAPP = buttonAction4;
        ButtonAction buttonAction5 = new ButtonAction("UNSUPPORTED", 4);
        UNSUPPORTED = buttonAction5;
        ButtonAction[] buttonActionArr = {buttonAction, buttonAction2, buttonAction3, buttonAction4, buttonAction5};
        $VALUES = buttonActionArr;
        $ENTRIES = a.a(buttonActionArr);
        Companion = new ty6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(7));
    }

    public static ButtonAction valueOf(String str) {
        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
    }

    public static ButtonAction[] values() {
        return (ButtonAction[]) $VALUES.clone();
    }
}
