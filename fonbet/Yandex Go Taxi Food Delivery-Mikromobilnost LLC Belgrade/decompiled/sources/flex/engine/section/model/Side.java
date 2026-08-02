package flex.engine.section.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mas0;
import defpackage.s7s0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lflex/engine/section/model/Side;", "", "Companion", "mas0", "TOP", "BOTTOM", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Side {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Side[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Side BOTTOM;
    public static final mas0 Companion;
    public static final Side TOP;

    static {
        Side side = new Side("TOP", 0);
        TOP = side;
        Side side2 = new Side("BOTTOM", 1);
        BOTTOM = side2;
        Side[] sideArr = {side, side2};
        $VALUES = sideArr;
        $ENTRIES = a.a(sideArr);
        Companion = new mas0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(4));
    }

    public static Side valueOf(String str) {
        return (Side) Enum.valueOf(Side.class, str);
    }

    public static Side[] values() {
        return (Side[]) $VALUES.clone();
    }
}
