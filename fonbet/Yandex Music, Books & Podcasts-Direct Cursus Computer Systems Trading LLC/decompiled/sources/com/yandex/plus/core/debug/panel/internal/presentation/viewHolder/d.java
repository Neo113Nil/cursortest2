package com.yandex.plus.core.debug.panel.internal.presentation.viewHolder;

import android.view.View;
import android.widget.CheckBox;
import defpackage.ern;
import defpackage.f1d;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d extends opn {
    public static final /* synthetic */ s9f[] x = {new yxm(d.class, "textView", "getTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, d.class, "checkbox", "getCheckbox()Landroid/widget/CheckBox;", 0)};
    public final Function2 u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public final com.yandex.plus.bdui.plus.content.controller.f w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, Function2 function2) {
        super(view);
        view.getClass();
        function2.getClass();
        this.u = function2;
        this.v = new com.yandex.plus.bdui.plus.content.controller.f(new a(view, 1));
        this.w = new com.yandex.plus.bdui.plus.content.controller.f(new a(view, 2));
    }

    public final CheckBox t() {
        return (CheckBox) this.w.g(x[1]);
    }
}
