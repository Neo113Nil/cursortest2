package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersOfferCardOpenReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersSubscriptionToggleState;
import com.yandex.go.chargers.offer.ui.mvp.c;
import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import com.yandex.go.chargers.orchestrator_user_events.domain.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class v8a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ v8a(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersAnalytics$ChargersOfferCardOpenReason chargersAnalytics$ChargersOfferCardOpenReason;
        boolean z;
        x7a x7aVar;
        tn9 tn9Var;
        CharSequence charSequence;
        n9a n9aVar;
        List list;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                paa paaVar = (paa) obj;
                int i2 = 2;
                if (!(paaVar instanceof laa)) {
                    if (paaVar instanceof oaa) {
                        ((b) cVar.D).a(ChargersOrchestratorUserEventType.OFFER);
                        em9 em9Var = cVar.x;
                        oaa oaaVar = (oaa) paaVar;
                        c8a c8aVar = oaaVar.d;
                        String str = oaaVar.a;
                        int i3 = h7a.a[cVar.F.ordinal()];
                        String str2 = null;
                        if (i3 == 1) {
                            chargersAnalytics$ChargersOfferCardOpenReason = ChargersAnalytics$ChargersOfferCardOpenReason.Deeplink;
                        } else if (i3 != 2) {
                            w511.b();
                            break;
                        } else {
                            chargersAnalytics$ChargersOfferCardOpenReason = ChargersAnalytics$ChargersOfferCardOpenReason.Qr;
                        }
                        ChargersAnalytics$ChargersOfferCardOpenReason chargersAnalytics$ChargersOfferCardOpenReason2 = chargersAnalytics$ChargersOfferCardOpenReason;
                        swa swaVar = c8aVar.i;
                        a8a a8aVar = c8aVar.k;
                        if (swaVar != null && (list = swaVar.c) != null) {
                            List list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    List list3 = ((twa) it.next()).b;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            if (((wwa) it2.next()).e instanceof dxa) {
                                                z = true;
                                                swa swaVar2 = c8aVar.i;
                                                boolean z2 = (swaVar2 == null ? swaVar2.b : null) != null;
                                                String str3 = oaaVar.f;
                                                ChargersAnalytics$ChargersSubscriptionToggleState chargersAnalytics$ChargersSubscriptionToggleState = (a8aVar != null || (n9aVar = a8aVar.h) == null) ? null : n9aVar.b ? ChargersAnalytics$ChargersSubscriptionToggleState.On : ChargersAnalytics$ChargersSubscriptionToggleState.Off;
                                                vva vvaVar = c8aVar.l;
                                                Integer num = vvaVar == null ? new Integer(vvaVar.a) : null;
                                                vr60 vr60Var = c8aVar.f;
                                                String str4 = vr60Var == null ? vr60Var.h : null;
                                                String str5 = oaaVar.e;
                                                String str6 = a8aVar == null ? a8aVar.a : null;
                                                x7aVar = c8aVar.m;
                                                if (x7aVar != null && (tn9Var = x7aVar.c) != null && (charSequence = tn9Var.a) != null) {
                                                    str2 = charSequence.toString();
                                                }
                                                em9Var.o(str, chargersAnalytics$ChargersOfferCardOpenReason2, z, z2, str3, chargersAnalytics$ChargersSubscriptionToggleState, num, str4, str2, str5, str6, cVar.E);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        swa swaVar22 = c8aVar.i;
                        if ((swaVar22 == null ? swaVar22.b : null) != null) {
                        }
                        String str32 = oaaVar.f;
                        if (a8aVar != null) {
                        }
                        vva vvaVar2 = c8aVar.l;
                        if (vvaVar2 == null) {
                        }
                        vr60 vr60Var2 = c8aVar.f;
                        if (vr60Var2 == null) {
                        }
                        String str52 = oaaVar.e;
                        if (a8aVar == null) {
                        }
                        x7aVar = c8aVar.m;
                        if (x7aVar != null) {
                            str2 = charSequence.toString();
                        }
                        em9Var.o(str, chargersAnalytics$ChargersOfferCardOpenReason2, z, z2, str32, chargersAnalytics$ChargersSubscriptionToggleState, num, str4, str2, str52, str6, cVar.E);
                    }
                    cVar.I.emit(paaVar, continuation);
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    break;
                } else {
                    cVar.x.n(ChargersAnalytics$ChargersOfferCardCloseReason.Error);
                    ((h9a) cVar.H.a).r(new j1a(((laa) paaVar).a, i2));
                    break;
                }
                break;
            case 1:
                j6a.b((j6a) ((h9a) cVar.H.a).R.get(), (k6a) obj);
                break;
            default:
                Pair pair = (Pair) obj;
                ((s8a) cVar.Dg()).a2(((Boolean) pair.getFirst()).booleanValue(), ((Boolean) pair.getSecond()).booleanValue());
                break;
        }
        return zy11Var;
    }
}
