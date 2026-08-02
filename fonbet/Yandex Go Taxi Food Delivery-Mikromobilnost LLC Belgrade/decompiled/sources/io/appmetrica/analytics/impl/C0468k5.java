package io.appmetrica.analytics.impl;

import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0468k5 {
    public final C0806vp a;
    public final C0439j5 b;
    public final ResultReceiver c;

    public C0468k5(B4 b4) {
        this(new C0806vp(b4), new C0439j5(b4.b(), b4.a().a()), b4.a().c());
    }

    public C0468k5(C0806vp c0806vp, C0439j5 c0439j5, ResultReceiver resultReceiver) {
        this.a = c0806vp;
        this.b = c0439j5;
        this.c = resultReceiver;
    }
}
