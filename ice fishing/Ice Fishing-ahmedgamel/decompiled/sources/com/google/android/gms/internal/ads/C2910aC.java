package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.aC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2910aC extends AbstractC4255zC {

    /* renamed from: u, reason: collision with root package name */
    public Object f29031u;

    /* renamed from: v, reason: collision with root package name */
    public int f29032v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29033w;

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f29034x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29035y;

    public C2910aC() {
        super(0);
        this.f29032v = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        AbstractC2772Sd.H(this.f29032v != 4);
        int i = this.f29032v;
        int i6 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i6 == 0) {
            return true;
        }
        if (i6 != 2) {
            this.f29032v = 4;
            switch (this.f29033w) {
                case 0:
                    do {
                        Iterator it = this.f29034x;
                        if (!it.hasNext()) {
                            this.f29032v = 3;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((XA) this.f29035y).a(next));
                default:
                    do {
                        Iterator it2 = this.f29034x;
                        if (!it2.hasNext()) {
                            this.f29032v = 3;
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                        }
                    } while (!((XB) this.f29035y).contains(next));
            }
            this.f29031u = next;
            if (this.f29032v != 3) {
                this.f29032v = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4255zC, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f29032v = 2;
        Object obj = this.f29031u;
        this.f29031u = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2910aC(C3931tC c3931tC, XB xb, XB xb2) {
        this();
        this.f29033w = 1;
        this.f29035y = xb2;
        Objects.requireNonNull(c3931tC);
        this.f29034x = xb.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2910aC(Iterator it, XA xa) {
        this();
        this.f29033w = 0;
        this.f29034x = it;
        this.f29035y = xa;
    }
}
