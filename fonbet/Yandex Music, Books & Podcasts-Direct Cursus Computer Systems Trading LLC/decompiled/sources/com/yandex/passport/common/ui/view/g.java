package com.yandex.passport.common.ui.view;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import defpackage.rof;
import defpackage.sof;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g extends HorizontalScrollView implements rof {
    public final /* synthetic */ sof a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context, int i, int i2) {
        super(context, null, i, i2);
        context.getClass();
        sof sofVar = new sof(context, f.a);
        this.a = sofVar;
        sofVar.c = this;
    }

    @Override // defpackage.hdu
    @NotNull
    public Context getCtx() {
        Context context = getContext();
        context.getClass();
        return context;
    }

    @Override // defpackage.rof
    public final void j(View view) {
        view.getClass();
        this.a.j(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@NotNull Context context) {
        this(context, 0, 0);
        context.getClass();
    }
}
