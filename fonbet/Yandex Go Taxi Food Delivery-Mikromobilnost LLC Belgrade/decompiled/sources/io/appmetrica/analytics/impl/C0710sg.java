package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.ny61;
import defpackage.su71;
import defpackage.tls;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0710sg {
    public final tls a;

    public C0710sg(C0855xg c0855xg) {
        this.a = c0855xg;
    }

    public final C0739tg a(Context context, Bj bj) {
        return new C0739tg(context, bj, this.a, new ny61(14), Hc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual", new C0528m7());
    }

    public final C0739tg b(Context context, Bj bj) {
        return new C0739tg(context, bj, this.a, new su71(9), Hc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session", new C0528m7());
    }

    public static final InterfaceC0892yo a(W0 w0) {
        return new C0653qg(w0.f.d);
    }

    public static final InterfaceC0892yo b(W0 w0) {
        return new C0262d0();
    }
}
