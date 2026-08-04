package com.gamericefishpro.space.f5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends x {
    @Override // com.gamericefishpro.space.f5.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // com.gamericefishpro.space.f5.x
    public final int hashCode() {
        return super.hashCode() * 961;
    }

    @Override // com.gamericefishpro.space.f5.x
    public final String toString() {
        String str = super.toString();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }
}
