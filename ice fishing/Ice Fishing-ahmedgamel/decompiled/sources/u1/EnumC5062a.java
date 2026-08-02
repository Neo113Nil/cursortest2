package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5062a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC5062a f41000n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC5062a f41001u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC5062a f41002v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC5062a[] f41003w;

    static {
        EnumC5062a enumC5062a = new EnumC5062a("PREFER_ARGB_8888", 0);
        f41000n = enumC5062a;
        EnumC5062a enumC5062a2 = new EnumC5062a("PREFER_RGB_565", 1);
        f41001u = enumC5062a2;
        f41003w = new EnumC5062a[]{enumC5062a, enumC5062a2};
        f41002v = enumC5062a;
    }

    public static EnumC5062a valueOf(String str) {
        return (EnumC5062a) Enum.valueOf(EnumC5062a.class, str);
    }

    public static EnumC5062a[] values() {
        return (EnumC5062a[]) f41003w.clone();
    }
}
