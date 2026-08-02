package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Leyf;", "Landroidx/fragment/app/o;", "Lyxf;", "<init>", "()V", "ayf", "byf", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class eyf extends o implements yxf {
    public gs4 g;
    public xxf h;
    public final ybf i = new ybf(ern.a(u8q.class), new dyf(this, 2), new dyf(this, 4), new dyf(this, 3));

    @Override // defpackage.yxf
    public final void n(xxf xxfVar) {
        xxfVar.getClass();
        this.h = xxfVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_license, viewGroup, false);
        int i = R.id.header_view;
        HeaderView headerView = (HeaderView) dag.v(R.id.header_view, inflate);
        if (headerView != null) {
            i = R.id.license_close_button;
            PaymentButtonView paymentButtonView = (PaymentButtonView) dag.v(R.id.license_close_button, inflate);
            if (paymentButtonView != null) {
                i = R.id.license_link;
                TextView textView = (TextView) dag.v(R.id.license_link, inflate);
                if (textView != null) {
                    i = R.id.merchant_info;
                    TextView textView2 = (TextView) dag.v(R.id.merchant_info, inflate);
                    if (textView2 != null) {
                        i = R.id.scroll_view;
                        if (((ScrollView) dag.v(R.id.scroll_view, inflate)) != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            this.g = new gs4(linearLayout, headerView, paymentButtonView, textView, textView2);
                            return linearLayout;
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A;
        view.getClass();
        gs4 gs4Var = this.g;
        if (gs4Var == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) gs4Var.a;
        linearLayout.getClass();
        View findViewById = requireView().getRootView().findViewById(R.id.container_layout);
        findViewById.getClass();
        qdq.a(linearLayout, (ViewGroup) findViewById);
        xxf xxfVar = this.h;
        if (xxfVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        xxfVar.d();
        xxf xxfVar2 = this.h;
        if (xxfVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        final int i = 0;
        xxfVar2.n(false);
        gs4 gs4Var2 = this.g;
        if (gs4Var2 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        ((PaymentButtonView) gs4Var2.c).setState(new dek(zdk.b));
        gs4 gs4Var3 = this.g;
        if (gs4Var3 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        PaymentButtonView paymentButtonView = (PaymentButtonView) gs4Var3.c;
        String string = getString(R.string.paymentsdk_close);
        string.getClass();
        paymentButtonView.t(string, null, null);
        gs4 gs4Var4 = this.g;
        if (gs4Var4 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        HeaderView.u((HeaderView) gs4Var4.b);
        gs4 gs4Var5 = this.g;
        if (gs4Var5 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        ((HeaderView) gs4Var5.b).setTitleText(null);
        gs4 gs4Var6 = this.g;
        if (gs4Var6 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        HeaderView headerView = (HeaderView) gs4Var6.b;
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        final int i2 = 1;
        if (qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null)) {
            A = false;
        } else {
            Resources.Theme theme = view.getContext().getTheme();
            theme.getClass();
            A = ocg.A(theme, R.attr.paymentsdk_selectShowBrandIcon, true);
        }
        headerView.setBrandIconVisible(A);
        byf byfVar = (byf) requireArguments().getParcelable("ARG_TYPE");
        if (byfVar == null) {
            xq0.q("LicenseFragment should be provided with LicenseType");
            return;
        }
        int ordinal = byfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            gs4 gs4Var7 = this.g;
            if (gs4Var7 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            ((TextView) gs4Var7.e).setVisibility(8);
            gs4 gs4Var8 = this.g;
            if (gs4Var8 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            ((TextView) gs4Var8.d).setText(getString(R.string.paymentsdk_license_agreement_sbp));
            gs4 gs4Var9 = this.g;
            if (gs4Var9 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            TextView textView = (TextView) gs4Var9.d;
            t l2 = l();
            ddu dduVar2 = l2 instanceof ddu ? (ddu) l2 : null;
            textView.setVisibility(qdq.B(dduVar2 != null ? Boolean.valueOf(dduVar2.m()) : null) ? 8 : 0);
            gs4 gs4Var10 = this.g;
            if (gs4Var10 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            ((PaymentButtonView) gs4Var10.c).setOnClickListener(new View.OnClickListener(this) { // from class: zxf
                public final /* synthetic */ eyf b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            eyf eyfVar = this.b;
                            g0c c = ((p77) ((rsd) qld.y(eyfVar)).a().b(p77.class)).c();
                            qne g0 = gut.g0();
                            x60 x60Var = (x60) c;
                            x60Var.getClass();
                            x60Var.a(g0);
                            ((u8q) eyfVar.i.getValue()).l.l(nxi.c);
                            break;
                        default:
                            eyf eyfVar2 = this.b;
                            g0c c2 = ((p77) ((rsd) qld.y(eyfVar2)).a().b(p77.class)).c();
                            qne g02 = gut.g0();
                            x60 x60Var2 = (x60) c2;
                            x60Var2.getClass();
                            x60Var2.a(g02);
                            eyfVar2.requireActivity().onBackPressed();
                            break;
                    }
                }
            });
            gs4 gs4Var11 = this.g;
            if (gs4Var11 != null) {
                ((HeaderView) gs4Var11.b).v(new dyf(this, 0), true);
                return;
            } else {
                Intrinsics.j("viewBinding");
                throw null;
            }
        }
        tyh tyhVar = (tyh) requireArguments().getParcelable("ARG_MERCHANT_INFO");
        gs4 gs4Var12 = this.g;
        if (tyhVar != null) {
            String str = tyhVar.b;
            String str2 = tyhVar.c;
            String str3 = tyhVar.a;
            if (gs4Var12 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            TextView textView2 = (TextView) gs4Var12.e;
            StringBuilder sb = new StringBuilder();
            if (!StringsKt.U(str3)) {
                sb.append(getString(R.string.paymentsdk_license_agreement_name, str3));
                sb.append(StringUtil.LF);
            }
            if (!StringsKt.U(str2)) {
                sb.append(getString(R.string.paymentsdk_license_agreement_ogrn, str2));
                sb.append(StringUtil.LF);
            }
            if (!StringsKt.U(str)) {
                sb.append(getString(R.string.paymentsdk_license_agreement_schedule, str));
                sb.append(StringUtil.LF);
            }
            ryh ryhVar = tyhVar.d;
            if (ryhVar != null) {
                sb.append(getString(R.string.paymentsdk_license_agreement_address, ryhVar.a, ryhVar.b, ryhVar.c, ryhVar.d, ryhVar.e));
            }
            textView2.setText(sb);
        } else {
            if (gs4Var12 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            ((TextView) gs4Var12.e).setVisibility(8);
        }
        String string2 = getString(R.string.paymentsdk_license_agreement_kassa);
        string2.getClass();
        String string3 = getString(R.string.paymentsdk_license_agreement_terms_of_use);
        string3.getClass();
        int T = StringsKt.T(string2, string3, 0, false, 6);
        int length = string3.length() + T;
        String string4 = getString(R.string.paymentsdk_license_agreement_privacy_policy);
        string4.getClass();
        int T2 = StringsKt.T(string2, string4, 0, false, 6);
        int length2 = string4.length() + T2;
        gs4 gs4Var13 = this.g;
        if (gs4Var13 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        ((TextView) gs4Var13.d).setMovementMethod(new LinkMovementMethod());
        gs4 gs4Var14 = this.g;
        if (gs4Var14 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        TextView textView3 = (TextView) gs4Var14.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        String string5 = requireArguments().getString("ARG_ACQUIRER");
        string5.getClass();
        if (cyf.a[id.valueOf(string5).ordinal()] == 1) {
            spannableStringBuilder.setSpan(new ayf(this, "https://yandex.ru/legal/payer_termsofuse"), T, length, 17);
        } else {
            spannableStringBuilder.setSpan(new ayf(this, "https://yandex.ru/legal/pay_termsofuse"), T, length, 17);
        }
        spannableStringBuilder.setSpan(new ayf(this, "https://yandex.ru/legal/confidential"), T2, length2, 17);
        textView3.setText(spannableStringBuilder);
        gs4 gs4Var15 = this.g;
        if (gs4Var15 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        ((PaymentButtonView) gs4Var15.c).setOnClickListener(new View.OnClickListener(this) { // from class: zxf
            public final /* synthetic */ eyf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        eyf eyfVar = this.b;
                        g0c c = ((p77) ((rsd) qld.y(eyfVar)).a().b(p77.class)).c();
                        qne g0 = gut.g0();
                        x60 x60Var = (x60) c;
                        x60Var.getClass();
                        x60Var.a(g0);
                        ((u8q) eyfVar.i.getValue()).l.l(nxi.c);
                        break;
                    default:
                        eyf eyfVar2 = this.b;
                        g0c c2 = ((p77) ((rsd) qld.y(eyfVar2)).a().b(p77.class)).c();
                        qne g02 = gut.g0();
                        x60 x60Var2 = (x60) c2;
                        x60Var2.getClass();
                        x60Var2.a(g02);
                        eyfVar2.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        gs4 gs4Var16 = this.g;
        if (gs4Var16 != null) {
            ((HeaderView) gs4Var16.b).v(new dyf(this, 1), true);
        } else {
            Intrinsics.j("viewBinding");
            throw null;
        }
    }
}
