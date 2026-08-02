package defpackage;

import android.widget.Filter;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class il2 extends Filter {
    public boolean a;
    public final /* synthetic */ ol2 b;

    public il2(ol2 ol2Var) {
        this.b = ol2Var;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List list = this.b.f;
        if (charSequence == null || charSequence.length() == 0) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = list;
            return filterResults;
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.M(((hl2) obj).a, charSequence, true)) {
                arrayList.add(obj);
            }
        }
        filterResults2.values = arrayList;
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        if (this.a) {
            this.a = false;
            return;
        }
        if ((filterResults != null ? filterResults.values : null) == null) {
            list = c5b.a;
        } else {
            Object obj = filterResults.values;
            List list2 = obj instanceof List ? (List) obj : null;
            list = list2 == null ? c5b.a : list2;
        }
        ol2 ol2Var = this.b;
        ol2Var.g = list;
        if (list.isEmpty() && charSequence != null && charSequence.length() != 0 && ol2Var.l) {
            ol2Var.l = false;
            g0c g0cVar = ol2Var.d;
            String obj2 = charSequence.toString();
            obj2.getClass();
            String concat = "Пустой результат поиска в списке банков по запросу: ".concat(obj2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            linkedHashMap.put(Constants.KEY_VALUE, new jkr(obj2));
            linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
            vtm vtmVar = new vtm((Map) linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(vtmVar, "event_name", "sbp_bank_empty_search_result", "sbp_bank_empty_search_result", vtmVar);
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(j);
        }
        if (!ol2Var.g.isEmpty()) {
            ol2Var.l = true;
        }
        ol2Var.h = 0;
        ol2Var.g();
    }
}
