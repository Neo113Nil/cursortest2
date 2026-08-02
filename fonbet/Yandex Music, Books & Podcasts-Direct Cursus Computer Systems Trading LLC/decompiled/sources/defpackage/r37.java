package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.t;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class r37 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ t37 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r37(t37 t37Var, int i) {
        super(1);
        this.r = i;
        this.s = t37Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r5 = r3.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        r5.N("select_bank_screen_last_bank_name", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        r2 = r3.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r2.N("select_bank_screen_bank_name_filter", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r1 = r3.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r1 = (androidx.recyclerview.widget.RecyclerView) r1.findViewById(ru.yandex.music.R.id.banks_recycler_view);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        r1.z0(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r5 == null) goto L28;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        gc8 gc8Var;
        bz9 h;
        uds udsVar;
        uds udsVar2;
        Integer num;
        Object obj2;
        int i = this.r;
        str = "";
        t37 t37Var = this.s;
        int i2 = 0;
        String str2 = null;
        int i3 = 1;
        switch (i) {
            case 0:
                d47 d47Var = (d47) obj;
                jyr jyrVar = t37Var.j;
                d47Var.getClass();
                qdc qdcVar = t37Var.h;
                if (qdcVar == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                if (qdcVar == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) qdcVar.b;
                constraintLayout.getClass();
                View findViewById = t37Var.requireView().getRootView().findViewById(R.id.mainContainer);
                findViewById.getClass();
                qdq.b(constraintLayout, (ViewGroup) findViewById);
                qdc qdcVar2 = t37Var.h;
                if (qdcVar2 == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                if (d47Var instanceof y37) {
                    g47 x = t37Var.x();
                    g0c g0cVar = x.r;
                    String str3 = x.x;
                    qne g1 = gut.g1(str3 != null ? str3 : "");
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(g1);
                    y37 y37Var = (y37) d47Var;
                    boolean z = y37Var.b;
                    uds udsVar3 = new uds(y37Var.a);
                    uds udsVar4 = (!z || (num = y37Var.c) == null) ? null : new uds(num.intValue());
                    if (z) {
                        ((k1o) jyrVar.getValue()).getClass();
                        udsVar2 = new uds(R.string.paymentsdk_sbp_open_payment);
                    } else {
                        udsVar2 = null;
                    }
                    l37 l37Var = new l37();
                    l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new s9o("loading", true, false, udsVar3, udsVar4, null, udsVar2, null, j9o.a))));
                    l37.x(l37Var, null, new ej6(0, t37Var.x(), g47.class, "retryOpenBankApp", "retryOpenBankApp()V", 0, 12), new q37(t37Var, 2), 1);
                    sbp sbpVar = t37Var.g;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar.J(l37Var);
                } else if (d47Var instanceof x37) {
                    x37 x37Var = (x37) d47Var;
                    bfk bfkVar = x37Var.a;
                    boolean z2 = x37Var.d;
                    uds udsVar5 = new uds(x37Var.b);
                    if (z2) {
                        ((k1o) jyrVar.getValue()).getClass();
                        udsVar = new uds(R.string.paymentsdk_sbp_another_bank);
                    } else {
                        ((k1o) jyrVar.getValue()).getClass();
                        udsVar = new uds(R.string.paymentsdk_close);
                    }
                    uds udsVar6 = udsVar;
                    uds udsVar7 = new uds(x37Var.c);
                    h9o h9oVar = new h9o(bfkVar);
                    l37 l37Var2 = new l37();
                    l37Var2.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, udsVar5, udsVar7, udsVar6, null, null, -1L, null, h9oVar))));
                    l37.x(l37Var2, new ej6(0, t37Var.x(), g47.class, "chooseAnotherBank", "chooseAnotherBank()V", 0, 13), new ej6(0, t37Var.x(), g47.class, "retryOpenBankApp", "retryOpenBankApp()V", 0, 14), null, 4);
                    if (z2) {
                        sbp sbpVar2 = t37Var.g;
                        if (sbpVar2 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar2.J(l37Var2);
                    } else if (bfkVar != null) {
                        sbp sbpVar3 = t37Var.g;
                        if (sbpVar3 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar3.r(bfkVar);
                    }
                } else if (d47Var instanceof w37) {
                    sbp sbpVar4 = t37Var.g;
                    if (sbpVar4 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar4.l();
                    rdk rdkVar = t37Var.r;
                    if (rdkVar == null) {
                        Intrinsics.j("sbpDivKitConfiguration");
                        throw null;
                    }
                    dzf viewLifecycleOwner = t37Var.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    sbp sbpVar5 = t37Var.g;
                    if (sbpVar5 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    boolean M = sbpVar5.M();
                    t tVar = (t) rdkVar.d;
                    Context context = (Context) rdkVar.b;
                    ct8 ct8Var = new ct8(new wbp(context, M));
                    ct8Var.b = (yf8) ((jyr) rdkVar.c).getValue();
                    ct8Var.b(new os8());
                    ct8Var.b(new uqm(1));
                    ct8Var.f = new vqo((ahu) rdkVar.f);
                    ct8Var.b(new uqm(0));
                    ct8Var.j = (bz9) rdkVar.g;
                    ct8Var.h = new fa8(context, 1);
                    ct8Var.p = true;
                    ct8Var.q = false;
                    t37Var.l = new vb8(tVar, ct8Var.a(), viewLifecycleOwner);
                    Resources.Theme theme = t37Var.requireContext().getTheme();
                    theme.getClass();
                    boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
                    vb8 vb8Var = t37Var.l;
                    if (vb8Var != null && (h = vb8Var.b.h()) != null) {
                        h.f(new axt("isLightTheme", E));
                    }
                    rv8 rv8Var = ((w37) d47Var).a.a;
                    vb8 vb8Var2 = t37Var.l;
                    if (vb8Var2 != null) {
                        gc8Var = new gc8(vb8Var2, null, 0, 6, null);
                        gc8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        gc8Var.M(rv8Var, new dw8(gc8Var.getLogId()));
                        gc8Var.setId(View.generateViewId());
                    } else {
                        gc8Var = null;
                    }
                    t37Var.k = gc8Var;
                    ((LinearLayout) qdcVar2.c).addView(gc8Var);
                    gc8 gc8Var2 = t37Var.k;
                    if (gc8Var2 != null) {
                        gc8Var2.post(new o37(d47Var, t37Var, E, i2));
                    }
                    g0c g0cVar2 = t37Var.o;
                    if (g0cVar2 == null) {
                        Intrinsics.j("eventReporter");
                        throw null;
                    }
                    ((x60) g0cVar2).a(gut.m1(d0n.DK_SELECT_BANK));
                } else if (d47Var instanceof c47) {
                    ((tu2) t37Var.i.getValue()).G();
                    sbp sbpVar6 = t37Var.g;
                    if (sbpVar6 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar6.L(((c47) d47Var).a);
                } else if (d47Var instanceof z37) {
                    z37 z37Var = (z37) d47Var;
                    sbp sbpVar7 = t37Var.g;
                    if (sbpVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    Intent intent = z37Var.a;
                    String str4 = z37Var.b;
                    boolean K = sbpVar7.K(intent);
                    g0c g0cVar3 = t37Var.o;
                    if (K) {
                        if (g0cVar3 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        ((x60) g0cVar3).a(gut.W0(str4, z37Var.c));
                    } else {
                        if (g0cVar3 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        ((x60) g0cVar3).a(gut.d1(str4));
                    }
                    g47 x2 = t37Var.x();
                    k1o k1oVar = x2.q;
                    if (K) {
                        k1oVar.getClass();
                        x2.K(new y37(R.string.paymentsdk_sbp_payment_waiting_title, 4));
                        x2.L();
                    } else if (!(x2.n instanceof xqo)) {
                        bfk bfkVar2 = new bfk(zek.x, afk.d, null, null, "Error starting bank app", null);
                        k1oVar.getClass();
                        x2.K(new x37(bfkVar2, R.string.paymentsdk_sbp_payment_bank_not_open_title, R.string.paymentsdk_sbp_payment_bank_not_open_description, true));
                        ((tdk) ((sdk) x2.k.b)).h.c();
                    }
                } else if (d47Var instanceof b47) {
                    sbp sbpVar8 = t37Var.g;
                    if (sbpVar8 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar8.l();
                } else if (d47Var instanceof v37) {
                    sbp sbpVar9 = t37Var.g;
                    if (sbpVar9 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar9.p(((v37) d47Var).a);
                } else {
                    if (!d47Var.equals(a47.a)) {
                        b6e.s();
                        return null;
                    }
                    sbp sbpVar10 = t37Var.g;
                    if (sbpVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar10.E(true, new uds(R.string.paymentsdk_loading_title));
                }
                return Unit.a;
            case 1:
                String str5 = (String) obj;
                str5.getClass();
                g47 x3 = t37Var.x();
                boolean U = StringsKt.U(str5);
                List list = x3.u;
                if (!U) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (StringsKt.M(((zl2) obj2).a, str5, true)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    zl2 zl2Var = (zl2) obj2;
                    if (zl2Var != null) {
                        str2 = zl2Var.a;
                        break;
                    }
                } else {
                    zl2 zl2Var2 = (zl2) CollectionsKt.Z(list);
                    if (zl2Var2 != null) {
                        str2 = zl2Var2.a;
                        break;
                    }
                }
                break;
            default:
                View view = (View) obj;
                view.getClass();
                if (view instanceof u37) {
                    u37 u37Var = (u37) view;
                    TextInputEditText textInputEditText = (TextInputEditText) u37Var.a.b;
                    textInputEditText.requestFocus();
                    vwb.W(textInputEditText);
                    u37Var.setOnTextChangeListener(new r37(t37Var, i3));
                }
                return Unit.a;
        }
    }
}
