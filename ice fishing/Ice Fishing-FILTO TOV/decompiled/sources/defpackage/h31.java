package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h31 {
    public static final /* synthetic */ h31[] EljAMC1QTz;
    public static final h31 OOA6hdeuvCS;

    static {
        h31 h31Var = new h31("Short", 0);
        OOA6hdeuvCS = h31Var;
        EljAMC1QTz = new h31[]{h31Var, new h31("Long", 1), new h31("Indefinite", 2)};
    }

    public static h31 valueOf(String str) {
        return (h31) Enum.valueOf(h31.class, str);
    }

    public static h31[] values() {
        return (h31[]) EljAMC1QTz.clone();
    }
}
