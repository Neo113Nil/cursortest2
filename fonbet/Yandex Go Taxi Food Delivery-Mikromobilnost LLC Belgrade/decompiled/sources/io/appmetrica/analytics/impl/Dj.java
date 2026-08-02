package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Dj;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.Yc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes9.dex */
public final class Dj {
    public final Context a;
    public final InterfaceC0892yo b;
    public final InterfaceC0441j7 c;
    public final C0246cd d = new C0246cd();
    public final C0468k5 e = new C0468k5(new C0806vp(), new C0439j5(), null);
    public final Consumer f;

    public Dj(Context context, final Y6 y6, final Hc hc, InterfaceC0892yo interfaceC0892yo, InterfaceC0441j7 interfaceC0441j7) {
        this.a = context;
        this.b = interfaceC0892yo;
        this.c = interfaceC0441j7;
        this.f = new Consumer() { // from class: owl
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Dj.a(Hc.this, this, y6, (Yc) obj);
            }
        };
    }

    public static final void a(Hc hc, Dj dj, Y6 y6, Yc yc) {
        String str = yc.h;
        J4 j4 = new J4(str, yc.e, yc.f, yc.g, yc.i);
        String str2 = yc.b;
        byte[] bArr = yc.a;
        int i = yc.c;
        HashMap hashMap = yc.d;
        String str3 = yc.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        long a = ((C0590ob) dj.c).a(yc);
        Set set = La.a;
        G4 g4 = new G4(bArr, str2, hc.a, orCreatePublicLogger);
        g4.b(a);
        g4.q = hashMap;
        g4.g = i;
        g4.c = str3;
        ((Bj) y6).a(j4, g4, dj.e);
    }
}
