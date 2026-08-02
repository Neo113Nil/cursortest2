package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import ru.yandex.video.m3.netperf.NetPerfEvent;

/* loaded from: classes6.dex */
public final class ryi {
    public final awc a;
    public final ypb b;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public String c = "";
    public String j = "";

    public ryi(awc awcVar, ypb ypbVar) {
        this.a = awcVar;
        this.b = ypbVar;
    }

    public final void a() {
        if (this.o) {
            return;
        }
        this.o = true;
        String str = this.c;
        String str2 = this.j;
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        long j6 = this.i;
        long j7 = this.k;
        long j8 = this.l;
        long j9 = this.m;
        ((ConcurrentLinkedQueue) this.a.a).add(new NetPerfEvent(str, str2, j, j2, j3, j4, j5, j6, j7, j8, j9, this.n, j9 - j));
    }
}
