package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final d f1241g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f1242h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f1243i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d[] f1244j;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f1241g = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f1242h = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f1243i = dVar3;
        f1244j = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1244j.clone();
    }
}
