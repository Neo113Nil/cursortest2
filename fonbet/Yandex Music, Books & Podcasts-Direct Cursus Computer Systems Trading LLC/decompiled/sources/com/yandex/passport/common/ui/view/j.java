package com.yandex.passport.common.ui.view;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import defpackage.rof;
import defpackage.sof;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j extends NestedScrollView implements rof {
    public final /* synthetic */ sof G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, int i, int i2) {
        super(context, null, i2);
        context.getClass();
        sof sofVar = new sof(context, i.a);
        this.G = sofVar;
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
        this.G.j(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, int i) {
        this(context, i, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ j(Context context, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context) {
        this(context, 0, 0, 6, null);
        context.getClass();
    }
}
