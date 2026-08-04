package com.gamericefishpro.space.v;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static final k0 b = new k0(new r0((l0) null, (t) null, (LinkedHashMap) null, 127));
    public static final k0 c = new k0(new r0((l0) null, (t) null, (LinkedHashMap) null, 95));
    public final r0 a;

    public k0(r0 r0Var) {
        this.a = r0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k0) && Intrinsics.a(((k0) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        r0 r0Var = this.a;
        l0 l0Var = r0Var.a;
        sb.append(l0Var != null ? l0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(r0Var.b);
        return sb.toString();
    }
}
