package com.gamericefishpro.space.r6;

import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.u6.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    static {
        Intrinsics.checkNotNullExpressionValue(q.d("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // com.gamericefishpro.space.r6.b
    public final boolean a(p workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.a == r.v;
    }

    @Override // com.gamericefishpro.space.r6.b
    public final boolean b(Object obj) {
        com.gamericefishpro.space.q6.a value = (com.gamericefishpro.space.q6.a) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a && value.d) ? false : true;
    }
}
