package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ak0 {
    public static final defpackage.ak0 AARZUJiTa;
    public static final defpackage.ak0 EXtogiMhuM;
    public static final defpackage.ak0 adDC3e2L;
    public static final /* synthetic */ defpackage.ak0[] riuEU0zW4;
    public static final defpackage.ak0 xiZrDbcSW0;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.ak0 EF0;

    static {
        defpackage.ak0 ak0Var = new defpackage.ak0("DefaultSpatial", 0);
        defpackage.ak0 ak0Var2 = new defpackage.ak0("FastSpatial", 1);
        adDC3e2L = ak0Var2;
        defpackage.ak0 ak0Var3 = new defpackage.ak0("SlowSpatial", 2);
        defpackage.ak0 ak0Var4 = new defpackage.ak0("DefaultEffects", 3);
        xiZrDbcSW0 = ak0Var4;
        defpackage.ak0 ak0Var5 = new defpackage.ak0("FastEffects", 4);
        AARZUJiTa = ak0Var5;
        defpackage.ak0 ak0Var6 = new defpackage.ak0("SlowEffects", 5);
        EXtogiMhuM = ak0Var6;
        riuEU0zW4 = new defpackage.ak0[]{ak0Var, ak0Var2, ak0Var3, ak0Var4, ak0Var5, ak0Var6};
    }

    public static defpackage.ak0 valueOf(java.lang.String str) {
        return (defpackage.ak0) java.lang.Enum.valueOf(defpackage.ak0.class, str);
    }

    public static defpackage.ak0[] values() {
        return (defpackage.ak0[]) riuEU0zW4.clone();
    }
}
