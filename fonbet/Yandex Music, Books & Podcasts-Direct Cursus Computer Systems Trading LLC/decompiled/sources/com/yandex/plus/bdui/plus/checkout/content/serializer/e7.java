package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class e7 {

    @NotNull
    public static final d7 Companion = new d7();
    public final b7 a;

    public /* synthetic */ e7(int i, b7 b7Var) {
        if (1 == (i & 1)) {
            this.a = b7Var;
        } else {
            u7g.V(i, 1, c7.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7) && Intrinsics.d(this.a, ((e7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessDto(payload=" + this.a + ')';
    }
}
