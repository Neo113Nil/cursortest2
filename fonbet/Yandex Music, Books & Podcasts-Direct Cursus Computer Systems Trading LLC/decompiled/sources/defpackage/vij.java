package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class vij extends aij {
    public final fjj a;
    public final long b;
    public final TimeUnit c;
    public final jto d;
    public tij e;

    public vij(fjj fjjVar, long j, TimeUnit timeUnit, jto jtoVar) {
        this.a = fjjVar;
        this.b = j;
        this.c = timeUnit;
        this.d = jtoVar;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        tij tijVar;
        boolean z;
        bjj bjjVar;
        khp khpVar;
        synchronized (this) {
            try {
                tijVar = this.e;
                if (tijVar == null) {
                    tijVar = new tij(this);
                    this.e = tijVar;
                }
                long j = tijVar.c;
                if (j == 0 && (khpVar = tijVar.b) != null) {
                    ra8.b(khpVar);
                }
                long j2 = j + 1;
                tijVar.c = j2;
                if (tijVar.d || j2 != 1) {
                    z = false;
                } else {
                    tijVar.d = true;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.a(new uij(wjjVar, this, tijVar));
        if (z) {
            fjj fjjVar = this.a;
            AtomicReference atomicReference = fjjVar.b;
            loop0: while (true) {
                bjjVar = (bjj) atomicReference.get();
                if (bjjVar != null) {
                    if (!(bjjVar.c.get() == bjj.f)) {
                        break;
                    }
                }
                bjj bjjVar2 = new bjj(fjjVar.c.call());
                while (!atomicReference.compareAndSet(bjjVar, bjjVar2)) {
                    if (atomicReference.get() != bjjVar) {
                        break;
                    }
                }
                bjjVar = bjjVar2;
            }
            AtomicBoolean atomicBoolean = bjjVar.d;
            boolean z2 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
            try {
                tijVar.accept(bjjVar);
                if (z2) {
                    fjjVar.a.a(bjjVar);
                }
            } catch (Throwable th2) {
                if (z2) {
                    atomicBoolean.compareAndSet(true, false);
                }
                leu.a0(th2);
                throw aob.a(th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(tij tijVar) {
        synchronized (this) {
            try {
                tij tijVar2 = this.e;
                if (tijVar2 != null && tijVar2 == tijVar) {
                    khp khpVar = tijVar.b;
                    if (khpVar != null) {
                        ra8.b(khpVar);
                        tijVar.b = null;
                    }
                    long j = tijVar.c - 1;
                    tijVar.c = j;
                    if (j == 0) {
                        this.e = null;
                        fjj fjjVar = this.a;
                        if (fjjVar instanceof ka8) {
                            ((ka8) fjjVar).a();
                        } else {
                            fjjVar.d((ka8) tijVar.get());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(tij tijVar) {
        synchronized (this) {
            try {
                if (tijVar.c == 0 && tijVar == this.e) {
                    this.e = null;
                    ka8 ka8Var = (ka8) tijVar.get();
                    ra8.b(tijVar);
                    fjj fjjVar = this.a;
                    if (fjjVar instanceof ka8) {
                        ((ka8) fjjVar).a();
                    } else if (ka8Var == null) {
                        tijVar.e = true;
                    } else {
                        fjjVar.d(ka8Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
