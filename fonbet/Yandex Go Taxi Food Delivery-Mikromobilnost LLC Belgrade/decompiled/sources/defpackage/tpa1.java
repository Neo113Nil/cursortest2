package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class tpa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ AtomicReference c;

    public tpa1(j jVar, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = jVar;
                this.c = atomicReference;
                break;
            default:
                this.c = atomicReference;
                Objects.requireNonNull(jVar);
                this.b = jVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.c;
                synchronized (atomicReference) {
                    try {
                        try {
                            g gVar = (g) this.b.b;
                            atomicReference.set(Long.valueOf(gVar.w.Ng(gVar.l().Mg(), nw91.c0)));
                        } finally {
                            this.c.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                j jVar = this.b;
                o5a1 o5a1Var = ((g) jVar.b).x;
                g.e(o5a1Var);
                Bundle D = o5a1Var.H.D();
                j5b1 j = ((g) jVar.b).j();
                AtomicReference atomicReference2 = this.c;
                j.Gg();
                j.Hg();
                j.Ug(new h(j, atomicReference2, j.Wg(false), D, 2));
                return;
        }
    }
}
