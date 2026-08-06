package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ai {
    public static final ai AvO7iQsrTN;
    public static final ai EljAMC1QTz;
    public static final ai OOA6hdeuvCS;
    public static final /* synthetic */ ai[] encWxUiV2;

    static {
        ai aiVar = new ai("None", 0);
        OOA6hdeuvCS = aiVar;
        ai aiVar2 = new ai("Cancelled", 1);
        EljAMC1QTz = aiVar2;
        ai aiVar3 = new ai("Redirected", 2);
        AvO7iQsrTN = aiVar3;
        encWxUiV2 = new ai[]{aiVar, aiVar2, aiVar3, new ai("RedirectCancelled", 3)};
    }

    public static ai valueOf(String str) {
        return (ai) Enum.valueOf(ai.class, str);
    }

    public static ai[] values() {
        return (ai[]) encWxUiV2.clone();
    }
}
