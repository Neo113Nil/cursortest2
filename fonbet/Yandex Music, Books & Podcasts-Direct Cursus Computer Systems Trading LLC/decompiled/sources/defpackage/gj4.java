package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gj4 extends y2f {
    public final /* synthetic */ int e;
    public final zt3 f;

    public /* synthetic */ gj4(zt3 zt3Var, int i) {
        this.e = i;
        this.f = zt3Var;
    }

    @Override // defpackage.y2f
    public final boolean k() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.y2f
    public final void l(Throwable th) {
        int i = this.e;
        zt3 zt3Var = this.f;
        switch (i) {
            case 0:
                Throwable p = zt3Var.p(j());
                if (zt3Var.z()) {
                    Continuation continuation = zt3Var.d;
                    continuation.getClass();
                    v98 v98Var = (v98) continuation;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v98.h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(v98Var);
                        js3 js3Var = w98.b;
                        if (Intrinsics.d(obj, js3Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(v98Var, js3Var, p)) {
                                if (atomicReferenceFieldUpdater.get(v98Var) != js3Var) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(v98Var, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(v98Var) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                zt3Var.h(p);
                if (!zt3Var.z()) {
                    zt3Var.n();
                    break;
                }
                break;
            default:
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(Unit.a);
                break;
        }
    }
}
