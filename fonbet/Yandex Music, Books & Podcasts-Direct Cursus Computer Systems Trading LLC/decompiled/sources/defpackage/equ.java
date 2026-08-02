package defpackage;

import com.yandex.passport.internal.push.z0;
import com.yandex.passport.internal.report.ib;
import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.passport.internal.ui.sloth.webcard.k1;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.a;

/* loaded from: classes4.dex */
public final class equ extends a implements fm6 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public equ(z0 z0Var) {
        super(r0);
        rre rreVar = rre.f;
        this.d = z0Var;
    }

    @Override // defpackage.fm6
    public final void N(Throwable th) {
        switch (this.c) {
            case 0:
                ssg.a(6, "WaveForTwoDeepLinkViewModel", "Unhandled error", th);
                xdr xdrVar = ((fqu) this.d).q;
                xdrVar.getClass();
                xdrVar.m(null, tpu.a);
                break;
            case 1:
                z0 z0Var = (z0) this.d;
                ib ibVar = ib.d;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                z0Var.b(ibVar, uah.e(new Pair("throwable-message", message), new Pair("throwable", fob.b(th))));
                break;
            default:
                k1 k1Var = (k1) this.d;
                x97.y(ot0.F(k1Var), null, null, new q(k1Var, th, (Continuation) null, 12), 3);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public equ(k1 k1Var) {
        super(r0);
        rre rreVar = rre.f;
        this.d = k1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public equ(fqu fquVar) {
        super(r0);
        rre rreVar = rre.f;
        this.d = fquVar;
    }
}
