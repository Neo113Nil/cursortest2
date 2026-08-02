package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0631sb implements InterfaceC0720vd {
    @Override // io.appmetrica.analytics.impl.InterfaceC0720vd
    public final C0313ha a(C0138b8 c0138b8) {
        C0313ha c0313ha = null;
        if ((c0138b8 != null ? c0138b8.b : null) != null && c0138b8.c != null) {
            c0313ha = new C0313ha();
            c0313ha.b = c0138b8.b.doubleValue();
            c0313ha.a = c0138b8.c.doubleValue();
            Integer num = c0138b8.d;
            if (num != null) {
                c0313ha.g = num.intValue();
            }
            Integer num2 = c0138b8.e;
            if (num2 != null) {
                c0313ha.e = num2.intValue();
            }
            Integer num3 = c0138b8.f;
            if (num3 != null) {
                c0313ha.d = num3.intValue();
            }
            Integer num4 = c0138b8.g;
            if (num4 != null) {
                c0313ha.f = num4.intValue();
            }
            Long l = c0138b8.h;
            if (l != null) {
                c0313ha.c = l.longValue() / 1000;
            }
            String str = c0138b8.i;
            if (str != null) {
                if (str.equals("gps")) {
                    c0313ha.h = 1;
                } else if (str.equals("network")) {
                    c0313ha.h = 2;
                }
            }
            String str2 = c0138b8.j;
            if (str2 != null) {
                c0313ha.i = str2;
            }
        }
        return c0313ha;
    }
}
