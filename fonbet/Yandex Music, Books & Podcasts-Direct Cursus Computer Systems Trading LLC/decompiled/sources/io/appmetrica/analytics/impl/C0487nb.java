package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.v75;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0487nb {
    public static final C0487nb d = new C0487nb();
    public final Ye a = new Ye();
    public final ServiceComponentsInitializer b = Zm.a();
    public boolean c = false;

    public final void a(Context context) {
        He he;
        C0747wb.a(context);
        this.b.onCreate(context);
        this.a.getClass();
        List<String> a = C0747wb.I.s.a();
        ArrayList arrayList = new ArrayList(v75.o(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                he = new He(str, false);
            } else {
                C0747wb.I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                he = new He(str, true);
            }
            arrayList.add(he);
        }
        new C0499nn(C0747wb.I.D().d).a(context);
        Gr gr = C0747wb.I.D().c;
        synchronized (gr) {
            gr.a.a();
        }
        C0747wb.I.q().a();
        new Ie(C0747wb.I.d.c(), C0747wb.I.y(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.c) {
                    a(context);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
