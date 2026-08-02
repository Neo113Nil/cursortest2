package defpackage;

import android.net.Uri;
import com.yandex.go.charity.js.a;
import com.yandex.go.charity.models.OpenCharitySource;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.sequences.b;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class tzd {
    public final itx a;
    public final g b;
    public final fn21 c;
    public final a d;

    public tzd(itx itxVar, g gVar, fn21 fn21Var, a aVar) {
        this.a = itxVar;
        this.b = gVar;
        this.c = fn21Var;
        this.d = aVar;
    }

    public final UiWebViewConfig a(OpenCharitySource openCharitySource, String str, String str2, Map map) {
        String str3;
        LinkedHashMap linkedHashMap;
        if (this.b.f()) {
            Uri parse = Uri.parse(str);
            Set set = og21.a;
            if (parse.isOpaque()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap();
                for (String str4 : parse.getQueryParameterNames()) {
                    if (str4 != null && str4.length() != 0) {
                        String queryParameter = parse.getQueryParameter(str4);
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        linkedHashMap.put(str4, queryParameter);
                    }
                }
            }
            linkedHashMap.put("platform", "go_android");
            List list = this.a.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Object obj2 = (t1) obj;
                if (obj2 instanceof ProductMode$Taxi ? true : obj2 instanceof s8f0 ? ((s8f0) obj2).getA().a : false) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t1) it.next()).a().getMode());
            }
            linkedHashMap.put("available_services", arrayList2.isEmpty() ? TariffOrderFlow.ORDER_FLOW_TAXI_KEY : kotlin.collections.a.X(arrayList2, ",", null, null, null, 62));
            if (openCharitySource != OpenCharitySource.EATSKIT) {
                linkedHashMap.put("source", openCharitySource.getSourceName());
            }
            s5r s5rVar = new s5r(b.g(iw00.w(map), new foc(12)));
            while (s5rVar.hasNext()) {
                Map.Entry entry = (Map.Entry) s5rVar.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
            }
            str3 = clearQuery.build().toString();
        } else {
            str3 = str2;
        }
        String b = this.b.b();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str3;
        aVar.c = b;
        aVar.m = this.d;
        aVar.e = true;
        aVar.b("X-YaTaxi-Authorization", kp50.h(b));
        aVar.g = true;
        aVar.l = true;
        String Hg = ((h) this.c).Hg();
        if (Hg == null) {
            jst.e.s(new IllegalStateException("has not user id"));
        } else {
            aVar.b("X-YaTaxi-UserId", Hg);
        }
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setShouldUseCached(false);
        uiWebViewConfig.setAnimateOnAppearing(false);
        return uiWebViewConfig;
    }
}
