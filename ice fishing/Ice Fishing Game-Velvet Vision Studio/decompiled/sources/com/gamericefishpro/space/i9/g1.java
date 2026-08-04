package com.gamericefishpro.space.i9;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 implements Runnable {
    public final long d;
    public final long e;
    public final boolean i;
    public final /* synthetic */ j1 v;

    public g1(j1 j1Var, boolean z) {
        Objects.requireNonNull(j1Var);
        this.v = j1Var;
        this.d = System.currentTimeMillis();
        this.e = SystemClock.elapsedRealtime();
        this.i = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.v;
        if (j1Var.d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            j1Var.b(e, false, this.i);
            b();
        }
    }

    public void b() {
    }
}
