package just.adapter.sticky;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Ljust/adapter/sticky/StickyGravity;", "", "START", "END", "just-adapter-sticky_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StickyGravity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StickyGravity[] $VALUES;
    public static final StickyGravity END;
    public static final StickyGravity START;

    static {
        StickyGravity stickyGravity = new StickyGravity("START", 0);
        START = stickyGravity;
        StickyGravity stickyGravity2 = new StickyGravity("END", 1);
        END = stickyGravity2;
        StickyGravity[] stickyGravityArr = {stickyGravity, stickyGravity2};
        $VALUES = stickyGravityArr;
        $ENTRIES = kotlin.enums.a.a(stickyGravityArr);
    }

    public static StickyGravity valueOf(String str) {
        return (StickyGravity) Enum.valueOf(StickyGravity.class, str);
    }

    public static StickyGravity[] values() {
        return (StickyGravity[]) $VALUES.clone();
    }
}
