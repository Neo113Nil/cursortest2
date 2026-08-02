package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class kp6 {
    public final Context a;
    public final v97 b;
    public final jtc c;
    public final long d;
    public nnk e;
    public nnk f;
    public gp6 g;
    public final uae h;
    public final jac i;
    public final r70 j;
    public final r70 k;
    public final dp6 l;
    public final op6 m;
    public final f4m n;
    public final osh o;

    public kp6(aec aecVar, uae uaeVar, op6 op6Var, v97 v97Var, r70 r70Var, r70 r70Var2, jac jacVar, dp6 dp6Var, f4m f4mVar, osh oshVar) {
        this.b = v97Var;
        aecVar.a();
        this.a = aecVar.a;
        this.h = uaeVar;
        this.m = op6Var;
        this.j = r70Var;
        this.k = r70Var2;
        this.i = jacVar;
        this.l = dp6Var;
        this.n = f4mVar;
        this.o = oshVar;
        this.d = System.currentTimeMillis();
        this.c = new jtc(16);
    }

    public final void a(hgp hgpVar) {
        osh.x();
        osh.x();
        this.e.i();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.b(new jj4(28));
                this.g.g();
                if (!hgpVar.l().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(hgpVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((i8s) ((AtomicReference) hgpVar.i).get()).a);
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(hgp hgpVar) {
        Future<?> submit = ((ExecutorService) ((vq6) this.o.a).b).submit(new hp6(this, hgpVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        osh.x();
        try {
            nnk nnkVar = this.e;
            jac jacVar = (jac) nnkVar.b;
            String str = (String) nnkVar.a;
            jacVar.getClass();
            if (new File((File) jacVar.c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
