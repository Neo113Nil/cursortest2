package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0537mg implements Consumer {
    public final Bj a;
    public final X0 b;
    public final C0797vg c;

    public C0537mg(Bj bj, X0 x0, C0797vg c0797vg) {
        this.a = bj;
        this.b = x0;
        this.c = c0797vg;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Bj bj = this.a;
        X0 x0 = this.b;
        String str2 = x0.a;
        String str3 = x0.b;
        Integer valueOf = Integer.valueOf(x0.d);
        X0 x02 = this.b;
        J4 j4 = new J4(str2, str3, valueOf, x02.e, x02.c);
        C0797vg c0797vg = this.c;
        Hc hc = c0797vg.b;
        W0 w0 = c0797vg.a;
        String str4 = w0.c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(w0.f.a);
        long a = ((C0528m7) c0797vg.c).a(c0797vg.a);
        Set set = La.a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        G4 g4 = new G4("", "", hc.a, orCreatePublicLogger);
        g4.b(a);
        if (str != null) {
            g4.f(str);
        }
        g4.m = bundle;
        g4.c = c0797vg.a.f.f;
        bj.a(j4, g4, new C0468k5(new C0806vp(), new C0439j5(), null));
    }
}
