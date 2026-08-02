package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0324hl extends AbstractC0596r5 {
    public C0324hl(C0510o5 c0510o5) {
        super(c0510o5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0596r5
    public final boolean a(@NonNull H6 h6, @NonNull C0423l5 c0423l5) {
        Bundle bundle = h6.m;
        this.a.k.a(new C0481n5(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
