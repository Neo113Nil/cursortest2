package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4912b implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4912b f40226n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4912b[] f40227u;

    static {
        EnumC4912b enumC4912b = new EnumC4912b("INSTANCE", 0);
        f40226n = enumC4912b;
        f40227u = new EnumC4912b[]{enumC4912b};
    }

    public static EnumC4912b valueOf(String str) {
        return (EnumC4912b) Enum.valueOf(EnumC4912b.class, str);
    }

    public static EnumC4912b[] values() {
        return (EnumC4912b[]) f40227u.clone();
    }

    @Override // r7.d
    public final String getDescription() {
        return "AlwaysOnSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
