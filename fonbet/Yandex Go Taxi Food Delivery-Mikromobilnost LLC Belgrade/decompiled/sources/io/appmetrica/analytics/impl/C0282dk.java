package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0282dk extends Aj {
    public C0282dk(S5 s5) {
        super(s5);
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        Wn wn;
        ((C0325f6) this.a.p).e();
        C0574no c0574no = this.a.j;
        synchronized (c0574no) {
            try {
                if (c0574no.g == 0) {
                    wn = c0574no.c.a();
                    Wn a = c0574no.d.a();
                    long j = -1;
                    long j2 = wn == null ? -1L : wn.d;
                    if (a != null) {
                        j = a.d;
                    }
                    if (j2 <= j) {
                        wn = a;
                    }
                } else {
                    wn = c0574no.f;
                }
                if (wn != null) {
                    wn.b();
                    if (wn.h) {
                        wn.h = false;
                        C0689ro c0689ro = wn.b;
                        c0689ro.a(C0689ro.j, Boolean.FALSE);
                        c0689ro.a();
                    }
                    c0574no.g = 0;
                }
            } finally {
            }
        }
        return true;
    }
}
