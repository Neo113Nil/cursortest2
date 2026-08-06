package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: d, reason: collision with root package name */
    public static A1 f4662d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4663a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0912z1 f4664b;

    /* renamed from: c, reason: collision with root package name */
    public BinderC0886y1 f4665c;

    public L1(Context context, InterfaceC0912z1 interfaceC0912z1) {
        this.f4663a = context;
        this.f4664b = interfaceC0912z1;
    }

    public final void b() {
        C0610na.a(this.f4663a);
        PublicLogger.Companion.init(this.f4663a);
        Context context = this.f4663a;
        InterfaceC0912z1 interfaceC0912z1 = this.f4664b;
        if (f4662d == null) {
            B1 b12 = new B1(context, interfaceC0912z1, new C0347d5(context));
            C0387ek c0387ek = C0610na.f6575I.f6603v;
            E1 e1 = new E1(b12);
            LinkedHashMap linkedHashMap = c0387ek.f5950a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(e1);
            f4662d = b12;
        }
        A1 a12 = f4662d;
        if (a12 != null) {
            this.f4665c = new BinderC0886y1(a12);
            C0610na c0610na = C0610na.f6575I;
            c0610na.f6588f = new C0593mj(c0610na.f6583a, new C0619nj(a12));
            ((B1) a12).onCreate();
        }
    }

    public final boolean c(Intent intent) {
        A1 a12 = f4662d;
        if (a12 != null) {
            ((B1) a12).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !z1.o.R(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        f4662d = null;
    }

    public final void a(Intent intent, int i2) {
        A1 a12 = f4662d;
        if (a12 != null) {
            ((C0781u0) ((B1) a12).f4175c).f6960a.stopSelf(i2);
        }
    }

    public final void c() {
        A1 a12 = f4662d;
        if (a12 != null) {
            ((B1) a12).onDestroy();
        }
    }

    public final int a(Intent intent, int i2, int i3) {
        A1 a12 = f4662d;
        if (a12 == null) {
            return 2;
        }
        ((C0781u0) ((B1) a12).f4175c).f6960a.stopSelf(i3);
        return 2;
    }

    public final IBinder a(Intent intent) {
        A1 a12 = f4662d;
        if (a12 != null) {
            ((B1) a12).a(intent);
        }
        String action = intent.getAction();
        if (action != null && z1.o.R(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new Co();
        }
        BinderC0886y1 binderC0886y1 = this.f4665c;
        if (binderC0886y1 != null) {
            return binderC0886y1;
        }
        kotlin.jvm.internal.i.i("coreBinder");
        throw null;
    }

    public final void a(Configuration configuration) {
        if (f4662d != null) {
            C0610na.f6575I.v().a(configuration);
        }
    }

    public final void b(Intent intent) {
        A1 a12 = f4662d;
        if (a12 != null) {
            ((B1) a12).c(intent);
        }
    }
}
