package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3653nh {

    /* renamed from: e, reason: collision with root package name */
    public static final C3653nh f33535e = new C3653nh(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f33536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33537b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33538c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33539d;

    public C3653nh(int i, int i4, int i6) {
        this.f33536a = i;
        this.f33537b = i4;
        this.f33538c = i6;
        this.f33539d = AbstractC3182eu.d(i6) ? AbstractC3182eu.f(i6) * i4 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3653nh)) {
            return false;
        }
        C3653nh c3653nh = (C3653nh) obj;
        return this.f33536a == c3653nh.f33536a && this.f33537b == c3653nh.f33537b && this.f33538c == c3653nh.f33538c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f33536a), Integer.valueOf(this.f33537b), Integer.valueOf(this.f33538c));
    }

    public final String toString() {
        int i = this.f33536a;
        int length = String.valueOf(i).length();
        int i4 = this.f33537b;
        int length2 = String.valueOf(i4).length();
        int i6 = this.f33538c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i6).length() + 1);
        AbstractC5128c.g(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i4);
        return AbstractC5128c.d(i6, ", encoding=", "]", sb);
    }
}
