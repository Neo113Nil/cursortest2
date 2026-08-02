package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class F implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public String f36278n;

    /* renamed from: v, reason: collision with root package name */
    public final String f36280v;

    /* renamed from: u, reason: collision with root package name */
    public int f36279u = 2;

    /* renamed from: w, reason: collision with root package name */
    public int f36281w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f36282x = Integer.MAX_VALUE;

    public F(String str) {
        this.f36280v = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4 = this.f36279u;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int i6 = i4 - 1;
        String str = null;
        if (i4 == 0) {
            throw null;
        }
        if (i6 == 0) {
            return true;
        }
        if (i6 != 2) {
            this.f36279u = 4;
            int i9 = this.f36281w;
            while (true) {
                int i10 = this.f36281w;
                if (i10 == -1) {
                    this.f36279u = 3;
                    break;
                }
                String str2 = this.f36280v;
                int length = str2.length();
                E.d(i10, length);
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    if (str2.charAt(i10) == ',') {
                        break;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    i10 = str2.length();
                    this.f36281w = -1;
                    i = -1;
                } else {
                    i = i10 + 1;
                    this.f36281w = i;
                }
                if (i == i9) {
                    int i11 = i + 1;
                    this.f36281w = i11;
                    if (i11 > str2.length()) {
                        this.f36281w = -1;
                    }
                } else {
                    if (i9 < i10) {
                        str2.charAt(i9);
                    }
                    if (i9 < i10) {
                        str2.charAt(i10 - 1);
                    }
                    int i12 = this.f36282x;
                    if (i12 == 1) {
                        i10 = str2.length();
                        this.f36281w = -1;
                        if (i10 > i9) {
                            str2.charAt(i10 - 1);
                        }
                    } else {
                        this.f36282x = i12 - 1;
                    }
                    str = str2.subSequence(i9, i10).toString();
                }
            }
            this.f36278n = str;
            if (this.f36279u != 3) {
                this.f36279u = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36279u = 2;
        String str = this.f36278n;
        this.f36278n = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
