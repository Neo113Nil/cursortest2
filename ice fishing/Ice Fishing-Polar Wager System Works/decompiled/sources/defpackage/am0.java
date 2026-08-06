package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class am0 {
    public static final /* synthetic */ defpackage.am0[] AARZUJiTa;
    public static final defpackage.am0 adDC3e2L;
    public static final defpackage.am0 xiZrDbcSW0;

    static {
        defpackage.am0 am0Var = new defpackage.am0("Default", 0);
        adDC3e2L = am0Var;
        defpackage.am0 am0Var2 = new defpackage.am0("UserInput", 1);
        xiZrDbcSW0 = am0Var2;
        AARZUJiTa = new defpackage.am0[]{am0Var, am0Var2, new defpackage.am0("PreventUserInput", 2)};
    }

    public static defpackage.am0 valueOf(java.lang.String str) {
        return (defpackage.am0) java.lang.Enum.valueOf(defpackage.am0.class, str);
    }

    public static defpackage.am0[] values() {
        return (defpackage.am0[]) AARZUJiTa.clone();
    }
}
