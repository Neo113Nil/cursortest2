package l6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4704k implements InterfaceC4699f {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4704k f39070n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4704k[] f39071u;

    static {
        EnumC4704k enumC4704k = new EnumC4704k("INSTANCE", 0);
        f39070n = enumC4704k;
        f39071u = new EnumC4704k[]{enumC4704k};
    }

    public static EnumC4704k valueOf(String str) {
        return (EnumC4704k) Enum.valueOf(EnumC4704k.class, str);
    }

    public static EnumC4704k[] values() {
        return (EnumC4704k[]) f39071u.clone();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
