package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qov {
    public static final qov a;
    public static final qov b;
    public static final qov c;
    public static final /* synthetic */ qov[] d;

    static {
        qov qovVar = new qov("Square", 0);
        a = qovVar;
        qov qovVar2 = new qov("Player", 1);
        b = qovVar2;
        qov qovVar3 = new qov("PlayerWithRecently", 2);
        c = qovVar3;
        d = new qov[]{qovVar, qovVar2, qovVar3};
    }

    public static qov valueOf(String str) {
        return (qov) Enum.valueOf(qov.class, str);
    }

    public static qov[] values() {
        return (qov[]) d.clone();
    }
}
