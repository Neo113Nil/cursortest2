package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b0p {
    public static final b0p a;
    public static final b0p b;
    public static final b0p c;
    public static final /* synthetic */ b0p[] d;

    static {
        b0p b0pVar = new b0p("Online", 0);
        a = b0pVar;
        b0p b0pVar2 = new b0p("NoNetwork", 1);
        b = b0pVar2;
        b0p b0pVar3 = new b0p("Offline", 2);
        c = b0pVar3;
        d = new b0p[]{b0pVar, b0pVar2, b0pVar3};
    }

    public static b0p valueOf(String str) {
        return (b0p) Enum.valueOf(b0p.class, str);
    }

    public static b0p[] values() {
        return (b0p[]) d.clone();
    }
}
