package T7;

import S7.AbstractC0406u;
import S7.AbstractC0410y;
import S7.C;
import S7.C0393g;
import S7.F;
import S7.H;
import S7.l0;
import S7.t0;
import X7.o;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Wv;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class e extends AbstractC0406u implements C {

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3215v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f3216w;

    /* renamed from: x, reason: collision with root package name */
    public final e f3217x;

    public e(Handler handler, boolean z6) {
        this.f3215v = handler;
        this.f3216w = z6;
        this.f3217x = z6 ? this : new e(handler, true);
    }

    public final void A(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        AbstractC0410y.d(interfaceC5245i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        F.f3000c.p(interfaceC5245i, runnable);
    }

    @Override // S7.C
    public final H b(long j6, final t0 t0Var, InterfaceC5245i interfaceC5245i) {
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f3215v.postDelayed(t0Var, j6)) {
            return new H() { // from class: T7.c
                @Override // S7.H
                public final void b() {
                    e.this.f3215v.removeCallbacks(t0Var);
                }
            };
        }
        A(interfaceC5245i, t0Var);
        return l0.f3059n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f3215v == this.f3215v && eVar.f3216w == this.f3216w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3215v) ^ (this.f3216w ? 1231 : 1237);
    }

    @Override // S7.C
    public final void k(long j6, C0393g c0393g) {
        LD ld = new LD(25, c0393g, this);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f3215v.postDelayed(ld, j6)) {
            c0393g.t(new d(0, this, ld));
        } else {
            A(c0393g.f3047x, ld);
        }
    }

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        if (this.f3215v.post(runnable)) {
            return;
        }
        A(interfaceC5245i, runnable);
    }

    @Override // S7.AbstractC0406u
    public final String toString() {
        e eVar;
        String str;
        Z7.e eVar2 = F.f2998a;
        e eVar3 = o.f3811a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f3217x;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f3215v.toString();
        return this.f3216w ? Wv.g(handler, ".immediate") : handler;
    }

    @Override // S7.AbstractC0406u
    public final boolean z() {
        return (this.f3216w && h.a(Looper.myLooper(), this.f3215v.getLooper())) ? false : true;
    }
}
