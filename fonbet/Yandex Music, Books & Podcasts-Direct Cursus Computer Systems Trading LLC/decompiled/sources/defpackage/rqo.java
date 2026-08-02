package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class rqo extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sqo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqo(sqo sqoVar, int i) {
        super(1);
        this.r = i;
        this.s = sqoVar;
    }

    /* JADX WARN: Type inference failed for: r2v40, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EditText editText;
        adu aduVar;
        switch (this.r) {
            case 0:
                View view = (View) obj;
                view.getClass();
                if (view.getVisibility() == 0) {
                    rro rroVar = this.s.i;
                    if (rroVar == null) {
                        Intrinsics.j("viewModel");
                        throw null;
                    }
                    g0c g0cVar = rroVar.q;
                    String str = rroVar.w;
                    if (str == null) {
                        str = "";
                    }
                    qne g1 = gut.g1(str);
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(g1);
                }
                return Unit.a;
            case 1:
                pro proVar = (pro) obj;
                sqo sqoVar = this.s;
                proVar.getClass();
                tqo tqoVar = (tqo) sqoVar.x();
                boolean z = proVar instanceof mro;
                if (z) {
                    mro mroVar = (mro) proVar;
                    wqo c = ((tqo) sqoVar.x()).c();
                    TextView o0 = c.o0();
                    boolean z2 = mroVar.b;
                    o0.setVisibility(z2 ? 0 : 8);
                    c.F().setBackgroundResource(z2 ? R.drawable.paymentsdk_bg_enabled_button : R.drawable.paymentsdk_bg_disabled_button);
                    Resources.Theme theme = sqoVar.requireContext().getTheme();
                    theme.getClass();
                    c.F().setTextColor(ocg.B(z2 ? R.attr.paymentsdk_alternativePrimaryTextColor : android.R.attr.textColorPrimary, theme));
                    qdq.g(c.o(), mroVar.c);
                    c.w().setText(mroVar.a);
                } else if (proVar instanceof lro) {
                    lro lroVar = (lro) proVar;
                    nqo b = ((tqo) sqoVar.x()).b();
                    bfk bfkVar = lroVar.a;
                    if (bfkVar.a == zek.x) {
                        ImageView p0 = b.p0();
                        Resources.Theme theme2 = b.p0().getContext().getTheme();
                        theme2.getClass();
                        TypedValue z3 = ocg.z(R.attr.paymentsdk_warning_icon, theme2);
                        p0.setImageResource(z3 != null ? z3.resourceId : 2131232485);
                        b.R().setText(lroVar.b);
                        b.m0().setText(lroVar.c);
                    } else {
                        sbp sbpVar = sqoVar.j;
                        if (sbpVar == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar.r(bfkVar);
                    }
                } else if (proVar instanceof jro) {
                    g0c y = sqoVar.y();
                    qne m1 = gut.m1(d0n.SELECT_BANK);
                    x60 x60Var2 = (x60) y;
                    x60Var2.getClass();
                    x60Var2.a(m1);
                    jro jroVar = (jro) proVar;
                    kqo a = ((tqo) sqoVar.x()).a();
                    a.t0().setVisibility(!jroVar.c ? 0 : 8);
                    a.o().setVisibility(!jroVar.c ? 0 : 8);
                    if (!jroVar.c && (editText = a.t0().getEditText()) != null) {
                        editText.setText((CharSequence) null);
                    }
                    if (jroVar.b) {
                        sbp sbpVar2 = sqoVar.j;
                        if (sbpVar2 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        TextView textView = (TextView) sbpVar2.d.invoke();
                        String string = textView.getContext().getString(R.string.paymentsdk_license_agreement_preview_on_terms);
                        string.getClass();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) textView.getContext().getString(R.string.paymentsdk_license_agreement_preview_yandex_bank));
                        spannableStringBuilder.append((CharSequence) StringUtil.SPACE);
                        UnderlineSpan underlineSpan = new UnderlineSpan();
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append(string.subSequence(0, string.length()));
                        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
                        textView.setText(spannableStringBuilder);
                        textView.setOnClickListener(new xal(7, sbpVar2));
                        sbpVar2.n(!sbpVar2.M());
                    }
                    ol2 ol2Var = sqoVar.k;
                    if (ol2Var == null) {
                        Intrinsics.j("banksAdapter");
                        throw null;
                    }
                    List list = jroVar.a;
                    boolean z4 = jroVar.c;
                    list.getClass();
                    ol2Var.f = list;
                    ol2Var.g = list;
                    ol2Var.h = 0;
                    ol2Var.i = z4;
                    il2 il2Var = ol2Var.e;
                    il2Var.filter(null);
                    il2Var.a = true;
                    ol2Var.l = true;
                    ol2Var.g();
                } else if (proVar instanceof oro) {
                    ((u8q) sqoVar.h.getValue()).G();
                    sbp sbpVar3 = sqoVar.j;
                    if (sbpVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar3.L(R.string.paymentsdk_success_title);
                } else if (proVar instanceof kro) {
                    sbp sbpVar4 = sqoVar.j;
                    if (sbpVar4 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar4.p(((kro) proVar).a);
                } else if (!(proVar instanceof nro)) {
                    b6e.s();
                    return null;
                }
                switch (tqoVar.a) {
                    case 0:
                        aduVar = (g8c) tqoVar.g;
                        break;
                    default:
                        aduVar = (qzc) tqoVar.f;
                        break;
                }
                View root = aduVar.getRoot();
                root.getClass();
                root.setVisibility(proVar instanceof nro ? 0 : 8);
                View root2 = tqoVar.c().getRoot();
                root2.getClass();
                root2.setVisibility(z ? 0 : 8);
                View root3 = tqoVar.a().getRoot();
                root3.getClass();
                root3.setVisibility(proVar instanceof jro ? 0 : 8);
                View root4 = tqoVar.b().getRoot();
                root4.getClass();
                root4.setVisibility(proVar instanceof lro ? 0 : 8);
                View root5 = ((tqo) sqoVar.x()).getRoot();
                root5.getClass();
                View findViewById = sqoVar.requireView().getRootView().findViewById(R.id.container_layout);
                findViewById.getClass();
                qdq.b((ViewGroup) root5, (ViewGroup) findViewById);
                return Unit.a;
            default:
                iro iroVar = (iro) obj;
                sqo sqoVar2 = this.s;
                iroVar.getClass();
                sbp sbpVar5 = sqoVar2.j;
                if (sbpVar5 == null) {
                    Intrinsics.j("callbacks");
                    throw null;
                }
                Intent intent = iroVar.a;
                String str2 = iroVar.c;
                boolean K = sbpVar5.K(intent);
                if (K) {
                    g0c y2 = sqoVar2.y();
                    qne W0 = gut.W0(str2, iroVar.b);
                    x60 x60Var3 = (x60) y2;
                    x60Var3.getClass();
                    x60Var3.a(W0);
                } else {
                    g0c y3 = sqoVar2.y();
                    qne d1 = gut.d1(str2);
                    x60 x60Var4 = (x60) y3;
                    x60Var4.getClass();
                    x60Var4.a(d1);
                }
                rro rroVar2 = sqoVar2.i;
                if (rroVar2 == null) {
                    Intrinsics.j("viewModel");
                    throw null;
                }
                if (K) {
                    rroVar2.K(new mro(R.string.paymentsdk_sbp_payment_waiting_title, true, Integer.valueOf(R.string.paymentsdk_sbp_waiting_info)));
                    ((fjs) rroVar2.u.getValue()).c(5L, new qro(rroVar2, 0));
                } else {
                    rroVar2.K(new lro(new bfk(zek.x, afk.d, null, null, "Error starting bank app", null), R.string.paymentsdk_sbp_payment_bank_not_open_title, R.string.paymentsdk_sbp_payment_bank_not_open_description));
                }
                return Unit.a;
        }
    }
}
