package m1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0985a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0985a f8194a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0985a[] f8195b;

    static {
        EnumC0985a enumC0985a = new EnumC0985a("COROUTINE_SUSPENDED", 0);
        f8194a = enumC0985a;
        f8195b = new EnumC0985a[]{enumC0985a, new EnumC0985a("UNDECIDED", 1), new EnumC0985a("RESUMED", 2)};
    }

    public static EnumC0985a valueOf(String str) {
        return (EnumC0985a) Enum.valueOf(EnumC0985a.class, str);
    }

    public static EnumC0985a[] values() {
        return (EnumC0985a[]) f8195b.clone();
    }
}
