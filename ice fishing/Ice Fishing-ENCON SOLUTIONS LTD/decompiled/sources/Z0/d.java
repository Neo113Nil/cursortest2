package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f1958b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f1959c;

    /* renamed from: a, reason: collision with root package name */
    public String f1960a;

    /* JADX INFO: Fake field, exist only in values array */
    d EF0;

    static {
        d dVar = new d("PLAIN_TEXT", 0);
        dVar.f1960a = "text/plain";
        f1958b = dVar;
        f1959c = new d[]{dVar};
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.f1960a.equals(str)) {
                return dVar;
            }
        }
        throw new NoSuchFieldException(C1.a.i("No such ClipboardContentFormat: ", str));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1959c.clone();
    }
}
