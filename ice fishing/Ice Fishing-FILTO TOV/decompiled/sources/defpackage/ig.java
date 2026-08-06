package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ig {
    public static final /* synthetic */ ig[] AvO7iQsrTN;
    public static final ig EljAMC1QTz;
    public static final ig OOA6hdeuvCS;

    static {
        ig igVar = new ig("VIEW_APPEAR", 0);
        OOA6hdeuvCS = igVar;
        ig igVar2 = new ig("VIEW_DISAPPEAR", 1);
        EljAMC1QTz = igVar2;
        AvO7iQsrTN = new ig[]{igVar, igVar2};
    }

    public static ig valueOf(String str) {
        return (ig) Enum.valueOf(ig.class, str);
    }

    public static ig[] values() {
        return (ig[]) AvO7iQsrTN.clone();
    }
}
