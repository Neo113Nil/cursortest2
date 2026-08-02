package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class amg {
    public static final amg a;
    public static final amg b;
    public static final amg c;
    public static final /* synthetic */ amg[] d;

    static {
        amg amgVar = new amg("PLUS", 0);
        a = amgVar;
        amg amgVar2 = new amg("NO_PLUS", 1);
        b = amgVar2;
        amg amgVar3 = new amg("FROZEN", 2);
        c = amgVar3;
        d = new amg[]{amgVar, amgVar2, amgVar3};
    }

    public static amg valueOf(String str) {
        return (amg) Enum.valueOf(amg.class, str);
    }

    public static amg[] values() {
        return (amg[]) d.clone();
    }
}
