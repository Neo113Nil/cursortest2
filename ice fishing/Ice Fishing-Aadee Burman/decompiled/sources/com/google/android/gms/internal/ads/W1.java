package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class W1 extends AbstractC2900a2 implements N1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28304d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28305e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28306f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2900a2[] f28307g;

    public W1(String str, int i, int i6, long j6, long j9, AbstractC2900a2[] abstractC2900a2Arr) {
        super(com.anythink.basead.exoplayer.g.b.c.f7285a);
        String str2;
        AbstractC2772Sd.i(i <= i6);
        this.f28302b = str;
        this.f28303c = i;
        this.f28304d = i6;
        int length = abstractC2900a2Arr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str2 = null;
                break;
            }
            AbstractC2900a2 abstractC2900a2 = abstractC2900a2Arr[i9];
            if (abstractC2900a2 instanceof C3222g2) {
                C3222g2 c3222g2 = (C3222g2) abstractC2900a2;
                if (c3222g2.f29009a.equals("TIT2")) {
                    RB rb = c3222g2.f30492c;
                    if (!rb.isEmpty()) {
                        str2 = (String) rb.get(0);
                        break;
                    }
                } else {
                    continue;
                }
            }
            i9++;
        }
        if (str2 != null) {
            new C3138eQ(null, str2);
        }
        this.f28305e = j6;
        this.f28306f = j9;
        this.f28307g = abstractC2900a2Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W1.class == obj.getClass()) {
            W1 w12 = (W1) obj;
            if (this.f28303c == w12.f28303c && this.f28304d == w12.f28304d && this.f28305e == w12.f28305e && this.f28306f == w12.f28306f && Objects.equals(this.f28302b, w12.f28302b) && Arrays.equals(this.f28307g, w12.f28307g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28302b.hashCode() + ((((((((this.f28303c + 527) * 31) + this.f28304d) * 31) + ((int) this.f28305e)) * 31) + ((int) this.f28306f)) * 31);
    }
}
