package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final d f6527g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f6528h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f6529i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d[] f6530j;

    static {
        d dVar = new d("DEFAULT", 0);
        f6527g = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f6528h = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f6529i = dVar3;
        f6530j = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f6530j.clone();
    }
}
