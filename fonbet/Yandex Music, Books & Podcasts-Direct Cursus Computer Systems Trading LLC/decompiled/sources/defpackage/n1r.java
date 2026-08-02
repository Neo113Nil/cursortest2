package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n1r {
    public static final n1r a;
    public static final n1r b;
    public static final /* synthetic */ n1r[] c;

    static {
        n1r n1rVar = new n1r("Dismissed", 0);
        a = n1rVar;
        n1r n1rVar2 = new n1r("ActionPerformed", 1);
        b = n1rVar2;
        c = new n1r[]{n1rVar, n1rVar2};
    }

    public static n1r valueOf(String str) {
        return (n1r) Enum.valueOf(n1r.class, str);
    }

    public static n1r[] values() {
        return (n1r[]) c.clone();
    }
}
