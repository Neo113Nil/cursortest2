package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.zC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4278zC implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36092n;

    public abstract byte a();

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f36092n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
