package com.gamericefishpro.space.j5;

import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.tb.s;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public final y3 a;
    public final g0 b;
    public final g0 c;
    public boolean d;
    public s e;

    public d(y3 initialInfo, boolean z) {
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        this.a = initialInfo;
        g0 g0Var = g0.d;
        this.b = g0Var;
        this.c = g0Var;
        this.d = z;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void e() {
        s sVar = this.e;
        if (sVar != null) {
            Intrinsics.checkNotNullParameter(this, "handler");
            if (((LinkedHashSet) sVar.i).remove(this)) {
                g gVar = (g) sVar.e;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(this, "handler");
                if (equals(gVar.f)) {
                    if (gVar.g == -1) {
                        a();
                    }
                    gVar.f = null;
                    gVar.g = 0;
                    gVar.h = null;
                }
                gVar.d.remove(this);
                gVar.e.remove(this);
                this.e = null;
                gVar.b();
            }
        }
    }

    public final void f(boolean z) {
        g gVar;
        if (this.d == z) {
            return;
        }
        this.d = z;
        s sVar = this.e;
        if (sVar == null || (gVar = (g) sVar.e) == null) {
            return;
        }
        gVar.b();
    }
}
