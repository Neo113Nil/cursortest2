package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vev {
    public static final vev a;
    public static final /* synthetic */ vev[] b;

    static {
        vev vevVar = new vev("FINISH", 0);
        a = vevVar;
        b = new vev[]{vevVar};
    }

    public static vev valueOf(String str) {
        return (vev) Enum.valueOf(vev.class, str);
    }

    public static vev[] values() {
        return (vev[]) b.clone();
    }
}
