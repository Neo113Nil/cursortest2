package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zh1 {
    public static final /* synthetic */ defpackage.zh1[] AARZUJiTa;
    public static final defpackage.zh1 adDC3e2L;
    public static final defpackage.zh1 xiZrDbcSW0;

    static {
        defpackage.zh1 zh1Var = new defpackage.zh1("DEFERRED", 0);
        adDC3e2L = zh1Var;
        defpackage.zh1 zh1Var2 = new defpackage.zh1("IMMEDIATE", 1);
        xiZrDbcSW0 = zh1Var2;
        AARZUJiTa = new defpackage.zh1[]{zh1Var, zh1Var2, new defpackage.zh1("EXCLUSIVE", 2)};
    }

    public static defpackage.zh1 valueOf(java.lang.String str) {
        return (defpackage.zh1) java.lang.Enum.valueOf(defpackage.zh1.class, str);
    }

    public static defpackage.zh1[] values() {
        return (defpackage.zh1[]) AARZUJiTa.clone();
    }
}
