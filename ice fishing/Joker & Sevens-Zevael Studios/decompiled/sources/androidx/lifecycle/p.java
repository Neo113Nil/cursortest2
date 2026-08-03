package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final p f697g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f698h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f699i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f700j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f701k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p[] f702l;

    static {
        p pVar = new p("DESTROYED", 0);
        f697g = pVar;
        p pVar2 = new p("INITIALIZED", 1);
        f698h = pVar2;
        p pVar3 = new p("CREATED", 2);
        f699i = pVar3;
        p pVar4 = new p("STARTED", 3);
        f700j = pVar4;
        p pVar5 = new p("RESUMED", 4);
        f701k = pVar5;
        f702l = new p[]{pVar, pVar2, pVar3, pVar4, pVar5};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f702l.clone();
    }
}
