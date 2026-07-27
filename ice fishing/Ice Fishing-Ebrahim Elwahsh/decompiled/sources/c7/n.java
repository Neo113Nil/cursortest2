package c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final n f5726n;

    /* renamed from: u, reason: collision with root package name */
    public static final n f5727u;

    /* renamed from: v, reason: collision with root package name */
    public static final n f5728v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f5729w;

    /* renamed from: x, reason: collision with root package name */
    public static final n f5730x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ n[] f5731y;

    static {
        n nVar = new n("COUNTER", 0);
        f5726n = nVar;
        n nVar2 = new n("UP_DOWN_COUNTER", 1);
        f5727u = nVar2;
        n nVar3 = new n("HISTOGRAM", 2);
        f5728v = nVar3;
        n nVar4 = new n("OBSERVABLE_COUNTER", 3);
        n nVar5 = new n("OBSERVABLE_UP_DOWN_COUNTER", 4);
        n nVar6 = new n("OBSERVABLE_GAUGE", 5);
        f5729w = nVar6;
        n nVar7 = new n("GAUGE", 6);
        f5730x = nVar7;
        f5731y = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f5731y.clone();
    }
}
