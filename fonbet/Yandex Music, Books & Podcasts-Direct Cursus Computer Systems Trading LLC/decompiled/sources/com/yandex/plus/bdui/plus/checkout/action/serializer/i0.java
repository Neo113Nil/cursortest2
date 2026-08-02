package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();
    public final f0 a;

    public /* synthetic */ i0(int i, f0 f0Var) {
        if (1 == (i & 1)) {
            this.a = f0Var;
        } else {
            u7g.V(i, 1, g0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.a, ((i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenUrlDto(data=" + this.a + ')';
    }

    public i0(f0 f0Var) {
        this.a = f0Var;
    }
}
