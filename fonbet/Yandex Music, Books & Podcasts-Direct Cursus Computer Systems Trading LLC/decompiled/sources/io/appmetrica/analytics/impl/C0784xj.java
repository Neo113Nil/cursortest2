package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C0784xj;
import io.appmetrica.analytics.impl.EnumC0603rc;
import io.appmetrica.analytics.impl.Ic;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0784xj {
    public final Context a;
    public final Cdo b;
    public final Mc c = new Mc();
    public final C0279g5 d = new C0279g5(new C0212dp(), new C0250f5(), null);
    public final Consumer e;

    public C0784xj(Context context, final V6 v6, final EnumC0603rc enumC0603rc, Cdo cdo) {
        this.a = context;
        this.b = cdo;
        this.e = new Consumer() { // from class: zvw
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C0784xj.a(EnumC0603rc.this, v6, this, (Ic) obj);
            }
        };
    }

    public static final void a(EnumC0603rc enumC0603rc, V6 v6, C0784xj c0784xj, Ic ic) {
        String str = ic.h;
        F4 f4 = new F4(str, ic.e, ic.f, ic.g, ic.i);
        String str2 = ic.b;
        byte[] bArr = ic.a;
        int i = ic.c;
        HashMap hashMap = ic.d;
        String str3 = ic.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = Ea.a;
        C4 c4 = new C4(bArr, str2, enumC0603rc.a, orCreatePublicLogger);
        c4.q = hashMap;
        c4.g = i;
        c4.c = str3;
        ((C0726vj) v6).a(f4, c4, c0784xj.d);
    }
}
