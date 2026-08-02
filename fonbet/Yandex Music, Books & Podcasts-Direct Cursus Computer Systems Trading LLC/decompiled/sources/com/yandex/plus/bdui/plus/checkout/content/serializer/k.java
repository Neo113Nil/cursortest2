package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();
    public final q a;

    public /* synthetic */ k(int i, q qVar) {
        if (1 == (i & 1)) {
            this.a = qVar;
        } else {
            u7g.V(i, 1, i.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppBarDto(payload=" + this.a + ')';
    }
}
