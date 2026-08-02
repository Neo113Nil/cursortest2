package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mld implements ThreadFactory {
    public final ih a;
    public final String b;
    public final ofc c;
    public final boolean d;
    public final AtomicInteger e;

    public mld(ih ihVar, String str, boolean z) {
        ofc ofcVar = ofc.f;
        this.e = new AtomicInteger();
        this.a = ihVar;
        this.b = str;
        this.c = ofcVar;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        pv7 pv7Var = new pv7(10, this, runnable);
        this.a.getClass();
        jt1 jt1Var = new jt1(pv7Var);
        jt1Var.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return jt1Var;
    }
}
