package defpackage;

import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$CloseReasonV2;
import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$PointTypeV2;
import java.util.HashMap;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class wf9 {
    public final o61 a;

    public wf9(o61 o61Var) {
        this.a = o61Var;
    }

    public final void a(boolean z, zzs zzsVar, String str, String str2) {
        ChangePointInActiveOrderAnalytics$PointTypeV2 changePointInActiveOrderAnalytics$PointTypeV2 = ChangePointInActiveOrderAnalytics$PointTypeV2.Source;
        Boolean valueOf = Boolean.valueOf(z);
        double d = zzsVar.a;
        double d2 = zzsVar.b;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("lat", Double.valueOf(d));
        MapBuilder w = x4e.w(d2, mapBuilder, "lon");
        if (str2 == null) {
            str2 = "";
        }
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (changePointInActiveOrderAnalytics$PointTypeV2 != null) {
            hashMap.put("type", changePointInActiveOrderAnalytics$PointTypeV2.getEventValue());
        }
        hashMap.put("allowed", valueOf);
        hashMap.put("coordinate", w);
        if (str != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, str);
        }
        o61Var.a.a("ChangePointInActiveOrder.CheckResult", hashMap, 2, tse0.r("trace_id", hashMap, str2));
    }

    public final void b(ChangePointInActiveOrderAnalytics$CloseReasonV2 changePointInActiveOrderAnalytics$CloseReasonV2) {
        ChangePointInActiveOrderAnalytics$PointTypeV2 changePointInActiveOrderAnalytics$PointTypeV2 = ChangePointInActiveOrderAnalytics$PointTypeV2.Source;
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (changePointInActiveOrderAnalytics$PointTypeV2 != null) {
            hashMap.put("type", changePointInActiveOrderAnalytics$PointTypeV2.getEventValue());
        }
        if (changePointInActiveOrderAnalytics$CloseReasonV2 != null) {
            hashMap.put("close_reason", changePointInActiveOrderAnalytics$CloseReasonV2.getEventValue());
        }
        o61Var.a.a("ChangePointInActiveOrder.ClosedAutomatically", hashMap, 2, new HashMap());
    }
}
