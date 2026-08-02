package defpackage;

import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class tsu {
    public final Div2View a;
    public final ScheduledExecutorService b;
    public String c;
    public final int d;
    public final int e;
    public final br60 f;
    public int g;
    public boolean h;
    public final AtomicBoolean i;
    public final AtomicReference j;
    public ScheduledFuture k;
    public final ssu l;

    public tsu(Div2View div2View) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.a = div2View;
        this.b = newSingleThreadScheduledExecutor;
        this.c = "10.0.2.2";
        this.d = 7969;
        this.e = 7970;
        this.f = new br60();
        this.i = new AtomicBoolean(false);
        this.j = new AtomicReference(null);
        this.l = new ssu(0, this);
    }

    public final void a(Throwable th) {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (fu11Var.a()) {
            this.a.logError(th);
        } else {
            fu11Var.b(new do91(8, this, th));
        }
    }

    public final void b(wsu wsuVar) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(wsuVar);
        }
    }
}
