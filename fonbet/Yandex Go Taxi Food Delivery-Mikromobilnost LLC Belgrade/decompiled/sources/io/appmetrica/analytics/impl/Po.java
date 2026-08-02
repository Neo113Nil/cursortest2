package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes9.dex */
public final class Po {
    public final C0853xe a;
    public final C0824we b;

    public Po(PublicLogger publicLogger, String str) {
        this(new C0853xe(str, publicLogger), new C0824we(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Ae ae, String str, String str2) {
        try {
            int size = ae.size();
            int i = this.a.c.a;
            if (size >= i && (i != ae.size() || !ae.containsKey(str))) {
                C0853xe c0853xe = this.a;
                c0853xe.d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", c0853xe.e, Integer.valueOf(c0853xe.c.a), str);
                return false;
            }
            this.b.getClass();
            int i2 = ae.a;
            if (str2 != null) {
                i2 += str2.length();
            }
            if (ae.containsKey(str)) {
                String str3 = (String) ae.get(str);
                if (str3 != null) {
                    i2 -= str3.length();
                }
            } else {
                i2 += str.length();
            }
            if (i2 <= 4500) {
                ae.put(str, str2);
                return true;
            }
            C0824we c0824we = this.b;
            c0824we.b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c0824we.a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Ae ae, String str, String str2) {
        if (ae == null) {
            return false;
        }
        String a = this.a.a.a(str);
        String a2 = this.a.b.a(str2);
        if (!ae.containsKey(a)) {
            if (a2 != null) {
                return a(ae, a, a2);
            }
            return false;
        }
        String str3 = (String) ae.get(a);
        if (a2 == null || !a2.equals(str3)) {
            return a(ae, a, a2);
        }
        return false;
    }

    public Po(C0853xe c0853xe, C0824we c0824we) {
        this.a = c0853xe;
        this.b = c0824we;
    }
}
