package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0418a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0418a f3943n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0418a f3944u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0418a[] f3945v;

    static {
        EnumC0418a enumC0418a = new EnumC0418a("AUTOMATIC", 0);
        f3943n = enumC0418a;
        EnumC0418a enumC0418a2 = new EnumC0418a("ENABLED", 1);
        f3944u = enumC0418a2;
        f3945v = new EnumC0418a[]{enumC0418a, enumC0418a2, new EnumC0418a("DISABLED", 2)};
    }

    public static EnumC0418a valueOf(String str) {
        return (EnumC0418a) Enum.valueOf(EnumC0418a.class, str);
    }

    public static EnumC0418a[] values() {
        return (EnumC0418a[]) f3945v.clone();
    }
}
