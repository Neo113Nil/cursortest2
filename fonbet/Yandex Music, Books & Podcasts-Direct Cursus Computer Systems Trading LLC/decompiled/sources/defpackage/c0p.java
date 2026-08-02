package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c0p {
    public static final c0p a;
    public static final c0p b;
    public static final c0p c;
    public static final c0p d;
    public static final c0p e;
    public static final /* synthetic */ c0p[] f;

    static {
        c0p c0pVar = new c0p("Kids", 0);
        a = c0pVar;
        c0p c0pVar2 = new c0p("Podcasts", 1);
        b = c0pVar2;
        c0p c0pVar3 = new c0p("MyMusic", 2);
        c = c0pVar3;
        c0p c0pVar4 = new c0p("Empty", 3);
        d = c0pVar4;
        c0p c0pVar5 = new c0p("Concerts", 4);
        e = c0pVar5;
        f = new c0p[]{c0pVar, c0pVar2, c0pVar3, c0pVar4, c0pVar5};
    }

    public static c0p valueOf(String str) {
        return (c0p) Enum.valueOf(c0p.class, str);
    }

    public static c0p[] values() {
        return (c0p[]) f.clone();
    }
}
