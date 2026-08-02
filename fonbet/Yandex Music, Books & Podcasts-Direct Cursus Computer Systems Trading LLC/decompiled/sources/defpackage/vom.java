package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class vom extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wom s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vom(wom womVar, int i) {
        super(1);
        this.r = i;
        this.s = womVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        wom womVar = this.s;
        switch (i) {
            case 0:
                gpm gpmVar = (gpm) obj;
                gpmVar.getClass();
                LinearLayout linearLayout = ((shk) womVar.x()).a;
                linearLayout.getClass();
                View findViewById = womVar.requireView().getRootView().findViewById(R.id.container_layout);
                findViewById.getClass();
                qdq.b(linearLayout, (ViewGroup) findViewById);
                if (gpmVar instanceof dpm) {
                    g0c g0cVar = (g0c) womVar.m.getValue();
                    qne m1 = gut.m1(d0n.BIND);
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(m1);
                    ((shk) womVar.x()).l.setVisibility(8);
                    ((shk) womVar.x()).e.setVisibility(0);
                    ((shk) womVar.x()).n.setVisibility(0);
                } else if (gpmVar instanceof epm) {
                    ((shk) womVar.x()).l.setVisibility(0);
                    ((shk) womVar.x()).l.setState(new dvm(true));
                    ((shk) womVar.x()).e.setVisibility(8);
                    ((shk) womVar.x()).n.setVisibility(8);
                } else if (gpmVar instanceof fpm) {
                    if (((fpm) gpmVar).a) {
                        sbp sbpVar = womVar.o;
                        if (sbpVar == null) {
                            Intrinsics.j("selectCallbacks");
                            throw null;
                        }
                        sbpVar.L(R.string.paymentsdk_success_title);
                    } else {
                        womVar.A(new evm(R.string.paymentsdk_bind_success_title));
                    }
                } else if (gpmVar instanceof bpm) {
                    bpm bpmVar = (bpm) gpmVar;
                    bfk bfkVar = bpmVar.b;
                    if (bpmVar.a) {
                        sbp sbpVar2 = womVar.o;
                        if (sbpVar2 == null) {
                            Intrinsics.j("selectCallbacks");
                            throw null;
                        }
                        sbpVar2.B(bfkVar);
                    } else {
                        womVar.A(new cvm(qgg.Y(bfkVar, R.string.paymentsdk_error_title), qgg.S(bfkVar)));
                    }
                } else if ((gpmVar instanceof cpm) && womVar.isAdded() && !womVar.getParentFragmentManager().Q()) {
                    lom lomVar = womVar.n;
                    if (lomVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar.a.r = null;
                    lomVar.n();
                }
                return Unit.a;
            case 1:
                apm apmVar = (apm) obj;
                apmVar.getClass();
                if (apmVar instanceof zom) {
                    lom lomVar2 = womVar.n;
                    if (lomVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar2.H(false);
                } else if (apmVar instanceof xom) {
                    lom lomVar3 = womVar.n;
                    if (lomVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar3.H(true);
                    lom lomVar4 = womVar.n;
                    if (lomVar4 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar4.h(cek.a);
                    lom lomVar5 = womVar.n;
                    if (lomVar5 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    xom xomVar = (xom) apmVar;
                    String string = womVar.getString(xomVar.a);
                    string.getClass();
                    Double d = xomVar.b;
                    Context requireContext = womVar.requireContext();
                    requireContext.getClass();
                    String z = womVar.z(d, requireContext);
                    Double d2 = xomVar.c;
                    Context requireContext2 = womVar.requireContext();
                    requireContext2.getClass();
                    lomVar5.i(string, z, womVar.z(d2, requireContext2));
                } else if (apmVar instanceof yom) {
                    lom lomVar6 = womVar.n;
                    if (lomVar6 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar6.H(true);
                    lom lomVar7 = womVar.n;
                    if (lomVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar7.h(new dek());
                    lom lomVar8 = womVar.n;
                    if (lomVar8 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    yom yomVar = (yom) apmVar;
                    String string2 = womVar.getString(yomVar.a);
                    string2.getClass();
                    Double d3 = yomVar.b;
                    Context requireContext3 = womVar.requireContext();
                    requireContext3.getClass();
                    String z2 = womVar.z(d3, requireContext3);
                    Double d4 = yomVar.c;
                    Context requireContext4 = womVar.requireContext();
                    requireContext4.getClass();
                    lomVar8.i(string2, z2, womVar.z(d4, requireContext4));
                }
                return Unit.a;
            case 2:
                jpm jpmVar = (jpm) obj;
                if (jpmVar instanceof ipm) {
                    ipm ipmVar = (ipm) jpmVar;
                    String str = ipmVar.a;
                    List list = ipmVar.b;
                    lom lomVar9 = womVar.n;
                    if (lomVar9 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar9.p(str, list);
                } else if (jpmVar instanceof hpm) {
                    lom lomVar10 = womVar.n;
                    if (lomVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar10.d();
                }
                return Unit.a;
            case 3:
                jw3 jw3Var = (jw3) obj;
                jw3Var.getClass();
                lpm lpmVar = womVar.i;
                if (lpmVar == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                lpmVar.x = jw3Var;
                if (jw3Var == jw3.d && lpmVar.n) {
                    cfk cfkVar = cfk.e;
                    if (cfkVar.a.e()) {
                        String str2 = lpmVar.v;
                        if (str2 == null) {
                            xq0.q("Valid card state without card number");
                            return null;
                        }
                        hw3 hw3Var = new hw3("NEW_CARD");
                        ix3 ix3Var = lpmVar.w;
                        dm2 dm2Var = dm2.a;
                        ffk ffkVar = new ffk(hw3Var, ix3Var, str2);
                        if (Intrinsics.d(lpmVar.u, ffkVar)) {
                            lpmVar.G();
                        } else {
                            lpmVar.u = ffkVar;
                            cfkVar.a(ffkVar);
                        }
                        return Unit.a;
                    }
                }
                lpmVar.G();
                return Unit.a;
            case 4:
                String str3 = (String) obj;
                lpm lpmVar2 = womVar.i;
                if (lpmVar2 != null) {
                    lpmVar2.v = str3;
                    return Unit.a;
                }
                Intrinsics.j("viewModel");
                throw null;
            default:
                ix3 ix3Var2 = (ix3) obj;
                ix3Var2.getClass();
                lpm lpmVar3 = womVar.i;
                if (lpmVar3 != null) {
                    lpmVar3.w = ix3Var2;
                    return Unit.a;
                }
                Intrinsics.j("viewModel");
                throw null;
        }
    }
}
