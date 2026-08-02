package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class um0 {
    public static final um0 a;
    public static final um0 b;
    public static final /* synthetic */ um0[] c;

    static {
        um0 um0Var = new um0("AFTER_ANIMATE", 0);
        a = um0Var;
        um0 um0Var2 = new um0("ANIMATE", 1);
        b = um0Var2;
        c = new um0[]{um0Var, um0Var2, new um0("BEFORE_ANIMATE", 2)};
    }

    public static um0 valueOf(String str) {
        return (um0) Enum.valueOf(um0.class, str);
    }

    public static um0[] values() {
        return (um0[]) c.clone();
    }
}
