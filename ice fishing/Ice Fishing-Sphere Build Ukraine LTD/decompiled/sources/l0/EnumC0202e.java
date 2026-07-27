package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0202e {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0202e f2702f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0202e[] f2703g;

    /* renamed from: e, reason: collision with root package name */
    public String f2704e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0202e EF0;

    static {
        EnumC0202e enumC0202e = new EnumC0202e("PLAIN_TEXT", 0);
        enumC0202e.f2704e = "text/plain";
        f2702f = enumC0202e;
        f2703g = new EnumC0202e[]{enumC0202e};
    }

    public static EnumC0202e a(String str) {
        for (EnumC0202e enumC0202e : values()) {
            if (enumC0202e.f2704e.equals(str)) {
                return enumC0202e;
            }
        }
        throw new NoSuchFieldException(E0.h.f("No such ClipboardContentFormat: ", str));
    }

    public static EnumC0202e valueOf(String str) {
        return (EnumC0202e) Enum.valueOf(EnumC0202e.class, str);
    }

    public static EnumC0202e[] values() {
        return (EnumC0202e[]) f2703g.clone();
    }
}
