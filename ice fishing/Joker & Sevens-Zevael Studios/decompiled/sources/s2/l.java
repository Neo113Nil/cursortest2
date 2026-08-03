package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final l f6396g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f6397h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l[] f6398i;

    static {
        l lVar = new l("Ltr", 0);
        f6396g = lVar;
        l lVar2 = new l("Rtl", 1);
        f6397h = lVar2;
        f6398i = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f6398i.clone();
    }
}
