package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vj {
    public static final defpackage.vj AARZUJiTa;
    public static final /* synthetic */ defpackage.vj[] EXtogiMhuM;
    public static final defpackage.vj adDC3e2L;
    public static final defpackage.vj xiZrDbcSW0;

    static {
        defpackage.vj vjVar = new defpackage.vj("COROUTINE_SUSPENDED", 0);
        adDC3e2L = vjVar;
        defpackage.vj vjVar2 = new defpackage.vj("UNDECIDED", 1);
        xiZrDbcSW0 = vjVar2;
        defpackage.vj vjVar3 = new defpackage.vj("RESUMED", 2);
        AARZUJiTa = vjVar3;
        EXtogiMhuM = new defpackage.vj[]{vjVar, vjVar2, vjVar3};
    }

    public static defpackage.vj valueOf(java.lang.String str) {
        return (defpackage.vj) java.lang.Enum.valueOf(defpackage.vj.class, str);
    }

    public static defpackage.vj[] values() {
        return (defpackage.vj[]) EXtogiMhuM.clone();
    }
}
