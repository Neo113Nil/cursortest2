package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Tj extends AbstractC0697uj {
    public Tj(P5 p5) {
        super(p5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        ((C0165c6) this.a.p).e();
        Tn tn = this.a.j;
        synchronized (tn) {
            try {
                En b = tn.b(h6);
                if (b.g) {
                    b.g = false;
                    Wn wn = b.b;
                    wn.a(Wn.i, Boolean.FALSE);
                    wn.b();
                }
                if (tn.g != 1) {
                    tn.b(tn.f, h6);
                }
                tn.g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
