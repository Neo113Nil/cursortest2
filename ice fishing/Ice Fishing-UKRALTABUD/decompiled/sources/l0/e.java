package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final e f2694g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e[] f2695h;

    /* renamed from: f, reason: collision with root package name */
    public String f2696f;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("PLAIN_TEXT", 0);
        eVar.f2696f = "text/plain";
        f2694g = eVar;
        f2695h = new e[]{eVar};
    }

    public static e a(String str) {
        for (e eVar : values()) {
            if (eVar.f2696f.equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException(E0.h.f("No such ClipboardContentFormat: ", str));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2695h.clone();
    }
}
