package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.CommonPulseConfig;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0552pi {
    public static boolean b;
    public static Ud c;
    public static PulseConfig d;
    public static final HashMap a = new HashMap();
    public static final ArrayList e = new ArrayList();

    public static final void a(CommonPulseConfig commonPulseConfig) {
        CommonPulseConfig commonPulseConfig2;
        Object obj;
        Ud ud = c;
        if (ud != null) {
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
                        if (!(pulseLibraryConfig != null ? Intrinsics.d(pulseLibraryConfig.histogramsReporting, Boolean.FALSE) : false)) {
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
            Integer num = ud.a.sessionTimeout;
            if (num == null) {
                num = 10;
            }
            int intValue = num.intValue();
            Context context = ud.c;
            HashMap hashMap = a;
            Object obj2 = hashMap.get(context);
            if (obj2 == null) {
                obj2 = new C0523oi(context, 0);
                hashMap.put(context, obj2);
            }
            boolean a2 = ((C0523oi) obj2).a(ud.d, commonPulseConfig2, ud.b, TimeUnit.SECONDS.toMillis(intValue));
            if (b || !a2) {
                return;
            }
            b = true;
            if (d != null) {
                Context context2 = ud.c;
                AppMetricaYandexConfig from = AppMetricaYandexConfig.from(ud.a);
                PulseConfig pulseConfig = d;
                if (b) {
                    Object obj3 = hashMap.get(context2);
                    if (obj3 == null) {
                        obj3 = new C0523oi(context2, 0);
                        hashMap.put(context2, obj3);
                    }
                    ((C0523oi) obj3).a(from, pulseConfig, ud.e, ud.b, ud.g);
                } else {
                    d = pulseConfig;
                }
                d = null;
            }
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                ReporterYandexConfig reporterYandexConfig2 = (ReporterYandexConfig) it2.next();
                Context context3 = ud.c;
                Ud ud2 = c;
                if (!b || ud2 == null) {
                    e.add(reporterYandexConfig2);
                } else {
                    HashMap hashMap2 = a;
                    Object obj4 = hashMap2.get(context3);
                    if (obj4 == null) {
                        obj4 = new C0523oi(context3, 0);
                        hashMap2.put(context3, obj4);
                    }
                    ((C0523oi) obj4).a(reporterYandexConfig2, reporterYandexConfig2.getPulseLibraryConfig(), ud2.e, ud2.b);
                }
            }
            e.clear();
        }
    }
}
