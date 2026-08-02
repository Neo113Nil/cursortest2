package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class t4y {
    public final HashMap a = new HashMap();

    public abstract Object a(Object obj);

    public final Object b(Object obj) {
        synchronized (this.a) {
            try {
                if (this.a.containsKey(obj)) {
                    return this.a.get(obj);
                }
                Object a = a(obj);
                this.a.put(obj, a);
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
