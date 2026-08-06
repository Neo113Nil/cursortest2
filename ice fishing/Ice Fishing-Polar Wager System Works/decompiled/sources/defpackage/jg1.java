package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jg1 {
    public static final /* synthetic */ defpackage.jg1[] AARZUJiTa;
    public static final /* synthetic */ defpackage.gu EXtogiMhuM;
    public static final defpackage.jg1 xiZrDbcSW0;
    public final java.lang.String adDC3e2L;

    static {
        defpackage.jg1 jg1Var = new defpackage.jg1(0, "SYSTEM", "System");
        xiZrDbcSW0 = jg1Var;
        defpackage.jg1[] jg1VarArr = {jg1Var, new defpackage.jg1(1, "LIGHT", "Parchment"), new defpackage.jg1(2, "DARK", "Night Watch")};
        AARZUJiTa = jg1VarArr;
        EXtogiMhuM = new defpackage.gu(jg1VarArr);
    }

    public jg1(int i, java.lang.String str, java.lang.String str2) {
        this.adDC3e2L = str2;
    }

    public static defpackage.jg1 valueOf(java.lang.String str) {
        return (defpackage.jg1) java.lang.Enum.valueOf(defpackage.jg1.class, str);
    }

    public static defpackage.jg1[] values() {
        return (defpackage.jg1[]) AARZUJiTa.clone();
    }
}
