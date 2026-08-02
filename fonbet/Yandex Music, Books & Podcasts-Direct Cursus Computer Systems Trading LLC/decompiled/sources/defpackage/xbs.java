package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xbs {
    public static final xbs a;
    public static final /* synthetic */ xbs[] b;

    /* JADX INFO: Fake field, exist only in values array */
    xbs EF0;

    static {
        xbs xbsVar = new xbs("Filled", 0);
        xbs xbsVar2 = new xbs("Outlined", 1);
        a = xbsVar2;
        b = new xbs[]{xbsVar, xbsVar2};
    }

    public static xbs valueOf(String str) {
        return (xbs) Enum.valueOf(xbs.class, str);
    }

    public static xbs[] values() {
        return (xbs[]) b.clone();
    }
}
