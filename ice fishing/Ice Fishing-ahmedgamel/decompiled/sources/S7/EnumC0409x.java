package S7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: S7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0409x {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0409x f3084n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0409x f3085u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0409x f3086v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0409x f3087w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC0409x[] f3088x;

    static {
        EnumC0409x enumC0409x = new EnumC0409x("DEFAULT", 0);
        f3084n = enumC0409x;
        EnumC0409x enumC0409x2 = new EnumC0409x("LAZY", 1);
        f3085u = enumC0409x2;
        EnumC0409x enumC0409x3 = new EnumC0409x("ATOMIC", 2);
        f3086v = enumC0409x3;
        EnumC0409x enumC0409x4 = new EnumC0409x("UNDISPATCHED", 3);
        f3087w = enumC0409x4;
        EnumC0409x[] enumC0409xArr = {enumC0409x, enumC0409x2, enumC0409x3, enumC0409x4};
        f3088x = enumC0409xArr;
        X2.a.h(enumC0409xArr);
    }

    public static EnumC0409x valueOf(String str) {
        return (EnumC0409x) Enum.valueOf(EnumC0409x.class, str);
    }

    public static EnumC0409x[] values() {
        return (EnumC0409x[]) f3088x.clone();
    }
}
