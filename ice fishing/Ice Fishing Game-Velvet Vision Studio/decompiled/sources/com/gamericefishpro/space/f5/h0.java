package com.gamericefishpro.space.f5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final f0 a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;

    public h0() {
        f0 f0Var = new f0();
        f0Var.c = -1;
        f0Var.g = -1;
        f0Var.h = -1;
        this.a = f0Var;
        this.d = -1;
    }

    public final void a(String route, Function1 popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        if (StringsKt.u(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.e = route;
        this.d = -1;
        this.f = false;
        r0 r0Var = new r0();
        popUpToBuilder.invoke(r0Var);
        this.f = r0Var.a;
        this.g = r0Var.b;
    }
}
