package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import defpackage.cvu0;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.r2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0667r2 {
    public static U1 d;
    public final Context a;
    public final T1 b;
    public S1 c;

    public C0667r2(Context context, T1 t1) {
        this.a = context;
        this.b = t1;
    }

    public final IBinder a(Intent intent) {
        U1 u1 = d;
        if (u1 != null) {
            u1.a(intent);
        }
        String action = intent.getAction();
        if (action != null && cvu0.x(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new gs();
        }
        S1 s1 = this.c;
        if (s1 == null) {
            return null;
        }
        return s1;
    }

    public final void b() {
        Jb.a(this.a);
        PublicLogger.INSTANCE.init(this.a);
        Context context = this.a;
        T1 t1 = this.b;
        if (d == null) {
            C0350g2 c0350g2 = new C0350g2(context, t1, new Y5(context));
            C0775un c0775un = Jb.I.v;
            C0436j2 c0436j2 = new C0436j2(c0350g2);
            LinkedHashMap linkedHashMap = c0775un.a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(c0436j2);
            d = new C0321f2(Jb.I.d.c(), c0350g2);
        }
        U1 u1 = d;
        if (u1 != null) {
            this.c = new S1(u1);
            Jb jb = Jb.I;
            jb.f = new Am(jb.a, new Bm(u1));
            u1.onCreate();
        }
    }

    public final boolean c(Intent intent) {
        U1 u1 = d;
        if (u1 != null) {
            u1.b(intent);
        }
        String action = intent.getAction();
        return (action == null || !cvu0.x(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        d = null;
    }

    public final void c() {
        U1 u1 = d;
        if (u1 != null) {
            u1.onDestroy();
        }
    }

    public final void a(Intent intent, int i) {
        U1 u1 = d;
        if (u1 != null) {
            u1.a(intent, i);
        }
    }

    public final int a(Intent intent, int i, int i2) {
        U1 u1 = d;
        if (u1 == null) {
            return 2;
        }
        u1.a(intent, i, i2);
        return 2;
    }

    public final void a(Configuration configuration) {
        U1 u1 = d;
        if (u1 != null) {
            u1.onConfigurationChanged(configuration);
        }
    }

    public final void b(Intent intent) {
        U1 u1 = d;
        if (u1 != null) {
            u1.c(intent);
        }
    }
}
