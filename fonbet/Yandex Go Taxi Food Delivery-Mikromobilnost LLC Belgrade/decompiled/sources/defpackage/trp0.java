package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.YbSdkRtmConfig;
import com.ybsdk.rconfig.configs.g;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.sequences.a;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class trp0 {
    public static volatile ofa0 b;
    public static volatile String c;
    public static volatile String d;
    public static volatile String e;
    public static volatile Long f;
    public static volatile Throwable g;
    public static final trp0 a = new trp0();
    public static volatile String h = eqp0.i.b;
    public static final ArrayList i = new ArrayList();

    public static w42 a() {
        w42 w42Var;
        ofa0 ofa0Var = b;
        if (ofa0Var != null && (w42Var = (w42) ofa0Var.w) != null) {
            return w42Var;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Rtm dependencies are null");
        Throwable th = g;
        if (!jl40.l(th != null ? th.getMessage() : null, illegalStateException.getMessage())) {
            g = illegalStateException;
            g(new jqp0(illegalStateException, "Rtm dependencies are null", null, null));
        }
        return new pvu0();
    }

    public static eqp0 b() {
        Object failure;
        ofa0 ofa0Var = b;
        if (ofa0Var != null) {
            b bVar = (b) ofa0Var.a;
            bVar.getClass();
            YbSdkRtmConfig ybSdkRtmConfig = (YbSdkRtmConfig) bVar.d(g.a).getData();
            qpi0 qpi0Var = (qpi0) ofa0Var.b;
            try {
                boolean isEnabled = ybSdkRtmConfig.isEnabled();
                String projectName = ybSdkRtmConfig.getProjectName();
                List<YbSdkRtmConfig.SdkRtmBlackListItem> blackList = ybSdkRtmConfig.getBlackList();
                ArrayList arrayList = new ArrayList(tcc.n(blackList, 10));
                for (YbSdkRtmConfig.SdkRtmBlackListItem sdkRtmBlackListItem : blackList) {
                    String titleRegex = sdkRtmBlackListItem.getTitleRegex();
                    Regex a2 = titleRegex != null ? qpi0Var.a(titleRegex) : null;
                    String urlRegex = sdkRtmBlackListItem.getUrlRegex();
                    Regex a3 = urlRegex != null ? qpi0Var.a(urlRegex) : null;
                    List<YbSdkRtmConfig.AdditionalRegex> additionalRegexes = sdkRtmBlackListItem.getAdditionalRegexes();
                    int d2 = gw00.d(tcc.n(additionalRegexes, 10));
                    if (d2 < 16) {
                        d2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                    for (YbSdkRtmConfig.AdditionalRegex additionalRegex : additionalRegexes) {
                        Pair pair = new Pair(additionalRegex.getKey(), qpi0Var.a(additionalRegex.getRegex()));
                        linkedHashMap.put(pair.c(), pair.f());
                    }
                    arrayList.add(new dqp0(a2, a3, linkedHashMap));
                }
                Boolean trimAdditionalEnabled = ybSdkRtmConfig.getTrimAdditionalEnabled();
                boolean booleanValue = trimAdditionalEnabled != null ? trimAdditionalEnabled.booleanValue() : eqp0.i.d;
                Integer maxAdditionalLength = ybSdkRtmConfig.getMaxAdditionalLength();
                int intValue = maxAdditionalLength != null ? maxAdditionalLength.intValue() : eqp0.i.e;
                List<String> additionalToTrim = ybSdkRtmConfig.getAdditionalToTrim();
                if (additionalToTrim == null) {
                    additionalToTrim = eqp0.i.f;
                }
                List<String> list = additionalToTrim;
                Integer truncatedSize = ybSdkRtmConfig.getTruncatedSize();
                int intValue2 = truncatedSize != null ? truncatedSize.intValue() : eqp0.i.g;
                List<String> importantFields = ybSdkRtmConfig.getImportantFields();
                if (importantFields == null) {
                    importantFields = eqp0.i.h;
                }
                failure = new eqp0(isEnabled, projectName, arrayList, booleanValue, intValue, list, intValue2, importantFields);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a4 = Result.a(failure);
            if (a4 != null) {
                Throwable th2 = g;
                if (!jl40.l(th2 != null ? th2.getMessage() : null, a4.getMessage())) {
                    g = a4;
                    g(new jqp0(a4, "Unable to parse RTM config", null, null));
                }
            }
            boolean z = failure instanceof Result.Failure;
            if (!z) {
                g = null;
            }
            eqp0 eqp0Var = (eqp0) (z ? null : failure);
            if (eqp0Var != null) {
                return eqp0Var;
            }
        }
        return eqp0.i;
    }

    public static AppAnalyticsReporter c() {
        ofa0 ofa0Var = b;
        if (ofa0Var != null) {
            return (AppAnalyticsReporter) ofa0Var.c;
        }
        return null;
    }

    public static boolean d(eqp0 eqp0Var, String str, String str2, JSONObject jSONObject) {
        String obj;
        List<dqp0> list = eqp0Var.c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (dqp0 dqp0Var : list) {
                Regex b2 = dqp0Var.b();
                if (b2 == null || b2.h(str)) {
                    Regex c2 = dqp0Var.c();
                    if (c2 == null || (str2 != null && c2.h(str2))) {
                        Map a2 = dqp0Var.a();
                        if (!a2.isEmpty()) {
                            for (Map.Entry entry : ((LinkedHashMap) a2).entrySet()) {
                                String str3 = (String) entry.getKey();
                                Regex regex = (Regex) entry.getValue();
                                Object opt = jSONObject.opt(str3);
                                if (opt != null && (obj = opt.toString()) != null && regex.h(obj)) {
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        if (jl40.l(h, eqp0Var.b)) {
            return false;
        }
        h = eqp0Var.b;
        AppAnalyticsReporter c3 = c();
        if (c3 == null) {
            return false;
        }
        c3.a.updateRtmConfig(RtmConfig.newBuilder().withProjectName(h).build());
        return false;
    }

    public static void e(crp0 crp0Var) {
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.f(crp0Var.b(), crp0Var.toString(), new Object[0]);
        if (c() == null) {
            i.add(crp0Var);
            e5z0Var.d("SdkRtmReporter is not initialized", new Object[0]);
            return;
        }
        eqp0 b2 = b();
        if (b2.a) {
            kll0 c2 = erp0.c(crp0Var, new qhl0(c, e, d, f), b2, a());
            RtmErrorEvent rtmErrorEvent = c2.a;
            if (d(b2, crp0Var.a(), rtmErrorEvent.url, c2.b)) {
                return;
            }
            AppAnalyticsReporter c3 = c();
            if (c3 != null) {
                c3.a.reportRtmError(rtmErrorEvent);
            }
            AppAnalyticsReporter c4 = c();
            if (c4 != null) {
                c4.b("tech.rtm", vng.N(c2.c, gw00.e(new Pair("errorDescription", crp0Var.b))));
            }
        }
    }

    public static void f(jnl jnlVar) {
        if (c() == null) {
            i5z0.a.d("SdkRtmReporter is not initialized", new Object[0]);
            return;
        }
        eqp0 b2 = b();
        if (b2.a) {
            Pair a2 = krp0.a(jnlVar, new qhl0(c, e, d, f), a());
            RtmClientEvent rtmClientEvent = (RtmClientEvent) a2.getFirst();
            JSONObject jSONObject = (JSONObject) a2.getSecond();
            if (d(b2, rtmClientEvent.name, null, jSONObject)) {
                return;
            }
            AppAnalyticsReporter c2 = c();
            if (c2 != null) {
                c2.a.reportRtmEvent(rtmClientEvent);
            }
            t5r i2 = kotlin.sequences.b.i(a.b(jSONObject.keys()));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            s5r s5rVar = new s5r(i2);
            while (s5rVar.hasNext()) {
                Object next = s5rVar.next();
                linkedHashMap.put(next, jSONObject.opt((String) next));
            }
            AppAnalyticsReporter c3 = c();
            if (c3 != null) {
                c3.b(rtmClientEvent.name, linkedHashMap);
            }
        }
    }

    public static void g(jqp0 jqp0Var) {
        kll0 c2 = erp0.c(jqp0Var, new qhl0(c, e, d, f), eqp0.i, new pvu0());
        AppAnalyticsReporter c3 = c();
        if (c3 != null) {
            c3.a.reportRtmError(c2.a);
        }
        AppAnalyticsReporter c4 = c();
        if (c4 != null) {
            c4.b("tech.rtm", vng.N(c2.c, gw00.e(new Pair("errorDescription", jqp0Var.b))));
        }
    }
}
