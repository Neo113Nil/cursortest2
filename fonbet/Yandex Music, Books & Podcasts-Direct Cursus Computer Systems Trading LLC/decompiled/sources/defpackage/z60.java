package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z60 {
    public static final z60 a;
    public static final /* synthetic */ z60[] b;

    static {
        kmb kmbVar = kmb.Tap;
        z60 z60Var = new z60("Tap", 0);
        a = z60Var;
        b = new z60[]{z60Var};
    }

    public static z60 valueOf(String str) {
        return (z60) Enum.valueOf(z60.class, str);
    }

    public static z60[] values() {
        return (z60[]) b.clone();
    }
}
