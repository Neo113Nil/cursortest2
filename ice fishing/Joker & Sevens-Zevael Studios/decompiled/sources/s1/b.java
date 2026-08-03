package s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f6376g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f6377h;

    static {
        b bVar = new b("Lsq2", 0);
        f6376g = bVar;
        f6377h = new b[]{bVar, new b("Impulse", 1)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6377h.clone();
    }
}
