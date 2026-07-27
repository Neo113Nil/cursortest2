package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4351n2 implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC4355o2 f35726n;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC4355o2 f35727u;

    public AbstractC4351n2(AbstractC4355o2 abstractC4355o2) {
        this.f35726n = abstractC4355o2;
        if (abstractC4355o2.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f35727u = (AbstractC4355o2) abstractC4355o2.f(4);
    }

    public final Object clone() {
        AbstractC4351n2 abstractC4351n2 = (AbstractC4351n2) this.f35726n.f(5);
        abstractC4351n2.f35727u = i();
        return abstractC4351n2;
    }

    public final AbstractC4355o2 h() {
        AbstractC4355o2 i = i();
        i.getClass();
        boolean z3 = true;
        byte byteValue = ((Byte) i.f(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z3 = false;
            } else {
                z3 = F2.f35514c.a(i.getClass()).g(i);
                i.f(2);
            }
        }
        if (z3) {
            return i;
        }
        throw new B0.c("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC4355o2 i() {
        if (!this.f35727u.e()) {
            return this.f35727u;
        }
        this.f35727u.j();
        return this.f35727u;
    }

    public final void j() {
        if (this.f35727u.e()) {
            return;
        }
        AbstractC4355o2 abstractC4355o2 = (AbstractC4355o2) this.f35726n.f(4);
        F2.f35514c.a(abstractC4355o2.getClass()).e(abstractC4355o2, this.f35727u);
        this.f35727u = abstractC4355o2;
    }
}
