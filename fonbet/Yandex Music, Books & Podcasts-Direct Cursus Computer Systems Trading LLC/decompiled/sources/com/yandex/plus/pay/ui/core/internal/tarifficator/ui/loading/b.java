package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jb2;
import defpackage.l8t;
import defpackage.n8t;
import defpackage.s9f;
import defpackage.w3c;
import defpackage.yxm;
import defpackage.zne;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] m = {new yxm(b.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, b.class, "progressView", "getProgressView()Landroid/view/View;", 0), new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "firstPaymentTextView", "getFirstPaymentTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "nextPaymentTextView", "getNextPaymentTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "footerTextView", "getFooterTextView()Landroid/widget/TextView;", 0)};
    public final PlusPayPaymentLoadingView a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public b(PlusPayPaymentLoadingView plusPayPaymentLoadingView) {
        plusPayPaymentLoadingView.getClass();
        this.a = plusPayPaymentLoadingView;
        this.b = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 6));
        this.c = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 7));
        this.d = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 8));
        this.e = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 9));
        this.f = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 10));
        this.g = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 11));
        this.h = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(plusPayPaymentLoadingView, 12));
        this.i = e().getPaddingLeft();
        this.j = e().getPaddingTop();
        this.k = e().getPaddingRight();
        this.l = e().getPaddingBottom();
    }

    public final void a(zne zneVar) {
        zneVar.getClass();
        e().setPadding(this.i + zneVar.a, this.j + zneVar.b, this.k + zneVar.c, this.l + zneVar.d);
    }

    public final TextView b() {
        return (TextView) this.f.g(m[4]);
    }

    public final TextView c() {
        return (TextView) this.h.g(m[6]);
    }

    public final TextView d() {
        return (TextView) this.g.g(m[5]);
    }

    public final ViewGroup e() {
        return (ViewGroup) this.b.g(m[0]);
    }

    public final TextView f() {
        return (TextView) this.e.g(m[3]);
    }

    public final TextView g() {
        return (TextView) this.d.g(m[2]);
    }

    public final void h() {
        PlusPayPaymentLoadingView plusPayPaymentLoadingView = this.a;
        ViewParent parent = plusPayPaymentLoadingView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            w3c w3cVar = new w3c();
            w3cVar.c = 300L;
            w3cVar.e(plusPayPaymentLoadingView);
            jb2 jb2Var = new jb2();
            jb2Var.M(300L);
            jb2Var.e((View) this.c.g(m[1]));
            jb2Var.e(g());
            jb2Var.e(f());
            jb2Var.e(b());
            jb2Var.e(d());
            jb2Var.e(c());
            n8t n8tVar = new n8t();
            n8tVar.W(w3cVar);
            n8tVar.W(jb2Var);
            l8t.a(viewGroup, n8tVar);
        }
    }

    public final void i(boolean z) {
        g().setVisibility(z ? 0 : 8);
        f().setVisibility(z ? 0 : 8);
        b().setVisibility(z ? 0 : 8);
        d().setVisibility(z ? 0 : 8);
        c().setVisibility(z ? 0 : 8);
    }

    public final void j(a aVar) {
        h();
        this.a.setVisibility(0);
        i(true);
        g().setText(aVar.a);
        r1.F(f(), aVar.b);
        r1.F(b(), aVar.c);
        r1.F(d(), aVar.d);
        r1.F(c(), aVar.e);
    }
}
