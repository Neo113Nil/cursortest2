package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2933aC extends AbstractC4278zC {

    /* renamed from: u, reason: collision with root package name */
    public Object f29801u;

    /* renamed from: v, reason: collision with root package name */
    public int f29802v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29803w;

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f29804x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29805y;

    public C2933aC() {
        super(0);
        this.f29802v = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        AbstractC2792Sd.H(this.f29802v != 4);
        int i = this.f29802v;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            return true;
        }
        if (i4 != 2) {
            this.f29802v = 4;
            switch (this.f29803w) {
                case 0:
                    do {
                        Iterator it = this.f29804x;
                        if (!it.hasNext()) {
                            this.f29802v = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((XA) this.f29805y).a(next));
                default:
                    do {
                        Iterator it2 = this.f29804x;
                        if (!it2.hasNext()) {
                            this.f29802v = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((XB) this.f29805y).contains(next));
            }
            this.f29801u = next;
            if (this.f29802v != 3) {
                this.f29802v = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4278zC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f29802v = 2;
        Object obj = this.f29801u;
        this.f29801u = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2933aC(C3954tC c3954tC, XB xb, XB xb2) {
        this();
        this.f29803w = 1;
        this.f29805y = xb2;
        Objects.requireNonNull(c3954tC);
        this.f29804x = xb.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2933aC(Iterator it, XA xa) {
        this();
        this.f29803w = 0;
        this.f29804x = it;
        this.f29805y = xa;
    }
}
