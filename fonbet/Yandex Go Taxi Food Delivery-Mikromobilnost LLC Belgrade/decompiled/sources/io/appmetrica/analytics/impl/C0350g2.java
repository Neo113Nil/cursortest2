package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.q871;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.C0350g2;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.EmptyList;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0350g2 implements U1, InterfaceC0868y0 {
    public boolean a;
    public final Context b;
    public final T1 c;
    public final U4 d;
    public final C0610p2 e;
    public Bj f;
    public final C0850xb g;
    public final T2 h;
    public final C0379h2 i;
    public final Qj j;

    public C0350g2(Context context, T1 t1, Y5 y5) {
        this(context, t1, new U4(context, y5), new C0610p2(), C0850xb.d, Jb.k().e(), new C0379h2());
    }

    public static void e(Intent intent) {
        bs bsVar = Jb.I.D().c.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void a(Intent intent) {
        C0610p2 c0610p2 = this.e;
        if (intent == null) {
            c0610p2.getClass();
            return;
        }
        c0610p2.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c0610p2.a.a(action, Integer.valueOf(C0610p2.a(intent)));
        }
        for (Map.Entry entry : c0610p2.b.entrySet()) {
            InterfaceC0581o2 interfaceC0581o2 = (InterfaceC0581o2) entry.getKey();
            if (((InterfaceC0552n2) entry.getValue()).a(intent)) {
                interfaceC0581o2.a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void b(Intent intent) {
        this.e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void c(Intent intent) {
        C0610p2 c0610p2 = this.e;
        if (intent == null) {
            c0610p2.getClass();
            return;
        }
        c0610p2.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c0610p2.a.a(action, Integer.valueOf(C0610p2.a(intent)));
        }
        for (Map.Entry entry : c0610p2.b.entrySet()) {
            InterfaceC0581o2 interfaceC0581o2 = (InterfaceC0581o2) entry.getKey();
            if (((InterfaceC0552n2) entry.getValue()).a(intent)) {
                interfaceC0581o2.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        Jb.I.v().a(Vc.f(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void onConfigurationChanged(Configuration configuration) {
        Jb.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void onCreate() {
        if (this.a) {
            Jb.I.v().a(this.b.getResources().getConfiguration());
        } else {
            this.g.b(this.b);
            Jb jb = Jb.I;
            synchronized (jb) {
                jb.B.initAsync();
                jb.u.a(jb.a);
                jb.u.a(new Mr(jb.B));
                NetworkServiceLocator.init(jb.a, new C0181a6(new C0283dl(jb.h()), new C0469k6(jb.a)));
                jb.l().a(jb.q);
                jb.E();
            }
            AbstractC0544mn.a.e();
            Dp dp = Jb.I.u;
            Bp a = dp.a();
            Bp a2 = dp.a();
            Pn p = Jb.I.p();
            p.a(new C0717sn(new Ve(this.e)), a2);
            dp.a(p);
            Jb.I.z().a(a);
            a();
            Jb.I.m().init();
            Jb.I.c().init();
            C0379h2 c0379h2 = this.i;
            Context context = this.b;
            U4 u4 = this.d;
            c0379h2.getClass();
            this.f = new Bj(context, u4);
            Context context2 = this.b;
            K1.a.c(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.b;
            Bj bj = this.f;
            C0884yg r = Jb.k().r();
            IHandlerExecutor g = Jb.k().w().g();
            C0211b7 c0211b7 = new C0211b7(context3, bj, Hc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0262d0(), new BlockingExecutor(), "previous", new C0590ob());
            C0211b7 c0211b72 = new C0211b7(context3, bj, Hc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0217bd(), g, "actual", new C0590ob());
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                Z6 z6 = new Z6(crashesDirectory, c0211b72, new C0676rb());
                g.execute(new Oi(crashesDirectory, c0211b7));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                z6.startWatching();
                Jb.I.E.storeReference(z6);
            }
            r.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r.a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r.a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    C0739tg b = r.b.b(context3, bj);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b.newCrash((NativeCrash) it.next());
                    }
                }
                r.a.setDefaultCrashHandler(r.b.a(context3, bj));
            }
            new D6(Collections.singletonList(new Ij())).run();
            this.a = true;
        }
        Jb.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void onDestroy() {
        C0794vd l = Jb.I.l();
        synchronized (l) {
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                ((Dn) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void pauseUserSession(Bundle bundle) {
        C0597oi c0597oi;
        bundle.setClassLoader(C0597oi.class.getClassLoader());
        String str = C0597oi.c;
        try {
            c0597oi = (C0597oi) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c0597oi = null;
        }
        Integer asInteger = c0597oi != null ? c0597oi.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void reportData(int i, Bundle bundle) {
        this.j.getClass();
        List list = (List) Jb.I.v.a.get(Integer.valueOf(i));
        if (list == null) {
            list = EmptyList.a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0746tn) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void resumeUserSession(Bundle bundle) {
        C0597oi c0597oi;
        bundle.setClassLoader(C0597oi.class.getClassLoader());
        String str = C0597oi.c;
        try {
            c0597oi = (C0597oi) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c0597oi = null;
        }
        Integer asInteger = c0597oi != null ? c0597oi.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.c(asInteger.intValue());
        }
    }

    public C0350g2(Context context, T1 t1) {
        this(context, t1, new Y5(context));
    }

    public C0350g2(Context context, T1 t1, U4 u4, C0610p2 c0610p2, C0850xb c0850xb, T2 t2, C0379h2 c0379h2) {
        this.a = false;
        this.b = context;
        this.c = t1;
        this.d = u4;
        this.e = c0610p2;
        this.g = c0850xb;
        this.h = t2;
        this.i = c0379h2;
        this.j = new Qj();
    }

    public final void a() {
        this.e.c(new InterfaceC0581o2() { // from class: p871
            @Override // io.appmetrica.analytics.impl.InterfaceC0581o2
            public final void a(Intent intent) {
                C0350g2.this.d(intent);
            }
        });
        this.e.a(new q871());
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        K6.b(bundle);
        Bj bj = this.f;
        if (bj != null) {
            bj.a(K6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void a(Intent intent, int i) {
        ((A0) this.c).a.stopSelf(i);
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void a(Intent intent, int i, int i2) {
        ((A0) this.c).a.stopSelf(i2);
    }
}
