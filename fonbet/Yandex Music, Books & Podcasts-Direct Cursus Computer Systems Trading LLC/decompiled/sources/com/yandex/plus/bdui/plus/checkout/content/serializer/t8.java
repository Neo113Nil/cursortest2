package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t8 {

    @NotNull
    public static final s8 Companion = new s8();
    public final q8 a;

    public /* synthetic */ t8(int i, q8 q8Var) {
        if (1 == (i & 1)) {
            this.a = q8Var;
        } else {
            u7g.V(i, 1, r8.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8) && Intrinsics.d(this.a, ((t8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserAddNewSbpDto(payload=" + this.a + ')';
    }
}
