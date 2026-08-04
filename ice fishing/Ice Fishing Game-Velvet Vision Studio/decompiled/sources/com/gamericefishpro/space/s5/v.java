package com.gamericefishpro.space.s5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements com.gamericefishpro.space.d6.h, com.gamericefishpro.space.d6.g {
    public static final TreeMap B = new TreeMap();
    public int A;
    public final int d;
    public volatile String e;
    public final long[] i;
    public final double[] v;
    public final String[] w;
    public final byte[][] y;
    public final int[] z;

    public v(int i) {
        this.d = i;
        int i2 = i + 1;
        this.z = new int[i2];
        this.i = new long[i2];
        this.v = new double[i2];
        this.w = new String[i2];
        this.y = new byte[i2][];
    }

    public static final v b(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = B;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                Unit unit = Unit.a;
                v vVar = new v(i);
                Intrinsics.checkNotNullParameter(query, "query");
                vVar.e = query;
                vVar.A = i;
                return vVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            v vVar2 = (v) entryCeilingEntry.getValue();
            vVar2.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            vVar2.e = query;
            vVar2.A = i;
            return vVar2;
        }
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void G(int i, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.z[i] = 5;
        this.y[i] = value;
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void a(int i, long j) {
        this.z[i] = 2;
        this.i[i] = j;
    }

    public final void c() {
        TreeMap treeMap = B;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
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
            Unit unit = Unit.a;
        }
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void i(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.z[i] = 4;
        this.w[i] = value;
    }

    @Override // com.gamericefishpro.space.d6.h
    public final void j(com.gamericefishpro.space.d6.g statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i = this.A;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.z[i2];
            if (i3 == 1) {
                statement.p(i2);
            } else if (i3 == 2) {
                statement.a(i2, this.i[i2]);
            } else if (i3 == 3) {
                statement.k(this.v[i2], i2);
            } else if (i3 == 4) {
                String str = this.w[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.i(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.y[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.G(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void k(double d, int i) {
        this.z[i] = 3;
        this.v[i] = d;
    }

    @Override // com.gamericefishpro.space.d6.h
    public final String l() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.gamericefishpro.space.d6.g
    public final void p(int i) {
        this.z[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
