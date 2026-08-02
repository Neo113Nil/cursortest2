package defpackage;

import java.util.concurrent.Callable;
import ru.kinopoisk.sdk.easylogin.internal.F4;

/* loaded from: classes5.dex */
public final class gkq extends a0g {
    public final Callable a;

    public gkq(F4.d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.a0g
    public final void L(nkq nkqVar) {
        kjo kjoVar = new kjo(etn.p);
        nkqVar.b(kjoVar);
        if (kjoVar.b()) {
            return;
        }
        try {
            Object call = this.a.call();
            up6.L(call, "The callable returned a null value");
            if (kjoVar.b()) {
                return;
            }
            nkqVar.onSuccess(call);
        } catch (Throwable th) {
            leu.a0(th);
            if (kjoVar.b()) {
                y5g.g0(th);
            } else {
                nkqVar.onError(th);
            }
        }
    }
}
