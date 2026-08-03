package fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f2360g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f2361h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f2362i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f2363j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f2364k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f2365l;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f2360g = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f2361h = bVar2;
        b bVar3 = new b("PARKING", 2);
        f2362i = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f2363j = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f2364k = bVar5;
        f2365l = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2365l.clone();
    }
}
