package io.appmetrica.analytics.locationinternal.impl;

import java.util.Comparator;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0995w implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0966m c0966m = (C0966m) obj;
        C0966m c0966m2 = (C0966m) obj2;
        if (c0966m != c0966m2) {
            if (((c0966m2 == null) ^ (c0966m == null)) || c0966m.h != c0966m2.h || c0966m.i != c0966m2.i) {
                return 10;
            }
            Integer num = c0966m.b;
            Integer num2 = c0966m2.b;
            if (num != null) {
                if (!num.equals(num2)) {
                    return 10;
                }
            } else if (num2 != null) {
                return 10;
            }
            Integer num3 = c0966m.c;
            Integer num4 = c0966m2.c;
            if (num3 != null) {
                if (!num3.equals(num4)) {
                    return 10;
                }
            } else if (num4 != null) {
                return 10;
            }
            Integer num5 = c0966m.d;
            Integer num6 = c0966m2.d;
            if (num5 != null) {
                if (!num5.equals(num6)) {
                    return 10;
                }
            } else if (num6 != null) {
                return 10;
            }
            Integer num7 = c0966m.e;
            Integer num8 = c0966m2.e;
            if (num7 != null) {
                if (!num7.equals(num8)) {
                    return 10;
                }
            } else if (num8 != null) {
                return 10;
            }
            String str = c0966m.f;
            String str2 = c0966m2.f;
            if (str != null) {
                if (!str.equals(str2)) {
                    return 10;
                }
            } else if (str2 != null) {
                return 10;
            }
            String str3 = c0966m.g;
            String str4 = c0966m2.g;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return 10;
                }
            } else if (str4 != null) {
                return 10;
            }
            Integer num9 = c0966m.j;
            Integer num10 = c0966m2.j;
            if (num9 != null) {
                if (!num9.equals(num10)) {
                    return 10;
                }
            } else if (num10 != null) {
                return 10;
            }
        }
        return 0;
    }
}
