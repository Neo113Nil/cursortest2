package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class drp {
    public static final drp a;
    public static final drp b;
    public static final drp c;
    public static final /* synthetic */ drp[] d;

    static {
        drp drpVar = new drp("Disabled", 0);
        a = drpVar;
        drp drpVar2 = new drp("On", 1);
        b = drpVar2;
        drp drpVar3 = new drp("Off", 2);
        c = drpVar3;
        d = new drp[]{drpVar, drpVar2, drpVar3};
    }

    public static drp valueOf(String str) {
        return (drp) Enum.valueOf(drp.class, str);
    }

    public static drp[] values() {
        return (drp[]) d.clone();
    }
}
