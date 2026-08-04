package com.gamericefishpro.space.z;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final com.gamericefishpro.space.i0.a a;
    public final com.gamericefishpro.space.pi.h b;

    public f(com.gamericefishpro.space.i0.a aVar, com.gamericefishpro.space.pi.h hVar) {
        this.a = aVar;
        this.b = hVar;
    }

    public final String toString() {
        String strG;
        com.gamericefishpro.space.pi.h hVar = this.b;
        com.gamericefishpro.space.pi.w wVar = (com.gamericefishpro.space.pi.w) hVar.w.j(com.gamericefishpro.space.pi.w.i);
        String str = wVar != null ? wVar.e : null;
        StringBuilder sb = new StringBuilder("Request@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        if (str == null || (strG = com.gamericefishpro.space.t0.y0.g("[", str, "](")) == null) {
            strG = "(";
        }
        sb.append(strG);
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(hVar);
        sb.append(')');
        return sb.toString();
    }
}
