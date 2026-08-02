package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b9p {
    public static final b9p a;
    public static final b9p b;
    public static final /* synthetic */ b9p[] c;

    static {
        b9p b9pVar = new b9p("NONE", 0);
        a = b9pVar;
        b9p b9pVar2 = new b9p("INTEGRITY", 1);
        b9p b9pVar3 = new b9p("PRIVACY_AND_INTEGRITY", 2);
        b = b9pVar3;
        c = new b9p[]{b9pVar, b9pVar2, b9pVar3};
    }

    public static b9p valueOf(String str) {
        return (b9p) Enum.valueOf(b9p.class, str);
    }

    public static b9p[] values() {
        return (b9p[]) c.clone();
    }
}
