package A7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f58n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f59u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f60v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f61w;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f58n = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f59u = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f60v = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f61w = aVarArr;
        com.bumptech.glide.e.b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f61w.clone();
    }
}
