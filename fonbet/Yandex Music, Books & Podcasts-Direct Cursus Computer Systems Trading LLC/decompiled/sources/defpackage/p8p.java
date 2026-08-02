package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p8p {
    public static final p8p a;
    public static final p8p b;
    public static final p8p c;
    public static final p8p d;
    public static final /* synthetic */ p8p[] e;

    static {
        p8p p8pVar = new p8p("HIDING", 0);
        a = p8pVar;
        p8p p8pVar2 = new p8p("HIDDEN", 1);
        b = p8pVar2;
        p8p p8pVar3 = new p8p("SHOWING", 2);
        c = p8pVar3;
        p8p p8pVar4 = new p8p("SHOWN", 3);
        d = p8pVar4;
        e = new p8p[]{p8pVar, p8pVar2, p8pVar3, p8pVar4};
    }

    public static p8p valueOf(String str) {
        return (p8p) Enum.valueOf(p8p.class, str);
    }

    public static p8p[] values() {
        return (p8p[]) e.clone();
    }
}
