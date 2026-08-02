package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t0p {
    public static final t0p a;
    public static final t0p b;
    public static final t0p c;
    public static final /* synthetic */ t0p[] d;

    static {
        t0p t0pVar = new t0p("Play", 0);
        a = t0pVar;
        t0p t0pVar2 = new t0p("Navigate", 1);
        b = t0pVar2;
        t0p t0pVar3 = new t0p("Like", 2);
        c = t0pVar3;
        d = new t0p[]{t0pVar, t0pVar2, t0pVar3};
    }

    public static t0p valueOf(String str) {
        return (t0p) Enum.valueOf(t0p.class, str);
    }

    public static t0p[] values() {
        return (t0p[]) d.clone();
    }
}
