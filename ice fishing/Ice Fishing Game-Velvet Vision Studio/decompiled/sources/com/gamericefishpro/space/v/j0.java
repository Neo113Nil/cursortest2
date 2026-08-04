package com.gamericefishpro.space.v;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 b = new j0(new r0((l0) null, (t) null, (LinkedHashMap) null, 127));
    public final r0 a;

    public j0(r0 r0Var) {
        this.a = r0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j0) && Intrinsics.a(((j0) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        l0 l0Var = this.a.a;
        sb.append(l0Var != null ? l0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
