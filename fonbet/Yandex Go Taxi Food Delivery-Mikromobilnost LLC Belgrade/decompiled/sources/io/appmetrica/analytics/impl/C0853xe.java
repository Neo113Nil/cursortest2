package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.xe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0853xe {
    public final C0749tq a;
    public final C0749tq b;
    public final C0382h5 c;
    public final PublicLogger d;
    public final String e;

    public C0853xe(String str, PublicLogger publicLogger) {
        this(new C0382h5(30), new C0749tq(50, str.concat("map key"), publicLogger), new C0749tq(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public C0853xe(C0382h5 c0382h5, C0749tq c0749tq, C0749tq c0749tq2, String str, PublicLogger publicLogger) {
        this.c = c0382h5;
        this.a = c0749tq;
        this.b = c0749tq2;
        this.e = str;
        this.d = publicLogger;
    }
}
