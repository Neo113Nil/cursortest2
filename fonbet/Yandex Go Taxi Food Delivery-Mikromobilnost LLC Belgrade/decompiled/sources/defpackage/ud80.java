package defpackage;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.state.search.SearchState;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.am.g;

/* loaded from: classes14.dex */
public final class ud80 {
    public final hit a;
    public final tt2 b;
    public final g c;
    public final iup0 d;
    public final u8w e;
    public pzt0 h;
    public final a3y0 f = new a3y0(TaxiOrderLogGroup.ORDINARY_SEARCH.getTag(), "OrdinarySearchAnalytics");
    public final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.US);
    public final LinkedHashSet i = new LinkedHashSet();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();

    public ud80(hit hitVar, tt2 tt2Var, g gVar, iup0 iup0Var, u8w u8wVar) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = gVar;
        this.d = iup0Var;
        this.e = u8wVar;
    }

    public final void a(String str) {
        SearchState k = ((n) this.d).k(str);
        if (k == null) {
            return;
        }
        String Hg = this.c.b.Hg();
        String str2 = k.a;
        String str3 = k.b;
        String format = this.g.format(new Date());
        u8w u8wVar = this.e;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (Hg != null) {
            hashMap.put("user_phone_id", Hg);
        }
        hashMap.put("order_id", str2);
        if (str3 != null) {
            hashMap.put("tariff_zone", str3);
        }
        u8wVar.a.a("SearchAnimation.DriverCardTap", hashMap, 1, tse0.r(ClidProvider.TIMESTAMP, hashMap, format));
    }
}
