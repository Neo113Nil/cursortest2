package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lsm {
    public static final lsm a;
    public static final lsm b;
    public static final lsm c;
    public static final /* synthetic */ lsm[] d;

    static {
        lsm lsmVar = new lsm("DEFAULT", 0);
        a = lsmVar;
        lsm lsmVar2 = new lsm("VERY_LOW", 1);
        b = lsmVar2;
        lsm lsmVar3 = new lsm("HIGHEST", 2);
        c = lsmVar3;
        d = new lsm[]{lsmVar, lsmVar2, lsmVar3};
    }

    public static lsm valueOf(String str) {
        return (lsm) Enum.valueOf(lsm.class, str);
    }

    public static lsm[] values() {
        return (lsm[]) d.clone();
    }
}
