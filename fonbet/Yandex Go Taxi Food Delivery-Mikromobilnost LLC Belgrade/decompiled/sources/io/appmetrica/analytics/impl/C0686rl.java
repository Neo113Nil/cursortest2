package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0686rl extends AbstractC0757u5 {
    public C0686rl(C0670r5 c0670r5) {
        super(c0670r5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0757u5
    public final boolean a(K6 k6, C0613p5 c0613p5) {
        Bundle bundle = k6.m;
        this.a.a(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
