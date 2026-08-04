package com.gamericefishpro.space.ph;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class s0 extends r0 {
    public static LinkedHashSet c(Set set, com.gamericefishpro.space.f5.k kVar) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(l0.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(kVar);
        return linkedHashSet;
    }
}
