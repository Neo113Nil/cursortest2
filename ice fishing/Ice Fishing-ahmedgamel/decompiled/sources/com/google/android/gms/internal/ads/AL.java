package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AL extends AbstractC4278zC {

    /* renamed from: u, reason: collision with root package name */
    public final BL f24444u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC4278zC f24445v;

    public AL(CL cl) {
        super(1);
        Objects.requireNonNull(cl);
        this.f24444u = new BL(cl);
        this.f24445v = b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC
    public final byte a() {
        AbstractC4278zC abstractC4278zC = this.f24445v;
        if (abstractC4278zC == null) {
            throw new NoSuchElementException();
        }
        byte a9 = abstractC4278zC.a();
        if (!this.f24445v.hasNext()) {
            this.f24445v = b();
        }
        return a9;
    }

    public final EK b() {
        BL bl = this.f24444u;
        if (bl.hasNext()) {
            return new EK(bl.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24445v != null;
    }
}
