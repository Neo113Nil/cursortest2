package X7;

import S7.A;
import S7.AbstractC0406u;
import S7.C;
import S7.C0393g;
import S7.H;
import S7.t0;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class i extends AbstractC0406u implements C {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3793A = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC0406u f3794v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3795w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C f3796x;

    /* renamed from: y, reason: collision with root package name */
    public final l f3797y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3798z;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0406u abstractC0406u, int i) {
        this.f3794v = abstractC0406u;
        this.f3795w = i;
        C c9 = abstractC0406u instanceof C ? (C) abstractC0406u : null;
        this.f3796x = c9 == null ? A.f2994a : c9;
        this.f3797y = new l();
        this.f3798z = new Object();
    }

    public final Runnable B() {
        while (true) {
            Runnable runnable = (Runnable) this.f3797y.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3798z) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3793A;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3797y.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean C() {
        synchronized (this.f3798z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3793A;
            if (atomicIntegerFieldUpdater.get(this) >= this.f3795w) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // S7.C
    public final H b(long j6, t0 t0Var, InterfaceC5245i interfaceC5245i) {
        return this.f3796x.b(j6, t0Var, interfaceC5245i);
    }

    @Override // S7.C
    public final void k(long j6, C0393g c0393g) {
        this.f3796x.k(j6, c0393g);
    }

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        Runnable B3;
        this.f3797y.a(runnable);
        if (f3793A.get(this) >= this.f3795w || !C() || (B3 = B()) == null) {
            return;
        }
        this.f3794v.p(this, new LD(this, B3, 27, false));
    }

    @Override // S7.AbstractC0406u
    public final void q(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        Runnable B3;
        this.f3797y.a(runnable);
        if (f3793A.get(this) >= this.f3795w || !C() || (B3 = B()) == null) {
            return;
        }
        this.f3794v.q(this, new LD(this, B3, 27, false));
    }
}
