package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.ComponentParams;
import com.yandex.pulse.LibraryParams;
import com.yandex.pulse.ProcessCpuMonitoringParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.ServiceParams;
import defpackage.b64;
import defpackage.ffx;
import defpackage.oyr;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes9.dex */
public final class Fi {
    public final C0615p7 a;
    public final Hi b;
    public final Cn c;
    public final Qn d;
    public final P5 e;
    public final Ji f;
    public final Y4 g;
    public final Kf h;
    public final C0278dg i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final HashSet m;

    public Fi(Context context, int i) {
        this(new Hi(context), new Cn(), new Qn(), new P5(), new Ji(), new Kf(new Nf()), new C0278dg(), F0.a(context).b());
    }

    public final void a(AppMetricaYandexConfig appMetricaYandexConfig, PulseConfig pulseConfig, String str, PublicLogger publicLogger, String str2) {
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
                    C0278dg c0278dg = this.i;
                    Ff a = this.h.a(pulseConfig.mviConfig);
                    c0278dg.getClass();
                    C0249cg c0249cg = C0249cg.a;
                    C0306eg c0306eg = new C0306eg();
                    c0249cg.getClass();
                    AbstractC0364gg.a(new C0191ag(c0306eg, a));
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
            Hi hi = this.b;
            String packageName = hi.a.getPackageName();
            HashSet hashSet = new HashSet(Arrays.asList(packageName, b64.j(packageName, ":Metrica"), b64.j(packageName, ":passport")));
            hashSet.addAll(pulseConfig.processes);
            Context context = hi.a;
            String str3 = appMetricaYandexConfig.apiKey;
            String str4 = pulseConfig.histogramPrefix;
            context.getPackageName();
            String appVersionName = StringUtils.isNullOrEmpty(appMetricaYandexConfig.appVersion) ? PackageManagerUtils.getAppVersionName(hi.a) : appMetricaYandexConfig.appVersion;
            Integer num = appMetricaYandexConfig.appBuildNumber;
            if (num != null) {
                Locale locale = Locale.US;
                appVersionName = appVersionName + Extension.DOT_CHAR + num;
            }
            HashMap hashMap = new HashMap();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                hashMap.put(str5, hi.b.a(str5));
            }
            Boolean bool = pulseConfig.histogramsReporting;
            boolean booleanValue = bool == null ? true : bool.booleanValue();
            Integer num2 = pulseConfig.channelId;
            int intValue = num2 == null ? 0 : num2.intValue();
            String str6 = str != null ? str : null;
            String str7 = str2 != null ? str2 : null;
            Map<String, String> map = !Or.a((Map) pulseConfig.variations) ? pulseConfig.variations : null;
            ArrayList<Integer> arrayList = !Or.a((Collection) pulseConfig.testIds) ? pulseConfig.testIds : null;
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
            if (!Or.a((Map) map)) {
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    versionString.addVariation(entry2.getKey(), entry2.getValue());
                }
            }
            if (!Or.a((Collection) arrayList)) {
                Iterator<Integer> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    versionString.addVariationFromAB(it2.next().intValue());
                }
            }
            ApplicationParams build = versionString.build();
            a(publicLogger, ClidProvider.APPLICATION, build);
            this.c.getClass();
            PulseService.registerApplication(build);
            this.l = true;
        }
    }

    public Fi(Context context) {
        this(context, 0);
    }

    public Fi(Hi hi, Cn cn, Qn qn, P5 p5, Ji ji, Kf kf, C0278dg c0278dg, Y4 y4) {
        this.a = V4.l().i();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = new HashSet();
        this.b = hi;
        this.c = cn;
        this.d = qn;
        this.e = p5;
        this.f = ji;
        this.h = kf;
        this.i = c0278dg;
        this.g = y4;
    }

    public final boolean a(R2 r2, CommonPulseConfig commonPulseConfig, PublicLogger publicLogger, long j) {
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
            Y4 y4 = this.g;
            Long valueOf = y4.a == null ? null : Long.valueOf(y4.b.elapsedRealtime() - y4.a.longValue());
            if (valueOf != null) {
                Ji ji = this.f;
                long longValue = valueOf.longValue();
                ji.getClass();
                ffx.O("Pulse.ActivationDelay").c(longValue, TimeUnit.MILLISECONDS);
            }
        } else {
            publicLogger.info("Pulse service is already started.", new Object[0]);
        }
        this.j = true;
        return startService;
    }

    public final void a(ReporterYandexConfig reporterYandexConfig, PulseLibraryConfig pulseLibraryConfig, String str, PublicLogger publicLogger) {
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
            Map<String, String> map = !Or.a((Map) pulseLibraryConfig.variations) ? pulseLibraryConfig.variations : null;
            ArrayList<Integer> arrayList = Or.a((Collection) pulseLibraryConfig.testIds) ? null : pulseLibraryConfig.testIds;
            if (!booleanValue) {
                publicLogger.warning("Ignore library registration to Pulse without histogram reporting", new Object[0]);
                return;
            }
            this.e.getClass();
            LibraryParams.Builder versionString = LibraryParams.builder().setMetricaApiKey(str2).setHistogramPrefix(str3).setPackageName(str4).setVersionString(str5);
            versionString.setChannel(intValue);
            if (!Or.a((Map) map)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    versionString.addVariation(entry.getKey(), entry.getValue());
                }
            }
            if (!Or.a((Collection) arrayList)) {
                Iterator<Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    versionString.addVariationFromAB(it.next().intValue());
                }
            }
            LibraryParams build = versionString.build();
            if (this.m.contains(build.packageName)) {
                publicLogger.warning(oyr.p("Library ", build.packageName, " has been already registered in pulse"), new Object[0]);
                return;
            }
            a(publicLogger, "library", build);
            Cn cn = this.c;
            String str6 = build.packageName;
            cn.getClass();
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
        publicLogger.info("Register component '%s' {%s, %s} to pulse with configuration: {histogramPrefix=\"%s\", channel=%d, processes=%s, variations=%s}", str, componentParams.packageName, componentParams.versionString, componentParams.histogramPrefix, Integer.valueOf(componentParams.channel), Arrays.toString(hashSet.toArray(new String[0])), componentParams.variations);
    }
}
