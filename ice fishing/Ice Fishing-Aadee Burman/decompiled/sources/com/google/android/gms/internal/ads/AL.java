package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AL extends AbstractC4255zC {

    /* renamed from: u, reason: collision with root package name */
    public final BL f23664u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC4255zC f23665v;

    public AL(CL cl) {
        super(1);
        Objects.requireNonNull(cl);
        this.f23664u = new BL(cl);
        this.f23665v = b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC
    public final byte a() {
        AbstractC4255zC abstractC4255zC = this.f23665v;
        if (abstractC4255zC == null) {
            throw new NoSuchElementException();
        }
        byte a9 = abstractC4255zC.a();
        if (!this.f23665v.hasNext()) {
            this.f23665v = b();
        }
        return a9;
    }

    public final EK b() {
        BL bl = this.f23664u;
        if (bl.hasNext()) {
            return new EK(bl.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23665v != null;
    }
}
