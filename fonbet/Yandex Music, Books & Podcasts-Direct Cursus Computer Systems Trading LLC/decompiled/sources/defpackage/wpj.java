package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class wpj {
    public static final wpj b = new wpj();
    public static final Set a = xz0.Y(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a() {
        Boolean bool;
        boolean booleanValue;
        Set set = bp6.a;
        if (set.contains(wpj.class)) {
            return false;
        }
        try {
            if (j3c.g(j3c.b()) || gvt.B()) {
                return false;
            }
            Boolean bool2 = ovn.a;
            if (!set.contains(ovn.class)) {
                try {
                    if (ovn.a == null) {
                        ovn.a = Boolean.valueOf(ovn.b.G(j3c.b()) != null);
                    }
                    bool = ovn.a;
                } catch (Throwable th) {
                    bp6.a(ovn.class, th);
                }
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                    return !booleanValue;
                }
            }
            booleanValue = false;
            if (!booleanValue) {
            }
        } catch (Throwable th2) {
            bp6.a(wpj.class, th2);
            return false;
        }
    }
}
