package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xfh {
    public static final xfh a;
    public static final xfh b;
    public static final /* synthetic */ xfh[] c;

    static {
        xfh xfhVar = new xfh("Width", 0);
        a = xfhVar;
        xfh xfhVar2 = new xfh("Height", 1);
        b = xfhVar2;
        c = new xfh[]{xfhVar, xfhVar2};
    }

    public static xfh valueOf(String str) {
        return (xfh) Enum.valueOf(xfh.class, str);
    }

    public static xfh[] values() {
        return (xfh[]) c.clone();
    }
}
