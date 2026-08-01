package X7;

import S7.A;
import S7.AbstractC0402u;
import S7.C;
import S7.C0389g;
import S7.H;
import S7.t0;
import com.google.android.gms.internal.ads.LD;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class i extends AbstractC0402u implements C {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3838A = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC0402u f3839v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3840w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C f3841x;

    /* renamed from: y, reason: collision with root package name */
    public final l f3842y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3843z;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0402u abstractC0402u, int i) {
        this.f3839v = abstractC0402u;
        this.f3840w = i;
        C c9 = abstractC0402u instanceof C ? (C) abstractC0402u : null;
        this.f3841x = c9 == null ? A.f2911a : c9;
        this.f3842y = new l();
        this.f3843z = new Object();
    }

    public final Runnable B() {
        while (true) {
            Runnable runnable = (Runnable) this.f3842y.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3843z) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3838A;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3842y.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean C() {
        synchronized (this.f3843z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3838A;
            if (atomicIntegerFieldUpdater.get(this) >= this.f3840w) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // S7.C
    public final H b(long j6, t0 t0Var, InterfaceC5272i interfaceC5272i) {
        return this.f3841x.b(j6, t0Var, interfaceC5272i);
    }

    @Override // S7.C
    public final void k(long j6, C0389g c0389g) {
        this.f3841x.k(j6, c0389g);
    }

    @Override // S7.AbstractC0402u
    public final void p(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        Runnable B9;
        this.f3842y.a(runnable);
        if (f3838A.get(this) >= this.f3840w || !C() || (B9 = B()) == null) {
            return;
        }
        this.f3839v.p(this, new LD(this, B9, 27, false));
    }

    @Override // S7.AbstractC0402u
    public final void q(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        Runnable B9;
        this.f3842y.a(runnable);
        if (f3838A.get(this) >= this.f3840w || !C() || (B9 = B()) == null) {
            return;
        }
        this.f3839v.q(this, new LD(this, B9, 27, false));
    }
}
