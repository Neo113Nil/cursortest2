package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4911a implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4911a f40224n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4911a[] f40225u;

    static {
        EnumC4911a enumC4911a = new EnumC4911a("INSTANCE", 0);
        f40224n = enumC4911a;
        f40225u = new EnumC4911a[]{enumC4911a};
    }

    public static EnumC4911a valueOf(String str) {
        return (EnumC4911a) Enum.valueOf(EnumC4911a.class, str);
    }

    public static EnumC4911a[] values() {
        return (EnumC4911a[]) f40225u.clone();
    }

    @Override // r7.d
    public final String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
