package b8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0532a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0532a f5580n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0532a[] f5581u;

    static {
        EnumC0532a enumC0532a = new EnumC0532a("NONE", 0);
        EnumC0532a enumC0532a2 = new EnumC0532a("ALL_JSON_OBJECTS", 1);
        EnumC0532a enumC0532a3 = new EnumC0532a("POLYMORPHIC", 2);
        f5580n = enumC0532a3;
        EnumC0532a[] enumC0532aArr = {enumC0532a, enumC0532a2, enumC0532a3};
        f5581u = enumC0532aArr;
        W2.e.d(enumC0532aArr);
    }

    public static EnumC0532a valueOf(String str) {
        return (EnumC0532a) Enum.valueOf(EnumC0532a.class, str);
    }

    public static EnumC0532a[] values() {
        return (EnumC0532a[]) f5581u.clone();
    }
}
