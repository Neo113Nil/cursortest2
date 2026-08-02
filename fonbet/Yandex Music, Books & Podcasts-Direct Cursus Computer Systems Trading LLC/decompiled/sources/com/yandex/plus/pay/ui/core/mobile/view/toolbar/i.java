package com.yandex.plus.pay.ui.core.mobile.view.toolbar;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.ui.core.mobile.view.PlusPayAvatarImageView;
import defpackage.b6e;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class i {
    public static final /* synthetic */ s9f[] f = {new yxm(i.class, "avatarImage", "getAvatarImage()Lcom/yandex/plus/pay/ui/core/mobile/view/PlusPayAvatarImageView;", 0), f1d.c(ern.a, i.class, "loginText", "getLoginText()Landroid/widget/TextView;", 0), new yxm(i.class, "closeButton", "getCloseButton()Landroid/widget/ImageButton;", 0)};
    public final com.yandex.plus.core.imageloader.b a;
    public final Function0 b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;
    public final com.yandex.plus.bdui.plus.content.controller.f e;

    public i(PlusPayToolbarView plusPayToolbarView, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.core.imageloader.b bVar, Function0 function0) {
        plusPayToolbarView.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = bVar;
        this.b = function0;
        this.c = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.b(plusPayToolbarView, 4));
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.b(plusPayToolbarView, 5));
        this.e = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.b(plusPayToolbarView, 6));
        Context context = plusPayToolbarView.getContext();
        context.getClass();
        b().setGradientDrawable(((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a(context));
    }

    public final void a(h hVar) {
        hVar.getClass();
        d dVar = hVar.a;
        if (dVar instanceof c) {
            c cVar = (c) dVar;
            b().setPlusStroked(cVar.b);
            b().setVisibility(0);
            ((com.yandex.plus.coil.b) this.a).b(cVar.a).i(b());
        } else {
            if (!(dVar instanceof a) && !(dVar instanceof b)) {
                b6e.s();
                return;
            }
            b().setVisibility(4);
        }
        g gVar = hVar.b;
        boolean z = gVar instanceof e;
        s9f[] s9fVarArr = f;
        com.yandex.plus.bdui.plus.content.controller.f fVar = this.d;
        if (z) {
            ((TextView) fVar.g(s9fVarArr[1])).setVisibility(4);
        } else if (!(gVar instanceof f)) {
            b6e.s();
            return;
        } else {
            ((TextView) fVar.g(s9fVarArr[1])).setText(((f) gVar).a);
            ((TextView) fVar.g(s9fVarArr[1])).setVisibility(0);
        }
        r1.E((ImageButton) this.e.g(s9fVarArr[2]), new com.yandex.plus.home.feature.webviews.internal.home.i(6, this));
    }

    public final PlusPayAvatarImageView b() {
        return (PlusPayAvatarImageView) this.c.g(f[0]);
    }
}
