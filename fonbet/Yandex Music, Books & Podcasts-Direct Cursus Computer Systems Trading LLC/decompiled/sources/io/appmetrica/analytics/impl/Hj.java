package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Hj extends AbstractC0697uj {
    public Hj(P5 p5) {
        super(p5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        P5 p5 = this.a;
        synchronized (p5) {
            ((C0165c6) p5.p).d();
        }
        return false;
    }
}
