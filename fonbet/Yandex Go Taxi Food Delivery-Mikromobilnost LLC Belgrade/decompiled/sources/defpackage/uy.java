package defpackage;

import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchActionType;
import kotlin.Pair;

/* loaded from: classes14.dex */
public final class uy {
    public static axv0 a(swv0 swv0Var) {
        Pair pair;
        if (swv0Var instanceof mwv0) {
            ti80 ti80Var = ((mwv0) swv0Var).a;
            if (ti80Var instanceof qi80) {
                pair = new Pair(null, ((qi80) ti80Var).a);
            } else if (ti80Var instanceof ri80) {
                pair = new Pair(((ri80) ti80Var).a, null);
            } else {
                if (!(ti80Var instanceof si80)) {
                    w511.b();
                    return null;
                }
                si80 si80Var = (si80) ti80Var;
                pair = new Pair(si80Var.a, si80Var.b);
            }
            String str = (String) pair.getFirst();
            return new axv0(SuperMapAnalytics$SuperMapSearchActionType.OpenOrganizationCard, null, (String) pair.getSecond(), str, null, null, null, null, null, 498);
        }
        if (swv0Var instanceof nwv0) {
            return new axv0(SuperMapAnalytics$SuperMapSearchActionType.OpenOrganizationsList, null, null, null, ((nwv0) swv0Var).a, null, null, null, null, 494);
        }
        if (swv0Var instanceof owv0) {
            return new axv0(SuperMapAnalytics$SuperMapSearchActionType.OpenVehicle, null, null, null, null, null, null, null, ((owv0) swv0Var).a, 254);
        }
        if (swv0Var instanceof pwv0) {
            SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType = SuperMapAnalytics$SuperMapSearchActionType.OpenStop;
            pwv0 pwv0Var = (pwv0) swv0Var;
            zzs zzsVar = pwv0Var.b;
            return new axv0(superMapAnalytics$SuperMapSearchActionType, null, null, null, null, pwv0Var.a, pwv0Var.c, scc.g(Double.valueOf(zzsVar.a), Double.valueOf(zzsVar.b)), null, 286);
        }
        if (swv0Var instanceof lwv0) {
            return new axv0(SuperMapAnalytics$SuperMapSearchActionType.Deeplink, ((lwv0) swv0Var).a.toString(), null, null, null, null, null, null, null, 508);
        }
        if (swv0Var instanceof qwv0) {
            return new axv0(SuperMapAnalytics$SuperMapSearchActionType.Search, null, null, null, null, null, null, null, null, 510);
        }
        if (swv0Var != null && !(swv0Var instanceof rwv0)) {
            w511.b();
        }
        return null;
    }
}
