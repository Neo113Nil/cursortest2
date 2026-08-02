package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC2923a2 implements N1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29100b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29102d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29103e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29104f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2923a2[] f29105g;

    public W1(String str, int i, int i4, long j6, long j9, AbstractC2923a2[] abstractC2923a2Arr) {
        super(com.anythink.basead.exoplayer.g.b.c.f8071a);
        String str2;
        AbstractC2792Sd.i(i <= i4);
        this.f29100b = str;
        this.f29101c = i;
        this.f29102d = i4;
        int length = abstractC2923a2Arr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                str2 = null;
                break;
            }
            AbstractC2923a2 abstractC2923a2 = abstractC2923a2Arr[i6];
            if (abstractC2923a2 instanceof C3245g2) {
                C3245g2 c3245g2 = (C3245g2) abstractC2923a2;
                if (c3245g2.f29779a.equals("TIT2")) {
                    RB rb = c3245g2.f31258c;
                    if (!rb.isEmpty()) {
                        str2 = (String) rb.get(0);
                        break;
                    }
                } else {
                    continue;
                }
            }
            i6++;
        }
        if (str2 != null) {
            new C3323hQ(null, str2);
        }
        this.f29103e = j6;
        this.f29104f = j9;
        this.f29105g = abstractC2923a2Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W1.class == obj.getClass()) {
            W1 w12 = (W1) obj;
            if (this.f29101c == w12.f29101c && this.f29102d == w12.f29102d && this.f29103e == w12.f29103e && this.f29104f == w12.f29104f && Objects.equals(this.f29100b, w12.f29100b) && Arrays.equals(this.f29105g, w12.f29105g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29100b.hashCode() + ((((((((this.f29101c + 527) * 31) + this.f29102d) * 31) + ((int) this.f29103e)) * 31) + ((int) this.f29104f)) * 31);
    }
}
