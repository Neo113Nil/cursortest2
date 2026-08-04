package com.gamericefishpro.space.z5;

import android.os.Bundle;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.u6.s;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a;

    public a(s registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.a = new LinkedHashSet();
        registry.l("androidx.savedstate.Restarter", this);
    }

    @Override // com.gamericefishpro.space.z5.d
    public final Bundle a() {
        m0.c();
        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        f.c(source, "classes_to_restore", CollectionsKt.L(this.a));
        return source;
    }
}
