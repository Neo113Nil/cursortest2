package S7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: S7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0405x {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0405x f3001n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0405x f3002u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0405x f3003v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0405x f3004w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC0405x[] f3005x;

    static {
        EnumC0405x enumC0405x = new EnumC0405x("DEFAULT", 0);
        f3001n = enumC0405x;
        EnumC0405x enumC0405x2 = new EnumC0405x("LAZY", 1);
        f3002u = enumC0405x2;
        EnumC0405x enumC0405x3 = new EnumC0405x("ATOMIC", 2);
        f3003v = enumC0405x3;
        EnumC0405x enumC0405x4 = new EnumC0405x("UNDISPATCHED", 3);
        f3004w = enumC0405x4;
        EnumC0405x[] enumC0405xArr = {enumC0405x, enumC0405x2, enumC0405x3, enumC0405x4};
        f3005x = enumC0405xArr;
        com.bumptech.glide.e.b(enumC0405xArr);
    }

    public static EnumC0405x valueOf(String str) {
        return (EnumC0405x) Enum.valueOf(EnumC0405x.class, str);
    }

    public static EnumC0405x[] values() {
        return (EnumC0405x[]) f3005x.clone();
    }
}
