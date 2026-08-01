package p6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4850k implements InterfaceC4845f {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4850k f39790n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4850k[] f39791u;

    static {
        EnumC4850k enumC4850k = new EnumC4850k("INSTANCE", 0);
        f39790n = enumC4850k;
        f39791u = new EnumC4850k[]{enumC4850k};
    }

    public static EnumC4850k valueOf(String str) {
        return (EnumC4850k) Enum.valueOf(EnumC4850k.class, str);
    }

    public static EnumC4850k[] values() {
        return (EnumC4850k[]) f39791u.clone();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
