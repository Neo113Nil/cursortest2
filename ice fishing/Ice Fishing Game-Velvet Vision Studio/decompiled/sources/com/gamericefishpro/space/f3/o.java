package com.gamericefishpro.space.f3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.gamericefishpro.space.h2.o1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ com.gamericefishpro.space.t0.q i;
    public final /* synthetic */ com.gamericefishpro.space.e1.f v;
    public final /* synthetic */ int w;
    public final /* synthetic */ View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, Function1 function1, com.gamericefishpro.space.t0.q qVar, com.gamericefishpro.space.e1.f fVar, int i, View view) {
        super(0);
        this.d = context;
        this.e = function1;
        this.i = qVar;
        this.v = fVar;
        this.w = i;
        this.y = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyEvent.Callback callback = this.y;
        Intrinsics.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new z(this.d, this.e, this.i, this.v, this.w, (o1) callback).getLayoutNode();
    }
}
