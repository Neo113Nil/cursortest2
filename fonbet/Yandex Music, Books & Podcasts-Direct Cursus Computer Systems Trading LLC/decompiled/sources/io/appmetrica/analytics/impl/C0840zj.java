package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0840zj extends AbstractC0697uj {
    public final Hr b;

    public C0840zj(@NonNull P5 p5) {
        this(p5, p5.v());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        P5 p5 = this.a;
        if (this.b.c()) {
            return false;
        }
        if (!this.b.d()) {
            C0630sa c0630sa = p5.n;
            c0630sa.c.b(H6.a(h6, EnumC0603rc.EVENT_TYPE_FIRST_ACTIVATION));
        }
        Hr hr = this.b;
        synchronized (hr) {
            Ir ir = hr.a;
            ir.a(ir.a().put("first_event_done", true));
        }
        return false;
    }

    public C0840zj(P5 p5, Hr hr) {
        super(p5);
        this.b = hr;
    }
}
