package defpackage;

import java.util.TreeMap;

/* loaded from: classes.dex */
public final class afo implements xsr, wsr {
    public static final TreeMap h = new TreeMap();
    public volatile String a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public int g;

    public afo(int i) {
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    public final j6e a() {
        String o = o();
        mjm mjmVar = new mjm(18, this);
        j6e j6eVar = new j6e();
        j6eVar.a = o;
        j6eVar.b = new mjm(17, mjmVar);
        return j6eVar;
    }

    @Override // defpackage.xsr
    public final int b() {
        return this.g;
    }

    @Override // defpackage.wsr
    public final void bindBlob(int i, byte[] bArr) {
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // defpackage.wsr
    public final void bindDouble(int i, double d) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    @Override // defpackage.wsr
    public final void bindLong(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    @Override // defpackage.wsr
    public final void bindNull(int i) {
        this.f[i] = 1;
    }

    @Override // defpackage.wsr
    public final void bindString(int i, String str) {
        this.f[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.xsr
    public final String o() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        xq0.q("Required value was null.");
        return null;
    }

    @Override // defpackage.xsr
    public final void z(wsr wsrVar) {
        wsrVar.getClass();
        int i = this.g;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f[i2];
            if (i3 == 1) {
                wsrVar.bindNull(i2);
            } else if (i3 == 2) {
                wsrVar.bindLong(i2, this.b[i2]);
            } else if (i3 == 3) {
                wsrVar.bindDouble(i2, this.c[i2]);
            } else if (i3 == 4) {
                String str = this.d[i2];
                if (str == null) {
                    xq0.x("Required value was null.");
                    return;
                }
                wsrVar.bindString(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.e[i2];
                if (bArr == null) {
                    xq0.x("Required value was null.");
                    return;
                }
                wsrVar.bindBlob(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
