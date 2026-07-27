package U7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f3219n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f3220u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f3221v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f3222w;

    static {
        a aVar = new a("SUSPEND", 0);
        f3219n = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f3220u = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f3221v = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f3222w = aVarArr;
        com.bumptech.glide.e.b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3222w.clone();
    }
}
