package u0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5059i implements y0.d, y0.c {

    /* renamed from: B, reason: collision with root package name */
    public static final TreeMap f41026B = new TreeMap();

    /* renamed from: A, reason: collision with root package name */
    public int f41027A;

    /* renamed from: n, reason: collision with root package name */
    public final int f41028n;

    /* renamed from: u, reason: collision with root package name */
    public volatile String f41029u;

    /* renamed from: v, reason: collision with root package name */
    public final long[] f41030v;

    /* renamed from: w, reason: collision with root package name */
    public final double[] f41031w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f41032x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[][] f41033y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f41034z;

    public C5059i(int i) {
        this.f41028n = i;
        int i6 = i + 1;
        this.f41034z = new int[i6];
        this.f41030v = new long[i6];
        this.f41031w = new double[i6];
        this.f41032x = new String[i6];
        this.f41033y = new byte[i6][];
    }

    public static final C5059i a(int i, String str) {
        TreeMap treeMap = f41026B;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                C5059i c5059i = new C5059i(i);
                c5059i.f41029u = str;
                c5059i.f41027A = i;
                return c5059i;
            }
            treeMap.remove(ceilingEntry.getKey());
            C5059i c5059i2 = (C5059i) ceilingEntry.getValue();
            c5059i2.f41029u = str;
            c5059i2.f41027A = i;
            return c5059i2;
        }
    }

    @Override // y0.d
    public final String b() {
        String str = this.f41029u;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // y0.c
    public final void c(int i, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f41034z[i] = 4;
        this.f41032x[i] = value;
    }

    @Override // y0.c
    public final void e(int i, double d2) {
        this.f41034z[i] = 3;
        this.f41031w[i] = d2;
    }

    @Override // y0.c
    public final void g(int i, long j6) {
        this.f41034z[i] = 2;
        this.f41030v[i] = j6;
    }

    @Override // y0.c
    public final void h(int i, byte[] bArr) {
        this.f41034z[i] = 5;
        this.f41033y[i] = bArr;
    }

    @Override // y0.d
    public final void i(y0.c cVar) {
        int i = this.f41027A;
        if (1 > i) {
            return;
        }
        int i6 = 1;
        while (true) {
            int i9 = this.f41034z[i6];
            if (i9 == 1) {
                cVar.o(i6);
            } else if (i9 == 2) {
                cVar.g(i6, this.f41030v[i6]);
            } else if (i9 == 3) {
                cVar.e(i6, this.f41031w[i6]);
            } else if (i9 == 4) {
                String str = this.f41032x[i6];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.c(i6, str);
            } else if (i9 == 5) {
                byte[] bArr = this.f41033y[i6];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.h(i6, bArr);
            }
            if (i6 == i) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void j() {
        TreeMap treeMap = f41026B;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f41028n), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.h.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // y0.c
    public final void o(int i) {
        this.f41034z[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
