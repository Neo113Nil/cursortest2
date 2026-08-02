package N6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f2063n = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public int f2067d;

    /* renamed from: e, reason: collision with root package name */
    public int f2068e;

    /* renamed from: g, reason: collision with root package name */
    public int f2070g;

    /* renamed from: h, reason: collision with root package name */
    public int f2071h;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2066c = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2069f = new Object[16];
    public final h i = new h(16);

    /* renamed from: j, reason: collision with root package name */
    public final h f2072j = new h(8);

    /* renamed from: k, reason: collision with root package name */
    public final N2.o f2073k = new N2.o(new H5.a(3), new g(0));

    /* renamed from: l, reason: collision with root package name */
    public final N2.o f2074l = new N2.o(new H5.a(4), new g(1));

    /* renamed from: m, reason: collision with root package name */
    public Object[] f2075m = new Object[16];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2064a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2065b = true;

    public final void a(Object obj) {
        int i = this.f2071h;
        Object[] objArr = this.f2069f;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f2069f = objArr2;
        }
        Object[] objArr3 = this.f2069f;
        int i4 = this.f2071h;
        this.f2071h = i4 + 1;
        objArr3[i4] = obj;
    }

    public final int b() {
        int i = this.f2068e;
        int[] iArr = this.f2066c;
        if (i == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f2066c = iArr2;
        }
        int i4 = this.f2068e;
        this.f2068e = i4 + 1;
        return i4;
    }

    public final Object c(Class cls) {
        Object[] objArr = this.f2069f;
        int i = this.f2070g;
        this.f2070g = i + 1;
        return cls.cast(objArr[i]);
    }

    public final Object d(i iVar, Supplier supplier) {
        int i = iVar.f2062u;
        Object[] objArr = this.f2075m;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.f2075m = objArr2;
        }
        Object[] objArr3 = this.f2075m;
        int i4 = iVar.f2062u;
        Object obj = objArr3[i4];
        if (obj != null) {
            return obj;
        }
        Object obj2 = supplier.get();
        this.f2075m[i4] = obj2;
        return obj2;
    }

    public final int e() {
        int[] iArr = this.f2066c;
        int i = this.f2067d;
        this.f2067d = i + 1;
        return iArr[i];
    }
}
