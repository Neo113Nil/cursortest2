package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class whm {
    public static final whm a;
    public static final whm b;
    public static final whm c;
    public static final /* synthetic */ whm[] d;

    static {
        whm whmVar = new whm("Left", 0);
        a = whmVar;
        whm whmVar2 = new whm("Center", 1);
        b = whmVar2;
        whm whmVar3 = new whm("Right", 2);
        c = whmVar3;
        d = new whm[]{whmVar, whmVar2, whmVar3};
    }

    public static whm valueOf(String str) {
        return (whm) Enum.valueOf(whm.class, str);
    }

    public static whm[] values() {
        return (whm[]) d.clone();
    }
}
