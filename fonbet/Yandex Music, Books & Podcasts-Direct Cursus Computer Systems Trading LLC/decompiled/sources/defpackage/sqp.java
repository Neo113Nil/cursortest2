package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class sqp implements brp {
    public static final sqp a;
    public static final sqp b;
    public static final sqp c;
    public static final /* synthetic */ sqp[] d;

    static {
        sqp sqpVar = new sqp("Disabled", 0);
        a = sqpVar;
        sqp sqpVar2 = new sqp("On", 1);
        b = sqpVar2;
        sqp sqpVar3 = new sqp("Off", 2);
        c = sqpVar3;
        d = new sqp[]{sqpVar, sqpVar2, sqpVar3};
    }

    public static sqp valueOf(String str) {
        return (sqp) Enum.valueOf(sqp.class, str);
    }

    public static sqp[] values() {
        return (sqp[]) d.clone();
    }
}
