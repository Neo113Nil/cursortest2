package u0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import y0.InterfaceC5198c;
import y0.InterfaceC5199d;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5060i implements InterfaceC5199d, InterfaceC5198c {

    /* renamed from: B, reason: collision with root package name */
    public static final TreeMap f40991B = new TreeMap();

    /* renamed from: A, reason: collision with root package name */
    public int f40992A;

    /* renamed from: n, reason: collision with root package name */
    public final int f40993n;

    /* renamed from: u, reason: collision with root package name */
    public volatile String f40994u;

    /* renamed from: v, reason: collision with root package name */
    public final long[] f40995v;

    /* renamed from: w, reason: collision with root package name */
    public final double[] f40996w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f40997x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[][] f40998y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f40999z;

    public C5060i(int i) {
        this.f40993n = i;
        int i4 = i + 1;
        this.f40999z = new int[i4];
        this.f40995v = new long[i4];
        this.f40996w = new double[i4];
        this.f40997x = new String[i4];
        this.f40998y = new byte[i4][];
    }

    public static final C5060i a(int i, String str) {
        TreeMap treeMap = f40991B;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                C5060i c5060i = new C5060i(i);
                c5060i.f40994u = str;
                c5060i.f40992A = i;
                return c5060i;
            }
            treeMap.remove(ceilingEntry.getKey());
            C5060i c5060i2 = (C5060i) ceilingEntry.getValue();
            c5060i2.f40994u = str;
            c5060i2.f40992A = i;
            return c5060i2;
        }
    }

    @Override // y0.InterfaceC5199d
    public final String b() {
        String str = this.f40994u;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // y0.InterfaceC5198c
    public final void c(int i, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f40999z[i] = 4;
        this.f40997x[i] = value;
    }

    @Override // y0.InterfaceC5198c
    public final void e(int i, double d9) {
        this.f40999z[i] = 3;
        this.f40996w[i] = d9;
    }

    @Override // y0.InterfaceC5198c
    public final void g(int i, long j6) {
        this.f40999z[i] = 2;
        this.f40995v[i] = j6;
    }

    @Override // y0.InterfaceC5198c
    public final void h(int i, byte[] bArr) {
        this.f40999z[i] = 5;
        this.f40998y[i] = bArr;
    }

    @Override // y0.InterfaceC5199d
    public final void i(InterfaceC5198c interfaceC5198c) {
        int i = this.f40992A;
        if (1 > i) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i6 = this.f40999z[i4];
            if (i6 == 1) {
                interfaceC5198c.o(i4);
            } else if (i6 == 2) {
                interfaceC5198c.g(i4, this.f40995v[i4]);
            } else if (i6 == 3) {
                interfaceC5198c.e(i4, this.f40996w[i4]);
            } else if (i6 == 4) {
                String str = this.f40997x[i4];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC5198c.c(i4, str);
            } else if (i6 == 5) {
                byte[] bArr = this.f40998y[i4];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC5198c.h(i4, bArr);
            }
            if (i4 == i) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void j() {
        TreeMap treeMap = f40991B;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f40993n), this);
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

    @Override // y0.InterfaceC5198c
    public final void o(int i) {
        this.f40999z[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
