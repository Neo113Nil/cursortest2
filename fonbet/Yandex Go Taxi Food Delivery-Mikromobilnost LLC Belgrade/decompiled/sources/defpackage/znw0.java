package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.h;
import androidx.camera.core.i;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class znw0 {
    public static final Range q = lru0.a;
    public final Object a = new Object();
    public final Size b;
    public final q8n c;
    public final Range d;
    public final br7 e;
    public final boolean f;
    public final int g;
    public final gl7 h;
    public final b i;
    public final gl7 j;
    public final b k;
    public final b l;
    public final iiv m;
    public w84 n;
    public ynw0 o;
    public Executor p;

    public znw0(Size size, br7 br7Var, boolean z, q8n q8nVar, int i, Range range, bnw0 bnw0Var) {
        this.b = size;
        this.e = br7Var;
        this.f = z;
        d6z.m("SurfaceRequest's DynamicRange must always be fully specified.", q8nVar.b());
        this.c = q8nVar;
        this.g = i;
        this.d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            atomicReference.set(bVar);
            bVar.a = str.concat("-cancellation");
        } catch (Exception e) {
            gl7Var.a(e);
        }
        b bVar2 = (b) atomicReference.get();
        bVar2.getClass();
        this.l = bVar2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        b bVar3 = new b();
        bVar3.c = new hsj0();
        gl7 gl7Var2 = new gl7(bVar3);
        bVar3.b = gl7Var2;
        bVar3.a = x4e.class;
        try {
            atomicReference2.set(bVar3);
            bVar3.a = str.concat("-status");
        } catch (Exception e2) {
            gl7Var2.a(e2);
        }
        this.j = gl7Var2;
        ni91.a(gl7Var2, new h(0, bVar2, gl7Var), geb1.b());
        b bVar4 = (b) atomicReference2.get();
        bVar4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        b bVar5 = new b();
        bVar5.c = new hsj0();
        gl7 gl7Var3 = new gl7(bVar5);
        bVar5.b = gl7Var3;
        bVar5.a = x4e.class;
        try {
            atomicReference3.set(bVar5);
            bVar5.a = str.concat("-Surface");
        } catch (Exception e3) {
            gl7Var3.a(e3);
        }
        this.h = gl7Var3;
        b bVar6 = (b) atomicReference3.get();
        bVar6.getClass();
        this.i = bVar6;
        iiv iivVar = new iiv(this, size);
        this.m = iivVar;
        euy g = ni91.g(iivVar.e);
        ni91.a(gl7Var3, new i(g, bVar4, str), geb1.b());
        g.c(new mlh(this, 1), geb1.b());
        zkj b = geb1.b();
        AtomicReference atomicReference4 = new AtomicReference(null);
        ni91.a(jx81.r(new r3k0(15, this, atomicReference4)), new jhu0(bnw0Var), b);
        b bVar7 = (b) atomicReference4.get();
        bVar7.getClass();
        this.k = bVar7;
    }

    public final boolean a() {
        return this.h.b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final e9e e9eVar) {
        if (!surface.isValid()) {
            final int i = 0;
            executor.execute(new Runnable() { // from class: vnw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    e9e e9eVar2 = e9eVar;
                    switch (i2) {
                        case 0:
                            e9eVar2.accept(new v84(2, surface2));
                            break;
                        case 1:
                            e9eVar2.accept(new v84(3, surface2));
                            break;
                        default:
                            e9eVar2.accept(new v84(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        if (!this.i.b(surface)) {
            gl7 gl7Var = this.h;
            if (!gl7Var.isCancelled()) {
                d6z.y(null, gl7Var.b.isDone());
                try {
                    gl7Var.get();
                    executor.execute(new Runnable() { // from class: vnw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            Surface surface2 = surface;
                            e9e e9eVar2 = e9eVar;
                            switch (i22) {
                                case 0:
                                    e9eVar2.accept(new v84(2, surface2));
                                    break;
                                case 1:
                                    e9eVar2.accept(new v84(3, surface2));
                                    break;
                                default:
                                    e9eVar2.accept(new v84(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: vnw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i3;
                            Surface surface2 = surface;
                            e9e e9eVar2 = e9eVar;
                            switch (i22) {
                                case 0:
                                    e9eVar2.accept(new v84(2, surface2));
                                    break;
                                case 1:
                                    e9eVar2.accept(new v84(3, surface2));
                                    break;
                                default:
                                    e9eVar2.accept(new v84(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        ni91.a(this.j, new h(i2, e9eVar, surface), executor);
    }

    public final void c(Executor executor, ynw0 ynw0Var) {
        w84 w84Var;
        synchronized (this.a) {
            this.o = ynw0Var;
            this.p = executor;
            w84Var = this.n;
        }
        if (w84Var != null) {
            executor.execute(new tpt0(27, ynw0Var, w84Var));
        }
    }

    public final boolean d() {
        return this.i.d(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
