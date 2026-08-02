package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c4w {
    public static final c4w a;
    public static final c4w b;
    public static final c4w c;
    public static final c4w d;
    public static final c4w e;
    public static final c4w f;
    public static final /* synthetic */ c4w[] g;

    static {
        c4w c4wVar = new c4w("ENQUEUED", 0);
        a = c4wVar;
        c4w c4wVar2 = new c4w("RUNNING", 1);
        b = c4wVar2;
        c4w c4wVar3 = new c4w("SUCCEEDED", 2);
        c = c4wVar3;
        c4w c4wVar4 = new c4w("FAILED", 3);
        d = c4wVar4;
        c4w c4wVar5 = new c4w("BLOCKED", 4);
        e = c4wVar5;
        c4w c4wVar6 = new c4w("CANCELLED", 5);
        f = c4wVar6;
        g = new c4w[]{c4wVar, c4wVar2, c4wVar3, c4wVar4, c4wVar5, c4wVar6};
    }

    public static c4w valueOf(String str) {
        return (c4w) Enum.valueOf(c4w.class, str);
    }

    public static c4w[] values() {
        return (c4w[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
