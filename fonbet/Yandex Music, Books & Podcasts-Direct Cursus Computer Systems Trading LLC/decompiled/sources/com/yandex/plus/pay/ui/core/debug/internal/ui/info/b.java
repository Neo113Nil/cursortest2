package com.yandex.plus.pay.ui.core.debug.internal.ui.info;

import android.view.View;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fq2;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;

/* loaded from: classes5.dex */
public final class b extends opn {
    public static final /* synthetic */ s9f[] w = {new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, b.class, "valueTextView", "getValueTextView()Landroid/widget/TextView;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;

    public b(View view) {
        super(view);
        this.u = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(view, 17));
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.c(view, 18));
        this.v = fVar;
        r1.E((TextView) fVar.g(w[1]), new fq2(16, view, this));
    }
}
