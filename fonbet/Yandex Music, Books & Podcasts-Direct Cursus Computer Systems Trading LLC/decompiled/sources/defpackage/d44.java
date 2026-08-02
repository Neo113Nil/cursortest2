package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d44 {
    public static final d44 a;
    public static final d44 b;
    public static final d44 c;
    public static final /* synthetic */ d44[] d;

    static {
        d44 d44Var = new d44("Left", 0);
        a = d44Var;
        d44 d44Var2 = new d44("Center", 1);
        b = d44Var2;
        d44 d44Var3 = new d44("Right", 2);
        c = d44Var3;
        d = new d44[]{d44Var, d44Var2, d44Var3};
    }

    public static d44 valueOf(String str) {
        return (d44) Enum.valueOf(d44.class, str);
    }

    public static d44[] values() {
        return (d44[]) d.clone();
    }
}
