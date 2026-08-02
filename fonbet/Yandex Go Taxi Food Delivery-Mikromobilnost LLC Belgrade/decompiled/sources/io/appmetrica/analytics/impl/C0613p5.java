package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0613p5 implements Z4 {
    public final Context a;
    public final C0670r5 b;
    public final ResultReceiver c;

    public C0613p5(Context context, C0670r5 c0670r5, C0468k5 c0468k5) {
        this.a = context;
        this.b = c0670r5;
        this.c = c0468k5.c;
        c0670r5.a(this);
    }

    @Override // io.appmetrica.analytics.impl.Z4
    public final void a(K6 k6, C0468k5 c0468k5) {
        this.b.a(c0468k5.b);
        this.b.a(k6, this);
    }

    public final C0670r5 b() {
        return this.b;
    }

    public final Context c() {
        return this.a;
    }

    public final ResultReceiver d() {
        return this.c;
    }

    public final void a(M4 m4) {
        ResultReceiverC0904z7.a(this.c, m4);
    }

    @Override // io.appmetrica.analytics.impl.Z4
    public final void a() {
        this.b.b(this);
    }
}
