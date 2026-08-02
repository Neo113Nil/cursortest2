package ru.yandex.taxi.eatskit.internal;

import android.net.Uri;
import defpackage.ccn;
import defpackage.jfn;
import defpackage.vmx;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class b extends ccn {
    public final boolean f;

    public b(jfn jfnVar, boolean z) {
        super("trackingData", jfnVar, false, EatsEvent$OpenTracking$1.b, z || jfnVar.b);
        this.f = z;
    }

    @Override // defpackage.ccn
    public final Pair a() {
        return new Pair("superappTrackingData", vmx.a.a().c(this.b, jfn.Companion.serializer()));
    }

    @Override // defpackage.ccn
    public final void b(Uri.Builder builder) {
        if (this.f) {
            super.b(builder);
        }
    }
}
