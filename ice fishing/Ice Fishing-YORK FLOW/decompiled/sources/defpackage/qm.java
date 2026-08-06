package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qm {
    public static final /* synthetic */ defpackage.qm[] GE9mJIPrb8gP;
    public static final defpackage.qm P05cfTpS5W5L;
    public static final defpackage.qm QiMR8OkAhezm;
    public static final defpackage.qm WDYagTQQm9ns;
    public static final defpackage.qm e6mdH7fiFuta;
    public static final defpackage.qm oh71FJcDz6S2;

    static {
        defpackage.qm qmVar = new defpackage.qm("CPU_ACQUIRED", 0);
        WDYagTQQm9ns = qmVar;
        defpackage.qm qmVar2 = new defpackage.qm("BLOCKING", 1);
        oh71FJcDz6S2 = qmVar2;
        defpackage.qm qmVar3 = new defpackage.qm("PARKING", 2);
        QiMR8OkAhezm = qmVar3;
        defpackage.qm qmVar4 = new defpackage.qm("DORMANT", 3);
        P05cfTpS5W5L = qmVar4;
        defpackage.qm qmVar5 = new defpackage.qm("TERMINATED", 4);
        e6mdH7fiFuta = qmVar5;
        GE9mJIPrb8gP = new defpackage.qm[]{qmVar, qmVar2, qmVar3, qmVar4, qmVar5};
    }

    public static defpackage.qm valueOf(java.lang.String str) {
        return (defpackage.qm) java.lang.Enum.valueOf(defpackage.qm.class, str);
    }

    public static defpackage.qm[] values() {
        return (defpackage.qm[]) GE9mJIPrb8gP.clone();
    }
}
