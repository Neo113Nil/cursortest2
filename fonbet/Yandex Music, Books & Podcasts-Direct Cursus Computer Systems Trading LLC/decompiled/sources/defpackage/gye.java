package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gye {
    public static final gye a;
    public static final gye b;
    public static final gye c;
    public static final gye d;
    public static final /* synthetic */ gye[] e;

    static {
        gye gyeVar = new gye("IGNORED", 0);
        a = gyeVar;
        gye gyeVar2 = new gye("SCHEDULED", 1);
        b = gyeVar2;
        gye gyeVar3 = new gye("DEFERRED", 2);
        c = gyeVar3;
        gye gyeVar4 = new gye("IMMINENT", 3);
        d = gyeVar4;
        e = new gye[]{gyeVar, gyeVar2, gyeVar3, gyeVar4};
    }

    public static gye valueOf(String str) {
        return (gye) Enum.valueOf(gye.class, str);
    }

    public static gye[] values() {
        return (gye[]) e.clone();
    }
}
