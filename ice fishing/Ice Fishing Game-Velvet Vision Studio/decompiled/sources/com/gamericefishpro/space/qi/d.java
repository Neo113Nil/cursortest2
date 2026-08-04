package com.gamericefishpro.space.qi;

import android.os.Handler;
import android.os.Looper;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.f0;
import com.gamericefishpro.space.pi.h;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.m0;
import com.gamericefishpro.space.pi.p1;
import com.gamericefishpro.space.pi.t;
import com.gamericefishpro.space.pi.z1;
import com.gamericefishpro.space.ui.m;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends t implements f0 {
    public final Handler i;
    public final String v;
    public final boolean w;
    public final d y;

    public d(Handler handler, String str, boolean z) {
        this.i = handler;
        this.v = str;
        this.w = z;
        this.y = z ? this : new d(handler, str, true);
    }

    @Override // com.gamericefishpro.space.pi.f0
    public final void C(long j, h hVar) {
        com.gamericefishpro.space.bb.h hVar2 = new com.gamericefishpro.space.bb.h(9, hVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.i.postDelayed(hVar2, j)) {
            hVar.u(new q0(21, this, hVar2));
        } else {
            T(hVar.w, hVar2);
        }
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.i.post(runnable)) {
            return;
        }
        T(coroutineContext, runnable);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final boolean R(CoroutineContext coroutineContext) {
        return (this.w && Intrinsics.a(Looper.myLooper(), this.i.getLooper())) ? false : true;
    }

    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        a0.g(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        com.gamericefishpro.space.wi.e eVar = k0.a;
        com.gamericefishpro.space.wi.d.i.P(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.i == this.i && dVar.w == this.w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.i) ^ (this.w ? 1231 : 1237);
    }

    @Override // com.gamericefishpro.space.pi.f0
    public final m0 l(long j, final z1 z1Var, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.i.postDelayed(z1Var, j)) {
            return new m0() { // from class: com.gamericefishpro.space.qi.c
                @Override // com.gamericefishpro.space.pi.m0
                public final void a() {
                    this.d.i.removeCallbacks(z1Var);
                }
            };
        }
        T(coroutineContext, z1Var);
        return p1.d;
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        d dVar;
        String str;
        com.gamericefishpro.space.wi.e eVar = k0.a;
        d dVar2 = m.a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.y;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.v;
        if (string == null) {
            string = this.i.toString();
        }
        return this.w ? com.gamericefishpro.space.m5.a.h(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
