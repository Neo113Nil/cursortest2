package com.yandex.plus.core.debug.panel.internal.presentation.viewHolder;

import android.view.View;
import defpackage.ern;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class b extends opn {
    public static final /* synthetic */ s9f[] w;
    public final Function1 u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;

    static {
        yxm yxmVar = new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0);
        ern.a.getClass();
        w = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, Function1 function1) {
        super(view);
        view.getClass();
        function1.getClass();
        this.u = function1;
        this.v = new com.yandex.plus.bdui.plus.content.controller.f(new a(view, 0));
    }
}
