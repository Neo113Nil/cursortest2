package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class fp6 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ gp6 b;

    public fp6(gp6 gp6Var, long j) {
        this.b = gp6Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.a(bundle);
        return null;
    }
}
