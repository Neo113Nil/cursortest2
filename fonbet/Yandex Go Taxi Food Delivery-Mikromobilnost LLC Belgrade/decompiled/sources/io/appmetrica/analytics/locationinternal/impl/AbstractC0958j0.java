package io.appmetrica.analytics.locationinternal.impl;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0958j0 {
    public final Object a;

    public AbstractC0958j0(Object obj) {
        this.a = obj;
    }

    public abstract boolean a(AbstractC0958j0 abstractC0958j0);

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0958j0) {
            try {
                return a((AbstractC0958j0) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
