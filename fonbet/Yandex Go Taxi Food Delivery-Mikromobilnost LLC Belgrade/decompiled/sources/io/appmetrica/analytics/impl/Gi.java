package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.jl40;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class Gi {
    public static boolean b;
    public static C0448je c;
    public static PulseConfig d;
    public static final HashMap a = new HashMap();
    public static final ArrayList e = new ArrayList();

    public static final void a(CommonPulseConfig commonPulseConfig) {
        CommonPulseConfig commonPulseConfig2;
        Object obj;
        C0448je c0448je = c;
        if (c0448je != null) {
            if (commonPulseConfig == null) {
                CommonPulseConfig commonPulseConfig3 = d;
                if (commonPulseConfig3 == null) {
                    Iterator it = e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        PulseLibraryConfig pulseLibraryConfig = ((ReporterYandexConfig) obj).getPulseLibraryConfig();
                        if (!(pulseLibraryConfig != null ? jl40.l(pulseLibraryConfig.histogramsReporting, Boolean.FALSE) : false)) {
                            break;
                        }
                    }
                    ReporterYandexConfig reporterYandexConfig = (ReporterYandexConfig) obj;
                    if (reporterYandexConfig != null) {
                        commonPulseConfig3 = reporterYandexConfig.getPulseLibraryConfig();
                    } else {
                        commonPulseConfig2 = null;
                    }
                }
                commonPulseConfig2 = commonPulseConfig3;
            } else {
                commonPulseConfig2 = commonPulseConfig;
            }
            Integer num = c0448je.a.sessionTimeout;
            if (num == null) {
                num = 10;
            }
            int intValue = num.intValue();
            Context context = c0448je.c;
            HashMap hashMap = a;
            Object obj2 = hashMap.get(context);
            if (obj2 == null) {
                obj2 = new Fi(context, 0);
                hashMap.put(context, obj2);
            }
            boolean a2 = ((Fi) obj2).a(c0448je.d, commonPulseConfig2, c0448je.b, TimeUnit.SECONDS.toMillis(intValue));
            if (b || !a2) {
                return;
            }
            b = true;
            if (d != null) {
                Context context2 = c0448je.c;
                AppMetricaYandexConfig from = AppMetricaYandexConfig.from(c0448je.a);
                PulseConfig pulseConfig = d;
                if (b) {
                    Object obj3 = hashMap.get(context2);
                    if (obj3 == null) {
                        obj3 = new Fi(context2, 0);
                        hashMap.put(context2, obj3);
                    }
                    ((Fi) obj3).a(from, pulseConfig, c0448je.e, c0448je.b, c0448je.g);
                } else {
                    d = pulseConfig;
                }
                d = null;
            }
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                ReporterYandexConfig reporterYandexConfig2 = (ReporterYandexConfig) it2.next();
                Context context3 = c0448je.c;
                C0448je c0448je2 = c;
                if (!b || c0448je2 == null) {
                    e.add(reporterYandexConfig2);
                } else {
                    HashMap hashMap2 = a;
                    Object obj4 = hashMap2.get(context3);
                    if (obj4 == null) {
                        obj4 = new Fi(context3, 0);
                        hashMap2.put(context3, obj4);
                    }
                    ((Fi) obj4).a(reporterYandexConfig2, reporterYandexConfig2.getPulseLibraryConfig(), c0448je2.e, c0448je2.b);
                }
            }
            e.clear();
        }
    }
}
