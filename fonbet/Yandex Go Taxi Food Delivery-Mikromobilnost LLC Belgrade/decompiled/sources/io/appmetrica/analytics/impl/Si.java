package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class Si {
    public final boolean a;
    public final C0600ol b;
    public final Hh c;
    public final J8 d;
    public final Zi e;
    public final Handler f;

    public Si(C0600ol c0600ol, Hh hh, Handler handler, boolean z) {
        this(c0600ol, hh, handler, z, new J8(z), new Zi());
    }

    public final void a() {
        if (this.a) {
            return;
        }
        C0600ol c0600ol = this.b;
        ResultReceiverC0338fj resultReceiverC0338fj = new ResultReceiverC0338fj(this.f, this);
        c0600ol.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0338fj);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4("", "", 4098, 0, anonymousInstance);
        g4.m = bundle;
        C0902z5 c0902z5 = c0600ol.a;
        c0600ol.a(C0600ol.a(g4, c0902z5), c0902z5, 1, (Map) null);
    }

    public Si(C0600ol c0600ol, Hh hh, Handler handler) {
        this(c0600ol, hh, handler, hh.s());
    }

    public Si(C0600ol c0600ol, Hh hh, Handler handler, boolean z, J8 j8, Zi zi) {
        this.b = c0600ol;
        this.c = hh;
        this.a = z;
        this.d = j8;
        this.e = zi;
        this.f = handler;
    }

    public final void a(Ui ui) {
        String str = ui == null ? null : ui.a;
        if (this.a) {
            return;
        }
        synchronized (this) {
            J8 j8 = this.d;
            this.e.getClass();
            j8.d = Zi.a(str);
            j8.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            J8 j8 = this.d;
            j8.c = deferredDeeplinkParametersListener;
            if (j8.a) {
                j8.a(1);
            } else {
                j8.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            J8 j8 = this.d;
            j8.b = deferredDeeplinkListener;
            if (j8.a) {
                j8.a(1);
            } else {
                j8.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }
}
