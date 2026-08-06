package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sj {
    public static final defpackage.sj AARZUJiTa;
    public static final defpackage.sj EXtogiMhuM;
    public static final /* synthetic */ defpackage.sj[] SH1y5HwkJhh;
    public static final defpackage.sj adDC3e2L;
    public static final defpackage.sj riuEU0zW4;
    public static final defpackage.sj xiZrDbcSW0;

    static {
        defpackage.sj sjVar = new defpackage.sj("CPU_ACQUIRED", 0);
        adDC3e2L = sjVar;
        defpackage.sj sjVar2 = new defpackage.sj("BLOCKING", 1);
        xiZrDbcSW0 = sjVar2;
        defpackage.sj sjVar3 = new defpackage.sj("PARKING", 2);
        AARZUJiTa = sjVar3;
        defpackage.sj sjVar4 = new defpackage.sj("DORMANT", 3);
        EXtogiMhuM = sjVar4;
        defpackage.sj sjVar5 = new defpackage.sj("TERMINATED", 4);
        riuEU0zW4 = sjVar5;
        SH1y5HwkJhh = new defpackage.sj[]{sjVar, sjVar2, sjVar3, sjVar4, sjVar5};
    }

    public static defpackage.sj valueOf(java.lang.String str) {
        return (defpackage.sj) java.lang.Enum.valueOf(defpackage.sj.class, str);
    }

    public static defpackage.sj[] values() {
        return (defpackage.sj[]) SH1y5HwkJhh.clone();
    }
}
