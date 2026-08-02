package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sls {
    public static final sls a;
    public static final sls b;
    public static final /* synthetic */ sls[] c;

    static {
        sls slsVar = new sls("On", 0);
        a = slsVar;
        sls slsVar2 = new sls("Off", 1);
        b = slsVar2;
        c = new sls[]{slsVar, slsVar2, new sls("Indeterminate", 2)};
    }

    public static sls valueOf(String str) {
        return (sls) Enum.valueOf(sls.class, str);
    }

    public static sls[] values() {
        return (sls[]) c.clone();
    }
}
