package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u54 {
    public static final u54 a;
    public static final /* synthetic */ u54[] b;

    static {
        lkb[] lkbVarArr = lkb.a;
        u54 u54Var = new u54("LINK", 0);
        a = u54Var;
        b = new u54[]{u54Var};
    }

    public static u54 valueOf(String str) {
        return (u54) Enum.valueOf(u54.class, str);
    }

    public static u54[] values() {
        return (u54[]) b.clone();
    }
}
