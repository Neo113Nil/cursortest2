package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.mob.am.c;
import com.yandex.mob.d;
import com.yandex.passport.api.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes13.dex */
public final class uot {
    public final ep90 a;
    public final hs50 b;

    public uot(ep90 ep90Var, hs50 hs50Var) {
        this.a = ep90Var;
        this.b = hs50Var;
    }

    public final Object a(d dVar, Continuation continuation) {
        on90 on90Var = new on90(HostMobSupportedApiNames.AM_MOBILEPROXY.getApiName(), HostMobSupportedApiNames.WEBAM.getApiName());
        b a = this.a.a();
        String str = this.b.a().a;
        Regex regex = c.a;
        xn90.a.getClass();
        return c.e(dVar, on90Var, a, o430.E, str, (ContinuationImpl) continuation);
    }
}
