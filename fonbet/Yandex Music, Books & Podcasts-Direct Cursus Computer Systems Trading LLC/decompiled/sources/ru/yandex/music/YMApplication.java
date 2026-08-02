package ru.yandex.music;

import android.app.Application;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import com.yandex.music.shared.media.session.session.MusicMediaButtonReceiver;
import com.yandex.passport.R;
import com.yandex.passport.api.h;
import com.yandex.passport.api.q;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent;
import com.yandex.passport.internal.n;
import com.yandex.passport.internal.network.p;
import com.yandex.passport.internal.properties.w;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.provider.InternalProvider;
import com.yandex.passport.internal.report.ye;
import com.yandex.passport.internal.v;
import com.yandex.plus.core.network.api.utils.a;
import com.yandex.plus.pay.ui.core.b;
import defpackage.a1l;
import defpackage.aaa;
import defpackage.aaw;
import defpackage.aec;
import defpackage.at0;
import defpackage.av0;
import defpackage.b6e;
import defpackage.b9s;
import defpackage.bca;
import defpackage.bdt;
import defpackage.bec;
import defpackage.bfj;
import defpackage.bhp;
import defpackage.bjt;
import defpackage.bow;
import defpackage.bt0;
import defpackage.btf;
import defpackage.byb;
import defpackage.c5b;
import defpackage.c9k;
import defpackage.ca8;
import defpackage.cba;
import defpackage.cmd;
import defpackage.cs1;
import defpackage.csr;
import defpackage.css;
import defpackage.cst;
import defpackage.ct0;
import defpackage.cz;
import defpackage.d2j;
import defpackage.d4i;
import defpackage.d64;
import defpackage.d7i;
import defpackage.d9s;
import defpackage.db;
import defpackage.dfi;
import defpackage.dla;
import defpackage.dm6;
import defpackage.dml;
import defpackage.dt0;
import defpackage.dv0;
import defpackage.e00;
import defpackage.e5b;
import defpackage.e6q;
import defpackage.ebn;
import defpackage.ela;
import defpackage.em;
import defpackage.ern;
import defpackage.eyr;
import defpackage.f6n;
import defpackage.f7r;
import defpackage.ff2;
import defpackage.frc;
import defpackage.fs;
import defpackage.fx1;
import defpackage.g06;
import defpackage.g1n;
import defpackage.g68;
import defpackage.g6o;
import defpackage.gcr;
import defpackage.gfl;
import defpackage.gka;
import defpackage.gld;
import defpackage.gtm;
import defpackage.hag;
import defpackage.hdg;
import defpackage.hl;
import defpackage.iv0;
import defpackage.ixf;
import defpackage.iyb;
import defpackage.j5h;
import defpackage.j62;
import defpackage.j7w;
import defpackage.joj;
import defpackage.jp6;
import defpackage.jq;
import defpackage.jt6;
import defpackage.ju0;
import defpackage.jyr;
import defpackage.k3;
import defpackage.k3f;
import defpackage.k3j;
import defpackage.k62;
import defpackage.k7w;
import defpackage.kbn;
import defpackage.kgr;
import defpackage.khr;
import defpackage.ki;
import defpackage.knb;
import defpackage.ksw;
import defpackage.l18;
import defpackage.l1b;
import defpackage.l48;
import defpackage.lbr;
import defpackage.le7;
import defpackage.lg3;
import defpackage.lhs;
import defpackage.lot;
import defpackage.lzt;
import defpackage.m8e;
import defpackage.mm6;
import defpackage.mmo;
import defpackage.mn7;
import defpackage.mp6;
import defpackage.mpq;
import defpackage.n7w;
import defpackage.n8e;
import defpackage.nec;
import defpackage.nxv;
import defpackage.nz5;
import defpackage.o62;
import defpackage.o7b;
import defpackage.ofc;
import defpackage.ouj;
import defpackage.ow1;
import defpackage.ox1;
import defpackage.ox6;
import defpackage.p6o;
import defpackage.pd;
import defpackage.pjc;
import defpackage.psh;
import defpackage.q46;
import defpackage.q6k;
import defpackage.q70;
import defpackage.q7l;
import defpackage.qdc;
import defpackage.qe2;
import defpackage.qhp;
import defpackage.qju;
import defpackage.qrc;
import defpackage.qxp;
import defpackage.r1w;
import defpackage.r9k;
import defpackage.raa;
import defpackage.rjq;
import defpackage.rq0;
import defpackage.rve;
import defpackage.ryp;
import defpackage.saa;
import defpackage.si5;
import defpackage.sj;
import defpackage.ssg;
import defpackage.sss;
import defpackage.sxd;
import defpackage.t75;
import defpackage.t81;
import defpackage.taa;
import defpackage.tdq;
import defpackage.te2;
import defpackage.tf6;
import defpackage.ti5;
import defpackage.tqn;
import defpackage.u10;
import defpackage.u21;
import defpackage.u2f;
import defpackage.u36;
import defpackage.u58;
import defpackage.uf2;
import defpackage.um6;
import defpackage.v08;
import defpackage.v0r;
import defpackage.v2f;
import defpackage.v3g;
import defpackage.v42;
import defpackage.vka;
import defpackage.vm7;
import defpackage.vtm;
import defpackage.vzn;
import defpackage.wf2;
import defpackage.wxf;
import defpackage.wz1;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xrm;
import defpackage.xxq;
import defpackage.xz0;
import defpackage.y1g;
import defpackage.y60;
import defpackage.yka;
import defpackage.yni;
import defpackage.yrt;
import defpackage.ys0;
import defpackage.yxc;
import defpackage.z22;
import defpackage.z2b;
import defpackage.zf2;
import defpackage.zh5;
import defpackage.zju;
import defpackage.zni;
import defpackage.zo6;
import defpackage.zsd;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.MviEventsReporter;
import j$.time.Duration;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.data.sql.YMContentProvider;
import ru.yandex.music.utils.CrashReportingTree;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class YMApplication extends Application implements q46 {
    public static final long c = SystemClock.uptimeMillis();
    public static final ju0 d;
    public final g1n a = new g1n(this, c);
    public final jyr b;

    static {
        ju0 ju0Var = new ju0(0);
        d = ju0Var;
        System.setProperty("kotlinx.coroutines.debug", "on");
        System.setProperty("kotlinx.coroutines.stacktrace.recovery", PListParser.TAG_TRUE);
        bow.p = "release";
        hdg.a = new qxp(new vzn[]{new dml(), new ofc(27)});
        ((lhs) ju0Var.a).d();
    }

    public YMApplication() {
        m8e m8eVar = n8e.i0;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m8eVar.getClass();
        m8e.c = countDownLatch;
        this.b = btf.b(new j7w(this, 1));
    }

    public static boolean a(YMApplication yMApplication) {
        return Build.VERSION.SDK_INT >= 28 ? Intrinsics.d(Application.getProcessName(), yMApplication.getPackageName()) : YMContentProvider.a;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(context);
        File file = z2b.b;
        if (file == null) {
            file = new File(getCacheDir(), "lock");
            z2b.b = file;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            channel.getClass();
            FileLock lock = channel.lock();
            if (lock != null && lock.isValid()) {
                lock.release();
            }
            randomAccessFile.close();
            ((lhs) d.b).d();
        } finally {
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        Context baseContext = super.getBaseContext();
        if (!(baseContext instanceof ContextWrapper)) {
            baseContext.getClass();
            return baseContext;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        baseContext2.getClass();
        return baseContext2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0886  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate() {
        String str;
        xxq d2;
        g gVar;
        Class cls;
        AtomicBoolean atomicBoolean;
        AtomicReference atomicReference;
        Object obj;
        gcr gcrVar;
        ReentrantLock reentrantLock;
        qrc qrcVar;
        boolean z;
        z22 z22Var;
        pjc a;
        NotificationManager g;
        super.onCreate();
        b();
        if (b()) {
            ((lhs) d.b).c();
        }
        boolean z2 = InternalProvider.d;
        int i = 15;
        int i2 = 1;
        Continuation continuation = null;
        if (InternalProvider.d) {
            y1g.D("1:1087931301371:android:e59a18cd1f5e18bd429f5e", "ApplicationId must be set.");
            y1g.D("AIzaSyCSKZr-iHfeClaMNXgApoP46XJQzBFy6qI", "ApiKey must be set.");
            aec.h(new nec("1:1087931301371:android:e59a18cd1f5e18bd429f5e", "AIzaSyCSKZr-iHfeClaMNXgApoP46XJQzBFy6qI", null, null, "1087931301371", null, "passportpushproduction"), this, "firebase_passport");
            ys0 ys0Var = new ys0(this, i2);
            List list = v.a;
            w wVar = new w();
            wVar.a = new LinkedHashMap();
            wVar.b = new LinkedHashMap();
            c5b c5bVar = c5b.a;
            wVar.c = c5bVar;
            wVar.d = c5bVar;
            wVar.e = new joj();
            wVar.g = c5bVar;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            wVar.i = new p(e5bVar);
            wVar.j = e5bVar;
            wVar.l = e5bVar;
            wVar.m = e5bVar;
            ys0Var.invoke(wVar);
            x r = a.r(wVar);
            if (InternalProvider.d) {
                IReporterYandex b = ye.b(this);
                com.yandex.passport.internal.di.a.b = b;
                com.yandex.passport.legacy.a.a = r.q;
                com.yandex.passport.legacy.a.e(6, c.q(20, "="), null);
                com.yandex.passport.legacy.a.e(6, "LOGGER ENABLED IN RELEASE BUILD", null);
                com.yandex.passport.legacy.a.e(6, c.q(20, "="), null);
                d dVar = com.yandex.passport.common.logger.a.a;
                q qVar = r.q;
                com.yandex.passport.common.logger.a.a = qVar != null ? new l(qVar) : com.yandex.passport.common.logger.c.a;
                b.a = getApplicationContext();
                String string = getString(R.string.passport_account_type);
                string.getClass();
                if (!string.equals("com.yandex.passport")) {
                    com.yandex.passport.internal.ui.a.a = "com.yandex.passport".concat(string.substring(19));
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "initialize component", 8);
                }
                com.yandex.passport.internal.di.a.a = DaggerPassportProcessGlobalComponent.builder().setApplicationContext(this).setIReporterInternal(b).setProperties(a.r(r)).build();
                com.yandex.passport.internal.di.a.c.countDown();
                b.putAppEnvironmentValue("am_version", "7.54.1");
                AppMetricaYandex.putErrorEnvironmentValue("am_version", "7.54.1");
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    Thread.setDefaultUncaughtExceptionHandler(new n(defaultUncaughtExceptionHandler, com.yandex.passport.internal.di.a.a().getMetricaReporter()));
                }
                new Thread(new gtm(i, r, this, b)).start();
                com.yandex.passport.internal.util.q.b();
            }
            qhp qhpVar = rq0.a;
            int i3 = lzt.a;
            registerActivityLifecycleCallbacks(new uf2(3, this));
        }
        if (!b()) {
            ssg.a(3, null, "skipped non-main process", null);
            return;
        }
        wz1.a = new c9k(this);
        ju0 ju0Var = d;
        lhs lhsVar = (lhs) ju0Var.c;
        lhsVar.d();
        b9s[] b9sVarArr = d9s.a;
        n7w.O().postDelayed(new jq(6), 5000L);
        n7w.O().postDelayed(new jq(7), 5000 * 2);
        Thread.setDefaultUncaughtExceptionHandler(new zo6(Thread.getDefaultUncaughtExceptionHandler(), new ys0(this, 2)));
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = frc.a;
        activityLifecycleCallbacks.getClass();
        registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26 && (g = l1b.g(this)) != null) {
            Resources resources = getResources();
            resources.getClass();
            fx1.c(g, resources, bfj.d, false);
            fx1.c(g, resources, bfj.e, false);
            fx1.c(g, resources, bfj.f, true);
        }
        boolean z3 = zni.a;
        x97.y((mm6) zni.b.getValue(), null, null, new yni(this, continuation, i4), 3);
        lhs lhsVar2 = (lhs) ju0Var.f;
        lhs a2 = lhsVar.a(lhsVar2.a, lhsVar2.b, lhsVar2.c, lhsVar2.d, lhsVar2.e);
        a2.d();
        l18 l18Var = l18.b;
        l18Var.a(new ys0(this, i4));
        int D = ouj.D(wxf.u());
        if (D != 0) {
            if (D == 1) {
                Timber.Companion companion = Timber.INSTANCE;
                companion.plant(new mp6());
                companion.plant(new xrm(q6k.C(this)));
            } else if (D != 2) {
                b6e.s();
                return;
            } else {
                Timber.Companion companion2 = Timber.INSTANCE;
                companion2.plant(new Timber.DebugTree());
                companion2.plant(new xrm(q6k.C(this)));
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        ki kiVar = v3g.a;
        if (kiVar == null) {
            kiVar = new ki();
            v3g.a = kiVar;
        }
        if (!kiVar.c) {
            kiVar.c = true;
            kiVar.a.i = true;
            registerActivityLifecycleCallbacks(kiVar);
        }
        lhs lhsVar3 = (lhs) ju0Var.d;
        lhs a3 = a2.a(lhsVar3.a, lhsVar3.b, lhsVar3.c, lhsVar3.d, lhsVar3.e);
        a3.d();
        bdt I = hag.I(k3f.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        k3f k3fVar = (k3f) qdcVar.C(I);
        v2f v2fVar = ksw.j;
        at0 at0Var = at0.a;
        Duration duration = d2j.f;
        k3fVar.a(v2fVar, at0Var, new u10(16));
        v2f v2fVar2 = ksw.k;
        k3fVar.a(v2fVar2, bt0.a, new csr(11));
        k3fVar.a(ksw.l, ct0.a, new csr(10));
        a3.c();
        lhs lhsVar4 = (lhs) ju0Var.e;
        lhs a4 = a2.a(lhsVar4.a, lhsVar4.b, lhsVar4.c, lhsVar4.d, lhsVar4.e);
        a4.d();
        cmd cmdVar = cmd.a;
        lhs lhsVar5 = (lhs) ju0Var.h;
        lhs a5 = a4.a(lhsVar5.a, lhsVar5.b, lhsVar5.c, lhsVar5.d, lhsVar5.e);
        a5.d();
        bdt I2 = hag.I(jp6.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase("LI_AUTO")) {
            Set Y = xz0.Y(new String[]{"HU_SS3", "HU_SS2MAXF", "HU_SS2MAXR", "HU_SS2PRO"});
            String str3 = Build.MODEL;
            str3.getClass();
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (Y.contains(upperCase)) {
                bec.a().b(false);
                bdt I3 = hag.I(q70.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                q70 q70Var = (q70) qdcVar3.C(I3);
                str = bow.p;
                if (str != null) {
                    Intrinsics.j("buildType");
                    throw null;
                }
                String str4 = str.equals("autotest") ? "abc12345-0000-1111-2222-556667788999" : "d7fc6f68-96e6-4764-a506-50908c78d2ef";
                boolean z4 = 3 == wxf.u();
                if (bow.p == null) {
                    Intrinsics.j("buildType");
                    throw null;
                }
                vm7 vm7Var = new vm7(str4, z4, !r14.equals("autotest"));
                bdt I4 = hag.I(Application.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                q70Var.a = new y60((Application) qdcVar4.C(I4), vm7Var);
                bdt I5 = hag.I(kgr.class);
                qdc qdcVar5 = l18Var.a;
                qdcVar5.getClass();
                kgr kgrVar = (kgr) qdcVar5.C(I5);
                mn7 mn7Var = dm6.b;
                x97.y(cmdVar, mn7Var, null, new yni(this, null, 2), 2);
                lg3.x = kgrVar;
                MviEventsReporter mviEventsReporter = AppMetricaYandex.getMviEventsReporter();
                mviEventsReporter.getClass();
                hdg.b = mviEventsReporter;
                knb.a = new aaw(13);
                a5.c();
                lhs lhsVar6 = (lhs) ju0Var.i;
                lhs a6 = a4.a(lhsVar6.a, lhsVar6.b, lhsVar6.c, lhsVar6.d, lhsVar6.e);
                a6.d();
                bdt I6 = hag.I(av0.class);
                qdc qdcVar6 = l18Var.a;
                qdcVar6.getClass();
                av0 av0Var = (av0) qdcVar6.C(I6);
                bdt I7 = hag.I(cst.class);
                qdc qdcVar7 = l18Var.a;
                qdcVar7.getClass();
                bjt bjtVar = new bjt(av0Var, (cst) qdcVar7.C(I7), l18Var.b(hag.I(q7l.class), true), l18Var.b(hag.I(raa.class), true));
                iv0 iv0Var = (iv0) av0Var;
                pjc b0 = zsd.b0(iv0Var.a.g());
                tf6 tf6Var = (tf6) bjtVar.d;
                ox6.B(b0, tf6Var, new lot(3, bjtVar));
                ox6.B(new u21(9, null, iv0Var.a.g(), new v42(bjtVar, null, 14)), tf6Var, o7b.f);
                bdt I8 = hag.I(d4i.class);
                qdc qdcVar8 = l18Var.a;
                qdcVar8.getClass();
                new vtm(this, av0Var, (d4i) qdcVar8.C(I8));
                bdt I9 = hag.I(le7.class);
                qdc qdcVar9 = l18Var.a;
                qdcVar9.getClass();
                String str5 = r9k.PRODUCTION.a;
                q qVar2 = h.b;
                int parseInt = Integer.parseInt(str5);
                qVar2.getClass();
                h a7 = q.a(parseInt);
                if (a7 == null) {
                    xq0.x("Required value was null.");
                    return;
                }
                Continuation continuation2 = null;
                dv0 dv0Var = new dv0(iv0Var, a7.a.a, continuation2, 0);
                g gVar2 = g.a;
                yxc yxcVar = (yxc) x97.D(gVar2, dv0Var);
                if (yxcVar == null) {
                    iv0Var.i(null);
                    d2 = yrt.a;
                } else {
                    x97.y(iv0Var.c, null, null, new k3(iv0Var, yxcVar, continuation2, 13), 3);
                    d2 = yxcVar.d();
                }
                a6.c();
                bdt I10 = hag.I(khr.class);
                qdc qdcVar10 = l18Var.a;
                qdcVar10.getClass();
                ((khr) qdcVar10.C(I10)).b = d2;
                lhs lhsVar7 = (lhs) ju0Var.j;
                lhs a8 = a4.a(lhsVar7.a, lhsVar7.b, lhsVar7.c, lhsVar7.d, lhsVar7.e);
                a8.d();
                bdt I11 = hag.I(byb.class);
                qdc qdcVar11 = l18Var.a;
                qdcVar11.getClass();
                byb bybVar = (byb) qdcVar11.C(I11);
                String str6 = d2.a;
                str6.getClass();
                g06 g06Var = bybVar.k;
                g06Var.getClass();
                if (((byb) g06Var.d).j != null) {
                    gVar = gVar2;
                    ssg.a(7, null, "", new Exception("Experiments: init() called second time"));
                } else {
                    gVar = gVar2;
                }
                if (((byb) g06Var.d).j == null) {
                    g06Var.Y(str6);
                }
                ((byb) g06Var.d).j = str6;
                ReentrantLock reentrantLock2 = (ReentrantLock) g06Var.c;
                reentrantLock2.lock();
                try {
                    ((ExecutorService) g06Var.b).execute(new jt6(28, g06Var, str6));
                    reentrantLock2.unlock();
                    a8.c();
                    lhs lhsVar8 = (lhs) ju0Var.m;
                    lhs a9 = a4.a(lhsVar8.a, lhsVar8.b, lhsVar8.c, lhsVar8.d, lhsVar8.e);
                    a9.d();
                    getPackageManager().setComponentEnabledSetting(new ComponentName(this, (Class<?>) Media3SessionService.class), 1, 1);
                    bdt I12 = hag.I(psh.class);
                    qdc qdcVar12 = l18Var.a;
                    qdcVar12.getClass();
                    psh pshVar = (psh) qdcVar12.C(I12);
                    if (MusicMediaButtonReceiver.d != null) {
                        dfi.r("MusicMediaButtonReceiver component provider is already initialized", "MusicMediaButtonReceiver");
                    }
                    MusicMediaButtonReceiver.d = pshVar;
                    if (Media3SessionService.i != null) {
                        dfi.r("Media3SessionService component provider is already initialized", "Media3SessionService");
                    }
                    Media3SessionService.i = pshVar;
                    a9.c();
                    bdt I13 = hag.I(ela.class);
                    qdc qdcVar13 = l18Var.a;
                    qdcVar13.getClass();
                    ela elaVar = (ela) qdcVar13.C(I13);
                    int i5 = 27;
                    if (elaVar.b.compareAndSet(false, true)) {
                        vka vkaVar = (vka) elaVar.a.getValue();
                        taa taaVar = (taa) vkaVar.k.getValue();
                        taaVar.getClass();
                        xdr xdrVar = saa.a;
                        x97.y(taaVar.h, null, null, new g68(taaVar, null, 3), 3);
                        e6q e6qVar = (e6q) vkaVar.d.getValue();
                        ox6.B(zsd.b0(new p6o(((yka) e6qVar.b).e.g(), 17)), e6qVar.c, new ryp(8, e6qVar));
                        aaa aaaVar = (aaa) vkaVar.i.getValue();
                        ox6.B(zsd.u0(zsd.b0(new d64(aaaVar.b.g(), i5)), aaaVar.a.c), aaaVar.c, new u58(4, aaaVar));
                        cba cbaVar = (cba) vkaVar.j.getValue();
                        ox6.B(zsd.u0(zsd.b0(new d64(cbaVar.b.g(), 28)), cbaVar.a.c), cbaVar.c, new u58(5, cbaVar));
                        o62 o62Var = (o62) vkaVar.n.getValue();
                        if (o62Var != null) {
                            jyr jyrVar = o62Var.h;
                            jyr jyrVar2 = o62Var.e;
                            pjc a10 = ((dla) jyrVar2.getValue()).a();
                            tf6 tf6Var2 = o62Var.i;
                            ox6.B(a10, tf6Var2, new k62(o62Var, 1));
                            ox6.B(new cz(new fs(5, new em(new u21(10, ((dla) jyrVar2.getValue()).a(), (pjc) jyrVar.getValue(), j62.a), 1)), o62Var, 7), tf6Var2, new k62(o62Var, 0));
                            z22 z22Var2 = (z22) o62Var.d;
                            if (z22Var2.g()) {
                                z22Var = z22Var2;
                                cls = byb.class;
                                ox6.B(zsd.b0(new bca(new u21(10, o62Var.d().b(css.h), (pjc) jyrVar.getValue(), new t81(3, 1, (Continuation) null)), 18)), tf6Var2, new k62(o62Var, 2));
                            } else {
                                z22Var = z22Var2;
                                cls = byb.class;
                            }
                            boolean g2 = z22Var.g();
                            int i6 = 1;
                            if (g2) {
                                a = o62Var.d().b(css.g);
                            } else {
                                if (g2) {
                                    b6e.s();
                                    return;
                                }
                                a = o62Var.d().a();
                            }
                            x97.y(tf6Var2, null, null, new cs1(new u21(10, a, z22Var.l(), new ow1(3, i6, (Continuation) null)), (Continuation) null, o62Var), 3);
                            bdt I14 = hag.I(g6o.class);
                            qdc qdcVar14 = l18Var.a;
                            qdcVar14.getClass();
                            kbn kbnVar = (kbn) ((g6o) qdcVar14.C(I14)).a.getValue();
                            kbnVar.getClass();
                            rjq rjqVar = kbnVar.m;
                            atomicBoolean = kbnVar.o;
                            Continuation continuation3 = null;
                            ssg.a(4, "QueueRestoreFacade", "isFeatureEnable = true isStateEnable=true", null);
                            if (!atomicBoolean.getAndSet(true)) {
                                rjqVar.g();
                                ssg.a(4, "QueueRestoreFacade", "init", null);
                                um6 um6Var = kbnVar.n;
                                x97.y(um6Var, mn7Var, null, new d7i(kbnVar, continuation3, 15), 2);
                                ox6.B(kbnVar.s, gld.X(um6Var, mn7Var), new ebn(kbnVar, 0));
                                ox6.B(zsd.X(kbnVar.r, 500L), gld.X(um6Var, mn7Var), new ebn(kbnVar, 1));
                            }
                            bdt I15 = hag.I(sss.class);
                            qdc qdcVar15 = l18Var.a;
                            qdcVar15.getClass();
                            sss sssVar = (sss) qdcVar15.C(I15);
                            ox6.B(new mpq(11, zsd.d0(zsd.b0((a1l) sssVar.a.a), 1), sssVar), sssVar.d, new ryp(27, sssVar));
                            a4.c();
                            lhs lhsVar9 = (lhs) ju0Var.g;
                            lhs a11 = a2.a(lhsVar9.a, lhsVar9.b, lhsVar9.c, lhsVar9.d, lhsVar9.e);
                            a11.d();
                            bdt I16 = hag.I(rve.class);
                            qdc qdcVar16 = l18Var.a;
                            qdcVar16.getClass();
                            rve rveVar = (rve) qdcVar16.C(I16);
                            bdt I17 = hag.I(Context.class);
                            qdc qdcVar17 = l18Var.a;
                            qdcVar17.getClass();
                            x97.y(cmdVar, ca8.a, null, new nz5((Context) qdcVar17.C(I17), rveVar.a, (Continuation) null, 22), 2);
                            sxd sxdVar = new sxd(13);
                            atomicReference = lbr.a;
                            obj = atomicReference.get();
                            gcrVar = gcr.c;
                            if (obj != gcrVar) {
                                sxdVar.invoke();
                            } else {
                                reentrantLock = lbr.e;
                                reentrantLock.lock();
                                try {
                                    lbr.f.add(sxdVar);
                                    reentrantLock.unlock();
                                    lbr.b();
                                } finally {
                                }
                            }
                            lhs lhsVar10 = (lhs) ju0Var.k;
                            lhs a12 = a11.a(lhsVar10.a, lhsVar10.b, lhsVar10.c, lhsVar10.d, lhsVar10.e);
                            a12.d();
                            bdt I18 = hag.I(eyr.class);
                            qdc qdcVar18 = l18Var.a;
                            qdcVar18.getClass();
                            eyr eyrVar = (eyr) qdcVar18.C(I18);
                            bdt I19 = hag.I(te2.class);
                            qdc qdcVar19 = l18Var.a;
                            qdcVar19.getClass();
                            List c2 = t75.c((te2) qdcVar19.C(I19));
                            c2.getClass();
                            eyrVar.a.d(eyr.b[0], x97.y(cmdVar, j5h.a, null, new v0r(c2, eyrVar, null, 15), 2));
                            a12.c();
                            a11.c();
                            a2.c();
                            registerActivityLifecycleCallbacks(new k7w());
                            Timber.INSTANCE.plant(new CrashReportingTree());
                            bdt I20 = hag.I(ff2.class);
                            qdc qdcVar20 = l18Var.a;
                            qdcVar20.getClass();
                            e00 e00Var = ((ff2) qdcVar20.C(I20)).a;
                            bdt I21 = hag.I(wf2.class);
                            qdc qdcVar21 = e00Var.a;
                            qdcVar21.getClass();
                            registerActivityLifecycleCallbacks(((wf2) qdcVar21.C(I21)).c);
                            bdt I22 = hag.I(zf2.class);
                            qdc qdcVar22 = e00Var.a;
                            qdcVar22.getClass();
                            zf2 zf2Var = (zf2) qdcVar22.C(I22);
                            ssg.a(3, "AutoplayTrigger", "start() - observing queueUsageFlow, current state: " + zf2Var.a.getValue(), null);
                            x97.y(zf2Var.c, null, null, new hl(zf2Var, null, 20), 3);
                            lhs lhsVar11 = (lhs) ju0Var.l;
                            lhs a13 = lhsVar.a(lhsVar11.a, lhsVar11.b, lhsVar11.c, lhsVar11.d, lhsVar11.e);
                            a13.d();
                            bdt I23 = hag.I(u2f.class);
                            qdc qdcVar23 = l18Var.a;
                            qdcVar23.getClass();
                            u2f u2fVar = (u2f) qdcVar23.C(I23);
                            x97.y(cmdVar, null, null, new ox1(u2fVar, null, 22), 3);
                            u2fVar.a(v2fVar, false);
                            u2fVar.a(v2fVar2, false);
                            a13.c();
                            mmo mmoVar = new mmo(this.a);
                            frc.a(new qe2(1, mmoVar));
                            iyb iybVar = new iyb(mmoVar, 0);
                            if (atomicReference.get() != gcrVar) {
                                iybVar.invoke();
                            } else {
                                reentrantLock = lbr.e;
                                reentrantLock.lock();
                                try {
                                    lbr.f.add(iybVar);
                                    reentrantLock.unlock();
                                    lbr.b();
                                } finally {
                                }
                            }
                            qrcVar = new qrc();
                            qrcVar.h.add(new bhp(24, this));
                            if (!qrcVar.f) {
                                registerActivityLifecycleCallbacks(qrcVar);
                                qrcVar.f = true;
                            }
                            x97.y(gld.e(mn7Var), null, null, new r1w(this, null, 2), 3);
                            frc.a(new tdq(new tqn(), this, new tqn()));
                            registerActivityLifecycleCallbacks(new v08(new sj(3)));
                            jyr jyrVar3 = ti5.a;
                            frc.a(new si5(0));
                            jyr jyrVar4 = f7r.a;
                            frc.a(new si5(1));
                            jyr jyrVar5 = k3j.e;
                            if (ixf.x()) {
                                ssg.a(3, "SkeletonCommunicationAnchors", "register anchors", null);
                                Parcelable.Creator<zh5> creator = zh5.CREATOR;
                                l48.z("music-trends-tab", true, true);
                                l48.z("music-book-tab", true, true);
                                l48.z("music-podcast-tab", true, true);
                                l48.z("music-kids-tab", true, true);
                                ssg.a(3, "MainScreenCommunicationTriggerProcessor", "register anchors", null);
                                l48.z("music-launch", (r3 & 2) == 0, (r3 & 4) == 0);
                                bdt I24 = hag.I(cls);
                                qdc qdcVar24 = l18Var.a;
                                qdcVar24.getClass();
                                if (((u36) ((byb) qdcVar24.C(I24)).c(ern.a(u36.class))).h()) {
                                    z = true;
                                    l48.z("music-concert-tab", true, true);
                                } else {
                                    z = true;
                                }
                                l48.z("music-collection-tab", z, z);
                                l48.z("music-take-charge", (r3 & 2) == 0, (r3 & 4) == 0);
                                ssg.a(3, "PlayerCommunicationTriggerProcessor", "register anchors", null);
                                l48.z("music-fullscreen-player", (r3 & 2) == 0, (r3 & 4) == 0);
                                ssg.a(3, "DeeplinkCommunicationTriggerProcessor", "register anchors", null);
                                l48.z("music-deeplink", (r3 & 2) == 0, (r3 & 4) == 0);
                            }
                            bdt I25 = hag.I(f6n.class);
                            qdc qdcVar25 = l18Var.a;
                            qdcVar25.getClass();
                            f6n f6nVar = (f6n) qdcVar25.C(I25);
                            pjc g3 = f6nVar.b.g();
                            gVar.getClass();
                            int i7 = 21;
                            ox6.B(g3, new tf6(mn7Var), new gfl(i7, f6nVar));
                            x97.y(gld.e(mn7Var), null, null, new dt0(2, i7, null), 3);
                            pd.k = new nxv(13);
                            bdt I26 = hag.I(zju.class);
                            qdc qdcVar26 = l18Var.a;
                            qdcVar26.getClass();
                            ((zju) qdcVar26.C(I26)).a(this);
                            bdt I27 = hag.I(gka.class);
                            qdc qdcVar27 = l18Var.a;
                            qdcVar27.getClass();
                            gka gkaVar = (gka) qdcVar27.C(I27);
                            ox6.B(new u21(10, new bca(gkaVar.b.g(), 12), ((e6q) gkaVar.a).e, new t81(3, 6, (Continuation) null)), cmdVar, new u58(12, gkaVar));
                            j7w j7wVar = new j7w(this, 0);
                            if (atomicReference.get() != gcrVar) {
                                j7wVar.invoke();
                            } else {
                                reentrantLock = lbr.e;
                                reentrantLock.lock();
                                try {
                                    lbr.f.add(j7wVar);
                                    reentrantLock.unlock();
                                    lbr.b();
                                } finally {
                                }
                            }
                            lhsVar.c();
                            registerActivityLifecycleCallbacks(new qju(btf.b(new nxv(14)), btf.b(new nxv(15)), btf.b(new nxv(16))));
                            ((lhs) ju0Var.a).c();
                            x97.y(cmdVar, mn7Var, null, new yni(this, null, 1), 2);
                            b();
                            return;
                        }
                    }
                    cls = byb.class;
                    bdt I142 = hag.I(g6o.class);
                    qdc qdcVar142 = l18Var.a;
                    qdcVar142.getClass();
                    kbn kbnVar2 = (kbn) ((g6o) qdcVar142.C(I142)).a.getValue();
                    kbnVar2.getClass();
                    rjq rjqVar2 = kbnVar2.m;
                    atomicBoolean = kbnVar2.o;
                    Continuation continuation32 = null;
                    ssg.a(4, "QueueRestoreFacade", "isFeatureEnable = true isStateEnable=true", null);
                    if (!atomicBoolean.getAndSet(true)) {
                    }
                    bdt I152 = hag.I(sss.class);
                    qdc qdcVar152 = l18Var.a;
                    qdcVar152.getClass();
                    sss sssVar2 = (sss) qdcVar152.C(I152);
                    ox6.B(new mpq(11, zsd.d0(zsd.b0((a1l) sssVar2.a.a), 1), sssVar2), sssVar2.d, new ryp(27, sssVar2));
                    a4.c();
                    lhs lhsVar92 = (lhs) ju0Var.g;
                    lhs a112 = a2.a(lhsVar92.a, lhsVar92.b, lhsVar92.c, lhsVar92.d, lhsVar92.e);
                    a112.d();
                    bdt I162 = hag.I(rve.class);
                    qdc qdcVar162 = l18Var.a;
                    qdcVar162.getClass();
                    rve rveVar2 = (rve) qdcVar162.C(I162);
                    bdt I172 = hag.I(Context.class);
                    qdc qdcVar172 = l18Var.a;
                    qdcVar172.getClass();
                    x97.y(cmdVar, ca8.a, null, new nz5((Context) qdcVar172.C(I172), rveVar2.a, (Continuation) null, 22), 2);
                    sxd sxdVar2 = new sxd(13);
                    atomicReference = lbr.a;
                    obj = atomicReference.get();
                    gcrVar = gcr.c;
                    if (obj != gcrVar) {
                    }
                    lhs lhsVar102 = (lhs) ju0Var.k;
                    lhs a122 = a112.a(lhsVar102.a, lhsVar102.b, lhsVar102.c, lhsVar102.d, lhsVar102.e);
                    a122.d();
                    bdt I182 = hag.I(eyr.class);
                    qdc qdcVar182 = l18Var.a;
                    qdcVar182.getClass();
                    eyr eyrVar2 = (eyr) qdcVar182.C(I182);
                    bdt I192 = hag.I(te2.class);
                    qdc qdcVar192 = l18Var.a;
                    qdcVar192.getClass();
                    List c22 = t75.c((te2) qdcVar192.C(I192));
                    c22.getClass();
                    eyrVar2.a.d(eyr.b[0], x97.y(cmdVar, j5h.a, null, new v0r(c22, eyrVar2, null, 15), 2));
                    a122.c();
                    a112.c();
                    a2.c();
                    registerActivityLifecycleCallbacks(new k7w());
                    Timber.INSTANCE.plant(new CrashReportingTree());
                    bdt I202 = hag.I(ff2.class);
                    qdc qdcVar202 = l18Var.a;
                    qdcVar202.getClass();
                    e00 e00Var2 = ((ff2) qdcVar202.C(I202)).a;
                    bdt I212 = hag.I(wf2.class);
                    qdc qdcVar212 = e00Var2.a;
                    qdcVar212.getClass();
                    registerActivityLifecycleCallbacks(((wf2) qdcVar212.C(I212)).c);
                    bdt I222 = hag.I(zf2.class);
                    qdc qdcVar222 = e00Var2.a;
                    qdcVar222.getClass();
                    zf2 zf2Var2 = (zf2) qdcVar222.C(I222);
                    ssg.a(3, "AutoplayTrigger", "start() - observing queueUsageFlow, current state: " + zf2Var2.a.getValue(), null);
                    x97.y(zf2Var2.c, null, null, new hl(zf2Var2, null, 20), 3);
                    lhs lhsVar112 = (lhs) ju0Var.l;
                    lhs a132 = lhsVar.a(lhsVar112.a, lhsVar112.b, lhsVar112.c, lhsVar112.d, lhsVar112.e);
                    a132.d();
                    bdt I232 = hag.I(u2f.class);
                    qdc qdcVar232 = l18Var.a;
                    qdcVar232.getClass();
                    u2f u2fVar2 = (u2f) qdcVar232.C(I232);
                    x97.y(cmdVar, null, null, new ox1(u2fVar2, null, 22), 3);
                    u2fVar2.a(v2fVar, false);
                    u2fVar2.a(v2fVar2, false);
                    a132.c();
                    mmo mmoVar2 = new mmo(this.a);
                    frc.a(new qe2(1, mmoVar2));
                    iyb iybVar2 = new iyb(mmoVar2, 0);
                    if (atomicReference.get() != gcrVar) {
                    }
                    qrcVar = new qrc();
                    qrcVar.h.add(new bhp(24, this));
                    if (!qrcVar.f) {
                    }
                    x97.y(gld.e(mn7Var), null, null, new r1w(this, null, 2), 3);
                    frc.a(new tdq(new tqn(), this, new tqn()));
                    registerActivityLifecycleCallbacks(new v08(new sj(3)));
                    jyr jyrVar32 = ti5.a;
                    frc.a(new si5(0));
                    jyr jyrVar42 = f7r.a;
                    frc.a(new si5(1));
                    jyr jyrVar52 = k3j.e;
                    if (ixf.x()) {
                    }
                    bdt I252 = hag.I(f6n.class);
                    qdc qdcVar252 = l18Var.a;
                    qdcVar252.getClass();
                    f6n f6nVar2 = (f6n) qdcVar252.C(I252);
                    pjc g32 = f6nVar2.b.g();
                    gVar.getClass();
                    int i72 = 21;
                    ox6.B(g32, new tf6(mn7Var), new gfl(i72, f6nVar2));
                    x97.y(gld.e(mn7Var), null, null, new dt0(2, i72, null), 3);
                    pd.k = new nxv(13);
                    bdt I262 = hag.I(zju.class);
                    qdc qdcVar262 = l18Var.a;
                    qdcVar262.getClass();
                    ((zju) qdcVar262.C(I262)).a(this);
                    bdt I272 = hag.I(gka.class);
                    qdc qdcVar272 = l18Var.a;
                    qdcVar272.getClass();
                    gka gkaVar2 = (gka) qdcVar272.C(I272);
                    ox6.B(new u21(10, new bca(gkaVar2.b.g(), 12), ((e6q) gkaVar2.a).e, new t81(3, 6, (Continuation) null)), cmdVar, new u58(12, gkaVar2));
                    j7w j7wVar2 = new j7w(this, 0);
                    if (atomicReference.get() != gcrVar) {
                    }
                    lhsVar.c();
                    registerActivityLifecycleCallbacks(new qju(btf.b(new nxv(14)), btf.b(new nxv(15)), btf.b(new nxv(16))));
                    ((lhs) ju0Var.a).c();
                    x97.y(cmdVar, mn7Var, null, new yni(this, null, 1), 2);
                    b();
                    return;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        }
        x97.y(cmdVar, dm6.b, null, new db(2, 6, null), 2);
        bdt I32 = hag.I(q70.class);
        qdc qdcVar32 = l18Var.a;
        qdcVar32.getClass();
        q70 q70Var2 = (q70) qdcVar32.C(I32);
        str = bow.p;
        if (str != null) {
        }
    }
}
