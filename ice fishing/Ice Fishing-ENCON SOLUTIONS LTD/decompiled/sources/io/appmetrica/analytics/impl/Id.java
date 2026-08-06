package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final t1.l f4542a;

    public Id(Nd nd) {
        this.f4542a = nd;
    }

    public final Jd a(Context context, Sg sg) {
        return new Jd(context, sg, this.f4542a, new H0.b(12), EnumC0301bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Jd b(Context context, Sg sg) {
        return new Jd(context, sg, this.f4542a, new H0.b(13), EnumC0301bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC0285al a(G0 g02) {
        return new Gd(g02.f4408f.f4454d);
    }

    public static final InterfaceC0285al b(G0 g02) {
        return new X();
    }
}
