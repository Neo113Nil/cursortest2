package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3630nh {

    /* renamed from: e, reason: collision with root package name */
    public static final C3630nh f32748e = new C3630nh(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f32749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32752d;

    public C3630nh(int i, int i6, int i9) {
        this.f32749a = i;
        this.f32750b = i6;
        this.f32751c = i9;
        this.f32752d = AbstractC3159eu.d(i9) ? AbstractC3159eu.f(i9) * i6 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3630nh)) {
            return false;
        }
        C3630nh c3630nh = (C3630nh) obj;
        return this.f32749a == c3630nh.f32749a && this.f32750b == c3630nh.f32750b && this.f32751c == c3630nh.f32751c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f32749a), Integer.valueOf(this.f32750b), Integer.valueOf(this.f32751c));
    }

    public final String toString() {
        int i = this.f32749a;
        int length = String.valueOf(i).length();
        int i6 = this.f32750b;
        int length2 = String.valueOf(i6).length();
        int i9 = this.f32751c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i9).length() + 1);
        u1.h.h(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i6);
        return u1.h.d(i9, ", encoding=", "]", sb);
    }
}
