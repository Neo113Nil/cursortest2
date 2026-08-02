package defpackage;

import java.io.Closeable;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class zva0 implements Closeable {
    public final String a;
    public final long b = System.nanoTime();
    public boolean c;
    public long w;
    public final /* synthetic */ awa0 x;

    public zva0(awa0 awa0Var, String str) {
        this.x = awa0Var;
        this.a = str;
    }

    public final long a() {
        boolean z = this.c;
        String str = this.a;
        if (z) {
            x4c.g("Trace already finished", null, str, null, 10);
        } else {
            o430 o430Var = e3n.b;
            long e = e3n.e(kp50.V(System.nanoTime() - this.b, DurationUnit.NANOSECONDS));
            this.w = e;
            this.x.a(e, str);
            this.c = true;
        }
        return this.w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }
}
