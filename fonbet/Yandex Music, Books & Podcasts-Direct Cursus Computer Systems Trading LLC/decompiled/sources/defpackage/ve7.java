package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public abstract class ve7 {
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r0.equals("on") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if ((r1 != null ? java.lang.Boolean.parseBoolean(r1) : true) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0045, code lost:
    
        if (r0.equals("") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    static {
        String str;
        boolean z;
        int i = f0s.a;
        String str2 = null;
        try {
            str = System.getProperty("kotlinx.coroutines.debug");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z2 = true;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935) {
                    }
                }
                qq6.e(str, "System property 'kotlinx.coroutines.debug' has unrecognized value '");
                return;
            }
            a = z;
            if (z) {
                int i2 = f0s.a;
                try {
                    str2 = System.getProperty("kotlinx.coroutines.stacktrace.recovery");
                } catch (SecurityException unused2) {
                }
            }
            z2 = false;
            b = z2;
            c = new AtomicLong(0L);
        }
        z = false;
        a = z;
        if (z) {
        }
        z2 = false;
        b = z2;
        c = new AtomicLong(0L);
    }

    public static final boolean a() {
        return a;
    }

    public static final boolean b() {
        return b;
    }
}
