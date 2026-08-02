package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.yandex.taxi.communications.data.a;

/* loaded from: classes14.dex */
public final class qqv {
    public final a a;
    public final ysg b;
    public final p2y0 c;

    public qqv(a aVar, ysg ysgVar, p2y0 p2y0Var) {
        this.a = aVar;
        this.b = ysgVar;
        this.c = p2y0Var;
    }

    public final void a(String str, String str2) {
        TaxiOrder i = ((e0) this.c).i(str);
        if (i == null || i.l.U.contains(str2)) {
            return;
        }
        String[] strArr = {str2};
        synchronized (i) {
            TaxiOrderLocalData taxiOrderLocalData = i.l;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            Set set = taxiOrderLocalData.U;
            LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(set.size() + strArr2.length));
            linkedHashSet.addAll(set);
            ycc.t(linkedHashSet, strArr2);
            i.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashSet, null, null, false, null, false, null, null, null, -1, 16760831);
        }
        this.b.g(i);
        this.a.c(str2);
    }
}
