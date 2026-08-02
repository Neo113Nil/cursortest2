package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class t0x implements tqj, zpj, spj {
    public final Object a = new Object();
    public final int b;
    public final onx c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public t0x(int i, onx onxVar) {
        this.b = i;
        this.c = onxVar;
    }

    public final void a() {
        int i = this.d;
        int i2 = this.e;
        int i3 = i + i2 + this.f;
        int i4 = this.b;
        if (i3 == i4) {
            Exception exc = this.g;
            onx onxVar = this.c;
            if (exc == null) {
                if (this.h) {
                    onxVar.r();
                    return;
                } else {
                    onxVar.q(null);
                    return;
                }
            }
            onxVar.p(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.zpj
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    @Override // defpackage.spj
    public final void e() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    @Override // defpackage.tqj
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
