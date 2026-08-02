package defpackage;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallScenario;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallStatus;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.help.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class qrl0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ qrl0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        e eVar = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    eVar.getClass();
                    break;
                } else {
                    eVar.J.d(SafetyCenterAnalytics$EmergencyCallStatus.Ended, SafetyCenterAnalytics$EmergencyCallScenario.Emergency);
                    eVar.Ng(eVar.Lg(), true, ShareRequestParam.NotificationType.EMERGENCY);
                    break;
                }
            case 1:
                Pair pair = (Pair) obj;
                List list = (List) pair.getFirst();
                boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                nrl0 nrl0Var = (nrl0) eVar.Dg();
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((swe0) it.next()).a);
                }
                nrl0Var.updateSharingUI(arrayList, eVar.z.d() != null, eVar.z.h(), booleanValue);
                break;
            default:
                ((nrl0) eVar.Dg()).setAddress(((pv0) obj).a.D1());
                hrl0 hrl0Var = eVar.y;
                if (!hrl0Var.a()) {
                    hrl0Var.c(new orl0(eVar, i2), false);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
