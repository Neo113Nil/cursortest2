package ru.yandex.taxi.logistics.sdk.ui.component.misc;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/component/misc/ExitAnimation;", "", "FADE_OUT", "SCALE_OUT", "SLIDE_OUT", "SLIDE_OUT_HORIZONTALLY", "SLIDE_OUT_VERTICALLY", "SHRINK_OUT", "SHRINK_HORIZONTALLY", "SHRINK_VERTICALLY", "DEFAULT", "sdk-ui-components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExitAnimation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExitAnimation[] $VALUES;
    public static final ExitAnimation DEFAULT;
    public static final ExitAnimation FADE_OUT;
    public static final ExitAnimation SCALE_OUT;
    public static final ExitAnimation SHRINK_HORIZONTALLY;
    public static final ExitAnimation SHRINK_OUT;
    public static final ExitAnimation SHRINK_VERTICALLY;
    public static final ExitAnimation SLIDE_OUT;
    public static final ExitAnimation SLIDE_OUT_HORIZONTALLY;
    public static final ExitAnimation SLIDE_OUT_VERTICALLY;

    static {
        ExitAnimation exitAnimation = new ExitAnimation("FADE_OUT", 0);
        FADE_OUT = exitAnimation;
        ExitAnimation exitAnimation2 = new ExitAnimation("SCALE_OUT", 1);
        SCALE_OUT = exitAnimation2;
        ExitAnimation exitAnimation3 = new ExitAnimation("SLIDE_OUT", 2);
        SLIDE_OUT = exitAnimation3;
        ExitAnimation exitAnimation4 = new ExitAnimation("SLIDE_OUT_HORIZONTALLY", 3);
        SLIDE_OUT_HORIZONTALLY = exitAnimation4;
        ExitAnimation exitAnimation5 = new ExitAnimation("SLIDE_OUT_VERTICALLY", 4);
        SLIDE_OUT_VERTICALLY = exitAnimation5;
        ExitAnimation exitAnimation6 = new ExitAnimation("SHRINK_OUT", 5);
        SHRINK_OUT = exitAnimation6;
        ExitAnimation exitAnimation7 = new ExitAnimation("SHRINK_HORIZONTALLY", 6);
        SHRINK_HORIZONTALLY = exitAnimation7;
        ExitAnimation exitAnimation8 = new ExitAnimation("SHRINK_VERTICALLY", 7);
        SHRINK_VERTICALLY = exitAnimation8;
        ExitAnimation exitAnimation9 = new ExitAnimation("DEFAULT", 8);
        DEFAULT = exitAnimation9;
        ExitAnimation[] exitAnimationArr = {exitAnimation, exitAnimation2, exitAnimation3, exitAnimation4, exitAnimation5, exitAnimation6, exitAnimation7, exitAnimation8, exitAnimation9};
        $VALUES = exitAnimationArr;
        $ENTRIES = kotlin.enums.a.a(exitAnimationArr);
    }

    public static ExitAnimation valueOf(String str) {
        return (ExitAnimation) Enum.valueOf(ExitAnimation.class, str);
    }

    public static ExitAnimation[] values() {
        return (ExitAnimation[]) $VALUES.clone();
    }
}
