package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();
    public final s0 a;

    public /* synthetic */ j0(int i, s0 s0Var) {
        if (1 == (i & 1)) {
            this.a = s0Var;
        } else {
            u7g.V(i, 1, h0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.a, ((j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivContentDto(payload=" + this.a + ')';
    }
}
