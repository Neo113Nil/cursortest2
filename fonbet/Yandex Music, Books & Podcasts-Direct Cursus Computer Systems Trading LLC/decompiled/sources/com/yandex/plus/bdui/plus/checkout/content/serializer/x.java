package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();
    public final d0 a;

    public /* synthetic */ x(int i, d0 d0Var) {
        if (1 == (i & 1)) {
            this.a = d0Var;
        } else {
            u7g.V(i, 1, v.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.a, ((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonDto(payload=" + this.a + ')';
    }
}
