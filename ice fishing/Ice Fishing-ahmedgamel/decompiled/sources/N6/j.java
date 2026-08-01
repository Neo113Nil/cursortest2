package N6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f1975n = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public int f1979d;

    /* renamed from: e, reason: collision with root package name */
    public int f1980e;

    /* renamed from: g, reason: collision with root package name */
    public int f1982g;

    /* renamed from: h, reason: collision with root package name */
    public int f1983h;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1978c = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f1981f = new Object[16];
    public final h i = new h(16);

    /* renamed from: j, reason: collision with root package name */
    public final h f1984j = new h(8);

    /* renamed from: k, reason: collision with root package name */
    public final L2.n f1985k = new L2.n(new H5.a(3), new g(0));

    /* renamed from: l, reason: collision with root package name */
    public final L2.n f1986l = new L2.n(new H5.a(4), new g(1));

    /* renamed from: m, reason: collision with root package name */
    public Object[] f1987m = new Object[16];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1976a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1977b = true;

    public final void a(Object obj) {
        int i = this.f1983h;
        Object[] objArr = this.f1981f;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f1981f = objArr2;
        }
        Object[] objArr3 = this.f1981f;
        int i6 = this.f1983h;
        this.f1983h = i6 + 1;
        objArr3[i6] = obj;
    }

    public final int b() {
        int i = this.f1980e;
        int[] iArr = this.f1978c;
        if (i == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f1978c = iArr2;
        }
        int i6 = this.f1980e;
        this.f1980e = i6 + 1;
        return i6;
    }

    public final Object c(Class cls) {
        Object[] objArr = this.f1981f;
        int i = this.f1982g;
        this.f1982g = i + 1;
        return cls.cast(objArr[i]);
    }

    public final Object d(i iVar, Supplier supplier) {
        int i = iVar.f1974u;
        Object[] objArr = this.f1987m;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f1987m = objArr2;
        }
        Object[] objArr3 = this.f1987m;
        int i6 = iVar.f1974u;
        Object obj = objArr3[i6];
        if (obj != null) {
            return obj;
        }
        Object obj2 = supplier.get();
        this.f1987m[i6] = obj2;
        return obj2;
    }

    public final int e() {
        int[] iArr = this.f1978c;
        int i = this.f1979d;
        this.f1979d = i + 1;
        return iArr[i];
    }
}
