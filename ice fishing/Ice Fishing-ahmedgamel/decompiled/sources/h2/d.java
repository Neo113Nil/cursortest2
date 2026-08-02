package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f38089n;

    /* renamed from: u, reason: collision with root package name */
    public static final d f38090u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f38091v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f38092w;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f38089n = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f38090u = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f38091v = dVar3;
        f38092w = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f38092w.clone();
    }
}
