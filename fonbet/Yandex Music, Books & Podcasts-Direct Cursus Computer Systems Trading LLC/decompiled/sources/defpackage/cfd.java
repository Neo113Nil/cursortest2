package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class cfd {
    public static final cfd a;
    public static final cfd b;
    public static final cfd c;
    public static final cfd d;
    public static final /* synthetic */ cfd[] e;

    static {
        cfd cfdVar = new cfd("ACTIVE", 0);
        a = cfdVar;
        cfd cfdVar2 = new cfd("PAUSED", 1);
        b = cfdVar2;
        cfd cfdVar3 = new cfd("STOPPED", 2);
        c = cfdVar3;
        cfd cfdVar4 = new cfd("RELEASED", 3);
        d = cfdVar4;
        e = new cfd[]{cfdVar, cfdVar2, cfdVar3, cfdVar4};
    }

    public static cfd valueOf(String str) {
        return (cfd) Enum.valueOf(cfd.class, str);
    }

    public static cfd[] values() {
        return (cfd[]) e.clone();
    }
}
