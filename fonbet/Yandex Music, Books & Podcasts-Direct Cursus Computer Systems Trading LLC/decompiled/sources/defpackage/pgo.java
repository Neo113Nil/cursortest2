package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class pgo {
    public static final pgo a;
    public static final pgo b;
    public static final pgo c;
    public static final pgo d;
    public static final /* synthetic */ pgo[] e;

    static {
        pgo pgoVar = new pgo("ALL", 0);
        a = pgoVar;
        pgo pgoVar2 = new pgo("TOP", 1);
        b = pgoVar2;
        pgo pgoVar3 = new pgo("NONE", 2);
        c = pgoVar3;
        pgo pgoVar4 = new pgo("BOTTOM", 3);
        d = pgoVar4;
        e = new pgo[]{pgoVar, pgoVar2, pgoVar3, pgoVar4};
    }

    public static pgo valueOf(String str) {
        return (pgo) Enum.valueOf(pgo.class, str);
    }

    public static pgo[] values() {
        return (pgo[]) e.clone();
    }
}
