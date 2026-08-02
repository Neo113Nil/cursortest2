package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EK extends AbstractC4278zC {

    /* renamed from: u, reason: collision with root package name */
    public int f25340u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25341v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JK f25342w;

    public EK(JK jk) {
        super(1);
        Objects.requireNonNull(jk);
        this.f25342w = jk;
        this.f25340u = 0;
        this.f25341v = jk.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC
    public final byte a() {
        int i = this.f25340u;
        if (i >= this.f25341v) {
            throw new NoSuchElementException();
        }
        this.f25340u = i + 1;
        return this.f25342w.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25340u < this.f25341v;
    }
}
