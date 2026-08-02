package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmServiceWrapper;
import io.appmetrica.analytics.rtmwrapper.internal.RtmServiceWrapper;

/* loaded from: classes5.dex */
public final class Ml {
    public final C0632sc a;

    public Ml() {
        this(new C0632sc());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IRtmServiceWrapper a(Context context) {
        RtmServiceWrapper rtmServiceWrapper;
        C0819yq c0819yq;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                Jl jl = new Jl(this);
                IHandlerExecutor a = C0747wb.I.d.a();
                Kl kl = new Kl();
                IBinaryDataHelper b = C0747wb.I.B().b(context);
                C0844zn B = C0747wb.I.B();
                synchronized (B) {
                    try {
                        C0819yq c0819yq2 = B.h;
                        if (c0819yq2 == null) {
                            Wp wp = Wp.SERVICE;
                            C0791xq c0791xq = B.g;
                            if (c0791xq == null) {
                                c0791xq = new C0791xq(new C0673to(B.f(context)), "temp_cache");
                                B.g = c0791xq;
                            }
                            c0819yq2 = new C0819yq(context, wp, c0791xq);
                            B.h = c0819yq2;
                        }
                        c0819yq = c0819yq2;
                    } finally {
                    }
                }
                rtmServiceWrapper = new RtmServiceWrapper(jl, context, a, kl, b, c0819yq);
            } catch (Throwable unused) {
            }
            return rtmServiceWrapper != null ? new C0254f9() : rtmServiceWrapper;
        }
        rtmServiceWrapper = null;
        if (rtmServiceWrapper != null) {
        }
    }

    public Ml(C0632sc c0632sc) {
        this.a = c0632sc;
    }
}
