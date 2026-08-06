package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377ea {

    /* renamed from: d, reason: collision with root package name */
    public static final C0377ea f5924d = new C0377ea();

    /* renamed from: a, reason: collision with root package name */
    public final C0742sd f5925a = new C0742sd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f5926b = AbstractC0310bk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f5927c = false;

    public final void a(Context context) {
        C0303bd c0303bd;
        C0610na.a(context);
        this.f5926b.onCreate(context);
        this.f5925a.getClass();
        List<String> a2 = C0610na.f6575I.f6601s.a();
        ArrayList arrayList = new ArrayList(i1.k.E(a2));
        for (String str : a2) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0303bd = new C0303bd(str, false);
            } else {
                C0610na.f6575I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0303bd = new C0303bd(str, true);
            }
            arrayList.add(c0303bd);
        }
        new C0620nk(C0610na.f6575I.D().f4168d).a(context);
        C0857wo c0857wo = C0610na.f6575I.D().f4167c;
        synchronized (c0857wo) {
            c0857wo.f7161a.a();
        }
        C0610na.f6575I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f5927c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f5927c) {
                    a(context);
                    this.f5927c = true;
                }
            } finally {
            }
        }
    }

    public static C0329cd a() {
        C0542kk c0542kk = C0610na.f6575I.f6586d;
        if (c0542kk.f6400b == null) {
            synchronized (c0542kk) {
                try {
                    if (c0542kk.f6400b == null) {
                        c0542kk.f6399a.getClass();
                        HandlerThreadC0327cb a2 = C0920z9.a("IAA-SC");
                        c0542kk.f6400b = new C0920z9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return new C0329cd(c0542kk.f6400b, C0610na.f6575I.y(), "service_modules", new SystemTimeProvider());
    }
}
