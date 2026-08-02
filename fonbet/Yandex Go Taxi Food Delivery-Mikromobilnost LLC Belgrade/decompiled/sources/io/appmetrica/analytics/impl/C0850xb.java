package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.tcc;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0850xb {
    public static final C0850xb d = new C0850xb();
    public final C0565nf a = new C0565nf();
    public final ServiceComponentsInitializer b = AbstractC0688rn.a();
    public boolean c = false;

    public final void a(Context context) {
        We we;
        Jb.a(context);
        this.b.onCreate(context);
        this.a.getClass();
        List<String> a = Jb.I.s.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                we = new We(str, false);
            } else {
                Jb.I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                we = new We(str, true);
            }
            arrayList.add(we);
        }
        new Fn(Jb.I.D().d).a(context);
        Zr zr = Jb.I.D().c;
        synchronized (zr) {
            zr.a.a();
        }
        Jb.I.q().a();
        new Xe(Jb.I.d.c(), Jb.I.y(), "service_modules", new SystemTimeProvider()).a(arrayList);
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
