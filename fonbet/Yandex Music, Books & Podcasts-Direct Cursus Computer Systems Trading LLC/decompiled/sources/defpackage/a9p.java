package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a9p {
    public static final a9p a;
    public static final a9p b;
    public static final /* synthetic */ a9p[] c;

    static {
        a9p a9pVar = new a9p("Inherit", 0);
        a = a9pVar;
        a9p a9pVar2 = new a9p("SecureOn", 1);
        b = a9pVar2;
        c = new a9p[]{a9pVar, a9pVar2, new a9p("SecureOff", 2)};
    }

    public static a9p valueOf(String str) {
        return (a9p) Enum.valueOf(a9p.class, str);
    }

    public static a9p[] values() {
        return (a9p[]) c.clone();
    }
}
