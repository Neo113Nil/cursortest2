package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4815a implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4815a f39649n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4815a[] f39650u;

    static {
        EnumC4815a enumC4815a = new EnumC4815a("INSTANCE", 0);
        f39649n = enumC4815a;
        f39650u = new EnumC4815a[]{enumC4815a};
    }

    public static EnumC4815a valueOf(String str) {
        return (EnumC4815a) Enum.valueOf(EnumC4815a.class, str);
    }

    public static EnumC4815a[] values() {
        return (EnumC4815a[]) f39650u.clone();
    }

    @Override // n7.d
    public final String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
