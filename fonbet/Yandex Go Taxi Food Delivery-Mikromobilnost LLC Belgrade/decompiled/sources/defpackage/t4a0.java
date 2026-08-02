package defpackage;

import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import defpackage.tje;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class t4a0 implements q4a0 {
    public final /* synthetic */ PaymentMethodDetailsModalView a;

    public t4a0(PaymentMethodDetailsModalView paymentMethodDetailsModalView) {
        this.a = paymentMethodDetailsModalView;
    }

    @Override // defpackage.q4a0
    public final void C6(fl8 fl8Var, xw91 xw91Var) {
        l4a0 binding;
        l4a0 binding2;
        l4a0 binding3;
        l4a0 binding4;
        l4a0 binding5;
        l4a0 binding6;
        l4a0 binding7;
        l4a0 binding8;
        l4a0 binding9;
        boolean z = fl8Var.c;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        if (z || !jl40.l(xw91Var, xw91.C)) {
            if (!fl8Var.h) {
                binding = paymentMethodDetailsModalView.getBinding();
                binding.c.setText("");
                return;
            }
            binding2 = paymentMethodDetailsModalView.getBinding();
            binding2.e.setVisibility(0);
            binding3 = paymentMethodDetailsModalView.getBinding();
            binding3.c.setText(paymentMethodDetailsModalView.getResources().getString(kyh0.card_expired));
            binding4 = paymentMethodDetailsModalView.getBinding();
            binding4.d.setTextColorAttr(xng0.error);
            return;
        }
        binding5 = paymentMethodDetailsModalView.getBinding();
        binding5.c.setText(paymentMethodDetailsModalView.getResources().getString(kyh0.payment_antifraud_verify));
        binding6 = paymentMethodDetailsModalView.getBinding();
        binding6.h.setVisibility(0);
        binding7 = paymentMethodDetailsModalView.getBinding();
        binding7.h.setSubtitle(kyh0.payment_method_details_card_verification_subtitle);
        binding8 = paymentMethodDetailsModalView.getBinding();
        binding8.h.setDebounceClickListener(new s4a0(paymentMethodDetailsModalView, fl8Var, 1));
        binding9 = paymentMethodDetailsModalView.getBinding();
        binding9.l.setVisibility(0);
    }

    @Override // defpackage.q4a0
    public final void Cf(k9a0 k9a0Var) {
        l4a0 binding;
        l4a0 binding2;
        final PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        binding = paymentMethodDetailsModalView.getBinding();
        GoLinearLayout goLinearLayout = binding.b;
        goLinearLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.r(utg0.payment_methods_banner_corner_radius, paymentMethodDetailsModalView.getContext())));
        goLinearLayout.setClipToOutline(true);
        binding2 = paymentMethodDetailsModalView.getBinding();
        ListItemComponent listItemComponent = binding2.k;
        listItemComponent.setVisibility(0);
        listItemComponent.setTitle(k9a0Var.b);
        listItemComponent.setSubtitle(k9a0Var.c);
        kdc kdcVar = k9a0Var.g;
        listItemComponent.setTitleTextColor(kdcVar);
        listItemComponent.setSubtitleTextColor(kdcVar);
        listItemComponent.setBackgroundColor(k9a0Var.h);
        listItemComponent.setTrailContainerClickListener(new Runnable() { // from class: com.yandex.go.payments.paymentlist.details.b
            @Override // java.lang.Runnable
            public final void run() {
                c cVar;
                cVar = PaymentMethodDetailsModalView.this.paymentMethodDetailsPresenter;
                tje.N(cVar.Jg(), null, null, new PaymentMethodDetailsPresenter$forceHideBanner$1(cVar, null), 3);
            }
        });
    }

    @Override // defpackage.q4a0
    public final void Ge() {
        l4a0 binding;
        binding = this.a.getBinding();
        binding.k.setVisibility(8);
    }

    @Override // defpackage.q4a0
    public final void Yd(String str, kdc kdcVar, boolean z) {
        pav pavVar;
        l4a0 binding;
        l4a0 binding2;
        pav pavVar2;
        l4a0 binding3;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        pavVar = paymentMethodDetailsModalView.imageLoader;
        binding = paymentMethodDetailsModalView.getBinding();
        pavVar.c(binding.k.getLeadImageView());
        Integer valueOf = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, paymentMethodDetailsModalView.getContext())) : null;
        if (str == null || evu0.J(str)) {
            paymentMethodDetailsModalView.setDefaultLeadIcon(valueOf);
        } else {
            pavVar2 = paymentMethodDetailsModalView.imageLoader;
            binding3 = paymentMethodDetailsModalView.getBinding();
            nac nacVar = (nac) pavVar2.a(binding3.k.getLeadImageView());
            nacVar.h = new u290(15, paymentMethodDetailsModalView);
            nacVar.i = new xw90(5, paymentMethodDetailsModalView, valueOf);
            nacVar.c(str);
        }
        binding2 = paymentMethodDetailsModalView.getBinding();
        ListItemComponent listItemComponent = binding2.k;
        listItemComponent.setTrailImage(tje.y(y2h0.ic_payment_close_notification, listItemComponent.getContext()));
        if (valueOf != null) {
            listItemComponent.setTrailTint(valueOf.intValue());
        }
        listItemComponent.setTrailContentDescription(listItemComponent.getContext().getString(kyh0.payment_methods_hide));
        listItemComponent.setTrailVisibility(z ? 0 : 8);
    }

    @Override // defpackage.q4a0
    public final void Zf(bjm0 bjm0Var, xw91 xw91Var) {
        l4a0 binding;
        l4a0 binding2;
        l4a0 binding3;
        l4a0 binding4;
        l4a0 binding5;
        l4a0 binding6;
        l4a0 binding7;
        l4a0 binding8;
        boolean z = bjm0Var.c;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        if (z || !jl40.l(xw91Var, xw91.C)) {
            binding = paymentMethodDetailsModalView.getBinding();
            binding.o.setSubtitle("");
            binding2 = paymentMethodDetailsModalView.getBinding();
            binding2.o.setSubtitleColorAttr(xng0.textMain);
            return;
        }
        binding3 = paymentMethodDetailsModalView.getBinding();
        binding3.o.setSubtitle(kyh0.payment_antifraud_verify);
        binding4 = paymentMethodDetailsModalView.getBinding();
        binding4.o.setSubtitleColorAttr(xng0.error);
        binding5 = paymentMethodDetailsModalView.getBinding();
        binding5.h.setVisibility(0);
        binding6 = paymentMethodDetailsModalView.getBinding();
        binding6.h.setSubtitle(kyh0.payment_method_details_sbp_token_verification_subtitle);
        binding7 = paymentMethodDetailsModalView.getBinding();
        binding7.h.setDebounceClickListener(new r4a0(paymentMethodDetailsModalView, bjm0Var, 1));
        binding8 = paymentMethodDetailsModalView.getBinding();
        binding8.l.setVisibility(0);
    }

    @Override // defpackage.q4a0
    public final void f9(fl8 fl8Var) {
        l4a0 binding;
        l4a0 binding2;
        l4a0 binding3;
        l4a0 binding4;
        l4a0 binding5;
        l4a0 binding6;
        l4a0 binding7;
        l4a0 binding8;
        l4a0 binding9;
        String maskedCardTitle;
        l4a0 binding10;
        l4a0 binding11;
        String cardDescription;
        g1a0 g1a0Var;
        l4a0 binding12;
        l4a0 binding13;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        binding = paymentMethodDetailsModalView.getBinding();
        binding.o.setVisibility(8);
        binding2 = paymentMethodDetailsModalView.getBinding();
        binding2.f.setVisibility(0);
        binding3 = paymentMethodDetailsModalView.getBinding();
        binding3.e.setVisibility(8);
        binding4 = paymentMethodDetailsModalView.getBinding();
        binding4.i.setVisibility(0);
        binding5 = paymentMethodDetailsModalView.getBinding();
        binding5.h.setVisibility(8);
        binding6 = paymentMethodDetailsModalView.getBinding();
        binding6.j.setVisibility(8);
        binding7 = paymentMethodDetailsModalView.getBinding();
        binding7.l.setVisibility(8);
        binding8 = paymentMethodDetailsModalView.getBinding();
        binding8.i.setDebounceClickListener(new s4a0(paymentMethodDetailsModalView, fl8Var, 0));
        binding9 = paymentMethodDetailsModalView.getBinding();
        qje.t(xng0.textMain, binding9.d.getContext());
        maskedCardTitle = paymentMethodDetailsModalView.getMaskedCardTitle(fl8Var.d);
        binding10 = paymentMethodDetailsModalView.getBinding();
        binding10.g.setText(maskedCardTitle);
        binding11 = paymentMethodDetailsModalView.getBinding();
        RobotoTextView robotoTextView = binding11.d;
        cardDescription = paymentMethodDetailsModalView.cardDescription(fl8Var);
        robotoTextView.setText(cardDescription);
        g1a0Var = paymentMethodDetailsModalView.paymentImageLoader;
        binding12 = paymentMethodDetailsModalView.getBinding();
        g1a0Var.c(binding12.n, fl8Var);
        k0a0 d = oe91.d(fl8Var.e);
        binding13 = paymentMethodDetailsModalView.getBinding();
        binding13.m.setImageDrawable(d.a(paymentMethodDetailsModalView.getContext()));
    }

    @Override // defpackage.q4a0
    public final void hf() {
        l4a0 binding;
        l4a0 binding2;
        l4a0 binding3;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        binding = paymentMethodDetailsModalView.getBinding();
        binding.i.setVisibility(8);
        binding2 = paymentMethodDetailsModalView.getBinding();
        binding2.j.setVisibility(0);
        binding3 = paymentMethodDetailsModalView.getBinding();
        binding3.l.setVisibility(8);
    }

    @Override // defpackage.q4a0
    public final void j7(bjm0 bjm0Var) {
        l4a0 binding;
        l4a0 binding2;
        l4a0 binding3;
        l4a0 binding4;
        l4a0 binding5;
        l4a0 binding6;
        l4a0 binding7;
        l4a0 binding8;
        g1a0 g1a0Var;
        l4a0 binding9;
        PaymentMethodDetailsModalView paymentMethodDetailsModalView = this.a;
        binding = paymentMethodDetailsModalView.getBinding();
        binding.o.setVisibility(0);
        binding2 = paymentMethodDetailsModalView.getBinding();
        binding2.f.setVisibility(8);
        binding3 = paymentMethodDetailsModalView.getBinding();
        binding3.i.setVisibility(0);
        binding4 = paymentMethodDetailsModalView.getBinding();
        binding4.h.setVisibility(8);
        binding5 = paymentMethodDetailsModalView.getBinding();
        binding5.j.setVisibility(8);
        binding6 = paymentMethodDetailsModalView.getBinding();
        binding6.l.setVisibility(8);
        binding7 = paymentMethodDetailsModalView.getBinding();
        binding7.i.setDebounceClickListener(new r4a0(paymentMethodDetailsModalView, bjm0Var, 0));
        binding8 = paymentMethodDetailsModalView.getBinding();
        binding8.o.setTitle(bjm0Var.f);
        g1a0Var = paymentMethodDetailsModalView.paymentImageLoader;
        binding9 = paymentMethodDetailsModalView.getBinding();
        g1a0Var.c(binding9.o.getTrailImageView(), bjm0Var);
    }
}
