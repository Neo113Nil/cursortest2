package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4374n2 implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC4378o2 f36495n;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC4378o2 f36496u;

    public AbstractC4374n2(AbstractC4378o2 abstractC4378o2) {
        this.f36495n = abstractC4378o2;
        if (abstractC4378o2.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f36496u = (AbstractC4378o2) abstractC4378o2.f(4);
    }

    public final Object clone() {
        AbstractC4374n2 abstractC4374n2 = (AbstractC4374n2) this.f36495n.f(5);
        abstractC4374n2.f36496u = i();
        return abstractC4374n2;
    }

    public final AbstractC4378o2 h() {
        AbstractC4378o2 i = i();
        i.getClass();
        boolean z6 = true;
        byte byteValue = ((Byte) i.f(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z6 = false;
            } else {
                z6 = F2.f36283c.a(i.getClass()).g(i);
                i.f(2);
            }
        }
        if (z6) {
            return i;
        }
        throw new B0.c("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC4378o2 i() {
        if (!this.f36496u.e()) {
            return this.f36496u;
        }
        this.f36496u.j();
        return this.f36496u;
    }

    public final void j() {
        if (this.f36496u.e()) {
            return;
        }
        AbstractC4378o2 abstractC4378o2 = (AbstractC4378o2) this.f36495n.f(4);
        F2.f36283c.a(abstractC4378o2.getClass()).e(abstractC4378o2, this.f36496u);
        this.f36496u = abstractC4378o2;
    }
}
