package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f37465n;

    /* renamed from: u, reason: collision with root package name */
    public static final d f37466u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f37467v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f37468w;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f37465n = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f37466u = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f37467v = dVar3;
        f37468w = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f37468w.clone();
    }
}
