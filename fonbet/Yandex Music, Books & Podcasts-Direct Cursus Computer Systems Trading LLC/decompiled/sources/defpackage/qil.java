package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qil {
    public static final qil a;
    public static final qil b;
    public static final /* synthetic */ qil[] c;

    static {
        qil qilVar = new qil("Title", 0);
        a = qilVar;
        qil qilVar2 = new qil("Artists", 1);
        b = qilVar2;
        c = new qil[]{qilVar, qilVar2};
    }

    public static qil valueOf(String str) {
        return (qil) Enum.valueOf(qil.class, str);
    }

    public static qil[] values() {
        return (qil[]) c.clone();
    }
}
