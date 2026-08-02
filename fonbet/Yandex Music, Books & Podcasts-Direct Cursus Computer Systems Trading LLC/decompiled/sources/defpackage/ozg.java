package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ozg extends FutureTask {
    public final /* synthetic */ int a = 1;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozg(it1 it1Var, z68 z68Var) {
        super(z68Var);
        this.b = it1Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((pzg) this.b).d((nzg) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((pzg) this.b).d(new nzg(e));
                        }
                    }
                    return;
                } finally {
                    this.b = null;
                }
            default:
                it1 it1Var = (it1) this.b;
                AtomicBoolean atomicBoolean = it1Var.d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    it1Var.b(obj);
                    return;
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    it1Var.b(null);
                    return;
                } catch (ExecutionException e3) {
                    kac.k("An error occurred while executing doInBackground()", e3.getCause());
                    return;
                } catch (Throwable th) {
                    kac.k("An error occurred while executing doInBackground()", th);
                    return;
                }
        }
    }

    public /* synthetic */ ozg(Callable callable) {
        super(callable);
    }
}
