package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ep6 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ hgp d;
    public final /* synthetic */ gp6 e;

    public ep6(gp6 gp6Var, long j, Throwable th, Thread thread, hgp hgpVar) {
        this.e = gp6Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = hgpVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        jac jacVar;
        String str;
        long j = this.a;
        long j2 = j / 1000;
        gp6 gp6Var = this.e;
        String e = gp6Var.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return ywf.w(null);
        }
        gp6Var.c.i();
        jac jacVar2 = gp6Var.m;
        jacVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        jacVar2.o(this.b, this.c, "crash", new uib(e, j2, e5bVar), true);
        try {
            jacVar = gp6Var.g;
            str = ".ae" + j;
            jacVar.getClass();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        if (!new File((File) jacVar.c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        hgp hgpVar = this.d;
        gp6Var.b(false, hgpVar, false);
        gp6Var.c(new wn3().a, Boolean.FALSE);
        return !gp6Var.b.h() ? ywf.w(null) : ((i8s) ((AtomicReference) hgpVar.i).get()).a.m((vq6) gp6Var.e.a, new ix6(this, e));
    }
}
