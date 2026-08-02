package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.ui.core.internal.common.views.PaySdkCompoundDrawableTextView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.OfferSwitchView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import defpackage.e3e;
import defpackage.ern;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.fe0;
import defpackage.fkn;
import defpackage.m8f;
import defpackage.nkf;
import defpackage.s9f;
import defpackage.vvr;
import defpackage.yxm;
import defpackage.zne;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class j {
    public static final /* synthetic */ s9f[] I = {new yxm(j.class, "offerSwitchView", "getOfferSwitchView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/onsale/OfferSwitchView;", 0), f1d.c(ern.a, j.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new yxm(j.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(j.class, "productsRecyclerView", "getProductsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(j.class, "onsaleCardsRecycler", "getOnsaleCardsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(j.class, "paymentMethodsGroupsRecyclerView", "getPaymentMethodsGroupsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(j.class, "paymentTextView", "getPaymentTextView()Landroid/widget/TextView;", 0), new yxm(j.class, "agreementCheckBox", "getAgreementCheckBox()Landroid/widget/CheckBox;", 0), new yxm(j.class, "agreementTextView", "getAgreementTextView()Landroid/widget/TextView;", 0), new yxm(j.class, "legalTextRecyclerView", "getLegalTextRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(j.class, "paymentButtonTopTextView", "getPaymentButtonTopTextView()Landroid/widget/TextView;", 0), new yxm(j.class, "paymentButton", "getPaymentButton()Landroid/widget/Button;", 0), new yxm(j.class, "paymentViaTextView", "getPaymentViaTextView()Lcom/yandex/plus/pay/ui/core/internal/common/views/PaySdkCompoundDrawableTextView;", 0), new yxm(j.class, "paymentCardView", "getPaymentCardView()Landroidx/cardview/widget/CardView;", 0), new yxm(j.class, "agreementCardView", "getAgreementCardView()Landroidx/cardview/widget/CardView;", 0), new yxm(j.class, "legalCardView", "getLegalCardView()Landroidx/cardview/widget/CardView;", 0), new yxm(j.class, "buttonCardView", "getButtonCardView()Landroidx/cardview/widget/CardView;", 0), new yxm(j.class, "agreementLayout", "getAgreementLayout()Landroid/widget/LinearLayout;", 0)};
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final ViewTreeObserver F;
    public final fe0 G;
    public final View H;
    public final CheckoutContentView a;
    public final ezc b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final com.yandex.plus.bdui.plus.content.controller.f e;
    public final com.yandex.plus.bdui.plus.content.controller.f f;
    public final com.yandex.plus.bdui.plus.content.controller.f g;
    public final com.yandex.plus.bdui.plus.content.controller.f h;
    public final com.yandex.plus.bdui.plus.content.controller.f i;
    public final com.yandex.plus.bdui.plus.content.controller.f j;
    public final com.yandex.plus.bdui.plus.content.controller.f k;
    public final com.yandex.plus.bdui.plus.content.controller.f l;
    public final com.yandex.plus.bdui.plus.content.controller.f m;
    public final com.yandex.plus.bdui.plus.content.controller.f n;
    public final com.yandex.plus.bdui.plus.content.controller.f o;
    public final com.yandex.plus.bdui.plus.content.controller.f p;
    public final com.yandex.plus.bdui.plus.content.controller.f q;
    public final com.yandex.plus.bdui.plus.content.controller.f r;
    public final com.yandex.plus.bdui.plus.content.controller.f s;
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.b t;
    public final com.yandex.plus.pay.ui.core.mobile.view.toolbar.i u;
    public final nkf v;
    public final com.yandex.plus.core.debug.panel.internal.presentation.adapter.b w;
    public final n x;
    public final m8f y;
    public final int z;

    /* JADX WARN: Multi-variable type inference failed */
    public j(CheckoutContentView checkoutContentView, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function1 function14, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar) {
        checkoutContentView.getClass();
        bVar.getClass();
        aVar.getClass();
        this.a = checkoutContentView;
        this.b = (ezc) function03;
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 29));
        this.c = fVar;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 0));
        this.d = fVar2;
        this.e = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 1));
        com.yandex.plus.bdui.plus.content.controller.f fVar3 = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 2));
        int i = 3;
        this.f = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, i));
        this.g = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 4));
        this.h = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 5));
        this.i = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 6));
        com.yandex.plus.bdui.plus.content.controller.f fVar4 = new com.yandex.plus.bdui.plus.content.controller.f(new i(checkoutContentView, 7));
        this.j = fVar4;
        this.k = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 20));
        this.l = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 21));
        this.m = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 22));
        this.n = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 23));
        this.o = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 24));
        this.p = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 25));
        this.q = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 26));
        com.yandex.plus.bdui.plus.content.controller.f fVar5 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 27));
        this.r = fVar5;
        com.yandex.plus.bdui.plus.content.controller.f fVar6 = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(checkoutContentView, 28));
        this.s = fVar6;
        s9f[] s9fVarArr = I;
        this.t = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.b((OfferSwitchView) fVar.g(s9fVarArr[0]), function14);
        this.u = new com.yandex.plus.pay.ui.core.mobile.view.toolbar.i((PlusPayToolbarView) fVar2.g(s9fVarArr[1]), aVar, bVar, function02);
        fkn fknVar = ((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a;
        nkf nkfVar = new nkf(fknVar, bVar);
        this.v = nkfVar;
        com.yandex.plus.core.debug.panel.internal.presentation.adapter.b bVar2 = new com.yandex.plus.core.debug.panel.internal.presentation.adapter.b(bVar, fknVar, function2);
        this.w = bVar2;
        n nVar = new n((com.yandex.plus.ui.core.theme.a) fknVar.a.getValue(), bVar, function1, function12);
        this.x = nVar;
        m8f m8fVar = new m8f(k.q, i);
        this.y = m8fVar;
        this.z = ((PlusPayToolbarView) fVar2.g(s9fVarArr[1])).getPaddingTop();
        this.A = checkoutContentView.getPaddingLeft();
        this.B = checkoutContentView.getPaddingRight();
        LinearLayout linearLayout = (LinearLayout) fVar6.g(s9fVarArr[17]);
        this.C = linearLayout != null ? linearLayout.getPaddingBottom() : 0;
        CardView cardView = (CardView) fVar5.g(s9fVarArr[16]);
        this.D = cardView != null ? cardView.getPaddingBottom() : 0;
        ViewGroup.LayoutParams layoutParams = g().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.E = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewTreeObserver viewTreeObserver = checkoutContentView.getViewTreeObserver();
        this.F = viewTreeObserver;
        fe0 fe0Var = new fe0(2, this);
        this.G = fe0Var;
        View view = new View(checkoutContentView.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setClickable(true);
        this.H = view;
        ((TextView) fVar4.g(s9fVarArr[8])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
        ((RecyclerView) fVar3.g(s9fVarArr[3])).setAdapter(nkfVar);
        d().setAdapter(bVar2);
        d().setItemAnimator(null);
        f().setAdapter(nVar);
        f().setItemAnimator(null);
        c().setAdapter(m8fVar);
        c().setItemAnimator(null);
        int i2 = 2;
        ((RecyclerView) fVar3.g(s9fVarArr[3])).s(new e3e(r1.k(R.dimen.pay_sdk_checkout_small_card_top_margin, checkoutContentView), i2));
        d().s(new e3e(r1.k(R.dimen.pay_sdk_checkout_small_card_top_margin, checkoutContentView), i2));
        f().s(new e3e(r1.k(R.dimen.pay_sdk_checkout_card_margin, checkoutContentView), i2));
        c().s(new e3e(r1.k(R.dimen.pay_sdk_checkout_legals_text_margin, checkoutContentView), i2));
        r1.E(e(), new h(0, function0));
        b().setOnCheckedChangeListener(new vvr(1, function13));
        viewTreeObserver.addOnScrollChangedListener(fe0Var);
    }

    public final void a(zne zneVar) {
        zneVar.getClass();
        s9f[] s9fVarArr = I;
        PlusPayToolbarView plusPayToolbarView = (PlusPayToolbarView) this.d.g(s9fVarArr[1]);
        int i = zneVar.b;
        int i2 = zneVar.d;
        plusPayToolbarView.setPadding(plusPayToolbarView.getPaddingLeft(), this.z + i, plusPayToolbarView.getPaddingRight(), plusPayToolbarView.getPaddingBottom());
        int i3 = this.A + zneVar.a;
        int i4 = this.B + zneVar.c;
        CheckoutContentView checkoutContentView = this.a;
        checkoutContentView.setPadding(i3, checkoutContentView.getPaddingTop(), i4, checkoutContentView.getPaddingBottom());
        CardView cardView = (CardView) this.r.g(s9fVarArr[16]);
        if (cardView != null) {
            cardView.f(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), this.D + i2);
        }
        LinearLayout linearLayout = (LinearLayout) this.s.g(s9fVarArr[17]);
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), this.C + i2);
        }
        r1.Q(0, this.E + i2, 7, g());
    }

    public final CheckBox b() {
        return (CheckBox) this.i.g(I[7]);
    }

    public final RecyclerView c() {
        return (RecyclerView) this.k.g(I[9]);
    }

    public final RecyclerView d() {
        return (RecyclerView) this.f.g(I[4]);
    }

    public final Button e() {
        return (Button) this.m.g(I[11]);
    }

    public final RecyclerView f() {
        return (RecyclerView) this.g.g(I[5]);
    }

    public final PaySdkCompoundDrawableTextView g() {
        return (PaySdkCompoundDrawableTextView) this.n.g(I[12]);
    }

    public final void h(g gVar) {
        gVar.getClass();
        s9f[] s9fVarArr = I;
        TextView textView = (TextView) this.e.g(s9fVarArr[2]);
        String str = gVar.a;
        List list = gVar.c;
        List list2 = gVar.j;
        textView.setText(str);
        c cVar = gVar.k;
        com.yandex.plus.bdui.plus.content.controller.f fVar = this.c;
        if (cVar != null) {
            com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.b bVar = this.t;
            bVar.getClass();
            com.yandex.plus.bdui.plus.content.controller.f fVar2 = bVar.c;
            boolean z = cVar.d;
            bVar.g = Boolean.valueOf(z);
            s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.b.h;
            ((TextView) fVar2.g(s9fVarArr2[2])).setText(cVar.a);
            ((TextView) bVar.e.g(s9fVarArr2[4])).setText(cVar.b);
            TextView textView2 = (TextView) bVar.f.g(s9fVarArr2[5]);
            String str2 = cVar.c;
            if (str2 == null || StringsKt.U(str2)) {
                str2 = null;
            }
            r1.F(textView2, str2);
            if (z) {
                bVar.a((Flow) bVar.d.g(s9fVarArr2[3]));
            } else {
                bVar.a((TextView) fVar2.g(s9fVarArr2[2]));
            }
            ((OfferSwitchView) fVar.g(s9fVarArr[0])).setVisibility(0);
        } else {
            ((OfferSwitchView) fVar.g(s9fVarArr[0])).setVisibility(8);
        }
        this.v.v(gVar.b);
        if (list2.isEmpty()) {
            d().setVisibility(8);
        } else {
            d().setVisibility(0);
            this.w.v(list2);
        }
        this.x.v(list);
        f().setVisibility(!list.isEmpty() ? 0 : 8);
        a aVar = gVar.d;
        boolean z2 = aVar != null;
        CardView cardView = (CardView) this.p.g(s9fVarArr[14]);
        if (cardView != null) {
            cardView.setVisibility(z2 ? 0 : 8);
        }
        s9f s9fVar = s9fVarArr[8];
        com.yandex.plus.bdui.plus.content.controller.f fVar3 = this.j;
        ((TextView) fVar3.g(s9fVar)).setVisibility(z2 ? 0 : 8);
        b().setVisibility(z2 ? 0 : 8);
        if (aVar != null) {
            CharSequence charSequence = aVar.a;
            if (!StringsKt.U(charSequence)) {
                ((TextView) fVar3.g(s9fVarArr[8])).setText(charSequence);
                b().setChecked(aVar.b);
            }
        }
        List list3 = gVar.e;
        boolean isEmpty = list3.isEmpty();
        CardView cardView2 = (CardView) this.q.g(s9fVarArr[15]);
        if (cardView2 != null) {
            cardView2.setVisibility(!isEmpty ? 0 : 8);
        }
        c().setVisibility(!isEmpty ? 0 : 8);
        if (!isEmpty) {
            this.y.v(list3);
        }
        String str3 = gVar.f;
        boolean U = StringsKt.U(str3);
        com.yandex.plus.bdui.plus.content.controller.f fVar4 = this.h;
        com.yandex.plus.bdui.plus.content.controller.f fVar5 = this.o;
        if (U) {
            CardView cardView3 = (CardView) fVar5.g(s9fVarArr[13]);
            if (cardView3 != null) {
                cardView3.setVisibility(8);
            }
            ((TextView) fVar4.g(s9fVarArr[6])).setVisibility(8);
        } else {
            CardView cardView4 = (CardView) fVar5.g(s9fVarArr[13]);
            if (cardView4 != null) {
                cardView4.setVisibility(0);
            }
            ((TextView) fVar4.g(s9fVarArr[6])).setVisibility(0);
            ((TextView) fVar4.g(s9fVarArr[6])).setText(str3);
        }
        f fVar6 = gVar.h;
        if (fVar6 != null) {
            g().setVisibility(0);
            g().setText(fVar6.b);
            g().setDrawableEnd(fVar6.a);
        } else {
            g().setVisibility(8);
        }
        r1.F((TextView) this.l.g(s9fVarArr[10]), gVar.g);
        e().setText(gVar.i);
        b().post(new androidx.core.app.a(16, this));
    }
}
