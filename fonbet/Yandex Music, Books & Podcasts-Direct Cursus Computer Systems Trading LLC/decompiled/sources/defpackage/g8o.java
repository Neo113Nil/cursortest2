package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg8o;", "Landroidx/fragment/app/o;", "<init>", "()V", "e8o", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class g8o extends o {
    public xdh g;
    public final dyg h = new dyg(26, this);
    public final Handler i = new Handler(Looper.getMainLooper());

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.paymentsdk_fragment_result, viewGroup, false);
        int i = R.id.login_button;
        PaymentButtonView paymentButtonView = (PaymentButtonView) dag.v(R.id.login_button, inflate);
        if (paymentButtonView != null) {
            i = R.id.login_button_hint;
            TextView textView = (TextView) dag.v(R.id.login_button_hint, inflate);
            if (textView != null) {
                i = R.id.progress_result_view;
                ProgressResultView progressResultView = (ProgressResultView) dag.v(R.id.progress_result_view, inflate);
                if (progressResultView != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    this.g = new xdh(linearLayout, paymentButtonView, textView, progressResultView);
                    linearLayout.getClass();
                    return linearLayout;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        this.i.removeCallbacks(this.h);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        xdh xdhVar = this.g;
        if (xdhVar == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) xdhVar.a;
        linearLayout.getClass();
        View findViewById = requireView().getRootView().findViewById(R.id.container_layout);
        findViewById.getClass();
        qdq.a(linearLayout, (ViewGroup) findViewById);
        e8o e8oVar = (e8o) requireArguments().getParcelable("ARG_RESULT");
        int i = e8oVar == null ? -1 : f8o.a[e8oVar.ordinal()];
        dyg dygVar = this.h;
        Handler handler = this.i;
        zdk zdkVar = zdk.b;
        if (i == 1) {
            Bundle requireArguments = requireArguments();
            requireArguments.getClass();
            int i2 = requireArguments.getInt("ARG_TEXT");
            j8o j8oVar = (j8o) requireArguments.getParcelable("ARG_CLOSING");
            boolean C = qdq.C(j8oVar != null ? Boolean.valueOf(j8oVar.a) : null);
            long j = j8oVar != null ? j8oVar.b : -1L;
            boolean z = requireArguments.getBoolean("ARG_IS_LOGGED_IN");
            xdh xdhVar2 = this.g;
            if (xdhVar2 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            ((ProgressResultView) xdhVar2.d).setState(new evm(i2));
            if (z) {
                xdh xdhVar3 = this.g;
                if (xdhVar3 == null) {
                    Intrinsics.j("viewBinding");
                    throw null;
                }
                ((TextView) xdhVar3.c).setVisibility(8);
                xdh xdhVar4 = this.g;
                if (xdhVar4 == null) {
                    Intrinsics.j("viewBinding");
                    throw null;
                }
                PaymentButtonView paymentButtonView = (PaymentButtonView) xdhVar4.b;
                paymentButtonView.setVisibility(C ? 0 : 8);
                Resources.Theme theme = paymentButtonView.getContext().getTheme();
                theme.getClass();
                paymentButtonView.setBackgroundResource(ocg.C(R.attr.paymentsdk_payButtonBackground, theme));
                Resources.Theme theme2 = paymentButtonView.getContext().getTheme();
                theme2.getClass();
                paymentButtonView.setTextAppearance(ocg.C(R.attr.paymentsdk_payButtonTextAppearance, theme2));
                Resources.Theme theme3 = paymentButtonView.getContext().getTheme();
                theme3.getClass();
                paymentButtonView.setTotalTextAppearance(ocg.C(R.attr.paymentsdk_payButtonTotalTextAppearance, theme3));
                Resources.Theme theme4 = paymentButtonView.getContext().getTheme();
                theme4.getClass();
                paymentButtonView.setSubTotalTextAppearance(ocg.C(R.attr.paymentsdk_payButtonSubtotalTextAppearance, theme4));
                String string = getString(R.string.paymentsdk_login_done);
                string.getClass();
                paymentButtonView.t(string, null, null);
                final int i3 = 1;
                paymentButtonView.setOnClickListener(new View.OnClickListener(this) { // from class: d8o
                    public final /* synthetic */ g8o b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i3) {
                            case 0:
                                t requireActivity = this.b.requireActivity();
                                requireActivity.getClass();
                                ((op2) requireActivity).k();
                                break;
                            default:
                                t requireActivity2 = this.b.requireActivity();
                                requireActivity2.getClass();
                                ((op2) requireActivity2).k();
                                break;
                        }
                    }
                });
                paymentButtonView.setState(new dek(zdkVar));
                if (j > 0) {
                    handler.postDelayed(dygVar, j);
                }
            } else {
                e9k b = s9k.b();
                if (b != null) {
                    xdh xdhVar5 = this.g;
                    if (xdhVar5 == null) {
                        Intrinsics.j("viewBinding");
                        throw null;
                    }
                    ((TextView) xdhVar5.c).setVisibility(0);
                    xdh xdhVar6 = this.g;
                    if (xdhVar6 == null) {
                        Intrinsics.j("viewBinding");
                        throw null;
                    }
                    PaymentButtonView paymentButtonView2 = (PaymentButtonView) xdhVar6.b;
                    paymentButtonView2.setVisibility(0);
                    paymentButtonView2.setBackgroundResource(R.drawable.paymentsdk_login_button_bg);
                    paymentButtonView2.setTextAppearance(R.style.PaymentsdkTextAppearance_PayButton_Login);
                    String string2 = getString(R.string.paymentsdk_login);
                    string2.getClass();
                    paymentButtonView2.t(string2, null, null);
                    paymentButtonView2.setOnClickListener(new jl2(2, requireArguments, this, b));
                    paymentButtonView2.setState(new dek(zdkVar));
                }
            }
        } else if (i == 2) {
            Bundle requireArguments2 = requireArguments();
            requireArguments2.getClass();
            int i4 = requireArguments2.getInt("ARG_TEXT");
            String string3 = requireArguments2.getString("ARG_EXTERNAL_TEXT");
            int i5 = requireArguments2.getInt("ARG_SUBTITLE");
            Integer valueOf = i5 != 0 ? Integer.valueOf(i5) : null;
            j8o j8oVar2 = (j8o) requireArguments2.getParcelable("ARG_CLOSING");
            boolean C2 = qdq.C(j8oVar2 != null ? Boolean.valueOf(j8oVar2.a) : null);
            long j2 = j8oVar2 != null ? j8oVar2.b : -1L;
            xdh xdhVar7 = this.g;
            if (xdhVar7 == null) {
                Intrinsics.j("viewBinding");
                throw null;
            }
            ProgressResultView progressResultView = (ProgressResultView) xdhVar7.d;
            if (string3 != null) {
                progressResultView.setState(new bvm(string3));
            } else {
                progressResultView.setState(new cvm(i4, valueOf));
            }
            ((TextView) xdhVar7.c).setVisibility(8);
            PaymentButtonView paymentButtonView3 = (PaymentButtonView) xdhVar7.b;
            paymentButtonView3.setVisibility(C2 ? 0 : 8);
            Resources.Theme theme5 = paymentButtonView3.getContext().getTheme();
            theme5.getClass();
            paymentButtonView3.setBackgroundResource(ocg.C(R.attr.paymentsdk_payButtonBackground, theme5));
            Resources.Theme theme6 = paymentButtonView3.getContext().getTheme();
            theme6.getClass();
            paymentButtonView3.setTextAppearance(ocg.C(R.attr.paymentsdk_payButtonTextAppearance, theme6));
            Resources.Theme theme7 = paymentButtonView3.getContext().getTheme();
            theme7.getClass();
            paymentButtonView3.setTotalTextAppearance(ocg.C(R.attr.paymentsdk_payButtonTotalTextAppearance, theme7));
            Resources.Theme theme8 = paymentButtonView3.getContext().getTheme();
            theme8.getClass();
            paymentButtonView3.setSubTotalTextAppearance(ocg.C(R.attr.paymentsdk_payButtonSubtotalTextAppearance, theme8));
            String string4 = getString(R.string.paymentsdk_login_done);
            string4.getClass();
            paymentButtonView3.t(string4, null, null);
            final int i6 = 0;
            paymentButtonView3.setOnClickListener(new View.OnClickListener(this) { // from class: d8o
                public final /* synthetic */ g8o b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i6) {
                        case 0:
                            t requireActivity = this.b.requireActivity();
                            requireActivity.getClass();
                            ((op2) requireActivity).k();
                            break;
                        default:
                            t requireActivity2 = this.b.requireActivity();
                            requireActivity2.getClass();
                            ((op2) requireActivity2).k();
                            break;
                    }
                }
            });
            paymentButtonView3.setState(new dek(zdkVar));
            if (j2 > 0) {
                handler.postDelayed(dygVar, j2);
            }
        }
        xdh xdhVar8 = this.g;
        if (xdhVar8 == null) {
            Intrinsics.j("viewBinding");
            throw null;
        }
        ProgressResultView progressResultView2 = (ProgressResultView) xdhVar8.d;
        t l = l();
        progressResultView2.setBrandIconVisible(!qdq.B((l instanceof ddu ? (ddu) l : null) != null ? Boolean.valueOf(r6.m()) : null));
    }
}
