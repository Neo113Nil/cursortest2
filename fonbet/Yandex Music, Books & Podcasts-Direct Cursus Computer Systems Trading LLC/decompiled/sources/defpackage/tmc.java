package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tmc {
    public static final tmc a;
    public static final /* synthetic */ tmc[] b;

    /* JADX INFO: Fake field, exist only in values array */
    tmc EF0;

    static {
        tmc tmcVar = new tmc("Visible", 0);
        tmc tmcVar2 = new tmc("Clip", 1);
        a = tmcVar2;
        b = new tmc[]{tmcVar, tmcVar2, new tmc("ExpandIndicator", 2), new tmc("ExpandOrCollapseIndicator", 3)};
    }

    public static tmc valueOf(String str) {
        return (tmc) Enum.valueOf(tmc.class, str);
    }

    public static tmc[] values() {
        return (tmc[]) b.clone();
    }
}
