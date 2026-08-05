package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gr {
    public static final /* synthetic */ gr[] MdtA4re8;
    public static final gr NCTxEWno;

    /* JADX INFO: Fake field, exist only in values array */
    gr EF0;

    static {
        gr grVar = new gr("NONE", 0);
        gr grVar2 = new gr("START", 1);
        gr grVar3 = new gr("END", 2);
        gr grVar4 = new gr("BOTH", 3);
        NCTxEWno = grVar4;
        MdtA4re8 = new gr[]{grVar, grVar2, grVar3, grVar4};
    }

    public static gr valueOf(String str) {
        return (gr) Enum.valueOf(gr.class, str);
    }

    public static gr[] values() {
        return (gr[]) MdtA4re8.clone();
    }
}
