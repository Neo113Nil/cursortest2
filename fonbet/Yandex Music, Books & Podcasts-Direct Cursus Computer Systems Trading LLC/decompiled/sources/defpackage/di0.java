package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* loaded from: classes.dex */
public final class di0 implements smm, eun, Runnable, Choreographer.FrameCallback {
    public static long g;
    public final View a;
    public boolean c;
    public boolean e;
    public long f;
    public final eqi b = new eqi(new rmm[16]);
    public final Choreographer d = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public di0(View view) {
        float f;
        this.a = view;
        if (g == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            g = (long) (1000000000 / f);
        }
    }

    @Override // defpackage.eun
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.smm
    public final void c(rmm rmmVar) {
        this.b.d(rmmVar);
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.e) {
            this.f = j;
            this.a.post(this);
        }
    }

    @Override // defpackage.eun
    public final void e() {
        this.e = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        eqi eqiVar = this.b;
        if (eqiVar.c == 0 || !this.c || !this.e || this.a.getWindowVisibility() != 0) {
            this.c = false;
            return;
        }
        ci0 ci0Var = new ci0(this.f + g);
        boolean z = false;
        while (eqiVar.c != 0 && !z) {
            if (Math.max(0L, ci0Var.a - System.nanoTime()) <= 0 || ((rmm) eqiVar.a[0]).b(ci0Var)) {
                z = true;
            } else {
                eqiVar.m(0);
            }
        }
        if (z) {
            this.d.postFrameCallback(this);
        } else {
            this.c = false;
        }
    }

    @Override // defpackage.eun
    public final void d() {
    }
}
