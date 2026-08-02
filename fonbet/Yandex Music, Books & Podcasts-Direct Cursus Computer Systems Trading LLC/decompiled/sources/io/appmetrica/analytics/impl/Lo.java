package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Lo extends AbstractC0280g6 {
    public Lo(C0241ep c0241ep, C0385jp c0385jp, C0212dp c0212dp) {
        super(c0241ep, c0385jp, c0212dp);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0280g6
    public final synchronized void a(@NonNull C0212dp c0212dp) {
        a(new D6(c(), C0747wb.I.v(), C0747wb.I.s(), ((C0212dp) b()).mergeFrom(c0212dp)));
        e();
    }
}
