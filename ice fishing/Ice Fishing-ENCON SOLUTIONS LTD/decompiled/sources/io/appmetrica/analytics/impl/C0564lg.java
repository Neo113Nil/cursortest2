package io.appmetrica.analytics.impl;

import android.content.Context;
import h1.C0237g;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564lg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6454a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C0616ng f6455b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6456c;

    /* renamed from: d, reason: collision with root package name */
    public final C0857wo f6457d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6458e;

    public C0564lg(Context context, C0857wo c0857wo) {
        this.f6458e = context;
        this.f6457d = c0857wo;
        this.f6455b = c0857wo.b();
        this.f6456c = c0857wo.c();
    }

    public final void a() {
        if (this.f6456c) {
            return;
        }
        Context context = this.f6458e;
        Oa a2 = C0823vg.a(context, C0610na.f6575I.f6586d.a());
        InterfaceC0745sg interfaceC0745sg = (InterfaceC0745sg) ((C0237g) new C0383eg(this, new C0823vg(a2), new C0921za(context), new C0849wg(context)).f5941f).a();
        try {
            a2.a(interfaceC0745sg);
        } catch (Throwable th) {
            interfaceC0745sg.a(th);
        }
    }

    public final synchronized void a(C0668pg c0668pg) {
        this.f6454a.add(c0668pg);
        if (this.f6456c) {
            c0668pg.a(this.f6455b);
        }
    }

    public final synchronized void a(C0616ng c0616ng) {
        Iterator it = this.f6454a.iterator();
        while (it.hasNext()) {
            ((C0668pg) it.next()).a(c0616ng);
        }
    }
}
