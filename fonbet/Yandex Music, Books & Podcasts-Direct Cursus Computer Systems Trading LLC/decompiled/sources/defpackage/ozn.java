package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ozn {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final n3m h;
    public final jtc i;
    public int j;
    public long k;

    public ozn(n3m n3mVar, bpp bppVar, jtc jtcVar) {
        double d = bppVar.d;
        double d2 = bppVar.e;
        this.a = d;
        this.b = d2;
        this.c = bppVar.f * 1000;
        this.h = n3mVar;
        this.i = jtcVar;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int min = size == this.e ? Math.min(100, i + currentTimeMillis) : Math.max(0, i - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(rb2 rb2Var, i8s i8sVar) {
        String str = "Sending report through Google DataTransport: " + rb2Var.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.P0(new bd2(null, rb2Var.a, lsm.c, null), new ps7(this, i8sVar, SystemClock.elapsedRealtime() - this.d < 2000, rb2Var, 2));
    }
}
