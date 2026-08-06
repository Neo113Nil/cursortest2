package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s {
    public static final /* synthetic */ s[] AvO7iQsrTN;
    public static final s EljAMC1QTz;
    public static final s OOA6hdeuvCS;

    static {
        s sVar = new s("SHOW_ORIGINAL", 0);
        OOA6hdeuvCS = sVar;
        s sVar2 = new s("SHOW_TRANSLATED", 1);
        EljAMC1QTz = sVar2;
        AvO7iQsrTN = new s[]{sVar, sVar2};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) AvO7iQsrTN.clone();
    }
}
