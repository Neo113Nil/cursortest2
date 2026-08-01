package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3070dB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public String f29719n;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f29721v;

    /* renamed from: w, reason: collision with root package name */
    public final QA f29722w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f29723x;

    /* renamed from: u, reason: collision with root package name */
    public int f29720u = 2;

    /* renamed from: y, reason: collision with root package name */
    public int f29724y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f29725z = Integer.MAX_VALUE;

    public AbstractC3070dB(com.bumptech.glide.manager.p pVar, CharSequence charSequence) {
        this.f29722w = (QA) pVar.f23470v;
        this.f29723x = pVar.f23469u;
        this.f29721v = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int a9;
        CharSequence charSequence;
        int b9;
        QA qa;
        AbstractC2772Sd.H(this.f29720u != 4);
        int i = this.f29720u;
        int i6 = i - 1;
        String str = null;
        if (i == 0) {
            throw null;
        }
        if (i6 == 0) {
            return true;
        }
        if (i6 != 2) {
            this.f29720u = 4;
            int i9 = this.f29724y;
            while (true) {
                int i10 = this.f29724y;
                if (i10 == -1) {
                    this.f29720u = 3;
                    break;
                }
                a9 = a(i10);
                charSequence = this.f29721v;
                if (a9 == -1) {
                    a9 = charSequence.length();
                    this.f29724y = -1;
                    b9 = -1;
                } else {
                    b9 = b(a9);
                    this.f29724y = b9;
                }
                if (b9 == i9) {
                    int i11 = b9 + 1;
                    this.f29724y = i11;
                    if (i11 > charSequence.length()) {
                        this.f29724y = -1;
                    }
                } else {
                    while (true) {
                        qa = this.f29722w;
                        if (i9 >= a9 || !qa.b(charSequence.charAt(i9))) {
                            break;
                        }
                        i9++;
                    }
                    while (a9 > i9) {
                        int i12 = a9 - 1;
                        if (!qa.b(charSequence.charAt(i12))) {
                            break;
                        }
                        a9 = i12;
                    }
                    if (!this.f29723x || i9 != a9) {
                        break;
                    }
                    i9 = this.f29724y;
                }
            }
            int i13 = this.f29725z;
            if (i13 == 1) {
                a9 = charSequence.length();
                this.f29724y = -1;
                while (a9 > i9) {
                    int i14 = a9 - 1;
                    if (!qa.b(charSequence.charAt(i14))) {
                        break;
                    }
                    a9 = i14;
                }
            } else {
                this.f29725z = i13 - 1;
            }
            str = charSequence.subSequence(i9, a9).toString();
            this.f29719n = str;
            if (this.f29720u != 3) {
                this.f29720u = 1;
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
        this.f29720u = 2;
        String str = this.f29719n;
        this.f29719n = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
