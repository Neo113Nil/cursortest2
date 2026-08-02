package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k7a {
    public static final k7a a;
    public static final k7a b;
    public static final k7a c;
    public static final /* synthetic */ k7a[] d;

    static {
        k7a k7aVar = new k7a("PLUS", 0);
        a = k7aVar;
        k7a k7aVar2 = new k7a("NO_PLUS", 1);
        b = k7aVar2;
        k7a k7aVar3 = new k7a("FROZEN", 2);
        c = k7aVar3;
        d = new k7a[]{k7aVar, k7aVar2, k7aVar3};
    }

    public static k7a valueOf(String str) {
        return (k7a) Enum.valueOf(k7a.class, str);
    }

    public static k7a[] values() {
        return (k7a[]) d.clone();
    }
}
