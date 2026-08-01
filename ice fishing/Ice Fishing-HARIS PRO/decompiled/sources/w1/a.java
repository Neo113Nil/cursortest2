package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4662a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f4663b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f4662a = aVar;
        f4663b = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4663b.clone();
    }
}
