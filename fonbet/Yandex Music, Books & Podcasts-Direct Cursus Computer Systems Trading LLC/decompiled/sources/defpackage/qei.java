package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qei {
    public static final qei a;
    public static final qei b;
    public static final qei c;
    public static final qei d;
    public static final /* synthetic */ qei[] e;

    static {
        qei qeiVar = new qei("UNDEFINED", 0);
        a = qeiVar;
        qei qeiVar2 = new qei("SETUP", 1);
        b = qeiVar2;
        qei qeiVar3 = new qei("MOVING", 2);
        c = qeiVar3;
        qei qeiVar4 = new qei("FINISHED", 3);
        d = qeiVar4;
        e = new qei[]{qeiVar, qeiVar2, qeiVar3, qeiVar4};
    }

    public static qei valueOf(String str) {
        return (qei) Enum.valueOf(qei.class, str);
    }

    public static qei[] values() {
        return (qei[]) e.clone();
    }
}
