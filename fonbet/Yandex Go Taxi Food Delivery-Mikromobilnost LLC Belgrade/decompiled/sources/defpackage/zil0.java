package defpackage;

import android.os.Handler;
import com.google.common.collect.ImmutableMap;
import java.io.Closeable;

/* loaded from: classes10.dex */
public final class zil0 implements Runnable, Closeable {
    public final Handler a = tw21.n(null);
    public final long b;
    public boolean c;
    public final /* synthetic */ bjl0 w;

    public zil0(bjl0 bjl0Var, long j) {
        this.w = bjl0Var;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = false;
        this.a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        bjl0 bjl0Var = this.w;
        o3 o3Var = bjl0Var.z;
        o3Var.K(o3Var.t(4, bjl0Var.D, ImmutableMap.f(), bjl0Var.A));
        this.a.postDelayed(this, this.b);
    }
}
