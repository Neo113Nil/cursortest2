package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EK extends AbstractC4255zC {

    /* renamed from: u, reason: collision with root package name */
    public int f24579u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24580v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JK f24581w;

    public EK(JK jk) {
        super(1);
        Objects.requireNonNull(jk);
        this.f24581w = jk;
        this.f24579u = 0;
        this.f24580v = jk.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC
    public final byte a() {
        int i = this.f24579u;
        if (i >= this.f24580v) {
            throw new NoSuchElementException();
        }
        this.f24579u = i + 1;
        return this.f24581w.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24579u < this.f24580v;
    }
}
