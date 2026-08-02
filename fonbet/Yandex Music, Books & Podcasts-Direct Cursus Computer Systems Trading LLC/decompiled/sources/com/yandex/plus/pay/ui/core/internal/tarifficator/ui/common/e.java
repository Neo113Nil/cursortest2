package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common;

import android.view.View;
import android.widget.TextView;
import defpackage.ern;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;

/* loaded from: classes5.dex */
public final class e extends opn {
    public static final /* synthetic */ s9f[] v;
    public final com.yandex.plus.bdui.plus.content.controller.f u;

    static {
        yxm yxmVar = new yxm(e.class, "content", "getContent()Landroid/widget/TextView;", 0);
        ern.a.getClass();
        v = new s9f[]{yxmVar};
    }

    public e(View view) {
        super(view);
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.b(view, 11));
        this.u = fVar;
        ((TextView) fVar.g(v[0])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
    }
}
