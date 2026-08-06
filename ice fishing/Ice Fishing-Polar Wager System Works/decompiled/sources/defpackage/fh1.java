package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fh1 {
    public static final /* synthetic */ defpackage.fh1[] AARZUJiTa;
    public static final defpackage.fh1 adDC3e2L;
    public static final defpackage.fh1 xiZrDbcSW0;

    static {
        defpackage.fh1 fh1Var = new defpackage.fh1("On", 0);
        adDC3e2L = fh1Var;
        defpackage.fh1 fh1Var2 = new defpackage.fh1("Off", 1);
        xiZrDbcSW0 = fh1Var2;
        AARZUJiTa = new defpackage.fh1[]{fh1Var, fh1Var2, new defpackage.fh1("Indeterminate", 2)};
    }

    public static defpackage.fh1 valueOf(java.lang.String str) {
        return (defpackage.fh1) java.lang.Enum.valueOf(defpackage.fh1.class, str);
    }

    public static defpackage.fh1[] values() {
        return (defpackage.fh1[]) AARZUJiTa.clone();
    }
}
