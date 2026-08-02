package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class xht implements ThreadFactory {
    public final i30 a;
    public final String b;
    public final wfz c;
    public final boolean d;
    public final AtomicInteger e;

    public xht(i30 i30Var, String str, boolean z) {
        wfz wfzVar = wfz.F;
        this.e = new AtomicInteger();
        this.a = i30Var;
        this.b = str;
        this.c = wfzVar;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        tqs tqsVar = new tqs((Object) this, (Object) runnable, false, 9);
        this.a.getClass();
        wht whtVar = new wht(tqsVar);
        whtVar.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return whtVar;
    }
}
