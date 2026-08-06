package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gz {
    public static final gz AvO7iQsrTN;
    public static final gz EljAMC1QTz;
    public static final gz OOA6hdeuvCS;
    public static final /* synthetic */ gz[] encWxUiV2;

    static {
        gz gzVar = new gz("TAP", 0);
        OOA6hdeuvCS = gzVar;
        gz gzVar2 = new gz("SCAN", 1);
        EljAMC1QTz = gzVar2;
        gz gzVar3 = new gz("WIN", 2);
        AvO7iQsrTN = gzVar3;
        encWxUiV2 = new gz[]{gzVar, gzVar2, gzVar3};
    }

    public static gz valueOf(String str) {
        return (gz) Enum.valueOf(gz.class, str);
    }

    public static gz[] values() {
        return (gz[]) encWxUiV2.clone();
    }
}
