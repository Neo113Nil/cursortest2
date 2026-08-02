package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nxj {
    public static final nxj a;
    public static final nxj b;
    public static final /* synthetic */ nxj[] c;

    static {
        nxj nxjVar = new nxj("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = nxjVar;
        nxj nxjVar2 = new nxj("DROP_WORK_REQUEST", 1);
        b = nxjVar2;
        c = new nxj[]{nxjVar, nxjVar2};
    }

    public static nxj valueOf(String str) {
        return (nxj) Enum.valueOf(nxj.class, str);
    }

    public static nxj[] values() {
        return (nxj[]) c.clone();
    }
}
