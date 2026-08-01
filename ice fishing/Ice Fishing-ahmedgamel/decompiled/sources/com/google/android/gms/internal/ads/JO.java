package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class JO {

    /* renamed from: d, reason: collision with root package name */
    public static final JO f25679d;

    /* renamed from: a, reason: collision with root package name */
    public final int f25680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25681b;

    /* renamed from: c, reason: collision with root package name */
    public final XB f25682c;

    static {
        JO jo;
        if (Build.VERSION.SDK_INT >= 33) {
            WB wb = new WB(4);
            for (int i = 1; i <= 10; i++) {
                wb.f(Integer.valueOf(AbstractC3159eu.e(i)));
            }
            jo = new JO(2, wb.h());
        } else {
            jo = new JO(2, 10);
        }
        f25679d = jo;
    }

    public JO(int i, int i6) {
        this.f25680a = i;
        this.f25681b = i6;
        this.f25682c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JO)) {
            return false;
        }
        JO jo = (JO) obj;
        return this.f25680a == jo.f25680a && this.f25681b == jo.f25681b && Objects.equals(this.f25682c, jo.f25682c);
    }

    public final int hashCode() {
        XB xb = this.f25682c;
        return (((this.f25680a * 31) + this.f25681b) * 31) + (xb == null ? 0 : xb.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25682c);
        int i = this.f25680a;
        int length = String.valueOf(i).length();
        int i6 = this.f25681b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i6).length() + 15 + valueOf.length() + 1);
        u1.h.h(sb, "AudioProfile[format=", i, ", maxChannelCount=", i6);
        return D.y.s(sb, ", channelMasks=", valueOf, "]");
    }

    public JO(int i, Set set) {
        this.f25680a = i;
        XB k9 = XB.k(set);
        this.f25682c = k9;
        AbstractC4255zC a9 = k9.a();
        int i6 = 0;
        while (a9.hasNext()) {
            i6 = Math.max(i6, Integer.bitCount(((Integer) a9.next()).intValue()));
        }
        this.f25681b = i6;
    }
}
