package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p6 {

    @NotNull
    public static final o6 Companion = new o6();
    public final m6 a;

    public /* synthetic */ p6(int i, m6 m6Var) {
        if (1 == (i & 1)) {
            this.a = m6Var;
        } else {
            u7g.V(i, 1, n6.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6) && Intrinsics.d(this.a, ((p6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PurchaseDto(payload=" + this.a + ')';
    }
}
