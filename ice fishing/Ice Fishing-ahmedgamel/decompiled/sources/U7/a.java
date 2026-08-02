package U7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f3342n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f3343u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f3344v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f3345w;

    static {
        a aVar = new a("SUSPEND", 0);
        f3342n = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f3343u = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f3344v = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f3345w = aVarArr;
        X2.a.h(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3345w.clone();
    }
}
