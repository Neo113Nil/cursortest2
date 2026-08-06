package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533kb {

    /* renamed from: a, reason: collision with root package name */
    public final C0395f2 f6367a = new C0395f2();

    /* renamed from: b, reason: collision with root package name */
    public final C0528k6 f6368b = new C0528k6();

    /* renamed from: c, reason: collision with root package name */
    public C0934zn f6369c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6370d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6371e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ta ta) {
        if (this.f6371e) {
            return;
        }
        i1.o.F(this.f6368b.f6350a, new Fa[]{this.f6367a.a(context, appMetricaConfig, ta)});
        this.f6371e = true;
    }

    public final synchronized void b() {
        if (this.f6370d) {
            return;
        }
        C0528k6 c0528k6 = this.f6368b;
        ArrayList arrayList = C0294b4.l().f5590i.f6539a;
        ArrayList arrayList2 = new ArrayList(i1.k.E(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0528k6.f6350a.addAll(arrayList2);
        this.f6370d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f6369c != null) {
                return;
            }
            O1 o12 = new O1(this.f6368b);
            this.f6369c = new C0934zn(o12);
            C0908yn c0908yn = new C0908yn();
            c0908yn.f7260a.add(o12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c0908yn.f7260a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c0908yn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f6368b.f6350a.clear();
        this.f6370d = false;
        this.f6371e = false;
    }
}
