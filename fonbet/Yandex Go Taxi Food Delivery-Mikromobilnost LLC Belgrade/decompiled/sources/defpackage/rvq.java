package defpackage;

import com.yandex.go.taxi.order.feedback.ui.k;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes14.dex */
public final class rvq implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ rvq(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                int i = kVar.K.j;
                kVar.K = new isq(kVar.A.b().a, (ksq) obj);
                if (kVar.K.j != i) {
                    kVar.Og();
                }
                kVar.Mg();
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                k kVar2 = this.b;
                orq orqVar = kVar2.C;
                TaxiOrder taxiOrder = kVar2.J;
                String str = taxiOrder.a;
                TipsType b = taxiOrder.V().E.b();
                List b2 = kVar2.A.b().l.getW().getG().getB();
                yh70 yh70Var = orqVar.d;
                String b3 = ((ci70) orqVar.c).b(str);
                String valueOf = String.valueOf(booleanValue);
                String lowerCase = b.name().toLowerCase(Locale.US);
                String obj2 = b2.toString();
                yh70Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(MetaDataField.SCREEN_FIELD, b3);
                hashMap.put("visible", valueOf);
                HashMap q = x4e.q(hashMap, "type", lowerCase, "tips_list", obj2);
                Regex regex = sho.a;
                yh70Var.a.a(sb2.q("${screen}.DidChangeTipsVisibility", hashMap), hashMap, 1, q);
                break;
        }
        return zy11.a;
    }
}
