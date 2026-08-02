package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class y3 {

    @NotNull
    public static final x3 Companion = new x3();
    public final e4 a;

    public /* synthetic */ y3(int i, e4 e4Var) {
        if (1 == (i & 1)) {
            this.a = e4Var;
        } else {
            u7g.V(i, 1, w3.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3) && Intrinsics.d(this.a, ((y3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ErrorDto(payload=" + this.a + ')';
    }
}
