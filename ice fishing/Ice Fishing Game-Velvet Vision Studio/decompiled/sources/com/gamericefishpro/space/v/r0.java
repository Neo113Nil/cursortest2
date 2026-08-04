package com.gamericefishpro.space.v;

import com.gamericefishpro.space.t0.y0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final l0 a;
    public final boolean b;
    public final Map c;

    public r0(l0 l0Var, t tVar, boolean z, Map map) {
        this.a = l0Var;
        this.b = z;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.a(this.a, r0Var.a) && Intrinsics.a(null, null) && this.b == r0Var.b && Intrinsics.a(this.c, r0Var.c);
    }

    public final int hashCode() {
        l0 l0Var = this.a;
        return this.c.hashCode() + y0.c((((l0Var == null ? 0 : l0Var.hashCode()) * 29791) + 0) * 961, 31, this.b);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", veil=null, hold=" + this.b + ", effectsMap=" + this.c + ')';
    }

    public /* synthetic */ r0(l0 l0Var, t tVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : l0Var, (i & 8) != 0 ? null : tVar, (i & 32) == 0, (i & 64) != 0 ? com.gamericefishpro.space.ph.m0.c() : linkedHashMap);
    }
}
