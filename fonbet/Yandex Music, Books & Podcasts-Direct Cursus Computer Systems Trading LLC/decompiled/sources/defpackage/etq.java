package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class etq {
    public static final etq a;
    public static final etq b;
    public static final /* synthetic */ etq[] c;

    static {
        etq etqVar = new etq("SQUARE", 0);
        a = etqVar;
        etq etqVar2 = new etq("ROUND", 1);
        b = etqVar2;
        c = new etq[]{etqVar, etqVar2};
    }

    public static etq valueOf(String str) {
        return (etq) Enum.valueOf(etq.class, str);
    }

    public static etq[] values() {
        return (etq[]) c.clone();
    }
}
