package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class DN extends Exception {

    /* renamed from: A, reason: collision with root package name */
    public final C3860rQ f25129A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f25130B;

    /* renamed from: n, reason: collision with root package name */
    public final int f25131n;

    /* renamed from: u, reason: collision with root package name */
    public final long f25132u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25133v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25134w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25135x;

    /* renamed from: y, reason: collision with root package name */
    public final DP f25136y;

    /* renamed from: z, reason: collision with root package name */
    public final int f25137z;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public DN(int i, Exception exc, int i4) {
        this(i, exc, i4, null, -1, null, 4, null, false);
    }

    public final DN a(C3860rQ c3860rQ) {
        String message = getMessage();
        String str = AbstractC3182eu.f30782a;
        return new DN(message, getCause(), this.f25131n, this.f25133v, this.f25134w, this.f25135x, this.f25136y, this.f25137z, c3860rQ, this.f25132u, this.f25130B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DN(int i, Exception exc, int i4, String str, int i6, DP dp, int i9, C3860rQ c3860rQ, boolean z6) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), exc, i4, i, r5, r6, dp, i9, c3860rQ, SystemClock.elapsedRealtime(), z6);
        String str2;
        int i10;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i10 = i6;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
            str2 = str;
            i10 = i6;
        } else {
            String valueOf = String.valueOf(dp);
            String str5 = AbstractC3182eu.f30782a;
            if (i9 == 0) {
                str4 = "NO";
            } else if (i9 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i9 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i9 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + valueOf.length() + AbstractC5128c.j(String.valueOf(str).length() + 14, 9, String.valueOf(i6)) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i10 = i6;
            sb.append(i10);
            sb.append(", format=");
            str3 = D.x.p(sb, valueOf, ", format_supported=", str4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DN(String str, Throwable th, int i, int i4, String str2, int i6, DP dp, int i9, C3860rQ c3860rQ, long j6, boolean z6) {
        super(str, th);
        boolean z9;
        Bundle bundle = Bundle.EMPTY;
        this.f25131n = i;
        this.f25132u = j6;
        if (!z6) {
            z9 = true;
        } else if (i4 == 1) {
            i4 = 1;
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC2792Sd.i(z9);
        AbstractC2792Sd.i(th != null);
        this.f25133v = i4;
        this.f25134w = str2;
        this.f25135x = i6;
        this.f25136y = dp;
        this.f25137z = i9;
        this.f25129A = c3860rQ;
        this.f25130B = z6;
    }
}
