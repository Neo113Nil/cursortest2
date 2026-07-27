package J6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f1422n = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public int f1426d;

    /* renamed from: e, reason: collision with root package name */
    public int f1427e;

    /* renamed from: g, reason: collision with root package name */
    public int f1429g;

    /* renamed from: h, reason: collision with root package name */
    public int f1430h;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1425c = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f1428f = new Object[16];
    public final h i = new h(16);

    /* renamed from: j, reason: collision with root package name */
    public final h f1431j = new h(8);

    /* renamed from: k, reason: collision with root package name */
    public final K2.n f1432k = new K2.n(new D5.a(3), new g(0));

    /* renamed from: l, reason: collision with root package name */
    public final K2.n f1433l = new K2.n(new D5.a(4), new g(1));

    /* renamed from: m, reason: collision with root package name */
    public Object[] f1434m = new Object[16];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1423a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1424b = true;

    public final void a(Object obj) {
        int i = this.f1430h;
        Object[] objArr = this.f1428f;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f1428f = objArr2;
        }
        Object[] objArr3 = this.f1428f;
        int i4 = this.f1430h;
        this.f1430h = i4 + 1;
        objArr3[i4] = obj;
    }

    public final int b() {
        int i = this.f1427e;
        int[] iArr = this.f1425c;
        if (i == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f1425c = iArr2;
        }
        int i4 = this.f1427e;
        this.f1427e = i4 + 1;
        return i4;
    }

    public final Object c(Class cls) {
        Object[] objArr = this.f1428f;
        int i = this.f1429g;
        this.f1429g = i + 1;
        return cls.cast(objArr[i]);
    }

    public final Object d(i iVar, Supplier supplier) {
        int i = iVar.f1421u;
        Object[] objArr = this.f1434m;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f1434m = objArr2;
        }
        Object[] objArr3 = this.f1434m;
        int i4 = iVar.f1421u;
        Object obj = objArr3[i4];
        if (obj != null) {
            return obj;
        }
        Object obj2 = supplier.get();
        this.f1434m[i4] = obj2;
        return obj2;
    }

    public final int e() {
        int[] iArr = this.f1425c;
        int i = this.f1426d;
        this.f1426d = i + 1;
        return iArr[i];
    }
}
