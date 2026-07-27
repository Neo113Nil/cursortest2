package q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4937f {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4937f f40159n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4937f f40160u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC4937f[] f40161v;

    static {
        EnumC4937f enumC4937f = new EnumC4937f("SYNCHRONIZED", 0);
        EnumC4937f enumC4937f2 = new EnumC4937f("PUBLICATION", 1);
        f40159n = enumC4937f2;
        EnumC4937f enumC4937f3 = new EnumC4937f("NONE", 2);
        f40160u = enumC4937f3;
        EnumC4937f[] enumC4937fArr = {enumC4937f, enumC4937f2, enumC4937f3};
        f40161v = enumC4937fArr;
        W2.e.d(enumC4937fArr);
    }

    public static EnumC4937f valueOf(String str) {
        return (EnumC4937f) Enum.valueOf(EnumC4937f.class, str);
    }

    public static EnumC4937f[] values() {
        return (EnumC4937f[]) f40161v.clone();
    }
}
