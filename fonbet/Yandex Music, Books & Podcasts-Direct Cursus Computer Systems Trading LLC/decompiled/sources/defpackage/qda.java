package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qda {
    public static final qda a;
    public static final qda b;
    public static final /* synthetic */ qda[] c;

    static {
        qda qdaVar = new qda("DOWNLOADED_DATE", 0);
        a = qdaVar;
        qda qdaVar2 = new qda("ALPHABET", 1);
        b = qdaVar2;
        c = new qda[]{qdaVar, qdaVar2};
    }

    public static qda valueOf(String str) {
        return (qda) Enum.valueOf(qda.class, str);
    }

    public static qda[] values() {
        return (qda[]) c.clone();
    }
}
