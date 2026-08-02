package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmServiceWrapper;
import io.appmetrica.analytics.rtmwrapper.internal.RtmServiceWrapper;

/* loaded from: classes9.dex */
public final class Xl {
    public final Ic a;

    public Xl() {
        this(new Ic());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IRtmServiceWrapper a(Context context) {
        RtmServiceWrapper rtmServiceWrapper;
        Qq qq;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                Ul ul = new Ul(this);
                IHandlerExecutor a = Jb.I.d.a();
                Vl vl = new Vl();
                IBinaryDataHelper b = Jb.I.B().b(context);
                Rn B = Jb.I.B();
                synchronized (B) {
                    try {
                        Qq qq2 = B.h;
                        if (qq2 == null) {
                            EnumC0605oq enumC0605oq = EnumC0605oq.SERVICE;
                            Pq pq = B.g;
                            if (pq == null) {
                                pq = new Pq(new Oo(B.f(context)), "temp_cache");
                                B.g = pq;
                            }
                            qq2 = new Qq(context, enumC0605oq, pq);
                            B.h = qq2;
                        }
                        qq = qq2;
                    } finally {
                    }
                }
                rtmServiceWrapper = new RtmServiceWrapper(ul, context, a, vl, b, qq);
            } catch (Throwable unused) {
            }
            return rtmServiceWrapper != null ? new C0501l9() : rtmServiceWrapper;
        }
        rtmServiceWrapper = null;
        if (rtmServiceWrapper != null) {
        }
    }

    public Xl(Ic ic) {
        this.a = ic;
    }
}
