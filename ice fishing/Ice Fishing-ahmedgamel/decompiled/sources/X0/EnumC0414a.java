package X0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0414a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0414a f3591n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0414a f3592u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0414a[] f3593v;

    static {
        EnumC0414a enumC0414a = new EnumC0414a("AUTOMATIC", 0);
        f3591n = enumC0414a;
        EnumC0414a enumC0414a2 = new EnumC0414a("ENABLED", 1);
        f3592u = enumC0414a2;
        f3593v = new EnumC0414a[]{enumC0414a, enumC0414a2, new EnumC0414a("DISABLED", 2)};
    }

    public static EnumC0414a valueOf(String str) {
        return (EnumC0414a) Enum.valueOf(EnumC0414a.class, str);
    }

    public static EnumC0414a[] values() {
        return (EnumC0414a[]) f3593v.clone();
    }
}
