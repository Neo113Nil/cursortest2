package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i10 {
    public static final i10 a;
    public static final i10 b;
    public static final i10 c;
    public static final i10 d;
    public static final /* synthetic */ i10[] e;

    static {
        i10 i10Var = new i10("RELEASE_DATE", 0);
        a = i10Var;
        i10 i10Var2 = new i10("ARTISTS", 1);
        b = i10Var2;
        i10 i10Var3 = new i10("ALPHABET", 2);
        c = i10Var3;
        i10 i10Var4 = new i10("DATE", 3);
        d = i10Var4;
        e = new i10[]{i10Var, i10Var2, i10Var3, i10Var4};
    }

    public static i10 valueOf(String str) {
        return (i10) Enum.valueOf(i10.class, str);
    }

    public static i10[] values() {
        return (i10[]) e.clone();
    }
}
