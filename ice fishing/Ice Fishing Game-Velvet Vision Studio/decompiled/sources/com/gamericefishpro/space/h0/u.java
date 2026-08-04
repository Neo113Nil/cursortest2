package com.gamericefishpro.space.h0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.l {
    public w H;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.a(this.H, ((u) obj).H);
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void f(com.gamericefishpro.space.h2.h0 h0Var) {
        ArrayList arrayList = this.H.h;
        if (arrayList.size() <= 0) {
            h0Var.a();
        } else {
            com.gamericefishpro.space.m5.a.s(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.H.hashCode();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        this.H.getClass();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        w wVar = this.H;
        wVar.d();
        wVar.b = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.H + ')';
    }
}
