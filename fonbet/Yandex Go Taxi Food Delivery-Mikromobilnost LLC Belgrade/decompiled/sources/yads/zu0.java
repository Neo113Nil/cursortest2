package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class zu0 {
    public static final zu0 b;
    public static final zu0 c;
    public static final zu0 d;
    public static final zu0 e;
    public static final /* synthetic */ zu0[] f;

    static {
        zu0 zu0Var = new zu0("YS_BOLD", 0);
        b = zu0Var;
        zu0 zu0Var2 = new zu0("YS_LIGHT", 1);
        c = zu0Var2;
        zu0 zu0Var3 = new zu0("YS_MEDIUM", 2);
        d = zu0Var3;
        zu0 zu0Var4 = new zu0("YS_REGULAR", 3);
        e = zu0Var4;
        f = new zu0[]{zu0Var, zu0Var2, zu0Var3, zu0Var4};
    }

    public static zu0 valueOf(String str) {
        return (zu0) Enum.valueOf(zu0.class, str);
    }

    public static zu0[] values() {
        return (zu0[]) f.clone();
    }
}
