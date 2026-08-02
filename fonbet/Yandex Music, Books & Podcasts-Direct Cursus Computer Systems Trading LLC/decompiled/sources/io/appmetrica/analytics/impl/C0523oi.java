package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.ComponentParams;
import com.yandex.pulse.LibraryParams;
import com.yandex.pulse.ProcessCpuMonitoringParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.ServiceParams;
import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.hrg;
import defpackage.ouj;
import defpackage.xee;
import defpackage.y2x;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0523oi {
    public final C0396k7 a;
    public final C0581qi b;
    public final C0412kn c;
    public final C0816yn d;
    public final M5 e;
    public final C0638si f;
    public final U4 g;
    public final C0722vf h;
    public final Of i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final HashSet m;

    public C0523oi(Context context, int i) {
        this(new C0581qi(context), new C0412kn(), new C0816yn(), new M5(), new C0638si(), new C0722vf(new C0808yf()), new Of(), D0.a(context).b());
    }

    public final void a(@NonNull AppMetricaYandexConfig appMetricaYandexConfig, PulseConfig pulseConfig, String str, @NonNull PublicLogger publicLogger, String str2) {
        if (this.a.b()) {
            if (pulseConfig == null) {
                publicLogger.warning("Ignore application registration to Pulse with null config", new Object[0]);
                return;
            }
            if (pulseConfig.mviConfig != null) {
                if (this.k) {
                    publicLogger.warning("Mvi service already started", new Object[0]);
                } else {
                    publicLogger.info("Activate MVI", new Object[0]);
                    Of of = this.i;
                    C0578qf a = this.h.a(pulseConfig.mviConfig);
                    of.getClass();
                    Nf nf = Nf.a;
                    Pf pf = new Pf();
                    nf.getClass();
                    Rf.a(new Lf(pf, a));
                    this.k = true;
                }
            }
            if (this.l) {
                publicLogger.warning("Application has been already registered in pulse", new Object[0]);
                return;
            }
            if (!this.j) {
                publicLogger.warning("Register app: pulse is not activated.", new Object[0]);
                return;
            }
            C0581qi c0581qi = this.b;
            String packageName = c0581qi.a.getPackageName();
            HashSet hashSet = new HashSet(Arrays.asList(packageName, ouj.n(packageName, ":Metrica"), ouj.n(packageName, ":passport")));
            hashSet.addAll(pulseConfig.processes);
            Context context = c0581qi.a;
            String str3 = appMetricaYandexConfig.apiKey;
            String str4 = pulseConfig.histogramPrefix;
            context.getPackageName();
            String appVersionName = TextUtils.isEmpty(appMetricaYandexConfig.appVersion) ? PackageManagerUtils.getAppVersionName(c0581qi.a) : appMetricaYandexConfig.appVersion;
            Integer num = appMetricaYandexConfig.appBuildNumber;
            if (num != null) {
                Locale locale = Locale.US;
                appVersionName = appVersionName + "." + num;
            }
            HashMap hashMap = new HashMap();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                hashMap.put(str5, c0581qi.b.a(str5));
            }
            Boolean bool = pulseConfig.histogramsReporting;
            boolean booleanValue = bool == null ? true : bool.booleanValue();
            Integer num2 = pulseConfig.channelId;
            int intValue = num2 == null ? 0 : num2.intValue();
            String str6 = str != null ? str : null;
            String str7 = str2 != null ? str2 : null;
            Map<String, String> map = !AbstractC0734vr.a((Map) pulseConfig.variations) ? pulseConfig.variations : null;
            Long l = pulseConfig.cpuMonitoringForegroundInterval;
            if (l == null) {
                l = null;
            }
            Long l2 = pulseConfig.cpuMonitoringBackgroundInterval;
            if (l2 == null) {
                l2 = null;
            }
            if (!booleanValue) {
                publicLogger.warning("Ignore application registration to Pulse without histogram reporting", new Object[0]);
                return;
            }
            this.e.getClass();
            ApplicationParams.Builder versionString = ApplicationParams.builder().setMetricaApiKey(str3).setHistogramPrefix(str4).setPackageName(context).setVersionString(appVersionName);
            if (!hashMap.isEmpty()) {
                ProcessCpuMonitoringParams.Builder builder = ProcessCpuMonitoringParams.builder();
                for (Map.Entry entry : hashMap.entrySet()) {
                    builder.addProcessHistogram((String) entry.getKey(), (String) entry.getValue());
                }
                if (l != null) {
                    builder.setForegroundIntervalMilliseconds(l.longValue());
                }
                if (l2 != null) {
                    builder.setBackgroundIntervalMilliseconds(l2.longValue());
                }
                versionString.setProcessCpuMonitoringParams(builder.build());
            }
            versionString.setChannel(intValue);
            if (!TextUtils.isEmpty(str6)) {
                versionString.setMetricaDeviceId(str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                versionString.setMetricaUuid(str7);
            }
            if (!AbstractC0734vr.a((Map) map)) {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    versionString.addVariation(entry2.getKey(), entry2.getValue());
                }
            }
            ApplicationParams build = versionString.build();
            a(publicLogger, "application", build);
            this.c.getClass();
            PulseService.registerApplication(build);
            this.l = true;
        }
    }

    public C0523oi(@NonNull Context context) {
        this(context, 0);
    }

    public C0523oi(C0581qi c0581qi, C0412kn c0412kn, C0816yn c0816yn, M5 m5, C0638si c0638si, C0722vf c0722vf, Of of, U4 u4) {
        this.a = R4.l().i();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = new HashSet();
        this.b = c0581qi;
        this.c = c0412kn;
        this.d = c0816yn;
        this.e = m5;
        this.f = c0638si;
        this.h = c0722vf;
        this.i = of;
        this.g = u4;
    }

    public final boolean a(@NonNull R2 r2, CommonPulseConfig commonPulseConfig, @NonNull PublicLogger publicLogger, long j) {
        if (!this.a.b()) {
            return false;
        }
        if (commonPulseConfig == null) {
            publicLogger.warning("Ignore pulse activation with null config", new Object[0]);
            return false;
        }
        if (this.j) {
            publicLogger.warning("Pulse has already been activated.", new Object[0]);
            return false;
        }
        Context context = this.b.a;
        Boolean bool = commonPulseConfig.histogramsReporting;
        if (!(bool == null ? true : bool.booleanValue())) {
            publicLogger.warning("Ignore pulse activation without histogram reporting", new Object[0]);
            return false;
        }
        this.d.getClass();
        ServiceParams.Builder builder = ServiceParams.builder();
        Executor executor = commonPulseConfig.executor;
        if (executor != null) {
            builder.setBackgroundExecutor(executor);
        }
        U2 u2 = new U2();
        r2.a(u2, j, true);
        builder.setApplicationStatusMonitor(u2);
        String str = commonPulseConfig.uploadUrl;
        if (str != null) {
            builder.setUploadURL(str);
        }
        Boolean bool2 = commonPulseConfig.enableLogging;
        if (bool2 != null) {
            builder.setEnableLogging(bool2.booleanValue());
        }
        ServiceParams build = builder.build();
        this.c.getClass();
        boolean startService = PulseService.startService(context, build);
        if (startService) {
            publicLogger.info("Activate pulse", new Object[0]);
            U4 u4 = this.g;
            Long valueOf = u4.a == null ? null : Long.valueOf(u4.b.elapsedRealtime() - u4.a.longValue());
            if (valueOf != null) {
                C0638si c0638si = this.f;
                long longValue = valueOf.longValue();
                c0638si.getClass();
                Object obj = ComponentHistograms.b;
                y2x.u(xee.B(), "Pulse.ActivationDelay", 10L, 180000L, 50).c(longValue, TimeUnit.MILLISECONDS);
            }
        } else {
            publicLogger.info("Pulse service is already started.", new Object[0]);
        }
        this.j = true;
        return startService;
    }

    public final void a(@NonNull ReporterYandexConfig reporterYandexConfig, PulseLibraryConfig pulseLibraryConfig, String str, @NonNull PublicLogger publicLogger) {
        if (this.a.b()) {
            if (!this.j) {
                publicLogger.warning("Register lib: pulse is not activated.", new Object[0]);
                return;
            }
            if (pulseLibraryConfig == null) {
                publicLogger.warning("Ignore library registration to Pulse with null config", new Object[0]);
                return;
            }
            Context context = this.b.a;
            String str2 = reporterYandexConfig.apiKey;
            String str3 = pulseLibraryConfig.histogramPrefix;
            String str4 = pulseLibraryConfig.libPackage;
            String str5 = pulseLibraryConfig.libVersion;
            new HashMap();
            Boolean bool = pulseLibraryConfig.histogramsReporting;
            boolean booleanValue = bool == null ? true : bool.booleanValue();
            Integer num = pulseLibraryConfig.channelId;
            int intValue = num == null ? 0 : num.intValue();
            Map<String, String> map = !AbstractC0734vr.a((Map) pulseLibraryConfig.variations) ? pulseLibraryConfig.variations : null;
            if (!booleanValue) {
                publicLogger.warning("Ignore library registration to Pulse without histogram reporting", new Object[0]);
                return;
            }
            this.e.getClass();
            LibraryParams.Builder versionString = LibraryParams.builder().setMetricaApiKey(str2).setHistogramPrefix(str3).setPackageName(str4).setVersionString(str5);
            versionString.setChannel(intValue);
            if (!AbstractC0734vr.a((Map) map)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    versionString.addVariation(entry.getKey(), entry.getValue());
                }
            }
            LibraryParams build = versionString.build();
            if (this.m.contains(build.packageName)) {
                publicLogger.warning(hrg.q("Library ", build.packageName, " has been already registered in pulse"), new Object[0]);
                return;
            }
            a(publicLogger, "library", build);
            C0412kn c0412kn = this.c;
            String str6 = build.packageName;
            c0412kn.getClass();
            PulseService.registerLibrary(str6, build);
            this.m.add(build.packageName);
        }
    }

    public static void a(PublicLogger publicLogger, String str, ComponentParams componentParams) {
        Set<String> hashSet;
        ProcessCpuMonitoringParams processCpuMonitoringParams = componentParams instanceof ApplicationParams ? ((ApplicationParams) componentParams).processCpuMonitoringParams : null;
        if (processCpuMonitoringParams != null) {
            hashSet = processCpuMonitoringParams.processToHistogramBaseName.keySet();
        } else {
            hashSet = new HashSet<>();
        }
        publicLogger.info("Register component '%s' {%s, %s} to pulse with configuration: {histogramPrefix=\"%s\", channel=%d, processes=%s, variations=%s}", str, componentParams.packageName, componentParams.versionString, componentParams.histogramPrefix, Integer.valueOf(componentParams.channel), Arrays.toString(hashSet.toArray(new String[hashSet.size()])), componentParams.variations);
    }
}
