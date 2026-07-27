package U3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f3285n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d[] f3286u;

    static {
        d dVar = new d("DEFAULT", 0);
        f3285n = dVar;
        f3286u = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3286u.clone();
    }
}
