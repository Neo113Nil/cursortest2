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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"flex/parser/transition/TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition", "", "Lflex/parser/transition/TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition;", "Companion", "flex/parser/transition/f", "CrossDissolve", "BottomSurfacing", "flex-parser"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition BottomSurfacing;
    public static final f Companion;
    public static final TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition CrossDissolve;

    static {
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition = new TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition("CrossDissolve", 0);
        CrossDissolve = transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition2 = new TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition("BottomSurfacing", 1);
        BottomSurfacing = transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition2;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition[] transitionSettingsParser$TransitionSettingsSurrogate$Option$TransitionArr = {transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition, transitionSettingsParser$TransitionSettingsSurrogate$Option$Transition2};
        $VALUES = transitionSettingsParser$TransitionSettingsSurrogate$Option$TransitionArr;
        $ENTRIES = kotlin.enums.a.a(transitionSettingsParser$TransitionSettingsSurrogate$Option$TransitionArr);
        Companion = new f();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(22));
    }

    public static TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition valueOf(String str) {
        return (TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition) Enum.valueOf(TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.class, str);
    }

    public static TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition[] values() {
        return (TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition[]) $VALUES.clone();
    }
}
