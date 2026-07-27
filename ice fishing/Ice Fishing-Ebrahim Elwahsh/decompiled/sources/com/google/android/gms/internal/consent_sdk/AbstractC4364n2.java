package com.google.android.gms.internal.consent_sdk;

/* renamed from: com.google.android.gms.internal.consent_sdk.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4364n2 implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC4368o2 f35889n;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC4368o2 f35890u;

    public AbstractC4364n2(AbstractC4368o2 abstractC4368o2) {
        this.f35889n = abstractC4368o2;
        if (abstractC4368o2.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f35890u = (AbstractC4368o2) abstractC4368o2.f(4);
    }

    public final Object clone() {
        AbstractC4364n2 abstractC4364n2 = (AbstractC4364n2) this.f35889n.f(5);
        abstractC4364n2.f35890u = i();
        return abstractC4364n2;
    }

    public final AbstractC4368o2 h() {
        AbstractC4368o2 i = i();
        i.getClass();
        boolean z8 = true;
        byte byteValue = ((Byte) i.f(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z8 = false;
            } else {
                z8 = F2.f35677c.a(i.getClass()).g(i);
                i.f(2);
            }
        }
        if (z8) {
            return i;
        }
        throw new B0.c("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC4368o2 i() {
        if (!this.f35890u.e()) {
            return this.f35890u;
        }
        this.f35890u.j();
        return this.f35890u;
    }

    public final void j() {
        if (this.f35890u.e()) {
            return;
        }
        AbstractC4368o2 abstractC4368o2 = (AbstractC4368o2) this.f35889n.f(4);
        F2.f35677c.a(abstractC4368o2.getClass()).e(abstractC4368o2, this.f35890u);
        this.f35890u = abstractC4368o2;
    }
}
