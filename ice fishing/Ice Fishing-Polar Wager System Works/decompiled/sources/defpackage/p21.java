package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p21 {
    public static final /* synthetic */ defpackage.p21[] AARZUJiTa;
    public static final defpackage.p21 adDC3e2L;
    public static final defpackage.p21 xiZrDbcSW0;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.p21 EF0;

    static {
        defpackage.p21 p21Var = new defpackage.p21("AUTOMATIC", 0);
        defpackage.p21 p21Var2 = new defpackage.p21("TRUNCATE", 1);
        adDC3e2L = p21Var2;
        defpackage.p21 p21Var3 = new defpackage.p21("WRITE_AHEAD_LOGGING", 2);
        xiZrDbcSW0 = p21Var3;
        AARZUJiTa = new defpackage.p21[]{p21Var, p21Var2, p21Var3};
    }

    public static defpackage.p21 valueOf(java.lang.String str) {
        return (defpackage.p21) java.lang.Enum.valueOf(defpackage.p21.class, str);
    }

    public static defpackage.p21[] values() {
        return (defpackage.p21[]) AARZUJiTa.clone();
    }
}
