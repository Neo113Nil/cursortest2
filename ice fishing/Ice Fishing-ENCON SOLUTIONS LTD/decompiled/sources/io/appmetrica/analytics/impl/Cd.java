package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* loaded from: classes.dex */
public final class Cd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Sg f4262a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f4263b;

    /* renamed from: c, reason: collision with root package name */
    public final Ld f4264c;

    public Cd(Sg sg, H0 h02, Ld ld) {
        this.f4262a = sg;
        this.f4263b = h02;
        this.f4264c = ld;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Sg sg = this.f4262a;
        H0 h02 = this.f4263b;
        String str2 = h02.f4451a;
        String str3 = h02.f4452b;
        Integer valueOf = Integer.valueOf(h02.f4454d);
        H0 h03 = this.f4263b;
        P3 p3 = new P3(str2, str3, valueOf, h03.f4455e, h03.f4453c);
        Ld ld = this.f4264c;
        EnumC0301bb enumC0301bb = ld.f4703b;
        G0 g02 = ld.f4702a;
        String str4 = g02.f4405c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g02.f4408f.f4451a);
        Set set = AbstractC0842w9.f7096a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        M3 m3 = new M3("", "", enumC0301bb.f5664a, orCreatePublicLogger);
        if (str != null) {
            m3.f(str);
        }
        m3.f4916m = bundle;
        m3.f4906c = ld.f4702a.f4408f.f4456f;
        sg.a(p3, m3, new C0656p4(new Zl(), new C0630o4(), null));
    }
}
