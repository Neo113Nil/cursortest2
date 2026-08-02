package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.EmailView;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lc3j;", "Ledu;", "Lshk;", "La13;", "<init>", "()V", "sbp", "d27", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class c3j extends edu<shk> implements a13 {
    public boolean l;
    public boolean m;
    public wgk o;
    public boolean p;
    public boolean q;
    public sbp r;
    public e3j s;
    public final ybf h = new ybf(ern.a(u8q.class), new z2j(this, 5), new z2j(this, 7), new z2j(this, 6));
    public final osh i = new osh(nw3.b);
    public final jyr j = btf.b(new z2j(this, 1));
    public final jyr k = btf.b(new z2j(this, 0));
    public pmk n = new pmk(false, lmk.e);

    public final void A() {
        g0c z = z();
        qne q = gut.q();
        x60 x60Var = (x60) z;
        x60Var.getClass();
        x60Var.a(q);
        requireActivity().onBackPressed();
    }

    public final void B(boolean z) {
        sbp sbpVar = this.r;
        if (z) {
            if (sbpVar == null) {
                Intrinsics.j("callbacks");
                throw null;
            }
            String string = getString(R.string.paymentsdk_bind_card_next_button);
            string.getClass();
            sbpVar.v(string, null, null);
            return;
        }
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        String string2 = getString(R.string.paymentsdk_pay_title);
        string2.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        wgk wgkVar = this.o;
        if (wgkVar != null) {
            sbpVar.v(string2, irf.J(requireContext, wgkVar, z()), null);
        } else {
            Intrinsics.j("paymentSettings");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        y(configuration);
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        this.l = requireArguments.getBoolean("ARG_IS_BACK_BUTTON_ENABLED");
        this.m = requireArguments.getBoolean("ARG_SHOULD_SHOW_SAVE_CARD");
        pmk pmkVar = (pmk) requireArguments.getParcelable("ARG_PERSONAL_INFO_VISIBILITY");
        if (pmkVar != null) {
            this.n = pmkVar;
        }
        Parcelable parcelable = requireArguments.getParcelable("ARG_PAYMENT_SETTINGS");
        parcelable.getClass();
        this.o = (wgk) parcelable;
        this.p = requireArguments.getBoolean("ARG_SHOW_CHARITY_LABEL");
        z2j z2jVar = new z2j(this, 2);
        sbp sbpVar = this.r;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        d27 d27Var = new d27(z2jVar, sbpVar.b.g(), (j3j) this.j.getValue(), this.i);
        jfu viewModelStore = getViewModelStore();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, d27Var, defaultViewModelCreationExtras);
        lm4 a = ern.a(e3j.class);
        String f = a.f();
        if (f != null) {
            this.s = (e3j) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        } else {
            xq0.x("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        shk a = shk.a(layoutInflater, viewGroup);
        this.g = a;
        LinearLayout linearLayout = a.a;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // defpackage.edu, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        this.i.V(null);
    }

    @Override // androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        if (this.q) {
            this.q = false;
            ow3 ow3Var = (ow3) this.i.b;
            if (ow3Var != null) {
                ow3Var.j();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v58, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A;
        view.getClass();
        int i = 3;
        final int i2 = 0;
        final int i3 = 1;
        if (!this.l || getParentFragmentManager().H() <= 1) {
            Resources.Theme theme = view.getContext().getTheme();
            theme.getClass();
            if (ocg.A(theme, R.attr.paymentsdk_bindShowCloseButton, false)) {
                ((shk) x()).e.v(new z2j(this, i), true);
            } else {
                ((shk) x()).e.v(grb.y, false);
            }
            ((shk) x()).g.setVisibility(8);
        } else if (this.n.d()) {
            ((shk) x()).i.setVisibility(0);
            ((shk) x()).i.setOnClickListener(new View.OnClickListener(this) { // from class: w2j
                public final /* synthetic */ c3j b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            this.b.A();
                            break;
                        default:
                            this.b.A();
                            break;
                    }
                }
            });
        } else {
            ((shk) x()).g.setVisibility(0);
            ((shk) x()).g.setOnClickListener(new View.OnClickListener(this) { // from class: w2j
                public final /* synthetic */ c3j b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            this.b.A();
                            break;
                        default:
                            this.b.A();
                            break;
                    }
                }
            });
        }
        Configuration configuration = getResources().getConfiguration();
        configuration.getClass();
        y(configuration);
        HeaderView headerView = ((shk) x()).e;
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        if (qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null)) {
            A = false;
        } else {
            Resources.Theme theme2 = view.getContext().getTheme();
            theme2.getClass();
            A = ocg.A(theme2, R.attr.paymentsdk_selectShowBrandIcon, true);
        }
        headerView.setBrandIconVisible(A);
        ((shk) x()).e.setTitleText(null);
        ((shk) x()).h.setVisibility(0);
        ((shk) x()).h.setText(R.string.paymentsdk_header_title);
        HeaderView headerView2 = ((shk) x()).e;
        ybf ybfVar = this.h;
        headerView2.v(new sui(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", 0, 3), true);
        if (this.n.d()) {
            ((shk) x()).j.setVisibility(0);
            ((shk) x()).j.setText(R.string.paymentsdk_personal_label);
            ((shk) x()).k.setVisibility(0);
            ((shk) x()).k.setPersonalInfoVisibility(this.n);
            ((shk) x()).g.setVisibility(8);
        } else {
            ((shk) x()).i.setVisibility(8);
            ((shk) x()).j.setVisibility(8);
            ((shk) x()).k.setVisibility(8);
        }
        PersonalInfoView personalInfoView = ((shk) x()).k;
        sbp sbpVar = this.r;
        if (sbpVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        personalInfoView.setValidators(zsd.D(sbpVar.I()));
        sbp sbpVar2 = this.r;
        if (sbpVar2 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        personalInfoView.setPersonalInfo(sbpVar2.h);
        e3j e3jVar = this.s;
        if (e3jVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        pmk pmkVar = this.n;
        e3jVar.l.i = !(pmkVar.a && pmkVar.b.d);
        if (e3jVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        String str = personalInfoView.getEmailView().d;
        String email = !(str == null || StringsKt.U(str)) ? personalInfoView.getEmailView().getEmail() : null;
        e3jVar.m = email;
        j3j j3jVar = e3jVar.l;
        if (!Intrinsics.d(email, j3jVar.h)) {
            j3jVar.h = email;
            mv3 mv3Var = (mv3) j3jVar.d;
            if (mv3Var != null) {
                mv3Var.j(j3jVar.j((jw3) j3jVar.g));
            }
        }
        personalInfoView.setCallback(new ssb(19, this, personalInfoView));
        int i4 = 2;
        ((EmailView) personalInfoView.q.a).setOnFocusChanged(new kif(2, new y2j(this, i2)));
        ues uesVar = hmd.a;
        Context requireContext = requireContext();
        requireContext.getClass();
        jsg jsgVar = new jsg(hmd.a(requireContext), 12);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        nw3 nw3Var = nw3.b;
        sbp sbpVar3 = this.r;
        if (sbpVar3 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        xx3 I = sbpVar3.I();
        g0c z = z();
        t l2 = l();
        ddu dduVar2 = l2 instanceof ddu ? (ddu) l2 : null;
        xw3 c = jsgVar.c(requireContext2, nw3Var, I, z, qdq.B(dduVar2 != null ? Boolean.valueOf(dduVar2.m()) : null));
        sbp sbpVar4 = this.r;
        if (sbpVar4 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        c.setPaymentApi(sbpVar4.b.f());
        osh oshVar = this.i;
        oshVar.V(c);
        ((shk) x()).m.setVisibility(this.m ? 0 : 8);
        CheckBox checkBox = ((shk) x()).m;
        g0c z2 = z();
        zso zsoVar = zso.NEW_CARD_PAY;
        qne o = gut.o(true, zsoVar, true);
        x60 x60Var = (x60) z2;
        x60Var.getClass();
        x60Var.a(o);
        checkBox.setChecked(true);
        ow3 ow3Var = (ow3) oshVar.b;
        if (ow3Var != null) {
            ow3Var.setSaveCardOnPayment(true);
        }
        if (this.m) {
            ((shk) x()).m.setOnCheckedChangeListener(new mj4(i, this));
        }
        ((shk) x()).b.addView(c);
        B(true);
        sbp sbpVar5 = this.r;
        if (sbpVar5 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        ((PaymentButtonView) sbpVar5.e.invoke()).setOnClickListener(new kom(1, new z2j(this, 4)));
        sbp sbpVar6 = this.r;
        if (sbpVar6 == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        sbpVar6.n(true);
        if (this.r == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        if (bundle == null && !this.n.d()) {
            this.q = true;
        }
        ((shk) x()).l.setExitButtonCallback(new sui(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", 0, 6));
        ProgressResultView progressResultView = ((shk) x()).l;
        t l3 = l();
        progressResultView.setBrandIconVisible(!qdq.B((l3 instanceof ddu ? (ddu) l3 : null) != null ? Boolean.valueOf(r3.m()) : null));
        e3j e3jVar2 = this.s;
        if (e3jVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        e3jVar2.l.l.f(getViewLifecycleOwner(), new uy6(3, new y2j(this, i3)));
        e3j e3jVar3 = this.s;
        if (e3jVar3 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        e3jVar3.l.k.f(getViewLifecycleOwner(), new uy6(3, new y2j(this, i4)));
        e3j e3jVar4 = this.s;
        if (e3jVar4 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        e3jVar4.l.m.f(getViewLifecycleOwner(), new uy6(3, new y2j(this, i)));
        g0c z3 = z();
        qne e0 = gut.e0(zsoVar);
        x60 x60Var2 = (x60) z3;
        x60Var2.getClass();
        x60Var2.a(e0);
        super.onViewCreated(view, bundle);
    }

    public final void y(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 1) {
            f96 f96Var = new f96();
            f96Var.f(((shk) x()).d);
            f96Var.e(R.id.save_checkbox, 6);
            f96Var.e(R.id.save_checkbox, 3);
            f96Var.h(R.id.save_checkbox, 6, 0, 6, 0);
            f96Var.h(R.id.save_checkbox, 3, R.id.card_input_container, 4, 0);
            f96Var.b(((shk) x()).d);
            CheckBox checkBox = ((shk) x()).m;
            ViewGroup.LayoutParams layoutParams = checkBox.getLayoutParams();
            if (layoutParams == null) {
                jj4.j("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            t86 t86Var = (t86) layoutParams;
            ((ViewGroup.MarginLayoutParams) t86Var).topMargin = checkBox.getResources().getDimensionPixelSize(R.dimen.paymentsdk_save_checkbox_margin_top);
            checkBox.setLayoutParams(t86Var);
            TextView textView = ((shk) x()).c;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                jj4.j("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            t86 t86Var2 = (t86) layoutParams2;
            ((ViewGroup.MarginLayoutParams) t86Var2).topMargin = textView.getResources().getDimensionPixelSize(R.dimen.paymentsdk_charity_label_margin_top);
            textView.setLayoutParams(t86Var2);
            return;
        }
        if (i == 2) {
            f96 f96Var2 = new f96();
            f96Var2.f(((shk) x()).d);
            f96Var2.e(R.id.save_checkbox, 6);
            f96Var2.e(R.id.save_checkbox, 3);
            f96Var2.h(R.id.save_checkbox, 6, R.id.card_input_container, 7, 0);
            f96Var2.h(R.id.save_checkbox, 3, R.id.paymethod_title, 4, 0);
            f96Var2.b(((shk) x()).d);
            CheckBox checkBox2 = ((shk) x()).m;
            ViewGroup.LayoutParams layoutParams3 = checkBox2.getLayoutParams();
            if (layoutParams3 == null) {
                jj4.j("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            t86 t86Var3 = (t86) layoutParams3;
            ((ViewGroup.MarginLayoutParams) t86Var3).topMargin = checkBox2.getResources().getDimensionPixelSize(R.dimen.paymentsdk_save_checkbox_margin_top);
            checkBox2.setLayoutParams(t86Var3);
            TextView textView2 = ((shk) x()).c;
            ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
            if (layoutParams4 == null) {
                jj4.j("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            t86 t86Var4 = (t86) layoutParams4;
            ((ViewGroup.MarginLayoutParams) t86Var4).topMargin = textView2.getResources().getDimensionPixelSize(R.dimen.paymentsdk_charity_label_margin_top);
            textView2.setLayoutParams(t86Var4);
        }
    }

    public final g0c z() {
        return (g0c) this.k.getValue();
    }
}
