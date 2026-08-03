package zc;

import android.os.Handler;
import android.os.Looper;
import b0.l0;
import dd.o;
import fc.i;
import java.util.concurrent.CancellationException;
import pc.j;
import yc.a0;
import yc.f0;
import yc.g;
import yc.i0;
import yc.k0;
import yc.o1;
import yc.u;
import yc.w1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends u implements f0 {

    /* renamed from: i, reason: collision with root package name */
    public final Handler f9179i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9180j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9181k;

    /* renamed from: l, reason: collision with root package name */
    public final d f9182l;

    public d(Handler handler, String str, boolean z10) {
        this.f9179i = handler;
        this.f9180j = str;
        this.f9181k = z10;
        this.f9182l = z10 ? this : new d(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f9179i == this.f9179i && dVar.f9181k == this.f9181k;
    }

    @Override // yc.f0
    public final k0 f(long j3, final w1 w1Var, i iVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f9179i.postDelayed(w1Var, j3)) {
            return new k0() { // from class: zc.c
                @Override // yc.k0
                public final void a() {
                    d.this.f9179i.removeCallbacks(w1Var);
                }
            };
        }
        z(iVar, w1Var);
        return o1.f8887g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9179i) ^ (this.f9181k ? 1231 : 1237);
    }

    @Override // yc.f0
    public final void s(long j3, g gVar) {
        dd.i iVar = new dd.i(25, gVar, this, false);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f9179i.postDelayed(iVar, j3)) {
            gVar.s(new l0(27, this, iVar));
        } else {
            z(gVar.f8849k, iVar);
        }
    }

    @Override // yc.u
    public final String toString() {
        d dVar;
        String str;
        fd.e eVar = i0.f8859a;
        d dVar2 = o.f1880a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f9182l;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f9180j;
        if (str2 == null) {
            str2 = this.f9179i.toString();
        }
        return this.f9181k ? a4.d.i(str2, ".immediate") : str2;
    }

    @Override // yc.u
    public final void w(i iVar, Runnable runnable) {
        if (this.f9179i.post(runnable)) {
            return;
        }
        z(iVar, runnable);
    }

    @Override // yc.u
    public final boolean y() {
        return (this.f9181k && j.a(Looper.myLooper(), this.f9179i.getLooper())) ? false : true;
    }

    public final void z(i iVar, Runnable runnable) {
        a0.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        i0.f8861c.w(iVar, runnable);
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
