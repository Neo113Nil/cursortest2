package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();
    public final c a;

    public /* synthetic */ n(int i, c cVar) {
        if (1 == (i & 1)) {
            this.a = cVar;
        } else {
            u7g.V(i, 1, l.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "DataDto(user=" + this.a + ')';
    }
}
