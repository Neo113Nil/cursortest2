package defpackage;

import android.content.Context;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardScreenState;
import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import com.yandex.go.chargers.notification.ChargersNotification;
import com.yandex.go.chargers.order.active.q;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final class sk9 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ sk9(q qVar, int i) {
        this.a = i;
        this.b = qVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        q qVar = this.b;
        switch (i) {
            case 0:
                for (yca ycaVar : (List) obj) {
                    z5 z5Var = new z5(7, qVar, ycaVar);
                    j6a j6aVar = (j6a) qVar.D.get();
                    String str = ycaVar.a;
                    String str2 = ycaVar.b;
                    e6a e6aVar = str2 != null ? new e6a(str2) : null;
                    CharSequence charSequence = ycaVar.c;
                    CharSequence charSequence2 = ycaVar.d;
                    j6aVar.getClass();
                    Context context = j6aVar.a;
                    if (str == null) {
                        str = "ChargersNotification";
                    }
                    j6aVar.a(new ChargersNotification(context, str, charSequence, charSequence2, e6aVar, j6aVar.b, 2), z5Var);
                }
                break;
            case 1:
                taa taaVar = (taa) obj;
                if ((taaVar != null ? taaVar.b() : null) != ChargersActiveOrderStatus.LEASING) {
                    em9 em9Var = qVar.x;
                    ChargersAnalytics$ChargersActiveOrderCardCloseReason chargersAnalytics$ChargersActiveOrderCardCloseReason = ChargersAnalytics$ChargersActiveOrderCardCloseReason.FinishOrder;
                    HashMap w = b64.w(em9Var);
                    w.put("close_reason", chargersAnalytics$ChargersActiveOrderCardCloseReason.getEventValue());
                    em9Var.a.a("Chargers.ActiveOrderCard.Closed", w, 1, new HashMap());
                    vk9 vk9Var = (vk9) qVar.H.c;
                    if (vk9Var.u()) {
                        vk9Var.r(new jv8(24));
                        break;
                    }
                }
                break;
            case 2:
                b bVar = (b) obj;
                cyx cyxVar = qVar.B;
                String str3 = (String) qVar.A.a.getValue();
                if (str3 == null) {
                    str3 = "";
                }
                kdx kdxVar = new kdx();
                if (bVar != null) {
                    kdxVar.b("filter", bVar);
                }
                abb1.d(kdxVar, "active_charger", str3);
                cyxVar.b(new byx(Screen.TOTW, new c430(Mode.CHARGERS, (b) null, new q6e("chargers", kdxVar.a()))));
                break;
            case 3:
                for (Map map : (List) obj) {
                    nna nnaVar = qVar.y;
                    nnaVar.getClass();
                    nnaVar.a(map, RealtimeEventType.Received);
                }
                break;
            case 4:
                gl9 gl9Var = (gl9) obj;
                Integer num = gl9Var.d;
                ChargersAnalytics$ChargersActiveOrderCardScreenState chargersAnalytics$ChargersActiveOrderCardScreenState = (num == null || num.intValue() <= 0) ? ChargersAnalytics$ChargersActiveOrderCardScreenState.Default : ChargersAnalytics$ChargersActiveOrderCardScreenState.HoldoutStart;
                Integer num2 = gl9Var.d;
                if (num2 == null || chargersAnalytics$ChargersActiveOrderCardScreenState != ChargersAnalytics$ChargersActiveOrderCardScreenState.HoldoutStart) {
                    num2 = null;
                }
                qVar.I = new rk9(chargersAnalytics$ChargersActiveOrderCardScreenState, num2);
                r0 r0Var = qVar.J;
                Object obj2 = gl9Var.f;
                if (obj2 == null) {
                    obj2 = EmptyList.a;
                }
                r0Var.getClass();
                r0Var.m(null, obj2);
                ((pk9) qVar.Dg()).render(gl9Var);
                break;
            default:
                Pair pair = (Pair) obj;
                List list = (List) pair.getFirst();
                ChargersAnalytics$ChargersActiveOrderCardScreenState chargersAnalytics$ChargersActiveOrderCardScreenState2 = (ChargersAnalytics$ChargersActiveOrderCardScreenState) pair.getSecond();
                em9 em9Var2 = qVar.x;
                HashMap w2 = b64.w(em9Var2);
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ChargersAnalytics$ChargersActiveOrderCardButtonNameV2) it.next()).getEventValue());
                }
                w2.put("actions", arrayList);
                w2.put("screen_state", chargersAnalytics$ChargersActiveOrderCardScreenState2.getEventValue());
                em9Var2.a.a("Chargers.ActiveOrderCard.Loaded", w2, 2, new HashMap());
                break;
        }
        return zy11Var;
    }
}
