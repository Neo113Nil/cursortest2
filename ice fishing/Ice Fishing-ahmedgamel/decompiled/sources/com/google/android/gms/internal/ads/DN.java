package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class DN extends Exception {

    /* renamed from: A, reason: collision with root package name */
    public final C3676oQ f24384A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f24385B;

    /* renamed from: n, reason: collision with root package name */
    public final int f24386n;

    /* renamed from: u, reason: collision with root package name */
    public final long f24387u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24388v;

    /* renamed from: w, reason: collision with root package name */
    public final String f24389w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24390x;

    /* renamed from: y, reason: collision with root package name */
    public final DP f24391y;

    /* renamed from: z, reason: collision with root package name */
    public final int f24392z;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public DN(int i, Exception exc, int i6) {
        this(i, exc, i6, null, -1, null, 4, null, false);
    }

    public final DN a(C3676oQ c3676oQ) {
        String message = getMessage();
        String str = AbstractC3159eu.f29993a;
        return new DN(message, getCause(), this.f24386n, this.f24388v, this.f24389w, this.f24390x, this.f24391y, this.f24392z, c3676oQ, this.f24387u, this.f24385B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DN(int i, Exception exc, int i6, String str, int i9, DP dp, int i10, C3676oQ c3676oQ, boolean z3) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), exc, i6, i, r5, r6, dp, i10, c3676oQ, SystemClock.elapsedRealtime(), z3);
        String str2;
        int i11;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i11 = i9;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
            str2 = str;
            i11 = i9;
        } else {
            String valueOf = String.valueOf(dp);
            String str5 = AbstractC3159eu.f29993a;
            if (i10 == 0) {
                str4 = "NO";
            } else if (i10 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i10 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + valueOf.length() + u1.h.a(String.valueOf(str).length() + 14, 9, String.valueOf(i9)) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i11 = i9;
            sb.append(i11);
            sb.append(", format=");
            str3 = D.y.s(sb, valueOf, ", format_supported=", str4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DN(String str, Throwable th, int i, int i6, String str2, int i9, DP dp, int i10, C3676oQ c3676oQ, long j6, boolean z3) {
        super(str, th);
        boolean z6;
        Bundle bundle = Bundle.EMPTY;
        this.f24386n = i;
        this.f24387u = j6;
        if (!z3) {
            z6 = true;
        } else if (i6 == 1) {
            i6 = 1;
            z6 = true;
        } else {
            z6 = false;
        }
        AbstractC2772Sd.i(z6);
        AbstractC2772Sd.i(th != null);
        this.f24388v = i6;
        this.f24389w = str2;
        this.f24390x = i9;
        this.f24391y = dp;
        this.f24392z = i10;
        this.f24384A = c3676oQ;
        this.f24385B = z3;
    }
}
