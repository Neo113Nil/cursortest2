package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yi6 {
    public static final yi6 a;
    public static final yi6 b;
    public static final /* synthetic */ yi6[] c;

    static {
        yi6 yi6Var = new yi6("Tracks", 0);
        a = yi6Var;
        yi6 yi6Var2 = new yi6("Time", 1);
        b = yi6Var2;
        c = new yi6[]{yi6Var, yi6Var2};
    }

    public static yi6 valueOf(String str) {
        return (yi6) Enum.valueOf(yi6.class, str);
    }

    public static yi6[] values() {
        return (yi6[]) c.clone();
    }
}
