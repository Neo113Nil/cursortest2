package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e70 {
    public static final e70 a;
    public static final e70 b;
    public static final /* synthetic */ e70[] c;

    static {
        e70 e70Var = new e70("Artist", 0);
        a = e70Var;
        e70 e70Var2 = new e70("Station", 1);
        b = e70Var2;
        c = new e70[]{e70Var, e70Var2};
    }

    public static e70 valueOf(String str) {
        return (e70) Enum.valueOf(e70.class, str);
    }

    public static e70[] values() {
        return (e70[]) c.clone();
    }
}
