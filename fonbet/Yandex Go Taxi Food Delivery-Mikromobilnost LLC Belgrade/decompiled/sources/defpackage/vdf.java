package defpackage;

import com.yandex.go.payments.shared.data.model.Currency;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class vdf {
    public static ArrayList a(List list) {
        List<Currency> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Currency currency : list2) {
            arrayList.add(new bef(currency.b, currency.a));
        }
        return arrayList;
    }
}
