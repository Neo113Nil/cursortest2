package V7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: n, reason: collision with root package name */
    public static final b f3334n;

    /* renamed from: u, reason: collision with root package name */
    public static final b f3335u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f3336v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f3337w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f3338x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b[] f3339y;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f3334n = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f3335u = bVar2;
        b bVar3 = new b("PARKING", 2);
        f3336v = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f3337w = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f3338x = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f3339y = bVarArr;
        W2.e.d(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3339y.clone();
    }
}
