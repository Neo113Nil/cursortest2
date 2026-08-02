package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class nm6 {
    public static final nm6 a;
    public static final nm6 b;
    public static final nm6 c;
    public static final /* synthetic */ nm6[] d;

    static {
        nm6 nm6Var = new nm6("COROUTINE_SUSPENDED", 0);
        a = nm6Var;
        nm6 nm6Var2 = new nm6("UNDECIDED", 1);
        b = nm6Var2;
        nm6 nm6Var3 = new nm6("RESUMED", 2);
        c = nm6Var3;
        d = new nm6[]{nm6Var, nm6Var2, nm6Var3};
    }

    public static nm6 valueOf(String str) {
        return (nm6) Enum.valueOf(nm6.class, str);
    }

    public static nm6[] values() {
        return (nm6[]) d.clone();
    }
}
