package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p76 {
    public static final p76 a;
    public static final p76 b;
    public static final /* synthetic */ p76[] c;

    static {
        p76 p76Var = new p76("CONNECTED", 0);
        a = p76Var;
        p76 p76Var2 = new p76("DISCONNECTED", 1);
        b = p76Var2;
        c = new p76[]{p76Var, p76Var2};
    }

    public static p76 valueOf(String str) {
        return (p76) Enum.valueOf(p76.class, str);
    }

    public static p76[] values() {
        return (p76[]) c.clone();
    }
}
