package com.yandex.plus.bdui.plus.scaffold.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();
    public final c a;

    public /* synthetic */ f(int i, c cVar) {
        if (1 == (i & 1)) {
            this.a = cVar;
        } else {
            u7g.V(i, 1, d.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopBottomDto(payload=" + this.a + ')';
    }
}
