package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class t27 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ v27 b;

    public /* synthetic */ t27(v27 v27Var, int i) {
        this.a = i;
        this.b = v27Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        String queryParameter;
        h37 y;
        rn5 rn5Var;
        rfk rfkVar;
        String queryParameter2;
        rfk rfkVar2;
        int i = this.a;
        v27 v27Var = this.b;
        switch (i) {
            case 0:
                vpm vpmVar = (vpm) obj;
                jyr jyrVar = v27Var.k;
                if (vpmVar instanceof rpm) {
                    lom lomVar = v27Var.g;
                    if (lomVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ((qds) jyrVar.getValue()).getClass();
                    lomVar.l(false, new uds(R.string.paymentsdk_loading_title));
                } else if (vpmVar instanceof spm) {
                    lom lomVar2 = v27Var.g;
                    if (lomVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ((qds) jyrVar.getValue()).getClass();
                    lomVar2.l(true, new uds(R.string.paymentsdk_loading_title));
                } else if (vpmVar instanceof tpm) {
                    lom lomVar3 = v27Var.g;
                    if (lomVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    PreselectActivity preselectActivity = lomVar3.a;
                    preselectActivity.p();
                    preselectActivity.r(R.id.loading_fragment_container);
                } else if (vpmVar instanceof upm) {
                    if (v27Var.i) {
                        lom lomVar4 = v27Var.g;
                        if (lomVar4 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        ((qds) jyrVar.getValue()).getClass();
                        lomVar4.l(true, new uds(R.string.paymentsdk_loading_title));
                    }
                    lom lomVar5 = v27Var.g;
                    if (lomVar5 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar5.f(new qdp(((upm) vpmVar).a));
                } else if (vpmVar instanceof qpm) {
                    lom lomVar6 = v27Var.g;
                    if (lomVar6 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar6.e(((qpm) vpmVar).a, 0);
                }
                return Unit.a;
            case 1:
                ppm ppmVar = (ppm) obj;
                if (ppmVar instanceof npm) {
                    lom lomVar7 = v27Var.g;
                    if (lomVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar7.k(((npm) ppmVar).a);
                } else if (ppmVar instanceof opm) {
                    lom lomVar8 = v27Var.g;
                    if (lomVar8 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    lomVar8.a.T(new uds(R.string.paymentsdk_error), new Integer(((opm) ppmVar).a));
                } else if (ppmVar instanceof mpm) {
                    if (v27Var.g == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    rfk rfkVar3 = ((mpm) ppmVar).a;
                    rfkVar3.getClass();
                    cfk.e.a(rfkVar3);
                }
                return Unit.a;
            case 2:
                tv8 tv8Var = (tv8) obj;
                List<Pair> list = tv8Var.c;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (Pair pair : list) {
                    if (Intrinsics.d(pair.a, "select_method_screen_selected_method")) {
                        Object obj2 = pair.a;
                        rn5 rn5Var2 = v27Var.r;
                        if (rn5Var2 == null) {
                            Intrinsics.j("mediator");
                            throw null;
                        }
                        pair = new Pair(obj2, String.valueOf(rn5Var2.I()));
                    }
                    arrayList.add(pair);
                }
                tv8 a = tv8.a(tv8Var, arrayList);
                qc9 qc9Var = v27Var.o;
                if (qc9Var == null) {
                    Intrinsics.j("parsingEnvironment");
                    throw null;
                }
                qc9Var.e(a.a);
                int i2 = rv8.i;
                qc9 qc9Var2 = v27Var.o;
                if (qc9Var2 == null) {
                    Intrinsics.j("parsingEnvironment");
                    throw null;
                }
                rv8 y2 = fgq.y(qc9Var2, a.b);
                gc8 gc8Var = v27Var.j;
                if (gc8Var == null || !Intrinsics.d(gc8Var.getParent(), (LinearLayout) v27Var.x().c)) {
                    gc8 gc8Var2 = new gc8((vb8) v27Var.s.getValue(), null, 0, 6, null);
                    gc8Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    gc8Var2.setId(View.generateViewId());
                    v27Var.j = gc8Var2;
                }
                if (((LinearLayout) v27Var.x().c).getChildCount() == 0) {
                    ((LinearLayout) v27Var.x().c).addView(v27Var.j);
                }
                g0c g0cVar = v27Var.q;
                if (g0cVar == null) {
                    Intrinsics.j("eventReporter");
                    throw null;
                }
                ((x60) g0cVar).a(gut.m1(d0n.DK_PRESELECT));
                gc8 gc8Var3 = v27Var.j;
                if (gc8Var3 != null) {
                    gc8Var3.M(y2, new dw8(y2.b));
                }
                gc8 gc8Var4 = v27Var.j;
                if (gc8Var4 != null) {
                    gc8Var4.post(new jt6(11, a, v27Var));
                }
                lom lomVar9 = v27Var.g;
                if (lomVar9 == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                PreselectActivity preselectActivity2 = lomVar9.a;
                preselectActivity2.p();
                preselectActivity2.r(R.id.loading_fragment_container);
                return Unit.a;
            case 3:
                int ordinal = ((q5m) obj).ordinal();
                if (ordinal == 1) {
                    lom lomVar10 = v27Var.g;
                    if (lomVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ((qds) v27Var.k.getValue()).getClass();
                    lomVar10.l(true, new uds(R.string.paymentsdk_loading_title));
                } else if (ordinal == 2) {
                    lom lomVar11 = v27Var.g;
                    if (lomVar11 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    PreselectActivity preselectActivity3 = lomVar11.a;
                    preselectActivity3.p();
                    preselectActivity3.r(R.id.loading_fragment_container);
                }
                return Unit.a;
            default:
                Uri uri = (Uri) obj;
                String uri2 = uri.toString();
                uri2.getClass();
                Integer intOrNull = StringsKt.toIntOrNull(StringsKt.k0(uri2, "select_method_screen_selected_method&value=", uri2));
                if (intOrNull != null) {
                    int intValue = intOrNull.intValue();
                    h37 y3 = v27Var.y();
                    rn5 rn5Var3 = y3.q;
                    if (rn5Var3 != null) {
                        rn5Var3.t(intValue);
                    }
                    rn5 rn5Var4 = y3.q;
                    if (rn5Var4 != null && (rfkVar2 = (rfk) rn5Var4.h) != null) {
                        g0c g0cVar2 = y3.l;
                        qne G = h37.G(rfkVar2, true);
                        x60 x60Var = (x60) g0cVar2;
                        x60Var.getClass();
                        x60Var.a(G);
                    }
                }
                String host = uri.getHost();
                if (host != null) {
                    switch (host.hashCode()) {
                        case 3015911:
                            if (host.equals("back")) {
                                v27Var.requireActivity().onBackPressed();
                                break;
                            }
                            break;
                        case 47329499:
                            if (host.equals("bind_card_click")) {
                                g0c g0cVar3 = v27Var.y().l;
                                qne j1 = gut.j1(yfk.NEW_CARD, true);
                                x60 x60Var2 = (x60) g0cVar3;
                                x60Var2.getClass();
                                x60Var2.a(j1);
                                lom lomVar12 = v27Var.g;
                                if (lomVar12 == null) {
                                    Intrinsics.j("callbacks");
                                    throw null;
                                }
                                lomVar12.k(true);
                                break;
                            }
                            break;
                        case 1115503494:
                            if (host.equals("click_on_promo")) {
                                g0c g0cVar4 = v27Var.y().l;
                                qne t0 = gut.t0();
                                x60 x60Var3 = (x60) g0cVar4;
                                x60Var3.getClass();
                                x60Var3.a(t0);
                                e8w e8wVar = e8w.a;
                                v27Var.requireActivity().getClass();
                                ((LinearLayout) v27Var.x().b).getClass();
                                wyf.F(v27Var.getLifecycle());
                                e8w.c();
                                break;
                            }
                            break;
                        case 1126556261:
                            if (host.equals("show_toast") && (queryParameter = uri.getQueryParameter(Constants.KEY_MESSAGE)) != null) {
                                lom lomVar13 = v27Var.g;
                                if (lomVar13 == null) {
                                    Intrinsics.j("callbacks");
                                    throw null;
                                }
                                lomVar13.a.S(queryParameter);
                                break;
                            }
                            break;
                        case 1284156530:
                            if (host.equals("pay_button_click") && (rn5Var = (y = v27Var.y()).q) != null && (rfkVar = (rfk) rn5Var.h) != null) {
                                xdr xdrVar = y.t;
                                upm upmVar = new upm(rfkVar);
                                xdrVar.getClass();
                                xdrVar.m(null, upmVar);
                                break;
                            }
                            break;
                        case 1546100943:
                            if (host.equals("open_link") && (queryParameter2 = uri.getQueryParameter("url")) != null) {
                                try {
                                    try {
                                        new z0j(6).w().p(v27Var.requireContext(), Uri.parse(queryParameter2));
                                        break;
                                    } catch (ActivityNotFoundException unused) {
                                        break;
                                    }
                                } catch (Exception unused2) {
                                    v27Var.requireContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(queryParameter2)));
                                    break;
                                }
                            }
                            break;
                    }
                }
                return Unit.a;
        }
    }
}
