package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xwg {
    public static final xwg a;
    public static final xwg b;
    public static final xwg c;
    public static final /* synthetic */ xwg[] d;

    static {
        xwg xwgVar = new xwg("IsPlacedInLookahead", 0);
        a = xwgVar;
        xwg xwgVar2 = new xwg("IsPlacedInApproach", 1);
        b = xwgVar2;
        xwg xwgVar3 = new xwg("IsNotPlaced", 2);
        c = xwgVar3;
        d = new xwg[]{xwgVar, xwgVar2, xwgVar3};
    }

    public static xwg valueOf(String str) {
        return (xwg) Enum.valueOf(xwg.class, str);
    }

    public static xwg[] values() {
        return (xwg[]) d.clone();
    }
}
