package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class h5 {

    @NotNull
    public static final g5 Companion = new g5();
    public final e5 a;

    public /* synthetic */ h5(int i, e5 e5Var) {
        if (1 == (i & 1)) {
            this.a = e5Var;
        } else {
            u7g.V(i, 1, f5.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5) && Intrinsics.d(this.a, ((h5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PollingDto(payload=" + this.a + ')';
    }
}
