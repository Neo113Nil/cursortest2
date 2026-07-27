package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4961a implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4961a f40385n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4961a[] f40386u;

    static {
        EnumC4961a enumC4961a = new EnumC4961a("INSTANCE", 0);
        f40385n = enumC4961a;
        f40386u = new EnumC4961a[]{enumC4961a};
    }

    public static EnumC4961a valueOf(String str) {
        return (EnumC4961a) Enum.valueOf(EnumC4961a.class, str);
    }

    public static EnumC4961a[] values() {
        return (EnumC4961a[]) f40386u.clone();
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
