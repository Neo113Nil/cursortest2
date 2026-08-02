package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class xhf {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zg0 a(String str) {
        boolean startsWith;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            zg0 zg0Var = (zg0) it.next();
            synchronized (zg0Var) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return zg0Var;
            }
        }
        throw new GeneralSecurityException(f1d.g("No KMS client does support: ", str));
    }
}
