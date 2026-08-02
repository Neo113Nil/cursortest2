package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3093dB implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public String f30491n;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f30493v;

    /* renamed from: w, reason: collision with root package name */
    public final QA f30494w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f30495x;

    /* renamed from: u, reason: collision with root package name */
    public int f30492u = 2;

    /* renamed from: y, reason: collision with root package name */
    public int f30496y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f30497z = Integer.MAX_VALUE;

    public AbstractC3093dB(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        this.f30494w = (QA) oVar.f24255v;
        this.f30495x = oVar.f24254u;
        this.f30493v = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int a9;
        CharSequence charSequence;
        int b9;
        QA qa;
        AbstractC2792Sd.H(this.f30492u != 4);
        int i = this.f30492u;
        int i4 = i - 1;
        String str = null;
        if (i == 0) {
            throw null;
        }
        if (i4 == 0) {
            return true;
        }
        if (i4 != 2) {
            this.f30492u = 4;
            int i6 = this.f30496y;
            while (true) {
                int i9 = this.f30496y;
                if (i9 == -1) {
                    this.f30492u = 3;
                    break;
                }
                a9 = a(i9);
                charSequence = this.f30493v;
                if (a9 == -1) {
                    a9 = charSequence.length();
                    this.f30496y = -1;
                    b9 = -1;
                } else {
                    b9 = b(a9);
                    this.f30496y = b9;
                }
                if (b9 == i6) {
                    int i10 = b9 + 1;
                    this.f30496y = i10;
                    if (i10 > charSequence.length()) {
                        this.f30496y = -1;
                    }
                } else {
                    while (true) {
                        qa = this.f30494w;
                        if (i6 >= a9 || !qa.b(charSequence.charAt(i6))) {
                            break;
                        }
                        i6++;
                    }
                    while (a9 > i6) {
                        int i11 = a9 - 1;
                        if (!qa.b(charSequence.charAt(i11))) {
                            break;
                        }
                        a9 = i11;
                    }
                    if (!this.f30495x || i6 != a9) {
                        break;
                    }
                    i6 = this.f30496y;
                }
            }
            int i12 = this.f30497z;
            if (i12 == 1) {
                a9 = charSequence.length();
                this.f30496y = -1;
                while (a9 > i6) {
                    int i13 = a9 - 1;
                    if (!qa.b(charSequence.charAt(i13))) {
                        break;
                    }
                    a9 = i13;
                }
            } else {
                this.f30497z = i12 - 1;
            }
            str = charSequence.subSequence(i6, a9).toString();
            this.f30491n = str;
            if (this.f30492u != 3) {
                this.f30492u = 1;
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
        this.f30492u = 2;
        String str = this.f30491n;
        this.f30491n = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
