package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f24361n;

    /* renamed from: u, reason: collision with root package name */
    public int f24362u;

    /* renamed from: v, reason: collision with root package name */
    public int f24363v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GB f24364w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24365x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ GB f24366y;

    public DB(GB gb, char c9) {
        Objects.requireNonNull(gb);
        this.f24364w = gb;
        this.f24361n = gb.f24948x;
        this.f24362u = gb.isEmpty() ? -1 : 0;
        this.f24363v = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24362u >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        GB gb = this.f24364w;
        if (gb.f24948x != this.f24361n) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f24362u;
        this.f24363v = i;
        switch (this.f24365x) {
            case 0:
                obj = this.f24366y.c()[i];
                break;
            case 1:
                obj = new FB(this.f24366y, i);
                break;
            default:
                obj = this.f24366y.d()[i];
                break;
        }
        int i6 = this.f24362u + 1;
        if (i6 >= gb.f24949y) {
            i6 = -1;
        }
        this.f24362u = i6;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        GB gb = this.f24364w;
        if (gb.f24948x != this.f24361n) {
            throw new ConcurrentModificationException();
        }
        AbstractC2772Sd.I("no calls to next() since the last call to remove()", this.f24363v >= 0);
        this.f24361n += 32;
        gb.remove(gb.c()[this.f24363v]);
        this.f24362u--;
        this.f24363v = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DB(GB gb, int i) {
        this(gb, (char) 0);
        this.f24365x = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(gb);
                this.f24366y = gb;
                this(gb, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(gb);
                this.f24366y = gb;
                this(gb, (char) 0);
                break;
            default:
                Objects.requireNonNull(gb);
                this.f24366y = gb;
                break;
        }
    }
}
