package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xof {
    public static final xof a;
    public static final xof b;
    public static final /* synthetic */ xof[] c;

    static {
        xof xofVar = new xof("Ltr", 0);
        a = xofVar;
        xof xofVar2 = new xof("Rtl", 1);
        b = xofVar2;
        c = new xof[]{xofVar, xofVar2};
    }

    public static xof valueOf(String str) {
        return (xof) Enum.valueOf(xof.class, str);
    }

    public static xof[] values() {
        return (xof[]) c.clone();
    }
}
