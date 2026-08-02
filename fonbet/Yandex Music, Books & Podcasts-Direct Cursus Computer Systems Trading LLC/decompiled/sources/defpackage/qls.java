package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qls {
    public static final qls a;
    public static final qls b;
    public static final qls c;
    public static final /* synthetic */ qls[] d;

    static {
        qls qlsVar = new qls("LAUNCHED", 0);
        a = qlsVar;
        qls qlsVar2 = new qls("RESUMED", 1);
        b = qlsVar2;
        qls qlsVar3 = new qls("PAUSED", 2);
        c = qlsVar3;
        d = new qls[]{qlsVar, qlsVar2, qlsVar3};
    }

    public static qls valueOf(String str) {
        return (qls) Enum.valueOf(qls.class, str);
    }

    public static qls[] values() {
        return (qls[]) d.clone();
    }
}
