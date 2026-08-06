package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
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

/* loaded from: classes.dex */
public final class B1 implements A1, InterfaceC0729s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4174b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0912z1 f4175c;

    /* renamed from: d, reason: collision with root package name */
    public final C0268a4 f4176d;

    /* renamed from: e, reason: collision with root package name */
    public final J1 f4177e;

    /* renamed from: f, reason: collision with root package name */
    public Sg f4178f;

    /* renamed from: g, reason: collision with root package name */
    public final C0377ea f4179g;

    /* renamed from: h, reason: collision with root package name */
    public final C0421g2 f4180h;

    /* renamed from: i, reason: collision with root package name */
    public final C1 f4181i;

    /* renamed from: j, reason: collision with root package name */
    public final C0359dh f4182j;

    public B1(Context context, InterfaceC0912z1 interfaceC0912z1) {
        this(context, interfaceC0912z1, new C0347d5(context));
    }

    public final void a() {
        this.f4177e.c(new Wo(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f4177e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
            this.f4176d.a(encodedAuthority, Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f4180h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        J1 j12 = this.f4177e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            j12.f4565a.a(action, Integer.valueOf(J1.a(intent)));
        }
        for (Map.Entry entry : j12.f4566b.entrySet()) {
            I1 i12 = (I1) entry.getKey();
            if (((H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0610na.f6575I.v().a(AbstractC0430gb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        C0610na.f6575I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f4173a) {
            C0610na.f6575I.v().a(this.f4174b.getResources().getConfiguration());
        } else {
            this.f4179g.b(this.f4174b);
            C0610na c0610na = C0610na.f6575I;
            synchronized (c0610na) {
                c0610na.f6577B.initAsync();
                c0610na.f6602u.a(c0610na.f6583a);
                c0610na.f6602u.a(new C0520jo(c0610na.f6577B));
                NetworkServiceLocator.init(c0610na.f6583a, new C0398f5(new C0670pi(c0610na.h()), new C0657p5(c0610na.f6583a)));
                c0610na.l().a(c0610na.f6599q);
                c0610na.E();
            }
            Wj.f5313a.e();
            C0467hm c0467hm = C0610na.f6575I.f6602u;
            c0467hm.b();
            C0415fm b2 = c0467hm.b();
            C0879xk p2 = C0610na.f6575I.p();
            p2.a(new C0336ck(new C0277ad(this.f4177e)), b2);
            c0467hm.a(p2);
            ((Al) C0610na.f6575I.z()).getClass();
            a();
            C0610na.f6575I.m().init();
            C0610na.f6575I.c().init();
            C1 c1 = this.f4181i;
            Context context = this.f4174b;
            C0268a4 c0268a4 = this.f4176d;
            c1.getClass();
            this.f4178f = new Sg(context, c0268a4);
            Context context2 = this.f4174b;
            AbstractC0782u1.f6961a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f4174b;
            Sg sg = this.f4178f;
            Od r2 = C0610na.k().r();
            IHandlerExecutor d2 = C0610na.k().w().d();
            C0425g6 c0425g6 = new C0425g6(context3, sg, EnumC0301bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0425g6 c0425g62 = new C0425g6(context3, sg, EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0585mb(), d2, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0373e6 fileObserverC0373e6 = new FileObserverC0373e6(crashesDirectory, c0425g62, new C0274aa());
                d2.execute(new Uf(crashesDirectory, c0425g6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0373e6.startWatching();
                C0610na.f6575I.f6580E.storeReference(fileObserverC0373e6);
            }
            r2.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r2.f4860a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = r2.f4860a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Jd b3 = r2.f4861b.b(context3, sg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b3.newCrash((NativeCrash) it.next());
                    }
                }
                r2.f4860a.setDefaultCrashHandler(r2.f4861b.a(context3, sg));
            }
            new I5(AbstractC0083a.m(new Yg())).run();
            this.f4173a = true;
        }
        C0610na.f6575I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        Fb l2 = C0610na.f6575I.l();
        synchronized (l2) {
            Iterator it = l2.f4380c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0568lk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        Bf bf;
        bundle.setClassLoader(Bf.class.getClassLoader());
        String str = Bf.f4213c;
        try {
            bf = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            bf = null;
        }
        Integer asInteger = bf != null ? bf.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f4180h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i2, Bundle bundle) {
        this.f4182j.getClass();
        List list = (List) C0610na.f6575I.f6603v.f5950a.get(Integer.valueOf(i2));
        if (list == null) {
            list = i1.r.f3416a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0362dk) it.next()).reportData(i2, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        Bf bf;
        bundle.setClassLoader(Bf.class.getClassLoader());
        String str = Bf.f4213c;
        try {
            bf = (Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            bf = null;
        }
        Integer asInteger = bf != null ? bf.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f4180h.c(asInteger.intValue());
        }
    }

    public B1(Context context, InterfaceC0912z1 interfaceC0912z1, C0347d5 c0347d5) {
        this(context, interfaceC0912z1, new C0268a4(context, c0347d5), new J1(), C0377ea.f5924d, C0610na.k().e(), new C1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        J1 j12 = this.f4177e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            j12.f4565a.a(action, Integer.valueOf(J1.a(intent)));
        }
        for (Map.Entry entry : j12.f4566b.entrySet()) {
            I1 i12 = (I1) entry.getKey();
            if (((H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public B1(Context context, InterfaceC0912z1 interfaceC0912z1, C0268a4 c0268a4, J1 j12, C0377ea c0377ea, C0421g2 c0421g2, C1 c1) {
        this.f4173a = false;
        this.f4174b = context;
        this.f4175c = interfaceC0912z1;
        this.f4176d = c0268a4;
        this.f4177e = j12;
        this.f4179g = c0377ea;
        this.f4180h = c0421g2;
        this.f4181i = c1;
        this.f4182j = new C0359dh();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        P5.b(bundle);
        Sg sg = this.f4178f;
        if (sg != null) {
            sg.a(P5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i2) {
        ((C0781u0) this.f4175c).f6960a.stopSelf(i2);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i2, int i3) {
        ((C0781u0) this.f4175c).f6960a.stopSelf(i3);
    }
}
