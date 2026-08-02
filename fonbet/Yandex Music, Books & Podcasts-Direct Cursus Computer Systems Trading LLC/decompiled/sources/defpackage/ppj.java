package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ppj implements xt3 {
    public final kpj a;
    public final /* synthetic */ qpj b;

    public ppj(qpj qpjVar, kpj kpjVar) {
        kpjVar.getClass();
        this.b = qpjVar;
        this.a = kpjVar;
    }

    @Override // defpackage.xt3
    public final void cancel() {
        qpj qpjVar = this.b;
        zx0 zx0Var = qpjVar.b;
        kpj kpjVar = this.a;
        zx0Var.remove(kpjVar);
        if (Intrinsics.d(qpjVar.c, kpjVar)) {
            kpjVar.handleOnBackCancelled();
            qpjVar.c = null;
        }
        kpjVar.removeCancellable(this);
        Function0<Unit> enabledChangedCallback$activity_release = kpjVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        kpjVar.setEnabledChangedCallback$activity_release(null);
    }
}
