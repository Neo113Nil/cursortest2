package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qmc {
    public static final qmc a;
    public static final /* synthetic */ qmc[] b;

    static {
        qmc qmcVar = new qmc("Visible", 0);
        a = qmcVar;
        b = new qmc[]{qmcVar, new qmc("Clip", 1), new qmc("ExpandIndicator", 2), new qmc("ExpandOrCollapseIndicator", 3)};
    }

    public static qmc valueOf(String str) {
        return (qmc) Enum.valueOf(qmc.class, str);
    }

    public static qmc[] values() {
        return (qmc[]) b.clone();
    }
}
