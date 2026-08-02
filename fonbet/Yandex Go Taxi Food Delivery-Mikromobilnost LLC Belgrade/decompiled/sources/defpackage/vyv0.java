package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.exploration.ExplorationState;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class vyv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wyv0 b;

    public /* synthetic */ vyv0(wyv0 wyv0Var, int i) {
        this.a = i;
        this.b = wyv0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        vso vsoVar;
        int i = this.a;
        czv0 czv0Var = azv0.a;
        c5w0 c5w0Var = null;
        zy11 zy11Var = zy11.a;
        wyv0 wyv0Var = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ((qyv0) wyv0Var.Dg()).b(360.0f - floatValue, true ^ (floatValue == 0.0f));
                break;
            case 1:
                wyv0Var.p0 = (SuperAppOpenServiceActionType) obj;
                wyv0.Kg(wyv0Var);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                wyv0Var.M.a(wyv0Var.N, bool);
                break;
            case 3:
                ((Boolean) obj).getClass();
                qyv0 qyv0Var = (qyv0) wyv0Var.Dg();
                jtv0 jtv0Var = wyv0Var.x;
                String str = jtv0Var != null ? jtv0Var.a : null;
                String str2 = jtv0Var != null ? jtv0Var.b : null;
                qyv0Var.m(str, str2 != null ? str2 : "");
                break;
            case 4:
                czv0 czv0Var2 = (czv0) obj;
                wyv0Var.o0 = czv0Var2;
                if (!jl40.l(czv0Var2, czv0Var)) {
                    if (!(czv0Var2 instanceof bzv0)) {
                        if (!jl40.l(czv0Var2, zyv0.a)) {
                            w511.b();
                            break;
                        } else {
                            vsoVar = qso.a;
                        }
                    } else {
                        vsoVar = rso.a;
                    }
                } else {
                    vsoVar = oso.a;
                }
                r0 r0Var = wyv0Var.f0.h;
                Boolean valueOf = Boolean.valueOf(!(czv0Var2 instanceof zyv0));
                r0Var.getClass();
                r0Var.m(null, valueOf);
                wyv0Var.Mg().b(vsoVar);
                wyv0.Kg(wyv0Var);
                break;
            case 5:
                wyv0Var.q0 = ((Boolean) obj).booleanValue();
                wyv0.Kg(wyv0Var);
                break;
            case 6:
                wyv0Var.m0 = (ExplorationState) obj;
                wyv0.Kg(wyv0Var);
                break;
            case 7:
                wyv0Var.s0 = (fto) obj;
                wyv0.Kg(wyv0Var);
                break;
            case 8:
                qto qtoVar = (qto) obj;
                dzv0 dzv0Var = wyv0Var.S;
                if (qtoVar != null && qtoVar.c) {
                    czv0Var = null;
                }
                if (czv0Var == null) {
                    czv0Var = new bzv0(qtoVar);
                }
                dzv0Var.a.a(czv0Var, false);
                break;
            case 9:
                wyv0Var.t0 = (qto) obj;
                wyv0.Kg(wyv0Var);
                break;
            case 10:
                SuperAppDiscoveryMapV2Experiment.SearchBarConfig searchBarConfig = (SuperAppDiscoveryMapV2Experiment.SearchBarConfig) obj;
                if (searchBarConfig != null) {
                    u6w0 u6w0Var = wyv0Var.U;
                    Map map = ((SuperAppDiscoveryMapV2Experiment) wyv0Var.e0.a().c()).b;
                    u6w0Var.getClass();
                    SuperAppDiscoveryMapV2Experiment.Searchbar searchbar = searchBarConfig.b;
                    String str3 = (String) map.get(searchbar.a);
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (evu0.J(str3)) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = null;
                    }
                    String str4 = searchbar.c;
                    String str5 = !evu0.J(str4) ? str4 : null;
                    String str6 = (String) map.get(searchbar.b);
                    String str7 = str6 != null ? str6 : "";
                    c5w0Var = new c5w0(str3 != null ? new a5w0(str3) : null, !evu0.J(str7) ? str7 : null, str5, u6w0.a(searchbar.d), u6w0Var.b(searchBarConfig.c, map), u6w0Var.b(searchBarConfig.d, map));
                }
                ((qyv0) wyv0Var.Dg()).wg(c5w0Var);
                break;
            case 11:
                zzs B = ((pv0) obj).a.B();
                zzs zzsVar = jl40.l(B, zzs.f) ? null : B;
                if (zzsVar != null) {
                    if (!wyv0Var.n0) {
                        wyv0Var.J.b(zzsVar);
                        break;
                    } else {
                        wyv0Var.n0 = false;
                        break;
                    }
                }
                break;
            default:
                wyv0Var.f0.g.d(zy11Var);
                break;
        }
        return zy11Var;
    }
}
