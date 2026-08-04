package com.gamericefishpro.space.z4;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b0 {
    public static final Object i = new Object();
    public final Object a = new Object();
    public final com.gamericefishpro.space.p.f b = new com.gamericefishpro.space.p.f();
    public volatile Object c;
    public volatile Object d;
    public int e;
    public boolean f;
    public boolean g;
    public final z h;

    public b0() {
        Object obj = i;
        this.d = obj;
        this.h = new z(this);
        this.c = obj;
        this.e = -1;
    }

    public final void a(a0 a0Var) {
        a0Var.getClass();
    }

    public final void b(Object obj) {
        com.gamericefishpro.space.o.b.M().c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(com.gamericefishpro.space.t0.y0.g("Cannot invoke ", "setValue", " on a background thread"));
        }
        this.e++;
        this.c = obj;
        if (this.f) {
            this.g = true;
            return;
        }
        this.f = true;
        do {
            this.g = false;
            com.gamericefishpro.space.p.f fVar = this.b;
            fVar.getClass();
            com.gamericefishpro.space.p.d dVar = new com.gamericefishpro.space.p.d(fVar);
            fVar.i.put(dVar, Boolean.FALSE);
            while (dVar.hasNext()) {
                a((a0) ((Map.Entry) dVar.next()).getValue());
                if (this.g) {
                    break;
                }
            }
        } while (this.g);
        this.f = false;
    }
}
