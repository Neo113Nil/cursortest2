package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zo3 {
    public static final zo3 a;
    public static final /* synthetic */ zo3[] b;

    static {
        zo3 zo3Var = new zo3("INSTANCE", 0);
        a = zo3Var;
        b = new zo3[]{zo3Var};
    }

    public static zo3 valueOf(String str) {
        return (zo3) Enum.valueOf(zo3.class, str);
    }

    public static zo3[] values() {
        return (zo3[]) b.clone();
    }
}
