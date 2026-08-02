package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cpe {
    public static final cpe a;
    public static final cpe b;
    public static final cpe c;
    public static final cpe d;
    public static final cpe e;
    public static final cpe f;
    public static final /* synthetic */ cpe[] g;

    static {
        cpe cpeVar = new cpe("Unknown", 0);
        a = cpeVar;
        cpe cpeVar2 = new cpe("Analysis", 1);
        b = cpeVar2;
        cpe cpeVar3 = new cpe("AnrReport", 2);
        c = cpeVar3;
        cpe cpeVar4 = new cpe("CrashReport", 3);
        d = cpeVar4;
        cpe cpeVar5 = new cpe("CrashShield", 4);
        e = cpeVar5;
        cpe cpeVar6 = new cpe("ThreadCheck", 5);
        f = cpeVar6;
        g = new cpe[]{cpeVar, cpeVar2, cpeVar3, cpeVar4, cpeVar5, cpeVar6};
    }

    public static cpe valueOf(String str) {
        return (cpe) Enum.valueOf(cpe.class, str);
    }

    public static cpe[] values() {
        return (cpe[]) g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
    }
}
