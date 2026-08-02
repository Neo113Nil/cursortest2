package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zyj {
    public static final zyj a;
    public static final zyj b;
    public static final zyj c;
    public static final zyj d;
    public static final /* synthetic */ zyj[] e;

    static {
        zyj zyjVar = new zyj("None", 0);
        a = zyjVar;
        zyj zyjVar2 = new zyj("Disabled", 1);
        b = zyjVar2;
        zyj zyjVar3 = new zyj("Enabled", 2);
        c = zyjVar3;
        zyj zyjVar4 = new zyj("MoveTrack", 3);
        d = zyjVar4;
        e = new zyj[]{zyjVar, zyjVar2, zyjVar3, zyjVar4};
    }

    public static zyj valueOf(String str) {
        return (zyj) Enum.valueOf(zyj.class, str);
    }

    public static zyj[] values() {
        return (zyj[]) e.clone();
    }
}
