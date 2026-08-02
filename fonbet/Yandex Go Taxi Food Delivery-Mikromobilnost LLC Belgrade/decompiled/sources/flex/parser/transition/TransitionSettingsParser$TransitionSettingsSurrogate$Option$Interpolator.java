package flex.parser.transition;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tc01;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"flex/parser/transition/TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator", "", "Lflex/parser/transition/TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator;", "Companion", "flex/parser/transition/e", "Linear", "EaseIn", "EaseOut", "EaseInOut", "flex-parser"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final e Companion;
    public static final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator EaseIn;
    public static final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator EaseInOut;
    public static final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator EaseOut;
    public static final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator Linear;

    static {
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator = new TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator("Linear", 0);
        Linear = transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator2 = new TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator("EaseIn", 1);
        EaseIn = transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator2;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator3 = new TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator("EaseOut", 2);
        EaseOut = transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator3;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator4 = new TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator("EaseInOut", 3);
        EaseInOut = transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator4;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator[] transitionSettingsParser$TransitionSettingsSurrogate$Option$InterpolatorArr = {transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator, transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator2, transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator3, transitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator4};
        $VALUES = transitionSettingsParser$TransitionSettingsSurrogate$Option$InterpolatorArr;
        $ENTRIES = kotlin.enums.a.a(transitionSettingsParser$TransitionSettingsSurrogate$Option$InterpolatorArr);
        Companion = new e();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(21));
    }

    public static TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator valueOf(String str) {
        return (TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator) Enum.valueOf(TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.class, str);
    }

    public static TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator[] values() {
        return (TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator[]) $VALUES.clone();
    }
}
