package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w5 {

    @NotNull
    public static final v5 Companion = new v5();
    public final t5 a;

    public /* synthetic */ w5(int i, t5 t5Var) {
        if (1 == (i & 1)) {
            this.a = t5Var;
        } else {
            u7g.V(i, 1, u5.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && Intrinsics.d(this.a, ((w5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PresaleDto(payload=" + this.a + ')';
    }
}
