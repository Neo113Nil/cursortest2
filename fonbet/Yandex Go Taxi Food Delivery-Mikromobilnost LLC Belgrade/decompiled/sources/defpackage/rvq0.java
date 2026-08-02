package defpackage;

import android.os.SystemClock;
import com.yandex.go.superapp.api.analytics.SuperappAnalytics$OpenType;
import com.yandex.go.superapp.api.analytics.SuperappAnalytics$PerfClass;
import com.yandex.go.superapp.api.loading_tracker.EatsKitOpenType;
import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final class rvq0 {
    public final zrm a;
    public final gen b;
    public final gdn c = new gdn();

    public rvq0(zrm zrmVar, gen genVar) {
        this.a = zrmVar;
        this.b = genVar;
    }

    public final void a(ServiceLoadingEvent serviceLoadingEvent) {
        String str;
        SuperappAnalytics$OpenType superappAnalytics$OpenType;
        ServiceLoadingEvent serviceLoadingEvent2 = ServiceLoadingEvent.WEB_VIEW_READY;
        gdn gdnVar = this.c;
        LinkedHashMap linkedHashMap = gdnVar.a;
        LinkedHashMap linkedHashMap2 = gdnVar.a;
        if (linkedHashMap.containsKey(serviceLoadingEvent2)) {
            return;
        }
        ServiceLoadingEvent serviceLoadingEvent3 = ServiceLoadingEvent.WILL_OPEN;
        if (linkedHashMap2.containsKey(serviceLoadingEvent3)) {
            return;
        }
        gen genVar = this.b;
        genVar.getClass();
        linkedHashMap2.put(serviceLoadingEvent, Long.valueOf(SystemClock.elapsedRealtime() - genVar.a.e()));
        if ((serviceLoadingEvent == serviceLoadingEvent2 || serviceLoadingEvent == serviceLoadingEvent3) && (str = gdnVar.d) != null) {
            Map t = b.t(linkedHashMap2);
            EatsKitOpenType eatsKitOpenType = gdnVar.c;
            boolean z = gdnVar.b;
            zrm zrmVar = this.a;
            v8w0 v8w0Var = (v8w0) zrmVar.b;
            LinkedHashMap b = xsa1.b(t);
            int i = y1p.a[eatsKitOpenType.ordinal()];
            if (i == 1) {
                superappAnalytics$OpenType = SuperappAnalytics$OpenType.Initial;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                superappAnalytics$OpenType = SuperappAnalytics$OpenType.Cache;
            }
            SuperappAnalytics$PerfClass superappAnalytics$PerfClass = (SuperappAnalytics$PerfClass) ((i3y) zrmVar.c).getValue();
            v8w0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.KEY_SERVICE, str);
            hashMap.put("key_points", b);
            hashMap.put("open_type", superappAnalytics$OpenType.getEventValue());
            hashMap.put("has_injected_cookies", Boolean.valueOf(z));
            hashMap.put("perf_class", superappAnalytics$PerfClass.getEventValue());
            v8w0Var.a.a("Superapp.Showcase.WebView.Shown", hashMap, 2, new HashMap());
        }
    }
}
