package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xye {
    public static final xye a;
    public static final xye b;
    public static final /* synthetic */ xye[] c;

    static {
        xye xyeVar = new xye("COMMUNICATION", 0);
        a = xyeVar;
        xye xyeVar2 = new xye("PARSING", 1);
        b = xyeVar2;
        c = new xye[]{xyeVar, xyeVar2};
    }

    public static xye valueOf(String str) {
        return (xye) Enum.valueOf(xye.class, str);
    }

    public static xye[] values() {
        return (xye[]) c.clone();
    }
}
