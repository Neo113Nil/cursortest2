package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();
    public final l0 a;

    public /* synthetic */ o0(int i, l0 l0Var) {
        if (1 == (i & 1)) {
            this.a = l0Var;
        } else {
            u7g.V(i, 1, m0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.a, ((o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareDto(data=" + this.a + ')';
    }

    public o0(l0 l0Var) {
        this.a = l0Var;
    }
}
