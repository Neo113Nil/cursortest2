package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0584o5 extends AbstractC0479kg {
    public final Object f;

    public AbstractC0584o5(int i, String str, Object obj, Vr vr, AbstractC0871y3 abstractC0871y3) {
        super(i, str, vr, abstractC0871y3);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0479kg, io.appmetrica.analytics.impl.Hr
    public final void a(Gr gr) {
        if (f()) {
            AbstractC0871y3 abstractC0871y3 = this.d;
            int i = this.b;
            Ir a = abstractC0871y3.a(gr, (Ir) ((HashMap) gr.a.get(i)).get(this.a), this);
            if (a != null) {
                a(a);
            }
        }
    }

    public abstract void a(Ir ir);

    public final Object g() {
        return this.f;
    }
}
