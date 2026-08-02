package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class h8 {

    @NotNull
    public static final g8 Companion = new g8();
    public final e8 a;

    public /* synthetic */ h8(int i, e8 e8Var) {
        if (1 == (i & 1)) {
            this.a = e8Var;
        } else {
            u7g.V(i, 1, f8.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8) && Intrinsics.d(this.a, ((h8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserAddNewCardDto(payload=" + this.a + ')';
    }
}
