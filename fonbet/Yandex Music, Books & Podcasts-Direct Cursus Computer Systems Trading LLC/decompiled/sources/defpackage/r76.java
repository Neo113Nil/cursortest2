package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r76 {
    public static final r76 a;
    public static final r76 b;
    public static final r76 c;
    public static final r76 d;
    public static final r76 e;
    public static final /* synthetic */ r76[] f;

    static {
        r76 r76Var = new r76("CONNECTING", 0);
        a = r76Var;
        r76 r76Var2 = new r76("READY", 1);
        b = r76Var2;
        r76 r76Var3 = new r76("TRANSIENT_FAILURE", 2);
        c = r76Var3;
        r76 r76Var4 = new r76("IDLE", 3);
        d = r76Var4;
        r76 r76Var5 = new r76("SHUTDOWN", 4);
        e = r76Var5;
        f = new r76[]{r76Var, r76Var2, r76Var3, r76Var4, r76Var5};
    }

    public static r76 valueOf(String str) {
        return (r76) Enum.valueOf(r76.class, str);
    }

    public static r76[] values() {
        return (r76[]) f.clone();
    }
}
