package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.connectsdk.service.airplay.PListParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class pzg {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile nzg d = null;

    static {
        if (PListParser.TAG_TRUE.equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new gx0(1);
        } else {
            e = Executors.newCachedThreadPool(new qzg());
        }
    }

    public pzg(Callable callable, boolean z) {
        if (z) {
            try {
                d((nzg) callable.call());
                return;
            } catch (Throwable th) {
                d(new nzg(th));
                return;
            }
        }
        Executor executor = e;
        ozg ozgVar = new ozg(callable);
        ozgVar.b = this;
        executor.execute(ozgVar);
    }

    public final synchronized void a(izg izgVar) {
        Throwable th;
        try {
            nzg nzgVar = this.d;
            if (nzgVar != null && (th = nzgVar.b) != null) {
                izgVar.onResult(th);
            }
            this.b.add(izgVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(izg izgVar) {
        ayg aygVar;
        try {
            nzg nzgVar = this.d;
            if (nzgVar != null && (aygVar = nzgVar.a) != null) {
                izgVar.onResult(aygVar);
            }
            this.a.add(izgVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        nzg nzgVar = this.d;
        if (nzgVar == null) {
            return;
        }
        ayg aygVar = nzgVar.a;
        if (aygVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((izg) it.next()).onResult(aygVar);
                }
            }
            return;
        }
        Throwable th = nzgVar.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                psg.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((izg) it2.next()).onResult(th);
            }
        }
    }

    public final void d(nzg nzgVar) {
        if (this.d != null) {
            xq0.q("A task may only be set once.");
            return;
        }
        this.d = nzgVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new dyg(1, this));
        }
    }

    public pzg(ayg aygVar) {
        d(new nzg(aygVar));
    }
}
