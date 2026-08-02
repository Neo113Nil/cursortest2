package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hp4 {
    public static final hp4 a;
    public static final hp4 b;
    public static final hp4 c;
    public static final /* synthetic */ hp4[] d;

    static {
        hp4 hp4Var = new hp4("NotPlaying", 0);
        a = hp4Var;
        hp4 hp4Var2 = new hp4("Playing", 1);
        b = hp4Var2;
        hp4 hp4Var3 = new hp4("Paused", 2);
        c = hp4Var3;
        d = new hp4[]{hp4Var, hp4Var2, hp4Var3};
    }

    public static hp4 valueOf(String str) {
        return (hp4) Enum.valueOf(hp4.class, str);
    }

    public static hp4[] values() {
        return (hp4[]) d.clone();
    }
}
