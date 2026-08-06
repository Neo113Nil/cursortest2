package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hn {
    public static final hn AvO7iQsrTN;
    public static final hn EljAMC1QTz;
    public static final hn OOA6hdeuvCS;
    public static final /* synthetic */ hn[] encWxUiV2;

    static {
        hn hnVar = new hn("Yes", 0);
        OOA6hdeuvCS = hnVar;
        hn hnVar2 = new hn("No", 1);
        EljAMC1QTz = hnVar2;
        hn hnVar3 = new hn("NotInitialized", 2);
        AvO7iQsrTN = hnVar3;
        encWxUiV2 = new hn[]{hnVar, hnVar2, hnVar3};
    }

    public static hn valueOf(String str) {
        return (hn) Enum.valueOf(hn.class, str);
    }

    public static hn[] values() {
        return (hn[]) encWxUiV2.clone();
    }
}
