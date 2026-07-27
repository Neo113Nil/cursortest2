package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class SL implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27531n = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f27532u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27533v;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f27534w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f27535x;

    public /* synthetic */ SL(QL ql) {
        Objects.requireNonNull(ql);
        this.f27535x = ql;
        this.f27532u = -1;
    }

    public final Iterator a() {
        switch (this.f27531n) {
            case 0:
                if (this.f27534w == null) {
                    this.f27534w = ((QL) this.f27535x).f27144v.entrySet().iterator();
                }
                break;
            default:
                if (this.f27534w == null) {
                    this.f27534w = ((com.google.android.gms.internal.consent_sdk.K2) this.f27535x).f35722v.entrySet().iterator();
                }
                break;
        }
        return this.f27534w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27531n) {
            case 0:
                int i = this.f27532u + 1;
                QL ql = (QL) this.f27535x;
                if (i >= ql.f27143u) {
                    if (ql.f27144v.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                int i4 = this.f27532u + 1;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) this.f27535x;
                if (i4 >= k22.f35721u) {
                    if (k22.f35722v.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f27531n) {
            case 0:
                this.f27533v = true;
                int i = this.f27532u + 1;
                this.f27532u = i;
                QL ql = (QL) this.f27535x;
                if (i >= ql.f27143u) {
                    break;
                } else {
                    break;
                }
            default:
                this.f27533v = true;
                int i4 = this.f27532u + 1;
                this.f27532u = i4;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) this.f27535x;
                if (i4 >= k22.f35721u) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f27535x;
        switch (this.f27531n) {
            case 0:
                if (!this.f27533v) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f27533v = false;
                QL ql = (QL) abstractMap;
                ql.f();
                int i = this.f27532u;
                if (i >= ql.f27143u) {
                    a().remove();
                    return;
                } else {
                    this.f27532u = i - 1;
                    ql.d(i);
                    return;
                }
            default:
                if (!this.f27533v) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f27533v = false;
                int i4 = com.google.android.gms.internal.consent_sdk.K2.f35719z;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) abstractMap;
                k22.g();
                int i9 = this.f27532u;
                if (i9 >= k22.f35721u) {
                    a().remove();
                    return;
                } else {
                    this.f27532u = i9 - 1;
                    k22.e(i9);
                    return;
                }
        }
    }

    public /* synthetic */ SL(com.google.android.gms.internal.consent_sdk.K2 k22) {
        Objects.requireNonNull(k22);
        this.f27535x = k22;
        this.f27532u = -1;
    }
}
