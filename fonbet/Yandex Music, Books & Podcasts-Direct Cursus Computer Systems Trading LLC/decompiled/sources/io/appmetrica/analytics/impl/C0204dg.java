package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.tiu;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0204dg {
    public final Function1 a;

    public C0204dg(C0347ig c0347ig) {
        this.a = c0347ig;
    }

    public final C0232eg a(Context context, C0726vj c0726vj) {
        return new C0232eg(context, c0726vj, this.a, new tiu(13), EnumC0603rc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final C0232eg b(Context context, C0726vj c0726vj) {
        return new C0232eg(context, c0726vj, this.a, new tiu(14), EnumC0603rc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final Cdo a(V0 v0) {
        return new C0146bg(v0.f.d);
    }

    public static final Cdo b(V0 v0) {
        return new C0130b0();
    }
}
