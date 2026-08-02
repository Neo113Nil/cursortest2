package defpackage;

import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class qwo {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static lp7 a(l6v l6vVar) {
        lp7 lp7Var;
        synchronized (a) {
            lp7Var = (lp7) b.get(l6vVar);
        }
        return lp7Var == null ? lp7.a : lp7Var;
    }
}
