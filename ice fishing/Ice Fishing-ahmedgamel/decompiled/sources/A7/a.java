package A7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f215n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f216u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f217v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f218w;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f215n = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f216u = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f217v = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f218w = aVarArr;
        X2.a.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f218w.clone();
    }
}
