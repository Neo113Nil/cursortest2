package f8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4524a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4524a f37498n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4524a[] f37499u;

    static {
        EnumC4524a enumC4524a = new EnumC4524a("NONE", 0);
        EnumC4524a enumC4524a2 = new EnumC4524a("ALL_JSON_OBJECTS", 1);
        EnumC4524a enumC4524a3 = new EnumC4524a("POLYMORPHIC", 2);
        f37498n = enumC4524a3;
        EnumC4524a[] enumC4524aArr = {enumC4524a, enumC4524a2, enumC4524a3};
        f37499u = enumC4524aArr;
        X2.a.h(enumC4524aArr);
    }

    public static EnumC4524a valueOf(String str) {
        return (EnumC4524a) Enum.valueOf(EnumC4524a.class, str);
    }

    public static EnumC4524a[] values() {
        return (EnumC4524a[]) f37499u.clone();
    }
}
