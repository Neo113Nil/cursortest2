package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.internal.d;
import com.yandex.plus.pay.ui.common.internal.error.content.k;
import com.yandex.plus.pay.ui.core.mobile.view.accordion.PlusPayAccordionView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.h;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.i;
import defpackage.btf;
import defpackage.c7;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fq2;
import defpackage.jyr;
import defpackage.s9f;
import defpackage.u75;
import defpackage.yxm;
import defpackage.zc4;
import defpackage.zne;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] r = {new yxm(b.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, b.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new yxm(b.class, "image", "getImage()Landroid/widget/ImageView;", 0), new yxm(b.class, "scroller", "getScroller()Landroidx/core/widget/NestedScrollView;", 0), new yxm(b.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(b.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new yxm(b.class, "accordion", "getAccordion()Lcom/yandex/plus/pay/ui/core/mobile/view/accordion/PlusPayAccordionView;", 0), new yxm(b.class, "errorButtons", "getErrorButtons()Lcom/yandex/plus/pay/ui/core/mobile/view/error/buttons/PlusPayErrorButtonsView;", 0), new yxm(b.class, "supportTextView", "getSupportTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "errorCode", "getErrorCode()Landroid/widget/TextView;", 0)};
    public final f a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final jyr j;
    public final i k;
    public final jyr l;
    public final jyr m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    public b(ErrorContentView errorContentView, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.core.imageloader.b bVar, y yVar, Function0 function0, Function0 function02, Function0 function03) {
        errorContentView.getClass();
        aVar.getClass();
        bVar.getClass();
        yVar.getClass();
        this.a = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(errorContentView, 28));
        f fVar = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(errorContentView, 29));
        this.b = fVar;
        this.c = new f(new a(errorContentView, 0));
        this.d = new f(new a(errorContentView, 1));
        this.e = new f(new a(errorContentView, 2));
        this.f = new f(new a(errorContentView, 3));
        this.g = new f(new a(errorContentView, 4));
        f fVar2 = new f(new a(errorContentView, 5));
        this.h = fVar2;
        this.i = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(errorContentView, 27));
        this.j = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(20, errorContentView));
        s9f[] s9fVarArr = r;
        this.k = new i((PlusPayToolbarView) fVar.g(s9fVarArr[1]), aVar, bVar, function0);
        this.l = btf.b(new d(5, this, yVar));
        this.m = btf.b(new p(this, function02, function03));
        this.n = d().getPaddingLeft();
        this.o = d().getPaddingTop();
        this.p = d().getPaddingRight();
        this.q = d().getPaddingBottom();
        s9f s9fVar = s9fVarArr[2];
        s9fVar.getClass();
        try {
            View findViewById = errorContentView.findViewById(R.id.error_image);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) findViewById).setImageResource(2131232311);
            r1.E(c(), new fq2(18, this, errorContentView));
            ((TextView) fVar2.g(s9fVarArr[8])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
        } catch (ClassCastException e) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
            throw null;
        }
    }

    public final void a(zne zneVar) {
        zneVar.getClass();
        d().setPadding(this.n + zneVar.a, this.o + zneVar.b, this.p + zneVar.c, this.q + zneVar.d);
    }

    public final void b(h hVar) {
        s9f[] s9fVarArr = r;
        f fVar = this.b;
        if (hVar == null) {
            ((PlusPayToolbarView) fVar.g(s9fVarArr[1])).setVisibility(8);
        } else {
            ((PlusPayToolbarView) fVar.g(s9fVarArr[1])).setVisibility(0);
            this.k.a(hVar);
        }
    }

    public final TextView c() {
        return (TextView) this.i.g(r[9]);
    }

    public final ViewGroup d() {
        return (ViewGroup) this.a.g(r[0]);
    }

    public final NestedScrollView e() {
        return (NestedScrollView) this.c.g(r[3]);
    }

    public final TextView f() {
        return (TextView) this.e.g(r[5]);
    }

    public final TextView g() {
        return (TextView) this.d.g(r[4]);
    }

    public final void h(com.yandex.plus.pay.ui.common.internal.error.content.h hVar) {
        hVar.getClass();
        TextView g = g();
        String str = hVar.a;
        r1.F(g, str);
        TextView f = f();
        String str2 = hVar.b;
        r1.F(f, str2);
        NestedScrollView e = e();
        if (!e.isLaidOut() || e.isLayoutRequested()) {
            e.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.b(4, hVar, this));
        } else if (str != null && !StringsKt.U(str)) {
            e().scrollTo(d().getScrollX(), g().getTop());
        } else if (str2 != null && !StringsKt.U(str2)) {
            e().scrollTo(d().getScrollX(), f().getTop());
        }
        k kVar = hVar.e;
        int i = 6;
        s9f[] s9fVarArr = r;
        f fVar = this.f;
        if (kVar != null) {
            ((PlusPayAccordionView) fVar.g(s9fVarArr[6])).setVisibility(0);
            jyr jyrVar = this.l;
            com.yandex.plus.pay.ui.core.mobile.view.accordion.a aVar = (com.yandex.plus.pay.ui.core.mobile.view.accordion.a) jyrVar.getValue();
            String str3 = kVar.a;
            aVar.getClass();
            str3.getClass();
            ((TextView) aVar.b.g(com.yandex.plus.pay.ui.core.mobile.view.accordion.a.e[0])).setText(str3);
            com.yandex.plus.pay.ui.core.mobile.view.accordion.a aVar2 = (com.yandex.plus.pay.ui.core.mobile.view.accordion.a) jyrVar.getValue();
            String str4 = kVar.b;
            aVar2.getClass();
            str4.getClass();
            TextView a = aVar2.a();
            Spanned fromHtml = Html.fromHtml(str4, 63);
            fromHtml.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            c7 H = zc4.H(fromHtml.getSpans(0, fromHtml.length(), URLSpan.class));
            while (H.hasNext()) {
                Object next = H.next();
                next.getClass();
                com.yandex.plus.home.common.utils.i iVar = new com.yandex.plus.home.common.utils.i(new d(i, aVar2, (URLSpan) next), false);
                Context context = aVar2.a().getContext();
                context.getClass();
                Iterator it = u75.h(iVar, new ForegroundColorSpan(com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_highlightTextColor))).iterator();
                while (it.hasNext()) {
                    spannableStringBuilder.setSpan(it.next(), fromHtml.getSpanStart(next), fromHtml.getSpanEnd(next), 0);
                }
                spannableStringBuilder.removeSpan(next);
            }
            a.setText(spannableStringBuilder);
        } else {
            ((PlusPayAccordionView) fVar.g(s9fVarArr[6])).setVisibility(8);
        }
        com.yandex.plus.pay.ui.core.mobile.view.error.buttons.b bVar = (com.yandex.plus.pay.ui.core.mobile.view.error.buttons.b) this.m.getValue();
        com.yandex.plus.pay.ui.common.internal.error.content.f fVar2 = hVar.f;
        String str5 = fVar2 != null ? fVar2.a : null;
        com.yandex.plus.pay.ui.common.internal.error.content.f fVar3 = hVar.g;
        String str6 = fVar3 != null ? fVar3.a : null;
        f fVar4 = bVar.c;
        s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.core.mobile.view.error.buttons.b.e;
        r1.F((Button) fVar4.g(s9fVarArr2[0]), str5);
        r1.F((Button) bVar.d.g(s9fVarArr2[1]), str6);
        r1.F(c(), hVar.c);
        c().setContentDescription(hVar.d);
    }
}
