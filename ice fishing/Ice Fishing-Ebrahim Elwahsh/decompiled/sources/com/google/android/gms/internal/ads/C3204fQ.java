package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.fQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3204fQ {

    /* renamed from: a, reason: collision with root package name */
    public final String f30702a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30703b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30704c;

    public C3204fQ(String str, boolean z8, boolean z9) {
        this.f30702a = str;
        this.f30703b = z8;
        this.f30704c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C3204fQ.class) {
            return false;
        }
        C3204fQ c3204fQ = (C3204fQ) obj;
        return TextUtils.equals(this.f30702a, c3204fQ.f30702a) && this.f30703b == c3204fQ.f30703b && this.f30704c == c3204fQ.f30704c;
    }

    public final int hashCode() {
        return ((((this.f30702a.hashCode() + 31) * 31) + (true != this.f30703b ? 1237 : 1231)) * 31) + (true != this.f30704c ? 1237 : 1231);
    }
}
