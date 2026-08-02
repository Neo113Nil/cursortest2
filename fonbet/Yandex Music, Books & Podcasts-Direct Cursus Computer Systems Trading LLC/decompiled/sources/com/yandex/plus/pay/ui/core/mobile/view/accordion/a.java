package com.yandex.plus.pay.ui.core.mobile.view.accordion;

import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.home.feature.webviews.internal.home.i;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b;
import defpackage.asq;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;

/* loaded from: classes5.dex */
public final class a {
    public static final /* synthetic */ s9f[] e = {new yxm(a.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), f1d.c(ern.a, a.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new yxm(a.class, "iconTextView", "getIconTextView()Landroid/widget/TextView;", 0)};
    public final y a;
    public final f b;
    public final f c;
    public final f d;

    public a(PlusPayAccordionView plusPayAccordionView, y yVar) {
        plusPayAccordionView.getClass();
        yVar.getClass();
        this.a = yVar;
        f fVar = new f(new b(plusPayAccordionView, 12));
        this.b = fVar;
        this.c = new f(new b(plusPayAccordionView, 13));
        this.d = new f(new b(plusPayAccordionView, 14));
        asq.N(b(), ((TextView) fVar.g(e[0])).getTextColors());
        a().setVisibility(8);
        b().setRotation(180.0f);
        r1.E(plusPayAccordionView, new i(4, this));
    }

    public final TextView a() {
        return (TextView) this.c.g(e[1]);
    }

    public final TextView b() {
        return (TextView) this.d.g(e[2]);
    }
}
