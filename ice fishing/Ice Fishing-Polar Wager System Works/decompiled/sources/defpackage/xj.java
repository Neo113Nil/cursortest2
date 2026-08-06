package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xj {
    public static final defpackage.xj AARZUJiTa;
    public static final defpackage.xj EXtogiMhuM;
    public static final defpackage.xj adDC3e2L;
    public static final /* synthetic */ defpackage.xj[] riuEU0zW4;
    public static final defpackage.xj xiZrDbcSW0;

    static {
        defpackage.xj xjVar = new defpackage.xj("DEFAULT", 0);
        adDC3e2L = xjVar;
        defpackage.xj xjVar2 = new defpackage.xj("LAZY", 1);
        xiZrDbcSW0 = xjVar2;
        defpackage.xj xjVar3 = new defpackage.xj("ATOMIC", 2);
        AARZUJiTa = xjVar3;
        defpackage.xj xjVar4 = new defpackage.xj("UNDISPATCHED", 3);
        EXtogiMhuM = xjVar4;
        riuEU0zW4 = new defpackage.xj[]{xjVar, xjVar2, xjVar3, xjVar4};
    }

    public static defpackage.xj valueOf(java.lang.String str) {
        return (defpackage.xj) java.lang.Enum.valueOf(defpackage.xj.class, str);
    }

    public static defpackage.xj[] values() {
        return (defpackage.xj[]) riuEU0zW4.clone();
    }
}
