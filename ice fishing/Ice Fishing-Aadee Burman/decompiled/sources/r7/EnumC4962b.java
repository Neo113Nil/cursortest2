package r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4962b implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4962b f40387n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4962b[] f40388u;

    static {
        EnumC4962b enumC4962b = new EnumC4962b("INSTANCE", 0);
        f40387n = enumC4962b;
        f40388u = new EnumC4962b[]{enumC4962b};
    }

    public static EnumC4962b valueOf(String str) {
        return (EnumC4962b) Enum.valueOf(EnumC4962b.class, str);
    }

    public static EnumC4962b[] values() {
        return (EnumC4962b[]) f40388u.clone();
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
