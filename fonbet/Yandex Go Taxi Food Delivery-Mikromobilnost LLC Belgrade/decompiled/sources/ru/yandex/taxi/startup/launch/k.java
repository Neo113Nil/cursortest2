package ru.yandex.taxi.startup.launch;

import android.os.SystemClock;
import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.mux;
import defpackage.t61;
import defpackage.tje;
import defpackage.tls;
import defpackage.w53;

/* loaded from: classes10.dex */
public final class k {
    public final t61 a;
    public final mux b;
    public Integer c;
    public long e;
    public final w53 d = new w53();
    public final ike f = bvf0.b();
    public final kotlinx.coroutines.sync.a g = gtq0.a();

    public k(t61 t61Var, mux muxVar) {
        this.a = t61Var;
        this.b = muxVar;
    }

    public static final String a(k kVar, long j) {
        kVar.getClass();
        return String.valueOf(((SystemClock.uptimeMillis() - j) / 10) * 10);
    }

    public static final boolean b(k kVar, int i, String str) {
        Integer num = kVar.c;
        if (num != null && num.intValue() == i) {
            return true;
        }
        kVar.a.b(str);
        return false;
    }

    public final void c(int i, String str) {
        e(new LaunchProcessingAnalytics$beginDelegate$1(this, i, str, null));
    }

    public final void d(int i) {
        e(new LaunchProcessingAnalytics$beginProcessing$1(this, i, null));
    }

    public final void e(tls tlsVar) {
        tje.N(this.f, null, null, new LaunchProcessingAnalytics$doIfEnabledWithLock$1(this, tlsVar, null), 3);
    }

    public final void f(int i, String str) {
        e(new LaunchProcessingAnalytics$endDelegate$1(this, i, str, null));
    }

    public final void g(int i) {
        e(new LaunchProcessingAnalytics$endProcessing$1(this, i, null));
    }

    public final void h(int i, String str) {
        e(new LaunchProcessingAnalytics$failedDelegate$1(this, i, str, null));
    }

    public final void i(int i) {
        e(new LaunchProcessingAnalytics$notifyUpdateListeners$1(this, i, null));
    }
}
