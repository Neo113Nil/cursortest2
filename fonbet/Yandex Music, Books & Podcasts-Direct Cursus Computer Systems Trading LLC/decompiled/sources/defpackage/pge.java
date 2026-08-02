package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class pge {
    public static final pge a;
    public static final pge b;
    public static final pge c;
    public static final pge d;
    public static final pge e;
    public static final /* synthetic */ pge[] f;

    static {
        pge pgeVar = new pge("UNDEFINED", 0);
        a = pgeVar;
        pge pgeVar2 = new pge("AVAILABLE", 1);
        b = pgeVar2;
        pge pgeVar3 = new pge("IN_PROGRESS", 2);
        c = pgeVar3;
        pge pgeVar4 = new pge("DOWNLOADED", 3);
        d = pgeVar4;
        pge pgeVar5 = new pge("ERROR", 4);
        e = pgeVar5;
        f = new pge[]{pgeVar, pgeVar2, pgeVar3, pgeVar4, pgeVar5};
    }

    public static pge valueOf(String str) {
        return (pge) Enum.valueOf(pge.class, str);
    }

    public static pge[] values() {
        return (pge[]) f.clone();
    }
}
