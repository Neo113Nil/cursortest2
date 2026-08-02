package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xrd {
    public static final xrd a;
    public static final xrd b;
    public static final xrd c;
    public static final /* synthetic */ xrd[] d;

    static {
        xrd xrdVar = new xrd("Cursor", 0);
        a = xrdVar;
        xrd xrdVar2 = new xrd("SelectionStart", 1);
        b = xrdVar2;
        xrd xrdVar3 = new xrd("SelectionEnd", 2);
        c = xrdVar3;
        d = new xrd[]{xrdVar, xrdVar2, xrdVar3};
    }

    public static xrd valueOf(String str) {
        return (xrd) Enum.valueOf(xrd.class, str);
    }

    public static xrd[] values() {
        return (xrd[]) d.clone();
    }
}
