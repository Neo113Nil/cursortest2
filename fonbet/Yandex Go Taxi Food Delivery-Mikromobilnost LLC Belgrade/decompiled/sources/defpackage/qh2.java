package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.a;
import com.yandex.go.zone.dto.objects.h2;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

/* loaded from: classes13.dex */
public final /* synthetic */ class qh2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ qh2(List list, int i) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        i2 = 0;
        Object obj2 = null;
        zy11 zy11Var = zy11.a;
        List<MediaData> list = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!list.contains((ImageView) obj));
            case 1:
                return Boolean.valueOf(!list.contains((TextView) obj));
            case 2:
                ((m6y) ((u6y) obj)).f(list.size(), null, new qc0(list, 3), new a(2039820996, new xs4(i2, list, list), true));
                return zy11Var;
            case 3:
                m29 m29Var = (m29) obj;
                int size = list.size();
                List list2 = m29Var.c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((CashbackSelectorCategoryEntity) it.next()).isSelected() && (i2 = i2 + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                return m29.a(m29Var, null, null, null, 0, i2 + size, null, false, false, 239);
            case 4:
                return Boolean.valueOf(list.contains(((h2) obj).getA()));
            case 5:
                ((li6) obj).c(list);
                return zy11Var;
            case 6:
                ((li6) obj).c(list);
                return zy11Var;
            case 7:
                ((ListYandexPlayerManager) obj).updateItemsList(list);
                return zy11Var;
            case 8:
                h6z h6zVar = (h6z) obj;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (jl40.l(((h6z) next).a, h6zVar.a)) {
                            obj2 = next;
                        }
                    }
                }
                return Boolean.valueOf(obj2 != null);
            case 9:
                return Boolean.valueOf(kotlin.collections.a.G(list, ((h6z) obj).a));
            case 10:
                ((m6y) ((u6y) obj)).f(list.size(), null, new rc0(list, 6, de40.a), new a(802480018, new h9j(list, 2), true));
                return zy11Var;
            case 11:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = ((PlusPayCompositeOffers.Offer) obj3).getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it3 = optionOffers.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    if (arrayList2.containsAll(list)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 12:
                return Boolean.valueOf(!list.contains(((pbl0) obj).a()));
            case 13:
                w3j0 w3j0Var = (w3j0) obj;
                List<MediaData> list3 = list;
                ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    ton0 ton0Var = (ton0) it4.next();
                    arrayList3.add(b.i(new Pair("uuid", ton0Var.a.toString()), new Pair("major", Integer.valueOf(ton0Var.c)), new Pair("minor", Integer.valueOf(ton0Var.b)), new Pair("rssi", Integer.valueOf(ton0Var.d)), new Pair("receive_time_ms", Long.valueOf(ton0Var.e))));
                }
                w3j0Var.e("valid_beacons", arrayList3);
                return zy11Var;
            case 14:
                w3j0 w3j0Var2 = (w3j0) obj;
                List<MediaData> list4 = list;
                ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
                Iterator<T> it5 = list4.iterator();
                while (it5.hasNext()) {
                    ton0 ton0Var2 = (ton0) it5.next();
                    arrayList4.add(b.i(new Pair("uuid", ton0Var2.a.toString()), new Pair("major", Integer.valueOf(ton0Var2.c)), new Pair("minor", Integer.valueOf(ton0Var2.b)), new Pair("rssi", Integer.valueOf(ton0Var2.d))));
                }
                w3j0Var2.e("ignored_beacons", arrayList4);
                return zy11Var;
            case 15:
                return ((xj31) list.get(((Integer) obj).intValue())).getId();
            case 16:
                String str = (String) obj;
                Iterator<T> it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next2 = it6.next();
                        if (jl40.l(((SummaryPromotionsResponse.a) next2).getA(), str)) {
                            obj2 = next2;
                        }
                    }
                }
                return (SummaryPromotionsResponse.a) obj2;
            case 17:
                ((li6) obj).c(list);
                return zy11Var;
            default:
                kdx kdxVar = (kdx) obj;
                kdx kdxVar2 = new kdx();
                List<MediaData> list5 = list;
                ArrayList arrayList5 = new ArrayList(tcc.n(list5, 10));
                Iterator<T> it7 = list5.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(qcx.c((String) it7.next()));
                }
                kdxVar2.b("$has_tags", new kotlinx.serialization.json.a(arrayList5));
                kdxVar.b("if", kdxVar2.a());
                abb1.d(kdxVar, "do", "send_bright");
                return zy11Var;
        }
    }
}
