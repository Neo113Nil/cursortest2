package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.cashback.impl.dto.responses.ActiveCashbackPromoResponse;
import com.ybsdk.feature.cashback.impl.dto.responses.CashbackCategoryResponse;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import com.ybsdk.feature.cashback.impl.entities.types.PromoType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class w00 {
    public static final v00 a(ActiveCashbackPromoResponse activeCashbackPromoResponse) {
        Object failure;
        String m408constructorimpl = PromoID.m408constructorimpl(activeCashbackPromoResponse.getPromoId());
        String m418constructorimpl = PromoType.m418constructorimpl(activeCashbackPromoResponse.getPromoType());
        Text i = activeCashbackPromoResponse.getTitle() != null ? g8e.i(Text.Companion, activeCashbackPromoResponse.getTitle()) : Text.Empty.INSTANCE;
        b bVar = Text.Companion;
        String subtitle = activeCashbackPromoResponse.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        Text.Constant i2 = g8e.i(bVar, subtitle);
        List<CashbackCategoryResponse> categories = activeCashbackPromoResponse.getCategoriesInfo().getCategories();
        ArrayList arrayList = new ArrayList(tcc.n(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            try {
                failure = u29.a((CashbackCategoryResponse) it.next());
            } catch (Exception e) {
                trp0 trp0Var = trp0.a;
                trp0.e(new jqp0(e, "Exception during mapCatching() in CommonExt", null, null));
                failure = new Result.Failure(e);
            }
            arrayList.add(new Result(failure));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((Result) next).getValue() instanceof Result.Failure)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object value = ((Result) it3.next()).getValue();
            kotlin.b.b(value);
            arrayList3.add(value);
        }
        return new v00(m408constructorimpl, m418constructorimpl, i, i2, arrayList3);
    }
}
