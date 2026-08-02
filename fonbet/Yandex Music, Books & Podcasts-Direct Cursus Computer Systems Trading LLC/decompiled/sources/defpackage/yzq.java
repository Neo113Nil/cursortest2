package defpackage;

import java.util.EnumSet;

/* loaded from: classes.dex */
public enum yzq {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public static final EnumSet e;
    public final long a;

    static {
        EnumSet allOf = EnumSet.allOf(yzq.class);
        allOf.getClass();
        e = allOf;
    }

    yzq(long j) {
        this.a = j;
    }
}
