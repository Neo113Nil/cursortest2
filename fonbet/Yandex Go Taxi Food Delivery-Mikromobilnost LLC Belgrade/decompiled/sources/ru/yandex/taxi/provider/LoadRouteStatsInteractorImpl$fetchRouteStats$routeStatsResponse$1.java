package ru.yandex.taxi.provider;

import defpackage.jst;
import defpackage.s8o;
import defpackage.tls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class LoadRouteStatsInteractorImpl$fetchRouteStats$routeStatsResponse$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        ((a) this.receiver).getClass();
        Throwable original = th instanceof GoApiOtherException ? ((GoApiOtherException) th).getOriginal() : th;
        if (s8o.A(th) || s8o.E(th)) {
            xby.l(jst.e, "Routestats: Network error", null, original, "Network error", 2);
        } else if (s8o.x(th)) {
            xby.l(jst.e, "Routestats: Http error", null, original, "Http error", 2);
        } else {
            xby.l(jst.e, "Routestats: Unknown error", null, original, "Unknown error", 2);
        }
        return zy11.a;
    }
}
