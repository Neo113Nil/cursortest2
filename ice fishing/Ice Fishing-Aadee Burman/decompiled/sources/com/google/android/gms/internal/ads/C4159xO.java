package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4159xO {

    /* renamed from: a, reason: collision with root package name */
    public final long f35004a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3604n8 f35005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35006c;

    /* renamed from: d, reason: collision with root package name */
    public final C3676oQ f35007d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35008e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3604n8 f35009f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35010g;

    /* renamed from: h, reason: collision with root package name */
    public final C3676oQ f35011h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f35012j;

    public C4159xO(long j6, AbstractC3604n8 abstractC3604n8, int i, C3676oQ c3676oQ, long j9, AbstractC3604n8 abstractC3604n82, int i6, C3676oQ c3676oQ2, long j10, long j11) {
        this.f35004a = j6;
        this.f35005b = abstractC3604n8;
        this.f35006c = i;
        this.f35007d = c3676oQ;
        this.f35008e = j9;
        this.f35009f = abstractC3604n82;
        this.f35010g = i6;
        this.f35011h = c3676oQ2;
        this.i = j10;
        this.f35012j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4159xO.class == obj.getClass()) {
            C4159xO c4159xO = (C4159xO) obj;
            if (this.f35004a == c4159xO.f35004a && this.f35006c == c4159xO.f35006c && this.f35008e == c4159xO.f35008e && this.f35010g == c4159xO.f35010g && this.i == c4159xO.i && this.f35012j == c4159xO.f35012j && Objects.equals(this.f35005b, c4159xO.f35005b) && Objects.equals(this.f35007d, c4159xO.f35007d) && Objects.equals(this.f35009f, c4159xO.f35009f) && Objects.equals(this.f35011h, c4159xO.f35011h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f35004a), this.f35005b, Integer.valueOf(this.f35006c), this.f35007d, Long.valueOf(this.f35008e), this.f35009f, Integer.valueOf(this.f35010g), this.f35011h, Long.valueOf(this.i), Long.valueOf(this.f35012j));
    }
}
