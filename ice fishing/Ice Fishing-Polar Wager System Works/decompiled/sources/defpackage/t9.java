package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t9 {
    public static final defpackage.t9 AARZUJiTa;
    public static final /* synthetic */ defpackage.t9[] EXtogiMhuM;
    public static final defpackage.t9 adDC3e2L;
    public static final defpackage.t9 xiZrDbcSW0;

    static {
        defpackage.t9 t9Var = new defpackage.t9("SUSPEND", 0);
        adDC3e2L = t9Var;
        defpackage.t9 t9Var2 = new defpackage.t9("DROP_OLDEST", 1);
        xiZrDbcSW0 = t9Var2;
        defpackage.t9 t9Var3 = new defpackage.t9("DROP_LATEST", 2);
        AARZUJiTa = t9Var3;
        EXtogiMhuM = new defpackage.t9[]{t9Var, t9Var2, t9Var3};
    }

    public static defpackage.t9 valueOf(java.lang.String str) {
        return (defpackage.t9) java.lang.Enum.valueOf(defpackage.t9.class, str);
    }

    public static defpackage.t9[] values() {
        return (defpackage.t9[]) EXtogiMhuM.clone();
    }
}
