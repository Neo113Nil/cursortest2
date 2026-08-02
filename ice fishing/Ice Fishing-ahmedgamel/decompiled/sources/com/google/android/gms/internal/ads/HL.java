package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class HL implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26031n = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f26032u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26033v;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f26034w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f26035x;

    public /* synthetic */ HL(FL fl) {
        Objects.requireNonNull(fl);
        this.f26035x = fl;
        this.f26032u = -1;
    }

    public final Iterator a() {
        switch (this.f26031n) {
            case 0:
                if (this.f26034w == null) {
                    this.f26034w = ((FL) this.f26035x).f25548v.entrySet().iterator();
                }
                break;
            default:
                if (this.f26034w == null) {
                    this.f26034w = ((com.google.android.gms.internal.consent_sdk.K2) this.f26035x).f36328v.entrySet().iterator();
                }
                break;
        }
        return this.f26034w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26031n) {
            case 0:
                int i = this.f26032u + 1;
                FL fl = (FL) this.f26035x;
                if (i >= fl.f25547u) {
                    if (fl.f25548v.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                int i4 = this.f26032u + 1;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) this.f26035x;
                if (i4 >= k22.f36327u) {
                    if (k22.f36328v.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f26031n) {
            case 0:
                this.f26033v = true;
                int i = this.f26032u + 1;
                this.f26032u = i;
                FL fl = (FL) this.f26035x;
                if (i >= fl.f25547u) {
                    break;
                } else {
                    break;
                }
            default:
                this.f26033v = true;
                int i4 = this.f26032u + 1;
                this.f26032u = i4;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) this.f26035x;
                if (i4 >= k22.f36327u) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f26035x;
        switch (this.f26031n) {
            case 0:
                if (!this.f26033v) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f26033v = false;
                FL fl = (FL) abstractMap;
                fl.e();
                int i = this.f26032u;
                if (i >= fl.f25547u) {
                    a().remove();
                    return;
                }
                this.f26032u = i - 1;
                fl.e();
                Object[] objArr = fl.f25546n;
                Object obj = ((GL) objArr[i]).f25758n;
                System.arraycopy(objArr, i + 1, objArr, i, (fl.f25547u - i) - 1);
                fl.f25547u--;
                if (fl.f25548v.isEmpty()) {
                    return;
                }
                Iterator it = fl.f().entrySet().iterator();
                Object[] objArr2 = fl.f25546n;
                int i4 = fl.f25547u;
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                objArr2[i4] = new GL(fl, entry.getValue());
                fl.f25547u++;
                it.remove();
                return;
            default:
                if (!this.f26033v) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f26033v = false;
                int i6 = com.google.android.gms.internal.consent_sdk.K2.f36325z;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) abstractMap;
                k22.g();
                int i9 = this.f26032u;
                if (i9 >= k22.f36327u) {
                    a().remove();
                    return;
                } else {
                    this.f26032u = i9 - 1;
                    k22.e(i9);
                    return;
                }
        }
    }

    public /* synthetic */ HL(com.google.android.gms.internal.consent_sdk.K2 k22) {
        Objects.requireNonNull(k22);
        this.f26035x = k22;
        this.f26032u = -1;
    }
}
