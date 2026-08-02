package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class xkp {
    public static final xkp a;
    public static final xkp b;
    public static final xkp c;
    public static final xkp d;
    public static final xkp e;
    public static final xkp f;
    public static final /* synthetic */ xkp[] g;

    static {
        xkp xkpVar = new xkp("HAS_TVT", 0);
        a = xkpVar;
        xkp xkpVar2 = new xkp("HAS_FATAL", 1);
        b = xkpVar2;
        xkp xkpVar3 = new xkp("VQS", 2);
        c = xkpVar3;
        xkp xkpVar4 = new xkp("STALLED_COUNT", 3);
        d = xkpVar4;
        xkp xkpVar5 = new xkp("INIT_STALLED_DURATION", 4);
        e = xkpVar5;
        xkp xkpVar6 = new xkp("MAX_STALLED_DURATION", 5);
        f = xkpVar6;
        g = new xkp[]{xkpVar, xkpVar2, xkpVar3, xkpVar4, xkpVar5, xkpVar6};
    }

    public static xkp valueOf(String str) {
        return (xkp) Enum.valueOf(xkp.class, str);
    }

    public static xkp[] values() {
        return (xkp[]) g.clone();
    }
}
