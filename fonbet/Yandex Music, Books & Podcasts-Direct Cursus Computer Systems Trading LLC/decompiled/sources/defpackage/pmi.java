package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pmi {
    public static final pmi a;
    public static final pmi b;
    public static final /* synthetic */ pmi[] c;

    static {
        pmi pmiVar = new pmi("Search", 0);
        a = pmiVar;
        pmi pmiVar2 = new pmi("Other", 1);
        b = pmiVar2;
        c = new pmi[]{pmiVar, pmiVar2};
    }

    public static pmi valueOf(String str) {
        return (pmi) Enum.valueOf(pmi.class, str);
    }

    public static pmi[] values() {
        return (pmi[]) c.clone();
    }
}
