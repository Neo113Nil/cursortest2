package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class a1c {
    public static volatile a1c a;
    public static final a1c b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        a1c a1cVar = new a1c();
        Map map = Collections.EMPTY_MAP;
        b = a1cVar;
    }

    public static a1c a() {
        a1c a1cVar;
        a1c a1cVar2 = a;
        if (a1cVar2 != null) {
            return a1cVar2;
        }
        synchronized (a1c.class) {
            try {
                a1cVar = a;
                if (a1cVar == null) {
                    Class cls = w0c.a;
                    if (cls != null) {
                        try {
                            a1cVar = (a1c) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                        a = a1cVar;
                    }
                    a1cVar = b;
                    a = a1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a1cVar;
    }
}
