package f8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4514a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4514a f37536n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4514a[] f37537u;

    static {
        EnumC4514a enumC4514a = new EnumC4514a("NONE", 0);
        EnumC4514a enumC4514a2 = new EnumC4514a("ALL_JSON_OBJECTS", 1);
        EnumC4514a enumC4514a3 = new EnumC4514a("POLYMORPHIC", 2);
        f37536n = enumC4514a3;
        EnumC4514a[] enumC4514aArr = {enumC4514a, enumC4514a2, enumC4514a3};
        f37537u = enumC4514aArr;
        com.bumptech.glide.e.b(enumC4514aArr);
    }

    public static EnumC4514a valueOf(String str) {
        return (EnumC4514a) Enum.valueOf(EnumC4514a.class, str);
    }

    public static EnumC4514a[] values() {
        return (EnumC4514a[]) f37537u.clone();
    }
}
