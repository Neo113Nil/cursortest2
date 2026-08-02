package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lwom;", "Ledu;", "Lshk;", "La13;", "<init>", "()V", "lom", "n7b", "tom", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class wom extends edu<shk> implements a13 {
    public lpm i;
    public boolean k;
    public boolean l;
    public lom n;
    public sbp o;
    public final ybf h = new ybf(ern.a(u8q.class), new uom(this, 2), new uom(this, 4), new uom(this, 3));
    public final n7b j = new n7b();
    public final jyr m = btf.b(new uom(this, 0));

    public final void A(fvm fvmVar) {
        lom lomVar = this.n;
        if (lomVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        lomVar.d();
        ((shk) x()).l.setVisibility(0);
        ((shk) x()).l.setState(fvmVar);
        ((shk) x()).e.setVisibility(8);
        ((shk) x()).n.setVisibility(8);
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
        this.k = requireArguments().getBoolean("ARG_IS_BACK_BUTTON_ENABLED");
        this.l = requireArguments().getBoolean("START_PAYMENT_AFTER_SELECT");
        sdk f = ((p77) ((rsd) qld.y(this)).a().b(p77.class)).f();
        hek g = ((p77) ((rsd) qld.y(this)).a().b(p77.class)).g();
        boolean z = this.l;
        Handler handler = new Handler(Looper.getMainLooper());
        lom lomVar = this.n;
        if (lomVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        tom tomVar = new tom(f, g, this.j, z, handler, new bml(1, lomVar, lom.class, "onSelectSuccess", "onSelectSuccess(Lcom/yandex/payment/sdk/core/data/SelectedMethod;)V", 0, 13), ((p77) ((rsd) qld.y(this)).a().b(p77.class)).a().e);
        jfu viewModelStore = getViewModelStore();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, tomVar, defaultViewModelCreationExtras);
        lm4 a = ern.a(lpm.class);
        String f2 = a.f();
        if (f2 != null) {
            this.i = (lpm) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2));
        } else {
            xq0.x("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.g = shk.a(layoutInflater, viewGroup);
        ues uesVar = hmd.a;
        Context requireContext = requireContext();
        requireContext.getClass();
        jsg jsgVar = new jsg(hmd.a(requireContext), 12);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        nw3 nw3Var = this.l ? nw3.b : nw3.a;
        xx3 xx3Var = ((p77) ((rsd) qld.y(this)).a().b(p77.class)).a().a;
        g0c g0cVar = (g0c) this.m.getValue();
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        xw3 c = jsgVar.c(requireContext2, nw3Var, xx3Var, g0cVar, qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null));
        c.setOnStateChangeListener(new vom(this, 3));
        c.setMaskedCardNumberListener(new vom(this, 4));
        c.setCardPaymentSystemListener(new vom(this, 5));
        c.setPaymentApi(((p77) ((rsd) qld.y(this)).a().b(p77.class)).f());
        this.j.a = c;
        ((shk) x()).b.addView(c);
        LinearLayout linearLayout = ((shk) x()).a;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // defpackage.edu, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        this.j.a = null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A;
        view.getClass();
        int i = 0;
        int i2 = 1;
        if (!this.k || getParentFragmentManager().H() <= 1) {
            HeaderView.u(((shk) x()).e);
            ((shk) x()).g.setVisibility(8);
        } else {
            ((shk) x()).g.setVisibility(0);
            ((shk) x()).g.setOnClickListener(new xal(5, this));
        }
        Configuration configuration = getResources().getConfiguration();
        configuration.getClass();
        y(configuration);
        ((shk) x()).e.setTitleText(null);
        HeaderView headerView = ((shk) x()).e;
        t l = l();
        ddu dduVar = l instanceof ddu ? (ddu) l : null;
        if (qdq.B(dduVar != null ? Boolean.valueOf(dduVar.m()) : null)) {
            A = false;
        } else {
            Resources.Theme theme = view.getContext().getTheme();
            theme.getClass();
            A = ocg.A(theme, R.attr.paymentsdk_selectShowBrandIcon, true);
        }
        headerView.setBrandIconVisible(A);
        ((shk) x()).i.setVisibility(8);
        ((shk) x()).j.setVisibility(8);
        ((shk) x()).k.setVisibility(8);
        ((shk) x()).h.setVisibility(0);
        ((shk) x()).h.setText(R.string.paymentsdk_bind_card_title);
        ((shk) x()).m.setVisibility(this.l ? 0 : 8);
        int i3 = 4;
        if (this.l) {
            ((shk) x()).m.setChecked(true);
            xw3 xw3Var = (xw3) this.j.a;
            if (xw3Var != null) {
                xw3Var.setSaveCardOnPayment(true);
            }
            ((shk) x()).m.setOnCheckedChangeListener(new mj4(i3, this));
        }
        lom lomVar = this.n;
        if (lomVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        ((ohk) lomVar.a.D()).e.setOnClickListener(new kom(0, new uom(this, i2)));
        HeaderView headerView2 = ((shk) x()).e;
        ybf ybfVar = this.h;
        int i4 = 0;
        headerView2.v(new ebm(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", i4, 17), true);
        ((shk) x()).l.setExitButtonCallback(new ebm(0, (u8q) ybfVar.getValue(), u8q.class, "showConfirmDialog", "showConfirmDialog()V", i4, 18));
        ProgressResultView progressResultView = ((shk) x()).l;
        t l2 = l();
        progressResultView.setBrandIconVisible(!qdq.B((l2 instanceof ddu ? (ddu) l2 : null) != null ? Boolean.valueOf(r5.m()) : null));
        lpm lpmVar = this.i;
        if (lpmVar == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        hek.f(lpmVar.l, new lw3(i3, lpmVar));
        lpmVar.r.l(dpm.a);
        lpmVar.s.l(new xom(R.string.paymentsdk_bind_card_next_button, null, null));
        lpm lpmVar2 = this.i;
        if (lpmVar2 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        lpmVar2.r.f(getViewLifecycleOwner(), new uy6(6, new vom(this, i)));
        lpm lpmVar3 = this.i;
        if (lpmVar3 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        lpmVar3.s.f(getViewLifecycleOwner(), new uy6(6, new vom(this, i2)));
        lpm lpmVar4 = this.i;
        if (lpmVar4 == null) {
            Intrinsics.j("viewModel");
            throw null;
        }
        lpmVar4.t.f(getViewLifecycleOwner(), new uy6(6, new vom(this, 2)));
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

    public final String z(Double d, Context context) {
        if (d != null) {
            return irf.I(context, d.doubleValue(), "RUB", (g0c) this.m.getValue());
        }
        return null;
    }
}
