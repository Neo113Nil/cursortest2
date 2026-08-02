package defpackage;

import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class wsg implements h5i, tqg {
    public final g06 a = new g06(new d5b(), c5b.a);

    @Override // defpackage.tqg
    public final g06 a() {
        return this.a;
    }

    @Override // defpackage.h5i
    public final void b(cir cirVar, usg usgVar, ohb ohbVar) {
        try {
            m6a m6aVar = (m6a) cirVar.a;
            usgVar.a.invoke(ohbVar);
            m6a m6aVar2 = (m6a) cirVar.a;
            Timber.INSTANCE.i("[Success] " + ("\"" + ern.a(ohbVar.getClass()).h() + "\"") + " dispatched (" + (Intrinsics.d(m6aVar, m6aVar2) ? "state not changed" : "state changed") + ")", new Object[0]);
        } catch (Exception e) {
            Timber.INSTANCE.e(e, hrg.q("[Failure] ", hrg.q("\"", ern.a(ohbVar.getClass()).h(), "\""), " not dispatched (see error below)"), new Object[0]);
            throw e;
        }
    }
}
