package com.yandex.plus.core.debug.panel.internal.presentation.viewHolder;

import android.view.View;
import android.widget.TextView;
import defpackage.ern;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class e extends opn {
    public static final /* synthetic */ s9f[] w;
    public final Function1 u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;

    static {
        yxm yxmVar = new yxm(e.class, "valueTextView", "getValueTextView()Landroid/widget/TextView;", 0);
        ern.a.getClass();
        w = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar) {
        super(view);
        view.getClass();
        aVar.getClass();
        this.u = aVar;
        this.v = new com.yandex.plus.bdui.plus.content.controller.f(new a(view, 3));
    }

    public final TextView t() {
        return (TextView) this.v.g(w[0]);
    }
}
