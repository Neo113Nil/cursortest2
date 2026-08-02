package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class op6 {
    public static final hs4 c = new hs4(19);
    public final owj a;
    public final AtomicReference b = new AtomicReference(null);

    public op6(owj owjVar) {
        this.a = owjVar;
        owjVar.a(new n(20, this));
    }

    public final hs4 a() {
        op6 op6Var = (op6) this.b.get();
        return op6Var == null ? c : op6Var.a();
    }

    public final boolean b() {
        op6 op6Var = (op6) this.b.get();
        return op6Var != null && op6Var.b();
    }

    public final boolean c() {
        op6 op6Var = (op6) this.b.get();
        return op6Var != null && op6Var.c();
    }

    public final void d(String str, long j, yd2 yd2Var) {
        String g = f1d.g("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", g, null);
        }
        this.a.a(new np6(str, j, yd2Var));
    }
}
