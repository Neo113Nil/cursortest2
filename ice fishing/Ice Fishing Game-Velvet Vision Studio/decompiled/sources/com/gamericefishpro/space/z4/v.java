package com.gamericefishpro.space.z4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public p a;
    public s b;

    public final void a(u uVar, o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p pVarA = event.a();
        p state1 = this.a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (pVarA.compareTo(state1) < 0) {
            state1 = pVarA;
        }
        this.a = state1;
        this.b.j(uVar, event);
        this.a = pVarA;
    }
}
