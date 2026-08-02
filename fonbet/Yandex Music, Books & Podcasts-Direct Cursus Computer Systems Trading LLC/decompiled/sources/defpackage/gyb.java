package defpackage;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class gyb {
    public final es6 a;
    public final g06 b;
    public final ReentrantLock c = new ReentrantLock();
    public final HashMap d = new HashMap();

    public gyb(es6 es6Var, g06 g06Var) {
        this.a = es6Var;
        this.b = g06Var;
    }

    public final String a(String str) {
        String str2;
        str.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Pair pair = (Pair) this.d.get(str);
            if (pair != null) {
                str2 = (String) pair.a;
                if (str2 == null) {
                }
                reentrantLock.unlock();
                return str2;
            }
            str2 = (String) this.a.P().get(str);
            reentrantLock.unlock();
            return str2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
