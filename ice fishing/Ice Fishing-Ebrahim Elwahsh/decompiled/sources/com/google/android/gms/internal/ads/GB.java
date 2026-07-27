package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class GB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f25108n;

    /* renamed from: u, reason: collision with root package name */
    public int f25109u;

    /* renamed from: v, reason: collision with root package name */
    public int f25110v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JB f25111w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25112x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ JB f25113y;

    public GB(JB jb, char c4) {
        Objects.requireNonNull(jb);
        this.f25111w = jb;
        this.f25108n = jb.f25745x;
        this.f25109u = jb.isEmpty() ? -1 : 0;
        this.f25110v = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25109u >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        JB jb = this.f25111w;
        if (jb.f25745x != this.f25108n) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f25109u;
        this.f25110v = i;
        switch (this.f25112x) {
            case 0:
                obj = this.f25113y.c()[i];
                break;
            case 1:
                obj = new IB(this.f25113y, i);
                break;
            default:
                obj = this.f25113y.d()[i];
                break;
        }
        int i4 = this.f25109u + 1;
        if (i4 >= jb.f25746y) {
            i4 = -1;
        }
        this.f25109u = i4;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        JB jb = this.f25111w;
        if (jb.f25745x != this.f25108n) {
            throw new ConcurrentModificationException();
        }
        PA.U("no calls to next() since the last call to remove()", this.f25110v >= 0);
        this.f25108n += 32;
        jb.remove(jb.c()[this.f25110v]);
        this.f25109u--;
        this.f25110v = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GB(JB jb, int i) {
        this(jb, (char) 0);
        this.f25112x = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(jb);
                this.f25113y = jb;
                this(jb, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(jb);
                this.f25113y = jb;
                this(jb, (char) 0);
                break;
            default:
                Objects.requireNonNull(jb);
                this.f25113y = jb;
                break;
        }
    }
}
