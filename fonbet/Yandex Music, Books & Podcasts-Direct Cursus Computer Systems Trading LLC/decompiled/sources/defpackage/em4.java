package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class em4 {
    public static final em4 a;
    public static final em4 b;
    public static final /* synthetic */ em4[] c;

    static {
        em4 em4Var = new em4("NONE", 0);
        a = em4Var;
        em4 em4Var2 = new em4("ALL_JSON_OBJECTS", 1);
        em4 em4Var3 = new em4("POLYMORPHIC", 2);
        b = em4Var3;
        c = new em4[]{em4Var, em4Var2, em4Var3};
    }

    public static em4 valueOf(String str) {
        return (em4) Enum.valueOf(em4.class, str);
    }

    public static em4[] values() {
        return (em4[]) c.clone();
    }
}
