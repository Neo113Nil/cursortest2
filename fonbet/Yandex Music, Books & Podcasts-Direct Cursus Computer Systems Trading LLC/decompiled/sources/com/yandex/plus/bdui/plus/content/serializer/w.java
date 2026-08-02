package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();
    public final c0 a;

    public /* synthetic */ w(int i, c0 c0Var) {
        if (1 == (i & 1)) {
            this.a = c0Var;
        } else {
            u7g.V(i, 1, u.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthorizeDto(payload=" + this.a + ')';
    }
}
