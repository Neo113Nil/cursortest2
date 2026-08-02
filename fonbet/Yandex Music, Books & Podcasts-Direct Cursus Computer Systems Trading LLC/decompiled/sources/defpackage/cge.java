package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cge {
    public static final cge a;
    public static final cge b;
    public static final cge c;
    public static final cge d;
    public static final cge e;
    public static final cge f;
    public static final /* synthetic */ cge[] g;

    static {
        cge cgeVar = new cge("IDLE", 0);
        a = cgeVar;
        cge cgeVar2 = new cge("RESTORING", 1);
        b = cgeVar2;
        cge cgeVar3 = new cge("ERROR", 2);
        c = cgeVar3;
        cge cgeVar4 = new cge("SUCCESS", 3);
        d = cgeVar4;
        cge cgeVar5 = new cge("NOTHING_TO_RESTORE", 4);
        e = cgeVar5;
        cge cgeVar6 = new cge("RESTORE_NOT_AVAILABLE", 5);
        f = cgeVar6;
        g = new cge[]{cgeVar, cgeVar2, cgeVar3, cgeVar4, cgeVar5, cgeVar6};
    }

    public static cge valueOf(String str) {
        return (cge) Enum.valueOf(cge.class, str);
    }

    public static cge[] values() {
        return (cge[]) g.clone();
    }
}
