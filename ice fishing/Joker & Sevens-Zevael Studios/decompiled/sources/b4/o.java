package b4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements h4.f, h4.e {

    /* renamed from: o, reason: collision with root package name */
    public static final TreeMap f1003o = new TreeMap();

    /* renamed from: g, reason: collision with root package name */
    public final int f1004g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f1005h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f1006i;

    /* renamed from: j, reason: collision with root package name */
    public final double[] f1007j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f1008k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[][] f1009l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f1010m;

    /* renamed from: n, reason: collision with root package name */
    public int f1011n;

    public o(int i10) {
        this.f1004g = i10;
        int i11 = i10 + 1;
        this.f1010m = new int[i11];
        this.f1006i = new long[i11];
        this.f1007j = new double[i11];
        this.f1008k = new String[i11];
        this.f1009l = new byte[i11][];
    }

    public static final o a(String str, int i10) {
        TreeMap treeMap = f1003o;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry == null) {
                o oVar = new o(i10);
                oVar.f1005h = str;
                oVar.f1011n = i10;
                return oVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            o oVar2 = (o) ceilingEntry.getValue();
            oVar2.f1005h = str;
            oVar2.f1011n = i10;
            return oVar2;
        }
    }

    @Override // h4.f
    public final void b(h4.e eVar) {
        int i10 = this.f1011n;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f1010m[i11];
            if (i12 == 1) {
                eVar.h(i11);
            } else if (i12 == 2) {
                eVar.n(i11, this.f1006i[i11]);
            } else if (i12 == 3) {
                eVar.e(this.f1007j[i11], i11);
            } else if (i12 == 4) {
                String str = this.f1008k[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.c(str, i11);
            } else if (i12 == 5) {
                byte[] bArr = this.f1009l[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.p(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // h4.e
    public final void c(String str, int i10) {
        pc.j.e(str, "value");
        this.f1010m[i10] = 4;
        this.f1008k[i10] = str;
    }

    @Override // h4.f
    public final String d() {
        String str = this.f1005h;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // h4.e
    public final void e(double d10, int i10) {
        this.f1010m[i10] = 3;
        this.f1007j[i10] = d10;
    }

    public final void f() {
        TreeMap treeMap = f1003o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1004g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                pc.j.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // h4.e
    public final void h(int i10) {
        this.f1010m[i10] = 1;
    }

    @Override // h4.e
    public final void n(int i10, long j3) {
        this.f1010m[i10] = 2;
        this.f1006i[i10] = j3;
    }

    @Override // h4.e
    public final void p(int i10, byte[] bArr) {
        this.f1010m[i10] = 5;
        this.f1009l[i10] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
