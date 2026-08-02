package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class qzt0 implements kb10, lf81 {
    public long a;
    public long b;
    public boolean c;
    public final Object w;
    public Object x;

    public qzt0(Looper looper) {
        w3c w3cVar = w3c.a;
        this.a = 500L;
        this.w = w3cVar;
        this.b = -1L;
        this.x = new Handler(looper);
    }

    @Override // defpackage.lf81
    public long a() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((xb71) this.w).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((kv71) this.x).a == 1.0f ? rf71.g(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    public void c(long j) {
        this.a = j;
        if (this.c) {
            ((xb71) this.w).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public void d(long j) {
        this.a = j;
        if (this.c) {
            ((o2x0) ((y3c) this.w)).getClass();
            this.b = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.lf81
    public void e(kv71 kv71Var) {
        if (this.c) {
            c(a());
        }
        this.x = kv71Var;
    }

    public void f() {
        if (this.c) {
            return;
        }
        ((o2x0) ((y3c) this.w)).getClass();
        this.b = SystemClock.elapsedRealtime();
        this.c = true;
    }

    @Override // defpackage.kb10
    public long g() {
        long j = this.a;
        if (!this.c) {
            return j;
        }
        ((o2x0) ((y3c) this.w)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        return (((lxc0) this.x).a == 1.0f ? tw21.W(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    @Override // defpackage.lf81
    public kv71 getPlaybackParameters() {
        return (kv71) this.x;
    }

    @Override // defpackage.kb10
    public void setPlaybackParameters(lxc0 lxc0Var) {
        if (this.c) {
            d(g());
        }
        this.x = lxc0Var;
    }

    @Override // defpackage.kb10
    /* renamed from: getPlaybackParameters, reason: collision with other method in class */
    public lxc0 mo496getPlaybackParameters() {
        return (lxc0) this.x;
    }

    public qzt0(xb71 xb71Var) {
        this.w = xb71Var;
        this.x = kv71.w;
    }

    public qzt0(y3c y3cVar) {
        this.w = y3cVar;
        this.x = lxc0.d;
    }
}
