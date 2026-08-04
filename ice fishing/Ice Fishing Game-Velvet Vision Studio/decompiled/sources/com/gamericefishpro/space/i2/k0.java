package com.gamericefishpro.space.i2;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ l0 d;

    public k0(l0 l0Var) {
        this.d = l0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.v.removeCallbacks(this);
        l0.T(this.d);
        l0 l0Var = this.d;
        synchronized (l0Var.w) {
            if (l0Var.C) {
                l0Var.C = false;
                ArrayList arrayList = l0Var.z;
                l0Var.z = l0Var.A;
                l0Var.A = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0.T(this.d);
        l0 l0Var = this.d;
        synchronized (l0Var.w) {
            try {
                if (l0Var.z.isEmpty()) {
                    l0Var.i.removeFrameCallback(this);
                    l0Var.C = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
