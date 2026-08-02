package ru.yandex.taxi;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebView;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.yandex.passport.R;
import com.yandex.passport.api.c1;
import com.yandex.passport.api.n0;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.DaggerPassportProcessGlobalComponent;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.experiments.ExperimentsUpdater$LoadingStrategy;
import com.yandex.passport.internal.properties.o;
import com.yandex.passport.internal.push.PushSettingsObserver;
import com.yandex.passport.internal.report.od;
import com.yandex.passport.internal.s;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.internal.util.q;
import defpackage.ac20;
import defpackage.aux0;
import defpackage.b03;
import defpackage.ciy0;
import defpackage.cot;
import defpackage.cvu0;
import defpackage.dne0;
import defpackage.e3n;
import defpackage.e9e;
import defpackage.f0e;
import defpackage.f4z;
import defpackage.f8z0;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h5z0;
import defpackage.hjt;
import defpackage.ho90;
import defpackage.hot;
import defpackage.hst;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.ie00;
import defpackage.j1g;
import defpackage.jl40;
import defpackage.jo90;
import defpackage.jst;
import defpackage.jua0;
import defpackage.ke00;
import defpackage.kn2;
import defpackage.ko21;
import defpackage.ks2;
import defpackage.kst0;
import defpackage.lgd;
import defpackage.ls2;
import defpackage.lt2;
import defpackage.ma1;
import defpackage.ms2;
import defpackage.ny61;
import defpackage.o0e;
import defpackage.omy0;
import defpackage.os2;
import defpackage.oua0;
import defpackage.oz40;
import defpackage.pt2;
import defpackage.qhq0;
import defpackage.qn90;
import defpackage.qt2;
import defpackage.rmp;
import defpackage.rs2;
import defpackage.rt2;
import defpackage.s630;
import defpackage.seu;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u0e;
import defpackage.u451;
import defpackage.u5z;
import defpackage.v0p;
import defpackage.vqn0;
import defpackage.w451;
import defpackage.w511;
import defpackage.wu2;
import defpackage.ww60;
import defpackage.xby;
import defpackage.xw60;
import defpackage.xxm0;
import defpackage.y5e;
import defpackage.yby;
import defpackage.zoy0;
import defpackage.zzf;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.MviTimestamp;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.lifecycle.ApplicationLifecycleTracker;
import ru.yandex.taxi.perf.Milestone;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001NB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H$¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H$¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0005J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010\u0005J\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010\u0005J\u000f\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010H\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u00102R\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/TaxiApplication;", "Landroid/app/Application;", "Lo0e;", "Lpt2;", "<init>", "()V", "Lzy11;", "onCreate", "Landroid/content/Context;", "context", "Lko21;", "getUserLocalePreferences", "(Landroid/content/Context;)Lko21;", "Lb03;", "getApplicationIdRepository$base", "()Lb03;", "getApplicationIdRepository", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "base", "attachBaseContext", "(Landroid/content/Context;)V", "Lrs2;", "appCredentials", "()Lrs2;", "Lma1;", "adjustCredentials", "()Lma1;", "Llt2;", "createAppDelegateFactory", "()Llt2;", "Lv0p;", "externalProcessCredentials", "()Lv0p;", "Lls2;", "appComponentFactory", "()Lls2;", "Lks2;", "getComponent", "()Lks2;", "Lw451;", "widgetsAppComponentFactory", "()Lw451;", "Lqn90;", "passportAppComponentFactory", "()Lqn90;", "Lqt2;", "dependencyProvider", "()Lqt2;", "initCriticalFieldsIfNeeded", "initStrictMode", "Lac20;", "metricaReporter", "initLogging", "(Lac20;)V", "initFlipper", "initLeakCanary", "initDemeter", "initAnrWatchDog", "", "isAppProcess", "()Z", "component", "Lks2;", "Lu451;", "widgetsComponent", "Lu451;", "appDependencyProvider$delegate", "Li3y;", "getAppDependencyProvider", "appDependencyProvider", "Lu0e;", "getWorkManagerConfiguration", "()Lu0e;", "workManagerConfiguration", "Companion", "aux0"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TaxiApplication extends Application implements o0e, pt2 {
    private static TaxiApplication sInstance;

    /* renamed from: appDependencyProvider$delegate, reason: from kotlin metadata */
    private final i3y appDependencyProvider = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qhq0(28, this));
    protected ks2 component;
    protected u451 widgetsComponent;
    public static final aux0 Companion = new aux0();
    private static final long initTime = SystemClock.elapsedRealtime();
    private static final MviTimestamp startupMviTime = MviTimestamp.now();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_workManagerConfiguration_$lambda$0(Throwable th) {
        xby.t(jst.e, "WORK_MANAGER:INITIALIZATION_ERROR", th, null, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_workManagerConfiguration_$lambda$1(Throwable th) {
        xby.l(jst.e, "WORK_MANAGER:SCHEDULING_ERROR", null, th, "Failed to schedule job", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qt2 appDependencyProvider_delegate$lambda$0(TaxiApplication taxiApplication) {
        ks2 ks2Var = taxiApplication.component;
        if (ks2Var != null) {
            return new rt2(((zzf) ks2Var).y1);
        }
        u451 u451Var = taxiApplication.widgetsComponent;
        if (u451Var != null) {
            return ((j1g) u451Var).a();
        }
        ny61.r(g8e.o("Invalid process used appDependency: ", Application.getProcessName()));
        return null;
    }

    private final qt2 getAppDependencyProvider() {
        return (qt2) this.appDependencyProvider.getValue();
    }

    public static final TaxiApplication getInstance() {
        Companion.getClass();
        return sInstance;
    }

    public static final TaxiApplication getSInstance() {
        Companion.getClass();
        return sInstance;
    }

    private final void initAnrWatchDog() {
    }

    private final void initCriticalFieldsIfNeeded() {
        if (sInstance == null) {
            sInstance = this;
        }
    }

    private final void initDemeter() {
    }

    private final void initFlipper() {
    }

    private final void initLeakCanary() {
    }

    private final void initLogging(ac20 metricaReporter) {
        ie00 ie00Var = ke00.I2;
        cot cotVar = new cot(0, metricaReporter);
        ie00Var.getClass();
        synchronized (ie00.a) {
            RuntimeException runtimeException = ie00.c;
            if (runtimeException != null) {
                throw runtimeException;
            }
            ie00.c = new RuntimeException("Previous logger installed here");
            ie00.b = cotVar;
        }
        h5z0.a.s(new hot());
    }

    private final void initStrictMode() {
    }

    private final boolean isAppProcess() {
        return jl40.l(getPackageName(), Application.getProcessName());
    }

    public abstract ma1 adjustCredentials();

    public abstract ls2 appComponentFactory();

    public abstract rs2 appCredentials();

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        initCriticalFieldsIfNeeded();
        ko21 userLocalePreferences = getUserLocalePreferences(base);
        y5e.e0 = userLocalePreferences;
        if (userLocalePreferences == null) {
            userLocalePreferences = null;
        }
        super.attachBaseContext(u5z.a(base, userLocalePreferences.a().a));
        kst0.d(this, false);
    }

    public abstract lt2 createAppDelegateFactory();

    @Override // defpackage.pt2
    public qt2 dependencyProvider() {
        return getAppDependencyProvider();
    }

    public abstract v0p externalProcessCredentials();

    public final b03 getApplicationIdRepository$base() {
        return new yby(1, this);
    }

    public final ks2 getComponent() {
        ks2 ks2Var = this.component;
        if (ks2Var != null) {
            return ks2Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public ko21 getUserLocalePreferences(Context context) {
        ks2 ks2Var = this.component;
        if (ks2Var != null) {
            return (ko21) ((zzf) ks2Var).i.get();
        }
        lt2 createAppDelegateFactory = createAppDelegateFactory();
        dne0 dne0Var = new dne0(context);
        b03 applicationIdRepository$base = getApplicationIdRepository$base();
        createAppDelegateFactory.l();
        return new ko21(dne0Var, applicationIdRepository$base, wu2.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ztx0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ztx0] */
    @Override // defpackage.o0e
    public u0e getWorkManagerConfiguration() {
        f0e f0eVar = new f0e();
        f0eVar.c = 7;
        final int i = 0;
        f0eVar.a = new e9e() { // from class: ztx0
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                switch (i) {
                    case 0:
                        TaxiApplication._get_workManagerConfiguration_$lambda$0(th);
                        break;
                    default:
                        TaxiApplication._get_workManagerConfiguration_$lambda$1(th);
                        break;
                }
            }
        };
        final int i2 = 1;
        f0eVar.b = new e9e() { // from class: ztx0
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                switch (i2) {
                    case 0:
                        TaxiApplication._get_workManagerConfiguration_$lambda$0(th);
                        break;
                    default:
                        TaxiApplication._get_workManagerConfiguration_$lambda$1(th);
                        break;
                }
            }
        };
        return new u0e(f0eVar);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Context baseContext = getBaseContext();
        ko21 ko21Var = y5e.e0;
        if (ko21Var == null) {
            ko21Var = null;
        }
        u5z.a(baseContext, ko21Var.a().a);
    }

    @Override // android.app.Application
    public void onCreate() {
        int i;
        boolean isAppProcess = isAppProcess();
        if (isAppProcess || !ProcessPhoenix.isPhoenixProcess(this)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            initStrictMode();
            super.onCreate();
            if (!isAppProcess) {
                if (!p.m()) {
                    if (cvu0.s(Application.getProcessName(), ":widgets", false)) {
                        this.widgetsComponent = ((zoy0) widgetsAppComponentFactory()).o(this);
                        return;
                    }
                    return;
                }
                jo90 a = ((omy0) passportAppComponentFactory()).r(this).a();
                final Application application = a.a;
                if (!p.m()) {
                    gtq0.F("Init Passport from wrong process", null, new IllegalStateException());
                    return;
                }
                int i2 = ho90.a[a.i.a().ordinal()];
                int i3 = 2;
                if (i2 == 1 || i2 == 2) {
                    i = 1;
                } else if (i2 == 3) {
                    i = 2;
                } else {
                    if (i2 != 4) {
                        w511.b();
                        return;
                    }
                    i = -1;
                }
                androidx.appcompat.app.b.setDefaultNightMode(i);
                Locale locale = a.f.a().a;
                u5z.a(application.getApplicationContext(), locale);
                kn2 kn2Var = new kn2(seu.f(), a, locale);
                List list = s.a;
                com.yandex.passport.internal.properties.n nVar = new com.yandex.passport.internal.properties.n();
                kn2Var.invoke(nVar);
                final com.yandex.passport.internal.properties.p a2 = o.a(nVar);
                c1 c1Var = a2.p;
                if (p.m()) {
                    final IReporterYandex b = od.b(application);
                    com.yandex.passport.internal.di.a.b = b;
                    com.yandex.passport.legacy.a.a = c1Var;
                    com.yandex.passport.legacy.a.e(6, cvu0.u(20, "="), null);
                    com.yandex.passport.legacy.a.e(6, "LOGGER ENABLED IN RELEASE BUILD", null);
                    com.yandex.passport.legacy.a.e(6, cvu0.u(20, "="), null);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    com.yandex.passport.common.logger.a.a = c1Var != null ? new com.yandex.passport.biometric.ui.verification.a(i3, c1Var) : com.yandex.passport.common.logger.b.a;
                    com.yandex.passport.common.util.a.a = application.getApplicationContext();
                    String string = application.getString(R.string.passport_account_type);
                    if (!string.equals("com.yandex.passport")) {
                        com.yandex.passport.internal.i.a = "com.yandex.passport".concat(string.substring(19));
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "initialize component", 8);
                    }
                    com.yandex.passport.internal.di.a.a = DaggerPassportProcessGlobalComponent.builder().setApplicationContext(application).setIReporterInternal(b).setProperties(o.a(a2)).build();
                    com.yandex.passport.internal.di.a.c.countDown();
                    b.putAppEnvironmentValue("am_version", "7.55.1");
                    AppMetricaYandex.putErrorEnvironmentValue("am_version", "7.55.1");
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    if (defaultUncaughtExceptionHandler != null) {
                        Thread.setDefaultUncaughtExceptionHandler(new com.yandex.passport.internal.m(defaultUncaughtExceptionHandler, com.yandex.passport.internal.di.a.a().getMetricaReporter()));
                    }
                    new Thread(new Runnable() { // from class: com.yandex.passport.internal.o
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
                        
                            if (r13.get("android.provider.CONTACTS_STRUCTURE") != null) goto L17;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            com.yandex.passport.internal.properties.p pVar = com.yandex.passport.internal.properties.p.this;
                            n0 n0Var = (n0) pVar.a.get(com.yandex.passport.api.h.a);
                            Application application2 = application;
                            w wVar = new w(application2, b, n0Var);
                            PackageManager packageManager = wVar.b;
                            Context context = wVar.a;
                            String str = wVar.c;
                            com.yandex.passport.legacy.a.a("validateAndThrow: start");
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                wVar.i(arrayList);
                                if (!(context.getString(R.string.passport_sync_adapter_prefix) + str).equals(context.getString(R.string.passport_sync_adapter_content_authority))) {
                                    w.a("Invalid value in passport_sync_adapter_content_authority", arrayList);
                                }
                                wVar.l(arrayList);
                                if ((packageManager.getApplicationInfo(str, 0).flags & 32768) == 32768) {
                                    w.a("allowBackup='true' is not allowed", arrayList);
                                }
                                RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType = RuntimeConfigurationValidator$ComponentType.RECEIVER;
                                wVar.b(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", "reaction to system events", runtimeConfigurationValidator$ComponentType, true);
                                wVar.c(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", wVar.g("android.accounts.LOGIN_ACCOUNTS_CHANGED", null, null), runtimeConfigurationValidator$ComponentType);
                                wVar.c(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", wVar.g("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED", null, null), runtimeConfigurationValidator$ComponentType);
                                wVar.m(arrayList2);
                                wVar.k(arrayList2);
                                try {
                                    ServiceInfo serviceInfo = packageManager.getServiceInfo(wVar.b(arrayList2, "com.yandex.passport.internal.core.sync.SyncService", "accounts backup", RuntimeConfigurationValidator$ComponentType.SERVICE, false), 128);
                                    wVar.e(arrayList2, serviceInfo);
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null) {
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                                w.a("Passport library verification error: There is no contacts metadata in BackupAccountsService declaration please copy \n<meta-data\nandroid:name=\"android.provider.CONTACTS_STRUCTURE\"\nandroid:resource=\"@xml/contacts\" />\nto declaration of com.yandex.auth.sync.BackupAccountsService in AndroidManifest.xml", arrayList2);
                                wVar.j(arrayList2);
                                wVar.d(arrayList2);
                                if (!w.i.contains(str) && w.h.equals(wVar.e)) {
                                    arrayList2.add(new IllegalStateException("Don't use credentials from the sample in your application"));
                                }
                            } catch (Exception e) {
                                arrayList2.add(new IllegalStateException("Passport library verification error", e));
                            }
                            wVar.h(arrayList2);
                            wVar.h(arrayList);
                            if ((context.getApplicationInfo().flags & 2) != 0) {
                                arrayList.addAll(arrayList2);
                            }
                            com.yandex.passport.legacy.a.a("validateAndThrow: end: errorList.size()=" + arrayList2.size() + " fatalErrorList.size()=" + arrayList.size());
                            if (arrayList.size() > 0) {
                                Log.e("PassportRuntime", ((IllegalStateException) arrayList.get(0)).getMessage().toString());
                                System.exit(0);
                            }
                            try {
                                PassportProcessGlobalComponent a3 = com.yandex.passport.internal.di.a.a();
                                com.yandex.passport.internal.core.accounts.d accountsRetriever = a3.getAccountsRetriever();
                                com.yandex.passport.internal.analytics.y currentAccountAnalyticsHelper = a3.getCurrentAccountAnalyticsHelper();
                                b a4 = accountsRetriever.a();
                                com.yandex.passport.internal.flags.experiments.q experimentsUpdater = a3.getExperimentsUpdater();
                                ExperimentsUpdater$LoadingStrategy experimentsUpdater$LoadingStrategy = ExperimentsUpdater$LoadingStrategy.INITIALIZATION;
                                int i4 = com.yandex.passport.internal.flags.experiments.q.h;
                                experimentsUpdater.a(experimentsUpdater$LoadingStrategy, Environment.PRODUCTION);
                                a3.getFlagRepository().a();
                                currentAccountAnalyticsHelper.a(a4);
                                boolean booleanValue = ((Boolean) a3.getFlagRepository().b(com.yandex.passport.internal.flags.q.r)).booleanValue();
                                hjt hjtVar = hjt.a;
                                if (!booleanValue) {
                                    s.d(a3, a4);
                                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "initNotifications working", 8);
                                    }
                                    new PushSettingsObserver(a3.getPushSubscriptionScheduler()).subscribe(a3.getApplicationContext());
                                    a3.getPushSubscriptionScheduler().b(null);
                                    a3.getCoroutineScopes().getClass();
                                    tje.N(hjtVar, null, null, new PassportInitialization$initBadges$1$1(a3, null), 3);
                                    a3.getCoroutineScopes().getClass();
                                    tje.N(hjtVar, null, null, new PassportInitialization$initConfig$1$1(a3, null), 3);
                                    a3.getCoroutineScopes().getClass();
                                    tje.N(hjtVar, null, null, new PassportInitialization$initAppsConfig$1$1(a3, null), 3);
                                    a3.getCoroutineScopes().getClass();
                                    tje.N(hjtVar, null, null, new PassportInitialization$doDelayedWork$1(a3, pVar, application2, null), 3);
                                }
                                a3.getCoroutineScopes().getClass();
                                tje.N(hjtVar, null, null, new PassportInitialization$initCheckVpnStatus$1$1(application2, a3, null), 3);
                                com.yandex.passport.internal.authsdk.c.a(a3);
                            } catch (Exception e2) {
                                com.yandex.passport.internal.ui.sloth.e.o(e2);
                            }
                        }
                    }, "Passport-".concat("Init-Background")).start();
                    i3y i3yVar = q.a;
                    WebView.setDataDirectorySuffix("passport");
                }
                androidx.appcompat.app.b.setCompatVectorFromResourcesEnabled(true);
                return;
            }
            initFlipper();
            initLeakCanary();
            initDemeter();
            initAnrWatchDog();
            initCriticalFieldsIfNeeded();
            ((seu) appComponentFactory()).getClass();
            zzf zzfVar = new zzf(new xxm0(), this);
            this.component = zzfVar;
            ru.yandex.taxi.analytics.q qVar = (ru.yandex.taxi.analytics.q) zzfVar.Y8.get();
            initLogging(qVar);
            qVar.b(startupMviTime);
            ks2 ks2Var = this.component;
            if (ks2Var == null) {
                ny61.g("Required value was null.");
                return;
            }
            TaxiApplication$onCreate$1 taxiApplication$onCreate$1 = new TaxiApplication$onCreate$1(0, ks2Var, ks2.class, "composeImageLoader", "composeImageLoader()Lcom/yandex/go/design/compose/images/ComposeImageLoader;", 0);
            oz40 oz40Var = lgd.a;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            oz40Var.setValue(kotlin.a.b(lazyThreadSafetyMode, taxiApplication$onCreate$1));
            ks2 ks2Var2 = this.component;
            if (ks2Var2 == null) {
                ny61.g("Required value was null.");
                return;
            }
            f4z.a.setValue(kotlin.a.b(lazyThreadSafetyMode, new TaxiApplication$onCreate$2(0, ks2Var2, ks2.class, "performanceAnalytics", "performanceAnalytics()Lru/yandex/taxi/perf/PerformanceAnalytics;", 0)));
            ks2 ks2Var3 = this.component;
            if (ks2Var3 == null) {
                ny61.g("Required value was null.");
                return;
            }
            com.yandex.go.design.compose.platform.statusbar.a.b.setValue(new TaxiApplication$onCreate$3(0, ks2Var3, ks2.class, "composeStatusBarController", "composeStatusBarController()Lcom/yandex/go/design/compose/platform/statusbar/ComposeStatusBarController;", 0));
            ks2 ks2Var4 = this.component;
            if (ks2Var4 == null) {
                ny61.g("Required value was null.");
                return;
            }
            zzf zzfVar2 = (zzf) ks2Var4;
            TaxiApplication taxiApplication = zzfVar2.a;
            ms2 ms2Var = (ms2) zzfVar2.a2.get();
            ApplicationLifecycleTracker applicationLifecycleTracker = (ApplicationLifecycleTracker) zzfVar2.De.get();
            new rmp();
            new ciy0();
            ru.yandex.taxi.perf.b bVar = (ru.yandex.taxi.perf.b) zzfVar2.n2.get();
            com.yandex.go.scooters.ignition.domain.b bVar2 = new com.yandex.go.scooters.ignition.domain.b((tt2) zzfVar2.n.get(), i5m.a(zzfVar2.lf), (vqn0) zzfVar2.df.get(), i5m.a(zzfVar2.Je));
            xw60 xw60Var = (xw60) zzfVar2.Gf.get();
            new jua0();
            new oua0();
            long j = initTime;
            os2 os2Var = (os2) ms2Var;
            os2Var.d(Milestone.ApplicationClass, j);
            os2Var.d(Milestone.Application, elapsedRealtime);
            taxiApplication.registerActivityLifecycleCallbacks(applicationLifecycleTracker);
            bVar2.a();
            xw60Var.getClass();
            long a3 = s630.a();
            for (ww60 ww60Var : (Iterable) xw60Var.a.get()) {
                long a4 = s630.a();
                ww60Var.f();
                long a5 = f8z0.a(a4);
                hst hstVar = jst.e;
                Thread currentThread = Thread.currentThread();
                ww60Var.getName();
                e3n.p(a5);
                Objects.toString(currentThread);
                hstVar.getClass();
            }
            long a6 = f8z0.a(a3);
            hst hstVar2 = jst.e;
            e3n.p(a6);
            hstVar2.getClass();
            bVar.a(j);
            ms2Var.a(Milestone.Application);
            ms2Var.a(Milestone.ApplicationClass);
        }
    }

    public abstract qn90 passportAppComponentFactory();

    public abstract w451 widgetsAppComponentFactory();
}
