package com.gamericefishpro.space.r9;

import com.gamericefishpro.space.v8.c0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class h {
    public final o a = new o();

    public final void a(Object obj) {
        this.a.m(obj);
    }

    public final boolean b(Exception exc) {
        o oVar = this.a;
        oVar.getClass();
        c0.h(exc, "Exception must not be null");
        synchronized (oVar.a) {
            try {
                if (oVar.c) {
                    return false;
                }
                oVar.c = true;
                oVar.f = exc;
                oVar.b.f(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        o oVar = this.a;
        synchronized (oVar.a) {
            try {
                if (oVar.c) {
                    return;
                }
                oVar.c = true;
                oVar.e = obj;
                oVar.b.f(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
