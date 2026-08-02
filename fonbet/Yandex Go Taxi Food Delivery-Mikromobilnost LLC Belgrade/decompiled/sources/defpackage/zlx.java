package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public abstract class zlx {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static ylx a(String str) {
        boolean startsWith;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ylx ylxVar = (ylx) it.next();
            synchronized (((ba2) ylxVar)) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return ylxVar;
            }
        }
        throw new GeneralSecurityException(g8e.o("No KMS client does support: ", str));
    }
}
