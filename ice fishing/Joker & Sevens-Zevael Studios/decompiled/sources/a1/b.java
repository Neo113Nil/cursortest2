package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f155g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f156h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f157i;

    static {
        b bVar = new b("SHOW_ORIGINAL", 0);
        f155g = bVar;
        b bVar2 = new b("SHOW_TRANSLATED", 1);
        f156h = bVar2;
        f157i = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f157i.clone();
    }
}
