package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    public final Runnable i;

    public j(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.i;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a0.m(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        return y0.i(sb, this.e ? "Blocking" : "Non-blocking", ']');
    }
}
