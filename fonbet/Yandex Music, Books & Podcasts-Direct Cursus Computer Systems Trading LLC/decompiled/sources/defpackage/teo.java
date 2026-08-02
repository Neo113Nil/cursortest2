package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class teo {
    public static final teo a;
    public static final teo b;
    public static final teo c;
    public static final /* synthetic */ teo[] d;

    static {
        teo teoVar = new teo("AUTOMATIC", 0);
        a = teoVar;
        teo teoVar2 = new teo("TRUNCATE", 1);
        b = teoVar2;
        teo teoVar3 = new teo("WRITE_AHEAD_LOGGING", 2);
        c = teoVar3;
        d = new teo[]{teoVar, teoVar2, teoVar3};
    }

    public static teo valueOf(String str) {
        return (teo) Enum.valueOf(teo.class, str);
    }

    public static teo[] values() {
        return (teo[]) d.clone();
    }
}
