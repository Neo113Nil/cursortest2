package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.uo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0702uo {
    public final C0346ie a;
    public final C0317he b;

    public C0702uo(PublicLogger publicLogger, String str) {
        this(new C0346ie(str, publicLogger), new C0317he(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(C0432le c0432le, String str, String str2) {
        try {
            int size = c0432le.size();
            int i = this.a.c.a;
            if (size >= i && (i != c0432le.size() || !c0432le.containsKey(str))) {
                C0346ie c0346ie = this.a;
                c0346ie.d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", c0346ie.e, Integer.valueOf(c0346ie.c.a), str);
                return false;
            }
            this.b.getClass();
            int i2 = c0432le.a;
            if (str2 != null) {
                i2 += str2.length();
            }
            if (c0432le.containsKey(str)) {
                String str3 = (String) c0432le.get(str);
                if (str3 != null) {
                    i2 -= str3.length();
                }
            } else {
                i2 += str.length();
            }
            if (i2 <= 4500) {
                c0432le.put(str, str2);
                return true;
            }
            C0317he c0317he = this.b;
            c0317he.b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c0317he.a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(C0432le c0432le, String str, String str2) {
        if (c0432le == null) {
            return false;
        }
        String a = this.a.a.a(str);
        String a2 = this.a.b.a(str2);
        if (!c0432le.containsKey(a)) {
            if (a2 != null) {
                return a(c0432le, a, a2);
            }
            return false;
        }
        String str3 = (String) c0432le.get(a);
        if (a2 == null || !a2.equals(str3)) {
            return a(c0432le, a, a2);
        }
        return false;
    }

    public C0702uo(C0346ie c0346ie, C0317he c0317he) {
        this.a = c0346ie;
        this.b = c0317he;
    }
}
