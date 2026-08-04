package com.gamericefishpro.space.n5;

import android.net.Uri;
import android.view.InputEvent;
import com.gamericefishpro.space.b0.o;
import com.gamericefishpro.space.db.d;
import com.gamericefishpro.space.o5.c;
import com.gamericefishpro.space.o5.e;
import com.gamericefishpro.space.o5.f;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final c a;

    public b(c mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.a = mMeasurementManager;
    }

    public com.gamericefishpro.space.va.b a(com.gamericefishpro.space.o5.a deletionRequest) {
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new a(this, null, 0), 3));
    }

    public com.gamericefishpro.space.va.b b() {
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new a(this, null, 1), 3));
    }

    public com.gamericefishpro.space.va.b c(Uri attributionSource, InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new d(this, attributionSource, inputEvent, null, 7), 3));
    }

    public com.gamericefishpro.space.va.b d(com.gamericefishpro.space.o5.d request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new a(this, null, 2), 3));
    }

    public com.gamericefishpro.space.va.b e(Uri trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new o(this, trigger, null, 16), 3));
    }

    public com.gamericefishpro.space.va.b f(e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new a(this, null, 3), 3));
    }

    public com.gamericefishpro.space.va.b g(f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return com.gamericefishpro.space.wa.b.c(a0.e(a0.b(k0.a), null, new a(this, null, 4), 3));
    }
}
