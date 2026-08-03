package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final j f189g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f190h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j[] f191i;

    static {
        j jVar = new j("VIEW_APPEAR", 0);
        f189g = jVar;
        j jVar2 = new j("VIEW_DISAPPEAR", 1);
        f190h = jVar2;
        f191i = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f191i.clone();
    }
}
