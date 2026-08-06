package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512jg implements InterfaceC0409fg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6286a;

    /* renamed from: b, reason: collision with root package name */
    public final C0851wi f6287b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f6288c;

    /* renamed from: d, reason: collision with root package name */
    public final L7 f6289d;

    /* renamed from: e, reason: collision with root package name */
    public final C0719rg f6290e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f6291f;

    public C0512jg(C0851wi c0851wi, Ve ve, Handler handler) {
        this(c0851wi, ve, handler, ve.s());
    }

    public final void a() {
        if (this.f6286a) {
            return;
        }
        C0851wi c0851wi = this.f6287b;
        ResultReceiverC0771tg resultReceiverC0771tg = new ResultReceiverC0771tg(this.f6291f, this);
        c0851wi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0771tg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3("", "", 4098, 0, anonymousInstance);
        m3.f4916m = bundle;
        F4 f4 = c0851wi.f7116a;
        c0851wi.a(C0851wi.a(m3, f4), f4, 1, (Map) null);
    }

    public C0512jg(C0851wi c0851wi, Ve ve, Handler handler, boolean z2) {
        this(c0851wi, ve, handler, z2, new L7(z2), new C0719rg());
    }

    public C0512jg(C0851wi c0851wi, Ve ve, Handler handler, boolean z2, L7 l7, C0719rg c0719rg) {
        this.f6287b = c0851wi;
        this.f6288c = ve;
        this.f6286a = z2;
        this.f6289d = l7;
        this.f6290e = c0719rg;
        this.f6291f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0409fg
    public final void a(C0616ng c0616ng) {
        String str = c0616ng == null ? null : c0616ng.f6624a;
        if (this.f6286a) {
            return;
        }
        synchronized (this) {
            L7 l7 = this.f6289d;
            this.f6290e.getClass();
            l7.f4688d = C0719rg.a(str);
            l7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            L7 l7 = this.f6289d;
            l7.f4687c = deferredDeeplinkParametersListener;
            if (l7.f4685a) {
                l7.a(1);
            } else {
                l7.a();
            }
            this.f6288c.u();
        } catch (Throwable th) {
            this.f6288c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            L7 l7 = this.f6289d;
            l7.f4686b = deferredDeeplinkListener;
            if (l7.f4685a) {
                l7.a(1);
            } else {
                l7.a();
            }
            this.f6288c.u();
        } catch (Throwable th) {
            this.f6288c.u();
            throw th;
        }
    }
}
