package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i3 {

    @NotNull
    public static final h3 Companion = new h3();
    public final o3 a;

    public /* synthetic */ i3(int i, o3 o3Var) {
        if (1 == (i & 1)) {
            this.a = o3Var;
        } else {
            u7g.V(i, 1, g3.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3) && Intrinsics.d(this.a, ((i3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CounterOffersDto(payload=" + this.a + ')';
    }
}
