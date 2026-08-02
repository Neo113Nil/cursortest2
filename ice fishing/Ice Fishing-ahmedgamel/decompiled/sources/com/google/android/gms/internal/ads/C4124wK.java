package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4124wK implements CharSequence {

    /* renamed from: n, reason: collision with root package name */
    public char[] f35597n;

    /* renamed from: u, reason: collision with root package name */
    public String f35598u;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f35597n[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35597n.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new String(this.f35597n, i, i4 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f35598u == null) {
            this.f35598u = new String(this.f35597n);
        }
        return this.f35598u;
    }
}
