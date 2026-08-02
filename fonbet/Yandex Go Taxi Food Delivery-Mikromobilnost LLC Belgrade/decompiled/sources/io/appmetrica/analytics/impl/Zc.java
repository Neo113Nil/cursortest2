package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.tcc;
import defpackage.ycc;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class Zc {
    public final S2 a = new S2();
    public final C0326f7 b = new C0326f7();
    public Xq c;
    public boolean d;
    public boolean e;

    public final synchronized void a(Context context, InterfaceC0677rc interfaceC0677rc) {
        try {
            if (this.d) {
                return;
            }
            C0326f7 c0326f7 = this.b;
            ArrayList arrayList = V4.l().j.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Fc) ((Hq) it.next())).a(context, interfaceC0677rc));
            }
            c0326f7.a.addAll(arrayList2);
            this.d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.c != null) {
                return;
            }
            C0899z2 c0899z2 = new C0899z2(this.b);
            this.c = new Xq(c0899z2);
            Wq wq = new Wq();
            wq.a.add(c0899z2);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                wq.a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(wq);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0677rc interfaceC0677rc) {
        if (this.e) {
            return;
        }
        ycc.t(this.b.a, new InterfaceC0331fc[]{this.a.a(context, appMetricaConfig, interfaceC0677rc)});
        this.e = true;
    }

    public final synchronized void a() {
        this.b.a.clear();
        this.d = false;
        this.e = false;
    }
}
