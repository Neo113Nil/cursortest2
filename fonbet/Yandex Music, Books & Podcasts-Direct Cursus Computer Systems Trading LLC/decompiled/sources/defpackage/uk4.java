package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class uk4 {
    public final ch2 a;
    public final azs b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public uk4(int i, ch2 ch2Var, azs azsVar) {
        int i2 = ch2Var.d;
        this.a = ch2Var;
        int a = ch2Var.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        vq1.v(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = ch2Var.b * 1000000;
        long j2 = ch2Var.c;
        int i4 = dvt.a;
        this.e = dvt.g0(i2, j, j2, RoundingMode.DOWN);
        this.b = azsVar;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[RemoteCameraConfig.Mic.BUFFER_SIZE];
        this.n = new int[RemoteCameraConfig.Mic.BUFFER_SIZE];
        this.f = i2;
    }

    public final iap a(int i) {
        return new iap(((this.e * 1) / this.f) * this.n[i], this.m[i]);
    }

    public final eap b(long j) {
        if (this.k == 0) {
            iap iapVar = new iap(0L, this.l);
            return new eap(iapVar, iapVar);
        }
        int i = (int) (j / ((this.e * 1) / this.f));
        int d = dvt.d(this.n, i, true, true);
        if (this.n[d] == i) {
            iap a = a(d);
            return new eap(a, a);
        }
        iap a2 = a(d);
        int i2 = d + 1;
        return i2 < this.m.length ? new eap(a2, a(i2)) : new eap(a2, a2);
    }
}
