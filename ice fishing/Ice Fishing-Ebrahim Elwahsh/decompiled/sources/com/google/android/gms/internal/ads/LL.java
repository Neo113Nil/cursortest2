package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class LL extends CC {

    /* renamed from: u, reason: collision with root package name */
    public final ML f26145u;

    /* renamed from: v, reason: collision with root package name */
    public CC f26146v;

    public LL(NL nl) {
        super(1);
        Objects.requireNonNull(nl);
        this.f26145u = new ML(nl);
        this.f26146v = b();
    }

    @Override // com.google.android.gms.internal.ads.CC
    public final byte a() {
        CC cc = this.f26146v;
        if (cc == null) {
            throw new NoSuchElementException();
        }
        byte a9 = cc.a();
        if (!this.f26146v.hasNext()) {
            this.f26146v = b();
        }
        return a9;
    }

    public final NK b() {
        ML ml = this.f26145u;
        if (ml.hasNext()) {
            return new NK(ml.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26146v != null;
    }
}
