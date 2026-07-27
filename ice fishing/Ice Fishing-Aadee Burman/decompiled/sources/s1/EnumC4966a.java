package s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4966a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4966a f40443n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4966a f40444u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4966a f40445v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC4966a[] f40446w;

    static {
        EnumC4966a enumC4966a = new EnumC4966a("PREFER_ARGB_8888", 0);
        f40443n = enumC4966a;
        EnumC4966a enumC4966a2 = new EnumC4966a("PREFER_RGB_565", 1);
        f40444u = enumC4966a2;
        f40446w = new EnumC4966a[]{enumC4966a, enumC4966a2};
        f40445v = enumC4966a;
    }

    public static EnumC4966a valueOf(String str) {
        return (EnumC4966a) Enum.valueOf(EnumC4966a.class, str);
    }

    public static EnumC4966a[] values() {
        return (EnumC4966a[]) f40446w.clone();
    }
}
