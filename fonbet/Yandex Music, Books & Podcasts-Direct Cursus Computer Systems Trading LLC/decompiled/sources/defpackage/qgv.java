package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class qgv {
    public static final /* synthetic */ s9f[] g;
    public static final long h;
    public final o0j a;
    public final qdc b;
    public final vh4 c;
    public final Handler d;
    public final Handler e;
    public final y32 f;

    static {
        opi opiVar = new opi(qgv.class, "networkSubscription", "getNetworkSubscription()Ljava/io/Closeable;", 0);
        ern.a.getClass();
        g = new s9f[]{opiVar};
        h = 10000L;
    }

    public qgv(o0j o0jVar, qdc qdcVar, vh4 vh4Var) {
        o0jVar.getClass();
        qdcVar.getClass();
        this.a = o0jVar;
        this.b = qdcVar;
        this.c = vh4Var;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new Handler(Looper.getMainLooper());
        this.f = new y32();
    }

    public final void a() {
        k0j k0jVar;
        b();
        o0j o0jVar = this.a;
        boolean a = o0jVar.a();
        this.b.sendEvent("wm_messenger_retry_loading", tah.b(new Pair("netAvailable", String.valueOf(a))));
        if (a) {
            this.c.invoke();
            return;
        }
        c();
        jvu jvuVar = new jvu(17, this);
        o0jVar.e.getClass();
        if (o0jVar.a()) {
            jvuVar.invoke();
            k0jVar = null;
        } else {
            l0j l0jVar = new l0j(o0jVar, jvuVar);
            o0jVar.b.add(l0jVar);
            k0jVar = new k0j(0, o0jVar, l0jVar);
        }
        this.f.setValue(this, g[0], k0jVar);
    }

    public final void b() {
        this.f.setValue(this, g[0], null);
        this.e.removeCallbacksAndMessages(null);
        this.d.removeCallbacksAndMessages(null);
    }

    public final void c() {
        this.e.postDelayed(new ogv(this, 1), h);
    }
}
