package Z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: n, reason: collision with root package name */
    public static final b f4190n;

    /* renamed from: u, reason: collision with root package name */
    public static final b f4191u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f4192v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f4193w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f4194x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b[] f4195y;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f4190n = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f4191u = bVar2;
        b bVar3 = new b("PARKING", 2);
        f4192v = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f4193w = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f4194x = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f4195y = bVarArr;
        com.bumptech.glide.e.b(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4195y.clone();
    }
}
