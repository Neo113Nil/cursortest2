package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b1o implements ComponentCallbacks2, zyf {
    public static final g1o k;
    public final a a;
    public final Context b;
    public final myf c;
    public final fmq d;
    public final e1o e;
    public final u6s f;
    public final dsd g;
    public final o76 h;
    public final CopyOnWriteArrayList i;
    public final g1o j;

    static {
        g1o g1oVar = (g1o) new g1o().d(Bitmap.class);
        g1oVar.o = true;
        k = g1oVar;
        ((g1o) new g1o().d(pcd.class)).o = true;
    }

    public b1o(a aVar, myf myfVar, e1o e1oVar, Context context) {
        g1o g1oVar;
        fmq fmqVar = new fmq(8);
        kjn kjnVar = aVar.f;
        this.f = new u6s();
        dsd dsdVar = new dsd(25, this);
        this.g = dsdVar;
        this.a = aVar;
        this.c = myfVar;
        this.e = e1oVar;
        this.d = fmqVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        a1o a1oVar = new a1o(this, fmqVar);
        kjnVar.getClass();
        boolean z = etn.z(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        o76 sk7Var = z ? new sk7(applicationContext, a1oVar) : new mgj();
        this.h = sk7Var;
        synchronized (aVar.g) {
            if (aVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.g.add(this);
        }
        if (xut.i()) {
            xut.f().post(dsdVar);
        } else {
            myfVar.b(this);
        }
        myfVar.b(sk7Var);
        this.i = new CopyOnWriteArrayList(aVar.c.e);
        jld jldVar = aVar.c;
        synchronized (jldVar) {
            try {
                if (jldVar.j == null) {
                    jldVar.d.getClass();
                    g1o g1oVar2 = new g1o();
                    g1oVar2.o = true;
                    jldVar.j = g1oVar2;
                }
                g1oVar = jldVar.j;
            } finally {
            }
        }
        synchronized (this) {
            g1o g1oVar3 = (g1o) g1oVar.clone();
            if (g1oVar3.o && !g1oVar3.q) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            g1oVar3.q = true;
            g1oVar3.o = true;
            this.j = g1oVar3;
        }
    }

    @Override // defpackage.zyf
    public final synchronized void b() {
        l();
        this.f.b();
    }

    public final void j(j6s j6sVar) {
        if (j6sVar == null) {
            return;
        }
        boolean m = m(j6sVar);
        e0o f = j6sVar.f();
        if (m) {
            return;
        }
        a aVar = this.a;
        synchronized (aVar.g) {
            try {
                Iterator it = aVar.g.iterator();
                while (it.hasNext()) {
                    if (((b1o) it.next()).m(j6sVar)) {
                        return;
                    }
                }
                if (f != null) {
                    j6sVar.h(null);
                    f.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void k() {
        fmq fmqVar = this.d;
        fmqVar.b = true;
        Iterator it = xut.e((Set) fmqVar.c).iterator();
        while (it.hasNext()) {
            e0o e0oVar = (e0o) it.next();
            if (e0oVar.isRunning()) {
                e0oVar.b();
                ((HashSet) fmqVar.d).add(e0oVar);
            }
        }
    }

    public final synchronized void l() {
        fmq fmqVar = this.d;
        fmqVar.b = false;
        Iterator it = xut.e((Set) fmqVar.c).iterator();
        while (it.hasNext()) {
            e0o e0oVar = (e0o) it.next();
            if (!e0oVar.e() && !e0oVar.isRunning()) {
                e0oVar.k();
            }
        }
        ((HashSet) fmqVar.d).clear();
    }

    public final synchronized boolean m(j6s j6sVar) {
        e0o f = j6sVar.f();
        if (f == null) {
            return true;
        }
        if (!this.d.w(f)) {
            return false;
        }
        this.f.a.remove(j6sVar);
        j6sVar.h(null);
        return true;
    }

    @Override // defpackage.zyf
    public final synchronized void onDestroy() {
        try {
            this.f.onDestroy();
            Iterator it = xut.e(this.f.a).iterator();
            while (it.hasNext()) {
                j((j6s) it.next());
            }
            this.f.a.clear();
            fmq fmqVar = this.d;
            Iterator it2 = xut.e((Set) fmqVar.c).iterator();
            while (it2.hasNext()) {
                fmqVar.w((e0o) it2.next());
            }
            ((HashSet) fmqVar.d).clear();
            this.c.l(this);
            this.c.l(this.h);
            xut.f().removeCallbacks(this.g);
            a aVar = this.a;
            synchronized (aVar.g) {
                if (!aVar.g.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                aVar.g.remove(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.zyf
    public final synchronized void onStop() {
        k();
        this.f.onStop();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
