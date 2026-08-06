package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class up {
    public static final defpackage.up AARZUJiTa;
    public static final /* synthetic */ defpackage.up[] EXtogiMhuM;
    public static final defpackage.up adDC3e2L;
    public static final defpackage.up xiZrDbcSW0;

    static {
        defpackage.up upVar = new defpackage.up("Vertical", 0);
        adDC3e2L = upVar;
        defpackage.up upVar2 = new defpackage.up("Horizontal", 1);
        xiZrDbcSW0 = upVar2;
        defpackage.up upVar3 = new defpackage.up("Both", 2);
        AARZUJiTa = upVar3;
        EXtogiMhuM = new defpackage.up[]{upVar, upVar2, upVar3};
    }

    public static defpackage.up valueOf(java.lang.String str) {
        return (defpackage.up) java.lang.Enum.valueOf(defpackage.up.class, str);
    }

    public static defpackage.up[] values() {
        return (defpackage.up[]) EXtogiMhuM.clone();
    }
}
