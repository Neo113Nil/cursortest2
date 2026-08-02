package flex.animation.player.interpolator;

import defpackage.gsq0;
import defpackage.guw;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ojw;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lflex/animation/player/interpolator/InterpolationType;", "", "Companion", "guw", "Linear", "EaseIn", "EaseOut", "EaseInOut", "flex-animation-player_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InterpolationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InterpolationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final guw Companion;
    public static final InterpolationType EaseIn;
    public static final InterpolationType EaseInOut;
    public static final InterpolationType EaseOut;
    public static final InterpolationType Linear;

    static {
        InterpolationType interpolationType = new InterpolationType("Linear", 0);
        Linear = interpolationType;
        InterpolationType interpolationType2 = new InterpolationType("EaseIn", 1);
        EaseIn = interpolationType2;
        InterpolationType interpolationType3 = new InterpolationType("EaseOut", 2);
        EaseOut = interpolationType3;
        InterpolationType interpolationType4 = new InterpolationType("EaseInOut", 3);
        EaseInOut = interpolationType4;
        InterpolationType[] interpolationTypeArr = {interpolationType, interpolationType2, interpolationType3, interpolationType4};
        $VALUES = interpolationTypeArr;
        $ENTRIES = a.a(interpolationTypeArr);
        Companion = new guw();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(16));
    }

    public static InterpolationType valueOf(String str) {
        return (InterpolationType) Enum.valueOf(InterpolationType.class, str);
    }

    public static InterpolationType[] values() {
        return (InterpolationType[]) $VALUES.clone();
    }
}
