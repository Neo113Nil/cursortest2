package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class s83 {
    public static final s83 b;
    public static final s83 c;
    public static final /* synthetic */ s83[] d;

    static {
        s83 s83Var = new s83("AD", 0);
        b = s83Var;
        s83 s83Var2 = new s83("PASSBACK", 1);
        c = s83Var2;
        d = new s83[]{s83Var, s83Var2};
    }

    public static s83 valueOf(String str) {
        return (s83) Enum.valueOf(s83.class, str);
    }

    public static s83[] values() {
        return (s83[]) d.clone();
    }
}
