package Y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f3904n;

    /* renamed from: u, reason: collision with root package name */
    public static final d f3905u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f3906v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f3907w;

    static {
        d dVar = new d("DEFAULT", 0);
        f3904n = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f3905u = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f3906v = dVar3;
        f3907w = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3907w.clone();
    }
}
