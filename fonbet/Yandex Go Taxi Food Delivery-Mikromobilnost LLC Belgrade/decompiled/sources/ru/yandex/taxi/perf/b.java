package ru.yandex.taxi.perf;

import android.os.SystemClock;
import defpackage.hst;
import defpackage.jst;
import defpackage.scc;
import defpackage.w511;
import defpackage.wwg;
import defpackage.x43;
import defpackage.yx2;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class b {
    public long a;
    public long b;
    public long c;
    public long d;
    public int f;
    public boolean e = true;
    public final x43 g = new x43();

    public final void a(long j) {
        this.a = j;
        this.b = SystemClock.elapsedRealtime();
        f(StartupEvent.ApplicationCreated);
    }

    public final AppStartupInfoType b() {
        x43 x43Var = this.g;
        return (x43Var.size() >= 3 || this.c - this.b <= 3000) ? (!this.e || (x43Var.size() >= 3 && x43Var.first() != StartupEvent.ApplicationCreated)) ? ((StartupEvent) x43Var.last()) != ((StartupEvent) x43Var.get(scc.f(x43Var) + (-1))) ? AppStartupInfoType.Warm : AppStartupInfoType.Hot : AppStartupInfoType.Cold : AppStartupInfoType.Abandoned;
    }

    public final String c() {
        return wwg.q(SystemClock.elapsedRealtime() - e());
    }

    public final Map d() {
        String c = c();
        return kotlin.collections.b.i(new Pair("app_launch_type", b().getAnalyticsName()), new Pair("timeSinceAppLaunch", c), new Pair("time_since_app_launch_sec", c));
    }

    public final long e() {
        int i = yx2.a[b().ordinal()];
        if (i == 1 || i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        w511.b();
        return 0L;
    }

    public final void f(StartupEvent startupEvent) {
        x43 x43Var = this.g;
        x43Var.addLast(startupEvent);
        if (x43Var.size() > 3) {
            x43Var.removeFirst();
        }
        hst hstVar = jst.e;
        startupEvent.getClass();
        b().getClass();
        kotlin.collections.a.X(this.g, null, "[", "]", new a(), 25);
        hstVar.getClass();
    }
}
