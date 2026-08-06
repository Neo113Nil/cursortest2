package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506ja implements Vb {
    @Override // io.appmetrica.analytics.impl.Vb
    public final Z8 a(C0478i7 c0478i7) {
        Z8 z8 = null;
        if ((c0478i7 != null ? c0478i7.f6167b : null) != null && c0478i7.f6168c != null) {
            z8 = new Z8();
            z8.f5482b = c0478i7.f6167b.doubleValue();
            z8.f5481a = c0478i7.f6168c.doubleValue();
            Integer num = c0478i7.f6169d;
            if (num != null) {
                z8.f5487g = num.intValue();
            }
            Integer num2 = c0478i7.f6170e;
            if (num2 != null) {
                z8.f5485e = num2.intValue();
            }
            Integer num3 = c0478i7.f6171f;
            if (num3 != null) {
                z8.f5484d = num3.intValue();
            }
            Integer num4 = c0478i7.f6172g;
            if (num4 != null) {
                z8.f5486f = num4.intValue();
            }
            Long l2 = c0478i7.f6173h;
            if (l2 != null) {
                z8.f5483c = TimeUnit.MILLISECONDS.toSeconds(l2.longValue());
            }
            String str = c0478i7.f6174i;
            if (str != null) {
                if (str.equals("gps")) {
                    z8.f5488h = 1;
                } else if (str.equals("network")) {
                    z8.f5488h = 2;
                }
            }
            String str2 = c0478i7.f6175j;
            if (str2 != null) {
                z8.f5489i = str2;
            }
        }
        return z8;
    }
}
