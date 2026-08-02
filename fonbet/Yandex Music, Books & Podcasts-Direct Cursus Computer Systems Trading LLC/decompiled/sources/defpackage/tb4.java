package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tb4 {
    public static final tb4 a;
    public static final tb4 b;
    public static final tb4 c;
    public static final /* synthetic */ tb4[] d;

    static {
        tb4 tb4Var = new tb4("TakePhoto", 0);
        a = tb4Var;
        tb4 tb4Var2 = new tb4("ChoosePhoto", 1);
        b = tb4Var2;
        tb4 tb4Var3 = new tb4("DeleteCover", 2);
        c = tb4Var3;
        d = new tb4[]{tb4Var, tb4Var2, tb4Var3};
    }

    public static tb4 valueOf(String str) {
        return (tb4) Enum.valueOf(tb4.class, str);
    }

    public static tb4[] values() {
        return (tb4[]) d.clone();
    }
}
