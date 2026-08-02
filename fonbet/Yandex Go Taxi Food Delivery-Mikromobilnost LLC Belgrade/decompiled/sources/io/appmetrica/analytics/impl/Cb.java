package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Cb implements Ld {
    @Override // io.appmetrica.analytics.impl.Ld
    public final C0589oa a(C0327f8 c0327f8) {
        C0589oa c0589oa = null;
        if ((c0327f8 != null ? c0327f8.b : null) != null && c0327f8.c != null) {
            c0589oa = new C0589oa();
            c0589oa.b = c0327f8.b.doubleValue();
            c0589oa.a = c0327f8.c.doubleValue();
            Integer num = c0327f8.d;
            if (num != null) {
                c0589oa.g = num.intValue();
            }
            Integer num2 = c0327f8.e;
            if (num2 != null) {
                c0589oa.e = num2.intValue();
            }
            Integer num3 = c0327f8.f;
            if (num3 != null) {
                c0589oa.d = num3.intValue();
            }
            Integer num4 = c0327f8.g;
            if (num4 != null) {
                c0589oa.f = num4.intValue();
            }
            Long l = c0327f8.h;
            if (l != null) {
                c0589oa.c = l.longValue() / 1000;
            }
            String str = c0327f8.i;
            if (str != null) {
                if (str.equals("gps")) {
                    c0589oa.h = 1;
                } else if (str.equals("network")) {
                    c0589oa.h = 2;
                }
            }
            String str2 = c0327f8.j;
            if (str2 != null) {
                c0589oa.i = str2;
            }
        }
        return c0589oa;
    }
}
