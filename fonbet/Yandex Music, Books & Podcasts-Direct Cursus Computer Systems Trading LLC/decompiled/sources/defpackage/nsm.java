package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nsm {
    public static final nsm a;
    public static final nsm b;
    public static final nsm c;
    public static final nsm d;
    public static final /* synthetic */ nsm[] e;

    static {
        nsm nsmVar = new nsm("IMMEDIATE", 0);
        a = nsmVar;
        nsm nsmVar2 = new nsm("HIGH", 1);
        b = nsmVar2;
        nsm nsmVar3 = new nsm("NORMAL", 2);
        c = nsmVar3;
        nsm nsmVar4 = new nsm("LOW", 3);
        d = nsmVar4;
        e = new nsm[]{nsmVar, nsmVar2, nsmVar3, nsmVar4};
    }

    public static nsm valueOf(String str) {
        return (nsm) Enum.valueOf(nsm.class, str);
    }

    public static nsm[] values() {
        return (nsm[]) e.clone();
    }
}
