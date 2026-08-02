package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class bb6 {
    public static final bb6 a;
    public static final bb6 b;
    public static final bb6 c;
    public static final /* synthetic */ bb6[] d;

    static {
        bb6 bb6Var = new bb6("RAW", 0);
        a = bb6Var;
        bb6 bb6Var2 = new bb6("HLS", 1);
        b = bb6Var2;
        bb6 bb6Var3 = new bb6("ENC", 2);
        c = bb6Var3;
        d = new bb6[]{bb6Var, bb6Var2, bb6Var3};
    }

    public static bb6 valueOf(String str) {
        return (bb6) Enum.valueOf(bb6.class, str);
    }

    public static bb6[] values() {
        return (bb6[]) d.clone();
    }
}
