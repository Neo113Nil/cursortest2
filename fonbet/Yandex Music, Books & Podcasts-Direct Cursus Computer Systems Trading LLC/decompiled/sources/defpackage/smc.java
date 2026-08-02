package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class smc {
    public static final smc a;
    public static final /* synthetic */ smc[] b;

    static {
        smc smcVar = new smc("Visible", 0);
        a = smcVar;
        b = new smc[]{smcVar, new smc("Clip", 1), new smc("ExpandIndicator", 2), new smc("ExpandOrCollapseIndicator", 3)};
    }

    public static smc valueOf(String str) {
        return (smc) Enum.valueOf(smc.class, str);
    }

    public static smc[] values() {
        return (smc[]) b.clone();
    }
}
