package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qfm {
    public static final qfm a;
    public static final qfm b;
    public static final qfm c;
    public static final /* synthetic */ qfm[] d;

    static {
        qfm qfmVar = new qfm("Unknown", 0);
        a = qfmVar;
        qfm qfmVar2 = new qfm("Dispatching", 1);
        b = qfmVar2;
        qfm qfmVar3 = new qfm("NotDispatching", 2);
        c = qfmVar3;
        d = new qfm[]{qfmVar, qfmVar2, qfmVar3};
    }

    public static qfm valueOf(String str) {
        return (qfm) Enum.valueOf(qfm.class, str);
    }

    public static qfm[] values() {
        return (qfm[]) d.clone();
    }
}
