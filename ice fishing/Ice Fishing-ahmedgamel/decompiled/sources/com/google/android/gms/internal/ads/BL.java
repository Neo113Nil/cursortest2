package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class BL implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f23878n;

    /* renamed from: u, reason: collision with root package name */
    public GK f23879u;

    public BL(JK jk) {
        if (!(jk instanceof CL)) {
            this.f23878n = null;
            this.f23879u = (GK) jk;
            return;
        }
        CL cl = (CL) jk;
        ArrayDeque arrayDeque = new ArrayDeque(cl.f24107z);
        this.f23878n = arrayDeque;
        arrayDeque.push(cl);
        JK jk2 = cl.f24104w;
        while (jk2 instanceof CL) {
            CL cl2 = (CL) jk2;
            this.f23878n.push(cl2);
            jk2 = cl2.f24104w;
        }
        this.f23879u = (GK) jk2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GK next() {
        GK gk;
        GK gk2 = this.f23879u;
        if (gk2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f23878n;
            gk = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            JK jk = ((CL) arrayDeque.pop()).f24105x;
            while (jk instanceof CL) {
                CL cl = (CL) jk;
                arrayDeque.push(cl);
                jk = cl.f24104w;
            }
            gk = (GK) jk;
        } while (gk.f() == 0);
        this.f23879u = gk;
        return gk2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23879u != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
