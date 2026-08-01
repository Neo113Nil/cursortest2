package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class HL implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25259n = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f25260u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25261v;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f25262w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f25263x;

    public /* synthetic */ HL(FL fl) {
        Objects.requireNonNull(fl);
        this.f25263x = fl;
        this.f25260u = -1;
    }

    public final Iterator a() {
        switch (this.f25259n) {
            case 0:
                if (this.f25262w == null) {
                    this.f25262w = ((FL) this.f25263x).f24792v.entrySet().iterator();
                }
                break;
            default:
                if (this.f25262w == null) {
                    this.f25262w = ((com.google.android.gms.internal.consent_sdk.K2) this.f25263x).f35559v.entrySet().iterator();
                }
                break;
        }
        return this.f25262w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25259n) {
            case 0:
                int i = this.f25260u + 1;
                FL fl = (FL) this.f25263x;
                if (i >= fl.f24791u) {
                    if (fl.f24792v.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                int i6 = this.f25260u + 1;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) this.f25263x;
                if (i6 >= k22.f35558u) {
                    if (k22.f35559v.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f25259n) {
            case 0:
                this.f25261v = true;
                int i = this.f25260u + 1;
                this.f25260u = i;
                FL fl = (FL) this.f25263x;
                if (i >= fl.f24791u) {
                    break;
                } else {
                    break;
                }
            default:
                this.f25261v = true;
                int i6 = this.f25260u + 1;
                this.f25260u = i6;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) this.f25263x;
                if (i6 >= k22.f35558u) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f25263x;
        switch (this.f25259n) {
            case 0:
                if (!this.f25261v) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f25261v = false;
                FL fl = (FL) abstractMap;
                fl.e();
                int i = this.f25260u;
                if (i >= fl.f24791u) {
                    a().remove();
                    return;
                }
                this.f25260u = i - 1;
                fl.e();
                Object[] objArr = fl.f24790n;
                Object obj = ((GL) objArr[i]).f24968n;
                System.arraycopy(objArr, i + 1, objArr, i, (fl.f24791u - i) - 1);
                fl.f24791u--;
                if (fl.f24792v.isEmpty()) {
                    return;
                }
                Iterator it = fl.f().entrySet().iterator();
                Object[] objArr2 = fl.f24790n;
                int i6 = fl.f24791u;
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                objArr2[i6] = new GL(fl, entry.getValue());
                fl.f24791u++;
                it.remove();
                return;
            default:
                if (!this.f25261v) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f25261v = false;
                int i9 = com.google.android.gms.internal.consent_sdk.K2.f35556z;
                com.google.android.gms.internal.consent_sdk.K2 k22 = (com.google.android.gms.internal.consent_sdk.K2) abstractMap;
                k22.g();
                int i10 = this.f25260u;
                if (i10 >= k22.f35558u) {
                    a().remove();
                    return;
                } else {
                    this.f25260u = i10 - 1;
                    k22.e(i10);
                    return;
                }
        }
    }

    public /* synthetic */ HL(com.google.android.gms.internal.consent_sdk.K2 k22) {
        Objects.requireNonNull(k22);
        this.f25263x = k22;
        this.f25260u = -1;
    }
}
