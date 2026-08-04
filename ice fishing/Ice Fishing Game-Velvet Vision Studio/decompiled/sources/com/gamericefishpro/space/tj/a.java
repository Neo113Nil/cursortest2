package com.gamericefishpro.space.tj;

import com.gamericefishpro.space.c5.f;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.z4.j0;
import com.gamericefishpro.space.z4.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.lj.a {
    public final f c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Function0 function0, f extras) {
        com.gamericefishpro.space.lj.a aVar;
        List list;
        Intrinsics.checkNotNullParameter(extras, "extras");
        super(2, (function0 == null || (aVar = (com.gamericefishpro.space.lj.a) function0.invoke()) == null || (list = aVar.a) == null) ? new ArrayList() : CollectionsKt.M(list));
        this.c = extras;
    }

    @Override // com.gamericefishpro.space.lj.a
    public final Object a(g clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return clazz.equals(b0.a(j0.class)) ? m0.c(this.c) : super.a(clazz);
    }

    @Override // com.gamericefishpro.space.lj.a
    public final Object b(g clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return clazz.equals(b0.a(j0.class)) ? m0.c(this.c) : super.b(clazz);
    }
}
