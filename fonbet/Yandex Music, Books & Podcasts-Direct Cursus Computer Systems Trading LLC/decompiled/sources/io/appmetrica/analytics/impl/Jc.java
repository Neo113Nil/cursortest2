package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.v75;
import defpackage.z75;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Jc {
    public final S2 a = new S2();
    public final C0166c7 b = new C0166c7();
    public Eq c;
    public boolean d;
    public boolean e;

    public final synchronized void a(Context context, InterfaceC0286gc interfaceC0286gc) {
        try {
            if (this.d) {
                return;
            }
            C0166c7 c0166c7 = this.b;
            ArrayList arrayList = R4.l().j.a;
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C0575qc) ((InterfaceC0589qq) it.next())).a(context, interfaceC0286gc));
            }
            c0166c7.a.addAll(arrayList2);
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
            C0823z2 c0823z2 = new C0823z2(this.b);
            this.c = new Eq(c0823z2);
            Dq dq = new Dq();
            dq.a.add(c0823z2);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                dq.a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(dq);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0286gc interfaceC0286gc) {
        if (this.e) {
            return;
        }
        z75.u(this.b.a, new Qb[]{this.a.a(context, appMetricaConfig, interfaceC0286gc)});
        this.e = true;
    }

    public final synchronized void a() {
        this.b.a.clear();
        this.d = false;
        this.e = false;
    }
}
