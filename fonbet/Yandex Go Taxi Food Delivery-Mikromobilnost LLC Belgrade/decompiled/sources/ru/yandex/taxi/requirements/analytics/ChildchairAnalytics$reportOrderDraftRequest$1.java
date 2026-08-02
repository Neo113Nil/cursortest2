package ru.yandex.taxi.requirements.analytics;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.fms;
import defpackage.lt70;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ChildchairAnalytics$reportOrderDraftRequest$1 extends FunctionReferenceImpl implements fms {
    @Override // defpackage.fms
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        List list = (List) obj2;
        int intValue = ((Number) obj3).intValue();
        int intValue2 = ((Number) obj4).intValue();
        List list2 = (List) obj5;
        String str = (String) obj6;
        String str2 = (String) obj7;
        lt70 lt70Var = (lt70) this.receiver;
        lt70Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("zone_name", (String) obj);
        if (str != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        }
        hashMap.put("user_options", list);
        hashMap.put("requirements_count", Integer.valueOf(intValue));
        if (str2 != null) {
            hashMap.put("child_requirement", str2);
        }
        hashMap.put("child_requirement_max_weight", Integer.valueOf(intValue2));
        hashMap.put("child_requirement_options", list2);
        lt70Var.a.a("OrderDraft.ChildTariff.Chair.Requirement", hashMap, 1, new HashMap());
        return zy11.a;
    }
}
