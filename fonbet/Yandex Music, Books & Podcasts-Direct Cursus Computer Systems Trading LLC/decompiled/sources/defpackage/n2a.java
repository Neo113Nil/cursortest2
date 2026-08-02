package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n2a {
    public static final n2a a;
    public static final /* synthetic */ n2a[] b;

    static {
        n2a n2aVar = new n2a("CrossDissolve", 0);
        a = n2aVar;
        b = new n2a[]{n2aVar};
    }

    public static n2a valueOf(String str) {
        return (n2a) Enum.valueOf(n2a.class, str);
    }

    public static n2a[] values() {
        return (n2a[]) b.clone();
    }
}
