package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bm0 {
    public static final defpackage.bm0 adDC3e2L;
    public static final /* synthetic */ defpackage.bm0[] xiZrDbcSW0;

    static {
        defpackage.bm0 bm0Var = new defpackage.bm0("Default", 0);
        adDC3e2L = bm0Var;
        xiZrDbcSW0 = new defpackage.bm0[]{bm0Var, new defpackage.bm0("UserInput", 1), new defpackage.bm0("PreventUserInput", 2)};
    }

    public static defpackage.bm0 valueOf(java.lang.String str) {
        return (defpackage.bm0) java.lang.Enum.valueOf(defpackage.bm0.class, str);
    }

    public static defpackage.bm0[] values() {
        return (defpackage.bm0[]) xiZrDbcSW0.clone();
    }
}
