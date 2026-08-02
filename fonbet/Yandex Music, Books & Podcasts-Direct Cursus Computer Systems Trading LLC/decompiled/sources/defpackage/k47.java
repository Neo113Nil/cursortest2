package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.DeviceService;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class k47 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ l47 b;

    public /* synthetic */ k47(l47 l47Var, int i) {
        this.a = i;
        this.b = l47Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        String queryParameter;
        Parcelable fz6Var;
        int i = this.a;
        final int i2 = 0;
        final l47 l47Var = this.b;
        switch (i) {
            case 0:
                final zcp zcpVar = (zcp) obj;
                if (zcpVar instanceof vcp) {
                    vcp vcpVar = (vcp) zcpVar;
                    l47Var.A(vcpVar.b, vcpVar.a);
                } else if (zcpVar instanceof xcp) {
                    sbp sbpVar = l47Var.h;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar.l();
                    g0c g0cVar = l47Var.q;
                    if (g0cVar == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    ((x60) g0cVar).a(gut.m1(d0n.DK_SELECT));
                    l47Var.z();
                } else if (zcpVar instanceof ycp) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: h47
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            zcp zcpVar2 = zcpVar;
                            l47 l47Var2 = l47Var;
                            switch (i3) {
                                case 0:
                                    zcpVar2.getClass();
                                    ((tu2) l47Var2.i.getValue()).G();
                                    if (l47Var2.g) {
                                        sbp sbpVar2 = l47Var2.h;
                                        if (sbpVar2 == null) {
                                            Intrinsics.j("callbacks");
                                            throw null;
                                        }
                                        sbpVar2.n(false);
                                    }
                                    sbp sbpVar3 = l47Var2.h;
                                    if (sbpVar3 == null) {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                                    sbpVar3.h();
                                    sbp sbpVar4 = l47Var2.h;
                                    if (sbpVar4 != null) {
                                        sbpVar4.L(((ycp) zcpVar2).a);
                                        return;
                                    } else {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                                default:
                                    zcpVar2.getClass();
                                    g0c g0cVar2 = l47Var2.q;
                                    if (g0cVar2 == null) {
                                        Intrinsics.j("eventReporter");
                                        throw null;
                                    }
                                    bfk bfkVar = ((tcp) zcpVar2).a;
                                    String str = bfkVar.e;
                                    str.getClass();
                                    String concat = "Показ ошибки на экране выбора метода оплаты: ".concat(str);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    r1f r1fVar = r1f.a;
                                    linkedHashMap.put("reason", new jkr(str));
                                    linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                                    vtm vtmVar = new vtm((Map) linkedHashMap);
                                    ci0 ci0Var = qjb.a;
                                    ci0Var.a = su4.g(1, ci0Var.a);
                                    vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                                    ((x60) g0cVar2).a(su4.j(vtmVar, "event_name", "select_screen_error_shown", "select_screen_error_shown", vtmVar));
                                    ((tu2) l47Var2.i.getValue()).G();
                                    if (l47Var2.g) {
                                        sbp sbpVar5 = l47Var2.h;
                                        if (sbpVar5 == null) {
                                            Intrinsics.j("callbacks");
                                            throw null;
                                        }
                                        sbpVar5.n(false);
                                    }
                                    sbp sbpVar6 = l47Var2.h;
                                    if (sbpVar6 == null) {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                                    sbpVar6.h();
                                    sbp sbpVar7 = l47Var2.h;
                                    if (sbpVar7 != null) {
                                        sbpVar7.B(bfkVar);
                                        return;
                                    } else {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                            }
                        }
                    });
                } else if (zcpVar instanceof tcp) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: h47
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = r3;
                            zcp zcpVar2 = zcpVar;
                            l47 l47Var2 = l47Var;
                            switch (i3) {
                                case 0:
                                    zcpVar2.getClass();
                                    ((tu2) l47Var2.i.getValue()).G();
                                    if (l47Var2.g) {
                                        sbp sbpVar2 = l47Var2.h;
                                        if (sbpVar2 == null) {
                                            Intrinsics.j("callbacks");
                                            throw null;
                                        }
                                        sbpVar2.n(false);
                                    }
                                    sbp sbpVar3 = l47Var2.h;
                                    if (sbpVar3 == null) {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                                    sbpVar3.h();
                                    sbp sbpVar4 = l47Var2.h;
                                    if (sbpVar4 != null) {
                                        sbpVar4.L(((ycp) zcpVar2).a);
                                        return;
                                    } else {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                                default:
                                    zcpVar2.getClass();
                                    g0c g0cVar2 = l47Var2.q;
                                    if (g0cVar2 == null) {
                                        Intrinsics.j("eventReporter");
                                        throw null;
                                    }
                                    bfk bfkVar = ((tcp) zcpVar2).a;
                                    String str = bfkVar.e;
                                    str.getClass();
                                    String concat = "Показ ошибки на экране выбора метода оплаты: ".concat(str);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    r1f r1fVar = r1f.a;
                                    linkedHashMap.put("reason", new jkr(str));
                                    linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                                    vtm vtmVar = new vtm((Map) linkedHashMap);
                                    ci0 ci0Var = qjb.a;
                                    ci0Var.a = su4.g(1, ci0Var.a);
                                    vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                                    ((x60) g0cVar2).a(su4.j(vtmVar, "event_name", "select_screen_error_shown", "select_screen_error_shown", vtmVar));
                                    ((tu2) l47Var2.i.getValue()).G();
                                    if (l47Var2.g) {
                                        sbp sbpVar5 = l47Var2.h;
                                        if (sbpVar5 == null) {
                                            Intrinsics.j("callbacks");
                                            throw null;
                                        }
                                        sbpVar5.n(false);
                                    }
                                    sbp sbpVar6 = l47Var2.h;
                                    if (sbpVar6 == null) {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                                    sbpVar6.h();
                                    sbp sbpVar7 = l47Var2.h;
                                    if (sbpVar7 != null) {
                                        sbpVar7.B(bfkVar);
                                        return;
                                    } else {
                                        Intrinsics.j("callbacks");
                                        throw null;
                                    }
                            }
                        }
                    });
                } else if (Intrinsics.d(zcpVar, ucp.a)) {
                    sbp sbpVar2 = l47Var.h;
                    if (sbpVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar2.e();
                }
                return Unit.a;
            case 1:
                tv8 tv8Var = (tv8) obj;
                List<Pair> list = tv8Var.c;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (Pair pair : list) {
                    if (Intrinsics.d(pair.a, "select_method_screen_selected_method")) {
                        Object obj2 = pair.a;
                        rn5 rn5Var = l47Var.r;
                        if (rn5Var == null) {
                            Intrinsics.j("mediator");
                            throw null;
                        }
                        pair = new Pair(obj2, String.valueOf(rn5Var.I()));
                    }
                    arrayList.add(pair);
                }
                tv8 a = tv8.a(tv8Var, arrayList);
                qc9 qc9Var = l47Var.o;
                if (qc9Var == null) {
                    Intrinsics.j("parsingEnvironment");
                    throw null;
                }
                qc9Var.e(a.a);
                int i3 = rv8.i;
                qc9 qc9Var2 = l47Var.o;
                if (qc9Var2 == null) {
                    Intrinsics.j("parsingEnvironment");
                    throw null;
                }
                rv8 y = fgq.y(qc9Var2, a.b);
                gc8 gc8Var = l47Var.j;
                if (gc8Var == null || !Intrinsics.d(gc8Var.getParent(), (LinearLayout) l47Var.x().b)) {
                    gc8 gc8Var2 = new gc8((vb8) l47Var.s.getValue(), null, 0, 6, null);
                    gc8Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    gc8Var2.setId(View.generateViewId());
                    l47Var.j = gc8Var2;
                }
                if (((LinearLayout) l47Var.x().b).getChildCount() == 0) {
                    ((LinearLayout) l47Var.x().b).addView(l47Var.j);
                }
                gc8 gc8Var3 = l47Var.j;
                if (gc8Var3 != null) {
                    gc8Var3.M(y, new dw8(y.b));
                }
                gc8 gc8Var4 = l47Var.j;
                if (gc8Var4 != null) {
                    gc8Var4.post(new jt6(13, a, l47Var));
                }
                return Unit.a;
            case 2:
                mgk mgkVar = (mgk) obj;
                if (mgkVar != null) {
                    wgk f = mgkVar.f();
                    Context requireContext = l47Var.requireContext();
                    requireContext.getClass();
                    g0c g0cVar2 = l47Var.q;
                    if (g0cVar2 == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    irf.J(requireContext, f, g0cVar2);
                    mgkVar.f();
                    sbp sbpVar3 = l47Var.h;
                    if (sbpVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar3.i = mgkVar;
                }
                return Unit.a;
            case 3:
                int ordinal = ((q5m) obj).ordinal();
                if (ordinal == 1) {
                    l47Var.A(false, false);
                } else if (ordinal == 2) {
                    l47Var.y().i(new jst(null, true));
                }
                return Unit.a;
            case 4:
                String str = (String) obj;
                sbp sbpVar4 = l47Var.h;
                if (sbpVar4 == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                ddu dduVar = sbpVar4.a;
                PaymentActivity paymentActivity = dduVar instanceof PaymentActivity ? (PaymentActivity) dduVar : null;
                if (paymentActivity != null) {
                    paymentActivity.s = null;
                    paymentActivity.j();
                    op2.t(paymentActivity, paymentActivity.Q(str), true, 0, 4);
                }
                return Unit.a;
            case 5:
                Uri uri = (Uri) obj;
                String uri2 = uri.toString();
                uri2.getClass();
                Integer intOrNull = StringsKt.toIntOrNull(StringsKt.k0(uri2, "select_method_screen_selected_method&value=", uri2));
                if (intOrNull != null) {
                    l47Var.y().k(intOrNull.intValue());
                }
                String host = uri.getHost();
                if (host != null) {
                    switch (host.hashCode()) {
                        case 3015911:
                            if (host.equals("back")) {
                                l47Var.requireActivity().onBackPressed();
                                break;
                            }
                            break;
                        case 47329499:
                            if (host.equals("bind_card_click")) {
                                l47Var.y().z();
                                sbp sbpVar5 = l47Var.h;
                                if (sbpVar5 == null) {
                                    Intrinsics.j("callbacks");
                                    throw null;
                                }
                                sbpVar5.z(true);
                                break;
                            }
                            break;
                        case 1115503494:
                            if (host.equals("click_on_promo")) {
                                l47Var.y().p();
                                e8w e8wVar = e8w.a;
                                l47Var.requireActivity().getClass();
                                ((LinearLayout) l47Var.x().a).getClass();
                                wyf.F(l47Var.getLifecycle());
                                e8w.c();
                                break;
                            }
                            break;
                        case 1126556261:
                            if (host.equals("show_toast") && (queryParameter = uri.getQueryParameter(Constants.KEY_MESSAGE)) != null) {
                                sbp sbpVar6 = l47Var.h;
                                if (sbpVar6 == null) {
                                    Intrinsics.j("callbacks");
                                    throw null;
                                }
                                ddu dduVar2 = sbpVar6.a;
                                if (dduVar2 instanceof PaymentActivity) {
                                    PaymentActivity paymentActivity2 = (PaymentActivity) dduVar2;
                                    ((TextView) paymentActivity2.R().d).setText(queryParameter);
                                    ((TextView) paymentActivity2.R().c).setVisibility(8);
                                    ConstraintLayout constraintLayout = ((nhk) paymentActivity2.D()).g;
                                    constraintLayout.getClass();
                                    ddu.L(paymentActivity2, true, constraintLayout);
                                    break;
                                } else if (dduVar2 instanceof PreselectActivity) {
                                    ((PreselectActivity) dduVar2).S(queryParameter);
                                    break;
                                }
                            }
                            break;
                        case 1284156530:
                            if (host.equals("pay_button_click")) {
                                Object C = l47Var.y().C(new jst(), continuation);
                                return C == nm6.a ? C : Unit.a;
                            }
                            break;
                    }
                }
                return Unit.a;
            case 6:
                gie gieVar = (gie) obj;
                if (gieVar instanceof zhe ? true : gieVar instanceof yhe) {
                    l47Var.A(true, false);
                    sbp sbpVar7 = l47Var.h;
                    if (sbpVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar7.h();
                    l47Var.z();
                } else if (gieVar instanceof cie) {
                    sbp sbpVar8 = l47Var.h;
                    if (sbpVar8 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar8.l();
                    sbp sbpVar9 = l47Var.h;
                    if (sbpVar9 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    cie cieVar = (cie) gieVar;
                    if (cieVar instanceof bie) {
                        fz6Var = new gz6(((bie) cieVar).a);
                    } else {
                        if (!(cieVar instanceof aie)) {
                            b6e.s();
                            return null;
                        }
                        aie aieVar = (aie) cieVar;
                        fz6Var = new fz6(aieVar.a, aieVar.b, aieVar.c);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("paymentsdk_cvv_args_key", fz6Var);
                    ty6 ty6Var = new ty6();
                    ty6Var.setArguments(bundle);
                    sbpVar9.A(ty6Var, gieVar instanceof bie);
                } else if (gieVar instanceof eie) {
                    eie eieVar = (eie) gieVar;
                    String str2 = eieVar.a;
                    List list2 = eieVar.b;
                    sbp sbpVar10 = l47Var.h;
                    if (sbpVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar10.k(str2, list2);
                } else if (gieVar instanceof fie) {
                    sbp sbpVar11 = l47Var.h;
                    if (sbpVar11 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    fie fieVar = (fie) gieVar;
                    kpo kpoVar = fieVar.a;
                    mfk mfkVar = fieVar.b;
                    ddu dduVar3 = sbpVar11.a;
                    kpoVar.getClass();
                    mfkVar.getClass();
                    if (((n7w.R(q6c.e) && n7w.R(q6c.n)) ? 1 : 0) != 0) {
                        o17 o17Var = new o17();
                        o17Var.setArguments(cxb.K(new Pair("CHALLENGE_INFO_DATA", kpoVar), new Pair("SBP_TOKEN_DATA", mfkVar)));
                        sbpVar11.A(o17Var, false);
                    } else {
                        Intent intent = new Intent(dduVar3, (Class<?>) SbpChallengerActivity.class);
                        intent.putExtra("CHALLENGE_INFO_DATA", kpoVar);
                        intent.putExtra("SBP_TOKEN_DATA", mfkVar);
                        intent.putExtra("MODULE_DATA", dduVar3.getIntent().getExtras());
                        dduVar3.startActivityForResult(intent, 1111);
                    }
                    l47Var.z();
                } else if (gieVar instanceof die) {
                    l47Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((die) gieVar).a)));
                }
                return Unit.a;
            default:
                rcp rcpVar = (rcp) obj;
                if (rcpVar instanceof ncp) {
                    sbp sbpVar12 = l47Var.h;
                    if (sbpVar12 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar12.z(false);
                } else if (rcpVar instanceof pcp) {
                    sbp sbpVar13 = l47Var.h;
                    if (sbpVar13 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar13.P(R.string.paymentsdk_error, new Integer(((pcp) rcpVar).a));
                } else if (rcpVar instanceof qcp) {
                    l47Var.y().E();
                    e8w e8wVar2 = e8w.a;
                    l47Var.requireActivity().getClass();
                    ((LinearLayout) l47Var.x().a).getClass();
                    wyf.F(l47Var.getLifecycle());
                    e8w.c();
                } else if (rcpVar instanceof ocp) {
                    sbp sbpVar14 = l47Var.h;
                    if (sbpVar14 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ocp ocpVar = (ocp) rcpVar;
                    sbpVar14.O(null, ocpVar.a, ocpVar.b);
                }
                return Unit.a;
        }
    }
}
