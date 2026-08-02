package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xnc {
    public static final xnc a;
    public static final xnc b;
    public static final xnc c;
    public static final /* synthetic */ xnc[] d;

    static {
        xnc xncVar = new xnc("SUCCESS", 0);
        a = xncVar;
        xnc xncVar2 = new xnc("SERVER_ERROR", 1);
        b = xncVar2;
        xnc xncVar3 = new xnc("NO_CONNECTIVITY", 2);
        c = xncVar3;
        d = new xnc[]{xncVar, xncVar2, xncVar3, new xnc("UNKNOWN_ERROR", 3)};
    }

    public static xnc valueOf(String str) {
        return (xnc) Enum.valueOf(xnc.class, str);
    }

    public static xnc[] values() {
        return (xnc[]) d.clone();
    }
}
