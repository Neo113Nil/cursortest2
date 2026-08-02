package ru.yandex.taxi.masstransit.detailedroute.router;

import android.view.ContextThemeWrapper;
import defpackage.avj0;
import defpackage.qf30;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MtDetailedRouteComposeRouter$content$1$3$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        qf30 qf30Var = (qf30) this.receiver;
        avj0 avj0Var = (avj0) qf30Var.N;
        int u = tje.u(24, avj0Var.a) + intValue;
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        int u2 = tje.u(24, contextThemeWrapper);
        qf30Var.M.q3(qf30Var, u2, tje.u(80, contextThemeWrapper), u2, u);
        return zy11.a;
    }
}
