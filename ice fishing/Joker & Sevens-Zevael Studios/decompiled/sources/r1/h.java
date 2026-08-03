package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final h f5956g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f5957h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f5958i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ h[] f5959j;

    static {
        h hVar = new h("Initial", 0);
        f5956g = hVar;
        h hVar2 = new h("Main", 1);
        f5957h = hVar2;
        h hVar3 = new h("Final", 2);
        f5958i = hVar3;
        f5959j = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f5959j.clone();
    }
}
