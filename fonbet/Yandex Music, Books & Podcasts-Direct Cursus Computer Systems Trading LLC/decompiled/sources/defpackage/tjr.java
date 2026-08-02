package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class tjr {
    public static final tjr a;
    public static final tjr b;
    public static final tjr c;
    public static final tjr d;
    public static final /* synthetic */ tjr[] e;

    static {
        tjr tjrVar = new tjr("Dash", 0);
        a = tjrVar;
        tjr tjrVar2 = new tjr("Hls", 1);
        b = tjrVar2;
        tjr tjrVar3 = new tjr("MP4", 2);
        c = tjrVar3;
        tjr tjrVar4 = new tjr("Unknown", 3);
        d = tjrVar4;
        e = new tjr[]{tjrVar, tjrVar2, tjrVar3, tjrVar4};
    }

    public static tjr valueOf(String str) {
        return (tjr) Enum.valueOf(tjr.class, str);
    }

    public static tjr[] values() {
        return (tjr[]) e.clone();
    }
}
