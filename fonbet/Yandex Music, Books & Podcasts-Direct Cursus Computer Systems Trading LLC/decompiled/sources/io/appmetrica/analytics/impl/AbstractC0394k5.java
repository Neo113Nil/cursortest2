package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0394k5 extends Vf {
    public final Object f;

    public AbstractC0394k5(int i, String str, Object obj, Cr cr, AbstractC0796y3 abstractC0796y3) {
        super(i, str, cr, abstractC0796y3);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Vf, io.appmetrica.analytics.impl.InterfaceC0532or
    public final void a(@NonNull C0503nr c0503nr) {
        if (f()) {
            AbstractC0796y3 abstractC0796y3 = this.d;
            int i = this.b;
            C0561pr a = abstractC0796y3.a(c0503nr, (C0561pr) ((HashMap) c0503nr.a.get(i)).get(this.a), this);
            if (a != null) {
                a(a);
            }
        }
    }

    public abstract void a(@NonNull C0561pr c0561pr);

    @NonNull
    public final Object g() {
        return this.f;
    }
}
