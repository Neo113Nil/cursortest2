package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tw {
    public static final tw AvO7iQsrTN;
    public static final tw EljAMC1QTz;
    public static final tw OOA6hdeuvCS;
    public static final /* synthetic */ tw[] encWxUiV2;

    static {
        tw twVar = new tw("LOADING", 0);
        OOA6hdeuvCS = twVar;
        tw twVar2 = new tw("PLAYING", 1);
        EljAMC1QTz = twVar2;
        tw twVar3 = new tw("SOLVED", 2);
        AvO7iQsrTN = twVar3;
        encWxUiV2 = new tw[]{twVar, twVar2, twVar3};
    }

    public static tw valueOf(String str) {
        return (tw) Enum.valueOf(tw.class, str);
    }

    public static tw[] values() {
        return (tw[]) encWxUiV2.clone();
    }
}
