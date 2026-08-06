package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724rl {

    /* renamed from: a, reason: collision with root package name */
    public final Cc f6845a;

    /* renamed from: b, reason: collision with root package name */
    public final Bc f6846b;

    public C0724rl(PublicLogger publicLogger, String str) {
        this(new Cc(str, publicLogger), new Bc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Fc fc, String str, String str2) {
        try {
            int size = fc.size();
            int i2 = this.f6845a.f4259c.f6479a;
            if (size >= i2 && (i2 != fc.size() || !fc.containsKey(str))) {
                Cc cc = this.f6845a;
                cc.f4260d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", cc.f4261e, Integer.valueOf(cc.f4259c.f6479a), str);
                return false;
            }
            this.f6846b.getClass();
            int i3 = fc.f4381a;
            if (str2 != null) {
                i3 += str2.length();
            }
            if (fc.containsKey(str)) {
                String str3 = (String) fc.get(str);
                if (str3 != null) {
                    i3 -= str3.length();
                }
            } else {
                i3 += str.length();
            }
            if (i3 <= 4500) {
                fc.put(str, str2);
                return true;
            }
            Bc bc = this.f6846b;
            bc.f4205b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", bc.f4204a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(Fc fc, String str, String str2) {
        if (fc == null) {
            return false;
        }
        String a2 = this.f6845a.f4257a.a(str);
        String a3 = this.f6845a.f4258b.a(str2);
        if (!fc.containsKey(a2)) {
            if (a3 != null) {
                return a(fc, a2, a3);
            }
            return false;
        }
        String str3 = (String) fc.get(a2);
        if (a3 == null || !a3.equals(str3)) {
            return a(fc, a2, a3);
        }
        return false;
    }

    public C0724rl(Cc cc, Bc bc) {
        this.f6845a = cc;
        this.f6846b = bc;
    }
}
