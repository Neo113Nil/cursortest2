package defpackage;

import com.yandex.go.taxi.order.multi.feed.analytics.TaxiOrderFeedAnalytics$Source;
import java.util.LinkedHashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes14.dex */
public final class w0y0 {
    public final lx4 a;
    public String b;

    public w0y0(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static void a(lx4 lx4Var, String str, TaxiOrderFeedAnalytics$Source taxiOrderFeedAnalytics$Source, String str2, Boolean bool) {
        i d = ((j) lx4Var).d(str);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, taxiOrderFeedAnalytics$Source == TaxiOrderFeedAnalytics$Source.FEED_ORDER_DETAILS ? "SuperappOrderDetails" : "Main");
        linkedHashMap.put("from", str2);
        if (bool != null) {
            linkedHashMap.put("force", bool);
        }
        d.m();
    }

    public static /* synthetic */ void b(w0y0 w0y0Var, lx4 lx4Var, String str, TaxiOrderFeedAnalytics$Source taxiOrderFeedAnalytics$Source, Boolean bool, int i) {
        if ((i & 8) != 0) {
            bool = null;
        }
        w0y0Var.getClass();
        a(lx4Var, str, taxiOrderFeedAnalytics$Source, null, bool);
    }
}
