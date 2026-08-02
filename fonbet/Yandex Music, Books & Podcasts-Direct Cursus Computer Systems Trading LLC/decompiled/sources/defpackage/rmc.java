package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rmc {
    public static final rmc a;
    public static final /* synthetic */ rmc[] b;

    static {
        rmc rmcVar = new rmc("Visible", 0);
        a = rmcVar;
        b = new rmc[]{rmcVar, new rmc("Clip", 1), new rmc("ExpandIndicator", 2), new rmc("ExpandOrCollapseIndicator", 3)};
    }

    public static rmc valueOf(String str) {
        return (rmc) Enum.valueOf(rmc.class, str);
    }

    public static rmc[] values() {
        return (rmc[]) b.clone();
    }
}
