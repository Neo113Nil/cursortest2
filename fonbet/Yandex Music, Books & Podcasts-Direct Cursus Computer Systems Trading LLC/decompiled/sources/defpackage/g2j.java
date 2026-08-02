package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g2j {
    public static final g2j a;
    public static final g2j b;
    public static final g2j c;
    public static final g2j d;
    public static final g2j e;
    public static final g2j f;
    public static final /* synthetic */ g2j[] g;

    static {
        g2j g2jVar = new g2j("NOT_REQUIRED", 0);
        a = g2jVar;
        g2j g2jVar2 = new g2j("CONNECTED", 1);
        b = g2jVar2;
        g2j g2jVar3 = new g2j("UNMETERED", 2);
        c = g2jVar3;
        g2j g2jVar4 = new g2j("NOT_ROAMING", 3);
        d = g2jVar4;
        g2j g2jVar5 = new g2j("METERED", 4);
        e = g2jVar5;
        g2j g2jVar6 = new g2j("TEMPORARILY_UNMETERED", 5);
        f = g2jVar6;
        g = new g2j[]{g2jVar, g2jVar2, g2jVar3, g2jVar4, g2jVar5, g2jVar6};
    }

    public static g2j valueOf(String str) {
        return (g2j) Enum.valueOf(g2j.class, str);
    }

    public static g2j[] values() {
        return (g2j[]) g.clone();
    }
}
