package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class t7b {
    public static final Logger c = Logger.getLogger(t7b.class.getName());
    public static final ArrayList d;
    public static final t7b e;
    public static final t7b f;
    public final k8b a;
    public final List b = d;

    static {
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.info("Provider " + str + " not available");
                }
            }
            d = arrayList;
        } catch (Exception unused) {
            d = new ArrayList();
        }
        int i2 = 22;
        e = new t7b(new o6c(i2));
        f = new t7b(new ofc(i2));
    }

    public t7b(k8b k8bVar) {
        this.a = k8bVar;
    }

    public final Object a(String str) {
        Iterator it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            k8b k8bVar = this.a;
            if (!hasNext) {
                return k8bVar.a(str, null);
            }
            try {
                return k8bVar.a(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
