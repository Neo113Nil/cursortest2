package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4101wK implements CharSequence {

    /* renamed from: n, reason: collision with root package name */
    public char[] f34828n;

    /* renamed from: u, reason: collision with root package name */
    public String f34829u;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f34828n[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f34828n.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i6) {
        return new String(this.f34828n, i, i6 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f34829u == null) {
            this.f34829u = new String(this.f34828n);
        }
        return this.f34829u;
    }
}
