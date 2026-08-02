package ru.yandex.taxi.logistics.sdk.ui.component.misc;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/component/misc/EnterAnimation;", "", "FADE_IN", "SCALE_IN", "SLIDE_IN", "SLIDE_IN_HORIZONTALLY", "SLIDE_IN_VERTICALLY", "EXPAND_IN", "EXPAND_HORIZONTALLY", "EXPAND_VERTICALLY", "DEFAULT", "sdk-ui-components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnterAnimation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EnterAnimation[] $VALUES;
    public static final EnterAnimation DEFAULT;
    public static final EnterAnimation EXPAND_HORIZONTALLY;
    public static final EnterAnimation EXPAND_IN;
    public static final EnterAnimation EXPAND_VERTICALLY;
    public static final EnterAnimation FADE_IN;
    public static final EnterAnimation SCALE_IN;
    public static final EnterAnimation SLIDE_IN;
    public static final EnterAnimation SLIDE_IN_HORIZONTALLY;
    public static final EnterAnimation SLIDE_IN_VERTICALLY;

    static {
        EnterAnimation enterAnimation = new EnterAnimation("FADE_IN", 0);
        FADE_IN = enterAnimation;
        EnterAnimation enterAnimation2 = new EnterAnimation("SCALE_IN", 1);
        SCALE_IN = enterAnimation2;
        EnterAnimation enterAnimation3 = new EnterAnimation("SLIDE_IN", 2);
        SLIDE_IN = enterAnimation3;
        EnterAnimation enterAnimation4 = new EnterAnimation("SLIDE_IN_HORIZONTALLY", 3);
        SLIDE_IN_HORIZONTALLY = enterAnimation4;
        EnterAnimation enterAnimation5 = new EnterAnimation("SLIDE_IN_VERTICALLY", 4);
        SLIDE_IN_VERTICALLY = enterAnimation5;
        EnterAnimation enterAnimation6 = new EnterAnimation("EXPAND_IN", 5);
        EXPAND_IN = enterAnimation6;
        EnterAnimation enterAnimation7 = new EnterAnimation("EXPAND_HORIZONTALLY", 6);
        EXPAND_HORIZONTALLY = enterAnimation7;
        EnterAnimation enterAnimation8 = new EnterAnimation("EXPAND_VERTICALLY", 7);
        EXPAND_VERTICALLY = enterAnimation8;
        EnterAnimation enterAnimation9 = new EnterAnimation("DEFAULT", 8);
        DEFAULT = enterAnimation9;
        EnterAnimation[] enterAnimationArr = {enterAnimation, enterAnimation2, enterAnimation3, enterAnimation4, enterAnimation5, enterAnimation6, enterAnimation7, enterAnimation8, enterAnimation9};
        $VALUES = enterAnimationArr;
        $ENTRIES = kotlin.enums.a.a(enterAnimationArr);
    }

    public static EnterAnimation valueOf(String str) {
        return (EnterAnimation) Enum.valueOf(EnterAnimation.class, str);
    }

    public static EnterAnimation[] values() {
        return (EnterAnimation[]) $VALUES.clone();
    }
}
