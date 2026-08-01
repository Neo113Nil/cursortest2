package u7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5088f {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC5088f f41329n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC5088f f41330u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC5088f[] f41331v;

    static {
        EnumC5088f enumC5088f = new EnumC5088f("SYNCHRONIZED", 0);
        EnumC5088f enumC5088f2 = new EnumC5088f("PUBLICATION", 1);
        f41329n = enumC5088f2;
        EnumC5088f enumC5088f3 = new EnumC5088f("NONE", 2);
        f41330u = enumC5088f3;
        EnumC5088f[] enumC5088fArr = {enumC5088f, enumC5088f2, enumC5088f3};
        f41331v = enumC5088fArr;
        com.bumptech.glide.e.b(enumC5088fArr);
    }

    public static EnumC5088f valueOf(String str) {
        return (EnumC5088f) Enum.valueOf(EnumC5088f.class, str);
    }

    public static EnumC5088f[] values() {
        return (EnumC5088f[]) f41331v.clone();
    }
}
