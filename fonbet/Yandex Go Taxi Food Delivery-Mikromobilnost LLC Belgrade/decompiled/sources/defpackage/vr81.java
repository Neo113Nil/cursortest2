package defpackage;

import com.google.android.play.integrity.internal.e;

/* loaded from: classes11.dex */
public final class vr81 extends ue81 {
    public final /* synthetic */ e b;

    public vr81(e eVar) {
        this.b = eVar;
    }

    @Override // defpackage.ue81
    public final void b() {
        synchronized (this.b.f) {
            try {
                if (this.b.l.get() > 0 && this.b.l.decrementAndGet() > 0) {
                    this.b.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                e eVar = this.b;
                if (eVar.n != null) {
                    eVar.b.a("Unbind from service.", new Object[0]);
                    e eVar2 = this.b;
                    eVar2.a.unbindService(eVar2.m);
                    e eVar3 = this.b;
                    eVar3.g = false;
                    eVar3.n = null;
                    eVar3.m = null;
                }
                this.b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
