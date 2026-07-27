package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.hB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3298hB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public String f31209n;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f31211v;

    /* renamed from: w, reason: collision with root package name */
    public final UA f31212w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f31213x;

    /* renamed from: u, reason: collision with root package name */
    public int f31210u = 2;

    /* renamed from: y, reason: collision with root package name */
    public int f31214y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f31215z = Integer.MAX_VALUE;

    public AbstractC3298hB(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        this.f31212w = (UA) oVar.f23624v;
        this.f31213x = oVar.f23623u;
        this.f31211v = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int a9;
        CharSequence charSequence;
        int b9;
        UA ua;
        PA.T(this.f31210u != 4);
        int i = this.f31210u;
        int i4 = i - 1;
        String str = null;
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            return true;
        }
        if (i4 != 2) {
            this.f31210u = 4;
            int i9 = this.f31214y;
            while (true) {
                int i10 = this.f31214y;
                if (i10 == -1) {
                    this.f31210u = 3;
                    break;
                }
                a9 = a(i10);
                charSequence = this.f31211v;
                if (a9 == -1) {
                    a9 = charSequence.length();
                    this.f31214y = -1;
                    b9 = -1;
                } else {
                    b9 = b(a9);
                    this.f31214y = b9;
                }
                if (b9 == i9) {
                    int i11 = b9 + 1;
                    this.f31214y = i11;
                    if (i11 > charSequence.length()) {
                        this.f31214y = -1;
                    }
                } else {
                    while (true) {
                        ua = this.f31212w;
                        if (i9 >= a9 || !ua.a(charSequence.charAt(i9))) {
                            break;
                        }
                        i9++;
                    }
                    while (a9 > i9) {
                        int i12 = a9 - 1;
                        if (!ua.a(charSequence.charAt(i12))) {
                            break;
                        }
                        a9 = i12;
                    }
                    if (!this.f31213x || i9 != a9) {
                        break;
                    }
                    i9 = this.f31214y;
                }
            }
            int i13 = this.f31215z;
            if (i13 == 1) {
                a9 = charSequence.length();
                this.f31214y = -1;
                while (a9 > i9) {
                    int i14 = a9 - 1;
                    if (!ua.a(charSequence.charAt(i14))) {
                        break;
                    }
                    a9 = i14;
                }
            } else {
                this.f31215z = i13 - 1;
            }
            str = charSequence.subSequence(i9, a9).toString();
            this.f31209n = str;
            if (this.f31210u != 3) {
                this.f31210u = 1;
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
        this.f31210u = 2;
        String str = this.f31209n;
        this.f31209n = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
