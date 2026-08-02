package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Objects;
import java.util.Set;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class JO {

    /* renamed from: d, reason: collision with root package name */
    public static final JO f26432d;

    /* renamed from: a, reason: collision with root package name */
    public final int f26433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26434b;

    /* renamed from: c, reason: collision with root package name */
    public final XB f26435c;

    static {
        JO jo;
        if (Build.VERSION.SDK_INT >= 33) {
            WB wb = new WB(4);
            for (int i = 1; i <= 10; i++) {
                wb.f(Integer.valueOf(AbstractC3182eu.e(i)));
            }
            jo = new JO(2, wb.h());
        } else {
            jo = new JO(2, 10);
        }
        f26432d = jo;
    }

    public JO(int i, int i4) {
        this.f26433a = i;
        this.f26434b = i4;
        this.f26435c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JO)) {
            return false;
        }
        JO jo = (JO) obj;
        return this.f26433a == jo.f26433a && this.f26434b == jo.f26434b && Objects.equals(this.f26435c, jo.f26435c);
    }

    public final int hashCode() {
        XB xb = this.f26435c;
        return (((this.f26433a * 31) + this.f26434b) * 31) + (xb == null ? 0 : xb.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26435c);
        int i = this.f26433a;
        int length = String.valueOf(i).length();
        int i4 = this.f26434b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i4).length() + 15 + valueOf.length() + 1);
        AbstractC5128c.g(sb, "AudioProfile[format=", i, ", maxChannelCount=", i4);
        return D.x.p(sb, ", channelMasks=", valueOf, "]");
    }

    public JO(int i, Set set) {
        this.f26433a = i;
        XB k9 = XB.k(set);
        this.f26435c = k9;
        AbstractC4278zC a9 = k9.a();
        int i4 = 0;
        while (a9.hasNext()) {
            i4 = Math.max(i4, Integer.bitCount(((Integer) a9.next()).intValue()));
        }
        this.f26434b = i4;
    }
}
