package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class bp6 {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static boolean b;

    public static final void a(Object obj, Throwable th) {
        obj.getClass();
        if (b) {
            a.add(obj);
            HashSet hashSet = j3c.a;
            if (gtt.c()) {
                wct.u(th);
                ox6.z(th, cpe.e).b();
            }
        }
    }
}
