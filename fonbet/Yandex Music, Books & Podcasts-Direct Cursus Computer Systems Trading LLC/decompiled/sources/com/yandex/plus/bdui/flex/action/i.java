package com.yandex.plus.bdui.flex.action;

import defpackage.q5f;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();
    public final q5f a;

    public /* synthetic */ i(int i, q5f q5fVar) {
        if (1 == (i & 1)) {
            this.a = q5fVar;
        } else {
            u7g.V(i, 1, g.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        q5f q5fVar = this.a;
        if (q5fVar == null) {
            return 0;
        }
        return q5fVar.a.hashCode();
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ')';
    }

    public i(q5f q5fVar) {
        this.a = q5fVar;
    }
}
