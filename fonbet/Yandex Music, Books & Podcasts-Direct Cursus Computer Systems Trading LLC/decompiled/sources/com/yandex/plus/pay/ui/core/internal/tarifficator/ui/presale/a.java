package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.yandex.passport.internal.ui.l;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.h;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.i;
import defpackage.ern;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.jb2;
import defpackage.kw9;
import defpackage.l8t;
import defpackage.s9f;
import defpackage.vqn;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a {
    public static final /* synthetic */ s9f[] m = {new yxm(a.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, a.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new yxm(a.class, "loadingLayout", "getLoadingLayout()Landroid/view/ViewGroup;", 0), new yxm(a.class, "loadingTextView", "getLoadingTextView()Landroid/widget/TextView;", 0), new yxm(a.class, "offerView", "getOfferView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/presale/PresaleOfferView;", 0), new yxm(a.class, "originalOfferButton", "getOriginalOfferButton()Landroid/widget/Button;", 0), new yxm(a.class, "legalTextView", "getLegalTextView()Landroid/widget/TextView;", 0), new yxm(a.class, "nestedScrollView", "getNestedScrollView()Landroidx/core/widget/NestedScrollView;", 0)};
    public final PresaleContentView a;
    public final ezc b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public l j;
    public final i k;
    public final c l;

    /* JADX WARN: Multi-variable type inference failed */
    public a(PresaleContentView presaleContentView, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        presaleContentView.getClass();
        bVar.getClass();
        aVar.getClass();
        this.a = presaleContentView;
        this.b = (ezc) function04;
        this.c = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 13));
        this.d = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 14));
        this.e = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 15));
        this.f = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 16));
        this.g = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 17));
        this.h = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 18));
        this.i = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleContentView, 19));
        this.k = new i(f(), aVar, bVar, function0);
        s9f s9fVar = m[4];
        s9fVar.getClass();
        try {
            View findViewById = presaleContentView.findViewById(R.id.presale_offer_view);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleOfferView");
            }
            this.l = new c((PresaleOfferView) findViewById, aVar, function02);
            a().setMovementMethod(new com.yandex.plus.home.common.ui.a());
            r1.E(e(), new h(3, function03));
        } catch (ClassCastException e) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
            throw null;
        }
    }

    public final TextView a() {
        return (TextView) this.h.g(m[6]);
    }

    public final ViewGroup b() {
        return (ViewGroup) this.e.g(m[2]);
    }

    public final TextView c() {
        return (TextView) this.f.g(m[3]);
    }

    public final NestedScrollView d() {
        return (NestedScrollView) this.i.g(m[7]);
    }

    public final Button e() {
        return (Button) this.g.g(m[5]);
    }

    public final PlusPayToolbarView f() {
        return (PlusPayToolbarView) this.d.g(m[1]);
    }

    public final void g() {
        jb2 jb2Var = new jb2();
        jb2Var.b(new kw9(2, this, new vqn()));
        l8t.a(this.a, jb2Var);
    }

    public final void h(CharSequence charSequence, b bVar, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        bVar.getClass();
        charSequence2.getClass();
        g();
        b().setVisibility(0);
        b().setAlpha(0.5f);
        c().setVisibility(0);
        c().setText(charSequence);
        e().setVisibility(0);
        e().setText(charSequence2);
        c cVar = this.l;
        cVar.getClass();
        cVar.a.setVisibility(0);
        f fVar = cVar.c;
        s9f[] s9fVarArr = c.i;
        ((TextView) fVar.g(s9fVarArr[1])).setText(bVar.b);
        r1.F((TextView) cVar.d.g(s9fVarArr[2]), bVar.a);
        ((TextView) cVar.e.g(s9fVarArr[3])).setText(bVar.c);
        ((TextView) cVar.f.g(s9fVarArr[4])).setText(bVar.d);
        ((Button) cVar.g.g(s9fVarArr[5])).setText(bVar.e);
        r1.F((TextView) cVar.h.g(s9fVarArr[6]), bVar.f);
        ((TextView) fVar.g(s9fVarArr[1])).sendAccessibilityEvent(8);
        r1.F(a(), charSequence3);
        f().setVisibility(0);
    }

    public final void i(CharSequence charSequence) {
        charSequence.getClass();
        g();
        b().setVisibility(0);
        b().setAlpha(1.0f);
        c().setVisibility(0);
        c().setText(charSequence);
        e().setVisibility(8);
        this.l.a.setVisibility(8);
        a().setVisibility(8);
        f().setVisibility(0);
    }
}
