package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.c5b;
import defpackage.t75;
import defpackage.w2d;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0276g2 implements U1, InterfaceC0736w0 {
    public boolean a;
    public final Context b;
    public final T1 c;
    public final Q4 d;
    public final C0536p2 e;
    public C0726vj f;
    public final C0487nb g;
    public final T2 h;
    public final C0305h2 i;
    public final Gj j;

    public C0276g2(Context context, T1 t1, V5 v5) {
        this(context, t1, new Q4(context, v5), new C0536p2(), C0487nb.d, C0747wb.k().e(), new C0305h2());
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void a(Intent intent) {
        C0536p2 c0536p2 = this.e;
        if (intent == null) {
            c0536p2.getClass();
            return;
        }
        c0536p2.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c0536p2.a.a(action, Integer.valueOf(C0536p2.a(intent)));
        }
        for (Map.Entry entry : c0536p2.b.entrySet()) {
            InterfaceC0507o2 interfaceC0507o2 = (InterfaceC0507o2) entry.getKey();
            if (((InterfaceC0478n2) entry.getValue()).a(intent)) {
                interfaceC0507o2.a(intent);
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
        C0536p2 c0536p2 = this.e;
        if (intent == null) {
            c0536p2.getClass();
            return;
        }
        c0536p2.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c0536p2.a.a(action, Integer.valueOf(C0536p2.a(intent)));
        }
        for (Map.Entry entry : c0536p2.b.entrySet()) {
            InterfaceC0507o2 interfaceC0507o2 = (InterfaceC0507o2) entry.getKey();
            if (((InterfaceC0478n2) entry.getValue()).a(intent)) {
                interfaceC0507o2.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0747wb.I.v().a(Fc.f(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C0747wb.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void onCreate() {
        if (this.a) {
            C0747wb.I.v().a(this.b.getResources().getConfiguration());
        } else {
            this.g.b(this.b);
            C0747wb c0747wb = C0747wb.I;
            synchronized (c0747wb) {
                c0747wb.B.initAsync();
                c0747wb.u.a(c0747wb.a);
                c0747wb.u.a(new C0676tr(c0747wb.B));
                NetworkServiceLocator.init(new X5(new Tk(c0747wb.h()), new C0309h6(c0747wb.a)));
                c0747wb.l().a(c0747wb.q);
                c0747wb.E();
            }
            Um.a.e();
            C0443lp c0443lp = C0747wb.I.u;
            C0385jp b = c0443lp.b();
            C0385jp b2 = c0443lp.b();
            C0788xn p = C0747wb.I.p();
            p.a(new C0124an(new Ge(this.e)), b2);
            c0443lp.a(p);
            C0747wb.I.z().a(b);
            a();
            C0747wb.I.m().init();
            C0747wb.I.c().init();
            C0305h2 c0305h2 = this.i;
            Context context = this.b;
            Q4 q4 = this.d;
            c0305h2.getClass();
            this.f = new C0726vj(context, q4);
            Context context2 = this.b;
            K1.a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.b;
            C0726vj c0726vj = this.f;
            C0376jg r = C0747wb.k().r();
            IHandlerExecutor f = C0747wb.k().w().f();
            Y6 y6 = new Y6(context3, c0726vj, EnumC0603rc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0130b0(), new BlockingExecutor(), "previous");
            Y6 y62 = new Y6(context3, c0726vj, EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Lc(), f, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                W6 w6 = new W6(crashesDirectory, y62, new C0343ib());
                f.execute(new RunnableC0783xi(crashesDirectory, y6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                w6.startWatching();
                C0747wb.I.E.storeReference(w6);
            }
            r.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r.a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r.a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    C0232eg b3 = r.b.b(context3, c0726vj);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b3.newCrash((NativeCrash) it.next());
                    }
                }
                r.a.setDefaultCrashHandler(r.b.a(context3, c0726vj));
            }
            new A6(t75.c(new Bj())).run();
            this.a = true;
        }
        C0747wb.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void onDestroy() {
        C0258fd l = C0747wb.I.l();
        synchronized (l) {
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0441ln) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Xh xh;
        bundle.setClassLoader(Xh.class.getClassLoader());
        String str = Xh.c;
        try {
            xh = (Xh) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            xh = null;
        }
        Integer asInteger = xh != null ? xh.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void reportData(int i, Bundle bundle) {
        this.j.getClass();
        List list = (List) C0747wb.I.v.a.get(Integer.valueOf(i));
        if (list == null) {
            list = c5b.a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0153bn) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Xh xh;
        bundle.setClassLoader(Xh.class.getClassLoader());
        String str = Xh.c;
        try {
            xh = (Xh) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            xh = null;
        }
        Integer asInteger = xh != null ? xh.a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.h.c(asInteger.intValue());
        }
    }

    public C0276g2(@NonNull Context context, @NonNull T1 t1) {
        this(context, t1, new V5(context));
    }

    public C0276g2(Context context, T1 t1, Q4 q4, C0536p2 c0536p2, C0487nb c0487nb, T2 t2, C0305h2 c0305h2) {
        this.a = false;
        this.b = context;
        this.c = t1;
        this.d = q4;
        this.e = c0536p2;
        this.g = c0487nb;
        this.h = t2;
        this.i = c0305h2;
        this.j = new Gj();
    }

    public final void a() {
        this.e.c(new w2d(2, this));
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        H6.b(bundle);
        C0726vj c0726vj = this.f;
        if (c0726vj != null) {
            c0726vj.a(H6.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void a(Intent intent, int i) {
        ((C0793y0) this.c).a.stopSelf(i);
    }

    @Override // io.appmetrica.analytics.impl.U1
    public final void a(Intent intent, int i, int i2) {
        ((C0793y0) this.c).a.stopSelf(i2);
    }
}
