package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0440d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0440d f4303n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0440d[] f4304u;

    static {
        EnumC0440d enumC0440d = new EnumC0440d("DEFAULT", 0);
        f4303n = enumC0440d;
        f4304u = new EnumC0440d[]{enumC0440d, new EnumC0440d("SIGNED", 1), new EnumC0440d("FIXED", 2)};
    }

    public static EnumC0440d valueOf(String str) {
        return (EnumC0440d) Enum.valueOf(EnumC0440d.class, str);
    }

    public static EnumC0440d[] values() {
        return (EnumC0440d[]) f4304u.clone();
    }
}
