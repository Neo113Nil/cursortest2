package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x3a {
    public static final x3a a;
    public static final /* synthetic */ x3a[] b;

    static {
        x3a x3aVar = new x3a("UNKNOWN", 0);
        a = x3aVar;
        b = new x3a[]{x3aVar, new x3a("NETWORK", 1), new x3a("PARSING", 2)};
    }

    public static x3a valueOf(String str) {
        return (x3a) Enum.valueOf(x3a.class, str);
    }

    public static x3a[] values() {
        return (x3a[]) b.clone();
    }
}
