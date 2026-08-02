package u7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5080f {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC5080f f41049n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC5080f f41050u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC5080f[] f41051v;

    static {
        EnumC5080f enumC5080f = new EnumC5080f("SYNCHRONIZED", 0);
        EnumC5080f enumC5080f2 = new EnumC5080f("PUBLICATION", 1);
        f41049n = enumC5080f2;
        EnumC5080f enumC5080f3 = new EnumC5080f("NONE", 2);
        f41050u = enumC5080f3;
        EnumC5080f[] enumC5080fArr = {enumC5080f, enumC5080f2, enumC5080f3};
        f41051v = enumC5080fArr;
        X2.a.h(enumC5080fArr);
    }

    public static EnumC5080f valueOf(String str) {
        return (EnumC5080f) Enum.valueOf(EnumC5080f.class, str);
    }

    public static EnumC5080f[] values() {
        return (EnumC5080f[]) f41051v.clone();
    }
}
