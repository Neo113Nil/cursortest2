package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gdq {
    public static final gdq a;
    public static final gdq b;
    public static final gdq c;
    public static final /* synthetic */ gdq[] d;

    static {
        gdq gdqVar = new gdq("Hidden", 0);
        a = gdqVar;
        gdq gdqVar2 = new gdq("Expanded", 1);
        b = gdqVar2;
        gdq gdqVar3 = new gdq("PartiallyExpanded", 2);
        c = gdqVar3;
        d = new gdq[]{gdqVar, gdqVar2, gdqVar3};
    }

    public static gdq valueOf(String str) {
        return (gdq) Enum.valueOf(gdq.class, str);
    }

    public static gdq[] values() {
        return (gdq[]) d.clone();
    }
}
