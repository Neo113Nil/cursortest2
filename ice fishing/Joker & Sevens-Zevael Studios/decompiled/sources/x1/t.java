package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final t f8161g;

    /* renamed from: h, reason: collision with root package name */
    public static final t f8162h;

    /* renamed from: i, reason: collision with root package name */
    public static final t f8163i;

    /* renamed from: j, reason: collision with root package name */
    public static final t f8164j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ t[] f8165k;

    static {
        t tVar = new t("LookaheadMeasurement", 0);
        f8161g = tVar;
        t tVar2 = new t("LookaheadPlacement", 1);
        f8162h = tVar2;
        t tVar3 = new t("Measurement", 2);
        f8163i = tVar3;
        t tVar4 = new t("Placement", 3);
        f8164j = tVar4;
        f8165k = new t[]{tVar, tVar2, tVar3, tVar4};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f8165k.clone();
    }
}
